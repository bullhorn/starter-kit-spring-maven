package com.client.core.base.workflow.node.end;

import com.client.core.base.workflow.node.Node;
import com.client.core.base.workflow.traversing.Traverser;

/**
 * Ends a workflow.  Performs no logic and is simply meant as a logical
 * way to specify that workflow has completed.
 *
 * @author Sully
 */
public class EndNode<T extends Traverser> implements Node<T> {

	@Override
	public void start(T tasks) {
	}

}
