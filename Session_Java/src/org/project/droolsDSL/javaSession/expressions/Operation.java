package org.project.droolsDSL.javaSession.expressions;

import org.project.droolsDSL.javaSession.Value;

public interface Operation extends Expression {
    public Value evaluate(Value val1, Value val2);
}
