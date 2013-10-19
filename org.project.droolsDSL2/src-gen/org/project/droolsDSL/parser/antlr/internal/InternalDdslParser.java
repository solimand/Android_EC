package org.project.droolsDSL.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.project.droolsDSL.services.DdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "'set'", "','", "';'", "'('", "')'", "'to'", "'in'", "'if'", "'OR'", "'AND'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'true'", "'false'", "'now'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalDdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDdslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g"; }



     	private DdslGrammarAccess grammarAccess;
     	
        public InternalDdslParser(TokenStream input, DdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DroolsModel";	
       	}
       	
       	@Override
       	protected DdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDroolsModel"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:67:1: entryRuleDroolsModel returns [EObject current=null] : iv_ruleDroolsModel= ruleDroolsModel EOF ;
    public final EObject entryRuleDroolsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroolsModel = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:68:2: (iv_ruleDroolsModel= ruleDroolsModel EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:69:2: iv_ruleDroolsModel= ruleDroolsModel EOF
            {
             newCompositeNode(grammarAccess.getDroolsModelRule()); 
            pushFollow(FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel75);
            iv_ruleDroolsModel=ruleDroolsModel();

            state._fsp--;

             current =iv_ruleDroolsModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDroolsModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDroolsModel"


    // $ANTLR start "ruleDroolsModel"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:76:1: ruleDroolsModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleDroolsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:79:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:81:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:81:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:82:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleDroolsModel130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDroolsModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDroolsModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:115:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_event_1_0 = null;

        EObject lv_fluent_3_0 = null;

        EObject lv_fluent_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:118:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:119:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatement213); 

                	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getOnKeyword_0());
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:123:1: ( (lv_event_1_0= ruleEvent ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:124:1: (lv_event_1_0= ruleEvent )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:124:1: (lv_event_1_0= ruleEvent )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:125:3: lv_event_1_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleStatement234);
            lv_event_1_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_1_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatement246); 

                	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSetKeyword_2());
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:145:1: ( (lv_fluent_3_0= ruleFluent ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:146:1: (lv_fluent_3_0= ruleFluent )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:146:1: (lv_fluent_3_0= ruleFluent )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:147:3: lv_fluent_3_0= ruleFluent
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFluent_in_ruleStatement267);
            lv_fluent_3_0=ruleFluent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		add(
                   			current, 
                   			"fluent",
                    		lv_fluent_3_0, 
                    		"Fluent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:163:2: (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:163:4: otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStatement280); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:167:1: ( (lv_fluent_5_0= ruleFluent ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:168:1: (lv_fluent_5_0= ruleFluent )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:168:1: (lv_fluent_5_0= ruleFluent )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:169:3: lv_fluent_5_0= ruleFluent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFluent_in_ruleStatement301);
            	    lv_fluent_5_0=ruleFluent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fluent",
            	            		lv_fluent_5_0, 
            	            		"Fluent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStatement315); 

                	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:197:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:198:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:199:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent351);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:206:1: ruleEvent returns [EObject current=null] : ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:209:28: ( ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:210:1: ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:210:1: ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:210:2: ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )?
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:210:2: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:211:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:211:1: (lv_eventName_0_0= RULE_ID )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:212:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent403); 

            			newLeafNode(lv_eventName_0_0, grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eventName",
                    		lv_eventName_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:228:2: (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:228:4: otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleEvent421); 

                        	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:232:1: ( (lv_param_2_0= ruleEventFeature ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:233:1: (lv_param_2_0= ruleEventFeature )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:233:1: (lv_param_2_0= ruleEventFeature )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:234:3: lv_param_2_0= ruleEventFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventFeature_in_ruleEvent442);
                    lv_param_2_0=ruleEventFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"param",
                            		lv_param_2_0, 
                            		"EventFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:250:2: (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:250:4: otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEvent455); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:254:1: ( (lv_param_4_0= ruleEventFeature ) )
                    	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:255:1: (lv_param_4_0= ruleEventFeature )
                    	    {
                    	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:255:1: (lv_param_4_0= ruleEventFeature )
                    	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:256:3: lv_param_4_0= ruleEventFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEventFeature_in_ruleEvent476);
                    	    lv_param_4_0=ruleEventFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"param",
                    	            		lv_param_4_0, 
                    	            		"EventFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEvent490); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleFluent"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:284:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:285:2: (iv_ruleFluent= ruleFluent EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:286:2: iv_ruleFluent= ruleFluent EOF
            {
             newCompositeNode(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent528);
            iv_ruleFluent=ruleFluent();

            state._fsp--;

             current =iv_ruleFluent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFluent"


    // $ANTLR start "ruleFluent"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:293:1: ruleFluent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_valuePart_2_0 = null;

        EObject lv_timePart_4_0 = null;

        EObject lv_condPart_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:296:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:298:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:298:1: (lv_name_0_0= RULE_ID )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:299:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluent580); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFluentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:315:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:315:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFluent598); 

                	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getToKeyword_1_0());
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:319:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:320:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:320:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:321:3: lv_valuePart_2_0= ruleToRule
            {
             
            	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent619);
            lv_valuePart_2_0=ruleToRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFluentRule());
            	        }
                   		set(
                   			current, 
                   			"valuePart",
                    		lv_valuePart_2_0, 
                    		"ToRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:337:3: (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:337:5: otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFluent633); 

                        	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getInKeyword_2_0());
                        
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:341:1: ( (lv_timePart_4_0= ruleInRule ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:342:1: (lv_timePart_4_0= ruleInRule )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:342:1: (lv_timePart_4_0= ruleInRule )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:343:3: lv_timePart_4_0= ruleInRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInRule_in_ruleFluent654);
                    lv_timePart_4_0=ruleInRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFluentRule());
                    	        }
                           		set(
                           			current, 
                           			"timePart",
                            		lv_timePart_4_0, 
                            		"InRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:359:4: (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:359:6: otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleFluent669); 

                        	newLeafNode(otherlv_5, grammarAccess.getFluentAccess().getIfKeyword_3_0());
                        
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:363:1: ( (lv_condPart_6_0= ruleConditionRule ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:364:1: (lv_condPart_6_0= ruleConditionRule )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:364:1: (lv_condPart_6_0= ruleConditionRule )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:365:3: lv_condPart_6_0= ruleConditionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleFluent690);
                    lv_condPart_6_0=ruleConditionRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFluentRule());
                    	        }
                           		set(
                           			current, 
                           			"condPart",
                            		lv_condPart_6_0, 
                            		"ConditionRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFluent"


    // $ANTLR start "entryRuleConditionRule"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:389:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:390:2: (iv_ruleConditionRule= ruleConditionRule EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:391:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
             newCompositeNode(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule728);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;

             current =iv_ruleConditionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionRule"


    // $ANTLR start "ruleConditionRule"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:398:1: ruleConditionRule returns [EObject current=null] : ( () ( (lv_condition_1_0= ruleExpression ) ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:401:28: ( ( () ( (lv_condition_1_0= ruleExpression ) ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:402:1: ( () ( (lv_condition_1_0= ruleExpression ) ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:402:1: ( () ( (lv_condition_1_0= ruleExpression ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:402:2: () ( (lv_condition_1_0= ruleExpression ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:402:2: ()
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:403:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:408:2: ( (lv_condition_1_0= ruleExpression ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:409:1: (lv_condition_1_0= ruleExpression )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:409:1: (lv_condition_1_0= ruleExpression )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:410:3: lv_condition_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleConditionRule793);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRuleRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionRule"


    // $ANTLR start "entryRuleToRule"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:434:1: entryRuleToRule returns [EObject current=null] : iv_ruleToRule= ruleToRule EOF ;
    public final EObject entryRuleToRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToRule = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:435:2: (iv_ruleToRule= ruleToRule EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:436:2: iv_ruleToRule= ruleToRule EOF
            {
             newCompositeNode(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule829);
            iv_ruleToRule=ruleToRule();

            state._fsp--;

             current =iv_ruleToRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToRule"


    // $ANTLR start "ruleToRule"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:443:1: ruleToRule returns [EObject current=null] : ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) ;
    public final EObject ruleToRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:446:28: ( ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:447:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:447:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:447:2: () ( (lv_expression_1_0= rulePlusOrMinus ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:447:2: ()
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:448:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getToRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:453:2: ( (lv_expression_1_0= rulePlusOrMinus ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:454:1: (lv_expression_1_0= rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:454:1: (lv_expression_1_0= rulePlusOrMinus )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:455:3: lv_expression_1_0= rulePlusOrMinus
            {
             
            	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleToRule894);
            lv_expression_1_0=rulePlusOrMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getToRuleRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"PlusOrMinus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToRule"


    // $ANTLR start "entryRuleInRule"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:479:1: entryRuleInRule returns [EObject current=null] : iv_ruleInRule= ruleInRule EOF ;
    public final EObject entryRuleInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRule = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:480:2: (iv_ruleInRule= ruleInRule EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:481:2: iv_ruleInRule= ruleInRule EOF
            {
             newCompositeNode(grammarAccess.getInRuleRule()); 
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule930);
            iv_ruleInRule=ruleInRule();

            state._fsp--;

             current =iv_ruleInRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule940); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInRule"


    // $ANTLR start "ruleInRule"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:488:1: ruleInRule returns [EObject current=null] : ( (lv_time_0_0= rulePlusOrMinus ) ) ;
    public final EObject ruleInRule() throws RecognitionException {
        EObject current = null;

        EObject lv_time_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:491:28: ( ( (lv_time_0_0= rulePlusOrMinus ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:492:1: ( (lv_time_0_0= rulePlusOrMinus ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:492:1: ( (lv_time_0_0= rulePlusOrMinus ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:493:1: (lv_time_0_0= rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:493:1: (lv_time_0_0= rulePlusOrMinus )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:494:3: lv_time_0_0= rulePlusOrMinus
            {
             
            	        newCompositeNode(grammarAccess.getInRuleAccess().getTimePlusOrMinusParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleInRule985);
            lv_time_0_0=rulePlusOrMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInRuleRule());
            	        }
                   		set(
                   			current, 
                   			"time",
                    		lv_time_0_0, 
                    		"PlusOrMinus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInRule"


    // $ANTLR start "entryRuleEventFeature"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:518:1: entryRuleEventFeature returns [EObject current=null] : iv_ruleEventFeature= ruleEventFeature EOF ;
    public final EObject entryRuleEventFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventFeature = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:519:2: (iv_ruleEventFeature= ruleEventFeature EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:520:2: iv_ruleEventFeature= ruleEventFeature EOF
            {
             newCompositeNode(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_ruleEventFeature_in_entryRuleEventFeature1020);
            iv_ruleEventFeature=ruleEventFeature();

            state._fsp--;

             current =iv_ruleEventFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventFeature1030); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventFeature"


    // $ANTLR start "ruleEventFeature"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:527:1: ruleEventFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEventFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:530:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:531:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:531:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:532:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:532:1: (lv_name_0_0= RULE_ID )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:533:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventFeature1071); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventFeature"


    // $ANTLR start "entryRuleExpression"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:557:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:558:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:559:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1111);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:566:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:569:28: (this_Or_0= ruleOr )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:571:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression1167);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:587:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:588:2: (iv_ruleOr= ruleOr EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:589:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1201);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:596:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:599:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:600:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:600:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:601:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1258);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:609:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:609:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:609:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:610:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOr1279); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:619:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:620:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:620:1: (lv_right_3_0= ruleAnd )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:621:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1300);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:645:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:646:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:647:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1338);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1348); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:654:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:657:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:658:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:658:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:659:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd1395);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:667:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:667:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:667:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:668:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAnd1416); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:677:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:678:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:678:1: (lv_right_3_0= ruleEquality )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:679:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1437);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Equality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:703:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:704:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:705:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1475);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1485); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:712:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:715:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:716:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:716:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:717:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality1532);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:725:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:725:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:725:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:726:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:731:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:732:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:732:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:733:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:733:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==23) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==24) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:734:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleEquality1561); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:746:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleEquality1590); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:761:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:762:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:762:1: (lv_right_3_0= ruleComparison )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:763:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality1627);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:787:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:788:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:789:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1665);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:796:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:799:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:800:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:800:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:801:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1722);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:809:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=25 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:809:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:809:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:810:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:815:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:816:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:816:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:817:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:817:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:818:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleComparison1751); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:830:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleComparison1780); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:842:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_ruleComparison1809); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:854:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleComparison1838); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:869:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:870:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:870:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:871:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1875);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PlusOrMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:895:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:896:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:897:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1913);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus1923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:904:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:907:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:908:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:908:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:909:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1970);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==29) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==30) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:3: ( () otherlv_2= '+' )
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:4: () otherlv_2= '+'
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:917:4: ()
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:918:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePlusOrMinus1993); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:928:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:928:6: ( () otherlv_4= '-' )
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:928:7: () otherlv_4= '-'
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:928:7: ()
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:929:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePlusOrMinus2022); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:938:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:939:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:939:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:940:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2045);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MulOrDiv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:964:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:965:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:966:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2083);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2093); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:973:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:976:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:977:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:977:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:978:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2140);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:986:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:986:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:986:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:987:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:992:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:993:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:993:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:994:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:994:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:995:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleMulOrDiv2169); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1007:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleMulOrDiv2198); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1019:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleMulOrDiv2227); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1031:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv2256); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1046:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1047:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1047:1: (lv_right_3_0= rulePrimary )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1048:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2293);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1072:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1073:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1074:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2331);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1081:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1084:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1085:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1085:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
            case RULE_FLOAT:
            case RULE_INT:
            case 36:
            case 37:
            case 38:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1085:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1085:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1085:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePrimary2379); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary2401);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePrimary2412); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1103:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1103:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1103:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1103:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1104:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePrimary2441); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1113:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1114:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1114:1: (lv_expression_5_0= rulePrimary )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1115:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary2462);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1133:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary2491);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1149:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1150:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1151:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2526);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2536); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1158:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )? ) | ( () ( (lv_value_12_0= 'now' ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_fluentValueSample_9_0=null;
        Token otherlv_10=null;
        Token lv_value_12_0=null;

         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1161:28: ( ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )? ) | ( () ( (lv_value_12_0= 'now' ) ) ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1162:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )? ) | ( () ( (lv_value_12_0= 'now' ) ) ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1162:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )? ) | ( () ( (lv_value_12_0= 'now' ) ) ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
                {
                alt20=2;
                }
                break;
            case 36:
            case 37:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                alt20=4;
                }
                break;
            case 38:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1162:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1162:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1162:3: () ( (lv_value_1_0= RULE_FLOAT ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1162:3: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1163:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFloatConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:2: ( (lv_value_1_0= RULE_FLOAT ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1169:1: (lv_value_1_0= RULE_FLOAT )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1169:1: (lv_value_1_0= RULE_FLOAT )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1170:3: lv_value_1_0= RULE_FLOAT
                    {
                    lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleAtomic2588); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"FLOAT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1187:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1187:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1187:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1187:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1188:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1193:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1194:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1194:1: (lv_value_3_0= RULE_INT )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1195:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic2627); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1212:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1212:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1212:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1212:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1213:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1218:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1219:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1219:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1220:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1220:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==36) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==37) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1221:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,36,FOLLOW_36_in_ruleAtomic2669); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1233:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,37,FOLLOW_37_in_ruleAtomic2698); 

                                    newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1249:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )? )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1249:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )? )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1249:7: () ( (otherlv_7= RULE_ID ) ) (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )?
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1249:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1250:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1255:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1256:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1256:1: (otherlv_7= RULE_ID )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1257:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2751); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1268:2: (otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==16) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1268:4: otherlv_8= '(' ( (lv_fluentValueSample_9_0= RULE_INT ) ) otherlv_10= ')'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleAtomic2764); 

                                	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_2_0());
                                
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1272:1: ( (lv_fluentValueSample_9_0= RULE_INT ) )
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1273:1: (lv_fluentValueSample_9_0= RULE_INT )
                            {
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1273:1: (lv_fluentValueSample_9_0= RULE_INT )
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1274:3: lv_fluentValueSample_9_0= RULE_INT
                            {
                            lv_fluentValueSample_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic2781); 

                            			newLeafNode(lv_fluentValueSample_9_0, grammarAccess.getAtomicAccess().getFluentValueSampleINTTerminalRuleCall_3_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"fluentValueSample",
                                    		lv_fluentValueSample_9_0, 
                                    		"INT");
                            	    

                            }


                            }

                            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleAtomic2798); 

                                	newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_2_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1295:6: ( () ( (lv_value_12_0= 'now' ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1295:6: ( () ( (lv_value_12_0= 'now' ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1295:7: () ( (lv_value_12_0= 'now' ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1295:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1296:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1301:2: ( (lv_value_12_0= 'now' ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1302:1: (lv_value_12_0= 'now' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1302:1: (lv_value_12_0= 'now' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1303:3: lv_value_12_0= 'now'
                    {
                    lv_value_12_0=(Token)match(input,38,FOLLOW_38_in_ruleAtomic2835); 

                            newLeafNode(lv_value_12_0, grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_12_0, "now");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDroolsModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDroolsModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatement234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleStatement267 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleStatement280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleStatement301 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleStatement315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent403 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleEvent421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventFeature_in_ruleEvent442 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleEvent455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventFeature_in_ruleEvent476 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleEvent490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent580 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFluent598 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent619 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleFluent633 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleFluent654 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFluent669 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionRule793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleToRule894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleInRule985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_entryRuleEventFeature1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventFeature1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventFeature1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1258 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleOr1279 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1300 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1395 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1416 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1437 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality1532 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleEquality1561 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_24_in_ruleEquality1590 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality1627 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1722 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_ruleComparison1751 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_26_in_ruleComparison1780 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_27_in_ruleComparison1809 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_28_in_ruleComparison1838 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1875 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1970 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_rulePlusOrMinus1993 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_30_in_rulePlusOrMinus2022 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2045 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2140 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_31_in_ruleMulOrDiv2169 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_32_in_ruleMulOrDiv2198 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_33_in_ruleMulOrDiv2227 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv2256 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2293 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimary2379 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary2401 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimary2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimary2441 = new BitSet(new long[]{0x0000007800010070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAtomic2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAtomic2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAtomic2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2751 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAtomic2764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic2781 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomic2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAtomic2835 = new BitSet(new long[]{0x0000000000000002L});

}