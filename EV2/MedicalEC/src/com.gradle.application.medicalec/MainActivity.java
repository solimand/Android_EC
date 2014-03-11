package com.gradle.application.medicalec;

import java.util.HashMap;
import java.util.Map;

import org.project.droolsDSL.javaModel.ConditionDescr;
import org.project.droolsDSL.javaModel.ContextDescr;
import org.project.droolsDSL.javaModel.ContextImpl;
import org.project.droolsDSL.javaModel.EffectDescr;
import org.project.droolsDSL.javaModel.EffectImpl;
import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaModel.FactorySessionDescr;
import org.project.droolsDSL.javaModel.ModelDescr;
import org.project.droolsDSL.javaModel.ModelImpl;
import org.project.droolsDSL.javaModel.conditions.NullCondition;
import org.project.droolsDSL.javaModel.expressions.NumberDescr;
import org.project.droolsDSL.javaModel.expressions.ParameterDescr;
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

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivityDrools";

	/**Events/Fluent/Action for rule definition*/
	private static final String PRESS_B1_EVENT = "Press_Event_1";
	private static final String PRESS_B2_EVENT = "Press_Event_2";
	private static final String PRESS_B3_EVENT = "Press_Event_3";
    
	private static final Event pressButton1_Event = new EventImpl(PRESS_B1_EVENT);
	private static final Event pressButton2_Event = new EventImpl(PRESS_B2_EVENT);
	private static final Event pressButton3_Event = new EventImpl(PRESS_B3_EVENT);
    
	private static final String TEXT_VIEW_COLOR_FLUENT = "TextViewColor"; 
	private static final int BLACK = 0xff000000;						/** Expressed as '1' in our DSL*/
	private static final int BLUE = 0xff0000ff;							/** Expressed as '2' in our DSL*/
	private static final int CYAN = 0xff00ffff;							/** Expressed as '3' in our DSL*/
	private static final int WHITE = 0xffffffff;						/** Expressed as '4' in our DSL*/
	
	/**Model*/
	public ModelDescr model;
	public ExpressionDescr exprContainer;
	public ConditionDescr condContainer;
	public ContextDescr contextContainer;
	public EffectDescr effectContainer;
	public EffectDescr[] effects;
	
	/**Session*/
	public SessionImpl sessionForMainActivity;	
	public FactorySessionDescr factorySess = new FactorySessionImpl();
	public Narrative narrativeSession = new NarrativeImpl();
	public Collector narrativeCollector = new CollectorImpl(narrativeSession);
	
	/**Android*/
	final Sensor buttonSensor = new SensorImpl();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final TextView textViewLOG = (TextView) findViewById(R.id.textViewLOG);
		final Button buttonStart = (Button) findViewById(R.id.buttonStart);
		final Button buttonStop = (Button) findViewById(R.id.buttonStop);
		final Button buttonEvent1 = (Button) findViewById(R.id.buttonEvent1);
		final Button buttonEvent2 = (Button) findViewById(R.id.buttonEvent2);
		final Button buttonEvent3 = (Button) findViewById(R.id.buttonEvent3);
		
        narrativeCollector.subscribe(buttonSensor, pressButton1_Event);
        narrativeCollector.subscribe(buttonSensor, pressButton2_Event);
        narrativeCollector.subscribe(buttonSensor, pressButton3_Event);

		buttonStart.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	buttonStart.setEnabled(false);
	        	buttonStop.setEnabled(true);

	        	/**________MODEL________*/
	        	model=new ModelImpl();
	        	// Parameters MAP
	        	Map<Integer, ParameterDescr[]> allEventParams = new HashMap<Integer, ParameterDescr[]>();
	        	String[] paramsStringOfStatement_0 = new String[0];
	        	ParameterDescr paramsOfStatement_0[] = new ParameterDescr[0];
	        	allEventParams.put(0, paramsOfStatement_0);
	        	String[] paramsStringOfStatement_1 = new String[0];
	        	ParameterDescr paramsOfStatement_1[] = new ParameterDescr[0];
	        	allEventParams.put(1, paramsOfStatement_1);
	        	String[] paramsStringOfStatement_2 = new String[0];
	        	ParameterDescr paramsOfStatement_2[] = new ParameterDescr[0];
	        	allEventParams.put(2, paramsOfStatement_2);

// 			Statement 0 proceed...
				exprContainer = new NumberDescr(3);
				
				effectContainer = new EffectImpl("TextViewColor",
									new ContextImpl(paramsStringOfStatement_0,
										exprContainer,
											NullCondition.getInstance()));
				
				model.add("Press_Event_1", effectContainer);
// 			Statement 0 Finish

