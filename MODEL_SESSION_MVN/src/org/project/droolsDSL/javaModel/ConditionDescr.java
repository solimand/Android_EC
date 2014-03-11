package org.project.droolsDSL.javaModel;

import org.project.droolsDSL.javaSession.ConditionVisitor;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;

public interface ConditionDescr {
    public boolean validate(String[] parameters);
    
    public ConditionImpl accept(ConditionVisitor exprVisitor);

}
