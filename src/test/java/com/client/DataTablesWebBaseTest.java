package com.client;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import com.client.core.ApplicationSettings;
import com.client.core.base.service.concurrency.ConcurrencyService;
import com.client.core.base.tools.test.TestEntities;
import com.client.core.base.tools.test.TestUtil;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.util.Util;
import com.client.core.datatables.controller.DataTablesController;
import com.client.core.datatables.model.column.Column;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;
import com.client.core.workers.DataTablesEditWorker;
import com.google.common.collect.Maps;

/**
 * Test class to run test on a datatables controller. Extend this class and provide the
 *
 * @author magnus.palm
 *
 */
public abstract class DataTablesWebBaseTest<T, ID> extends WebBaseTest {

    @Autowired
    @Qualifier("appSettings")
    public ApplicationSettings applicationSettings;

    @Autowired
    public TestUtil testUtil;

    @Autowired
    public TestEntities testEntities;

    public static Log log = LogFactory.getLog(DataTablesWebBaseTest.class);

    public String servletPath;

    public String tableRootUrl;

    public String initForwardedUrl;

    public String entityId;

    public T validEntity;

    public DataTablesController<T, ID> controller;

    @Autowired
    public ConcurrencyService concurrencyService;

    /**
     * These parameters will be added to all URLs. To specify url specific additional parameters add them to the static url Strings (ie.
     * DATA_URL)
     */
    public Map<String, String> additionalParams;

    public Map<String, String> datatablesParams;

    public static String DATA_URL = "data";
    public static String EDIT_URL = "edit";
    public static String INIT_URL = "init";
    public static String PREPARE_FORM_EDIT_URL = "prepareformedit";
    public static String POST_FORM_EDIT_URL = "postformedit";
    public static String DELETE_URL = "delete";
    public static String ADD_URL = "add";
    public static String UPDATE_URL = "update";

    /**
     * Implement and set the variables needed (such as tableRootUrl, initForwardedUrl,entityId). Annotate implementing method with @Before
     */
    public abstract void variableSetup();

    /**
     * Should return an entity that will pass all validations
     *
     * @param id
     * @return
     */
    public abstract T validEntity(ID id);

    @Test
    public void testVariableSetup() {
        assertNotNull("tableRootUrl is null, set the tableRootUrl in variableSetup()", tableRootUrl);
        assertNotNull("servletPath is null, set the servletPath in variableSetup()", servletPath);
        assertNotNull("initForwardedUrl is null, set the initForwardedUrl in variableSetup()", initForwardedUrl);
        assertNotNull("entityId is null, set the entityId in variableSetup()", entityId);
        assertNotNull("validEntity is null, set the validEntity in variableSetup()", validEntity);
        assertNotNull("controller is null, set the controller in variableSetup()", controller);

    }

    /**
     * Runs a test on the init method for a datatables setup.
     *
     * @throws Exception
     */
    @Test
    public void testInit() throws Exception {

        String additionalParamString = addAdditionalParams();
        getMockMvc().perform(get(servletPath + tableRootUrl + "/" + INIT_URL + additionalParamString).servletPath(servletPath))
                .andExpect(status().isOk()).andExpect(model().attributeExists("newEntity"))
                .andExpect(model().attributeExists("columnsMap")).andExpect(model().attributeExists("applicationDateFormat"))
                .andExpect(model().attributeExists("columnConfigDataTables"))
                .andExpect(model().attributeExists("columnConfigDataTablesEditable")).andExpect(model().attributeExists("allowAdd"))
                .andExpect(model().attributeExists("allowDelete")).andExpect(model().attributeExists("entityName"))
                .andExpect(model().attributeExists("customUrl")).andExpect(model().attributeExists("tableName"));
    }

    /**
     * Runs test on the data method for a datatables setup
     *
     * @throws Exception
     */
    @Test
    public void testData() throws Exception {
        String additionalParamString = addAdditionalParams();
        String datatablesParamString = addDatatablesParams();

        getMockMvc().perform(post(servletPath + tableRootUrl + "/" + DATA_URL + additionalParamString+datatablesParamString).servletPath(servletPath))
                .andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
                .andExpect(jsonPath("$.iTotalDisplayRecords").exists()).andExpect(jsonPath("$.iTotalRecords").exists())
                .andExpect(jsonPath("$.aaData").isArray()).andExpect(jsonPath("$.sEcho").exists());

    }

