package com.client.core.base.workflow.node.start;

import com.client.core.base.workflow.node.Node;
import com.client.core.base.workflow.traversing.Traverser;

/**
 * Initializes a workflow.  Simply calls {@link #start(Traverser)} on
 * the node provided as the nextNode
 *
 * @author Sully
 */
public class StartNode<T extends Traverser> implements Node<T> {

	protected Node<T> nextNode;

	@Override
	public final void start(T traverser) {
		next(traverser);
	}

	protected final void next(T traverser) {
		nextNode.start(traverser);
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

}
