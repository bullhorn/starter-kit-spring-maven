
package com.bullhorn.dataevent.event;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bullhorn.dataevent.event package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bullhorn.dataevent.event
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntityInsertedEvent }
     * 
     */
    public EntityInsertedEvent createEntityInsertedEvent() {
        return new EntityInsertedEvent();
    }

    /**
     * Create an instance of {@link EntityUpdatedEvent }
     * 
     */
    public EntityUpdatedEvent createEntityUpdatedEvent() {
        return new EntityUpdatedEvent();
    }

    /**
     * Create an instance of {@link com.bullhorn.dataevent.event.DataEvent.EventMetadata }
     * 
     */
    public com.bullhorn.dataevent.event.DataEvent.EventMetadata createDataEventEventMetadata() {
        return new com.bullhorn.dataevent.event.DataEvent.EventMetadata();
    }

    /**
     * Create an instance of {@link EntityDeletedEvent }
     * 
     */
    public EntityDeletedEvent createEntityDeletedEvent() {
        return new EntityDeletedEvent();
    }

    /**
     * Create an instance of {@link FieldMapChangeEvent }
     * 
     */
    public FieldMapChangeEvent createFieldMapChangeEvent() {
        return new FieldMapChangeEvent();
    }

    /**
     * Create an instance of {@link com.bullhorn.dataevent.event.DataEvent.EventMetadata.Entry }
     * 
     */
    public com.bullhorn.dataevent.event.DataEvent.EventMetadata.Entry createDataEventEventMetadataEntry() {
        return new com.bullhorn.dataevent.event.DataEvent.EventMetadata.Entry();
    }

    /**
     * Create an instance of {@link JobMatchSearchEvent }
     * 
     */
    public JobMatchSearchEvent createJobMatchSearchEvent() {
        return new JobMatchSearchEvent();
    }

}
