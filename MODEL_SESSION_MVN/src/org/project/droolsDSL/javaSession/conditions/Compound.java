package org.project.droolsDSL.javaSession.conditions;

public interface Compound extends Condition {

	public boolean evaluate();
    public int getCount();
    public int getSize();

}
