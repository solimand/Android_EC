package org.project.droolsDSL.javaModel;

import java.util.Map;

import org.project.droolsDSL.javaSession.SessionDescr;

public interface FactorySessionDescr {
    public SessionDescr createSession(Map<String, Map<String, ContextDescr>> statements);
}
