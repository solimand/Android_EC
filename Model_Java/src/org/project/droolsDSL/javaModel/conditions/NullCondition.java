package org.project.droolsDSL.javaModel.conditions;

import org.project.droolsDSL.javaModel.ConditionDescr;
import org.project.droolsDSL.javaSession.ConditionVisitor;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;

public class NullCondition implements ConditionDescr {

	 private static ConditionDescr instance;

     public static ConditionDescr getInstance() {
             if (instance == null)
                     instance = new NullCondition();
             return instance;
     }

     private NullCondition() {}

     @Override
     public boolean validate(String[] parameters) {
             return true;
     }

     @Override
     public String toString() {
             return "";
     }

	@Override
	public ConditionImpl accept(ConditionVisitor condVisitor) {
		return condVisitor.visit(this);
	}
}
