package com.client.core.formtrigger.workflow.node.conditional;

import com.client.core.formtrigger.workflow.traversing.ValidationTraverser;
import com.client.core.base.workflow.node.conditional.Conditional;

/**
 * Created by john.sullivan on 2/11/2015.
 */
public class IsEdit<T extends ValidationTraverser> extends Conditional<T> {

    @Override
    public void evaluate(T tasks) {
        if(tasks.isEdit()) {
            yes(tasks);
        } else {
            no(tasks);
        }
    }

}
