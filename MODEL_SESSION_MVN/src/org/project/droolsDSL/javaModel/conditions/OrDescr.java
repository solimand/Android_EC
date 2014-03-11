package org.project.droolsDSL.javaModel.conditions;

import java.util.Iterator;

import org.project.droolsDSL.javaModel.ConditionDescr;
import org.project.droolsDSL.javaSession.ConditionVisitor;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;

public class OrDescr extends CompoundDescr implements ConditionDescr {

	@Override
    public String toString() {
        String result = "";
        Iterator<ConditionDescr> iterator = iterator();
        while (iterator.hasNext()) {
            if (!result.isEmpty())
                    result += " | ";
            result += iterator.next();
        }
        return result;
    }

	@Override
	public ConditionImpl accept(ConditionVisitor condVisitor) {
		return condVisitor.visit(this);
	}

}
