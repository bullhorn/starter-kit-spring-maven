package com.client.core.base.workflow.traversing;


/**
 * <p>
 *     Unparameterized interface to represent a wrapper of event information to be passed through a workflow.
 * </p>
 * <p>
 *      This class exists so other generic classes (such as {@link com.client.core.base.workflow.node.Node}) can interact
 *      with the various kinds of Traversers without knowing about event-specific or entity-specific information.
 * </p>
 */
public interface Traverser {

}
