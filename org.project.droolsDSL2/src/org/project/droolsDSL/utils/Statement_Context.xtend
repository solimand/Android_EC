package org.project.droolsDSL.utils

import java.util.Map
import java.util.HashMap
import java.util.List
import java.util.ArrayList

class Statement_Context {
	var String eventName
	var String[] params
	
	var Map <String, Object[]> fluent_context = new HashMap<String, Object[]>()
	
	new (String event, String[] parameters, Map <String, Object[]> fluent_cont){
		this.eventName=event
		this.params=parameters
		this.fluent_context=fluent_cont
	}
	
	def getEventName(){
		return this.eventName
	}
	
	def String[] getParams(){
		return this.params
	}
	
	def String[] getFluents(){
		var List<String> fluents_res = new ArrayList<String>()
		for(entry:fluent_context.entrySet)
			fluents_res.add(entry.key)
		return fluents_res
	}
	
	def getExpression(String fluent){
		for (entry:fluent_context.entrySet){
			if (entry.key.equals(fluent))
				return entry.value.get(0) 
		}	
	}
	
	def getTime(String fluent){
		for (entry:fluent_context.entrySet){
			if (entry.key.equals(fluent))
				return entry.value.get(1) 
		}	
	}
	
	def getCondition(String fluent){
		for (entry:fluent_context.entrySet){
			if (entry.key.equals(fluent))
				if (entry.value.length>1)
					return entry.value.get(2) 
				else
					return null
		}	
	}
	
	
} 