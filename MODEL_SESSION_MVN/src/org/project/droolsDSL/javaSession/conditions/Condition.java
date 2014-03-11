package org.project.droolsDSL.javaSession.conditions;

public interface Condition {

    public void follow(Condition condition);
    public boolean holds();
    public void update(Condition condition);
    public void handle(boolean value);

}
