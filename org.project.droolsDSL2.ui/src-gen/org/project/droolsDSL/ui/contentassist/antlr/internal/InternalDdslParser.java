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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'on'", "'set'", "';'", "','", "'('", "')'", "'to'", "'in'", "'if'", "'OR'", "'AND'", "'+'", "'-'", "'!'", "'now'"
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

                if ( (LA1_0==24) ) {
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:237:1: ruleInRule : ( ( rule__InRule__TimeAssignment ) ) ;
    public final void ruleInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:241:2: ( ( ( rule__InRule__TimeAssignment ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:242:1: ( ( rule__InRule__TimeAssignment ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:242:1: ( ( rule__InRule__TimeAssignment ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:243:1: ( rule__InRule__TimeAssignment )
            {
             before(grammarAccess.getInRuleAccess().getTimeAssignment()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:244:1: ( rule__InRule__TimeAssignment )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:244:2: rule__InRule__TimeAssignment
            {
            pushFollow(FOLLOW_rule__InRule__TimeAssignment_in_ruleInRule455);
            rule__InRule__TimeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInRuleAccess().getTimeAssignment()); 

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


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:538:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:542:1: ( ( '==' ) | ( '!=' ) )
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
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:543:1: ( '==' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:543:1: ( '==' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:544:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_01093); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:551:6: ( '!=' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:551:6: ( '!=' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:552:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_01113); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:564:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:568:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:569:1: ( '>=' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:569:1: ( '>=' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:570:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_01148); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:577:6: ( '<=' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:577:6: ( '<=' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:578:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_01168); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:585:6: ( '>' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:585:6: ( '>' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:586:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,16,FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_01188); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:593:6: ( '<' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:593:6: ( '<' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:594:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,17,FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01208); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:606:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:610:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:611:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:611:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:612:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:613:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:613:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01242);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:617:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:617:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:618:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:619:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:619:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01260);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:628:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:632:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
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
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:633:1: ( '*' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:633:1: ( '*' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:634:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__MulOrDiv__OpAlternatives_1_1_01294); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:641:6: ( '/' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:641:6: ( '/' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:642:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__MulOrDiv__OpAlternatives_1_1_01314); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:649:6: ( '%' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:649:6: ( '%' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:650:1: '%'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__MulOrDiv__OpAlternatives_1_1_01334); 
                     after(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:657:6: ( '^' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:657:6: ( '^' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:658:1: '^'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_01354); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:670:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:674:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
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
            case 38:
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
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:675:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:675:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:676:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:677:1: ( rule__Primary__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:677:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1388);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:681:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:681:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:682:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:683:1: ( rule__Primary__Group_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:683:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1406);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:687:6: ( ruleAtomic )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:687:6: ( ruleAtomic )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:688:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1424);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:698:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:702:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt7=5;
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
            case 38:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:703:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:703:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:704:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:705:1: ( rule__Atomic__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:705:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1456);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:709:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:709:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:710:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:711:1: ( rule__Atomic__Group_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:711:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1474);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:715:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:715:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:716:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:717:1: ( rule__Atomic__Group_2__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:717:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1492);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:721:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:721:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:722:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:723:1: ( rule__Atomic__Group_3__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:723:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1510);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:727:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:727:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:728:1: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:729:1: ( rule__Atomic__Group_4__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:729:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives1528);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:738:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:742:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:743:1: ( 'true' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:743:1: ( 'true' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:744:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Atomic__ValueAlternatives_2_1_01562); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:751:6: ( 'false' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:751:6: ( 'false' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:752:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Atomic__ValueAlternatives_2_1_01582); 
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


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:767:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:771:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:772:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__01615);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__01618);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:779:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:783:1: ( ( 'on' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:784:1: ( 'on' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:784:1: ( 'on' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:785:1: 'on'
            {
             before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Statement__Group__0__Impl1646); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:798:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:802:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:803:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__11677);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__11680);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:810:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:814:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:815:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:815:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:816:1: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:817:1: ( rule__Statement__EventAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:817:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl1707);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:827:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:831:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:832:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__21737);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__21740);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:839:1: rule__Statement__Group__2__Impl : ( 'set' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:843:1: ( ( 'set' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:844:1: ( 'set' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:844:1: ( 'set' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:845:1: 'set'
            {
             before(grammarAccess.getStatementAccess().getSetKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Statement__Group__2__Impl1768); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:858:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:862:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:863:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__31799);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__31802);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:870:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__FluentAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:874:1: ( ( ( rule__Statement__FluentAssignment_3 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:875:1: ( ( rule__Statement__FluentAssignment_3 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:875:1: ( ( rule__Statement__FluentAssignment_3 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:876:1: ( rule__Statement__FluentAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getFluentAssignment_3()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:877:1: ( rule__Statement__FluentAssignment_3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:877:2: rule__Statement__FluentAssignment_3
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl1829);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:887:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:891:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:892:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__41859);
            rule__Statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__41862);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:899:1: rule__Statement__Group__4__Impl : ( ( rule__Statement__Group_4__0 )* ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:903:1: ( ( ( rule__Statement__Group_4__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:904:1: ( ( rule__Statement__Group_4__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:904:1: ( ( rule__Statement__Group_4__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:905:1: ( rule__Statement__Group_4__0 )*
            {
             before(grammarAccess.getStatementAccess().getGroup_4()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:906:1: ( rule__Statement__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:906:2: rule__Statement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl1889);
            	    rule__Statement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:916:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:920:1: ( rule__Statement__Group__5__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:921:2: rule__Statement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__51920);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:927:1: rule__Statement__Group__5__Impl : ( ';' ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:931:1: ( ( ';' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:932:1: ( ';' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:932:1: ( ';' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:933:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Statement__Group__5__Impl1948); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:958:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:962:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:963:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__01991);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__01994);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:970:1: rule__Statement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:974:1: ( ( ',' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:975:1: ( ',' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:975:1: ( ',' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:976:1: ','
            {
             before(grammarAccess.getStatementAccess().getCommaKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Statement__Group_4__0__Impl2022); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:989:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:993:1: ( rule__Statement__Group_4__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:994:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12053);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1000:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__FluentAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1004:1: ( ( ( rule__Statement__FluentAssignment_4_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1005:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1005:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1006:1: ( rule__Statement__FluentAssignment_4_1 )
            {
             before(grammarAccess.getStatementAccess().getFluentAssignment_4_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1007:1: ( rule__Statement__FluentAssignment_4_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1007:2: rule__Statement__FluentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2080);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1021:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1025:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1026:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02114);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02117);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1033:1: rule__Event__Group__0__Impl : ( ( rule__Event__EventNameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1037:1: ( ( ( rule__Event__EventNameAssignment_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1038:1: ( ( rule__Event__EventNameAssignment_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1038:1: ( ( rule__Event__EventNameAssignment_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1039:1: ( rule__Event__EventNameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1040:1: ( rule__Event__EventNameAssignment_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1040:2: rule__Event__EventNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2144);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1050:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1054:1: ( rule__Event__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1055:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12174);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1061:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1065:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1066:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1066:1: ( ( rule__Event__Group_1__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1067:1: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1068:1: ( rule__Event__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1068:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2201);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1082:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1086:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1087:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02236);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02239);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1094:1: rule__Event__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1098:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1099:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1099:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1100:1: '('
            {
             before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Event__Group_1__0__Impl2267); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1113:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1117:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1118:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12298);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12301);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1125:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__ParamAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1129:1: ( ( ( rule__Event__ParamAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1130:1: ( ( rule__Event__ParamAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1130:1: ( ( rule__Event__ParamAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1131:1: ( rule__Event__ParamAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getParamAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1132:1: ( rule__Event__ParamAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1132:2: rule__Event__ParamAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__ParamAssignment_1_1_in_rule__Event__Group_1__1__Impl2328);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1142:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1146:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1147:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22358);
            rule__Event__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22361);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1154:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1158:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1159:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1159:1: ( ( rule__Event__Group_1_2__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1160:1: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1161:1: ( rule__Event__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1161:2: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl2388);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1171:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1175:1: ( rule__Event__Group_1__3__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1176:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__32419);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1182:1: rule__Event__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1186:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1187:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1187:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1188:1: ')'
            {
             before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 
            match(input,29,FOLLOW_29_in_rule__Event__Group_1__3__Impl2447); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1209:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1213:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1214:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__02486);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__02489);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1221:1: rule__Event__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1225:1: ( ( ',' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1226:1: ( ',' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1226:1: ( ',' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1227:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Event__Group_1_2__0__Impl2517); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1240:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1244:1: ( rule__Event__Group_1_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1245:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__12548);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1251:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__ParamAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1255:1: ( ( ( rule__Event__ParamAssignment_1_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1256:1: ( ( rule__Event__ParamAssignment_1_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1256:1: ( ( rule__Event__ParamAssignment_1_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1257:1: ( rule__Event__ParamAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getParamAssignment_1_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1258:1: ( rule__Event__ParamAssignment_1_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1258:2: rule__Event__ParamAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Event__ParamAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl2575);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1272:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1276:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1277:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__02609);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__02612);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1284:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__NameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1288:1: ( ( ( rule__Fluent__NameAssignment_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1289:1: ( ( rule__Fluent__NameAssignment_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1289:1: ( ( rule__Fluent__NameAssignment_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1290:1: ( rule__Fluent__NameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getNameAssignment_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1291:1: ( rule__Fluent__NameAssignment_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1291:2: rule__Fluent__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl2639);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1301:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1305:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1306:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__12669);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__12672);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1313:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1317:1: ( ( ( rule__Fluent__Group_1__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1318:1: ( ( rule__Fluent__Group_1__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1318:1: ( ( rule__Fluent__Group_1__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1319:1: ( rule__Fluent__Group_1__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1320:1: ( rule__Fluent__Group_1__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1320:2: rule__Fluent__Group_1__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl2699);
            rule__Fluent__Group_1__0();

            state._fsp--;


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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1330:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1334:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1335:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__22729);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__22732);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1342:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 )? ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1346:1: ( ( ( rule__Fluent__Group_2__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1347:1: ( ( rule__Fluent__Group_2__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1347:1: ( ( rule__Fluent__Group_2__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1348:1: ( rule__Fluent__Group_2__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1349:1: ( rule__Fluent__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1349:2: rule__Fluent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl2759);
                    rule__Fluent__Group_2__0();

                    state._fsp--;


                    }
                    break;

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1359:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1363:1: ( rule__Fluent__Group__3__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1364:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__32790);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1370:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1374:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1375:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1375:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1376:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1377:1: ( rule__Fluent__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1377:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl2817);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1395:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1399:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1400:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__02856);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__02859);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1407:1: rule__Fluent__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1411:1: ( ( 'to' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1412:1: ( 'to' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1412:1: ( 'to' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1413:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Fluent__Group_1__0__Impl2887); 
             after(grammarAccess.getFluentAccess().getToKeyword_1_0()); 

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1426:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1430:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1431:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__12918);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1437:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1441:1: ( ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1442:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1442:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1443:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1444:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1444:2: rule__Fluent__ValuePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl2945);
            rule__Fluent__ValuePartAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1458:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1462:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1463:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__02979);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__02982);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1470:1: rule__Fluent__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1474:1: ( ( 'in' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1475:1: ( 'in' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1475:1: ( 'in' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1476:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Fluent__Group_2__0__Impl3010); 
             after(grammarAccess.getFluentAccess().getInKeyword_2_0()); 

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1489:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1493:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1494:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13041);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1500:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__TimePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1504:1: ( ( ( rule__Fluent__TimePartAssignment_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1505:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1505:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1506:1: ( rule__Fluent__TimePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1507:1: ( rule__Fluent__TimePartAssignment_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1507:2: rule__Fluent__TimePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3068);
            rule__Fluent__TimePartAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1521:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1525:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1526:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03102);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03105);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1533:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1537:1: ( ( 'if' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1538:1: ( 'if' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1538:1: ( 'if' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1539:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Fluent__Group_3__0__Impl3133); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1552:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1556:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1557:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13164);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1563:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1567:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1568:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1568:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1569:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1570:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1570:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3191);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1584:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1588:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1589:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__03225);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__03228);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1596:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1600:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1601:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1601:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1602:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1603:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1605:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1615:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1619:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1620:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__13286);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1626:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1630:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1631:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1631:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1632:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1633:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1633:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl3313);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1647:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1651:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1652:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__03347);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__03350);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1659:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1663:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1664:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1664:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1665:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1666:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1668:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1678:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1682:1: ( rule__ToRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1683:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__13408);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1689:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1693:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1694:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1694:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1695:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1696:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1696:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl3435);
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


    // $ANTLR start "rule__Or__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1710:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1714:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1715:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03469);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03472);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1722:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1726:1: ( ( ruleAnd ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1727:1: ( ruleAnd )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1727:1: ( ruleAnd )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1728:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl3499);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1739:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1743:1: ( rule__Or__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1744:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13528);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1750:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1754:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1755:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1755:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1756:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1757:1: ( rule__Or__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1757:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl3555);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1771:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1775:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1776:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__03590);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__03593);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1783:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1787:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1788:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1788:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1789:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1790:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1792:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1802:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1806:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1807:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__13651);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__13654);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1814:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1818:1: ( ( 'OR' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1819:1: ( 'OR' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1819:1: ( 'OR' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1820:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__Or__Group_1__1__Impl3682); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1833:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1837:1: ( rule__Or__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1838:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__23713);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1844:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1848:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1849:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1849:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1850:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1851:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1851:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl3740);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1867:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1871:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1872:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__03776);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__03779);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1879:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1883:1: ( ( ruleEquality ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1884:1: ( ruleEquality )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1884:1: ( ruleEquality )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1885:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl3806);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1896:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1900:1: ( rule__And__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1901:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__13835);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1907:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1911:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1912:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1912:1: ( ( rule__And__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1913:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1914:1: ( rule__And__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1914:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl3862);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1928:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1932:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1933:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__03897);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__03900);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1940:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1944:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1945:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1945:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1946:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1947:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1949:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1959:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1963:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1964:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__13958);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__13961);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1971:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1975:1: ( ( 'AND' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1976:1: ( 'AND' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1976:1: ( 'AND' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1977:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__And__Group_1__1__Impl3989); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1990:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1994:1: ( rule__And__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1995:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__24020);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2001:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2005:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2006:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2006:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2007:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2008:1: ( rule__And__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2008:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl4047);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2024:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2028:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2029:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__04083);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__04086);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2036:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2040:1: ( ( ruleComparison ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2041:1: ( ruleComparison )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2041:1: ( ruleComparison )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2042:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl4113);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2053:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2057:1: ( rule__Equality__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2058:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__14142);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2064:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2068:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2069:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2069:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2070:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2071:1: ( rule__Equality__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=12 && LA16_0<=13)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2071:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl4169);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2085:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2089:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2090:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__04204);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__04207);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2097:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2101:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2102:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2102:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2103:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2104:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2106:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2116:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2120:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2121:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__14265);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__14268);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2128:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2132:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2133:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2133:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2134:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2135:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2135:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl4295);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2145:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2149:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2150:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__24325);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2156:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2160:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2161:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2161:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2162:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2163:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2163:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl4352);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2179:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2183:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2184:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04388);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04391);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2191:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2195:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2196:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2196:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2197:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl4418);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2208:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2212:1: ( rule__Comparison__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2213:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14447);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2219:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2223:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2224:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2224:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2225:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2226:1: ( rule__Comparison__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=14 && LA17_0<=17)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2226:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl4474);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2240:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2244:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2245:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__04509);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__04512);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2252:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2256:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2257:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2257:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2258:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2259:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2261:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2271:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2275:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2276:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__14570);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__14573);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2283:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2287:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2288:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2288:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2289:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2290:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2290:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl4600);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2300:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2304:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2305:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__24630);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2311:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2315:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2316:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2316:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2317:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2318:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2318:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl4657);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2334:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2338:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2339:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__04693);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__04696);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2346:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2350:1: ( ( ruleMulOrDiv ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2351:1: ( ruleMulOrDiv )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2351:1: ( ruleMulOrDiv )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2352:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl4723);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2363:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2367:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2368:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__14752);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2374:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2378:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2379:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2379:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2380:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2381:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=35 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2381:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl4779);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2395:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2399:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2400:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__04814);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__04817);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2407:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2411:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2412:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2412:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2413:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2414:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2414:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl4844);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2424:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2428:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2429:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__14874);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2435:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2439:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2440:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2440:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2441:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2442:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2442:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl4901);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2456:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2460:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2461:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__04935);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__04938);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2468:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2472:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2473:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2473:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2474:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2475:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2477:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2487:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2491:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2492:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__14996);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2498:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2502:1: ( ( '+' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2503:1: ( '+' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2503:1: ( '+' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2504:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,35,FOLLOW_35_in_rule__PlusOrMinus__Group_1_0_0__1__Impl5024); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2521:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2525:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2526:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__05059);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__05062);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2533:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2537:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2538:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2538:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2539:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2540:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2542:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2552:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2556:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2557:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__15120);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2563:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2567:1: ( ( '-' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2568:1: ( '-' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2568:1: ( '-' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2569:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,36,FOLLOW_36_in_rule__PlusOrMinus__Group_1_0_1__1__Impl5148); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2586:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2590:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2591:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__05183);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__05186);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2598:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2602:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2603:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2603:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2604:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl5213);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2615:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2619:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2620:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__15242);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2626:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2630:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2631:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2631:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2632:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2633:1: ( rule__MulOrDiv__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=18 && LA19_0<=21)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2633:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl5269);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2647:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2651:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2652:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__05304);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__05307);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2659:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2663:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2664:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2664:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2665:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2666:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2668:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2678:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2682:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2683:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__15365);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__15368);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2690:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2694:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2695:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2695:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2696:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2697:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2697:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl5395);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2707:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2711:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2712:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__25425);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2718:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2722:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2723:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2723:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2724:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2725:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2725:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl5452);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2741:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2745:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2746:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__05488);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__05491);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2753:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2757:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2758:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2758:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2759:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Primary__Group_0__0__Impl5519); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2772:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2776:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2777:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__15550);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__15553);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2784:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2788:1: ( ( ruleExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2789:1: ( ruleExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2789:1: ( ruleExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2790:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl5580);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2801:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2805:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2806:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__25609);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2812:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2816:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2817:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2817:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2818:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,29,FOLLOW_29_in_rule__Primary__Group_0__2__Impl5637); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2837:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2841:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2842:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__05674);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__05677);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2849:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2853:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2854:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2854:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2855:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2856:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2858:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2868:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2872:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2873:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__15735);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__15738);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2880:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2884:1: ( ( '!' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2885:1: ( '!' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2885:1: ( '!' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2886:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,37,FOLLOW_37_in_rule__Primary__Group_1__1__Impl5766); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2899:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2903:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2904:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__25797);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2910:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2914:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2915:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2915:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2916:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2917:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2917:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl5824);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2933:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2937:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2938:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__05860);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__05863);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2945:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2949:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2950:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2950:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2951:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2952:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2954:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2964:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2968:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2969:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__15921);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2975:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2979:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2980:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2980:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2981:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2982:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2982:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl5948);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2996:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3000:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3001:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__05982);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__05985);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3008:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3012:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3013:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3013:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3014:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3015:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3017:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3027:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3031:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3032:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16043);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3038:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3042:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3043:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3043:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3044:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3045:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3045:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6070);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3059:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3063:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3064:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06104);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06107);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3071:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3075:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3076:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3076:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3077:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3078:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3080:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3090:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3094:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3095:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16165);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3101:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3105:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3106:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3106:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3107:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3108:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3108:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl6192);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3122:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3126:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3127:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__06226);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__06229);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3134:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3138:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3139:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3139:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3140:1: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3141:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3143:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3153:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3157:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3158:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__16287);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__16290);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3165:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3169:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3170:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3170:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3171:1: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3172:1: ( rule__Atomic__RefAssignment_3_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3172:2: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl6317);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3182:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3186:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3187:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__26347);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3193:1: rule__Atomic__Group_3__2__Impl : ( ( rule__Atomic__Group_3_2__0 )? ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3197:1: ( ( ( rule__Atomic__Group_3_2__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3198:1: ( ( rule__Atomic__Group_3_2__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3198:1: ( ( rule__Atomic__Group_3_2__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3199:1: ( rule__Atomic__Group_3_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_3_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3200:1: ( rule__Atomic__Group_3_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3200:2: rule__Atomic__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl6374);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3216:1: rule__Atomic__Group_3_2__0 : rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 ;
    public final void rule__Atomic__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3220:1: ( rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3221:2: rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__06411);
            rule__Atomic__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__06414);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3228:1: rule__Atomic__Group_3_2__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3232:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3233:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3233:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3234:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Atomic__Group_3_2__0__Impl6442); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_2_0()); 

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3247:1: rule__Atomic__Group_3_2__1 : rule__Atomic__Group_3_2__1__Impl rule__Atomic__Group_3_2__2 ;
    public final void rule__Atomic__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3251:1: ( rule__Atomic__Group_3_2__1__Impl rule__Atomic__Group_3_2__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3252:2: rule__Atomic__Group_3_2__1__Impl rule__Atomic__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__16473);
            rule__Atomic__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__2_in_rule__Atomic__Group_3_2__16476);
            rule__Atomic__Group_3_2__2();

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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3259:1: rule__Atomic__Group_3_2__1__Impl : ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) ;
    public final void rule__Atomic__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3263:1: ( ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3264:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3264:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3265:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3266:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3266:2: rule__Atomic__FluentValueSampleAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl6503);
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


    // $ANTLR start "rule__Atomic__Group_3_2__2"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3276:1: rule__Atomic__Group_3_2__2 : rule__Atomic__Group_3_2__2__Impl ;
    public final void rule__Atomic__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3280:1: ( rule__Atomic__Group_3_2__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3281:2: rule__Atomic__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__2__Impl_in_rule__Atomic__Group_3_2__26533);
            rule__Atomic__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3_2__2"


    // $ANTLR start "rule__Atomic__Group_3_2__2__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3287:1: rule__Atomic__Group_3_2__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3291:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3292:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3292:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3293:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_2_2()); 
            match(input,29,FOLLOW_29_in_rule__Atomic__Group_3_2__2__Impl6561); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_2_2()); 

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
    // $ANTLR end "rule__Atomic__Group_3_2__2__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3312:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3316:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3317:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__06598);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__06601);
            rule__Atomic__Group_4__1();

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
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3324:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3328:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3329:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3329:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3330:1: ()
            {
             before(grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3331:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3333:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3343:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3347:1: ( rule__Atomic__Group_4__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3348:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__16659);
            rule__Atomic__Group_4__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3354:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__ValueAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3358:1: ( ( ( rule__Atomic__ValueAssignment_4_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3359:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3359:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3360:1: ( rule__Atomic__ValueAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3361:1: ( rule__Atomic__ValueAssignment_4_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3361:2: rule__Atomic__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_4_1_in_rule__Atomic__Group_4__1__Impl6686);
            rule__Atomic__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 

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
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__DroolsModel__StatementsAssignment"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3376:1: rule__DroolsModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__DroolsModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3380:1: ( ( ruleStatement ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3381:1: ( ruleStatement )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3381:1: ( ruleStatement )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3382:1: ruleStatement
            {
             before(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment6725);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3391:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3395:1: ( ( ruleEvent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3396:1: ( ruleEvent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3396:1: ( ruleEvent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3397:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_16756);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3406:1: rule__Statement__FluentAssignment_3 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3410:1: ( ( ruleFluent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3411:1: ( ruleFluent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3411:1: ( ruleFluent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3412:1: ruleFluent
            {
             before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_36787);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3421:1: rule__Statement__FluentAssignment_4_1 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3425:1: ( ( ruleFluent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3426:1: ( ruleFluent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3426:1: ( ruleFluent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3427:1: ruleFluent
            {
             before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_16818);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3436:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3440:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3441:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3441:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3442:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_06849); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3451:1: rule__Event__ParamAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3455:1: ( ( ruleEventFeature ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3456:1: ( ruleEventFeature )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3456:1: ( ruleEventFeature )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3457:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_16880);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3466:1: rule__Event__ParamAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3470:1: ( ( ruleEventFeature ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3471:1: ( ruleEventFeature )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3471:1: ( ruleEventFeature )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3472:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_2_16911);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3481:1: rule__Fluent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3485:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3486:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3486:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3487:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_06942); 
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


    // $ANTLR start "rule__Fluent__ValuePartAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3496:1: rule__Fluent__ValuePartAssignment_1_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3500:1: ( ( ruleToRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3501:1: ( ruleToRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3501:1: ( ruleToRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3502:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_16973);
            ruleToRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Fluent__ValuePartAssignment_1_1"


    // $ANTLR start "rule__Fluent__TimePartAssignment_2_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3511:1: rule__Fluent__TimePartAssignment_2_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3515:1: ( ( ruleInRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3516:1: ( ruleInRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3516:1: ( ruleInRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3517:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_17004);
            ruleInRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Fluent__TimePartAssignment_2_1"


    // $ANTLR start "rule__Fluent__CondPartAssignment_3_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3526:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3530:1: ( ( ruleConditionRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3531:1: ( ruleConditionRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3531:1: ( ruleConditionRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3532:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_17035);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3541:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3545:1: ( ( ruleExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3546:1: ( ruleExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3546:1: ( ruleExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3547:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_17066);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3556:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3560:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3561:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3561:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3562:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_17097);
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


    // $ANTLR start "rule__InRule__TimeAssignment"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3571:1: rule__InRule__TimeAssignment : ( rulePlusOrMinus ) ;
    public final void rule__InRule__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3575:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3576:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3576:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3577:1: rulePlusOrMinus
            {
             before(grammarAccess.getInRuleAccess().getTimePlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__InRule__TimeAssignment7128);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getInRuleAccess().getTimePlusOrMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__InRule__TimeAssignment"


    // $ANTLR start "rule__EventFeature__NameAssignment"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3586:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3590:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3591:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3591:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3592:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment7159); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3601:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3605:1: ( ( ruleAnd ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3606:1: ( ruleAnd )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3606:1: ( ruleAnd )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3607:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_27190);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3616:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3620:1: ( ( ruleEquality ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3621:1: ( ruleEquality )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3621:1: ( ruleEquality )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3622:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_27221);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3631:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3635:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3636:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3636:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3637:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3638:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3638:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_17252);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3647:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3651:1: ( ( ruleComparison ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3652:1: ( ruleComparison )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3652:1: ( ruleComparison )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3653:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_27285);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3662:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3666:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3667:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3667:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3668:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3669:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3669:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_17316);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3678:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3682:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3683:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3683:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3684:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_27349);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3693:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3697:1: ( ( ruleMulOrDiv ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3698:1: ( ruleMulOrDiv )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3698:1: ( ruleMulOrDiv )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3699:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_17380);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3708:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3712:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3713:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3713:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3714:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3715:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3715:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_17411);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3724:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3728:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3729:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3729:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3730:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_27444);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3739:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3743:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3744:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3744:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3745:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_27475);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3754:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3758:1: ( ( RULE_FLOAT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3759:1: ( RULE_FLOAT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3759:1: ( RULE_FLOAT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3760:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_17506); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3769:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3773:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3774:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3774:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3775:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_17537); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3784:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3788:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3789:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3789:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3790:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3791:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3791:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_17568);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3800:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3804:1: ( ( ( RULE_ID ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3805:1: ( ( RULE_ID ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3805:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3806:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3807:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3808:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_17605); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3819:1: rule__Atomic__FluentValueSampleAssignment_3_2_1 : ( RULE_INT ) ;
    public final void rule__Atomic__FluentValueSampleAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3823:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3824:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3824:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3825:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleINTTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__FluentValueSampleAssignment_3_2_17640); 
             after(grammarAccess.getAtomicAccess().getFluentValueSampleINTTerminalRuleCall_3_2_1_0()); 

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


    // $ANTLR start "rule__Atomic__ValueAssignment_4_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3834:1: rule__Atomic__ValueAssignment_4_1 : ( ( 'now' ) ) ;
    public final void rule__Atomic__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3838:1: ( ( ( 'now' ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3839:1: ( ( 'now' ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3839:1: ( ( 'now' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3840:1: ( 'now' )
            {
             before(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3841:1: ( 'now' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3842:1: 'now'
            {
             before(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Atomic__ValueAssignment_4_17676); 
             after(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 

            }

             after(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDroolsModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DroolsModel__StatementsAssignment_in_ruleDroolsModel94 = new BitSet(new long[]{0x0000000001000002L});
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
    public static final BitSet FOLLOW_rule__InRule__TimeAssignment_in_ruleInRule455 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_01093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_01113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_01148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_01188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MulOrDiv__OpAlternatives_1_1_01294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MulOrDiv__OpAlternatives_1_1_01314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MulOrDiv__OpAlternatives_1_1_01334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_01354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Atomic__ValueAlternatives_2_1_01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__ValueAlternatives_2_1_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__01615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__01618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Statement__Group__0__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__11677 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__11680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__21737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__21740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Statement__Group__2__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__31799 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__31802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__41859 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__41862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl1889 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__51920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Statement__Group__5__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__01991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__01994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Statement__Group_4__0__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02114 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Event__Group_1__0__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12298 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamAssignment_1_1_in_rule__Event__Group_1__1__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22358 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl2388 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__32419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Event__Group_1__3__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__02486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__02489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Event__Group_1_2__0__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__12548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__02609 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__02612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__12669 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__12672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__22729 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__22732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__32790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__02856 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__02859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Fluent__Group_1__0__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__12918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__02979 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__02982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Fluent__Group_2__0__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03102 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Fluent__Group_3__0__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__03225 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__03228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__13286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__03347 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__13408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03469 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl3555 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__03590 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__03593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__13651 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Or__Group_1__1__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__23713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__03776 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__03779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl3862 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__03897 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__13958 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__And__Group_1__1__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__24020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__04083 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__14142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl4169 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__04204 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__14265 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__14268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__24325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04388 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl4474 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__04509 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__04512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__14570 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__14573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__24630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__04693 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__04696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__14752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl4779 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__04814 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__04817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__14874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__04935 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__04938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__14996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PlusOrMinus__Group_1_0_0__1__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__05059 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__05062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__15120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PlusOrMinus__Group_1_0_1__1__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__05183 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__05186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__15242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl5269 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__05304 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__05307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__15365 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__15368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__25425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__05488 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__05491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Primary__Group_0__0__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__15550 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__15553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__25609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Primary__Group_0__2__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__05674 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__05677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__15735 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Primary__Group_1__1__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__25797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__05860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__05863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__15921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__05982 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__05985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06104 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__06226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__06229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__16287 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__16290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__26347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__06411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__06414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atomic__Group_3_2__0__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__16473 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__2_in_rule__Atomic__Group_3_2__16476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__2__Impl_in_rule__Atomic__Group_3_2__26533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atomic__Group_3_2__2__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__06598 = new BitSet(new long[]{0x0000006010C00070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__06601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__16659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_4_1_in_rule__Atomic__Group_4__1__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_16756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_36787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_16818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_06849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_16880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_2_16911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_06942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_16973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_17004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_17035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_17066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__InRule__TimeAssignment7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_27190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_27221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_17252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_27285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_17316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_27349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_17380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_17411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_27444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_27475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_17506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_17537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_17568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_17605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__FluentValueSampleAssignment_3_2_17640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Atomic__ValueAssignment_4_17676 = new BitSet(new long[]{0x0000000000000002L});

}