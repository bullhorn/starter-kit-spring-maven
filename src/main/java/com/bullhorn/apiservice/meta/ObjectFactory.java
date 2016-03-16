
package com.bullhorn.apiservice.meta;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bullhorn.apiservice.meta package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bullhorn.apiservice.meta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApiValueDisplayPair }
     * 
     */
    public ApiValueDisplayPair createApiValueDisplayPair() {
        return new ApiValueDisplayPair();
    }

    /**
     * Create an instance of {@link ApiEntityMeta }
     * 
     */
    public ApiEntityMeta createApiEntityMeta() {
        return new ApiEntityMeta();
    }

    /**
     * Create an instance of {@link ApiPropertyMeta }
     * 
     */
    public ApiPropertyMeta createApiPropertyMeta() {
        return new ApiPropertyMeta();
    }

    /**
     * Create an instance of {@link FileMeta }
     * 
     */
    public FileMeta createFileMeta() {
        return new FileMeta();
    }

    /**
     * Create an instance of {@link ApiFieldMap }
     * 
     */
    public ApiFieldMap createApiFieldMap() {
        return new ApiFieldMap();
    }

    /**
     * Create an instance of {@link ViewLayout }
     * 
     */
    public ViewLayout createViewLayout() {
        return new ViewLayout();
    }

}
