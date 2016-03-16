
package com.bullhorn.entity.job;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.emb.Address1;


/**
 * <p>Java class for jobOrderDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobOrderDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://emb.entity.bullhorn.com/}address1" minOccurs="0"/>
 *         &lt;element name="benefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billRateCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bonusPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificationList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientBillRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="clientContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clientCorporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlatedCustomDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlatedCustomDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlatedCustomFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlatedCustomFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlatedCustomFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlatedCustomInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateClosed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLastExported" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="degreeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationWeeks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="educationDegree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeArrangement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hoursOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursPerWeek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isClientEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInterviewRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isJobcastPublished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jobBoardList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numOpenings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="onSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionsPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="publicDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishedZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonClosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportToClientContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responseUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="salaryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shiftID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="skillList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travelRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="willRelocate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="willSponsor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workersCompRateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearsRequired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobOrderDtoBase", propOrder = {
    "address",
    "benefits",
    "billRateCategoryID",
    "bonusPackage",
    "branchCode",
    "certificationList",
    "clientBillRate",
    "clientContactID",
    "clientCorporationID",
    "correlatedCustomDate1",
    "correlatedCustomDate2",
    "correlatedCustomDate3",
    "correlatedCustomFloat1",
    "correlatedCustomFloat2",
    "correlatedCustomFloat3",
    "correlatedCustomInt1",
    "correlatedCustomInt2",
    "correlatedCustomInt3",
    "correlatedCustomText1",
    "correlatedCustomText10",
    "correlatedCustomText2",
    "correlatedCustomText3",
    "correlatedCustomText4",
    "correlatedCustomText5",
    "correlatedCustomText6",
    "correlatedCustomText7",
    "correlatedCustomText8",
    "correlatedCustomText9",
    "correlatedCustomTextBlock1",
    "correlatedCustomTextBlock2",
    "correlatedCustomTextBlock3",
    "costCenter",
    "customDate1",
    "customDate2",
    "customDate3",
    "customFloat1",
    "customFloat2",
    "customFloat3",
    "customInt1",
    "customInt2",
    "customInt3",
    "customText1",
    "customText10",
    "customText11",
    "customText12",
    "customText13",
    "customText14",
    "customText15",
    "customText16",
    "customText17",
    "customText18",
    "customText19",
    "customText2",
    "customText20",
    "customText3",
    "customText4",
    "customText5",
    "customText6",
    "customText7",
    "customText8",
    "customText9",
    "customTextBlock1",
    "customTextBlock2",
    "customTextBlock3",
    "customTextBlock4",
    "customTextBlock5",
    "dateAdded",
    "dateClosed",
    "dateEnd",
    "dateLastExported",
    "degreeList",
    "description",
    "durationWeeks",
    "educationDegree",
    "employmentType",
    "externalCategoryID",
    "externalID",
    "feeArrangement",
    "hoursOfOperation",
    "hoursPerWeek",
    "isClientEditable",
    "isDeleted",
    "isInterviewRequired",
    "isJobcastPublished",
    "isOpen",
    "isPublic",
    "jobBoardList",
    "jobOrderID",
    "numOpenings",
    "onSite",
    "optionsPackage",
    "ownerID",
    "payRate",
    "publicDescription",
    "publishedZip",
    "reasonClosed",
    "reportTo",
    "reportToClientContactID",
    "responseUserID",
    "salary",
    "salaryUnit",
    "shiftID",
    "skillList",
    "source",
    "startDate",
    "status",
    "taxRate",
    "taxStatus",
    "title",
    "travelRequirements",
    "type",
    "willRelocate",
    "willSponsor",
    "workersCompRateID",
    "yearsRequired"
})
@XmlSeeAlso({
    JobOrderDto.class
})
public abstract class JobOrderDtoBase
    extends AbstractDto
{

    protected Address1 address;
    protected String benefits;
    protected Integer billRateCategoryID;
    protected String bonusPackage;
    protected String branchCode;
    protected String certificationList;
    protected BigDecimal clientBillRate;
    protected Integer clientContactID;
    protected Integer clientCorporationID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correlatedCustomDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correlatedCustomDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correlatedCustomDate3;
    protected Double correlatedCustomFloat1;
    protected Double correlatedCustomFloat2;
    protected Double correlatedCustomFloat3;
    protected Integer correlatedCustomInt1;
    protected Integer correlatedCustomInt2;
    protected Integer correlatedCustomInt3;
    protected String correlatedCustomText1;
    protected String correlatedCustomText10;
    protected String correlatedCustomText2;
    protected String correlatedCustomText3;
    protected String correlatedCustomText4;
    protected String correlatedCustomText5;
    protected String correlatedCustomText6;
    protected String correlatedCustomText7;
    protected String correlatedCustomText8;
    protected String correlatedCustomText9;
    protected String correlatedCustomTextBlock1;
    protected String correlatedCustomTextBlock2;
    protected String correlatedCustomTextBlock3;
    protected String costCenter;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate3;
    protected Double customFloat1;
    protected Double customFloat2;
    protected Double customFloat3;
    protected Integer customInt1;
    protected Integer customInt2;
    protected Integer customInt3;
    protected String customText1;
    protected String customText10;
    protected String customText11;
    protected String customText12;
    protected String customText13;
    protected String customText14;
    protected String customText15;
    protected String customText16;
    protected String customText17;
    protected String customText18;
    protected String customText19;
    protected String customText2;
    protected String customText20;
    protected String customText3;
    protected String customText4;
    protected String customText5;
    protected String customText6;
    protected String customText7;
    protected String customText8;
    protected String customText9;
    protected String customTextBlock1;
    protected String customTextBlock2;
    protected String customTextBlock3;
    protected String customTextBlock4;
    protected String customTextBlock5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateClosed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastExported;
    protected String degreeList;
    protected String description;
    protected Double durationWeeks;
    protected String educationDegree;
    protected String employmentType;
    protected Integer externalCategoryID;
    protected String externalID;
    protected Double feeArrangement;
    protected String hoursOfOperation;
    protected Double hoursPerWeek;
    protected Boolean isClientEditable;
    protected Boolean isDeleted;
    protected Boolean isInterviewRequired;
    protected Boolean isJobcastPublished;
    protected Boolean isOpen;
    protected Integer isPublic;
    protected String jobBoardList;
    protected Integer jobOrderID;
    protected Integer numOpenings;
    protected String onSite;
    protected String optionsPackage;
    protected Integer ownerID;
    protected BigDecimal payRate;
    protected String publicDescription;
    protected String publishedZip;
    protected String reasonClosed;
    protected String reportTo;
    protected Integer reportToClientContactID;
    protected Integer responseUserID;
    protected BigDecimal salary;
    protected String salaryUnit;
    protected Integer shiftID;
    protected String skillList;
    protected String source;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String status;
    protected Double taxRate;
    protected String taxStatus;
    protected String title;
    protected String travelRequirements;
    protected Integer type;
    protected Boolean willRelocate;
    protected Boolean willSponsor;
    protected Integer workersCompRateID;
    protected Integer yearsRequired;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public void setAddress(Address1 value) {
        this.address = value;
    }

    /**
     * Gets the value of the benefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefits() {
        return benefits;
    }

    /**
     * Sets the value of the benefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefits(String value) {
        this.benefits = value;
    }

    /**
     * Gets the value of the billRateCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillRateCategoryID() {
        return billRateCategoryID;
    }

    /**
     * Sets the value of the billRateCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillRateCategoryID(Integer value) {
        this.billRateCategoryID = value;
    }

    /**
     * Gets the value of the bonusPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusPackage() {
        return bonusPackage;
    }

    /**
     * Sets the value of the bonusPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusPackage(String value) {
        this.bonusPackage = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the certificationList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationList() {
        return certificationList;
    }

    /**
     * Sets the value of the certificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationList(String value) {
        this.certificationList = value;
    }

    /**
     * Gets the value of the clientBillRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClientBillRate() {
        return clientBillRate;
    }

    /**
     * Sets the value of the clientBillRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClientBillRate(BigDecimal value) {
        this.clientBillRate = value;
    }

    /**
     * Gets the value of the clientContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientContactID() {
        return clientContactID;
    }

    /**
     * Sets the value of the clientContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientContactID(Integer value) {
        this.clientContactID = value;
    }

    /**
     * Gets the value of the clientCorporationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientCorporationID() {
        return clientCorporationID;
    }

    /**
     * Sets the value of the clientCorporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientCorporationID(Integer value) {
        this.clientCorporationID = value;
    }

    /**
     * Gets the value of the correlatedCustomDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrelatedCustomDate1() {
        return correlatedCustomDate1;
    }

    /**
     * Sets the value of the correlatedCustomDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrelatedCustomDate1(XMLGregorianCalendar value) {
        this.correlatedCustomDate1 = value;
    }

    /**
     * Gets the value of the correlatedCustomDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrelatedCustomDate2() {
        return correlatedCustomDate2;
    }

    /**
     * Sets the value of the correlatedCustomDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrelatedCustomDate2(XMLGregorianCalendar value) {
        this.correlatedCustomDate2 = value;
    }

    /**
     * Gets the value of the correlatedCustomDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrelatedCustomDate3() {
        return correlatedCustomDate3;
    }

    /**
     * Sets the value of the correlatedCustomDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrelatedCustomDate3(XMLGregorianCalendar value) {
        this.correlatedCustomDate3 = value;
    }

    /**
     * Gets the value of the correlatedCustomFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrelatedCustomFloat1() {
        return correlatedCustomFloat1;
    }

    /**
     * Sets the value of the correlatedCustomFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrelatedCustomFloat1(Double value) {
        this.correlatedCustomFloat1 = value;
    }

    /**
     * Gets the value of the correlatedCustomFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrelatedCustomFloat2() {
        return correlatedCustomFloat2;
    }

    /**
     * Sets the value of the correlatedCustomFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrelatedCustomFloat2(Double value) {
        this.correlatedCustomFloat2 = value;
    }

    /**
     * Gets the value of the correlatedCustomFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrelatedCustomFloat3() {
        return correlatedCustomFloat3;
    }

    /**
     * Sets the value of the correlatedCustomFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrelatedCustomFloat3(Double value) {
        this.correlatedCustomFloat3 = value;
    }

    /**
     * Gets the value of the correlatedCustomInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelatedCustomInt1() {
        return correlatedCustomInt1;
    }

    /**
     * Sets the value of the correlatedCustomInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelatedCustomInt1(Integer value) {
        this.correlatedCustomInt1 = value;
    }

    /**
     * Gets the value of the correlatedCustomInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelatedCustomInt2() {
        return correlatedCustomInt2;
    }

    /**
     * Sets the value of the correlatedCustomInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelatedCustomInt2(Integer value) {
        this.correlatedCustomInt2 = value;
    }

    /**
     * Gets the value of the correlatedCustomInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelatedCustomInt3() {
        return correlatedCustomInt3;
    }

    /**
     * Sets the value of the correlatedCustomInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelatedCustomInt3(Integer value) {
        this.correlatedCustomInt3 = value;
    }

    /**
     * Gets the value of the correlatedCustomText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText1() {
        return correlatedCustomText1;
    }

    /**
     * Sets the value of the correlatedCustomText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText1(String value) {
        this.correlatedCustomText1 = value;
    }

    /**
     * Gets the value of the correlatedCustomText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText10() {
        return correlatedCustomText10;
    }

    /**
     * Sets the value of the correlatedCustomText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText10(String value) {
        this.correlatedCustomText10 = value;
    }

    /**
     * Gets the value of the correlatedCustomText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText2() {
        return correlatedCustomText2;
    }

    /**
     * Sets the value of the correlatedCustomText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText2(String value) {
        this.correlatedCustomText2 = value;
    }

    /**
     * Gets the value of the correlatedCustomText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText3() {
        return correlatedCustomText3;
    }

    /**
     * Sets the value of the correlatedCustomText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText3(String value) {
        this.correlatedCustomText3 = value;
    }

    /**
     * Gets the value of the correlatedCustomText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText4() {
        return correlatedCustomText4;
    }

    /**
     * Sets the value of the correlatedCustomText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText4(String value) {
        this.correlatedCustomText4 = value;
    }

    /**
     * Gets the value of the correlatedCustomText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText5() {
        return correlatedCustomText5;
    }

    /**
     * Sets the value of the correlatedCustomText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText5(String value) {
        this.correlatedCustomText5 = value;
    }

    /**
     * Gets the value of the correlatedCustomText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText6() {
        return correlatedCustomText6;
    }

    /**
     * Sets the value of the correlatedCustomText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText6(String value) {
        this.correlatedCustomText6 = value;
    }

    /**
     * Gets the value of the correlatedCustomText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText7() {
        return correlatedCustomText7;
    }

    /**
     * Sets the value of the correlatedCustomText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText7(String value) {
        this.correlatedCustomText7 = value;
    }

    /**
     * Gets the value of the correlatedCustomText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText8() {
        return correlatedCustomText8;
    }

    /**
     * Sets the value of the correlatedCustomText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText8(String value) {
        this.correlatedCustomText8 = value;
    }

    /**
     * Gets the value of the correlatedCustomText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText9() {
        return correlatedCustomText9;
    }

    /**
     * Sets the value of the correlatedCustomText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText9(String value) {
        this.correlatedCustomText9 = value;
    }

    /**
     * Gets the value of the correlatedCustomTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomTextBlock1() {
        return correlatedCustomTextBlock1;
    }

    /**
     * Sets the value of the correlatedCustomTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomTextBlock1(String value) {
        this.correlatedCustomTextBlock1 = value;
    }

    /**
     * Gets the value of the correlatedCustomTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomTextBlock2() {
        return correlatedCustomTextBlock2;
    }

    /**
     * Sets the value of the correlatedCustomTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomTextBlock2(String value) {
        this.correlatedCustomTextBlock2 = value;
    }

    /**
     * Gets the value of the correlatedCustomTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomTextBlock3() {
        return correlatedCustomTextBlock3;
    }

    /**
     * Sets the value of the correlatedCustomTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomTextBlock3(String value) {
        this.correlatedCustomTextBlock3 = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the customDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate1() {
        return customDate1;
    }

    /**
     * Sets the value of the customDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate1(XMLGregorianCalendar value) {
        this.customDate1 = value;
    }

    /**
     * Gets the value of the customDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate2() {
        return customDate2;
    }

    /**
     * Sets the value of the customDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate2(XMLGregorianCalendar value) {
        this.customDate2 = value;
    }

    /**
     * Gets the value of the customDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate3() {
        return customDate3;
    }

    /**
     * Sets the value of the customDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate3(XMLGregorianCalendar value) {
        this.customDate3 = value;
    }

    /**
     * Gets the value of the customFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat1() {
        return customFloat1;
    }

    /**
     * Sets the value of the customFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat1(Double value) {
        this.customFloat1 = value;
    }

    /**
     * Gets the value of the customFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat2() {
        return customFloat2;
    }

    /**
     * Sets the value of the customFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat2(Double value) {
        this.customFloat2 = value;
    }

    /**
     * Gets the value of the customFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat3() {
        return customFloat3;
    }

    /**
     * Sets the value of the customFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat3(Double value) {
        this.customFloat3 = value;
    }

    /**
     * Gets the value of the customInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt1() {
        return customInt1;
    }

    /**
     * Sets the value of the customInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt1(Integer value) {
        this.customInt1 = value;
    }

    /**
     * Gets the value of the customInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt2() {
        return customInt2;
    }

    /**
     * Sets the value of the customInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt2(Integer value) {
        this.customInt2 = value;
    }

    /**
     * Gets the value of the customInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt3() {
        return customInt3;
    }

    /**
     * Sets the value of the customInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt3(Integer value) {
        this.customInt3 = value;
    }

    /**
     * Gets the value of the customText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText1() {
        return customText1;
    }

    /**
     * Sets the value of the customText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText1(String value) {
        this.customText1 = value;
    }

    /**
     * Gets the value of the customText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText10() {
        return customText10;
    }

    /**
     * Sets the value of the customText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText10(String value) {
        this.customText10 = value;
    }

    /**
     * Gets the value of the customText11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText11() {
        return customText11;
    }

    /**
     * Sets the value of the customText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText11(String value) {
        this.customText11 = value;
    }

    /**
     * Gets the value of the customText12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText12() {
        return customText12;
    }

    /**
     * Sets the value of the customText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText12(String value) {
        this.customText12 = value;
    }

    /**
     * Gets the value of the customText13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText13() {
        return customText13;
    }

    /**
     * Sets the value of the customText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText13(String value) {
        this.customText13 = value;
    }

    /**
     * Gets the value of the customText14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText14() {
        return customText14;
    }

    /**
     * Sets the value of the customText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText14(String value) {
        this.customText14 = value;
    }

    /**
     * Gets the value of the customText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText15() {
        return customText15;
    }

    /**
     * Sets the value of the customText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText15(String value) {
        this.customText15 = value;
    }

    /**
     * Gets the value of the customText16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText16() {
        return customText16;
    }

    /**
     * Sets the value of the customText16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText16(String value) {
        this.customText16 = value;
    }

    /**
     * Gets the value of the customText17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText17() {
        return customText17;
    }

    /**
     * Sets the value of the customText17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText17(String value) {
        this.customText17 = value;
    }

    /**
     * Gets the value of the customText18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText18() {
        return customText18;
    }

    /**
     * Sets the value of the customText18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText18(String value) {
        this.customText18 = value;
    }

    /**
     * Gets the value of the customText19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText19() {
        return customText19;
    }

    /**
     * Sets the value of the customText19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText19(String value) {
        this.customText19 = value;
    }

    /**
     * Gets the value of the customText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText2() {
        return customText2;
    }

    /**
     * Sets the value of the customText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText2(String value) {
        this.customText2 = value;
    }

    /**
     * Gets the value of the customText20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText20() {
        return customText20;
    }

    /**
     * Sets the value of the customText20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText20(String value) {
        this.customText20 = value;
    }

    /**
     * Gets the value of the customText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText3() {
        return customText3;
    }

    /**
     * Sets the value of the customText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText3(String value) {
        this.customText3 = value;
    }

    /**
     * Gets the value of the customText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText4() {
        return customText4;
    }

    /**
     * Sets the value of the customText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText4(String value) {
        this.customText4 = value;
    }

    /**
     * Gets the value of the customText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText5() {
        return customText5;
    }

    /**
     * Sets the value of the customText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText5(String value) {
        this.customText5 = value;
    }

    /**
     * Gets the value of the customText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText6() {
        return customText6;
    }

    /**
     * Sets the value of the customText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText6(String value) {
        this.customText6 = value;
    }

    /**
     * Gets the value of the customText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText7() {
        return customText7;
    }

    /**
     * Sets the value of the customText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText7(String value) {
        this.customText7 = value;
    }

    /**
     * Gets the value of the customText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText8() {
        return customText8;
    }

    /**
     * Sets the value of the customText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText8(String value) {
        this.customText8 = value;
    }

    /**
     * Gets the value of the customText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText9() {
        return customText9;
    }

    /**
     * Sets the value of the customText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText9(String value) {
        this.customText9 = value;
    }

    /**
     * Gets the value of the customTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock1() {
        return customTextBlock1;
    }

    /**
     * Sets the value of the customTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock1(String value) {
        this.customTextBlock1 = value;
    }

    /**
     * Gets the value of the customTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock2() {
        return customTextBlock2;
    }

    /**
     * Sets the value of the customTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock2(String value) {
        this.customTextBlock2 = value;
    }

    /**
     * Gets the value of the customTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock3() {
        return customTextBlock3;
    }

    /**
     * Sets the value of the customTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock3(String value) {
        this.customTextBlock3 = value;
    }

    /**
     * Gets the value of the customTextBlock4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock4() {
        return customTextBlock4;
    }

    /**
     * Sets the value of the customTextBlock4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock4(String value) {
        this.customTextBlock4 = value;
    }

    /**
     * Gets the value of the customTextBlock5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock5() {
        return customTextBlock5;
    }

    /**
     * Sets the value of the customTextBlock5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock5(String value) {
        this.customTextBlock5 = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClosed() {
        return dateClosed;
    }

    /**
     * Sets the value of the dateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClosed(XMLGregorianCalendar value) {
        this.dateClosed = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the dateLastExported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastExported() {
        return dateLastExported;
    }

    /**
     * Sets the value of the dateLastExported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastExported(XMLGregorianCalendar value) {
        this.dateLastExported = value;
    }

    /**
     * Gets the value of the degreeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeList() {
        return degreeList;
    }

    /**
     * Sets the value of the degreeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeList(String value) {
        this.degreeList = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the durationWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDurationWeeks() {
        return durationWeeks;
    }

    /**
     * Sets the value of the durationWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDurationWeeks(Double value) {
        this.durationWeeks = value;
    }

    /**
     * Gets the value of the educationDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDegree() {
        return educationDegree;
    }

    /**
     * Sets the value of the educationDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDegree(String value) {
        this.educationDegree = value;
    }

    /**
     * Gets the value of the employmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Sets the value of the employmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentType(String value) {
        this.employmentType = value;
    }

    /**
     * Gets the value of the externalCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalCategoryID() {
        return externalCategoryID;
    }

    /**
     * Sets the value of the externalCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalCategoryID(Integer value) {
        this.externalCategoryID = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the feeArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFeeArrangement() {
        return feeArrangement;
    }

    /**
     * Sets the value of the feeArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFeeArrangement(Double value) {
        this.feeArrangement = value;
    }

    /**
     * Gets the value of the hoursOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperation() {
        return hoursOfOperation;
    }

    /**
     * Sets the value of the hoursOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperation(String value) {
        this.hoursOfOperation = value;
    }

    /**
     * Gets the value of the hoursPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursPerWeek() {
        return hoursPerWeek;
    }

    /**
     * Sets the value of the hoursPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursPerWeek(Double value) {
        this.hoursPerWeek = value;
    }

    /**
     * Gets the value of the isClientEditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClientEditable() {
        return isClientEditable;
    }

    /**
     * Sets the value of the isClientEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClientEditable(Boolean value) {
        this.isClientEditable = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isInterviewRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterviewRequired() {
        return isInterviewRequired;
    }

    /**
     * Sets the value of the isInterviewRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterviewRequired(Boolean value) {
        this.isInterviewRequired = value;
    }

    /**
     * Gets the value of the isJobcastPublished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJobcastPublished() {
        return isJobcastPublished;
    }

    /**
     * Sets the value of the isJobcastPublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJobcastPublished(Boolean value) {
        this.isJobcastPublished = value;
    }

    /**
     * Gets the value of the isOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpen() {
        return isOpen;
    }

    /**
     * Sets the value of the isOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpen(Boolean value) {
        this.isOpen = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsPublic(Integer value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the jobBoardList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobBoardList() {
        return jobBoardList;
    }

    /**
     * Sets the value of the jobBoardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobBoardList(String value) {
        this.jobBoardList = value;
    }

    /**
     * Gets the value of the jobOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobOrderID() {
        return jobOrderID;
    }

    /**
     * Sets the value of the jobOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobOrderID(Integer value) {
        this.jobOrderID = value;
    }

    /**
     * Gets the value of the numOpenings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOpenings() {
        return numOpenings;
    }

    /**
     * Sets the value of the numOpenings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOpenings(Integer value) {
        this.numOpenings = value;
    }

    /**
     * Gets the value of the onSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSite() {
        return onSite;
    }

    /**
     * Sets the value of the onSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSite(String value) {
        this.onSite = value;
    }

    /**
     * Gets the value of the optionsPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsPackage() {
        return optionsPackage;
    }

    /**
     * Sets the value of the optionsPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsPackage(String value) {
        this.optionsPackage = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerID(Integer value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the payRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayRate() {
        return payRate;
    }

    /**
     * Sets the value of the payRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayRate(BigDecimal value) {
        this.payRate = value;
    }

    /**
     * Gets the value of the publicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDescription() {
        return publicDescription;
    }

    /**
     * Sets the value of the publicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDescription(String value) {
        this.publicDescription = value;
    }

    /**
     * Gets the value of the publishedZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedZip() {
        return publishedZip;
    }

    /**
     * Sets the value of the publishedZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedZip(String value) {
        this.publishedZip = value;
    }

    /**
     * Gets the value of the reasonClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonClosed() {
        return reasonClosed;
    }

    /**
     * Sets the value of the reasonClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonClosed(String value) {
        this.reasonClosed = value;
    }

    /**
     * Gets the value of the reportTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTo() {
        return reportTo;
    }

    /**
     * Sets the value of the reportTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTo(String value) {
        this.reportTo = value;
    }

    /**
     * Gets the value of the reportToClientContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportToClientContactID() {
        return reportToClientContactID;
    }

    /**
     * Sets the value of the reportToClientContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportToClientContactID(Integer value) {
        this.reportToClientContactID = value;
    }

    /**
     * Gets the value of the responseUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseUserID() {
        return responseUserID;
    }

    /**
     * Sets the value of the responseUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseUserID(Integer value) {
        this.responseUserID = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalary(BigDecimal value) {
        this.salary = value;
    }

    /**
     * Gets the value of the salaryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryUnit() {
        return salaryUnit;
    }

    /**
     * Sets the value of the salaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryUnit(String value) {
        this.salaryUnit = value;
    }

    /**
     * Gets the value of the shiftID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShiftID() {
        return shiftID;
    }

    /**
     * Sets the value of the shiftID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShiftID(Integer value) {
        this.shiftID = value;
    }

    /**
     * Gets the value of the skillList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillList() {
        return skillList;
    }

    /**
     * Sets the value of the skillList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillList(String value) {
        this.skillList = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatus(String value) {
        this.taxStatus = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the travelRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelRequirements() {
        return travelRequirements;
    }

    /**
     * Sets the value of the travelRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelRequirements(String value) {
        this.travelRequirements = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

    /**
     * Gets the value of the willRelocate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWillRelocate() {
        return willRelocate;
    }

    /**
     * Sets the value of the willRelocate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWillRelocate(Boolean value) {
        this.willRelocate = value;
    }

    /**
     * Gets the value of the willSponsor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWillSponsor() {
        return willSponsor;
    }

    /**
     * Sets the value of the willSponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWillSponsor(Boolean value) {
        this.willSponsor = value;
    }

    /**
     * Gets the value of the workersCompRateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkersCompRateID() {
        return workersCompRateID;
    }

    /**
     * Sets the value of the workersCompRateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkersCompRateID(Integer value) {
        this.workersCompRateID = value;
    }

    /**
     * Gets the value of the yearsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearsRequired() {
        return yearsRequired;
    }

    /**
     * Sets the value of the yearsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearsRequired(Integer value) {
        this.yearsRequired = value;
    }

}
