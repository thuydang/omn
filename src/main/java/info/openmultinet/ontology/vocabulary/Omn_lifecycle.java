/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/robynloughnane/git/omnnew/playground-rspecs-ontology/omnlib/ontologies/omn-lifecycle.ttl 
 * @author Auto-generated by schemagen on 01 Sep 2015 12:45 
 */
public class Omn_lifecycle {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-lifecycle#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "2015-07-03";
    
    /** <p>That which is not currently implemented, but can potentially be implemented 
     *  by a resource, service, component or group.</p>
     */
    public static final ObjectProperty canBeImplementedBy = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#canBeImplementedBy" );
    
    /** <p>That which does not currently implement, but can potentially implement a resource, 
     *  service, component or group.</p>
     */
    public static final ObjectProperty canImplement = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#canImplement" );
    
    /** <p>A resource, component, group or serice which is a part of another.</p> */
    public static final ObjectProperty childOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#childOf" );
    
    /** <p>action of a state of a GENI operational state machine</p> */
    public static final ObjectProperty hasAction = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasAction" );
    
    /** <p>next state of a GENI operational state machine</p> */
    public static final ObjectProperty hasNext = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasNext" );
    
    /** <p>The state of the reservation.</p> */
    public static final ObjectProperty hasReservationState = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasReservationState" );
    
    /** <p>start state of a GENI operational state machine</p> */
    public static final ObjectProperty hasStartState = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasStartState" );
    
    /** <p>Has state.</p> */
    public static final ObjectProperty hasState = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasState" );
    
    /** <p>state name of a GENI operational state machine</p> */
    public static final ObjectProperty hasStateName = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasStateName" );
    
    /** <p>state type of a GENI operational state machine</p> */
    public static final ObjectProperty hasType = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasType" );
    
    /** <p>wait of a state of a GENI operational state machine</p> */
    public static final ObjectProperty hasWait = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasWait" );
    
    /** <p>Implementd by.</p> */
    public static final ObjectProperty implementedBy = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#implementedBy" );
    
    /** <p>Implements.</p> */
    public static final ObjectProperty implements_ = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#implements" );
    
    /** <p>is reservation state of</p> */
    public static final ObjectProperty isReservationStateOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#isReservationStateOf" );
    
    /** <p>is state of</p> */
    public static final ObjectProperty isStateOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#isStateOf" );
    
    /** <p>URI of service (e.g. AggregateManager) that manages the instantiation of childs 
     *  of a resource</p>
     */
    public static final ObjectProperty managedBy = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#managedBy" );
    
    /** <p>A resource, component, group or serice which encompasses another.</p> */
    public static final ObjectProperty parentOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#parentOf" );
    
    /** <p>a service is used by.</p> */
    public static final ObjectProperty serviceIsUsedBy = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#serviceIsUsedBy" );
    
    /** <p>Uses a service.</p> */
    public static final ObjectProperty usesService = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-lifecycle#usesService" );
    
    /** <p>GENI sliver info creation time</p> */
    public static final DatatypeProperty creationTime = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#creationTime" );
    
    /** <p>GENI sliver info creator URN</p> */
    public static final DatatypeProperty creator = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#creator" );
    
    /** <p>GENI sliver info expiration time</p> */
    public static final DatatypeProperty expirationTime = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#expirationTime" );
    
    /** <p>A specific authentification information for the management system</p> */
    public static final DatatypeProperty hasAuthenticationInformation = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasAuthenticationInformation" );
    
    /** <p>A unique identifier set by the management system</p> */
    public static final DatatypeProperty hasComponentID = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasComponentID" );
    
    /** <p>has component manager name</p> */
    public static final DatatypeProperty hasComponentManagerName = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasComponentManagerName" );
    
    /** <p>has component name</p> */
    public static final DatatypeProperty hasComponentName = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasComponentName" );
    
    /** <p>A unique identifier set by the management system</p> */
    public static final DatatypeProperty hasID = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasID" );
    
    /** <p>has link name</p> */
    public static final DatatypeProperty hasLinkName = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasLinkName" );
    
    /** <p>The original identifier set by the management system</p> */
    public static final DatatypeProperty hasOriginalID = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasOriginalID" );
    
    /** <p>has role</p> */
    public static final DatatypeProperty hasRole = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasRole" );
    
    /** <p>has sliver ID</p> */
    public static final DatatypeProperty hasSliverID = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasSliverID" );
    
    /** <p>has sliver name</p> */
    public static final DatatypeProperty hasSliverName = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#hasSliverName" );
    
