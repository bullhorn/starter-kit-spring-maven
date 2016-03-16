package com.client.core.scheduledtasks.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.scheduledtasks.model.log.BullhornError;
import com.client.core.scheduledtasks.model.log.BullhornLog;
import com.client.core.scheduledtasks.model.log.Request;
import com.client.core.base.util.Util;

public class BullhornLogDAOImpl implements BullhornLogDAO {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Object insertRequest(final Request request) {

        final String query = "INSERT INTO requests (requestID, corporationID, subscriptionID) VALUES (?,?,?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(query,
                        new String[] { "requestID, corporationID, subscriptionID" });
                ps.setString(1, String.valueOf(request.getRequestID()));
                ps.setInt(2, request.getCorporationID());
                ps.setString(3, request.getSubscriptionID());
                return ps;
            }
        }, keyHolder);

        return keyHolder.getKey().intValue();

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Request> getMaxRequestID(int corporationID,
                                         String subscriptionID) {
        String query = "SELECT max(convert(req.requestID,signed)) requestID, req.corporationID, req.subscriptionID FROM requests req"
                + " WHERE req.corporationID = "
                + corporationID
                + " AND req.subscriptionID = '"
                + subscriptionID
                + "' GROUP BY req.corporationID, req.subscriptionID";
        List<Request> records = (List<Request>) jdbcTemplate.query(query,
                new RowMapper() {
                    public Object mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Request req = new Request();
                        req.setCorporationID(rs.getInt("corporationID"));
                        req.setRequestID(rs.getInt("requestID"));
                        req.setSubscriptionID(rs.getString("subscriptionID"));
                        return req;
                    }
                });

        return records;
    }

    @Override
    public Object insertLog(final BullhornLog log) {

        final String query = "INSERT INTO log (corporationID, status, errorCount, error, eventID, requestID, subscriptionID, entity, entityID, eventType, updatedProperties, eventTimeStamp) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection
                        .prepareStatement(
                                query,
                                new String[] { "corporationID, status, errorCount, error, eventID, requestID, subscriptionID, entity, entityID, eventType, updatedProperties, eventTimeStamp" });
                ps.setInt(1, log.getCorporationID());
                ps.setString(2, log.getStatus());
                ps.setInt(3, 1);
                ps.setString(4, log.getError());
                ps.setString(5, log.getEventID());
                ps.setString(6, log.getRequestID());
                ps.setString(7, log.getSubscriptionID());
                ps.setString(8, log.getEntity());
                ps.setInt(9, log.getEntityID());
                ps.setString(10, log.getEventType());
                ps.setString(11, Util.arrayToString(log.getUpdatedProperties(), ","));
                ps.setDate(12, log.getEventTimeStamp());
                return ps;
            }
        }, keyHolder);

        return keyHolder.getKey().intValue();

    }

    @Override
    public void updateLog(final BullhornLog log) {
        final String query = "UPDATE log " + "SET corporationID = ?, " + "status = ?, " + "errorCount = errorCount + 1, "
                + "error = ?, " + "subscriptionID = ?, " + "entity = ?, " + "entityID = ? " + "WHERE eventID = ?";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(query,
                        new String[] { "corporationID, status, error, errorType, subscriptionID, entity, entityID, eventID" });
                ps.setInt(1, log.getCorporationID());
                ps.setString(2, log.getStatus());
                ps.setString(3, log.getError());
                ps.setString(4, log.getSubscriptionID());
                ps.setString(5, log.getEntity());
                ps.setInt(6, log.getEntityID());
                ps.setString(7, log.getEventID());

                return ps;
            }
        }, keyHolder);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<BullhornLog> selectWhere(String queryWhere) {
        String query = "SELECT * FROM log WHERE " + queryWhere;
        List<BullhornLog> records = (List<BullhornLog>) jdbcTemplate.query(query, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                BullhornLog log = new BullhornLog();
                log.setCorporationID(rs.getInt("corporationID"));
                log.setError(rs.getString("error"));
                log.setErrorCount(rs.getInt("errorCount"));
                log.setEventID(rs.getString("eventID"));
                log.setRequestID(rs.getString("requestID"));
                log.setLogID(rs.getInt("logID"));
                log.setStatus(rs.getString("status"));
                log.setSubscriptionID(rs.getString("subscriptionID"));
                log.setEntity(rs.getString("entity"));
                log.setEntityID(rs.getInt("entityID"));
                log.setEventType(rs.getString("eventType"));
                log.setUpdatedProperties(rs.getString("updatedProperties") != null ? rs.getString("updatedProperties").split(",")
                        : null);
                log.setEventTimeStamp(rs.getDate("eventTimeStamp"));
                return log;
            }
        });

        return records;
    }

    /**
     * For Exceptions
     */
    @Override
    public Object insertError(final BullhornError error) {

        final String query = "INSERT INTO errors (corporationID, error, dateAdded) VALUES (?,?,?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(query, new String[] { "corporationID, error, dateAdded" });
                ps.setInt(1, error.getCorporationID());
                ps.setString(2, error.getError());
                ps.setTimestamp(3, error.getDateAdded());
                return ps;
            }
        }, keyHolder);

        Object tmp = keyHolder.getKey().intValue();
        return Integer.valueOf(keyHolder.getKey().intValue());

    }

}
