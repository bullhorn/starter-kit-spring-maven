package com.client.core.formtrigger.workflow.node.conditional;

import com.client.core.base.workflow.node.conditional.Conditional;
import com.client.core.base.workflow.traversing.TriggerTraverser;

/**
 * Created by john.sullivan on 2/11/2015.
 */
public class IsEdit<T extends TriggerTraverser> extends Conditional<T> {

    @Override
    public void evaluate(T tasks) {
        if(tasks.isEdit()) {
            yes(tasks);
        } else {
            no(tasks);
        }
    }

}