    /**
     * Runs test on the edit method for a datatables setup, calls each column position that is visible and editable
     *
     * @throws Exception
     */
    @Test
    public void testEdit() throws Exception {
        String additionalParamString = addAdditionalParams();
        ColumnConfiguration columnConfiguration = controller.getDataTablesService().convertEntityToColumns(validEntity);
        controller.getDataTablesService().additionalColumnConfiguration(columnConfiguration, null, null, null);
        String url = servletPath + tableRootUrl + "/" + EDIT_URL + additionalParamString;
        List<DataTablesEditWorker> workers = new ArrayList<DataTablesEditWorker>();

        for (Entry<Integer, Column> entry : columnConfiguration.getColumnConfigMap().entrySet()) {

            if (entry.getValue().isVisible() && entry.getValue().isEditable()) {
                Integer columnPosition = adjustColumnPositionDueToInvisibleColumns(columnConfiguration, entry.getKey());
                Object value = entry.getValue().getValue();
                String prettyValue = Util.prepareDisplayValue(value, applicationSettings.getApplicationDateFormat());

                DataTablesEditWorker worker = new DataTablesEditWorker(getMockMvc(), url, columnPosition, prettyValue, servletPath,
                        entityId);
                workers.add(worker);

            }
        }

        concurrencyService.spinThreadsAndWaitForResult(workers);

    }

    /**
     * Used to counter the adjustment in AbstractDataTablesService since the testing is done using the actual columnPosition. Only the
     * editing from datatables ui needs the adjustment in AbstractDataTablesService.
     *
     * @param columnConfiguration
     * @param columnPosition
     * @return
     */
    public Integer adjustColumnPositionDueToInvisibleColumns(ColumnConfiguration columnConfiguration, Integer columnPosition) {

        TreeMap<Integer, Column> columnConfigMap = columnConfiguration.getColumnConfigMap();
        int newColumnPosition = columnPosition;

        // loop over the columns and for each invisible column that is located before the
        // column to check add one to new column position
        for (Map.Entry<Integer, Column> entry : columnConfigMap.entrySet()) {

            int columnSettingPosition = entry.getKey();
            boolean columnIsVisible = entry.getValue().isVisible();

            if (columnIsVisible == false && columnSettingPosition <= columnPosition) {
                newColumnPosition--;
            }

        }
        return newColumnPosition;
    }

