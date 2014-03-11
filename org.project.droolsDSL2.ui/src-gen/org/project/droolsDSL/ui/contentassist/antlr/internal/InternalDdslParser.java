package org.project.droolsDSL.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.project.droolsDSL.services.DdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDdslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'-'", "'+'", "'on'", "'set'", "';'", "','", "'('", "')'", "'in'", "'to'", "'if'", "'OR'", "'AND'", "'!'", "'at'"
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
    public String getGrammarFileName() { return "../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g"; }


     
     	private DdslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DdslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDroolsModel"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:60:1: entryRuleDroolsModel : ruleDroolsModel EOF ;
    public final void entryRuleDroolsModel() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:61:1: ( ruleDroolsModel EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:62:1: ruleDroolsModel EOF
            {
             before(grammarAccess.getDroolsModelRule()); 
            pushFollow(FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel61);
            ruleDroolsModel();

            state._fsp--;

             after(grammarAccess.getDroolsModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDroolsModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDroolsModel"


    // $ANTLR start "ruleDroolsModel"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:69:1: ruleDroolsModel : ( ( rule__DroolsModel__StatementsAssignment )* ) ;
    public final void ruleDroolsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:73:2: ( ( ( rule__DroolsModel__StatementsAssignment )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:74:1: ( ( rule__DroolsModel__StatementsAssignment )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:74:1: ( ( rule__DroolsModel__StatementsAssignment )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:75:1: ( rule__DroolsModel__StatementsAssignment )*
            {
             before(grammarAccess.getDroolsModelAccess().getStatementsAssignment()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:76:1: ( rule__DroolsModel__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:76:2: rule__DroolsModel__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DroolsModel__StatementsAssignment_in_ruleDroolsModel94);
            	    rule__DroolsModel__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDroolsModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDroolsModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:89:1: ( ruleStatement EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement122);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:97:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:101:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:102:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:102:1: ( ( rule__Statement__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:103:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:104:1: ( rule__Statement__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:104:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement155);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:116:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:117:1: ( ruleEvent EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:118:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent182);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:125:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:129:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:130:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:130:1: ( ( rule__Event__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:131:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:132:1: ( rule__Event__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:132:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent215);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleFluent"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:144:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:145:1: ( ruleFluent EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:146:1: ruleFluent EOF
            {
             before(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent242);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getFluentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFluent"


    // $ANTLR start "ruleFluent"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:153:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:157:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:158:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:158:1: ( ( rule__Fluent__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:159:1: ( rule__Fluent__Group__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:160:1: ( rule__Fluent__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:160:2: rule__Fluent__Group__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0_in_ruleFluent275);
            rule__Fluent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFluent"


    // $ANTLR start "entryRuleConditionRule"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:172:1: entryRuleConditionRule : ruleConditionRule EOF ;
    public final void entryRuleConditionRule() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:173:1: ( ruleConditionRule EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:174:1: ruleConditionRule EOF
            {
             before(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule302);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getConditionRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionRule"


    // $ANTLR start "ruleConditionRule"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:181:1: ruleConditionRule : ( ( rule__ConditionRule__Group__0 ) ) ;
    public final void ruleConditionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:185:2: ( ( ( rule__ConditionRule__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:186:1: ( ( rule__ConditionRule__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:186:1: ( ( rule__ConditionRule__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:187:1: ( rule__ConditionRule__Group__0 )
            {
             before(grammarAccess.getConditionRuleAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:188:1: ( rule__ConditionRule__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:188:2: rule__ConditionRule__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0_in_ruleConditionRule335);
            rule__ConditionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionRule"


    // $ANTLR start "entryRuleToRule"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:200:1: entryRuleToRule : ruleToRule EOF ;
    public final void entryRuleToRule() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:201:1: ( ruleToRule EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:202:1: ruleToRule EOF
            {
             before(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule362);
            ruleToRule();

            state._fsp--;

             after(grammarAccess.getToRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToRule"


    // $ANTLR start "ruleToRule"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:209:1: ruleToRule : ( ( rule__ToRule__Group__0 ) ) ;
    public final void ruleToRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:213:2: ( ( ( rule__ToRule__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:214:1: ( ( rule__ToRule__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:214:1: ( ( rule__ToRule__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:215:1: ( rule__ToRule__Group__0 )
            {
             before(grammarAccess.getToRuleAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:216:1: ( rule__ToRule__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:216:2: rule__ToRule__Group__0
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0_in_ruleToRule395);
            rule__ToRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToRule"


    // $ANTLR start "entryRuleInRule"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:228:1: entryRuleInRule : ruleInRule EOF ;
    public final void entryRuleInRule() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:229:1: ( ruleInRule EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:230:1: ruleInRule EOF
            {
             before(grammarAccess.getInRuleRule()); 
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule422);
            ruleInRule();

            state._fsp--;

             after(grammarAccess.getInRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInRule"


    // $ANTLR start "ruleInRule"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:237:1: ruleInRule : ( ( rule__InRule__Group__0 ) ) ;
    public final void ruleInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:241:2: ( ( ( rule__InRule__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:242:1: ( ( rule__InRule__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:242:1: ( ( rule__InRule__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:243:1: ( rule__InRule__Group__0 )
            {
             before(grammarAccess.getInRuleAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:244:1: ( rule__InRule__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:244:2: rule__InRule__Group__0
            {
            pushFollow(FOLLOW_rule__InRule__Group__0_in_ruleInRule455);
            rule__InRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInRule"


    // $ANTLR start "entryRuleEventFeature"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:256:1: entryRuleEventFeature : ruleEventFeature EOF ;
    public final void entryRuleEventFeature() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:257:1: ( ruleEventFeature EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:258:1: ruleEventFeature EOF
            {
             before(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_ruleEventFeature_in_entryRuleEventFeature482);
            ruleEventFeature();

            state._fsp--;

             after(grammarAccess.getEventFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventFeature489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventFeature"


    // $ANTLR start "ruleEventFeature"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:265:1: ruleEventFeature : ( ( rule__EventFeature__NameAssignment ) ) ;
    public final void ruleEventFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:269:2: ( ( ( rule__EventFeature__NameAssignment ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:270:1: ( ( rule__EventFeature__NameAssignment ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:270:1: ( ( rule__EventFeature__NameAssignment ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:271:1: ( rule__EventFeature__NameAssignment )
            {
             before(grammarAccess.getEventFeatureAccess().getNameAssignment()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:272:1: ( rule__EventFeature__NameAssignment )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:272:2: rule__EventFeature__NameAssignment
            {
            pushFollow(FOLLOW_rule__EventFeature__NameAssignment_in_ruleEventFeature515);
            rule__EventFeature__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventFeatureAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventFeature"


    // $ANTLR start "entryRuleExpression"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:284:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:285:1: ( ruleExpression EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:286:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression542);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:293:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:297:2: ( ( ruleOr ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:298:1: ( ruleOr )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:298:1: ( ruleOr )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:299:1: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_ruleOr_in_ruleExpression575);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:312:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:313:1: ( ruleOr EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:314:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr601);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:321:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:325:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:326:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:326:1: ( ( rule__Or__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:327:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:328:1: ( rule__Or__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:328:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr634);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:340:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:341:1: ( ruleAnd EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:342:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd661);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:349:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:353:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:354:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:354:1: ( ( rule__And__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:355:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:356:1: ( rule__And__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:356:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd694);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:368:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:369:1: ( ruleEquality EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:370:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality721);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:377:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:381:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:382:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:382:1: ( ( rule__Equality__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:383:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:384:1: ( rule__Equality__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:384:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality754);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:396:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:397:1: ( ruleComparison EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:398:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison781);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:405:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:409:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:410:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:410:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:411:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:412:1: ( rule__Comparison__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:412:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison814);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:424:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:425:1: ( rulePlusOrMinus EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:426:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus841);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:433:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:437:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:438:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:438:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:439:1: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:440:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:440:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus874);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:452:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:453:1: ( ruleMulOrDiv EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:454:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv901);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:461:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:465:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:466:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:466:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:467:1: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:468:1: ( rule__MulOrDiv__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:468:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv934);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:480:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:481:1: ( rulePrimary EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:482:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary961);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:489:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:493:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:494:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:494:1: ( ( rule__Primary__Alternatives ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:495:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:496:1: ( rule__Primary__Alternatives )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:496:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary994);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:508:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:509:1: ( ruleAtomic EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:510:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1021);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:517:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:521:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:522:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:522:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:523:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:524:1: ( rule__Atomic__Alternatives )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:524:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1054);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleAtTimeExpression"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:540:1: entryRuleAtTimeExpression : ruleAtTimeExpression EOF ;
    public final void entryRuleAtTimeExpression() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:541:1: ( ruleAtTimeExpression EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:542:1: ruleAtTimeExpression EOF
            {
             before(grammarAccess.getAtTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression1085);
            ruleAtTimeExpression();

            state._fsp--;

             after(grammarAccess.getAtTimeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeExpression1092); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtTimeExpression"


    // $ANTLR start "ruleAtTimeExpression"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:549:1: ruleAtTimeExpression : ( ( rule__AtTimeExpression__Group__0 ) ) ;
    public final void ruleAtTimeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:553:2: ( ( ( rule__AtTimeExpression__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:554:1: ( ( rule__AtTimeExpression__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:554:1: ( ( rule__AtTimeExpression__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:555:1: ( rule__AtTimeExpression__Group__0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:556:1: ( rule__AtTimeExpression__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:556:2: rule__AtTimeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0_in_ruleAtTimeExpression1118);
            rule__AtTimeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtTimeExpression"


    // $ANTLR start "entryRuleAtTimePrimary"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:568:1: entryRuleAtTimePrimary : ruleAtTimePrimary EOF ;
    public final void entryRuleAtTimePrimary() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:569:1: ( ruleAtTimePrimary EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:570:1: ruleAtTimePrimary EOF
            {
             before(grammarAccess.getAtTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary1145);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtTimePrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimePrimary1152); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtTimePrimary"


    // $ANTLR start "ruleAtTimePrimary"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:577:1: ruleAtTimePrimary : ( ( rule__AtTimePrimary__Alternatives ) ) ;
    public final void ruleAtTimePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:581:2: ( ( ( rule__AtTimePrimary__Alternatives ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:582:1: ( ( rule__AtTimePrimary__Alternatives ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:582:1: ( ( rule__AtTimePrimary__Alternatives ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:583:1: ( rule__AtTimePrimary__Alternatives )
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAlternatives()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:584:1: ( rule__AtTimePrimary__Alternatives )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:584:2: rule__AtTimePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Alternatives_in_ruleAtTimePrimary1178);
            rule__AtTimePrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtTimePrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtTimePrimary"


    // $ANTLR start "entryRuleAtTimeAtomic"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:596:1: entryRuleAtTimeAtomic : ruleAtTimeAtomic EOF ;
    public final void entryRuleAtTimeAtomic() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:597:1: ( ruleAtTimeAtomic EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:598:1: ruleAtTimeAtomic EOF
            {
             before(grammarAccess.getAtTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic1205);
            ruleAtTimeAtomic();

            state._fsp--;

             after(grammarAccess.getAtTimeAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeAtomic1212); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtTimeAtomic"


    // $ANTLR start "ruleAtTimeAtomic"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:605:1: ruleAtTimeAtomic : ( ( rule__AtTimeAtomic__Group__0 ) ) ;
    public final void ruleAtTimeAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:609:2: ( ( ( rule__AtTimeAtomic__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:610:1: ( ( rule__AtTimeAtomic__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:610:1: ( ( rule__AtTimeAtomic__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:611:1: ( rule__AtTimeAtomic__Group__0 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:612:1: ( rule__AtTimeAtomic__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:612:2: rule__AtTimeAtomic__Group__0
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group__0_in_ruleAtTimeAtomic1238);
            rule__AtTimeAtomic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtTimeAtomic"


    // $ANTLR start "entryRuleInExpr"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:624:1: entryRuleInExpr : ruleInExpr EOF ;
    public final void entryRuleInExpr() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:625:1: ( ruleInExpr EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:626:1: ruleInExpr EOF
            {
             before(grammarAccess.getInExprRule()); 
            pushFollow(FOLLOW_ruleInExpr_in_entryRuleInExpr1265);
            ruleInExpr();

            state._fsp--;

             after(grammarAccess.getInExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpr1272); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInExpr"


    // $ANTLR start "ruleInExpr"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:633:1: ruleInExpr : ( ruleInTimeExpression ) ;
    public final void ruleInExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:637:2: ( ( ruleInTimeExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:638:1: ( ruleInTimeExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:638:1: ( ruleInTimeExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:639:1: ruleInTimeExpression
            {
             before(grammarAccess.getInExprAccess().getInTimeExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_ruleInExpr1298);
            ruleInTimeExpression();

            state._fsp--;

             after(grammarAccess.getInExprAccess().getInTimeExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInExpr"


    // $ANTLR start "entryRuleInTimeExpression"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:652:1: entryRuleInTimeExpression : ruleInTimeExpression EOF ;
    public final void entryRuleInTimeExpression() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:653:1: ( ruleInTimeExpression EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:654:1: ruleInTimeExpression EOF
            {
             before(grammarAccess.getInTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_entryRuleInTimeExpression1324);
            ruleInTimeExpression();

            state._fsp--;

             after(grammarAccess.getInTimeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimeExpression1331); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInTimeExpression"


    // $ANTLR start "ruleInTimeExpression"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:661:1: ruleInTimeExpression : ( ( rule__InTimeExpression__Group__0 ) ) ;
    public final void ruleInTimeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:665:2: ( ( ( rule__InTimeExpression__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:666:1: ( ( rule__InTimeExpression__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:666:1: ( ( rule__InTimeExpression__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:667:1: ( rule__InTimeExpression__Group__0 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:668:1: ( rule__InTimeExpression__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:668:2: rule__InTimeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__0_in_ruleInTimeExpression1357);
            rule__InTimeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTimeExpression"


    // $ANTLR start "entryRuleInTimePrimary"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:680:1: entryRuleInTimePrimary : ruleInTimePrimary EOF ;
    public final void entryRuleInTimePrimary() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:681:1: ( ruleInTimePrimary EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:682:1: ruleInTimePrimary EOF
            {
             before(grammarAccess.getInTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_entryRuleInTimePrimary1384);
            ruleInTimePrimary();

            state._fsp--;

             after(grammarAccess.getInTimePrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimePrimary1391); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInTimePrimary"


    // $ANTLR start "ruleInTimePrimary"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:689:1: ruleInTimePrimary : ( ( rule__InTimePrimary__Alternatives ) ) ;
    public final void ruleInTimePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:693:2: ( ( ( rule__InTimePrimary__Alternatives ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:694:1: ( ( rule__InTimePrimary__Alternatives ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:694:1: ( ( rule__InTimePrimary__Alternatives ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:695:1: ( rule__InTimePrimary__Alternatives )
            {
             before(grammarAccess.getInTimePrimaryAccess().getAlternatives()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:696:1: ( rule__InTimePrimary__Alternatives )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:696:2: rule__InTimePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Alternatives_in_ruleInTimePrimary1417);
            rule__InTimePrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInTimePrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTimePrimary"


    // $ANTLR start "entryRuleInTimeAtomic"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:708:1: entryRuleInTimeAtomic : ruleInTimeAtomic EOF ;
    public final void entryRuleInTimeAtomic() throws RecognitionException {
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:709:1: ( ruleInTimeAtomic EOF )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:710:1: ruleInTimeAtomic EOF
            {
             before(grammarAccess.getInTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleInTimeAtomic_in_entryRuleInTimeAtomic1444);
            ruleInTimeAtomic();

            state._fsp--;

             after(grammarAccess.getInTimeAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimeAtomic1451); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInTimeAtomic"


    // $ANTLR start "ruleInTimeAtomic"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:717:1: ruleInTimeAtomic : ( ( rule__InTimeAtomic__Group__0 ) ) ;
    public final void ruleInTimeAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:721:2: ( ( ( rule__InTimeAtomic__Group__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:722:1: ( ( rule__InTimeAtomic__Group__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:722:1: ( ( rule__InTimeAtomic__Group__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:723:1: ( rule__InTimeAtomic__Group__0 )
            {
             before(grammarAccess.getInTimeAtomicAccess().getGroup()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:724:1: ( rule__InTimeAtomic__Group__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:724:2: rule__InTimeAtomic__Group__0
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group__0_in_ruleInTimeAtomic1477);
            rule__InTimeAtomic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTimeAtomic"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:736:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:740:1: ( ( '==' ) | ( '!=' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:741:1: ( '==' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:741:1: ( '==' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:742:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_01514); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:749:6: ( '!=' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:749:6: ( '!=' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:750:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_01534); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:762:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:766:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:767:1: ( '>=' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:767:1: ( '>=' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:768:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_01569); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:775:6: ( '<=' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:775:6: ( '<=' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:776:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_01589); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:783:6: ( '>' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:783:6: ( '>' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:784:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,16,FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_01609); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:791:6: ( '<' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:791:6: ( '<' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:792:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,17,FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01629); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:804:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:808:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:809:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:809:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:810:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:811:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:811:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01663);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:815:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:815:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:816:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:817:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:817:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01681);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:826:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:830:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:831:1: ( '*' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:831:1: ( '*' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:832:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__MulOrDiv__OpAlternatives_1_1_01715); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:839:6: ( '/' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:839:6: ( '/' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:840:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__MulOrDiv__OpAlternatives_1_1_01735); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:847:6: ( '%' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:847:6: ( '%' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:848:1: '%'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__MulOrDiv__OpAlternatives_1_1_01755); 
                     after(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:855:6: ( '^' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:855:6: ( '^' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:856:1: '^'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_01775); 
                     after(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:868:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:872:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
            case RULE_FLOAT:
            case RULE_INT:
            case 22:
            case 23:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:873:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:873:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:874:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:875:1: ( rule__Primary__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:875:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1809);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:879:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:879:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:880:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:881:1: ( rule__Primary__Group_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:881:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1827);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:885:6: ( ruleAtomic )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:885:6: ( ruleAtomic )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:886:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1845);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:896:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:900:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 22:
            case 23:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:901:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:901:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:902:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:903:1: ( rule__Atomic__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:903:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1877);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:907:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:907:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:908:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:909:1: ( rule__Atomic__Group_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:909:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1895);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:913:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:913:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:914:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:915:1: ( rule__Atomic__Group_2__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:915:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1913);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:919:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:919:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:920:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:921:1: ( rule__Atomic__Group_3__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:921:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1931);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:930:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:934:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:935:1: ( 'true' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:935:1: ( 'true' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:936:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Atomic__ValueAlternatives_2_1_01965); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:943:6: ( 'false' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:943:6: ( 'false' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:944:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Atomic__ValueAlternatives_2_1_01985); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__AtTimeExpression__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:957:1: rule__AtTimeExpression__OpAlternatives_1_1_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__AtTimeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:961:1: ( ( '-' ) | ( '+' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:962:1: ( '-' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:962:1: ( '-' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:963:1: '-'
                    {
                     before(grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__AtTimeExpression__OpAlternatives_1_1_02021); 
                     after(grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:970:6: ( '+' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:970:6: ( '+' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:971:1: '+'
                    {
                     before(grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__AtTimeExpression__OpAlternatives_1_1_02041); 
                     after(grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__AtTimePrimary__Alternatives"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:983:1: rule__AtTimePrimary__Alternatives : ( ( ( rule__AtTimePrimary__Group_0__0 ) ) | ( ruleAtTimeAtomic ) );
    public final void rule__AtTimePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:987:1: ( ( ( rule__AtTimePrimary__Group_0__0 ) ) | ( ruleAtTimeAtomic ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:988:1: ( ( rule__AtTimePrimary__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:988:1: ( ( rule__AtTimePrimary__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:989:1: ( rule__AtTimePrimary__Group_0__0 )
                    {
                     before(grammarAccess.getAtTimePrimaryAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:990:1: ( rule__AtTimePrimary__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:990:2: rule__AtTimePrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0_in_rule__AtTimePrimary__Alternatives2075);
                    rule__AtTimePrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimePrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:994:6: ( ruleAtTimeAtomic )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:994:6: ( ruleAtTimeAtomic )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:995:1: ruleAtTimeAtomic
                    {
                     before(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtTimeAtomic_in_rule__AtTimePrimary__Alternatives2093);
                    ruleAtTimeAtomic();

                    state._fsp--;

                     after(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Alternatives"


    // $ANTLR start "rule__InTimeExpression__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1005:1: rule__InTimeExpression__OpAlternatives_1_1_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__InTimeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1009:1: ( ( '-' ) | ( '+' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1010:1: ( '-' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1010:1: ( '-' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1011:1: '-'
                    {
                     before(grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__InTimeExpression__OpAlternatives_1_1_02126); 
                     after(grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1018:6: ( '+' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1018:6: ( '+' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1019:1: '+'
                    {
                     before(grammarAccess.getInTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__InTimeExpression__OpAlternatives_1_1_02146); 
                     after(grammarAccess.getInTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__InTimePrimary__Alternatives"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1031:1: rule__InTimePrimary__Alternatives : ( ( ( rule__InTimePrimary__Group_0__0 ) ) | ( ruleInTimeAtomic ) );
    public final void rule__InTimePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1035:1: ( ( ( rule__InTimePrimary__Group_0__0 ) ) | ( ruleInTimeAtomic ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1036:1: ( ( rule__InTimePrimary__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1036:1: ( ( rule__InTimePrimary__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1037:1: ( rule__InTimePrimary__Group_0__0 )
                    {
                     before(grammarAccess.getInTimePrimaryAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1038:1: ( rule__InTimePrimary__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1038:2: rule__InTimePrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InTimePrimary__Group_0__0_in_rule__InTimePrimary__Alternatives2180);
                    rule__InTimePrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimePrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1042:6: ( ruleInTimeAtomic )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1042:6: ( ruleInTimeAtomic )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1043:1: ruleInTimeAtomic
                    {
                     before(grammarAccess.getInTimePrimaryAccess().getInTimeAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInTimeAtomic_in_rule__InTimePrimary__Alternatives2198);
                    ruleInTimeAtomic();

                    state._fsp--;

                     after(grammarAccess.getInTimePrimaryAccess().getInTimeAtomicParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1055:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1059:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1060:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02228);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02231);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1067:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1071:1: ( ( 'on' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1072:1: ( 'on' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1072:1: ( 'on' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1073:1: 'on'
            {
             before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Statement__Group__0__Impl2259); 
             after(grammarAccess.getStatementAccess().getOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1086:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1090:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1091:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12290);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12293);
            rule__Statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1098:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1102:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1103:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1103:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1104:1: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1105:1: ( rule__Statement__EventAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1105:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2320);
            rule__Statement__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1115:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1119:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1120:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22350);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22353);
            rule__Statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1127:1: rule__Statement__Group__2__Impl : ( 'set' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1131:1: ( ( 'set' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1132:1: ( 'set' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1132:1: ( 'set' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1133:1: 'set'
            {
             before(grammarAccess.getStatementAccess().getSetKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Statement__Group__2__Impl2381); 
             after(grammarAccess.getStatementAccess().getSetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1146:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1150:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1151:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32412);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32415);
            rule__Statement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1158:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__FluentAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1162:1: ( ( ( rule__Statement__FluentAssignment_3 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1163:1: ( ( rule__Statement__FluentAssignment_3 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1163:1: ( ( rule__Statement__FluentAssignment_3 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1164:1: ( rule__Statement__FluentAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getFluentAssignment_3()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1165:1: ( rule__Statement__FluentAssignment_3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1165:2: rule__Statement__FluentAssignment_3
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl2442);
            rule__Statement__FluentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFluentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__4"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1175:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1179:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1180:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42472);
            rule__Statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42475);
            rule__Statement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4"


    // $ANTLR start "rule__Statement__Group__4__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1187:1: rule__Statement__Group__4__Impl : ( ( rule__Statement__Group_4__0 )* ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1191:1: ( ( ( rule__Statement__Group_4__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1192:1: ( ( rule__Statement__Group_4__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1192:1: ( ( rule__Statement__Group_4__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1193:1: ( rule__Statement__Group_4__0 )*
            {
             before(grammarAccess.getStatementAccess().getGroup_4()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1194:1: ( rule__Statement__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1194:2: rule__Statement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl2502);
            	    rule__Statement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4__Impl"


    // $ANTLR start "rule__Statement__Group__5"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1204:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1208:1: ( rule__Statement__Group__5__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1209:2: rule__Statement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__52533);
            rule__Statement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__5"


    // $ANTLR start "rule__Statement__Group__5__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1215:1: rule__Statement__Group__5__Impl : ( ';' ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1219:1: ( ( ';' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1220:1: ( ';' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1220:1: ( ';' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1221:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Statement__Group__5__Impl2561); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__5__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1246:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1250:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1251:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02604);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02607);
            rule__Statement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1258:1: rule__Statement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1262:1: ( ( ',' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1263:1: ( ',' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1263:1: ( ',' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1264:1: ','
            {
             before(grammarAccess.getStatementAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group_4__0__Impl2635); 
             after(grammarAccess.getStatementAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1277:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1281:1: ( rule__Statement__Group_4__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1282:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12666);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1288:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__FluentAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1292:1: ( ( ( rule__Statement__FluentAssignment_4_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1293:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1293:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1294:1: ( rule__Statement__FluentAssignment_4_1 )
            {
             before(grammarAccess.getStatementAccess().getFluentAssignment_4_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1295:1: ( rule__Statement__FluentAssignment_4_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1295:2: rule__Statement__FluentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2693);
            rule__Statement__FluentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFluentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1309:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1313:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1314:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02727);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02730);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1321:1: rule__Event__Group__0__Impl : ( ( rule__Event__EventNameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1325:1: ( ( ( rule__Event__EventNameAssignment_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1326:1: ( ( rule__Event__EventNameAssignment_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1326:1: ( ( rule__Event__EventNameAssignment_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1327:1: ( rule__Event__EventNameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1328:1: ( rule__Event__EventNameAssignment_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1328:2: rule__Event__EventNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2757);
            rule__Event__EventNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1338:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1342:1: ( rule__Event__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1343:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12787);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1349:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1353:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1354:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1354:1: ( ( rule__Event__Group_1__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1355:1: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1356:1: ( rule__Event__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1356:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2814);
                    rule__Event__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1370:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1374:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1375:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02849);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02852);
            rule__Event__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1382:1: rule__Event__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1386:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1387:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1387:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1388:1: '('
            {
             before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Event__Group_1__0__Impl2880); 
             after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1401:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1405:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1406:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12911);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12914);
            rule__Event__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1413:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__ParamAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1417:1: ( ( ( rule__Event__ParamAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1418:1: ( ( rule__Event__ParamAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1418:1: ( ( rule__Event__ParamAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1419:1: ( rule__Event__ParamAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getParamAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1420:1: ( rule__Event__ParamAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1420:2: rule__Event__ParamAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__ParamAssignment_1_1_in_rule__Event__Group_1__1__Impl2941);
            rule__Event__ParamAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getParamAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Event__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1430:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1434:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1435:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22971);
            rule__Event__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22974);
            rule__Event__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2"


    // $ANTLR start "rule__Event__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1442:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1446:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1447:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1447:1: ( ( rule__Event__Group_1_2__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1448:1: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1449:1: ( rule__Event__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1449:2: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl3001);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2__Impl"


    // $ANTLR start "rule__Event__Group_1__3"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1459:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1463:1: ( rule__Event__Group_1__3__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1464:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__33032);
            rule__Event__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__3"


    // $ANTLR start "rule__Event__Group_1__3__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1470:1: rule__Event__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1474:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1475:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1475:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1476:1: ')'
            {
             before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Event__Group_1__3__Impl3060); 
             after(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__3__Impl"


    // $ANTLR start "rule__Event__Group_1_2__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1497:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1501:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1502:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03099);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03102);
            rule__Event__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__0"


    // $ANTLR start "rule__Event__Group_1_2__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1509:1: rule__Event__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1513:1: ( ( ',' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1514:1: ( ',' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1514:1: ( ',' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1515:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Event__Group_1_2__0__Impl3130); 
             after(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__0__Impl"


    // $ANTLR start "rule__Event__Group_1_2__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1528:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1532:1: ( rule__Event__Group_1_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1533:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13161);
            rule__Event__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__1"


    // $ANTLR start "rule__Event__Group_1_2__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1539:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__ParamAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1543:1: ( ( ( rule__Event__ParamAssignment_1_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1544:1: ( ( rule__Event__ParamAssignment_1_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1544:1: ( ( rule__Event__ParamAssignment_1_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1545:1: ( rule__Event__ParamAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getParamAssignment_1_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1546:1: ( rule__Event__ParamAssignment_1_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1546:2: rule__Event__ParamAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Event__ParamAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3188);
            rule__Event__ParamAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getParamAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__1__Impl"


    // $ANTLR start "rule__Fluent__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1560:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1564:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1565:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__03222);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__03225);
            rule__Fluent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__0"


    // $ANTLR start "rule__Fluent__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1572:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__NameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1576:1: ( ( ( rule__Fluent__NameAssignment_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1577:1: ( ( rule__Fluent__NameAssignment_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1577:1: ( ( rule__Fluent__NameAssignment_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1578:1: ( rule__Fluent__NameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getNameAssignment_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1579:1: ( rule__Fluent__NameAssignment_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1579:2: rule__Fluent__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl3252);
            rule__Fluent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__0__Impl"


    // $ANTLR start "rule__Fluent__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1589:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1593:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1594:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__13282);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__13285);
            rule__Fluent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__1"


    // $ANTLR start "rule__Fluent__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1601:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 )? ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1605:1: ( ( ( rule__Fluent__Group_1__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1606:1: ( ( rule__Fluent__Group_1__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1606:1: ( ( rule__Fluent__Group_1__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1607:1: ( rule__Fluent__Group_1__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1608:1: ( rule__Fluent__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1608:2: rule__Fluent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl3312);
                    rule__Fluent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFluentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__1__Impl"


    // $ANTLR start "rule__Fluent__Group__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1618:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1622:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1623:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__23343);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__23346);
            rule__Fluent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__2"


    // $ANTLR start "rule__Fluent__Group__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1630:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 ) ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1634:1: ( ( ( rule__Fluent__Group_2__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1635:1: ( ( rule__Fluent__Group_2__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1635:1: ( ( rule__Fluent__Group_2__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1636:1: ( rule__Fluent__Group_2__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1637:1: ( rule__Fluent__Group_2__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1637:2: rule__Fluent__Group_2__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl3373);
            rule__Fluent__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__2__Impl"


    // $ANTLR start "rule__Fluent__Group__3"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1647:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1651:1: ( rule__Fluent__Group__3__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1652:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__33403);
            rule__Fluent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__3"


    // $ANTLR start "rule__Fluent__Group__3__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1658:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1662:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1663:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1663:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1664:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1665:1: ( rule__Fluent__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1665:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl3430);
                    rule__Fluent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFluentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__3__Impl"


    // $ANTLR start "rule__Fluent__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1683:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1687:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1688:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__03469);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__03472);
            rule__Fluent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__0"


    // $ANTLR start "rule__Fluent__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1695:1: rule__Fluent__Group_1__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1699:1: ( ( 'in' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1700:1: ( 'in' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1700:1: ( 'in' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1701:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Fluent__Group_1__0__Impl3500); 
             after(grammarAccess.getFluentAccess().getInKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__0__Impl"


    // $ANTLR start "rule__Fluent__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1714:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1718:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1719:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__13531);
            rule__Fluent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__1"


    // $ANTLR start "rule__Fluent__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1725:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__TimePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1729:1: ( ( ( rule__Fluent__TimePartAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1730:1: ( ( rule__Fluent__TimePartAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1730:1: ( ( rule__Fluent__TimePartAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1731:1: ( rule__Fluent__TimePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1732:1: ( rule__Fluent__TimePartAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1732:2: rule__Fluent__TimePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl3558);
            rule__Fluent__TimePartAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getTimePartAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__1__Impl"


    // $ANTLR start "rule__Fluent__Group_2__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1746:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1750:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1751:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__03592);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__03595);
            rule__Fluent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__0"


    // $ANTLR start "rule__Fluent__Group_2__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1758:1: rule__Fluent__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1762:1: ( ( 'to' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1763:1: ( 'to' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1763:1: ( 'to' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1764:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Fluent__Group_2__0__Impl3623); 
             after(grammarAccess.getFluentAccess().getToKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__0__Impl"


    // $ANTLR start "rule__Fluent__Group_2__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1777:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1781:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1782:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13654);
            rule__Fluent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__1"


    // $ANTLR start "rule__Fluent__Group_2__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1788:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__ValuePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1792:1: ( ( ( rule__Fluent__ValuePartAssignment_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1793:1: ( ( rule__Fluent__ValuePartAssignment_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1793:1: ( ( rule__Fluent__ValuePartAssignment_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1794:1: ( rule__Fluent__ValuePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1795:1: ( rule__Fluent__ValuePartAssignment_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1795:2: rule__Fluent__ValuePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3681);
            rule__Fluent__ValuePartAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getValuePartAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__1__Impl"


    // $ANTLR start "rule__Fluent__Group_3__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1809:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1813:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1814:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03715);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03718);
            rule__Fluent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__0"


    // $ANTLR start "rule__Fluent__Group_3__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1821:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1825:1: ( ( 'if' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1826:1: ( 'if' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1826:1: ( 'if' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1827:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Fluent__Group_3__0__Impl3746); 
             after(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__0__Impl"


    // $ANTLR start "rule__Fluent__Group_3__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1840:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1844:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1845:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13777);
            rule__Fluent__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__1"


    // $ANTLR start "rule__Fluent__Group_3__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1851:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1855:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1856:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1856:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1857:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1858:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1858:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3804);
            rule__Fluent__CondPartAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__1__Impl"


    // $ANTLR start "rule__ConditionRule__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1872:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1876:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1877:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__03838);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__03841);
            rule__ConditionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__0"


    // $ANTLR start "rule__ConditionRule__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1884:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1888:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1889:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1889:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1890:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1891:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1893:1: 
            {
            }

             after(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__0__Impl"


    // $ANTLR start "rule__ConditionRule__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1903:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1907:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1908:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__13899);
            rule__ConditionRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__1"


    // $ANTLR start "rule__ConditionRule__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1914:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1918:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1919:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1919:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1920:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1921:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1921:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl3926);
            rule__ConditionRule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__1__Impl"


    // $ANTLR start "rule__ToRule__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1935:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1939:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1940:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__03960);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__03963);
            rule__ToRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__0"


    // $ANTLR start "rule__ToRule__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1947:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1951:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1952:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1952:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1953:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1954:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1956:1: 
            {
            }

             after(grammarAccess.getToRuleAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__0__Impl"


    // $ANTLR start "rule__ToRule__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1966:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1970:1: ( rule__ToRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1971:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__14021);
            rule__ToRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__1"


    // $ANTLR start "rule__ToRule__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1977:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1981:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1982:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1982:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1983:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1984:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1984:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl4048);
            rule__ToRule__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__1__Impl"


    // $ANTLR start "rule__InRule__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1998:1: rule__InRule__Group__0 : rule__InRule__Group__0__Impl rule__InRule__Group__1 ;
    public final void rule__InRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2002:1: ( rule__InRule__Group__0__Impl rule__InRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2003:2: rule__InRule__Group__0__Impl rule__InRule__Group__1
            {
            pushFollow(FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__04082);
            rule__InRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__04085);
            rule__InRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__0"


    // $ANTLR start "rule__InRule__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2010:1: rule__InRule__Group__0__Impl : ( () ) ;
    public final void rule__InRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2014:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2015:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2015:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2016:1: ()
            {
             before(grammarAccess.getInRuleAccess().getInExprAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2017:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2019:1: 
            {
            }

             after(grammarAccess.getInRuleAccess().getInExprAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__0__Impl"


    // $ANTLR start "rule__InRule__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2029:1: rule__InRule__Group__1 : rule__InRule__Group__1__Impl ;
    public final void rule__InRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2033:1: ( rule__InRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2034:2: rule__InRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__14143);
            rule__InRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__1"


    // $ANTLR start "rule__InRule__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2040:1: rule__InRule__Group__1__Impl : ( ( rule__InRule__InTimeExprAssignment_1 ) ) ;
    public final void rule__InRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2044:1: ( ( ( rule__InRule__InTimeExprAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2045:1: ( ( rule__InRule__InTimeExprAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2045:1: ( ( rule__InRule__InTimeExprAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2046:1: ( rule__InRule__InTimeExprAssignment_1 )
            {
             before(grammarAccess.getInRuleAccess().getInTimeExprAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2047:1: ( rule__InRule__InTimeExprAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2047:2: rule__InRule__InTimeExprAssignment_1
            {
            pushFollow(FOLLOW_rule__InRule__InTimeExprAssignment_1_in_rule__InRule__Group__1__Impl4170);
            rule__InRule__InTimeExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInRuleAccess().getInTimeExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2061:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2065:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2066:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__04204);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__04207);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2073:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2077:1: ( ( ruleAnd ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2078:1: ( ruleAnd )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2078:1: ( ruleAnd )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2079:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl4234);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2090:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2094:1: ( rule__Or__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2095:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__14263);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2101:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2105:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2106:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2106:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2107:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2108:1: ( rule__Or__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2108:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl4290);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2122:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2126:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2127:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__04325);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__04328);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2134:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2138:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2139:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2139:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2140:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2141:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2143:1: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2153:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2157:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2158:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__14386);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__14389);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2165:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2169:1: ( ( 'OR' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2170:1: ( 'OR' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2170:1: ( 'OR' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2171:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Or__Group_1__1__Impl4417); 
             after(grammarAccess.getOrAccess().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2184:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2188:1: ( rule__Or__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2189:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__24448);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2195:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2199:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2200:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2200:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2201:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2202:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2202:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl4475);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2218:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2222:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2223:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__04511);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__04514);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2230:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2234:1: ( ( ruleEquality ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2235:1: ( ruleEquality )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2235:1: ( ruleEquality )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2236:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl4541);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2247:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2251:1: ( rule__And__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2252:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__14570);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2258:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2262:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2263:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2263:1: ( ( rule__And__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2264:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2265:1: ( rule__And__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2265:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl4597);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2279:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2283:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2284:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__04632);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__04635);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2291:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2295:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2296:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2296:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2297:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2298:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2300:1: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2310:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2314:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2315:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__14693);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__14696);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2322:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2326:1: ( ( 'AND' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2327:1: ( 'AND' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2327:1: ( 'AND' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2328:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__And__Group_1__1__Impl4724); 
             after(grammarAccess.getAndAccess().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2341:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2345:1: ( rule__And__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2346:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__24755);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2352:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2356:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2357:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2357:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2358:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2359:1: ( rule__And__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2359:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl4782);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2375:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2379:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2380:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__04818);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__04821);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2387:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2391:1: ( ( ruleComparison ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2392:1: ( ruleComparison )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2392:1: ( ruleComparison )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2393:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl4848);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2404:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2408:1: ( rule__Equality__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2409:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__14877);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2415:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2419:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2420:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2420:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2421:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2422:1: ( rule__Equality__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=12 && LA20_0<=13)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2422:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl4904);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2436:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2440:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2441:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__04939);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__04942);
            rule__Equality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2448:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2452:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2453:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2453:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2454:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2455:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2457:1: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2467:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2471:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2472:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__15000);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__15003);
            rule__Equality__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2479:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2483:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2484:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2484:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2485:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2486:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2486:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl5030);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2496:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2500:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2501:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__25060);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2507:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2511:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2512:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2512:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2513:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2514:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2514:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl5087);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2530:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2534:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2535:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05123);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05126);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2542:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2546:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2547:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2547:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2548:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl5153);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2559:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2563:1: ( rule__Comparison__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2564:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15182);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2570:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2574:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2575:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2575:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2576:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2577:1: ( rule__Comparison__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=14 && LA21_0<=17)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2577:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl5209);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2591:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2595:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2596:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__05244);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__05247);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2603:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2607:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2608:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2608:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2609:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2610:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2612:1: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2622:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2626:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2627:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__15305);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__15308);
            rule__Comparison__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2634:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2638:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2639:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2639:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2640:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2641:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2641:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl5335);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2651:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2655:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2656:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__25365);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2662:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2666:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2667:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2667:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2668:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2669:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2669:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl5392);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2685:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2689:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2690:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__05428);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__05431);
            rule__PlusOrMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2697:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2701:1: ( ( ruleMulOrDiv ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2702:1: ( ruleMulOrDiv )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2702:1: ( ruleMulOrDiv )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2703:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl5458);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2714:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2718:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2719:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__15487);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2725:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2729:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2730:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2730:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2731:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2732:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=24 && LA22_0<=25)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2732:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl5514);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2746:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2750:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2751:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__05549);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__05552);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2758:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2762:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2763:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2763:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2764:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2765:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2765:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl5579);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2775:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2779:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2780:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__15609);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2786:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2790:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2791:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2791:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2792:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2793:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2793:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl5636);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2807:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2811:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2812:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__05670);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__05673);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2819:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2823:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2824:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2824:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2825:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2826:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2828:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2838:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2842:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2843:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__15731);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2849:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2853:1: ( ( '+' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2854:1: ( '+' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2854:1: ( '+' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2855:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,25,FOLLOW_25_in_rule__PlusOrMinus__Group_1_0_0__1__Impl5759); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2872:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2876:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2877:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__05794);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__05797);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2884:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2888:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2889:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2889:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2890:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2891:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2893:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2903:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2907:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2908:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__15855);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2914:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2918:1: ( ( '-' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2919:1: ( '-' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2919:1: ( '-' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2920:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_24_in_rule__PlusOrMinus__Group_1_0_1__1__Impl5883); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2937:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2941:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2942:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__05918);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__05921);
            rule__MulOrDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2949:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2953:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2954:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2954:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2955:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl5948);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2966:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2970:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2971:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__15977);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2977:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2981:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2982:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2982:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2983:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2984:1: ( rule__MulOrDiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=18 && LA23_0<=21)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2984:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl6004);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2998:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3002:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3003:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__06039);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__06042);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3010:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3014:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3015:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3015:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3016:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3017:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3019:1: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3029:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3033:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3034:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__16100);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__16103);
            rule__MulOrDiv__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3041:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3045:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3046:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3046:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3047:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3048:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3048:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl6130);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3058:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3062:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3063:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__26160);
            rule__MulOrDiv__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3069:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3073:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3074:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3074:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3075:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3076:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3076:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl6187);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3092:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3096:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3097:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__06223);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__06226);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3104:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3108:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3109:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3109:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3110:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__Primary__Group_0__0__Impl6254); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3123:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3127:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3128:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__16285);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__16288);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3135:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3139:1: ( ( ruleExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3140:1: ( ruleExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3140:1: ( ruleExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3141:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl6315);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3152:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3156:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3157:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__26344);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3163:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3167:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3168:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3168:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3169:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__Primary__Group_0__2__Impl6372); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3188:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3192:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3193:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__06409);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__06412);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3200:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3204:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3205:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3205:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3206:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3207:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3209:1: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3219:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3223:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3224:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__16470);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__16473);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3231:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3235:1: ( ( '!' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3236:1: ( '!' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3236:1: ( '!' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3237:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,37,FOLLOW_37_in_rule__Primary__Group_1__1__Impl6501); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3250:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3254:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3255:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__26532);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3261:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3265:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3266:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3266:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3267:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3268:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3268:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl6559);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3284:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3288:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3289:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__06595);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__06598);
            rule__Atomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3296:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3300:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3301:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3301:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3302:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3303:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3305:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3315:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3319:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3320:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__16656);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3326:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3330:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3331:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3331:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3332:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3333:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3333:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl6683);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3347:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3351:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3352:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__06717);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__06720);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3359:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3363:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3364:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3364:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3365:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3366:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3368:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3378:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3382:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3383:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16778);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3389:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3393:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3394:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3394:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3395:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3396:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3396:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6805);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3410:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3414:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3415:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06839);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06842);
            rule__Atomic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3422:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3426:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3427:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3427:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3428:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3429:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3431:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3441:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3445:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3446:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16900);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3452:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3456:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3457:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3457:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3458:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3459:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3459:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl6927);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3473:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3477:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3478:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__06961);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__06964);
            rule__Atomic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3485:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3489:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3490:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3490:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3491:1: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3492:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3494:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3504:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3508:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3509:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__17022);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__17025);
            rule__Atomic__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3516:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3520:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3521:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3521:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3522:1: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3523:1: ( rule__Atomic__RefAssignment_3_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3523:2: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl7052);
            rule__Atomic__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3533:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3537:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3538:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__27082);
            rule__Atomic__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__2"


    // $ANTLR start "rule__Atomic__Group_3__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3544:1: rule__Atomic__Group_3__2__Impl : ( ( rule__Atomic__Group_3_2__0 )? ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3548:1: ( ( ( rule__Atomic__Group_3_2__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3549:1: ( ( rule__Atomic__Group_3_2__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3549:1: ( ( rule__Atomic__Group_3_2__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3550:1: ( rule__Atomic__Group_3_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_3_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3551:1: ( rule__Atomic__Group_3_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3551:2: rule__Atomic__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl7109);
                    rule__Atomic__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__2__Impl"


    // $ANTLR start "rule__Atomic__Group_3_2__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3567:1: rule__Atomic__Group_3_2__0 : rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 ;
    public final void rule__Atomic__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3571:1: ( rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3572:2: rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__07146);
            rule__Atomic__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__07149);
            rule__Atomic__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__0"


    // $ANTLR start "rule__Atomic__Group_3_2__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3579:1: rule__Atomic__Group_3_2__0__Impl : ( 'at' ) ;
    public final void rule__Atomic__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3583:1: ( ( 'at' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3584:1: ( 'at' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3584:1: ( 'at' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3585:1: 'at'
            {
             before(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Atomic__Group_3_2__0__Impl7177); 
             after(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3_2__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3598:1: rule__Atomic__Group_3_2__1 : rule__Atomic__Group_3_2__1__Impl ;
    public final void rule__Atomic__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3602:1: ( rule__Atomic__Group_3_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3603:2: rule__Atomic__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__17208);
            rule__Atomic__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__1"


    // $ANTLR start "rule__Atomic__Group_3_2__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3609:1: rule__Atomic__Group_3_2__1__Impl : ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) ;
    public final void rule__Atomic__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3613:1: ( ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3614:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3614:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3615:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3616:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3616:2: rule__Atomic__FluentValueSampleAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl7235);
            rule__Atomic__FluentValueSampleAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__1__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3630:1: rule__AtTimeExpression__Group__0 : rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 ;
    public final void rule__AtTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3634:1: ( rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3635:2: rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__07269);
            rule__AtTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__07272);
            rule__AtTimeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__0"


    // $ANTLR start "rule__AtTimeExpression__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3642:1: rule__AtTimeExpression__Group__0__Impl : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3646:1: ( ( ruleAtTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3647:1: ( ruleAtTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3647:1: ( ruleAtTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3648:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl7299);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__0__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3659:1: rule__AtTimeExpression__Group__1 : rule__AtTimeExpression__Group__1__Impl ;
    public final void rule__AtTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3663:1: ( rule__AtTimeExpression__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3664:2: rule__AtTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__17328);
            rule__AtTimeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__1"


    // $ANTLR start "rule__AtTimeExpression__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3670:1: rule__AtTimeExpression__Group__1__Impl : ( ( rule__AtTimeExpression__Group_1__0 )* ) ;
    public final void rule__AtTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3674:1: ( ( ( rule__AtTimeExpression__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3675:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3675:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3676:1: ( rule__AtTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3677:1: ( rule__AtTimeExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=24 && LA25_0<=25)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3677:2: rule__AtTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl7355);
            	    rule__AtTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__1__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3691:1: rule__AtTimeExpression__Group_1__0 : rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 ;
    public final void rule__AtTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3695:1: ( rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3696:2: rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__07390);
            rule__AtTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__07393);
            rule__AtTimeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__0"


    // $ANTLR start "rule__AtTimeExpression__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3703:1: rule__AtTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3707:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3708:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3708:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3709:1: ()
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3710:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3712:1: 
            {
            }

             after(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3722:1: rule__AtTimeExpression__Group_1__1 : rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 ;
    public final void rule__AtTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3726:1: ( rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3727:2: rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__17451);
            rule__AtTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__17454);
            rule__AtTimeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__1"


    // $ANTLR start "rule__AtTimeExpression__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3734:1: rule__AtTimeExpression__Group_1__1__Impl : ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AtTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3738:1: ( ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3739:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3739:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3740:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3741:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3741:2: rule__AtTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl7481);
            rule__AtTimeExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3751:1: rule__AtTimeExpression__Group_1__2 : rule__AtTimeExpression__Group_1__2__Impl ;
    public final void rule__AtTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3755:1: ( rule__AtTimeExpression__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3756:2: rule__AtTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__27511);
            rule__AtTimeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__2"


    // $ANTLR start "rule__AtTimeExpression__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3762:1: rule__AtTimeExpression__Group_1__2__Impl : ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AtTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3766:1: ( ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3767:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3767:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3768:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3769:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3769:2: rule__AtTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl7538);
            rule__AtTimeExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AtTimePrimary__Group_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3785:1: rule__AtTimePrimary__Group_0__0 : rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 ;
    public final void rule__AtTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3789:1: ( rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3790:2: rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__07574);
            rule__AtTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__07577);
            rule__AtTimePrimary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__0"


    // $ANTLR start "rule__AtTimePrimary__Group_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3797:1: rule__AtTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3801:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3802:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3802:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3803:1: '('
            {
             before(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__AtTimePrimary__Group_0__0__Impl7605); 
             after(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__0__Impl"


    // $ANTLR start "rule__AtTimePrimary__Group_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3816:1: rule__AtTimePrimary__Group_0__1 : rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 ;
    public final void rule__AtTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3820:1: ( rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3821:2: rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__17636);
            rule__AtTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__17639);
            rule__AtTimePrimary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__1"


    // $ANTLR start "rule__AtTimePrimary__Group_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3828:1: rule__AtTimePrimary__Group_0__1__Impl : ( ruleAtTimeExpression ) ;
    public final void rule__AtTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3832:1: ( ( ruleAtTimeExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3833:1: ( ruleAtTimeExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3833:1: ( ruleAtTimeExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3834:1: ruleAtTimeExpression
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl7666);
            ruleAtTimeExpression();

            state._fsp--;

             after(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__1__Impl"


    // $ANTLR start "rule__AtTimePrimary__Group_0__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3845:1: rule__AtTimePrimary__Group_0__2 : rule__AtTimePrimary__Group_0__2__Impl ;
    public final void rule__AtTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3849:1: ( rule__AtTimePrimary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3850:2: rule__AtTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__27695);
            rule__AtTimePrimary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__2"


    // $ANTLR start "rule__AtTimePrimary__Group_0__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3856:1: rule__AtTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3860:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3861:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3861:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3862:1: ')'
            {
             before(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__AtTimePrimary__Group_0__2__Impl7723); 
             after(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__2__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3881:1: rule__AtTimeAtomic__Group__0 : rule__AtTimeAtomic__Group__0__Impl rule__AtTimeAtomic__Group__1 ;
    public final void rule__AtTimeAtomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3885:1: ( rule__AtTimeAtomic__Group__0__Impl rule__AtTimeAtomic__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3886:2: rule__AtTimeAtomic__Group__0__Impl rule__AtTimeAtomic__Group__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group__0__Impl_in_rule__AtTimeAtomic__Group__07760);
            rule__AtTimeAtomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group__1_in_rule__AtTimeAtomic__Group__07763);
            rule__AtTimeAtomic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group__0"


    // $ANTLR start "rule__AtTimeAtomic__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3893:1: rule__AtTimeAtomic__Group__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3897:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3898:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3898:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3899:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3900:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3902:1: 
            {
            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group__0__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3912:1: rule__AtTimeAtomic__Group__1 : rule__AtTimeAtomic__Group__1__Impl ;
    public final void rule__AtTimeAtomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3916:1: ( rule__AtTimeAtomic__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3917:2: rule__AtTimeAtomic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group__1__Impl_in_rule__AtTimeAtomic__Group__17821);
            rule__AtTimeAtomic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group__1"


    // $ANTLR start "rule__AtTimeAtomic__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3923:1: rule__AtTimeAtomic__Group__1__Impl : ( ( rule__AtTimeAtomic__ValueAssignment_1 ) ) ;
    public final void rule__AtTimeAtomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3927:1: ( ( ( rule__AtTimeAtomic__ValueAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3928:1: ( ( rule__AtTimeAtomic__ValueAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3928:1: ( ( rule__AtTimeAtomic__ValueAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3929:1: ( rule__AtTimeAtomic__ValueAssignment_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3930:1: ( rule__AtTimeAtomic__ValueAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3930:2: rule__AtTimeAtomic__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__ValueAssignment_1_in_rule__AtTimeAtomic__Group__1__Impl7848);
            rule__AtTimeAtomic__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group__1__Impl"


    // $ANTLR start "rule__InTimeExpression__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3944:1: rule__InTimeExpression__Group__0 : rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1 ;
    public final void rule__InTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3948:1: ( rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3949:2: rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__0__Impl_in_rule__InTimeExpression__Group__07882);
            rule__InTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group__1_in_rule__InTimeExpression__Group__07885);
            rule__InTimeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group__0"


    // $ANTLR start "rule__InTimeExpression__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3956:1: rule__InTimeExpression__Group__0__Impl : ( ruleInTimePrimary ) ;
    public final void rule__InTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3960:1: ( ( ruleInTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3961:1: ( ruleInTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3961:1: ( ruleInTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3962:1: ruleInTimePrimary
            {
             before(grammarAccess.getInTimeExpressionAccess().getInTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__Group__0__Impl7912);
            ruleInTimePrimary();

            state._fsp--;

             after(grammarAccess.getInTimeExpressionAccess().getInTimePrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group__0__Impl"


    // $ANTLR start "rule__InTimeExpression__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3973:1: rule__InTimeExpression__Group__1 : rule__InTimeExpression__Group__1__Impl ;
    public final void rule__InTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3977:1: ( rule__InTimeExpression__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3978:2: rule__InTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__1__Impl_in_rule__InTimeExpression__Group__17941);
            rule__InTimeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group__1"


    // $ANTLR start "rule__InTimeExpression__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3984:1: rule__InTimeExpression__Group__1__Impl : ( ( rule__InTimeExpression__Group_1__0 )* ) ;
    public final void rule__InTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3988:1: ( ( ( rule__InTimeExpression__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3989:1: ( ( rule__InTimeExpression__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3989:1: ( ( rule__InTimeExpression__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3990:1: ( rule__InTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getInTimeExpressionAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3991:1: ( rule__InTimeExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3991:2: rule__InTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InTimeExpression__Group_1__0_in_rule__InTimeExpression__Group__1__Impl7968);
            	    rule__InTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInTimeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group__1__Impl"


    // $ANTLR start "rule__InTimeExpression__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4005:1: rule__InTimeExpression__Group_1__0 : rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1 ;
    public final void rule__InTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4009:1: ( rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4010:2: rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__0__Impl_in_rule__InTimeExpression__Group_1__08003);
            rule__InTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__1_in_rule__InTimeExpression__Group_1__08006);
            rule__InTimeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__0"


    // $ANTLR start "rule__InTimeExpression__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4017:1: rule__InTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__InTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4021:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4022:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4022:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4023:1: ()
            {
             before(grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4024:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4026:1: 
            {
            }

             after(grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__InTimeExpression__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4036:1: rule__InTimeExpression__Group_1__1 : rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2 ;
    public final void rule__InTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4040:1: ( rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4041:2: rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__1__Impl_in_rule__InTimeExpression__Group_1__18064);
            rule__InTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__2_in_rule__InTimeExpression__Group_1__18067);
            rule__InTimeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__1"


    // $ANTLR start "rule__InTimeExpression__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4048:1: rule__InTimeExpression__Group_1__1__Impl : ( ( rule__InTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__InTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4052:1: ( ( ( rule__InTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4053:1: ( ( rule__InTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4053:1: ( ( rule__InTimeExpression__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4054:1: ( rule__InTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4055:1: ( rule__InTimeExpression__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4055:2: rule__InTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__OpAssignment_1_1_in_rule__InTimeExpression__Group_1__1__Impl8094);
            rule__InTimeExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__InTimeExpression__Group_1__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4065:1: rule__InTimeExpression__Group_1__2 : rule__InTimeExpression__Group_1__2__Impl ;
    public final void rule__InTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4069:1: ( rule__InTimeExpression__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4070:2: rule__InTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__2__Impl_in_rule__InTimeExpression__Group_1__28124);
            rule__InTimeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__2"


    // $ANTLR start "rule__InTimeExpression__Group_1__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4076:1: rule__InTimeExpression__Group_1__2__Impl : ( ( rule__InTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__InTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4080:1: ( ( ( rule__InTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4081:1: ( ( rule__InTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4081:1: ( ( rule__InTimeExpression__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4082:1: ( rule__InTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4083:1: ( rule__InTimeExpression__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4083:2: rule__InTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__InTimeExpression__RightAssignment_1_2_in_rule__InTimeExpression__Group_1__2__Impl8151);
            rule__InTimeExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__InTimePrimary__Group_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4099:1: rule__InTimePrimary__Group_0__0 : rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1 ;
    public final void rule__InTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4103:1: ( rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4104:2: rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__0__Impl_in_rule__InTimePrimary__Group_0__08187);
            rule__InTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__1_in_rule__InTimePrimary__Group_0__08190);
            rule__InTimePrimary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__0"


    // $ANTLR start "rule__InTimePrimary__Group_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4111:1: rule__InTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__InTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4115:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4116:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4116:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4117:1: '('
            {
             before(grammarAccess.getInTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__InTimePrimary__Group_0__0__Impl8218); 
             after(grammarAccess.getInTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__0__Impl"


    // $ANTLR start "rule__InTimePrimary__Group_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4130:1: rule__InTimePrimary__Group_0__1 : rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2 ;
    public final void rule__InTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4134:1: ( rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4135:2: rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__1__Impl_in_rule__InTimePrimary__Group_0__18249);
            rule__InTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__2_in_rule__InTimePrimary__Group_0__18252);
            rule__InTimePrimary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__1"


    // $ANTLR start "rule__InTimePrimary__Group_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4142:1: rule__InTimePrimary__Group_0__1__Impl : ( ruleInExpr ) ;
    public final void rule__InTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4146:1: ( ( ruleInExpr ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4147:1: ( ruleInExpr )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4147:1: ( ruleInExpr )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4148:1: ruleInExpr
            {
             before(grammarAccess.getInTimePrimaryAccess().getInExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleInExpr_in_rule__InTimePrimary__Group_0__1__Impl8279);
            ruleInExpr();

            state._fsp--;

             after(grammarAccess.getInTimePrimaryAccess().getInExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__1__Impl"


    // $ANTLR start "rule__InTimePrimary__Group_0__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4159:1: rule__InTimePrimary__Group_0__2 : rule__InTimePrimary__Group_0__2__Impl ;
    public final void rule__InTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4163:1: ( rule__InTimePrimary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4164:2: rule__InTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__2__Impl_in_rule__InTimePrimary__Group_0__28308);
            rule__InTimePrimary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__2"


    // $ANTLR start "rule__InTimePrimary__Group_0__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4170:1: rule__InTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__InTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4174:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4175:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4175:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4176:1: ')'
            {
             before(grammarAccess.getInTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__InTimePrimary__Group_0__2__Impl8336); 
             after(grammarAccess.getInTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__2__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4195:1: rule__InTimeAtomic__Group__0 : rule__InTimeAtomic__Group__0__Impl rule__InTimeAtomic__Group__1 ;
    public final void rule__InTimeAtomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4199:1: ( rule__InTimeAtomic__Group__0__Impl rule__InTimeAtomic__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4200:2: rule__InTimeAtomic__Group__0__Impl rule__InTimeAtomic__Group__1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group__0__Impl_in_rule__InTimeAtomic__Group__08373);
            rule__InTimeAtomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeAtomic__Group__1_in_rule__InTimeAtomic__Group__08376);
            rule__InTimeAtomic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group__0"


    // $ANTLR start "rule__InTimeAtomic__Group__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4207:1: rule__InTimeAtomic__Group__0__Impl : ( () ) ;
    public final void rule__InTimeAtomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4211:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4212:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4212:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4213:1: ()
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4214:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4216:1: 
            {
            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group__0__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4226:1: rule__InTimeAtomic__Group__1 : rule__InTimeAtomic__Group__1__Impl ;
    public final void rule__InTimeAtomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4230:1: ( rule__InTimeAtomic__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4231:2: rule__InTimeAtomic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group__1__Impl_in_rule__InTimeAtomic__Group__18434);
            rule__InTimeAtomic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group__1"


    // $ANTLR start "rule__InTimeAtomic__Group__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4237:1: rule__InTimeAtomic__Group__1__Impl : ( ( rule__InTimeAtomic__ValueAssignment_1 ) ) ;
    public final void rule__InTimeAtomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4241:1: ( ( ( rule__InTimeAtomic__ValueAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4242:1: ( ( rule__InTimeAtomic__ValueAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4242:1: ( ( rule__InTimeAtomic__ValueAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4243:1: ( rule__InTimeAtomic__ValueAssignment_1 )
            {
             before(grammarAccess.getInTimeAtomicAccess().getValueAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4244:1: ( rule__InTimeAtomic__ValueAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4244:2: rule__InTimeAtomic__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__ValueAssignment_1_in_rule__InTimeAtomic__Group__1__Impl8461);
            rule__InTimeAtomic__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group__1__Impl"


    // $ANTLR start "rule__DroolsModel__StatementsAssignment"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4259:1: rule__DroolsModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__DroolsModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4263:1: ( ( ruleStatement ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4264:1: ( ruleStatement )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4264:1: ( ruleStatement )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4265:1: ruleStatement
            {
             before(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment8500);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroolsModel__StatementsAssignment"


    // $ANTLR start "rule__Statement__EventAssignment_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4274:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4278:1: ( ( ruleEvent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4279:1: ( ruleEvent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4279:1: ( ruleEvent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4280:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_18531);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__EventAssignment_1"


    // $ANTLR start "rule__Statement__FluentAssignment_3"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4289:1: rule__Statement__FluentAssignment_3 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4293:1: ( ( ruleFluent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4294:1: ( ruleFluent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4294:1: ( ruleFluent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4295:1: ruleFluent
            {
             before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_38562);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FluentAssignment_3"


    // $ANTLR start "rule__Statement__FluentAssignment_4_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4304:1: rule__Statement__FluentAssignment_4_1 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4308:1: ( ( ruleFluent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4309:1: ( ruleFluent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4309:1: ( ruleFluent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4310:1: ruleFluent
            {
             before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_18593);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FluentAssignment_4_1"


    // $ANTLR start "rule__Event__EventNameAssignment_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4319:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4323:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4324:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4324:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4325:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_08624); 
             after(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventNameAssignment_0"


    // $ANTLR start "rule__Event__ParamAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4334:1: rule__Event__ParamAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4338:1: ( ( ruleEventFeature ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4339:1: ( ruleEventFeature )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4339:1: ( ruleEventFeature )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4340:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_18655);
            ruleEventFeature();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParamAssignment_1_1"


    // $ANTLR start "rule__Event__ParamAssignment_1_2_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4349:1: rule__Event__ParamAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4353:1: ( ( ruleEventFeature ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4354:1: ( ruleEventFeature )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4354:1: ( ruleEventFeature )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4355:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_2_18686);
            ruleEventFeature();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParamAssignment_1_2_1"


    // $ANTLR start "rule__Fluent__NameAssignment_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4364:1: rule__Fluent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4368:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4369:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4369:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4370:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_08717); 
             after(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__NameAssignment_0"


    // $ANTLR start "rule__Fluent__TimePartAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4379:1: rule__Fluent__TimePartAssignment_1_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4383:1: ( ( ruleInRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4384:1: ( ruleInRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4384:1: ( ruleInRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4385:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_1_18748);
            ruleInRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__TimePartAssignment_1_1"


    // $ANTLR start "rule__Fluent__ValuePartAssignment_2_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4394:1: rule__Fluent__ValuePartAssignment_2_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4398:1: ( ( ruleToRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4399:1: ( ruleToRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4399:1: ( ruleToRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4400:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_2_18779);
            ruleToRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__ValuePartAssignment_2_1"


    // $ANTLR start "rule__Fluent__CondPartAssignment_3_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4409:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4413:1: ( ( ruleConditionRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4414:1: ( ruleConditionRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4414:1: ( ruleConditionRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4415:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_18810);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__CondPartAssignment_3_1"


    // $ANTLR start "rule__ConditionRule__ConditionAssignment_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4424:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4428:1: ( ( ruleExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4429:1: ( ruleExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4429:1: ( ruleExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4430:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_18841);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__ConditionAssignment_1"


    // $ANTLR start "rule__ToRule__ExpressionAssignment_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4439:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4443:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4444:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4444:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4445:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_18872);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__ExpressionAssignment_1"


    // $ANTLR start "rule__InRule__InTimeExprAssignment_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4454:1: rule__InRule__InTimeExprAssignment_1 : ( ruleInTimeExpression ) ;
    public final void rule__InRule__InTimeExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4458:1: ( ( ruleInTimeExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4459:1: ( ruleInTimeExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4459:1: ( ruleInTimeExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4460:1: ruleInTimeExpression
            {
             before(grammarAccess.getInRuleAccess().getInTimeExprInTimeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_rule__InRule__InTimeExprAssignment_18903);
            ruleInTimeExpression();

            state._fsp--;

             after(grammarAccess.getInRuleAccess().getInTimeExprInTimeExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__InTimeExprAssignment_1"


    // $ANTLR start "rule__EventFeature__NameAssignment"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4469:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4473:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4474:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4474:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4475:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment8934); 
             after(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventFeature__NameAssignment"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4484:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4488:1: ( ( ruleAnd ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4489:1: ( ruleAnd )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4489:1: ( ruleAnd )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4490:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_28965);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4499:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4503:1: ( ( ruleEquality ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4504:1: ( ruleEquality )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4504:1: ( ruleEquality )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4505:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_28996);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4514:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4518:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4519:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4519:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4520:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4521:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4521:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_19027);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4530:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4534:1: ( ( ruleComparison ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4535:1: ( ruleComparison )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4535:1: ( ruleComparison )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4536:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_29060);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4545:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4549:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4550:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4550:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4551:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4552:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4552:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_19091);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4561:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4565:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4566:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4566:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4567:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_29124);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4576:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4580:1: ( ( ruleMulOrDiv ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4581:1: ( ruleMulOrDiv )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4581:1: ( ruleMulOrDiv )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4582:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_19155);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4591:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4595:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4596:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4596:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4597:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4598:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4598:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_19186);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4607:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4611:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4612:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4612:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4613:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_29219);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4622:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4626:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4627:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4627:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4628:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_29250);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4637:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4641:1: ( ( RULE_FLOAT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4642:1: ( RULE_FLOAT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4642:1: ( RULE_FLOAT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4643:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_19281); 
             after(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4652:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4656:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4657:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4657:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4658:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_19312); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4667:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4671:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4672:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4672:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4673:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4674:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4674:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_19343);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__RefAssignment_3_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4683:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4687:1: ( ( ( RULE_ID ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4688:1: ( ( RULE_ID ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4688:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4689:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4690:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4691:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_19380); 
             after(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__RefAssignment_3_1"


    // $ANTLR start "rule__Atomic__FluentValueSampleAssignment_3_2_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4702:1: rule__Atomic__FluentValueSampleAssignment_3_2_1 : ( ruleAtTimePrimary ) ;
    public final void rule__Atomic__FluentValueSampleAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4706:1: ( ( ruleAtTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4707:1: ( ruleAtTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4707:1: ( ruleAtTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4708:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_19415);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__FluentValueSampleAssignment_3_2_1"


    // $ANTLR start "rule__AtTimeExpression__OpAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4717:1: rule__AtTimeExpression__OpAssignment_1_1 : ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AtTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4721:1: ( ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4722:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4722:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4723:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4724:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4724:2: rule__AtTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_19446);
            rule__AtTimeExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AtTimeExpression__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4733:1: rule__AtTimeExpression__RightAssignment_1_2 : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4737:1: ( ( ruleAtTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4738:1: ( ruleAtTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4738:1: ( ruleAtTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4739:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_29479);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AtTimeAtomic__ValueAssignment_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4748:1: rule__AtTimeAtomic__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__AtTimeAtomic__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4752:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4753:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4753:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4754:1: RULE_INT
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_19510); 
             after(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__ValueAssignment_1"


    // $ANTLR start "rule__InTimeExpression__OpAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4763:1: rule__InTimeExpression__OpAssignment_1_1 : ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__InTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4767:1: ( ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4768:1: ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4768:1: ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4769:1: ( rule__InTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4770:1: ( rule__InTimeExpression__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4770:2: rule__InTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__InTimeExpression__OpAlternatives_1_1_0_in_rule__InTimeExpression__OpAssignment_1_19541);
            rule__InTimeExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__OpAssignment_1_1"


    // $ANTLR start "rule__InTimeExpression__RightAssignment_1_2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4779:1: rule__InTimeExpression__RightAssignment_1_2 : ( ruleInTimePrimary ) ;
    public final void rule__InTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4783:1: ( ( ruleInTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4784:1: ( ruleInTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4784:1: ( ruleInTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4785:1: ruleInTimePrimary
            {
             before(grammarAccess.getInTimeExpressionAccess().getRightInTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__RightAssignment_1_29574);
            ruleInTimePrimary();

            state._fsp--;

             after(grammarAccess.getInTimeExpressionAccess().getRightInTimePrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__RightAssignment_1_2"


    // $ANTLR start "rule__InTimeAtomic__ValueAssignment_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4794:1: rule__InTimeAtomic__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__InTimeAtomic__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4798:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4799:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4799:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4800:1: RULE_INT
            {
             before(grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InTimeAtomic__ValueAssignment_19605); 
             after(grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDroolsModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DroolsModel__StatementsAssignment_in_ruleDroolsModel94 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0_in_ruleConditionRule335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0_in_ruleToRule395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__0_in_ruleInRule455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_entryRuleEventFeature482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventFeature489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventFeature__NameAssignment_in_ruleEventFeature515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeExpression1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0_in_ruleAtTimeExpression1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimePrimary1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Alternatives_in_ruleAtTimePrimary1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeAtomic1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group__0_in_ruleAtTimeAtomic1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpr_in_entryRuleInExpr1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpr1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_ruleInExpr1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_entryRuleInTimeExpression1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimeExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__0_in_ruleInTimeExpression1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_entryRuleInTimePrimary1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimePrimary1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Alternatives_in_ruleInTimePrimary1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_entryRuleInTimeAtomic1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimeAtomic1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group__0_in_ruleInTimeAtomic1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_01514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_01534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_01569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_01589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_01609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MulOrDiv__OpAlternatives_1_1_01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MulOrDiv__OpAlternatives_1_1_01735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MulOrDiv__OpAlternatives_1_1_01755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_01775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Atomic__ValueAlternatives_2_1_01965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__ValueAlternatives_2_1_01985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AtTimeExpression__OpAlternatives_1_1_02021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AtTimeExpression__OpAlternatives_1_1_02041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0_in_rule__AtTimePrimary__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_rule__AtTimePrimary__Alternatives2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InTimeExpression__OpAlternatives_1_1_02126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InTimeExpression__OpAlternatives_1_1_02146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__0_in_rule__InTimePrimary__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_rule__InTimePrimary__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Statement__Group__0__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12290 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Statement__Group__2__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32412 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42472 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl2502 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__52533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__5__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_4__0__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02727 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Event__Group_1__0__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12911 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamAssignment_1_1_in_rule__Event__Group_1__1__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22971 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl3001 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__33032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Event__Group_1__3__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Event__Group_1_2__0__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__03222 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__03225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__13282 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__23343 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__23346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__33403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__03469 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Fluent__Group_1__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__03592 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Fluent__Group_2__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03715 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Fluent__Group_3__0__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__03838 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__03841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__03960 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__14021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__04082 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__04085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__14143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__InTimeExprAssignment_1_in_rule__InRule__Group__1__Impl4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__04204 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl4290 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__04325 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__04328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__14386 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Or__Group_1__1__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__04511 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__04514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl4597 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__04632 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__14693 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__And__Group_1__1__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__24755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__04818 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__04821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl4904 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__04939 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__04942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__15000 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__15003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__25060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05123 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl5209 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__05244 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__05247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__15305 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__15308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__25365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__05428 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__05431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__15487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl5514 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__05549 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__05552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__15609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__05670 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__05673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOrMinus__Group_1_0_0__1__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__05794 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__05797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__15855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlusOrMinus__Group_1_0_1__1__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__05918 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__05921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__15977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl6004 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__06039 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__06042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__16100 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__16103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__26160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__06223 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__06226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Primary__Group_0__0__Impl6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__16285 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__16288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__26344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Group_0__2__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__06409 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__06412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__16470 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Primary__Group_1__1__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__26532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__06595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__06598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__16656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__06717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__06720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06839 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__06961 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__17022 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__17025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__27082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__07146 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__07149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Atomic__Group_3_2__0__Impl7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__17208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__07269 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__07272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__17328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl7355 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__07390 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__07393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__17451 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__27511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__07574 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__07577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AtTimePrimary__Group_0__0__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__17636 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__17639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__27695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtTimePrimary__Group_0__2__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group__0__Impl_in_rule__AtTimeAtomic__Group__07760 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group__1_in_rule__AtTimeAtomic__Group__07763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group__1__Impl_in_rule__AtTimeAtomic__Group__17821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__ValueAssignment_1_in_rule__AtTimeAtomic__Group__1__Impl7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__0__Impl_in_rule__InTimeExpression__Group__07882 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__1_in_rule__InTimeExpression__Group__07885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__Group__0__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__1__Impl_in_rule__InTimeExpression__Group__17941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__0_in_rule__InTimeExpression__Group__1__Impl7968 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__0__Impl_in_rule__InTimeExpression__Group_1__08003 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__1_in_rule__InTimeExpression__Group_1__08006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__1__Impl_in_rule__InTimeExpression__Group_1__18064 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__2_in_rule__InTimeExpression__Group_1__18067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__OpAssignment_1_1_in_rule__InTimeExpression__Group_1__1__Impl8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__2__Impl_in_rule__InTimeExpression__Group_1__28124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__RightAssignment_1_2_in_rule__InTimeExpression__Group_1__2__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__0__Impl_in_rule__InTimePrimary__Group_0__08187 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__1_in_rule__InTimePrimary__Group_0__08190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InTimePrimary__Group_0__0__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__1__Impl_in_rule__InTimePrimary__Group_0__18249 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__2_in_rule__InTimePrimary__Group_0__18252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpr_in_rule__InTimePrimary__Group_0__1__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__2__Impl_in_rule__InTimePrimary__Group_0__28308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InTimePrimary__Group_0__2__Impl8336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group__0__Impl_in_rule__InTimeAtomic__Group__08373 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group__1_in_rule__InTimeAtomic__Group__08376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group__1__Impl_in_rule__InTimeAtomic__Group__18434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__ValueAssignment_1_in_rule__InTimeAtomic__Group__1__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_18531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_38562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_18593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_08624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_18655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_2_18686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_08717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_1_18748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_2_18779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_18810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_18841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_18872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_rule__InRule__InTimeExprAssignment_18903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_28965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_28996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_19027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_29060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_19091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_29124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_19155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_19186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_29219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_29250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_19281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_19312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_19343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_19380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_19415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_19446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_29479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_19510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__OpAlternatives_1_1_0_in_rule__InTimeExpression__OpAssignment_1_19541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__RightAssignment_1_29574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InTimeAtomic__ValueAssignment_19605 = new BitSet(new long[]{0x0000000000000002L});

}