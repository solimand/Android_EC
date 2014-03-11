package org.project.droolsDSL.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class Statement_Context {
  private String eventName;
  
  private String[] params;
  
  private Map<String,Object[]> fluent_context = new Function0<Map<String,Object[]>>() {
    public Map<String,Object[]> apply() {
      HashMap<String,Object[]> _hashMap = new HashMap<String, Object[]>();
      return _hashMap;
    }
  }.apply();
  
  public Statement_Context(final String event, final String[] parameters, final Map<String,Object[]> fluent_cont) {
    this.eventName = event;
    this.params = parameters;
    this.fluent_context = fluent_cont;
  }
  
  public String getEventName() {
    return this.eventName;
  }
  
  public String[] getParams() {
    return this.params;
  }
  
  public String[] getFluents() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> fluents_res = _arrayList;
    Set<Map.Entry<String,Object[]>> _entrySet = this.fluent_context.entrySet();
    for (final Map.Entry<String,Object[]> entry : _entrySet) {
      String _key = entry.getKey();
      fluents_res.add(_key);
    }
    return ((String[])Conversions.unwrapArray(fluents_res, String.class));
  }
  
  public Object getExpression(final String fluent) {
    Set<Map.Entry<String,Object[]>> _entrySet = this.fluent_context.entrySet();
    for (final Map.Entry<String,Object[]> entry : _entrySet) {
      String _key = entry.getKey();
      boolean _equals = _key.equals(fluent);
      if (_equals) {
        Object[] _value = entry.getValue();
        return _value[0];
      }
    }
    return null;
  }
  
  public Object getTime(final String fluent) {
    Set<Map.Entry<String,Object[]>> _entrySet = this.fluent_context.entrySet();
    for (final Map.Entry<String,Object[]> entry : _entrySet) {
      String _key = entry.getKey();
      boolean _equals = _key.equals(fluent);
      if (_equals) {
        Object[] _value = entry.getValue();
        return _value[1];
      }
    }
    return null;
  }
  
  public Object getCondition(final String fluent) {
    Set<Map.Entry<String,Object[]>> _entrySet = this.fluent_context.entrySet();
    for (final Map.Entry<String,Object[]> entry : _entrySet) {
      String _key = entry.getKey();
      boolean _equals = _key.equals(fluent);
      if (_equals) {
        Object[] _value = entry.getValue();
        int _length = _value.length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          Object[] _value_1 = entry.getValue();
          return _value_1[2];
        } else {
          return null;
        }
      }
    }
    return null;
  }
}
