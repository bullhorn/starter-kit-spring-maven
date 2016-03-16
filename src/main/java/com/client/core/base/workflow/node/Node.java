package com.client.core.base.workflow.node;

import com.client.core.base.workflow.traversing.Traverser;

/**
 * The interface for all Nodes in a work flow. 
 * start(tasks) is the entry point for each node.
 * 
 * The Thread safety of the Node work flow depends on the implementing classed being immutable. 
 * (See Effective Java 2nd Edition by Joshua Bloch for more details.)
 * 
 * To make sure the implementing class is immutable:
 * 1. Do NOT pass the Traverser or the event to an instance variable, since this will cancel out the Thread safety. 
 * 2. Do NOT provide any methods that modify the object's state.
 * 3. Ensure that the class can't be extended. (Simply make it final)
 * 4. If any instance variables are added make them final and private.
 *
 * @author Magnus
 */
public interface Node<T extends Traverser> {

    /**
     * Initalizes the business logic for this Node
     *
     * @param traverser the event data being passed through the workflow
     */
    public void start(T traverser);

}
