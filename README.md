# Bullhorn Starter Kit (Spring Boot/Maven)

The Bullhorn Starter Kit is a collection of Java code that lets you integrate custom business logic with the Bullhorn CRM application. The code itself is 100% boilerplate and should require no modification, but rather is designed for plugging in your own classes or extending existing ones. The following technologies are required:
1. [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. [Maven 3](https://maven.apache.org/download.cgi)

Run ``mvn clean install`` to generate a deployable WAR file in the target folder. You can also deploy to a local Tomcat 7 container provided by Maven by running ``mvn clean tomcat7:run -P${mavenProfile}``, effectively running your application locally. If you want to skip unit tests, pass the flag ``-DskipTests``. See the [javadoc](http://bullhorn.github.io/starter-kit-spring-maven/) for class and method-level documentation.

The application uses [Spring Boot Framework](https://spring.io/projects/spring-boot) extensively,  but Maven handles all dependencies. These are some other useful links around Bullhorn APIs:
- [Bullhorn Developer](https://bullhorn.github.io/docs/) General developer documentation
- [SOAP Documentation](https://kb.bullhorn.com/soapapi/Content/index.htm) We should be using REST almost exclusively, but this has some nice information on the various entities and on customizing Bullhorn.
- [REST Login](http://bullhorn.github.io/Getting-Started-with-REST/) Information about getting started with Bullhorn REST APIs
- [REST Documentation](http://bullhorn.github.io/rest-api-docs/) Extensive documentation on the REST APIs
- [SDK REST Library](https://github.com/bullhorn/sdk-rest) Bullhorn domain

There are several ways to customize Bullhorn through this repository, including:
- REST triggers
- Subscription-based scheduled tasks (asynchronous event handling)
- Date Last Modified-based scheduled tasks



The Starter Kit includes code for dealing with most of these methods of customization. Each of these is discussed below. One of the main concepts used for REST triggers, and subscription-based scheduled tasks is the workflow, which is described first.

## Workflows
The concept of a workflow is based around the idea of implementing large amounts of custom business logic while maintaining readability and encapsulation.  The starter-kit's design for workflows has recently changed; this documentation describes the newer framework.  Workflows are no longer stored in separate XML files, but instead are entirely configured via JAVA code, as is common in more modern JAVA/Spring applications.  The general idea is to add Spring beans to the starter-kit's Application Context, and they will automatically be inserted into the correct workflow.  This is done by extending standard abstract classes and annotating them with `@Service`.  The classes one would extend are specific to the kind of workflow you want to add your business logic to, and themselves all extend from a common base, the `WorkflowAction` class; for instance to add logic to the Placement REST Trigger, you would extend the `PlacementRestTriggerValidator` as below:
```java
@Service
public class ValidateSalary extends PlacementFormTriggerValidator {
    private final static Map<PlacementRelatedEntity, Set<String>> FIELDS = ImmutableMap.<PlacementRelatedEntity, Set<String>>builderr()
            .build();

    public ValidateSalary() {
        super(FIELDS);
    }
  
	@Override
	public void validate(PlacementFormTriggerTraverser traverser) {
		//business logic
	}
	
}

```
By extending one of these classes, you are forced to implement an abstract method specific to the kind of workflow you're adding to (for REST Triggers and Form Triggers the method is `validate`, for Subscription Events the method is `handle`).  This method is where all business logic should be placed; complex logic can be handles through code design and deference to other Service classes.

#### Querying fields through helper
There's a required constructor parameter ``relatedEntityFields`` that controls the fields that will be queried automatically for you when using the ``TriggerHelper`` implementation specific to your ``WorkflowAction``.
For example, continuing from the previous example, say you need the date of birth of the candidate associated with the placement, you can easily do:
```java
@Service
public class ValidateSalary extends PlacementRestTriggerValidator {
    private final static Map<PlacementRelatedEntity, Set<String>> FIELDS = ImmutableMap.<PlacementRelatedEntity, Set<String>>builder()
            .put(PlacementRelatedEntity.CANDIDATE, Sets.newHashSet("dateOfBirth"))
            .build();

    public ValidateSalary() {
        super(FIELDS);
    }

    @Override
    public void validate(PlacementRestTriggerTraverser traverser) {
        // dateOfBirth will be queried by the helper when calling the REST API through the helper.
        DateTime dateOfBirth = traverser.getTriggerHelper().getCandidate().getDateOfBirth();
    }
}
```
See the `com.client.core.base.model.relatedentity` package for details on the default fields per entity, as well as related entity's fields.  
Additionally, there is an optional constructor parameter present on all of these abstract classes that allows you to set a specific order to your business logic; the construtor accepts an `Integer`, with `-1` being the default (which would imply the code would get executed first).  If you always want a certain piece of logic to go last, simply provide a large number in the constructor and ensure you don't create other `WorkflowAction`s that have a larger order.
Note that the fields are only queried when queried through the helper, so for example, the following will not work:
```java
@Service
public class ValidateSalary extends PlacementRestTriggerValidator {
    private final static Map<PlacementRelatedEntity, Set<String>> FIELDS = ImmutableMap.<PlacementRelatedEntity, Set<String>>builder()
            .put(PlacementRelatedEntity.CANDIDATE, Sets.newHashSet("dateOfBirth"))
            .build();

    public ValidateSalary() {
        super(FIELDS);
    }

    @Override
    public void validate(PlacementRestTriggerTraverser traverser) {
        // dateOfBirth will be null because it was not queried
        DateTime dateOfBirth = traverser.getTriggerHelper().getPlacement().getCandidate().getDateOfBirth();
    }
}
```
In the example above, the `dateOfBirth` field will not be queried because we are getting to the Candidate instance through the Placement, and not through the TriggerHelper.
The general rule of thumb is to use the TriggerHelper as much as you can to get the entities you need with the fields you require to perform business logic on them.

### Traversers
The various implementations of Traverser perform two main duties, providing an easy way to retrieve all information related to the entity being passed through the workflow, and maintaining state throughout the workflow.
The Traverser object is the only thing any given `WorkflowAction` has access to by default (you can use Spring to ``@Autowired`` other service classes into your classes), and is passed from Action to Action as the workflow progresses.
The implementations of Traverser themselves do not have a great deal of logic in them, but rather defer to a helper, which is a wrapper for the data being passed through the workflow.
The Traverser interface itself is empty and serves as a common point of extension for building the various workflow classes. There are two main types of Traversers, classes extending ``com.client.core.base.workflow.traversing.TriggerTraverser`` (REST triggers) and those implementing ``com.client.core.scheduledtasks.workflow.traversing.ScheduledTasksTraverser``  (for subscription-based scheduled tasks).  Details around the implementations are in the Form Triggers and Subscription-Based Scheduled Tasks sections.

Of the two main types of Traversers, there will be an implementation for each entity that is valid for that type of Traverser, and similar implementations for the corresponding helper (i.e. there are TriggerTraversers for each entity that can have a REST Trigger applied to it, and ScheduledTasksTraversers for each entity that supports subscriptions).  The entity-specific implementations provide not only the entity being passed through the workflow, but also methods for retrieving each of the main associated entities. For example, on a PlacementRestTriggerTraverser's helper, you can expect methods like the following:
```java
 public Placement getNewEntity();

 public Placement getOldEntity();

 public Candidate getCandidate();

 public JobOrder getJobOrder();

 public List<PlacemenCommission> getCommissions();

 ...
```

## REST Triggers
REST Triggers are webhooks that allow you to customize how a record gets saved or perform any pre-save validation, from various different places in the application as opposed to just on the standard edit/add pages for an entity. Specifically, a REST Trigger gets called whenever a consumer of the REST API makes an add or update call and passes a URL parameter ``executeFormTriggers=true``.  

REST Triggers allow you to either stop the add/update being performed with a custom validation method, or you can change the value of a field or fields on the entity being saved.  The configuration of a REST Trigger involves providing a URL to BULLHORN which get's called when the corresponding action is performed.  The following REST Triggers are available for configuration:
- Candidate (Add/Edit)
- Candidate Reference (Add/Edit)
- Candidate Certification (Add/Edit)
- Candidate Certification Requirement (Add/Edit)
- Candidate Work History (Add/Edit)
- Client Contact (Add/Edit)
- Client Corporation (Add/Edit)
- Client Corporation Custom Objects 1-10 (Add/Edit)
- Job Order (Add/Edit)
- Job Shift (Add/Edit)
- Job Order Custom Objects 1-10 (Add/Edit)
- Job Submission (Add/Edit)
- Job Shift Submission (Add/Edit)
- Job Submission Certification Requirement (Add/Edit)
- Placement (Add/Edit)
- Placement Custom Objects 1-10 (Add/Edit)
- Placement Certification (Add/Edit)
- Note (Add/Edit)
- Opportunity (Add/Edit)
- Opportunity Custom Objects 1-10 (Add/Edit)
- Lead (Add/Edit)
- Person Custom Objects 1-10 (Add/Edit) (These can be associated to Candidates and Client Contacts)

The Starter Kit handles all REST Triggers in the same way...the controllers all live in `com.client.core.resttrigger.controller` and all work the same way.  Again, none of the code in this package should need to be modified.  The endpoints for each REST trigger are always the same, with the exception of your application's host name: `${host}/main/resttrigger/${entity}/${action}?apiKey=${apiKey}` where
- ${host} is the domain host of your application
- ${apiKey} is your Bullhorn API Key
- ${action} is one of
  - add
  - edit
- ${entity} is one of
  - candidate
  - candidatereference
  - candidateworkhistory
  - clientcontact
  - clientcorporation
  - job
  - jobsubmission
  - placement
  - note
  - lead
  - opportunity

To implement custom logic, you extend one of the `RestTriggerValidator` classes (a subclass of `WorkflowAction`), described above.  There is one abstract `RestTriggerValidator` class for each kind of entity (e.g. `PlacementRestTriggerValidator`).  
Below are some specific details about RestTriggerTraversers.

#### ${entityName}RestTriggerTraverser
The REST trigger implementations of `com.client.core.base.workflow.traversing.TriggerTraverser` are all essentially the same, the only differences being determined by the type of entity being passed through the workflow. These differences are described in the general [Traversers](#traversers) section. The functionality provided by Bullhorn for REST triggers is all handled in the `com.client.core.base.workflow.traversing.AbstractTriggerTraverser` and will always be the same. There are two different types of responses we can provide to a REST trigger, either an error response or a return values response, and both are handled using the `Map<String, String> formResponse` present in all `TriggerTraverser`s. Such `Traverser`s provide utility methods to send back a response, either with `public Map<String, String> getFormResponse()` (and a subsequent put call) or `public void addFormResponse(String key, String message)`. The `Map<String, String>` is maintained throughout the workflow by the `TriggerTraverser`, and all entries added to it will be processed and sent back to Bullhorn by default, once all workflow logic is completed.

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


When a REST trigger is called we only receive the fields that are being modified at that time, so for instance if a user edited status on a JobOrder from the list, and we had a REST trigger configured, we would receive a package roughly like

```json
    {
        "status": "Submitted"
    }
```

The helper objects handle this in two ways.  First, when `getNewEntity()` is called, you actually receive an instance of the entity with all current database values that were queried (See [Querying fields through helper](#querying-fields-through-helper)) for the fields  overwritten by whatever we receive from the request.  So for the example above, we would receive a partially populated JobOrder object with all existing data, and with status = "Submitted".  The other tool provided by helpers is done through an exposed method ``Set<String> getPopulatedFields()``, which returns the names of all fields that were actually passed in the request (and thus are being modified).  There is another method as well which essentially performs the same function, returning the entire JSON request passed as a JAVA Map: `Map<String, Object> getValuesChanged()`.

## Subscription-based scheduled tasks
Subscription events are one of the most powerful concepts available with the Bullhorn APIs.  The starter-kit implementation of them handles the API calls the standard way, described below, and then passes each event returned by those calls through the scheduled tasks workflow for the entity for which we received an event.

The first step in creating a subscription-based task is to subscribe to the types of events you want to consume.  The easiest way to do this is by using [SOAPUI](http://www.soapui.org/) along with the [SOAP documentation](http://developer.bullhorn.com/doc/version_2-0/#Operations/operation-eventsSubscribe.htm%3FTocPath%3DReference%7CCore%20Operations%7C_____12).  You essentially load the [WSDL](https://api.bullhornstaffing.com/webservices-2.5/?wsdl) into SOAP UI and then make a ``eventSubscribe`` call, passing the entity types and event types you wish to consume.  
Alternatively, you can use [Postman](https://www.postman.com/downloads/) or the HTTP client of your choice along with the [REST documentation](http://bullhorn.github.io/rest-api-docs/index.html#put-event-subscription) to subscribe using the `/event/subscription` endpoint.

Once you have successfully created a subscription you should have a name for it which you provided in the ``event/subscription`` call.  In the app, we want to open up ``src/main/resources/application.properties``, and scroll down to the section where you will find a section with properties of prefix `scheduledtasks.customSubscriptions`. Here you will add a new property with the prefix `scheduledtasks.customSubscriptions`, and the name of the property will be the subscription name you created, and the value will be the cron expression which you can generate based on your requirements at [cronmaker.com](http://www.cronmaker.com/).

#### Example
Say you created a subscription called `my_test_subscription` that listens to Candidate UPDATED and INSERTED events, and want to poll events every 5 minutes.
After you create your EventTask, all you need to do to tell the application to poll for your newly created subscription every 5 minutes is to add the following line to your application.properties:
```properties
scheduledtasks.customSubscriptions.my_test_subscription=0 0/5 * 1/1 * ? *
```
And you're set. The application on startup will read every property under the scheduledtasks.customSubscriptions prefix and create the necessary triggers for the Quartz scheduler to invoke when the provided cron expression triggers.

Having completed these steps, you are now ready to run your app and consume Bullhorn events.  Every time the Cron Expression we provided triggers, our application will ping Bullhorn asking for any new events for the subscription we created.  If it finds any, it will loop over them, sending each one through it's appropriate scheduled tasks workflow on a different thread.  All scheduled tasks are defined by extending the various `EventTask` classes (again a subclass of `WorkflowAction`).  There is one abstract `EventTask` class for each kind of entity (e.g. `PlacementEventTask`).  Similarly as with REST Triggers, any `EventTask` added to the Application Context for which the app receives an event will be called.  For instance, if we receive a 'Candidate UPDATE' event, the application will call all classes extending `CandidateEventTask`.

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

Finally, you will need to implement the method to execute your business logic.  This method is called `process` and takes one parameter, an instance of the entity that was modified (e.g. in our example above, it would take a `JobOrder` object), which will be populated with the fields passed in the `Set<String> fields` constructor parameter.

The framework itself runs every minute by default (controlled by the `date.last.modified.cron.expression` app parameter).  The `com.client.core.dlmtasks.DateLastModifiedEventProcessing` class and other related ones @Autowired all instances of any `${entityName}DateLastModifiedEventTask`s in the Spring Application Context at app startup.  Every minute it checks to see if any of those tasks should execute, and if so generates a `/query/` or `/search/` REST call using the properties passed in the class's constructor, and for each object returned it runs the `process` method.  It minimizes REST calls made by making them in batches whenever it can...if there are two `JobOrderDateLastModifiedEventTask`s that both run every 5 minutes, it will only make the REST calls needed once.  The first run of every task is determined by it's `intervalMinutes` property, and should occur at `intervalMinutes` past the hour, or any multiple of the value thereafter (e.g. in our example it would run at :05, :10, :15, whichever comes next after the app starts up)...specifically it runs when `now().getMinutesOfHours() % intervalMinutesAgo === 0`.  Subsequently the framework keeps track of the last time each task ran and uses that value to determine when each task should be executed.

## Nightly Tasks (Cron Jobs)
Cron Jobs are arbitrary code you want to be executed in an interval or at specific times. These differ from a Scheduled Task in the sense that Scheduled Tasks execute in an interval to query a subscription.
In fact, DLM tasks are a cron job under the hood, that queries some records and processes them according to the workflow.

Cron Jobs allow you to have any kind of cleanup task you require to do. In previous version, the standard was to declare cron triggers in the main-scheduledtasks.xml file.
Now, given that XML based configurations are discouraged and the file has been removed, the recommended option is to simply annotate the method in your class you want executed in the interval with the `org.springframework.scheduling.annotation.Scheduled` annotation.
The method that's annotated should be simple, accepting no arguments and returning void. You can create a cron expression in cronmaker.com, too.
Example:
```java
import org.springframework.scheduling.annotation.Scheduled;

public class MyCronJob {

    @Scheduled(cron = "0 0/5 * 1/1 * ? *")
    public void execute() {
        // This code will execute very 5 minutes on the minute
    }

}
```

## Database Tables
To configure a cloud MySQL table, we use [Hibernate](http://hibernate.org/) and [JPA](http://www.oracle.com/technetwork/java/javaee/tech/persistence-jsp-140049.html), both provided by Maven.  Spring has some nice integration which we utilize, an example of which lives in ``src\main\java\com\client\config\JpaConfig.java``.  The idea is that we provide standard JDBC connection parameters, typically via application properties.  Next steps include creating the Hibernate EntityManager bean which references the datasource and handles serialization between the database and JAVA.  Finally we create a JPA TransactionManager that handles the actual database transactions.  To use a domain class to represent a database table, we just let the EntityManager know what package(s) our domain classes live in (which should extends ``com.client.core.base.model.jpa.AbstractJpaEntity<ID>``), and Hibernate can even generate the tables for us.  Typically, we also add an instance of both ``com.client.core.base.dao.impl.StandardJpaDao`` and ``com.client.core.base.service.transaction.impl.StandardTransactionService`` to the applicationContext as well.  We provide the Dao with the type of domain object we want to perform database transactions on, and it gives us methods like ``add(T)`` and ``merge(T)`` to do those.  The transaction service is the same but also handles opening and closing transactions for each of the call, using Spring's JPA Integration `@Transactional` annotation.  An example domain class is below, although it by no means utilizes Hibernates/JPAs full potential.
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