    /**
     * Runs test on the prepareformedit method for a datatables setup
     *
     * @throws Exception
     */
    @Test
    public void testPrepareFormEdit() throws Exception {
        String additionalParamString = addAdditionalParams();
        getMockMvc()
                .perform(
                        get(servletPath + tableRootUrl + "/" + PREPARE_FORM_EDIT_URL + additionalParamString).servletPath(servletPath)
                                .param("entityID", entityId)).andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType(MediaTypes.JSON)).andExpect(jsonPath("$.result").isArray());
    }

    /**
     * Runs test on the formedit method for a datatables setup
     *
     * @throws Exception
     */
    @Test
    public void testFormEdit() throws Exception {
        String additionalParamString = addAdditionalParams();
        getMockMvc()
                .perform(
                        addFormParameters(
                                post(servletPath + tableRootUrl + "/" + POST_FORM_EDIT_URL + additionalParamString)
                                        .servletPath(servletPath).param("entityID", entityId), validEntity)).andDo(print())
                .andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
                .andExpect(content().string(equalTo(entityId)));
    }

    /**
     * Runs test on the delete method for a datatables setup
     *
     * @throws Exception
     */
    @Test
    public void testDelete() throws Exception {
        String additionalParamString = addAdditionalParams();
        getMockMvc()
                .perform(
                        post(servletPath + tableRootUrl + "/" + DELETE_URL + additionalParamString).servletPath(servletPath).param("id",
                                entityId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaTypes.JSON))
                .andExpect(
                        content().string(
                                anyOf(equalTo("Error deleting record. Entity does not exist with id = " + entityId), isEmptyString())));
    }

    /**
     * Runs test on the add method for a datatables setup.
     *
     * @throws Exception
     */
    @Test
    public void testInsert() throws Exception {
        String additionalParamString = addAdditionalParams();
        getMockMvc()
                .perform(
                        addFormParameters(
                                post(servletPath + tableRootUrl + "/" + ADD_URL + additionalParamString).sessionAttr("newEntity",
                                        validEntity).servletPath(servletPath), validEntity)).andExpect(status().isOk())
                .andExpect(content().contentType(MediaTypes.JSON)).andExpect(content().string(not(isEmptyOrNullString())));
        ;
    }

    /**
     * Runs test on the add method for a datatables setup with an id to make sure an update takes place
     *
     * @throws Exception
     */
    @Test
    public void testUpdate() throws Exception {
        String additionalParamString = addAdditionalParams();
        getMockMvc()
                .perform(
                        addFormParameters(
                                post(servletPath + tableRootUrl + "/" + UPDATE_URL + additionalParamString).sessionAttr("newEntity",
                                        validEntity).servletPath(servletPath), validEntity)).andExpect(status().isOk())
                .andExpect(content().contentType(MediaTypes.JSON)).andExpect(content().string(equalTo(entityId)));
    }

    public String getServletPath() {
        return servletPath;
    }

    /**
     * Specify the portion of the requestURI that represents the path to which the Servlet is mapped. This is typically a portion of the
     * requestURI after the context path. The servletPath must start with a "/" and must not end with a "/".
     *
     * @param servletPath
     */
    public void setServletPath(String servletPath) {
        this.servletPath = servletPath;
    }

    public String getTableRootUrl() {
        return tableRootUrl;
    }

    /**
     * The url to test, minus the servlet path mapping.
     *
     * Example: if full url is http://localhost:8080/portal/appliedJob/init, then the supplied root url should be "/appliedJob". Note the
     * slash.
     *
     * @param tableRootUrl
     */
    public void setTableRootUrl(String tableRootUrl) {
        this.tableRootUrl = tableRootUrl;
    }

    public String getInitForwardedUrl() {
        return initForwardedUrl;
    }

    /**
     * initForwardedUrl the expected jsp page on the init page
     *
     * @param initForwardedUrl
     */
    public void setInitForwardedUrl(String initForwardedUrl) {
        this.initForwardedUrl = initForwardedUrl;
    }

    public String getEntityId() {
        return entityId;
    }

    /**
     * The entityId to be used in testing that involes a specific entity, such as delete and edit.
     *
     * @param entityId
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public T getValidEntity() {
        return validEntity;
    }

    public void setValidEntity(T validEntity) {
        this.validEntity = validEntity;
    }

    public DataTablesController<T, ID> getController() {
        return controller;
    }

    public void setController(DataTablesController<T, ID> controller) {
        this.controller = controller;
    }

    public MockHttpServletRequestBuilder addFormParameters(MockHttpServletRequestBuilder builder, Object object)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        if (object != null) {

            DateLocaleConverter dateLocaleConverter = new DateLocaleConverter();
            ConvertUtils.register(dateLocaleConverter, Date.class);

            SimpleDateFormat dateFormat = new SimpleDateFormat(applicationSettings.getApplicationDateFormat());

            Map<String, ?> propertyValues = TestUtil.getPropertyValues(object, dateFormat);

            for (Entry<String, ?> entry : propertyValues.entrySet()) {
                builder.param(entry.getKey(), Util.prepareDisplayValue(entry.getValue(), applicationSettings.getApplicationDateFormat()));
            }
        }

        return builder;
    }

    public String addAdditionalParams() {
        if (additionalParams == null || additionalParams.isEmpty()) {
            return "";
        }

        String url = Util.mapToString(additionalParams);

        return "?" + url;
    }

    public String addDatatablesParams() {
        if(datatablesParams == null || datatablesParams.isEmpty()) {
            datatablesParams = initDataTablesParams();
        }

        String url = Util.mapToString(datatablesParams);

        return "&" + url;
    }

    public Map<String, String> initDataTablesParams() {
        Map<String, String> params = Maps.newLinkedHashMap();

        params.put("sEcho", "1");
        params.put("sSearch", "");
        params.put("sSearch_0", "");
        params.put("sSearch_1", "");
        params.put("sSearch_2", "");
        params.put("sSearch_3", "");
        params.put("sColumns", "");
        params.put("iDisplayStart", "0");
        params.put("iDisplayLength", "20");
        params.put("iColumns", "5");
        params.put("iSortingCols", "0");
        params.put("iSortCol_0", "0");
        params.put("sSortDir_0", "asc");

        return params;
    }

    public ApplicationSettings getApplicationSettings() {
        return applicationSettings;
    }

    public TestUtil getTestUtil() {
        return testUtil;
    }

}
