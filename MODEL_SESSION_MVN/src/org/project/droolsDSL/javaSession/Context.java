package org.project.droolsDSL.javaSession;

import org.project.droolsDSL.javaSession.expressions.Expression;

public interface Context {
    public Expression getExpression();    
    public String[] getParameters();
}