    /** <p>GENI sliver info resource ID</p> */
    public static final DatatypeProperty resourceId = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#resourceId" );
    
    /** <p>GENI sliver info start time</p> */
    public static final DatatypeProperty startTime = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-lifecycle#startTime" );
    
    /** <p>GENI state action</p> */
    public static final OntClass Action = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Action" );
    
    /** <p>The related resource/service is actively performing an action</p> */
    public static final OntClass Active = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Active" );
    
    /** <p>The related resources/services are reserved</p> */
    public static final OntClass Allocated = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Allocated" );
    
    /** <p>The related resource/service has been cleaned</p> */
    public static final OntClass Cleaned = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Cleaned" );
    
    /** <p>A collection (group) of resources/services/groups confirmed to be allocated 
     *  for the user.</p>
     */
    public static final OntClass Confirmation = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Confirmation" );
    
    /** <p>The related resource/service is in an error state</p> */
    public static final OntClass Error = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Error" );
    
    /** <p>geni_failure</p> */
    public static final OntClass Failure = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Failure" );
    
    /** <p>The related resource/service has been initialized</p> */
    public static final OntClass Initialized = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Initialized" );
    
    /** <p>The related resource/service has been installed</p> */
    public static final OntClass Installed = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Installed" );
    
    /** <p>A collection (group) of resources/services/groups allocated for the user.</p> */
    public static final OntClass Manifest = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Manifest" );
    
    public static final OntClass Nascent = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Nascent" );
    
    public static final OntClass NotReady = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#NotReady" );
    
    /** <p>The related resource/service are not yet active/ready</p> */
    public static final OntClass NotYetInitialized = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#NotYetInitialized" );
    
    /** <p>A collection (group) of services and resources provided by an Infrastructure. 
     *  The collection is the result of the application of Policies.</p>
     */
    public static final OntClass Offering = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Offering" );
    
    public static final OntClass Opstate = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Opstate" );
    
    /** <p>The related resource/service is not yet provisioned</p> */
    public static final OntClass Pending = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Pending" );
    
    /** <p>The related resource/service is currently configuring</p> */
    public static final OntClass Preinit = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Preinit" );
    
    /** <p>The related resources/services are provisioned</p> */
    public static final OntClass Provisioned = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Provisioned" );
    
    /** <p>The related resource/service is ready</p> */
    public static final OntClass Ready = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Ready" );
    
    /** <p>geni_reload</p> */
    public static final OntClass Reload = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Reload" );
    
    /** <p>The related resource/service gets removed</p> */
    public static final OntClass Removing = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Removing" );
    
    /** <p>A collection (group) of resources/services/groups requested by the user</p> */
    public static final OntClass Request = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Request" );
    
    /** <p>The current state of a reservation</p> */
    public static final OntClass ReservationState = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#ReservationState" );
    
    /** <p>geni_restart</p> */
    public static final OntClass Restart = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Restart" );
    
    /** <p>geni_start</p> */
    public static final OntClass Start = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Start" );
    
    /** <p>The related resource/service has been started</p> */
    public static final OntClass Started = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Started" );
    
    /** <p>The current state of the resource, service or group</p> */
    public static final OntClass State = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#State" );
    
    /** <p>geni_stop</p> */
    public static final OntClass Stop = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Stop" );
    
    /** <p>The related resource/service is stopped</p> */
    public static final OntClass Stopped = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Stopped" );
    
    /** <p>The related resource/service is stopping</p> */
    public static final OntClass Stopping = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Stopping" );
    
    /** <p>geni_success</p> */
    public static final OntClass Success = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Success" );
    
    /** <p>The related resources/services are not reserved</p> */
    public static final OntClass Unallocated = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Unallocated" );
    
    /** <p>The related resource/service is not complete</p> */
    public static final OntClass Uncompleted = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Uncompleted" );
    
    /** <p>geni_update_users</p> */
    public static final OntClass UpdateUsers = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#UpdateUsers" );
    
    /** <p>geni_update_users_cancel</p> */
    public static final OntClass UpdateUsersCancel = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#UpdateUsersCancel" );
    
    /** <p>The related resource/service is getting updated</p> */
    public static final OntClass Updating = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Updating" );
    
    /** <p>geni_updating_users</p> */
    public static final OntClass UpdatingUsers = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#UpdatingUsers" );
    
    /** <p>GENI state wait</p> */
    public static final OntClass Wait = m_model.createClass( "http://open-multinet.info/ontology/omn-lifecycle#Wait" );
    
}