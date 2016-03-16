
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bullhorn.entity.job package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bullhorn.entity.job
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlacementCommissionDto }
     * 
     */
    public PlacementCommissionDto createPlacementCommissionDto() {
        return new PlacementCommissionDto();
    }

    /**
     * Create an instance of {@link JobOrderDto }
     * 
     */
    public JobOrderDto createJobOrderDto() {
        return new JobOrderDto();
    }

    /**
     * Create an instance of {@link WorkersCompensationDto }
     * 
     */
    public WorkersCompensationDto createWorkersCompensationDto() {
        return new WorkersCompensationDto();
    }

    /**
     * Create an instance of {@link WorkersCompensationRateDto }
     * 
     */
    public WorkersCompensationRateDto createWorkersCompensationRateDto() {
        return new WorkersCompensationRateDto();
    }

    /**
     * Create an instance of {@link JobSubmissionDto }
     * 
     */
    public JobSubmissionDto createJobSubmissionDto() {
        return new JobSubmissionDto();
    }

    /**
     * Create an instance of {@link PlacementChangeRequestDto }
     * 
     */
    public PlacementChangeRequestDto createPlacementChangeRequestDto() {
        return new PlacementChangeRequestDto();
    }

    /**
     * Create an instance of {@link PlacementDto }
     * 
     */
    public PlacementDto createPlacementDto() {
        return new PlacementDto();
    }

}
