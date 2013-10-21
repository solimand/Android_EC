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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "'set'", "','", "';'", "'('", "')'", "'in'", "'to'", "'if'", "'OR'", "'AND'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'true'", "'false'", "'at'", "'now'"
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
    public static final int T__39=39;
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:293:1: ruleFluent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) ) )? (otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) ) ) (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timePart_2_0 = null;

        EObject lv_valuePart_4_0 = null;

        EObject lv_condPart_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:296:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) ) )? (otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) ) ) (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) ) )? (otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) ) ) (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) ) )? (otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) ) ) (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:297:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) ) )? (otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) ) ) (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
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

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:315:2: (otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:315:4: otherlv_1= 'in' ( (lv_timePart_2_0= ruleInRule ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFluent598); 

                        	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getInKeyword_1_0());
                        
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:319:1: ( (lv_timePart_2_0= ruleInRule ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:320:1: (lv_timePart_2_0= ruleInRule )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:320:1: (lv_timePart_2_0= ruleInRule )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:321:3: lv_timePart_2_0= ruleInRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInRule_in_ruleFluent619);
                    lv_timePart_2_0=ruleInRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFluentRule());
                    	        }
                           		set(
                           			current, 
                           			"timePart",
                            		lv_timePart_2_0, 
                            		"InRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:337:4: (otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:337:6: otherlv_3= 'to' ( (lv_valuePart_4_0= ruleToRule ) )
            {
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFluent634); 

                	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getToKeyword_2_0());
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:341:1: ( (lv_valuePart_4_0= ruleToRule ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:342:1: (lv_valuePart_4_0= ruleToRule )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:342:1: (lv_valuePart_4_0= ruleToRule )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:343:3: lv_valuePart_4_0= ruleToRule
            {
             
            	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent655);
            lv_valuePart_4_0=ruleToRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFluentRule());
            	        }
                   		set(
                   			current, 
                   			"valuePart",
                    		lv_valuePart_4_0, 
                    		"ToRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:359:3: (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:359:5: otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) )
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:488:1: ruleInRule returns [EObject current=null] : ( () ( (lv_inTimeExpr_1_0= ruleInTimeExpression ) ) ) ;
    public final EObject ruleInRule() throws RecognitionException {
        EObject current = null;

        EObject lv_inTimeExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:491:28: ( ( () ( (lv_inTimeExpr_1_0= ruleInTimeExpression ) ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:492:1: ( () ( (lv_inTimeExpr_1_0= ruleInTimeExpression ) ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:492:1: ( () ( (lv_inTimeExpr_1_0= ruleInTimeExpression ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:492:2: () ( (lv_inTimeExpr_1_0= ruleInTimeExpression ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:492:2: ()
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:493:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInRuleAccess().getInExprAction_0(),
                        current);
                

            }

            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:498:2: ( (lv_inTimeExpr_1_0= ruleInTimeExpression ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:499:1: (lv_inTimeExpr_1_0= ruleInTimeExpression )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:499:1: (lv_inTimeExpr_1_0= ruleInTimeExpression )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:500:3: lv_inTimeExpr_1_0= ruleInTimeExpression
            {
             
            	        newCompositeNode(grammarAccess.getInRuleAccess().getInTimeExprInTimeExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInTimeExpression_in_ruleInRule995);
            lv_inTimeExpr_1_0=ruleInTimeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInRuleRule());
            	        }
                   		set(
                   			current, 
                   			"inTimeExpr",
                    		lv_inTimeExpr_1_0, 
                    		"InTimeExpression");
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
    // $ANTLR end "ruleInRule"


    // $ANTLR start "entryRuleEventFeature"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:524:1: entryRuleEventFeature returns [EObject current=null] : iv_ruleEventFeature= ruleEventFeature EOF ;
    public final EObject entryRuleEventFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventFeature = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:525:2: (iv_ruleEventFeature= ruleEventFeature EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:526:2: iv_ruleEventFeature= ruleEventFeature EOF
            {
             newCompositeNode(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_ruleEventFeature_in_entryRuleEventFeature1031);
            iv_ruleEventFeature=ruleEventFeature();

            state._fsp--;

             current =iv_ruleEventFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventFeature1041); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:533:1: ruleEventFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEventFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:536:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:537:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:537:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:538:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:538:1: (lv_name_0_0= RULE_ID )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:539:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventFeature1082); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:563:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:564:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:565:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1122);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1132); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:572:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:575:28: (this_Or_0= ruleOr )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:577:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression1178);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:593:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:594:2: (iv_ruleOr= ruleOr EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:595:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1212);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1222); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:602:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:605:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:606:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:606:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:607:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1269);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:615:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:615:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:615:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:616:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOr1290); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:625:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:626:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:626:1: (lv_right_3_0= ruleAnd )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:627:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1311);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:651:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:652:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:653:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1349);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1359); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:660:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:663:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:664:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:664:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:665:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd1406);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:673:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:673:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:673:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:674:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAnd1427); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:683:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:684:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:684:1: (lv_right_3_0= ruleEquality )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:685:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1448);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:709:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:710:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:711:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1486);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1496); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:718:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:721:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:722:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:722:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:723:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality1543);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:731:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:731:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:731:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:732:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:737:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:738:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:738:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:739:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:739:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
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
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:740:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleEquality1572); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:752:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleEquality1601); 

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

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:767:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:768:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:768:1: (lv_right_3_0= ruleComparison )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:769:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality1638);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:793:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:794:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:795:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1676);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1686); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:802:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:805:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:806:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:806:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:807:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1733);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:815:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=25 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:815:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:815:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:816:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:821:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:822:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:822:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:823:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:823:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
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
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:824:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleComparison1762); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:836:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleComparison1791); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:848:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_ruleComparison1820); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:860:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleComparison1849); 

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

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:875:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:876:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:876:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:877:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1886);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:901:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:902:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:903:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1924);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus1934); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:910:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:913:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:914:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:914:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:915:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1981);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:3: ( () otherlv_2= '+' )
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:4: () otherlv_2= '+'
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:923:4: ()
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:924:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePlusOrMinus2004); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:934:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:934:6: ( () otherlv_4= '-' )
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:934:7: () otherlv_4= '-'
            	            {
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:934:7: ()
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:935:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePlusOrMinus2033); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:944:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:945:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:945:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:946:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2056);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:970:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:971:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:972:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2094);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2104); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:979:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
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
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:982:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:983:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:983:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:984:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2151);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:992:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:992:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:992:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:993:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:998:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:999:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:999:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1000:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1000:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
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
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1001:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleMulOrDiv2180); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1013:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleMulOrDiv2209); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1025:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleMulOrDiv2238); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1037:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv2267); 

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

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1052:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1053:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1053:1: (lv_right_3_0= rulePrimary )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1054:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2304);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1078:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1079:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1080:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2342);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2352); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1087:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1090:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1091:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1091:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
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
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1091:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1091:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1091:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePrimary2390); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary2412);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePrimary2423); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1109:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1109:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1109:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1109:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1110:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePrimary2452); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1119:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1120:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1120:1: (lv_expression_5_0= rulePrimary )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1121:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary2473);
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
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1139:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary2502);
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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1155:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1156:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1157:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2537);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2547); 

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
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1164:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_fluentValueSample_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1167:28: ( ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) )
            int alt20=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:3: () ( (lv_value_1_0= RULE_FLOAT ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1168:3: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1169:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFloatConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1174:2: ( (lv_value_1_0= RULE_FLOAT ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1175:1: (lv_value_1_0= RULE_FLOAT )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1175:1: (lv_value_1_0= RULE_FLOAT )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1176:3: lv_value_1_0= RULE_FLOAT
                    {
                    lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleAtomic2599); 

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
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1193:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1193:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1193:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1193:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1194:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1199:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1200:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1200:1: (lv_value_3_0= RULE_INT )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1201:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic2638); 

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
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1218:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1218:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1218:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1218:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1219:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1224:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1225:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1225:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1226:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1226:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
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
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1227:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,36,FOLLOW_36_in_ruleAtomic2680); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1239:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,37,FOLLOW_37_in_ruleAtomic2709); 

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
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1255:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1255:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1255:7: () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )?
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1255:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1256:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1261:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1262:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1262:1: (otherlv_7= RULE_ID )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1263:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2762); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1274:2: (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==38) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1274:4: otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) )
                            {
                            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleAtomic2775); 

                                	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getAtKeyword_3_2_0());
                                
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1278:1: ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) )
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1279:1: (lv_fluentValueSample_9_0= ruleAtTimePrimary )
                            {
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1279:1: (lv_fluentValueSample_9_0= ruleAtTimePrimary )
                            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1280:3: lv_fluentValueSample_9_0= ruleAtTimePrimary
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtomic2796);
                            lv_fluentValueSample_9_0=ruleAtTimePrimary();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fluentValueSample",
                                    		lv_fluentValueSample_9_0, 
                                    		"AtTimePrimary");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

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


    // $ANTLR start "entryRuleAtTimeExpression"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1308:1: entryRuleAtTimeExpression returns [EObject current=null] : iv_ruleAtTimeExpression= ruleAtTimeExpression EOF ;
    public final EObject entryRuleAtTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimeExpression = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1309:2: (iv_ruleAtTimeExpression= ruleAtTimeExpression EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1310:2: iv_ruleAtTimeExpression= ruleAtTimeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression2839);
            iv_ruleAtTimeExpression=ruleAtTimeExpression();

            state._fsp--;

             current =iv_ruleAtTimeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeExpression2849); 

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
    // $ANTLR end "entryRuleAtTimeExpression"


    // $ANTLR start "ruleAtTimeExpression"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1317:1: ruleAtTimeExpression returns [EObject current=null] : (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* ) ;
    public final EObject ruleAtTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AtTimePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1320:28: ( (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1321:1: (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1321:1: (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1322:5: this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression2896);
            this_AtTimePrimary_0=ruleAtTimePrimary();

            state._fsp--;

             
                    current = this_AtTimePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1330:1: ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=29 && LA22_0<=30)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1330:2: () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1330:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1331:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1336:2: ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1337:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1337:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1338:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1338:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==30) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==29) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1339:3: lv_op_2_1= '-'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_30_in_ruleAtTimeExpression2925); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAtTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1351:8: lv_op_2_2= '+'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_29_in_ruleAtTimeExpression2954); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAtTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1366:2: ( (lv_right_3_0= ruleAtTimePrimary ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1367:1: (lv_right_3_0= ruleAtTimePrimary )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1367:1: (lv_right_3_0= ruleAtTimePrimary )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1368:3: lv_right_3_0= ruleAtTimePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression2991);
            	    lv_right_3_0=ruleAtTimePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtTimeExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AtTimePrimary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleAtTimeExpression"


    // $ANTLR start "entryRuleAtTimePrimary"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1392:1: entryRuleAtTimePrimary returns [EObject current=null] : iv_ruleAtTimePrimary= ruleAtTimePrimary EOF ;
    public final EObject entryRuleAtTimePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimePrimary = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1393:2: (iv_ruleAtTimePrimary= ruleAtTimePrimary EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1394:2: iv_ruleAtTimePrimary= ruleAtTimePrimary EOF
            {
             newCompositeNode(grammarAccess.getAtTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary3029);
            iv_ruleAtTimePrimary=ruleAtTimePrimary();

            state._fsp--;

             current =iv_ruleAtTimePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimePrimary3039); 

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
    // $ANTLR end "entryRuleAtTimePrimary"


    // $ANTLR start "ruleAtTimePrimary"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1401:1: ruleAtTimePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic ) ;
    public final EObject ruleAtTimePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AtTimeExpression_1 = null;

        EObject this_AtTimeAtomic_3 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1404:28: ( ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1405:1: ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1405:1: ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT||LA23_0==39) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1405:2: (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1405:2: (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1405:4: otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAtTimePrimary3077); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtTimeExpression_in_ruleAtTimePrimary3099);
                    this_AtTimeExpression_1=ruleAtTimeExpression();

                    state._fsp--;

                     
                            current = this_AtTimeExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAtTimePrimary3110); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1424:5: this_AtTimeAtomic_3= ruleAtTimeAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtTimeAtomic_in_ruleAtTimePrimary3139);
                    this_AtTimeAtomic_3=ruleAtTimeAtomic();

                    state._fsp--;

                     
                            current = this_AtTimeAtomic_3; 
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
    // $ANTLR end "ruleAtTimePrimary"


    // $ANTLR start "entryRuleAtTimeAtomic"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1440:1: entryRuleAtTimeAtomic returns [EObject current=null] : iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF ;
    public final EObject entryRuleAtTimeAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimeAtomic = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1441:2: (iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1442:2: iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic3174);
            iv_ruleAtTimeAtomic=ruleAtTimeAtomic();

            state._fsp--;

             current =iv_ruleAtTimeAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeAtomic3184); 

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
    // $ANTLR end "entryRuleAtTimeAtomic"


    // $ANTLR start "ruleAtTimeAtomic"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1449:1: ruleAtTimeAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) ) ;
    public final EObject ruleAtTimeAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_atTimeValue_3_0=null;

         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1452:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1453:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1453:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1453:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1453:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1453:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1453:3: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1454:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1459:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1460:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1460:1: (lv_value_1_0= RULE_INT )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1461:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtTimeAtomic3236); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtTimeAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1478:6: ( () ( (lv_atTimeValue_3_0= 'now' ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1478:6: ( () ( (lv_atTimeValue_3_0= 'now' ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1478:7: () ( (lv_atTimeValue_3_0= 'now' ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1478:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1479:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1484:2: ( (lv_atTimeValue_3_0= 'now' ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1485:1: (lv_atTimeValue_3_0= 'now' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1485:1: (lv_atTimeValue_3_0= 'now' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1486:3: lv_atTimeValue_3_0= 'now'
                    {
                    lv_atTimeValue_3_0=(Token)match(input,39,FOLLOW_39_in_ruleAtTimeAtomic3276); 

                            newLeafNode(lv_atTimeValue_3_0, grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtTimeAtomicRule());
                    	        }
                           		setWithLastConsumed(current, "atTimeValue", lv_atTimeValue_3_0, "now");
                    	    

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
    // $ANTLR end "ruleAtTimeAtomic"


    // $ANTLR start "entryRuleInExpr"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1507:1: entryRuleInExpr returns [EObject current=null] : iv_ruleInExpr= ruleInExpr EOF ;
    public final EObject entryRuleInExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpr = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1508:2: (iv_ruleInExpr= ruleInExpr EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1509:2: iv_ruleInExpr= ruleInExpr EOF
            {
             newCompositeNode(grammarAccess.getInExprRule()); 
            pushFollow(FOLLOW_ruleInExpr_in_entryRuleInExpr3326);
            iv_ruleInExpr=ruleInExpr();

            state._fsp--;

             current =iv_ruleInExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpr3336); 

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
    // $ANTLR end "entryRuleInExpr"


    // $ANTLR start "ruleInExpr"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1516:1: ruleInExpr returns [EObject current=null] : this_InTimeExpression_0= ruleInTimeExpression ;
    public final EObject ruleInExpr() throws RecognitionException {
        EObject current = null;

        EObject this_InTimeExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1519:28: (this_InTimeExpression_0= ruleInTimeExpression )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1521:5: this_InTimeExpression_0= ruleInTimeExpression
            {
             
                    newCompositeNode(grammarAccess.getInExprAccess().getInTimeExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleInTimeExpression_in_ruleInExpr3382);
            this_InTimeExpression_0=ruleInTimeExpression();

            state._fsp--;

             
                    current = this_InTimeExpression_0; 
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
    // $ANTLR end "ruleInExpr"


    // $ANTLR start "entryRuleInTimeExpression"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1537:1: entryRuleInTimeExpression returns [EObject current=null] : iv_ruleInTimeExpression= ruleInTimeExpression EOF ;
    public final EObject entryRuleInTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInTimeExpression = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1538:2: (iv_ruleInTimeExpression= ruleInTimeExpression EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1539:2: iv_ruleInTimeExpression= ruleInTimeExpression EOF
            {
             newCompositeNode(grammarAccess.getInTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_entryRuleInTimeExpression3416);
            iv_ruleInTimeExpression=ruleInTimeExpression();

            state._fsp--;

             current =iv_ruleInTimeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimeExpression3426); 

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
    // $ANTLR end "entryRuleInTimeExpression"


    // $ANTLR start "ruleInTimeExpression"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1546:1: ruleInTimeExpression returns [EObject current=null] : (this_InTimePrimary_0= ruleInTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) ) )* ) ;
    public final EObject ruleInTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_InTimePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1549:28: ( (this_InTimePrimary_0= ruleInTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) ) )* ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1550:1: (this_InTimePrimary_0= ruleInTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) ) )* )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1550:1: (this_InTimePrimary_0= ruleInTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) ) )* )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1551:5: this_InTimePrimary_0= ruleInTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getInTimeExpressionAccess().getInTimePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInTimePrimary_in_ruleInTimeExpression3473);
            this_InTimePrimary_0=ruleInTimePrimary();

            state._fsp--;

             
                    current = this_InTimePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1559:1: ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=29 && LA26_0<=30)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1559:2: () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleInTimePrimary ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1559:2: ()
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1560:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1565:2: ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1566:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1566:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1567:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1567:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==30) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==29) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1568:3: lv_op_2_1= '-'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_30_in_ruleInTimeExpression3502); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getInTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1580:8: lv_op_2_2= '+'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_29_in_ruleInTimeExpression3531); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getInTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getInTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1595:2: ( (lv_right_3_0= ruleInTimePrimary ) )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1596:1: (lv_right_3_0= ruleInTimePrimary )
            	    {
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1596:1: (lv_right_3_0= ruleInTimePrimary )
            	    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1597:3: lv_right_3_0= ruleInTimePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInTimeExpressionAccess().getRightInTimePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInTimePrimary_in_ruleInTimeExpression3568);
            	    lv_right_3_0=ruleInTimePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInTimeExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"InTimePrimary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleInTimeExpression"


    // $ANTLR start "entryRuleInTimePrimary"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1621:1: entryRuleInTimePrimary returns [EObject current=null] : iv_ruleInTimePrimary= ruleInTimePrimary EOF ;
    public final EObject entryRuleInTimePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInTimePrimary = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1622:2: (iv_ruleInTimePrimary= ruleInTimePrimary EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1623:2: iv_ruleInTimePrimary= ruleInTimePrimary EOF
            {
             newCompositeNode(grammarAccess.getInTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_entryRuleInTimePrimary3606);
            iv_ruleInTimePrimary=ruleInTimePrimary();

            state._fsp--;

             current =iv_ruleInTimePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimePrimary3616); 

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
    // $ANTLR end "entryRuleInTimePrimary"


    // $ANTLR start "ruleInTimePrimary"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1630:1: ruleInTimePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')' ) | this_InTimeAtomic_3= ruleInTimeAtomic ) ;
    public final EObject ruleInTimePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_InExpr_1 = null;

        EObject this_InTimeAtomic_3 = null;


         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1633:28: ( ( (otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')' ) | this_InTimeAtomic_3= ruleInTimeAtomic ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1634:1: ( (otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')' ) | this_InTimeAtomic_3= ruleInTimeAtomic )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1634:1: ( (otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')' ) | this_InTimeAtomic_3= ruleInTimeAtomic )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_INT||LA27_0==39) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1634:2: (otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1634:2: (otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1634:4: otherlv_0= '(' this_InExpr_1= ruleInExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleInTimePrimary3654); 

                        	newLeafNode(otherlv_0, grammarAccess.getInTimePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getInTimePrimaryAccess().getInExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleInExpr_in_ruleInTimePrimary3676);
                    this_InExpr_1=ruleInExpr();

                    state._fsp--;

                     
                            current = this_InExpr_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInTimePrimary3687); 

                        	newLeafNode(otherlv_2, grammarAccess.getInTimePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1653:5: this_InTimeAtomic_3= ruleInTimeAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getInTimePrimaryAccess().getInTimeAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInTimeAtomic_in_ruleInTimePrimary3716);
                    this_InTimeAtomic_3=ruleInTimeAtomic();

                    state._fsp--;

                     
                            current = this_InTimeAtomic_3; 
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
    // $ANTLR end "ruleInTimePrimary"


    // $ANTLR start "entryRuleInTimeAtomic"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1669:1: entryRuleInTimeAtomic returns [EObject current=null] : iv_ruleInTimeAtomic= ruleInTimeAtomic EOF ;
    public final EObject entryRuleInTimeAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInTimeAtomic = null;


        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1670:2: (iv_ruleInTimeAtomic= ruleInTimeAtomic EOF )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1671:2: iv_ruleInTimeAtomic= ruleInTimeAtomic EOF
            {
             newCompositeNode(grammarAccess.getInTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleInTimeAtomic_in_entryRuleInTimeAtomic3751);
            iv_ruleInTimeAtomic=ruleInTimeAtomic();

            state._fsp--;

             current =iv_ruleInTimeAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimeAtomic3761); 

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
    // $ANTLR end "entryRuleInTimeAtomic"


    // $ANTLR start "ruleInTimeAtomic"
    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1678:1: ruleInTimeAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_inTimeValue_3_0= 'now' ) ) ) ) ;
    public final EObject ruleInTimeAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_inTimeValue_3_0=null;

         enterRule(); 
            
        try {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1681:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_inTimeValue_3_0= 'now' ) ) ) ) )
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1682:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_inTimeValue_3_0= 'now' ) ) ) )
            {
            // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1682:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_inTimeValue_3_0= 'now' ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1682:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1682:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1682:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1682:3: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1683:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1688:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1689:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1689:1: (lv_value_1_0= RULE_INT )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1690:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInTimeAtomic3813); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInTimeAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1707:6: ( () ( (lv_inTimeValue_3_0= 'now' ) ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1707:6: ( () ( (lv_inTimeValue_3_0= 'now' ) ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1707:7: () ( (lv_inTimeValue_3_0= 'now' ) )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1707:7: ()
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1708:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInTimeAtomicAccess().getInTimeCurrentTimeAction_1_0(),
                                current);
                        

                    }

                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1713:2: ( (lv_inTimeValue_3_0= 'now' ) )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1714:1: (lv_inTimeValue_3_0= 'now' )
                    {
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1714:1: (lv_inTimeValue_3_0= 'now' )
                    // ../org.project.droolsDSL2/src-gen/org/project/droolsDSL/parser/antlr/internal/InternalDdsl.g:1715:3: lv_inTimeValue_3_0= 'now'
                    {
                    lv_inTimeValue_3_0=(Token)match(input,39,FOLLOW_39_in_ruleInTimeAtomic3853); 

                            newLeafNode(lv_inTimeValue_3_0, grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInTimeAtomicRule());
                    	        }
                           		setWithLastConsumed(current, "inTimeValue", lv_inTimeValue_3_0, "now");
                    	    

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
    // $ANTLR end "ruleInTimeAtomic"

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent580 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFluent598 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleFluent619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFluent634 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent655 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFluent669 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionRule793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleToRule894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_ruleInRule995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_entryRuleEventFeature1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventFeature1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventFeature1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1269 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleOr1290 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1311 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1406 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1427 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1448 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality1543 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleEquality1572 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_24_in_ruleEquality1601 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality1638 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1733 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_ruleComparison1762 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_26_in_ruleComparison1791 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_27_in_ruleComparison1820 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_28_in_ruleComparison1849 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1886 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1981 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_rulePlusOrMinus2004 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_30_in_rulePlusOrMinus2033 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2056 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2151 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_31_in_ruleMulOrDiv2180 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_32_in_ruleMulOrDiv2209 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_33_in_ruleMulOrDiv2238 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv2267 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2304 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimary2390 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary2412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimary2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimary2452 = new BitSet(new long[]{0x0000003800010070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAtomic2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAtomic2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAtomic2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2762 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleAtomic2775 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtomic2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeExpression2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression2896 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30_in_ruleAtTimeExpression2925 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_29_in_ruleAtTimeExpression2954 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression2991 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimePrimary3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAtTimePrimary3077 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_ruleAtTimePrimary3099 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtTimePrimary3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_ruleAtTimePrimary3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic3174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeAtomic3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtTimeAtomic3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAtTimeAtomic3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpr_in_entryRuleInExpr3326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpr3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_ruleInExpr3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_entryRuleInTimeExpression3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimeExpression3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_ruleInTimeExpression3473 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30_in_ruleInTimeExpression3502 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_29_in_ruleInTimeExpression3531 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_ruleInTimeExpression3568 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_entryRuleInTimePrimary3606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimePrimary3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInTimePrimary3654 = new BitSet(new long[]{0x0000008000010040L});
    public static final BitSet FOLLOW_ruleInExpr_in_ruleInTimePrimary3676 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInTimePrimary3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_ruleInTimePrimary3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_entryRuleInTimeAtomic3751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimeAtomic3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInTimeAtomic3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInTimeAtomic3853 = new BitSet(new long[]{0x0000000000000002L});

}