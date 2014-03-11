package org.project.droolsDSL.javaModel;

import org.project.droolsDSL.javaSession.SessionDescr;

public interface ModelDescr {
    public void add(String event, EffectDescr... effects);
    public abstract void clear();
    public void remove(String event, String... fluents);
    public SessionDescr getSession(FactorySessionDescr type);
}
