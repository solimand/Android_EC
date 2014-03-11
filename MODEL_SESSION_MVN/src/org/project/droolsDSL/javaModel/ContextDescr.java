package org.project.droolsDSL.javaModel;

public interface ContextDescr {
    public ConditionDescr getCondition();
    public ExpressionDescr getExpression();
    
    public String[] getParameters();
}
