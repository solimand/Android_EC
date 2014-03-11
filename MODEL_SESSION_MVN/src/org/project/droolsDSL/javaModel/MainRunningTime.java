package org.project.droolsDSL.javaModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.project.droolsDSL.JavaUtils.PrintMapOfMapOfMap;
import org.project.droolsDSL.javaModel.conditions.NullCondition;
import org.project.droolsDSL.javaModel.expressions.NumberDescr;
import org.project.droolsDSL.javaSession.Collector;
import org.project.droolsDSL.javaSession.CollectorImpl;
import org.project.droolsDSL.javaSession.ContextImplSession;
import org.project.droolsDSL.javaSession.Event;
import org.project.droolsDSL.javaSession.EventImpl;
import org.project.droolsDSL.javaSession.FactorySessionImpl;
import org.project.droolsDSL.javaSession.Fluent;
import org.project.droolsDSL.javaSession.Narrative;
import org.project.droolsDSL.javaSession.NarrativeImpl;
import org.project.droolsDSL.javaSession.Sensor;
import org.project.droolsDSL.javaSession.SensorImpl;
import org.project.droolsDSL.javaSession.SessionImpl;
import org.project.droolsDSL.javaSession.conditions.Condition;
import org.project.droolsDSL.javaSession.expressions.Sample;

public class MainRunningTime {
	
	/**Events/Fluent/Action for rule definition*/
	private static final String INSERT_TXT_EVENT = "InsertTxt"; 
	private static final String MSG_FLUENT = "MSG"; 
	private static final String MSG_ACTION_1 = "YEAH*1";
	private static final String MSG_ACTION_2 = "YEAH*2";
	private static final String MSG_ACTION_3 = "YEAH*3";

