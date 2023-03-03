package com.client.core.base.model.jpa;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * An abstract implementation of a JpaEntity, providing dateAdded and dateUpdated functionality.
 *
 * @param <ID> The primary key of the JpaEntity, most likely an Integer but could also be of a more complex type if needed.
 */
@MappedSuperclass
public abstract class AbstractJpaEntity<ID> implements JpaEntity<ID> {

    private Date dateAdded = now();
    private Date dateUpdated = now();

    public AbstractJpaEntity() {
        super();
    }

    public AbstractJpaEntity(Date dateUpdated) {
        super();
        this.dateUpdated = dateUpdated;
    }

    public AbstractJpaEntity(Date dateAdded, Date dateUpdated) {
        super();
        this.dateAdded = dateAdded;
        this.dateUpdated = dateUpdated;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Column(name = "dateAdded", updatable = false)
    public Date getDateAdded() {
        return dateAdded;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDateAdded(Date dateAdded) {
        if (dateAdded != null) {
            this.dateAdded = dateAdded;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Column(name = "dateUpdated")
    public Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDateUpdated(Date dateUpdated) {
        if (dateUpdated != null) {
            this.dateUpdated = dateUpdated;
        }
    }

    /**
     * Always set the dateUpdate to now when updating a record
     */
    @PreUpdate
    public void updateDateUpdated(){
        this.setDateUpdated(now());
    }


    /**
     * Always set both dateAdded and dateUpdated to now when inserting a record
     */
    @PrePersist
    public void updateDateAdded(){
        this.setDateAdded(now());
        this.setDateUpdated(now());
    }


    /**
     * Returns the current date
     * @return
     */
    public Date now(){
        return new DateTime(DateTimeZone.forID("EST5EDT")).toLocalDateTime().toDate();
    }

}
