
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bullhorn.entity.timecard package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bullhorn.entity.timecard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimecardPayClassDto }
     * 
     */
    public TimecardPayClassDto createTimecardPayClassDto() {
        return new TimecardPayClassDto();
    }

    /**
     * Create an instance of {@link TimecardBatchDto }
     * 
     */
    public TimecardBatchDto createTimecardBatchDto() {
        return new TimecardBatchDto();
    }

    /**
     * Create an instance of {@link TimecardExpenseDto }
     * 
     */
    public TimecardExpenseDto createTimecardExpenseDto() {
        return new TimecardExpenseDto();
    }

    /**
     * Create an instance of {@link TimecardTimeDto }
     * 
     */
    public TimecardTimeDto createTimecardTimeDto() {
        return new TimecardTimeDto();
    }

    /**
     * Create an instance of {@link TimecardDto }
     * 
     */
    public TimecardDto createTimecardDto() {
        return new TimecardDto();
    }

}