	public static void main(String[] args) {
		

	/*________MODEL________*/
		
        ModelDescr model = new ModelImpl();
/*         
        model.add("TurnOn", new EffectImpl("Switch", new ContextImpl(
                        new String[0], new NumberDescr(1), NullCondition.getInstance())));
       
        model.add("TurnOn", new EffectImpl("Light", new ContextImpl(
                        new String[0], new NumberDescr(1), new SameDescr(
                                        new SampleDescr("Battery"), new NumberDescr(1)))));
        
        model.add("TurnOff", new EffectImpl("Switch", new ContextImpl(
                        new String[0], new NumberDescr(0), NullCondition.getInstance())));
        
        model.add("TurnOff", new EffectImpl("Light", new ContextImpl(
                        new String[0], new NumberDescr(0), NullCondition.getInstance())));
      
        model.add("PowerOn", new EffectImpl("Battery", new ContextImpl(
                        new String[0], new NumberDescr(1), NullCondition.getInstance())));
       
        model.add("PowerOn", new EffectImpl("Light", new ContextImpl(
                        new String[0], new NumberDescr(1), new SameDescr(
                                        new SampleDescr("Light"), new NumberDescr(1)))));
        
        model.add("PowerOn", new EffectImpl("Light", new ContextImpl(
                new String[0], new NumberDescr(1), new SameDescr(
                                new NumberDescr(2), new NumberDescr(1)))));
        
        model.add("PowerOff", new EffectImpl("Battery", new ContextImpl(
                        new String[0], new NumberDescr(0), NullCondition.getInstance())));
        
        model.add("PowerOff", new EffectImpl("Light", new ContextImpl(
                        new String[0], new NumberDescr(0), NullCondition.getInstance())));
  
       
        model.add("GO_Away", new EffectImpl("ScreenOff", new ContextImpl(
                new String[0], new NumberDescr(1), NullCondition.getInstance())), 
                			new EffectImpl("CamOff", new ContextImpl(
                					new String[0], new NumberDescr(1), NullCondition.getInstance())));
        model.add("COME_Back", new EffectImpl("ScreenOn", new ContextImpl(
                new String[0], new NumberDescr(1), NullCondition.getInstance())));
*/                		
        
        model.add("InsertTxt", new EffectImpl("MSG", new ContextImpl(
                new String[0], new NumberDescr(2), NullCondition.getInstance())));
        
        
        
        System.out.println(model.toString());

        System.out.println("\nDefinition of problem --> DONE");
            
    /*________SESSION________*/
        
        FactorySessionDescr factorySess = new FactorySessionImpl();
        SessionImpl session = (SessionImpl) model.getSession(factorySess);
        
        System.out.println(new PrintMapOfMapOfMap(session.getMapSession()));
        
        System.out.println("\nSolution of problem --> DONE");
        
        System.out.println("Enter event : ");
        
        session.start(); 
        
        /** environment adjustment for the events in session*/
        
        Narrative narrativeSession = new NarrativeImpl();
        Collector narrativeCollector = new CollectorImpl(narrativeSession);
        Sensor txtSensor = new SensorImpl();
        Event insertTxtEvent = new EventImpl(INSERT_TXT_EVENT);
        narrativeCollector.subscribe(txtSensor, insertTxtEvent);
        
        /** Waiting For Event*/
        
        try{
    		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    		String readEventName = bufferRead.readLine();//insertText occurs
    		readEventName.substring(0);//for eliminate the unused variable warning    		
        }catch(IOException e){e.printStackTrace();}
        
        if(session.getStartFlag()){//working session
        	narrativeSession.update(insertTxtEvent, System.currentTimeMillis(), null);            
            
        	txtSensor.report();
        	
        	System.out.println("i gotcha back event --> " + 
        			"\n\t"+session.getEvent(INSERT_TXT_EVENT)+
        			"\n\t\t"+session.getEvent(INSERT_TXT_EVENT).hashCode() +
					"\n\t\t\t now i'll do something via fluent values\n");
        	
        	for(Map.Entry<Event, Map<Condition, Map<Fluent, ContextImplSession>>> entryEventCond: 
        		session.getMapSession().entrySet()){
        		if (entryEventCond.getKey().equals(insertTxtEvent)){
        			System.out.println("i gotcha back event --> " + 
        					"\n\t"+entryEventCond.getKey() +
        					"\n\t\t"+entryEventCond.getKey().hashCode());
        			for (Map.Entry<Condition, Map<Fluent, ContextImplSession>> entryCondFlu: 
        				entryEventCond.getValue().entrySet()){
        				if (entryCondFlu.getKey() == null){
        					for (Map.Entry<Fluent, ContextImplSession> entryFluCntxt: 
        						entryCondFlu.getValue().entrySet()){
            					System.out.println("COND NULL for Fluent --> " +
            							"\n\t\t"+ entryFluCntxt.getKey().getFluentName()
            							+"\n\t\t\texpr value\t "
            							+ entryFluCntxt.getValue().getExpression().getValue().thisVal());
           					
            					entryFluCntxt.getKey().follow(new Sample (entryFluCntxt.getKey()));
            					
            					entryFluCntxt.getKey().notify(System.currentTimeMillis(), 
            							entryFluCntxt.getValue().getExpression().getValue());
            					
            					if (entryFluCntxt.getKey().getFluentName().equals(MSG_FLUENT)){
            						int intValueAction = (int)entryFluCntxt.getValue().getExpression().getValue().thisVal();
	            					switch(intValueAction){
		            					case 1 : 
		            						System.out.println(" I Execute --->"+MSG_ACTION_1 + 
		            							"\n\tfor fluent \t"+entryFluCntxt.getKey().getFluentName());
		            							break;
		            					case 2 : 
		            						System.out.println(" I Execute --->"+MSG_ACTION_2 + 
		            							"\n\tfor fluent \t"+entryFluCntxt.getKey().getFluentName());
		            						break;
		            					case 3 : 
		            						System.out.println(" I Execute --->"+MSG_ACTION_3 + 
		            							"\n\tfor fluent \t"+entryFluCntxt.getKey().getFluentName());
		            						break;
	            					}
            					}
        					}//Fluent        							
        				}// COND == null
        			}//COND iteration
        		}
        	}//Event iteration
        }//workingSession
        
        
        narrativeSession = null;  
        narrativeCollector = null;
        session.stop();
        System.out.println("\nSession --> DONE");

	}
		
}
