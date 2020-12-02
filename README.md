# Bullhorn Starter Kit (Spring/Maven)

The Bullhorn Starter Kit is a collection of Java code that lets you integrate custom business logic with the Bullhorn CRM application. The code itself is 100% boilerplate and should require no modification, but rather is designed for plugging in your own classes or extending existing ones. The following technologies are required:
 1. [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 2. [Maven 3](https://maven.apache.org/download.cgi)

Run ``mvn clean install -P{mavenProfile}`` to generate a deployable WAR file in the target folder. You can also deploy to a local Tomcat 7 container provided by Maven by running ``mvn clean tomcat7:run -P${mavenProfile}``, effectively running your application locally. If you want to skip unit tests, pass the flag ``-DskipTests``. See the [javadoc](http://bullhorn.github.io/starter-kit-spring-maven/) for class and method-level documentation.

The application uses [Spring Framework](http://projects.spring.io/spring-framework/) extensively,  but Maven handles all dependencies. These are some other useful links around Bullhorn APIs:
  - [Bullhorn Developer](http://developer.bullhorn.com/) General developer documentation
  - [SOAP Documentation](http://developer.bullhorn.com/doc/version_2-0/) We should be using REST almost exclusively, but this has some nice information on the various entities and on customizing Bullhorn.
  - [REST Login](http://developer.bullhorn.com/articles/getting_started) Information about getting started with Bullhorn REST APIs
  - [REST Documentation](http://developer.bullhorn.com/sites/default/files/BullhornRESTAPI_0.pdf) Extensive documentation on the REST APIs

There are several ways to customize Bullhorn through this repository, including:
   - REST triggers
   - Subscription-based scheduled tasks (asynchronous event handling)
   - Date Last Modified-based scheduled tasks

There are also several other ways to customize Bullhorn, but that are specific to the older UI/UX called 'S-Release'.  This functionality within the starter-kit-spring-maven is considered deprecated, and is subject to be removed with future releases:
   - Custom tabs/cards/menu actions (recommendation is to use the [extension-starter](https://github.com/bullhorn/extension-starter) for Bullhorn Novo)
   - Form scripts (starter-kit-spring-maven functionality removed, S-Release only)
   - Form triggers (deprecated, S-Release only)
   - Custom overview components (deprecated, S-Release only)
   - Custom edit components (deprecated, S-Release only)

The Starter Kit includes code for dealing with most of these methods of customization. Each of these is discussed below. One of the main concepts used for form triggers, REST triggers, and subscription-based scheduled tasks is the workflow, which is described first.

## Workflows
The concept of a workflow is based around the idea of implementing large amounts of custom business logic while maintaining readability and encapsulation.  The starter-kit's design for workflows has recently changed; this documentation describes the newer framework.  Workflows are no longer stored in separate XML files, but instead are entirely configured via JAVA code, as is common in more modern JAVA/Spring applications.  The general idea is to add Spring beans to the starter-kit's Application Context, and they will automatically be inserted into the correct workflow.  This is done by extending standard abstract classes and annotating them with `@Service`.  The classes one would extend are specific to the kind of workflow you want to add your business logic to, and themselves all extend from a comman base, the `WorkflowAction` class; for instance to add logic to the Placement Form Trigger, you would extends the `PlacementFormTriggerValidator` as below:
```java
@Service
public class ValidateSalary extends PlacementFormTriggerValidator {

	@Override
	public void validate(PlacementFormTriggerTraverser traverser) {
		//business logic
	}
	
}

```
By extending one of these classes, you are forced to implement an abstract method specific to the kind of workflow you're adding to (for REST Triggers and Form Triggers the method is `validate`, for Subscription Events the method is `handle`).  This method is where all business logic should be placed; complex logic can be handles through code design and deference to other Service classes.  Of note is an optional constructor present on all of these abstract classes that allows you to set a specific order to your business logic; the construtor accepts an `Integer`, with `-1` being the default (which would imply the code would get executed first).  If you always want a certain piece of logic to go last, simply provide a large number in the constructor and ensure you don't create other `WorkflowAction`s that have a larger order.

### Traversers
The various implementations of Traverser perform two main duties, providing an easy way to retrieve all information related to the entity being passed through the workflow, and maintaining state throughout the workflow. The Traverser object is the only thing any given `WorkflowAction` has access to by default (you can use Spring to ``@Autowired`` other service classes into your classes), and is passed from Action to Action as the workflow progresses. The implementations of Traverser themselves do not have a great deal of logic in them, but rather defer to a helper, which is a wrapper for the data being passed through the workflow. The Traverser interface itself is empty and serves as a common point of extension for building the various workflow classes. There are two main types of Traversers, classes extending ``com.client.core.base.workflow.traversing.TriggerTraverser`` (for form triggers and REST triggers) and those implementing ``com.client.core.scheduledtasks.workflow.traversing.ScheduledTasksTraverser``  (for subscription-based scheduled tasks).  Details around the implementations are in the Form Triggers and Subscription-Based Scheduled Tasks sections.

Of the two main types of Traversers, there will be an implementation for each entity that is valid for that type of Traverser, and similar implementations for the corresponding helper (i.e. there are TriggerTraversers for each entity that can have a Form Trigger or Rest Trigger applied to it, and ScheduledTasksTraversers for each entity that supports subscriptions).  The entity-specific implementations provide not only the entity being passed through the workflow, but also methods for retrieving each of the main associated entities. For Form Triggers there are methods to retrieve the form data itself, an instance of the entity the form represents populated with that form data, as well as the currently persisted entity. For example, on a PlacementFormTriggerTraverser's helper, you can expect methods like the following:
```java
 public Placement getNewEntity();

 public Placement getOldEntity();

 public FormPlacementDto getFormValues();

 public Candidate getCandidate();

 public Job getJob();

 public List<PlacemenCommission> getCommissions();

 ...
```

## REST Triggers
REST Triggers are similar to form triggers in that they allow you to customize how a record gets saved, but from various different places in the application as opposed to just on the standard edit/add pages for an entity.  Specifically, a REST Trigger gets called whenever a consumer of the REST API makes an add or update call and passes a URL parameter ``executeFormTriggers=true``.  At the time of this writing the only places in the application that will definitely call REST triggers are inline edits on list views as well as add/edits done in the mobile application.  Similar to Form Triggers, REST Triggers allow you to either stop the add/update being performed with a custom validation method, or you can change the value of a field or fields on the entity being saved.  Again similar to Form Triggers, the configuration of a REST Trigger involves providing a URL to BULLHORN which get's called when the corresponding action is performed.  The following REST Triggers are available for configuration:
   - Candidate (Add/Edit)
   - Client Contact (Add/Edit)
   - Client Corporation (Add/Edit)
   - Job Order (Add/Edit)
   - Placement (Add/Edit)
   - Note (Add/Edit)
   - Opportunity (Add/Edit)
   - Lead (Add/Edit)

The Starter Kit handles all REST Triggers in the same way...the controllers all live in `com.client.core.resttrigger.controller` and all work the same way.  Again, none of the code in this package should need to be modified.  The endpoints for each REST trigger are always the same, with the exception of your application's host name: `${host}/main/resttrigger/${entity}/${action}?apiKey=${apiKey}` where
  - ${host} is the domain host of your application
  - ${apiKey} is your Bullhorn API Key
  - ${action} is one of
    - add
    - edit
  - ${entity} is one of
    - candidate
    - clientcontact
    - clientcorporation
    - job
    - placement
    - note
    - lead
    - opportunity

To implement custom logic, you extends one of the `RestTriggerValidator` classes (a subclass of `WorkflowAction`), described above.  There is one abstract `RestTriggerValidator` class for each kind of entity (e.g. `PlacementRestTriggerValidator`).  Below are some specific details about the differences between RestTriggerTraversers and FormTriggerTraversers.

#### ${entityName}RestTriggerTraverser
The rest trigger implementations of `com.client.core.base.workflow.traversing.TriggerTraverser` are all pretty much the same, and in fact are very similar to the form trigger implementations (thus the common extension point).  Adding a form response is done the same way as you would for a form trigger (see [${entityName}FormTriggerTraverser](#${entityName}FormTriggerTraverser)).  Similarly the helper objects for REST triggers extend the same common entity-specific base that form triggers do, and thus we have one place where all related entity retrievel is done for any kind of trigger.

The REST Trigger-specific helper classes are considerably different than their form trigger counterparts, mainly due to the kind of request we receive from BULLHORN when a REST trigger is called.  Essentially when a REST trigger is called we only receive the fields that are being modified at that time, so for instance if a user edited status on a JobOrder from the list, and we had a REST trigger configured, we would receive a package roughly like

```json
    {
        "status": "Submitted"
    }
```

The helper objects handle this in two ways.  First, when `getNewEntity()` is called, you actually receive an instance of the entity with all current database values overwritten by whatever we receive from the request.  So for the example above, we would receive a fully populated JobOrder object with all existing data, and with status = "Submitted".  The other tool provided by helpers is done through an exposed method ``Set<String> getPopulatedFields()``, which returns the names of all fields that were actually passed in the request (and thus are being modified).  There is another method as well which essentially performs the same function, returning the entire JSON request passed as a JAVA Map: `Map<String, Object> getValuesChanged()`.  All other functionality provided by RestTriggerTraversers/Helpers is the same as their FormTrigger counterparts.

## Subscription-based scheduled tasks
Subscription events are one of the most powerful concepts available with the Bullhorn APIs.  The starter-kit implementation of them handles the API calls the standard way, described below, and then passes each event returned by those calls through the scheduled tasks workflow for the entity for which we received an event.

The first step in creating a subscription-based task is to subscribe to the types of events you want to consume.  The easiest way to do this is by using [SOAPUI](http://www.soapui.org/) along with the [SOAP documentation](http://developer.bullhorn.com/doc/version_2-0/#Operations/operation-eventsSubscribe.htm%3FTocPath%3DReference%7CCore%20Operations%7C_____12).  You essentially load the [WSDL](https://api.bullhornstaffing.com/webservices-2.5/?wsdl) into SOAP UI and then make a ``eventSubscribe`` call, passing the entity types and event types you wish to consume.

Once you have successfully created a subscription you should have a name for it which you provided in the ``eventsSubscribe`` call.  In the app, we want to open up ``src/main/resources/main-scheduledtasks.xml``, which contains the configuration for [Quartz](https://quartz-scheduler.org/).  Here we should see a Spring Bean named ``standardSubscriptionScheduledEventProcessing``, which takes a constructor-arg, the value of which is an application parameter, ``standardSubscriptionName``.  Similarly the Quartz configuration takes an app parameter ``standardCronExpression`` (and we want to uncomment the one bean that should be commented by default, in the list of triggers in the Quartz config.  Essentially this comment makes event handling turned off by default).  Both parameters can be found in the ``app-${mavenProfile}`` files (the proper properties file is loaded based on which Maven profile we run with).  We want to change the value of ``standardSubscriptionName`` to the name of the subscription we just created.  The ``standardCronExpression`` determines how often we ping Bullhorn for new events...the default is 5 minutes, but you can generate a new Cron Expression based on your requirements at [cronmaker.com](http://www.cronmaker.com/).

Having completed these steps, you are now ready to run your app and consume Bullhorn events.  Every time the Cron Expression we provided triggers, our application will ping Bullhorn asking for any new events for the subscription we created.  If it finds any, it will loop over them, sending each one through it's appropriate scheduled tasks workflow on a different thread.  All scheduled tasks are defined by extending the various `EventTask` classes (again a subclass of `WorkflowAction`).  There is one abstract `EventTask` class for each kind of entity (e.g. `PlacementEventTask`).  Similarly as with Form Triggers, any `EventTask` added to the Application Context for which the app receives an event will be called.  For instance, if we receive a 'Candidate UPDATE' event, the application will call all classes extending `CandidateEventTask`.

Below are some details about the particular implementations of ``com.client.core.base.workflow.traversing.Traverser`` used for Subscription-Based Scheduled Tasks.

#### ${entityName}ScheduledTasksTraverser
The implementations of ``com.client.core.scheduledtasks.workflow.traversing.ScheduledTasksTraverser`` are all essentially the same, the only differences being determined by the type of entity being passed through the workflow.  These differences are described in the general [Traversers](#traversers) section.  The functionality specific to subscription-based scheduled tasks is all handled in the  ``com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser`` and will always be the same.

Most of the functionality provided by the ScheduledTasksTraversers and associated helpers is relatively straightforward and includes utility method for finding other REST entities, checking if a particular field was updated on the event being processed, and retrieving the API Event object itself.  One particular piece of functionality of note deals with saving entities on events via the Bullhorn APIs.  We provide a method
```java
 public <T extends UpdateEntity> T getOneEntityToSave(T entity);
```
That should be used to perform updates on entities in a scheduled tasks workflow.  You pass in the entity  you are about to make modifications to, which the helper object then makes a deep copy of using [Kryo](https://github.com/EsotericSoftware/kryo) and holds onto in a Map, returning the deep copy.  Then, at the end of every scheduled tasks workflow, the code that executes each of your `EventTask`s will  loop through this map and perform an update call on each entity in it.  This allows you to make modifications to the same entity in different classes without making multiple API calls.  After calling ``getOneEntityToSave``, any modifications made to the object returned will in turn be made to the copy being held by the helper object.

## Date Last Modified-based scheduled tasks
In some cases it may make more sense to write a scheduled task that operates off of a Bullhorn record's `dateLastModified` property, as opposed to writing a subscription-based scheduled task.  An example of such a task would be one that runs every 5 minutes, and queries for JobOrder records that were added or updated in the last 5 minutes (i.e. where `dateLastModified > now() - 5 minutes`), and then performs some kind of business logic on them, perhaps updating an associated record such as the ClientContact.  In such cases the starter-kit provides a framework that handles the interactions with the REST APIs required to retrieve such records, as well as managing the scheduling of the tasks themselves.  

In order to write such a task, you would create a class (typically in `com.client.custom`, and annotated with `@Service`, so that it lives in the Spring Application Context) that extends the appropriate `${entityName}DateLastModifiedEventTask` (e.g. `JobOrderDateLastModifiedEventTask`).  Doing so will force you to implement a constructor that takes a few parameters:
   - `Integer intervalMinutes` - the number of minutes the task should look back to find new records, as well as how often it runs.  Required
   - `Set<String> fields` - the fields that should be returned/passed to the REST APIs.  Optional, defaults to "id"
   - `IncludeDateAdded includeDateAdded` - whether to also include dateAdded in the query the is constructed to pull records (i.e. the where clause gains an `OR dateAdded > now() - intervalMinutesAgo` term).  Optional, defaults to YES

Finally you will need to implement the method to execute your business logic.  This method is called `process` and takes one parameter, an instance of the entity that was modified (e.g. in our example above, it would take a `JobOrder` object), which will be populated with the fields passed in the `Set<String> fields` constructor parameter.

The framework itself runs every minute by default (controlled by the `date.last.modified.cron.expression` app parameter).  The `com.client.core.dlmtasks.DateLastModifiedEventProcessing` class and other related ones @Autowired all instances of any `${entityName}DateLastModifiedEventTask`s in the Spring Application Context at app startup.  Every minute it checks to see if any of those tasks should execute, and if so generates a `/query/` or `/search/` REST call using the properties passed in the class's constructor, and for each object returned it runs the `process` method.  It minimizes REST calls made by making them in batches whenever it can...if there are two `JobOrderDateLastModifiedEventTask`s that both run every 5 minutes, it will only make the REST calls needed once.  The first run of every task is determined by it's `intervalMinutes` property, and should occur at `intervalMinutes` past the hour, or any multiple of the value thereafter (e.g. in our example it would run at :05, :10, :15, whichever comes next after the app starts up)...specifically it runs when `now().getMinutesOfHours() % intervalMinutesAgo === 0`.  Subsequently the framework keeps track of the last time each task ran and uses that value to determine when each task should be executed.

## Form triggers (deprecated, S-Release only)
Form triggers are a way for you to customize how a record is saved in the Bullhorn CRM.  For each of the main entities, there is both an 'add' form trigger and an 'edit' form trigger. During the configuration of a given trigger, you provide a URL to Bullhorn that is called upon saving the form. Bullhorn passes all information on the form to the URL in the form of an HTTP POST request. The code receiving the request can reply in one of two ways, either stopping the save with a provided error message, or modifying the data that is about to be saved. The following form triggers are available for customization:
   - Candidate (Add/Edit)
   - Client Contact (Add/Edit)
   - Client Corporation (Add/Edit)
   - Job Order (Add/Edit)
   - Placement (Add/Edit)
   - Job Submission (Add/Edit)
   - Placement Change Request (Add AND Edit, only one trigger for both cases)
   - Note (Add)
   - Opportunity (Add/Edit)
   - Lead (Add/Edit)

The Starter Kit handles all form triggers in the same way. The endpoint controllers are all in the ``com.client.core.formtrigger.controller`` package and are all designed the same way. None of the code in this package requires modification. The endpoints for each form trigger are always the same, with the exception of your application's host name.  The endpoints are of the form: `` ${host}/main/formtrigger/${entity}/${action}?apiKey=${apiKey} ``, where
  - ${host} is the domain host of your application
  - ${apiKey} is your Bullhorn API Key
  - ${action} is one of
    - add
    - edit
  - ${entity} is one of
    - candidate (only for add, i.e. /candidate/add)
    - clientcontact (only for add, i.e. /clientcontact/add)
    - clientcontactcandidate (for edit, i.e. /clientcontactcandidate/edit)
    - clientcorporation
    - job
    - placement
    - jobsubmission
    - note (only for add, i.e. /note/add)
    - placementchangerequest (/placementchangerequest/add runs for both add and edit)

To implement custom logic, you must extend one of the various `FormTriggerValidator` classes (a subclass of `WorkflowAction`), generally described above.  There is one abstract `FormTriggerValidator` class for each kind of entity (e.g. `PlacementFormTriggerValidator`).  Below are some details about the particular implementations of ``com.client.core.base.workflow.traversing.Traverser`` used for Form Triggers.

##### ${entityName}FormTriggerTraverser
The form trigger implementations of ``com.client.core.base.workflow.traversing.TriggerTraverser`` are all essentially the same, the only differences being determined by the type of entity being passed through the workflow (The `TriggerTraverser` class is also used as an extension point for REST triggers).  These differences are described in the general [Traversers](#traversers) section.  The functionality provided by Bullhorn for form triggers is all handled in the ``com.client.core.base.workflow.traversing.AbstractTriggerTraverser`` and will always be the same.  There are two different types of responses we can provide to a form trigger, either an error response or a return values response, and both are handled using the ``Map<String, String> formResponse`` present in all TriggerTraversers.  Such Traversers provide utility methods to send back a response, either with ``public Map<String, String> getFormResponse()`` (and a subsequent `put` call) or ``public void addFormResponse(String key, String message)``.  The ``Map<String, String>`` is maintained throughout the workflow by the ValidationTraverser, and all entries added to it will be processed and sent back to Bullhorn by default, once all workflow logic is completed.

In order to add an error to the ``formResponse``, we add a Map Entry consisting of a key in the  form ``error:${someKey}`` and a value consisting of the error message itself, i.e.

```java
 traverser.addFormResponse("error:clientCorporationStatus", "Client Corporation cannot be saved in this status");
```
Note that each key provided to the response must be unique, since we use a ``java.util.Map`` to store our response.

In order to add a return value to the ``formResponse`` (i.e., to set a value on the entity being saved before persisting to the database), we add a Map Entry consisting of a key in the form ``returnvalue:${fieldToChange}`` and a value consisting of the value you which to set on the field. That is, the following code
```java
 traverser.addFormResponse("returnvalue:status", "Approved");
```
Will respond to Bullhorn telling it to set the status field to a value of 'Approved' before saving the entity.

## Form Scripts (functionality removed)
The functionality supporting Form Scripts in the starter-kit-spring-maven has been removed.  To view or obtain the old documentation or functionality, view an older commit/release of the starter-kit.


## Custom tabs (starter-kit-spring-maven functionality deprecated, use the [extension-starter](https://github.com/bullhorn/extension-starter))
In Bullhorn, Custom Tabs are what they sound like...they allow you to add custom content onto a tab of any of the main types of entities.  Configuration typically only consists of providing a URL endpoint that you wish to be iframed in the aforementioned tab, and consequently this allows for essentially any type of customization.  An additional parameter with the name ``displayHeight`` can be appended to the configured URL to determine the height of the iframe in the tab (see [SOAP documentation](http://developer.bullhorn.com/doc/version_2-0/#Understanding_Custom_Components.htm%3FTocPath%3DUser%20Interface%20Customization%7CCustom%20Components%2C%20Tabs%2C%20and%20Menu%20Actions%7C_____1) for more information).  Of note are the context variables provided by Bullhorn, always appended to the request URL as form-encoded parameters (case-sensitive):
  - EntityID - The ID of the entity being saved
  - EntityType - The type of entity being saved (i.e. Placement, Candidate)
  - UserID - The ID of the logged in internal CorporateUser saving the entity
  - CorporationID - The ID of the corporation the user is logged in with
  - PrivateLabelID - The ID of the private label the user is logged in with
  - currentBullhornUrl - The current URL of the Bullhorn window which contains our iframe

Due to the extremely large variety of possibilities with custom tabs, there is very little generic/boilerplate code in the starter-kit for them. However, one of the most common requirements is for a relatively simple to-many entity...essentially a table on a custom tab that acts as a UI for data attached to the main entity.  Typically the data for this table is stored in a cloud MySQL database, then when we hit the tab we query for the records specific to the one we're on using the passed EntityID parameter.

### Database Tables
To configure a cloud MySQL table, we use [Hibernate](http://hibernate.org/) and [JPA](http://www.oracle.com/technetwork/java/javaee/tech/persistence-jsp-140049.html), both provided by Maven.  Spring has some nice integration which we utilize, an example of which lives in ``src/main/resources/applicationContext.xml`` (see beans 'dataSource', 'entityManagerFactory', 'transactionManager').  [This article](http://www.baeldung.com/2011/12/13/the-persistence-layer-with-spring-3-1-and-jpa/) also details the necessary configuration well (we use XML configuration, not JAVA configuration).  The idea is that we provide standard JDBC connection parameters, typically via application properties.  Next steps include creating the Hibernate EntityManager bean which references the datasource and handles serialization between the database and JAVA.  Finally we create a JPA TransactionManager that handles the actual database transactions.  To use a domain class to represent a database table, we just let the EntityManager know what package(s) our domain classes live in (which should extends ``com.client.core.base.model.jpa.AbstractJpaEntity<ID>``), and Hibernate can even generate the tables for us.  Typically, we also add an instance of both ``com.client.core.base.dao.impl.StandardJpaDao`` and ``com.client.core.base.service.transaction.impl.StandardTransactionService`` to the applicationContext as well.  We provide the Dao with the type of domain object we want to perform database transactions on, and it gives us methods like ``add(T)`` and ``merge(T)`` to do those.  The transaction service is the same but also handles opening and closing transactions for each of the call, using Spring's JPA Integration `@Transactional` annotation.  An example domain class is below, although it by no means utilizes Hibernates/JPAs full potential.
```java
@Entity
@Table(name = "EXAMPLETABLENAME")
public class JpaExampleEntity extends AbstractJpaEntity<Integer> {

    private Integer id;
    private Date date;
    private String email;
    private String text;
    private BigDecimal number;
    private Integer digits;
    private String creditCard;
    private String url;
    private String password;
    private String selectValue;
    private Integer yesNo;

    public JpaExampleEntity() {
        super();
    }

    public JpaExampleEntity(Date date, String email, String text, BigDecimal number, Integer digits, String creditCard,
            String url, String password, String selectValue, Integer yesNo) {
        super();
        this.date = date;
        this.email = email;
        this.text = text;
        this.number = number;
        this.digits = digits;
        this.creditCard = creditCard;
        this.url = url;
        this.password = password;
        this.selectValue = selectValue;
        this.yesNo = yesNo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "number")
    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    @Column(name = "digits")
    public Integer getDigits() {
        return digits;
    }

    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    @Column(name = "creditcard")
    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "selectValue")
    public String getSelectValue() {
        return selectValue;
    }

    public void setSelectValue(String selectValue) {
        this.selectValue = selectValue;
    }

    @Column(name = "yesNo")
    public Integer getYesNo() {
        return yesNo;
    }

    public void setYesNo(Integer yesNo) {
        this.yesNo = yesNo;
    }
    ...
}
```
### jQuery datatables framework
After the database configuration, we have a table, an object representing it, and an object to perform database actions on the table using our object.  Assuming we want a relatively simple to-many entity, we can utilize the [jQuery](https://jquery.com/) [DataTables](http://datatables.net/) back-end and front-end framework present in the starter-kit.  The [javadocs](http://bullhorn.github.io/starter-kit-spring-maven/) provide detailed information about the different extension points, but the general idea is we extend ``com.client.core.datatables.controller.AbstractDataTablesController<T, ID>``, parameterizing by our domain class and the associated id, and being sure to call ``public void configureTable(TableConfiguration<T, ID> tableConfig)`` in our constructor.  We also extends ``com.client.core.datatables.service.JpaDataTablesService<T, ID>``, and provide our service to the controller.  We provide our service with the Dao we created previously, and we implement two methods that convert between our domain class and an instance of ``com.client.core.datatables.model.configuration.column.ColumnConfiguration``.  Of course, we will also want to make a JSP page under ``src/main/webapp/WEB-INF/jsp/main``, and provide the name of the file to the Controller.  You will most likely want to use a copy of ``src/main/webapp/WEB-INF/jsp/main/dataTables/simpleDataTables.jsp``, which contains the necessary jQuery code to render the table, using the endpoints provided by our Controller implementation.

## Custom overview components (deprecated, S-Release only)
Custom overview components allow us to customize the overview page of one of the main Bullhorn entities.  Similar to Custom Tabs, configuration involves providing a URL which gets iframed on the overview.  See [the SOAP documentation](http://developer.bullhorn.com/doc/version_2-0/#Understanding_Custom_Components.htm%3FTocPath%3DUser%20Interface%20Customization%7CCustom%20Components%2C%20Tabs%2C%20and%20Menu%20Actions%7C_____1) for some more information.  Again similar to Custom Tabs, Bullhorn provides some context information in the form of URL parameters appended to the base URL for the component.  They include
  - EntityID - The ID of the entity being saved
  - EntityType - The type of entity being saved (i.e. Placement, Candidate)
  - UserID - The ID of the logged in internal CorporateUser saving the entity
  - CorporationID - The ID of the corporation the user is logged in with
  - PrivateLabelID - The ID of the private label the user is logged in with
  
Custom components are available on the following entities:
  - Candidate
  - ClientCorporation
  - ClientContact
  - JobOrder
  - Lead
   
## Custom edit components (deprecated, S-Release only)
Custom Edit Components are again relatively similar to both Custom Tabs and Custom Components...Bullhorn allows us to provide an iframe URL which essentially acts as the Edit Type for a particular field (only certain fields can be used with Edit Components, the general rule-of-thumb is any customXXXXN field can be used).  Additionally, we can provide a height and a width in pixels that Bullhorn will use when creating the iframe.  The URL will be iframed on the edit tab for the entity which we configure it for, and we can pass a message to the edit tab from the iframe telling Bullhorn what value we want to set the field to.  The following function ``setValue(value)`` can be used from within the iframe to send the message to Bullhorn, which will set the field on the entity with the value passed in, and once the user saves will persist it to the database.  
```javascript
function getQueryStringParameter(href, paramName){
	var regexS = "[\\?&]"+ paramName +"=([^&#]*)";
	var regex = new RegExp( regexS );
	var results = regex.exec( href);
	if( results == null ){
		return "";
	} else {
		return results[1];
	}
}

function setValue(value) {
	var controlName = decodeURIComponent(getQueryStringParameter(location.href,"baseControlName"));
	var origin = decodeURIComponent(getQueryStringParameter(location.href,"currentBullhornUrl").replace(/\+/g, " "));
	
	window.parent.postMessage(JSON.stringify({name: controlName, value: value}), origin);
} 
```
Again, Bullhorn appends some URL parameters onto the iframe URL to provide some context:
  - EntityID - The ID of the entity being saved
  - EntityType - The type of entity being saved (i.e. Placement, Candidate)
  - UserID - The ID of the logged in internal CorporateUser saving the entity
  - CorporationID - The ID of the corporation the user is logged in with
  - PrivateLabelID - The ID of the private label the user is logged in with
  - baseControlName - The name of the field which the edit control is on.  Actually provides the 'name' property of the HTML input on the page, so it may not exactly match the field name (sometimes the fields are prefixed, like `candidate_customText1`)
  - value - The current value of the field
  - currentBullhornUrl - The current URL of the Bullhorn window which contains our iframe
