package com.client.core.base.workflow.node.conditional;


import com.client.core.base.workflow.node.Node;
import com.client.core.base.workflow.traversing.Traverser;

/**
 * An abstract type of {@link com.client.core.base.workflow.node.Node} providing a location
 * for business logic to be performed.  The business logic should represent a kind of boolean logic,
 * calling either {@link #yes(Traverser)} if the logic is true, or {@link #no(Traverser)} if it is false.
 * <br><br>
 * If neither {@link #yes(Traverser)} or {@link #no(Traverser)} is called, the workflow will end and no other
 * nodes will be called.
 * <br><br>
 * Beware of calling <b>both</b> {@link #yes(Traverser)} and {@link #no(Traverser)}, as both forks of the workflow will be
 * executed, i.e. <b>DO NOT</b> do the following:
 * <pre>
 * {@code if(businessLogic(tasks)) {
 *      yes(tasks);
 *   }
 *
 *   no(tasks);
 * }
 * </pre>
 *
 * @author Sully
 */
public abstract class Conditional<T extends Traverser> implements Node<T> {

	protected Node<T> yesNode;
	protected Node<T> noNode;

	public Conditional() {
	}

	@Override
	public final void start(T traverser) {
		evaluate(traverser);
	}

	protected abstract void evaluate(T tasks);

	protected final void yes(T traverser) {
		yesNode.start(traverser);
	}

	protected final void no(T traverser) {
		noNode.start(traverser);
	}

	public void setYesNode(Node<T> yesNode) {
		this.yesNode = yesNode;
	}

	public void setNoNode(Node<T> noNode) {
		this.noNode = noNode;
	}

}
