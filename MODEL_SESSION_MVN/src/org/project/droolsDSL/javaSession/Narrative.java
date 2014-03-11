package org.project.droolsDSL.javaSession;

import java.util.Map;

public interface Narrative {
    void update(Event event, long time, Map<String, Value> parameters);
}