// 			Statement 1 proceed...
				exprContainer = new NumberDescr(3);
				
				effectContainer = new EffectImpl("TextViewColor",
									new ContextImpl(paramsStringOfStatement_1,
										exprContainer,
											NullCondition.getInstance()));
				
				model.add("Press_Event_2", effectContainer);
// 			Statement 1 Finish

// 			Statement 2 proceed...
				exprContainer = new NumberDescr(3);
				
				effectContainer = new EffectImpl("TextViewColor",
									new ContextImpl(paramsStringOfStatement_2,
										exprContainer,
											NullCondition.getInstance()));
				
				model.add("Press_Event_3", effectContainer);
// 			Statement 2 Finish

				Log.i(TAG,"\nDefinition of problem --> DONE");
					
				/**________SESSION________*/
				
				sessionForMainActivity = (SessionImpl) model.getSession(factorySess);
		
				textViewLOG.setTextColor(BLACK);
		        textViewLOG.setText(printMap(sessionForMainActivity.getMapSession()));
		        
		        Log.i(TAG,"\nSolution of problem --> DONE");
		        	            
		        sessionForMainActivity.start(); 
		        /** Waiting For Event*/ 
		        buttonEvent1.setEnabled(true);
		    	buttonEvent2.setEnabled(true);
		    	buttonEvent3.setEnabled(true);
		    }
		});

		buttonStop.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	buttonStart.setEnabled(true);
	        	buttonStop.setEnabled(false);
	        	buttonEvent1.setEnabled(false);
	        	buttonEvent2.setEnabled(false);
	        	buttonEvent3.setEnabled(false);
	        	textViewLOG.setBackgroundColor(WHITE);
	        	textViewLOG.setText("");
	        	
	        	narrativeSession = new NarrativeImpl();  
	            narrativeCollector = new CollectorImpl(narrativeSession);
	            if(sessionForMainActivity.getStartFlag()){
		        	sessionForMainActivity.stop();
	            }
	            System.out.println("\nSession --> DONE");
	        }
		});

		buttonEvent1.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	/**Press_Event_1 occurs*/
	        	if(sessionForMainActivity.getStartFlag()){
	            	narrativeSession.update(pressButton1_Event, System.currentTimeMillis(), null);	                
	            	buttonSensor.report();
	            	
	            	for(Map.Entry<Event, Map<Condition, Map<Fluent, ContextImplSession>>> entryEventCond: 
	            		sessionForMainActivity.getMapSession().entrySet()){
	            		if (entryEventCond.getKey().equals(pressButton1_Event)){
	            			
	            			for (Map.Entry<Condition, Map<Fluent, ContextImplSession>> entryCondFlu: 
	            				entryEventCond.getValue().entrySet()){
	            				if (entryCondFlu.getKey() == null){
	            					for (Map.Entry<Fluent, ContextImplSession> entryFluCntxt: 
	            						entryCondFlu.getValue().entrySet()){
	               					
	                					entryFluCntxt.getKey().follow(new Sample (entryFluCntxt.getKey()));
	                					
	                					entryFluCntxt.getKey().notify(System.currentTimeMillis(), 
	                							entryFluCntxt.getValue().getExpression().getValue());
	                					
	                					if (entryFluCntxt.getKey().getFluentName().equals(TEXT_VIEW_COLOR_FLUENT)){
	                						int intValueAction = (int)entryFluCntxt.getValue().getExpression().getValue().thisVal();
	    	            					switch(intValueAction){
	    		            					case 1 : 
	    		            						textViewLOG.setBackgroundColor(BLACK);
	    		            						textViewLOG.setTextColor(WHITE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
	    		            							"\n\tto BLACK \t");
	    		            						break;
	    		            					case 2 :
	    		            						textViewLOG.setBackgroundColor(BLUE);
	    		            						textViewLOG.setTextColor(WHITE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto BLUE \t");
		    		            					break;
	    		            					case 3 : 
	    		            						textViewLOG.setBackgroundColor(CYAN);
	    		            						textViewLOG.setTextColor(BLUE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto CYAN \t");
		    		            					break;
	    	            					}
	                					}
	            					}//Fluent        							
	            				}// COND == null
	            			}//COND iteration
	            		}
	            	}
	        	}
	        }
		});

		buttonEvent2.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	/**Press_Event_2 occurs*/
	        	if(sessionForMainActivity.getStartFlag()){
	            	narrativeSession.update(pressButton2_Event, System.currentTimeMillis(), null);	                
	            	buttonSensor.report();
	            	
	            	for(Map.Entry<Event, Map<Condition, Map<Fluent, ContextImplSession>>> entryEventCond: 
	            		sessionForMainActivity.getMapSession().entrySet()){
	            		if (entryEventCond.getKey().equals(pressButton2_Event)){
	            			
	            			for (Map.Entry<Condition, Map<Fluent, ContextImplSession>> entryCondFlu: 
	            				entryEventCond.getValue().entrySet()){
	            				if (entryCondFlu.getKey() == null){
	            					for (Map.Entry<Fluent, ContextImplSession> entryFluCntxt: 
	            						entryCondFlu.getValue().entrySet()){
	            						
	            						entryFluCntxt.getKey().follow(new Sample (entryFluCntxt.getKey()));
	                					
	                					entryFluCntxt.getKey().notify(System.currentTimeMillis(), 
	                							entryFluCntxt.getValue().getExpression().getValue());
	                					
	                					if (entryFluCntxt.getKey().getFluentName().equals(TEXT_VIEW_COLOR_FLUENT)){
	                						int intValueAction = (int)entryFluCntxt.getValue().getExpression().getValue().thisVal();
	    	            					switch(intValueAction){
	    		            					case 1 : 
	    		            						textViewLOG.setBackgroundColor(BLACK);
	    		            						textViewLOG.setTextColor(WHITE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
	    		            							"\n\tto BLACK \t");
	    		            						break;
	    		            					case 2 :
	    		            						textViewLOG.setBackgroundColor(BLUE);
	    		            						textViewLOG.setTextColor(WHITE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto BLUE \t");
		    		            					break;
	    		            					case 3 : 
	    		            						textViewLOG.setBackgroundColor(CYAN);
	    		            						textViewLOG.setTextColor(BLUE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto CYAN \t");
		    		            					break;
	    		            					case 4 : 
	    		            						textViewLOG.setBackgroundColor(WHITE);
	    		            						textViewLOG.setTextColor(BLACK);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto WHITE \t");
		    		            					break;
	    	            					}
	                					}
	            					}        							
	            				}
	            			}
	            		}
	            	}
	        	}
	        }
		});

		buttonEvent3.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	/**Press_Event_3 occurs*/
	        	if(sessionForMainActivity.getStartFlag()){
	            	narrativeSession.update(pressButton3_Event, System.currentTimeMillis(), null);	                
	            	buttonSensor.report();
	            
	            	for(Map.Entry<Event, Map<Condition, Map<Fluent, ContextImplSession>>> entryEventCond: 
	            		sessionForMainActivity.getMapSession().entrySet()){
	            		if (entryEventCond.getKey().equals(pressButton3_Event)){

	            			for (Map.Entry<Condition, Map<Fluent, ContextImplSession>> entryCondFlu: 
	            				entryEventCond.getValue().entrySet()){
	            				if (entryCondFlu.getKey() == null){
	            					for (Map.Entry<Fluent, ContextImplSession> entryFluCntxt: 
	            						entryCondFlu.getValue().entrySet()){
	            						
	            						entryFluCntxt.getKey().follow(new Sample (entryFluCntxt.getKey()));
	                					
	                					entryFluCntxt.getKey().notify(System.currentTimeMillis(), 
	                							entryFluCntxt.getValue().getExpression().getValue());
	                					
	                					if (entryFluCntxt.getKey().getFluentName().equals(TEXT_VIEW_COLOR_FLUENT)){
	                						int intValueAction = (int)entryFluCntxt.getValue().getExpression().getValue().thisVal();
	    	            					switch(intValueAction){
	    		            					case 1 : 
	    		            						textViewLOG.setBackgroundColor(BLACK);
	    		            						textViewLOG.setTextColor(WHITE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
	    		            							"\n\tto BLACK \t");
	    		            						break;
	    		            					case 2 :
	    		            						textViewLOG.setBackgroundColor(BLUE);
	    		            						textViewLOG.setTextColor(WHITE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto BLUE \t");
		    		            					break;
	    		            					case 3 : 
	    		            						textViewLOG.setBackgroundColor(CYAN);
	    		            						textViewLOG.setTextColor(BLUE);
	    		            						textViewLOG.setText(" I Change --->"+TEXT_VIEW_COLOR_FLUENT + 
		    		            							"\n\tto CYAN \t");
		    		            					break;
	    	            					}
	                					}
	            					}     							
	            				}
	            			}
	            		}
	            	}
	        	}
	        }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private String printMap(Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> mapSession){
		String result = " ";		
		for(Event e: mapSession.keySet()){
			result += "\nEvent: " + e.toString();
			for (Condition cond : mapSession.get(e).keySet()){
				result += "\n\tCond = "+ cond;				
				for(Fluent f: mapSession.get(e).get(cond).keySet()){
					result += "\n\t\tFluent = "+ f.getFluentName();
				}
			}
		}		
		return result;
	}
}
