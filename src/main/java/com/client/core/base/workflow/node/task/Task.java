package com.client.core.base.workflow.node.task;

import com.client.core.base.workflow.node.Node;
import com.client.core.base.workflow.traversing.Traverser;

/**
 * An abstract type of {@link com.client.core.base.workflow.node.Node} providing a location
 * for business logic to be performed.  The business logic should perform an action
 * and other nodes in the workflow should be independent of said logic.
 *
 * @author Magnus
 */
public abstract class Task<T extends Traverser> implements Node<T> {

	protected Node<T> nextNode;

	public Task() {
		super();
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public final void start(T traverser) {
		handle(traverser);
		next(traverser);
	}

    /**
     * Performs the business logic for this task.  Is called
     * as part of the workflow, then the next node is called immediately after.
     *
     * @param tasks the event data being passed through the workflow
     */
	protected abstract void handle(T tasks);

	private final void next(T traverser) {
		nextNode.start(traverser);
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

}
