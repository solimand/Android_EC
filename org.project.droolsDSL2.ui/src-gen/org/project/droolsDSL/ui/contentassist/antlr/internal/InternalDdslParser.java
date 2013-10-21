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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'-'", "'+'", "'on'", "'set'", "';'", "','", "'('", "')'", "'in'", "'to'", "'if'", "'OR'", "'AND'", "'!'", "'at'", "'now'"
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:605:1: ruleAtTimeAtomic : ( ( rule__AtTimeAtomic__Alternatives ) ) ;
    public final void ruleAtTimeAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:609:2: ( ( ( rule__AtTimeAtomic__Alternatives ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:610:1: ( ( rule__AtTimeAtomic__Alternatives ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:610:1: ( ( rule__AtTimeAtomic__Alternatives ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:611:1: ( rule__AtTimeAtomic__Alternatives )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAlternatives()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:612:1: ( rule__AtTimeAtomic__Alternatives )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:612:2: rule__AtTimeAtomic__Alternatives
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Alternatives_in_ruleAtTimeAtomic1238);
            rule__AtTimeAtomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:717:1: ruleInTimeAtomic : ( ( rule__InTimeAtomic__Alternatives ) ) ;
    public final void ruleInTimeAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:721:2: ( ( ( rule__InTimeAtomic__Alternatives ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:722:1: ( ( rule__InTimeAtomic__Alternatives ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:722:1: ( ( rule__InTimeAtomic__Alternatives ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:723:1: ( rule__InTimeAtomic__Alternatives )
            {
             before(grammarAccess.getInTimeAtomicAccess().getAlternatives()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:724:1: ( rule__InTimeAtomic__Alternatives )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:724:2: rule__InTimeAtomic__Alternatives
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Alternatives_in_ruleInTimeAtomic1477);
            rule__InTimeAtomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getAlternatives()); 

            }


            }

        }
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
            else if ( (LA10_0==RULE_INT||LA10_0==39) ) {
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


    // $ANTLR start "rule__AtTimeAtomic__Alternatives"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1005:1: rule__AtTimeAtomic__Alternatives : ( ( ( rule__AtTimeAtomic__Group_0__0 ) ) | ( ( rule__AtTimeAtomic__Group_1__0 ) ) );
    public final void rule__AtTimeAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1009:1: ( ( ( rule__AtTimeAtomic__Group_0__0 ) ) | ( ( rule__AtTimeAtomic__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1010:1: ( ( rule__AtTimeAtomic__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1010:1: ( ( rule__AtTimeAtomic__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1011:1: ( rule__AtTimeAtomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtTimeAtomicAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1012:1: ( rule__AtTimeAtomic__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1012:2: rule__AtTimeAtomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0_in_rule__AtTimeAtomic__Alternatives2125);
                    rule__AtTimeAtomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimeAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1016:6: ( ( rule__AtTimeAtomic__Group_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1016:6: ( ( rule__AtTimeAtomic__Group_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1017:1: ( rule__AtTimeAtomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtTimeAtomicAccess().getGroup_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1018:1: ( rule__AtTimeAtomic__Group_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1018:2: rule__AtTimeAtomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0_in_rule__AtTimeAtomic__Alternatives2143);
                    rule__AtTimeAtomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimeAtomicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AtTimeAtomic__Alternatives"


    // $ANTLR start "rule__InTimeExpression__OpAlternatives_1_1_0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1027:1: rule__InTimeExpression__OpAlternatives_1_1_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__InTimeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1031:1: ( ( '-' ) | ( '+' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1032:1: ( '-' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1032:1: ( '-' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1033:1: '-'
                    {
                     before(grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__InTimeExpression__OpAlternatives_1_1_02177); 
                     after(grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1040:6: ( '+' )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1040:6: ( '+' )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1041:1: '+'
                    {
                     before(grammarAccess.getInTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__InTimeExpression__OpAlternatives_1_1_02197); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1053:1: rule__InTimePrimary__Alternatives : ( ( ( rule__InTimePrimary__Group_0__0 ) ) | ( ruleInTimeAtomic ) );
    public final void rule__InTimePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1057:1: ( ( ( rule__InTimePrimary__Group_0__0 ) ) | ( ruleInTimeAtomic ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT||LA13_0==39) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1058:1: ( ( rule__InTimePrimary__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1058:1: ( ( rule__InTimePrimary__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1059:1: ( rule__InTimePrimary__Group_0__0 )
                    {
                     before(grammarAccess.getInTimePrimaryAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1060:1: ( rule__InTimePrimary__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1060:2: rule__InTimePrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InTimePrimary__Group_0__0_in_rule__InTimePrimary__Alternatives2231);
                    rule__InTimePrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimePrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1064:6: ( ruleInTimeAtomic )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1064:6: ( ruleInTimeAtomic )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1065:1: ruleInTimeAtomic
                    {
                     before(grammarAccess.getInTimePrimaryAccess().getInTimeAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInTimeAtomic_in_rule__InTimePrimary__Alternatives2249);
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


    // $ANTLR start "rule__InTimeAtomic__Alternatives"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1075:1: rule__InTimeAtomic__Alternatives : ( ( ( rule__InTimeAtomic__Group_0__0 ) ) | ( ( rule__InTimeAtomic__Group_1__0 ) ) );
    public final void rule__InTimeAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1079:1: ( ( ( rule__InTimeAtomic__Group_0__0 ) ) | ( ( rule__InTimeAtomic__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1080:1: ( ( rule__InTimeAtomic__Group_0__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1080:1: ( ( rule__InTimeAtomic__Group_0__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1081:1: ( rule__InTimeAtomic__Group_0__0 )
                    {
                     before(grammarAccess.getInTimeAtomicAccess().getGroup_0()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1082:1: ( rule__InTimeAtomic__Group_0__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1082:2: rule__InTimeAtomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__0_in_rule__InTimeAtomic__Alternatives2281);
                    rule__InTimeAtomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimeAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1086:6: ( ( rule__InTimeAtomic__Group_1__0 ) )
                    {
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1086:6: ( ( rule__InTimeAtomic__Group_1__0 ) )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1087:1: ( rule__InTimeAtomic__Group_1__0 )
                    {
                     before(grammarAccess.getInTimeAtomicAccess().getGroup_1()); 
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1088:1: ( rule__InTimeAtomic__Group_1__0 )
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1088:2: rule__InTimeAtomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__0_in_rule__InTimeAtomic__Alternatives2299);
                    rule__InTimeAtomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimeAtomicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__InTimeAtomic__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1099:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1103:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1104:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02330);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02333);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1111:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1115:1: ( ( 'on' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1116:1: ( 'on' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1116:1: ( 'on' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1117:1: 'on'
            {
             before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Statement__Group__0__Impl2361); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1130:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1134:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1135:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12392);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12395);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1142:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1146:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1147:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1147:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1148:1: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1149:1: ( rule__Statement__EventAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1149:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2422);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1159:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1163:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1164:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22452);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22455);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1171:1: rule__Statement__Group__2__Impl : ( 'set' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1175:1: ( ( 'set' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1176:1: ( 'set' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1176:1: ( 'set' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1177:1: 'set'
            {
             before(grammarAccess.getStatementAccess().getSetKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Statement__Group__2__Impl2483); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1190:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1194:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1195:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32514);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32517);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1202:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__FluentAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1206:1: ( ( ( rule__Statement__FluentAssignment_3 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1207:1: ( ( rule__Statement__FluentAssignment_3 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1207:1: ( ( rule__Statement__FluentAssignment_3 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1208:1: ( rule__Statement__FluentAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getFluentAssignment_3()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1209:1: ( rule__Statement__FluentAssignment_3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1209:2: rule__Statement__FluentAssignment_3
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl2544);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1219:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1223:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1224:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42574);
            rule__Statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42577);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1231:1: rule__Statement__Group__4__Impl : ( ( rule__Statement__Group_4__0 )* ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1235:1: ( ( ( rule__Statement__Group_4__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1236:1: ( ( rule__Statement__Group_4__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1236:1: ( ( rule__Statement__Group_4__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1237:1: ( rule__Statement__Group_4__0 )*
            {
             before(grammarAccess.getStatementAccess().getGroup_4()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1238:1: ( rule__Statement__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1238:2: rule__Statement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl2604);
            	    rule__Statement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1248:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1252:1: ( rule__Statement__Group__5__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1253:2: rule__Statement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__52635);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1259:1: rule__Statement__Group__5__Impl : ( ';' ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1263:1: ( ( ';' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1264:1: ( ';' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1264:1: ( ';' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1265:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Statement__Group__5__Impl2663); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1290:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1294:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1295:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02706);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02709);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1302:1: rule__Statement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1306:1: ( ( ',' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1307:1: ( ',' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1307:1: ( ',' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1308:1: ','
            {
             before(grammarAccess.getStatementAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group_4__0__Impl2737); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1321:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1325:1: ( rule__Statement__Group_4__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1326:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12768);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1332:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__FluentAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1336:1: ( ( ( rule__Statement__FluentAssignment_4_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1337:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1337:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1338:1: ( rule__Statement__FluentAssignment_4_1 )
            {
             before(grammarAccess.getStatementAccess().getFluentAssignment_4_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1339:1: ( rule__Statement__FluentAssignment_4_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1339:2: rule__Statement__FluentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2795);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1353:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1357:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1358:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02829);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02832);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1365:1: rule__Event__Group__0__Impl : ( ( rule__Event__EventNameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1369:1: ( ( ( rule__Event__EventNameAssignment_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1370:1: ( ( rule__Event__EventNameAssignment_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1370:1: ( ( rule__Event__EventNameAssignment_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1371:1: ( rule__Event__EventNameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1372:1: ( rule__Event__EventNameAssignment_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1372:2: rule__Event__EventNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2859);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1382:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1386:1: ( rule__Event__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1387:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12889);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1393:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1397:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1398:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1398:1: ( ( rule__Event__Group_1__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1399:1: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1400:1: ( rule__Event__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1400:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2916);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1414:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1418:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1419:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02951);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02954);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1426:1: rule__Event__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1430:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1431:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1431:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1432:1: '('
            {
             before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Event__Group_1__0__Impl2982); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1445:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1449:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1450:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__13013);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__13016);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1457:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__ParamAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1461:1: ( ( ( rule__Event__ParamAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1462:1: ( ( rule__Event__ParamAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1462:1: ( ( rule__Event__ParamAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1463:1: ( rule__Event__ParamAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getParamAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1464:1: ( rule__Event__ParamAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1464:2: rule__Event__ParamAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__ParamAssignment_1_1_in_rule__Event__Group_1__1__Impl3043);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1474:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1478:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1479:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__23073);
            rule__Event__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__23076);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1486:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1490:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1491:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1491:1: ( ( rule__Event__Group_1_2__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1492:1: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1493:1: ( rule__Event__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1493:2: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl3103);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1503:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1507:1: ( rule__Event__Group_1__3__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1508:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__33134);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1514:1: rule__Event__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1518:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1519:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1519:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1520:1: ')'
            {
             before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Event__Group_1__3__Impl3162); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1541:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1545:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1546:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03201);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03204);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1553:1: rule__Event__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1557:1: ( ( ',' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1558:1: ( ',' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1558:1: ( ',' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1559:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Event__Group_1_2__0__Impl3232); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1572:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1576:1: ( rule__Event__Group_1_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1577:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13263);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1583:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__ParamAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1587:1: ( ( ( rule__Event__ParamAssignment_1_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1588:1: ( ( rule__Event__ParamAssignment_1_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1588:1: ( ( rule__Event__ParamAssignment_1_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1589:1: ( rule__Event__ParamAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getParamAssignment_1_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1590:1: ( rule__Event__ParamAssignment_1_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1590:2: rule__Event__ParamAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Event__ParamAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3290);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1604:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1608:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1609:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__03324);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__03327);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1616:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__NameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1620:1: ( ( ( rule__Fluent__NameAssignment_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1621:1: ( ( rule__Fluent__NameAssignment_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1621:1: ( ( rule__Fluent__NameAssignment_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1622:1: ( rule__Fluent__NameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getNameAssignment_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1623:1: ( rule__Fluent__NameAssignment_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1623:2: rule__Fluent__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl3354);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1633:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1637:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1638:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__13384);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__13387);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1645:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 )? ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1649:1: ( ( ( rule__Fluent__Group_1__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1650:1: ( ( rule__Fluent__Group_1__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1650:1: ( ( rule__Fluent__Group_1__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1651:1: ( rule__Fluent__Group_1__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1652:1: ( rule__Fluent__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1652:2: rule__Fluent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl3414);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1662:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1666:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1667:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__23445);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__23448);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1674:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 ) ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1678:1: ( ( ( rule__Fluent__Group_2__0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1679:1: ( ( rule__Fluent__Group_2__0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1679:1: ( ( rule__Fluent__Group_2__0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1680:1: ( rule__Fluent__Group_2__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1681:1: ( rule__Fluent__Group_2__0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1681:2: rule__Fluent__Group_2__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl3475);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1691:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1695:1: ( rule__Fluent__Group__3__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1696:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__33505);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1702:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1706:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1707:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1707:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1708:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1709:1: ( rule__Fluent__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1709:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl3532);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1727:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1731:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1732:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__03571);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__03574);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1739:1: rule__Fluent__Group_1__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1743:1: ( ( 'in' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1744:1: ( 'in' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1744:1: ( 'in' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1745:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Fluent__Group_1__0__Impl3602); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1758:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1762:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1763:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__13633);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1769:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__TimePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1773:1: ( ( ( rule__Fluent__TimePartAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1774:1: ( ( rule__Fluent__TimePartAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1774:1: ( ( rule__Fluent__TimePartAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1775:1: ( rule__Fluent__TimePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1776:1: ( rule__Fluent__TimePartAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1776:2: rule__Fluent__TimePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl3660);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1790:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1794:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1795:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__03694);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__03697);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1802:1: rule__Fluent__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1806:1: ( ( 'to' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1807:1: ( 'to' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1807:1: ( 'to' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1808:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Fluent__Group_2__0__Impl3725); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1821:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1825:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1826:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13756);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1832:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__ValuePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1836:1: ( ( ( rule__Fluent__ValuePartAssignment_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1837:1: ( ( rule__Fluent__ValuePartAssignment_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1837:1: ( ( rule__Fluent__ValuePartAssignment_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1838:1: ( rule__Fluent__ValuePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1839:1: ( rule__Fluent__ValuePartAssignment_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1839:2: rule__Fluent__ValuePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3783);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1853:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1857:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1858:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03817);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03820);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1865:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1869:1: ( ( 'if' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1870:1: ( 'if' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1870:1: ( 'if' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1871:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Fluent__Group_3__0__Impl3848); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1884:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1888:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1889:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13879);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1895:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1899:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1900:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1900:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1901:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1902:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1902:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3906);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1916:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1920:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1921:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__03940);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__03943);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1928:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1932:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1933:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1933:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1934:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1935:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1937:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1947:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1951:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1952:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__14001);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1958:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1962:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1963:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1963:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1964:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1965:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1965:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl4028);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1979:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1983:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1984:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__04062);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__04065);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1991:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1995:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1996:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1996:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1997:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:1998:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2000:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2010:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2014:1: ( rule__ToRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2015:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__14123);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2021:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2025:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2026:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2026:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2027:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2028:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2028:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl4150);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2042:1: rule__InRule__Group__0 : rule__InRule__Group__0__Impl rule__InRule__Group__1 ;
    public final void rule__InRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2046:1: ( rule__InRule__Group__0__Impl rule__InRule__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2047:2: rule__InRule__Group__0__Impl rule__InRule__Group__1
            {
            pushFollow(FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__04184);
            rule__InRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__04187);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2054:1: rule__InRule__Group__0__Impl : ( () ) ;
    public final void rule__InRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2058:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2059:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2059:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2060:1: ()
            {
             before(grammarAccess.getInRuleAccess().getInExprAction_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2061:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2063:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2073:1: rule__InRule__Group__1 : rule__InRule__Group__1__Impl ;
    public final void rule__InRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2077:1: ( rule__InRule__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2078:2: rule__InRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__14245);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2084:1: rule__InRule__Group__1__Impl : ( ( rule__InRule__InTimeExprAssignment_1 ) ) ;
    public final void rule__InRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2088:1: ( ( ( rule__InRule__InTimeExprAssignment_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2089:1: ( ( rule__InRule__InTimeExprAssignment_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2089:1: ( ( rule__InRule__InTimeExprAssignment_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2090:1: ( rule__InRule__InTimeExprAssignment_1 )
            {
             before(grammarAccess.getInRuleAccess().getInTimeExprAssignment_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2091:1: ( rule__InRule__InTimeExprAssignment_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2091:2: rule__InRule__InTimeExprAssignment_1
            {
            pushFollow(FOLLOW_rule__InRule__InTimeExprAssignment_1_in_rule__InRule__Group__1__Impl4272);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2105:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2109:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2110:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__04306);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__04309);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2117:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2121:1: ( ( ruleAnd ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2122:1: ( ruleAnd )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2122:1: ( ruleAnd )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2123:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl4336);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2134:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2138:1: ( rule__Or__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2139:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__14365);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2145:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2149:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2150:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2150:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2151:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2152:1: ( rule__Or__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2152:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl4392);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2166:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2170:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2171:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__04427);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__04430);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2178:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2182:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2183:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2183:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2184:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2185:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2187:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2197:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2201:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2202:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__14488);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__14491);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2209:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2213:1: ( ( 'OR' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2214:1: ( 'OR' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2214:1: ( 'OR' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2215:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Or__Group_1__1__Impl4519); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2228:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2232:1: ( rule__Or__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2233:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__24550);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2239:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2243:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2244:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2244:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2245:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2246:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2246:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl4577);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2262:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2266:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2267:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__04613);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__04616);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2274:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2278:1: ( ( ruleEquality ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2279:1: ( ruleEquality )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2279:1: ( ruleEquality )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2280:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl4643);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2291:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2295:1: ( rule__And__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2296:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__14672);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2302:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2306:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2307:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2307:1: ( ( rule__And__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2308:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2309:1: ( rule__And__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2309:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl4699);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2323:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2327:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2328:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__04734);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__04737);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2335:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2339:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2340:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2340:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2341:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2342:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2344:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2354:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2358:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2359:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__14795);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__14798);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2366:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2370:1: ( ( 'AND' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2371:1: ( 'AND' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2371:1: ( 'AND' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2372:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__And__Group_1__1__Impl4826); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2385:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2389:1: ( rule__And__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2390:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__24857);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2396:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2400:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2401:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2401:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2402:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2403:1: ( rule__And__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2403:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl4884);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2419:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2423:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2424:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__04920);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__04923);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2431:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2435:1: ( ( ruleComparison ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2436:1: ( ruleComparison )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2436:1: ( ruleComparison )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2437:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl4950);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2448:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2452:1: ( rule__Equality__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2453:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__14979);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2459:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2463:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2464:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2464:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2465:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2466:1: ( rule__Equality__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=12 && LA22_0<=13)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2466:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl5006);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2480:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2484:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2485:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__05041);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__05044);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2492:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2496:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2497:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2497:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2498:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2499:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2501:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2511:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2515:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2516:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__15102);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__15105);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2523:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2527:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2528:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2528:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2529:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2530:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2530:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl5132);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2540:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2544:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2545:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__25162);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2551:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2555:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2556:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2556:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2557:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2558:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2558:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl5189);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2574:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2578:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2579:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05225);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05228);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2586:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2590:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2591:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2591:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2592:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl5255);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2603:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2607:1: ( rule__Comparison__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2608:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15284);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2614:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2618:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2619:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2619:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2620:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2621:1: ( rule__Comparison__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=14 && LA23_0<=17)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2621:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl5311);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2635:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2639:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2640:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__05346);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__05349);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2647:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2651:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2652:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2652:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2653:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2654:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2656:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2666:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2670:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2671:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__15407);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__15410);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2678:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2682:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2683:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2683:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2684:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2685:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2685:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl5437);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2695:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2699:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2700:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__25467);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2706:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2710:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2711:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2711:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2712:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2713:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2713:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl5494);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2729:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2733:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2734:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__05530);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__05533);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2741:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2745:1: ( ( ruleMulOrDiv ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2746:1: ( ruleMulOrDiv )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2746:1: ( ruleMulOrDiv )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2747:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl5560);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2758:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2762:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2763:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__15589);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2769:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2773:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2774:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2774:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2775:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2776:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=24 && LA24_0<=25)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2776:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl5616);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2790:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2794:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2795:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__05651);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__05654);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2802:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2806:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2807:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2807:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2808:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2809:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2809:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl5681);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2819:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2823:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2824:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__15711);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2830:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2834:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2835:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2835:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2836:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2837:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2837:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl5738);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2851:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2855:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2856:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__05772);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__05775);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2863:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2867:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2868:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2868:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2869:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2870:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2872:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2882:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2886:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2887:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__15833);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2893:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2897:1: ( ( '+' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2898:1: ( '+' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2898:1: ( '+' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2899:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,25,FOLLOW_25_in_rule__PlusOrMinus__Group_1_0_0__1__Impl5861); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2916:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2920:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2921:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__05896);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__05899);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2928:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2932:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2933:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2933:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2934:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2935:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2937:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2947:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2951:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2952:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__15957);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2958:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2962:1: ( ( '-' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2963:1: ( '-' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2963:1: ( '-' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2964:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_24_in_rule__PlusOrMinus__Group_1_0_1__1__Impl5985); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2981:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2985:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2986:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__06020);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__06023);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2993:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2997:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2998:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2998:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:2999:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl6050);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3010:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3014:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3015:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__16079);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3021:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3025:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3026:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3026:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3027:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3028:1: ( rule__MulOrDiv__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=18 && LA25_0<=21)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3028:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl6106);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3042:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3046:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3047:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__06141);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__06144);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3054:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3058:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3059:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3059:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3060:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3061:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3063:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3073:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3077:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3078:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__16202);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__16205);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3085:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3089:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3090:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3090:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3091:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3092:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3092:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl6232);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3102:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3106:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3107:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__26262);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3113:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3117:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3118:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3118:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3119:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3120:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3120:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl6289);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3136:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3140:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3141:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__06325);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__06328);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3148:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3152:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3153:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3153:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3154:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__Primary__Group_0__0__Impl6356); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3167:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3171:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3172:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__16387);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__16390);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3179:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3183:1: ( ( ruleExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3184:1: ( ruleExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3184:1: ( ruleExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3185:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl6417);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3196:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3200:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3201:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__26446);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3207:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3211:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3212:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3212:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3213:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__Primary__Group_0__2__Impl6474); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3232:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3236:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3237:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__06511);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__06514);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3244:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3248:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3249:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3249:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3250:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3251:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3253:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3263:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3267:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3268:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__16572);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__16575);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3275:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3279:1: ( ( '!' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3280:1: ( '!' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3280:1: ( '!' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3281:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,37,FOLLOW_37_in_rule__Primary__Group_1__1__Impl6603); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3294:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3298:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3299:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__26634);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3305:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3309:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3310:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3310:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3311:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3312:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3312:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl6661);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3328:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3332:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3333:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__06697);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__06700);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3340:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3344:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3345:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3345:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3346:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3347:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3349:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3359:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3363:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3364:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__16758);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3370:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3374:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3375:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3375:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3376:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3377:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3377:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl6785);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3391:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3395:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3396:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__06819);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__06822);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3403:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3407:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3408:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3408:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3409:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3410:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3412:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3422:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3426:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3427:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16880);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3433:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3437:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3438:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3438:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3439:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3440:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3440:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6907);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3454:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3458:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3459:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06941);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06944);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3466:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3470:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3471:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3471:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3472:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3473:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3475:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3485:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3489:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3490:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__17002);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3496:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3500:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3501:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3501:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3502:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3503:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3503:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl7029);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3517:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3521:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3522:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__07063);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__07066);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3529:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3533:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3534:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3534:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3535:1: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3536:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3538:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3548:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3552:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3553:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__17124);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__17127);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3560:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3564:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3565:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3565:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3566:1: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3567:1: ( rule__Atomic__RefAssignment_3_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3567:2: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl7154);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3577:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3581:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3582:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__27184);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3588:1: rule__Atomic__Group_3__2__Impl : ( ( rule__Atomic__Group_3_2__0 )? ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3592:1: ( ( ( rule__Atomic__Group_3_2__0 )? ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3593:1: ( ( rule__Atomic__Group_3_2__0 )? )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3593:1: ( ( rule__Atomic__Group_3_2__0 )? )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3594:1: ( rule__Atomic__Group_3_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_3_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3595:1: ( rule__Atomic__Group_3_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3595:2: rule__Atomic__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl7211);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3611:1: rule__Atomic__Group_3_2__0 : rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 ;
    public final void rule__Atomic__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3615:1: ( rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3616:2: rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__07248);
            rule__Atomic__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__07251);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3623:1: rule__Atomic__Group_3_2__0__Impl : ( 'at' ) ;
    public final void rule__Atomic__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3627:1: ( ( 'at' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3628:1: ( 'at' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3628:1: ( 'at' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3629:1: 'at'
            {
             before(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Atomic__Group_3_2__0__Impl7279); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3642:1: rule__Atomic__Group_3_2__1 : rule__Atomic__Group_3_2__1__Impl ;
    public final void rule__Atomic__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3646:1: ( rule__Atomic__Group_3_2__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3647:2: rule__Atomic__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__17310);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3653:1: rule__Atomic__Group_3_2__1__Impl : ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) ;
    public final void rule__Atomic__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3657:1: ( ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3658:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3658:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3659:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3660:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3660:2: rule__Atomic__FluentValueSampleAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl7337);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3674:1: rule__AtTimeExpression__Group__0 : rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 ;
    public final void rule__AtTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3678:1: ( rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3679:2: rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__07371);
            rule__AtTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__07374);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3686:1: rule__AtTimeExpression__Group__0__Impl : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3690:1: ( ( ruleAtTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3691:1: ( ruleAtTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3691:1: ( ruleAtTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3692:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl7401);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3703:1: rule__AtTimeExpression__Group__1 : rule__AtTimeExpression__Group__1__Impl ;
    public final void rule__AtTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3707:1: ( rule__AtTimeExpression__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3708:2: rule__AtTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__17430);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3714:1: rule__AtTimeExpression__Group__1__Impl : ( ( rule__AtTimeExpression__Group_1__0 )* ) ;
    public final void rule__AtTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3718:1: ( ( ( rule__AtTimeExpression__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3719:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3719:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3720:1: ( rule__AtTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3721:1: ( rule__AtTimeExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=24 && LA27_0<=25)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3721:2: rule__AtTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl7457);
            	    rule__AtTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3735:1: rule__AtTimeExpression__Group_1__0 : rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 ;
    public final void rule__AtTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3739:1: ( rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3740:2: rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__07492);
            rule__AtTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__07495);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3747:1: rule__AtTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3751:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3752:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3752:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3753:1: ()
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3754:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3756:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3766:1: rule__AtTimeExpression__Group_1__1 : rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 ;
    public final void rule__AtTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3770:1: ( rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3771:2: rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__17553);
            rule__AtTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__17556);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3778:1: rule__AtTimeExpression__Group_1__1__Impl : ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AtTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3782:1: ( ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3783:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3783:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3784:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3785:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3785:2: rule__AtTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl7583);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3795:1: rule__AtTimeExpression__Group_1__2 : rule__AtTimeExpression__Group_1__2__Impl ;
    public final void rule__AtTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3799:1: ( rule__AtTimeExpression__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3800:2: rule__AtTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__27613);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3806:1: rule__AtTimeExpression__Group_1__2__Impl : ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AtTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3810:1: ( ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3811:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3811:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3812:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3813:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3813:2: rule__AtTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl7640);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3829:1: rule__AtTimePrimary__Group_0__0 : rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 ;
    public final void rule__AtTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3833:1: ( rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3834:2: rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__07676);
            rule__AtTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__07679);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3841:1: rule__AtTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3845:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3846:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3846:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3847:1: '('
            {
             before(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__AtTimePrimary__Group_0__0__Impl7707); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3860:1: rule__AtTimePrimary__Group_0__1 : rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 ;
    public final void rule__AtTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3864:1: ( rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3865:2: rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__17738);
            rule__AtTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__17741);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3872:1: rule__AtTimePrimary__Group_0__1__Impl : ( ruleAtTimeExpression ) ;
    public final void rule__AtTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3876:1: ( ( ruleAtTimeExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3877:1: ( ruleAtTimeExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3877:1: ( ruleAtTimeExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3878:1: ruleAtTimeExpression
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl7768);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3889:1: rule__AtTimePrimary__Group_0__2 : rule__AtTimePrimary__Group_0__2__Impl ;
    public final void rule__AtTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3893:1: ( rule__AtTimePrimary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3894:2: rule__AtTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__27797);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3900:1: rule__AtTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3904:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3905:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3905:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3906:1: ')'
            {
             before(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__AtTimePrimary__Group_0__2__Impl7825); 
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


    // $ANTLR start "rule__AtTimeAtomic__Group_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3925:1: rule__AtTimeAtomic__Group_0__0 : rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 ;
    public final void rule__AtTimeAtomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3929:1: ( rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3930:2: rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__07862);
            rule__AtTimeAtomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__07865);
            rule__AtTimeAtomic__Group_0__1();

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
    // $ANTLR end "rule__AtTimeAtomic__Group_0__0"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3937:1: rule__AtTimeAtomic__Group_0__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3941:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3942:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3942:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3943:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3944:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3946:1: 
            {
            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_0__0__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3956:1: rule__AtTimeAtomic__Group_0__1 : rule__AtTimeAtomic__Group_0__1__Impl ;
    public final void rule__AtTimeAtomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3960:1: ( rule__AtTimeAtomic__Group_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3961:2: rule__AtTimeAtomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__17923);
            rule__AtTimeAtomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__AtTimeAtomic__Group_0__1"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3967:1: rule__AtTimeAtomic__Group_0__1__Impl : ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3971:1: ( ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3972:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3972:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3973:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_0_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3974:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3974:2: rule__AtTimeAtomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl7950);
            rule__AtTimeAtomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_0__1__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3988:1: rule__AtTimeAtomic__Group_1__0 : rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 ;
    public final void rule__AtTimeAtomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3992:1: ( rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:3993:2: rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__07984);
            rule__AtTimeAtomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__07987);
            rule__AtTimeAtomic__Group_1__1();

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
    // $ANTLR end "rule__AtTimeAtomic__Group_1__0"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4000:1: rule__AtTimeAtomic__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4004:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4005:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4005:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4006:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4007:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4009:1: 
            {
            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_1__0__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4019:1: rule__AtTimeAtomic__Group_1__1 : rule__AtTimeAtomic__Group_1__1__Impl ;
    public final void rule__AtTimeAtomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4023:1: ( rule__AtTimeAtomic__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4024:2: rule__AtTimeAtomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__18045);
            rule__AtTimeAtomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__AtTimeAtomic__Group_1__1"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4030:1: rule__AtTimeAtomic__Group_1__1__Impl : ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4034:1: ( ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4035:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4035:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4036:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4037:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4037:2: rule__AtTimeAtomic__AtTimeValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl8072);
            rule__AtTimeAtomic__AtTimeValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_1__1__Impl"


    // $ANTLR start "rule__InTimeExpression__Group__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4051:1: rule__InTimeExpression__Group__0 : rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1 ;
    public final void rule__InTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4055:1: ( rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4056:2: rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__0__Impl_in_rule__InTimeExpression__Group__08106);
            rule__InTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group__1_in_rule__InTimeExpression__Group__08109);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4063:1: rule__InTimeExpression__Group__0__Impl : ( ruleInTimePrimary ) ;
    public final void rule__InTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4067:1: ( ( ruleInTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4068:1: ( ruleInTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4068:1: ( ruleInTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4069:1: ruleInTimePrimary
            {
             before(grammarAccess.getInTimeExpressionAccess().getInTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__Group__0__Impl8136);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4080:1: rule__InTimeExpression__Group__1 : rule__InTimeExpression__Group__1__Impl ;
    public final void rule__InTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4084:1: ( rule__InTimeExpression__Group__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4085:2: rule__InTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__1__Impl_in_rule__InTimeExpression__Group__18165);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4091:1: rule__InTimeExpression__Group__1__Impl : ( ( rule__InTimeExpression__Group_1__0 )* ) ;
    public final void rule__InTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4095:1: ( ( ( rule__InTimeExpression__Group_1__0 )* ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4096:1: ( ( rule__InTimeExpression__Group_1__0 )* )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4096:1: ( ( rule__InTimeExpression__Group_1__0 )* )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4097:1: ( rule__InTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getInTimeExpressionAccess().getGroup_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4098:1: ( rule__InTimeExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=24 && LA28_0<=25)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4098:2: rule__InTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InTimeExpression__Group_1__0_in_rule__InTimeExpression__Group__1__Impl8192);
            	    rule__InTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4112:1: rule__InTimeExpression__Group_1__0 : rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1 ;
    public final void rule__InTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4116:1: ( rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4117:2: rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__0__Impl_in_rule__InTimeExpression__Group_1__08227);
            rule__InTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__1_in_rule__InTimeExpression__Group_1__08230);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4124:1: rule__InTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__InTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4128:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4129:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4129:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4130:1: ()
            {
             before(grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4131:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4133:1: 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4143:1: rule__InTimeExpression__Group_1__1 : rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2 ;
    public final void rule__InTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4147:1: ( rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4148:2: rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__1__Impl_in_rule__InTimeExpression__Group_1__18288);
            rule__InTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__2_in_rule__InTimeExpression__Group_1__18291);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4155:1: rule__InTimeExpression__Group_1__1__Impl : ( ( rule__InTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__InTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4159:1: ( ( ( rule__InTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4160:1: ( ( rule__InTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4160:1: ( ( rule__InTimeExpression__OpAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4161:1: ( rule__InTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4162:1: ( rule__InTimeExpression__OpAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4162:2: rule__InTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__OpAssignment_1_1_in_rule__InTimeExpression__Group_1__1__Impl8318);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4172:1: rule__InTimeExpression__Group_1__2 : rule__InTimeExpression__Group_1__2__Impl ;
    public final void rule__InTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4176:1: ( rule__InTimeExpression__Group_1__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4177:2: rule__InTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__2__Impl_in_rule__InTimeExpression__Group_1__28348);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4183:1: rule__InTimeExpression__Group_1__2__Impl : ( ( rule__InTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__InTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4187:1: ( ( ( rule__InTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4188:1: ( ( rule__InTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4188:1: ( ( rule__InTimeExpression__RightAssignment_1_2 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4189:1: ( rule__InTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4190:1: ( rule__InTimeExpression__RightAssignment_1_2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4190:2: rule__InTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__InTimeExpression__RightAssignment_1_2_in_rule__InTimeExpression__Group_1__2__Impl8375);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4206:1: rule__InTimePrimary__Group_0__0 : rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1 ;
    public final void rule__InTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4210:1: ( rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4211:2: rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__0__Impl_in_rule__InTimePrimary__Group_0__08411);
            rule__InTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__1_in_rule__InTimePrimary__Group_0__08414);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4218:1: rule__InTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__InTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4222:1: ( ( '(' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4223:1: ( '(' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4223:1: ( '(' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4224:1: '('
            {
             before(grammarAccess.getInTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__InTimePrimary__Group_0__0__Impl8442); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4237:1: rule__InTimePrimary__Group_0__1 : rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2 ;
    public final void rule__InTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4241:1: ( rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4242:2: rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__1__Impl_in_rule__InTimePrimary__Group_0__18473);
            rule__InTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__2_in_rule__InTimePrimary__Group_0__18476);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4249:1: rule__InTimePrimary__Group_0__1__Impl : ( ruleInExpr ) ;
    public final void rule__InTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4253:1: ( ( ruleInExpr ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4254:1: ( ruleInExpr )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4254:1: ( ruleInExpr )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4255:1: ruleInExpr
            {
             before(grammarAccess.getInTimePrimaryAccess().getInExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleInExpr_in_rule__InTimePrimary__Group_0__1__Impl8503);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4266:1: rule__InTimePrimary__Group_0__2 : rule__InTimePrimary__Group_0__2__Impl ;
    public final void rule__InTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4270:1: ( rule__InTimePrimary__Group_0__2__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4271:2: rule__InTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__2__Impl_in_rule__InTimePrimary__Group_0__28532);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4277:1: rule__InTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__InTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4281:1: ( ( ')' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4282:1: ( ')' )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4282:1: ( ')' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4283:1: ')'
            {
             before(grammarAccess.getInTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__InTimePrimary__Group_0__2__Impl8560); 
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


    // $ANTLR start "rule__InTimeAtomic__Group_0__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4302:1: rule__InTimeAtomic__Group_0__0 : rule__InTimeAtomic__Group_0__0__Impl rule__InTimeAtomic__Group_0__1 ;
    public final void rule__InTimeAtomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4306:1: ( rule__InTimeAtomic__Group_0__0__Impl rule__InTimeAtomic__Group_0__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4307:2: rule__InTimeAtomic__Group_0__0__Impl rule__InTimeAtomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__0__Impl_in_rule__InTimeAtomic__Group_0__08597);
            rule__InTimeAtomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__1_in_rule__InTimeAtomic__Group_0__08600);
            rule__InTimeAtomic__Group_0__1();

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
    // $ANTLR end "rule__InTimeAtomic__Group_0__0"


    // $ANTLR start "rule__InTimeAtomic__Group_0__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4314:1: rule__InTimeAtomic__Group_0__0__Impl : ( () ) ;
    public final void rule__InTimeAtomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4318:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4319:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4319:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4320:1: ()
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4321:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4323:1: 
            {
            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_0__0__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_0__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4333:1: rule__InTimeAtomic__Group_0__1 : rule__InTimeAtomic__Group_0__1__Impl ;
    public final void rule__InTimeAtomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4337:1: ( rule__InTimeAtomic__Group_0__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4338:2: rule__InTimeAtomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__1__Impl_in_rule__InTimeAtomic__Group_0__18658);
            rule__InTimeAtomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__InTimeAtomic__Group_0__1"


    // $ANTLR start "rule__InTimeAtomic__Group_0__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4344:1: rule__InTimeAtomic__Group_0__1__Impl : ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) ) ;
    public final void rule__InTimeAtomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4348:1: ( ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4349:1: ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4349:1: ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4350:1: ( rule__InTimeAtomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getInTimeAtomicAccess().getValueAssignment_0_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4351:1: ( rule__InTimeAtomic__ValueAssignment_0_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4351:2: rule__InTimeAtomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__ValueAssignment_0_1_in_rule__InTimeAtomic__Group_0__1__Impl8685);
            rule__InTimeAtomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_0__1__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_1__0"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4365:1: rule__InTimeAtomic__Group_1__0 : rule__InTimeAtomic__Group_1__0__Impl rule__InTimeAtomic__Group_1__1 ;
    public final void rule__InTimeAtomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4369:1: ( rule__InTimeAtomic__Group_1__0__Impl rule__InTimeAtomic__Group_1__1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4370:2: rule__InTimeAtomic__Group_1__0__Impl rule__InTimeAtomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__0__Impl_in_rule__InTimeAtomic__Group_1__08719);
            rule__InTimeAtomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__1_in_rule__InTimeAtomic__Group_1__08722);
            rule__InTimeAtomic__Group_1__1();

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
    // $ANTLR end "rule__InTimeAtomic__Group_1__0"


    // $ANTLR start "rule__InTimeAtomic__Group_1__0__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4377:1: rule__InTimeAtomic__Group_1__0__Impl : ( () ) ;
    public final void rule__InTimeAtomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4381:1: ( ( () ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4382:1: ( () )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4382:1: ( () )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4383:1: ()
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeCurrentTimeAction_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4384:1: ()
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4386:1: 
            {
            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeCurrentTimeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_1__0__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_1__1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4396:1: rule__InTimeAtomic__Group_1__1 : rule__InTimeAtomic__Group_1__1__Impl ;
    public final void rule__InTimeAtomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4400:1: ( rule__InTimeAtomic__Group_1__1__Impl )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4401:2: rule__InTimeAtomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__1__Impl_in_rule__InTimeAtomic__Group_1__18780);
            rule__InTimeAtomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__InTimeAtomic__Group_1__1"


    // $ANTLR start "rule__InTimeAtomic__Group_1__1__Impl"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4407:1: rule__InTimeAtomic__Group_1__1__Impl : ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) ) ;
    public final void rule__InTimeAtomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4411:1: ( ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4412:1: ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4412:1: ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4413:1: ( rule__InTimeAtomic__InTimeValueAssignment_1_1 )
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeValueAssignment_1_1()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4414:1: ( rule__InTimeAtomic__InTimeValueAssignment_1_1 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4414:2: rule__InTimeAtomic__InTimeValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__InTimeValueAssignment_1_1_in_rule__InTimeAtomic__Group_1__1__Impl8807);
            rule__InTimeAtomic__InTimeValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_1__1__Impl"


    // $ANTLR start "rule__DroolsModel__StatementsAssignment"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4429:1: rule__DroolsModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__DroolsModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4433:1: ( ( ruleStatement ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4434:1: ( ruleStatement )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4434:1: ( ruleStatement )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4435:1: ruleStatement
            {
             before(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment8846);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4444:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4448:1: ( ( ruleEvent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4449:1: ( ruleEvent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4449:1: ( ruleEvent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4450:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_18877);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4459:1: rule__Statement__FluentAssignment_3 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4463:1: ( ( ruleFluent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4464:1: ( ruleFluent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4464:1: ( ruleFluent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4465:1: ruleFluent
            {
             before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_38908);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4474:1: rule__Statement__FluentAssignment_4_1 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4478:1: ( ( ruleFluent ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4479:1: ( ruleFluent )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4479:1: ( ruleFluent )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4480:1: ruleFluent
            {
             before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_18939);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4489:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4493:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4494:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4494:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4495:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_08970); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4504:1: rule__Event__ParamAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4508:1: ( ( ruleEventFeature ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4509:1: ( ruleEventFeature )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4509:1: ( ruleEventFeature )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4510:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_19001);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4519:1: rule__Event__ParamAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4523:1: ( ( ruleEventFeature ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4524:1: ( ruleEventFeature )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4524:1: ( ruleEventFeature )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4525:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_2_19032);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4534:1: rule__Fluent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4538:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4539:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4539:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4540:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_09063); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4549:1: rule__Fluent__TimePartAssignment_1_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4553:1: ( ( ruleInRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4554:1: ( ruleInRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4554:1: ( ruleInRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4555:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_1_19094);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4564:1: rule__Fluent__ValuePartAssignment_2_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4568:1: ( ( ruleToRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4569:1: ( ruleToRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4569:1: ( ruleToRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4570:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_2_19125);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4579:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4583:1: ( ( ruleConditionRule ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4584:1: ( ruleConditionRule )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4584:1: ( ruleConditionRule )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4585:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_19156);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4594:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4598:1: ( ( ruleExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4599:1: ( ruleExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4599:1: ( ruleExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4600:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_19187);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4609:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4613:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4614:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4614:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4615:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_19218);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4624:1: rule__InRule__InTimeExprAssignment_1 : ( ruleInTimeExpression ) ;
    public final void rule__InRule__InTimeExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4628:1: ( ( ruleInTimeExpression ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4629:1: ( ruleInTimeExpression )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4629:1: ( ruleInTimeExpression )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4630:1: ruleInTimeExpression
            {
             before(grammarAccess.getInRuleAccess().getInTimeExprInTimeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_rule__InRule__InTimeExprAssignment_19249);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4639:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4643:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4644:1: ( RULE_ID )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4644:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4645:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment9280); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4654:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4658:1: ( ( ruleAnd ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4659:1: ( ruleAnd )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4659:1: ( ruleAnd )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4660:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_29311);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4669:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4673:1: ( ( ruleEquality ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4674:1: ( ruleEquality )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4674:1: ( ruleEquality )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4675:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_29342);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4684:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4688:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4689:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4689:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4690:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4691:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4691:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_19373);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4700:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4704:1: ( ( ruleComparison ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4705:1: ( ruleComparison )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4705:1: ( ruleComparison )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4706:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_29406);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4715:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4719:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4720:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4720:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4721:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4722:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4722:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_19437);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4731:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4735:1: ( ( rulePlusOrMinus ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4736:1: ( rulePlusOrMinus )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4736:1: ( rulePlusOrMinus )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4737:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_29470);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4746:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4750:1: ( ( ruleMulOrDiv ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4751:1: ( ruleMulOrDiv )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4751:1: ( ruleMulOrDiv )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4752:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_19501);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4761:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4765:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4766:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4766:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4767:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4768:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4768:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_19532);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4777:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4781:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4782:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4782:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4783:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_29565);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4792:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4796:1: ( ( rulePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4797:1: ( rulePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4797:1: ( rulePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4798:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_29596);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4807:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4811:1: ( ( RULE_FLOAT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4812:1: ( RULE_FLOAT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4812:1: ( RULE_FLOAT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4813:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_19627); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4822:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4826:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4827:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4827:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4828:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_19658); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4837:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4841:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4842:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4842:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4843:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4844:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4844:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_19689);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4853:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4857:1: ( ( ( RULE_ID ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4858:1: ( ( RULE_ID ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4858:1: ( ( RULE_ID ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4859:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4860:1: ( RULE_ID )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4861:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_19726); 
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4872:1: rule__Atomic__FluentValueSampleAssignment_3_2_1 : ( ruleAtTimePrimary ) ;
    public final void rule__Atomic__FluentValueSampleAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4876:1: ( ( ruleAtTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4877:1: ( ruleAtTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4877:1: ( ruleAtTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4878:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_19761);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4887:1: rule__AtTimeExpression__OpAssignment_1_1 : ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AtTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4891:1: ( ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4892:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4892:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4893:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4894:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4894:2: rule__AtTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_19792);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4903:1: rule__AtTimeExpression__RightAssignment_1_2 : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4907:1: ( ( ruleAtTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4908:1: ( ruleAtTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4908:1: ( ruleAtTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4909:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_29825);
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


    // $ANTLR start "rule__AtTimeAtomic__ValueAssignment_0_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4918:1: rule__AtTimeAtomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AtTimeAtomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4922:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4923:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4923:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4924:1: RULE_INT
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_19856); 
             after(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__ValueAssignment_0_1"


    // $ANTLR start "rule__AtTimeAtomic__AtTimeValueAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4933:1: rule__AtTimeAtomic__AtTimeValueAssignment_1_1 : ( ( 'now' ) ) ;
    public final void rule__AtTimeAtomic__AtTimeValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4937:1: ( ( ( 'now' ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4938:1: ( ( 'now' ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4938:1: ( ( 'now' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4939:1: ( 'now' )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4940:1: ( 'now' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4941:1: 'now'
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_19892); 
             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 

            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__AtTimeValueAssignment_1_1"


    // $ANTLR start "rule__InTimeExpression__OpAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4956:1: rule__InTimeExpression__OpAssignment_1_1 : ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__InTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4960:1: ( ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4961:1: ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4961:1: ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4962:1: ( rule__InTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4963:1: ( rule__InTimeExpression__OpAlternatives_1_1_0 )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4963:2: rule__InTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__InTimeExpression__OpAlternatives_1_1_0_in_rule__InTimeExpression__OpAssignment_1_19931);
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
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4972:1: rule__InTimeExpression__RightAssignment_1_2 : ( ruleInTimePrimary ) ;
    public final void rule__InTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4976:1: ( ( ruleInTimePrimary ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4977:1: ( ruleInTimePrimary )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4977:1: ( ruleInTimePrimary )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4978:1: ruleInTimePrimary
            {
             before(grammarAccess.getInTimeExpressionAccess().getRightInTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__RightAssignment_1_29964);
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


    // $ANTLR start "rule__InTimeAtomic__ValueAssignment_0_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4987:1: rule__InTimeAtomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__InTimeAtomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4991:1: ( ( RULE_INT ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4992:1: ( RULE_INT )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4992:1: ( RULE_INT )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:4993:1: RULE_INT
            {
             before(grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InTimeAtomic__ValueAssignment_0_19995); 
             after(grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__ValueAssignment_0_1"


    // $ANTLR start "rule__InTimeAtomic__InTimeValueAssignment_1_1"
    // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5002:1: rule__InTimeAtomic__InTimeValueAssignment_1_1 : ( ( 'now' ) ) ;
    public final void rule__InTimeAtomic__InTimeValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5006:1: ( ( ( 'now' ) ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5007:1: ( ( 'now' ) )
            {
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5007:1: ( ( 'now' ) )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5008:1: ( 'now' )
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5009:1: ( 'now' )
            // ../org.project.droolsDSL2.ui/src-gen/org/project/droolsDSL/ui/contentassist/antlr/internal/InternalDdsl.g:5010:1: 'now'
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__InTimeAtomic__InTimeValueAssignment_1_110031); 
             after(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 

            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__InTimeValueAssignment_1_1"

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
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Alternatives_in_ruleAtTimeAtomic1238 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__InTimeAtomic__Alternatives_in_ruleInTimeAtomic1477 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0_in_rule__AtTimeAtomic__Alternatives2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0_in_rule__AtTimeAtomic__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InTimeExpression__OpAlternatives_1_1_02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InTimeExpression__OpAlternatives_1_1_02197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__0_in_rule__InTimePrimary__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_rule__InTimePrimary__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__0_in_rule__InTimeAtomic__Alternatives2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__0_in_rule__InTimeAtomic__Alternatives2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Statement__Group__0__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12392 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Statement__Group__2__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32514 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42574 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl2604 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__52635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__5__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_4__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02829 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Event__Group_1__0__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__13013 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__13016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamAssignment_1_1_in_rule__Event__Group_1__1__Impl3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__23073 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__23076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl3103 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__33134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Event__Group_1__3__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Event__Group_1_2__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__03324 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__03327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__13384 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__23445 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__23448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__33505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__03571 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__03574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Fluent__Group_1__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__13633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__03694 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Fluent__Group_2__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03817 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Fluent__Group_3__0__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__03940 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__03943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__04062 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__04065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__14123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__04184 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__04187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__14245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__InTimeExprAssignment_1_in_rule__InRule__Group__1__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__04306 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__04309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl4392 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__04427 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__04430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__14488 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__14491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Or__Group_1__1__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__24550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__04613 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__04616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__14672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl4699 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__04734 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__04737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__14795 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__14798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__And__Group_1__1__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__24857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__04920 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__04923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__14979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl5006 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__05041 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__05044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__15102 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__25162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05225 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl5311 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__05346 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__05349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__15407 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__15410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__25467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__05530 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__05533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl5616 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__05651 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__05654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__15711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__05772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__05775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOrMinus__Group_1_0_0__1__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__05896 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__15957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlusOrMinus__Group_1_0_1__1__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__06020 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__06023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl6106 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__06141 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__06144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__16202 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__16205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__26262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__06325 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__06328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Primary__Group_0__0__Impl6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__16387 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__16390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__26446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Group_0__2__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__06511 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__06514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__16572 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__16575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Primary__Group_1__1__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__26634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__06697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__06700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__16758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__06819 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__06822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06941 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__17002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__07063 = new BitSet(new long[]{0x0000002040C00070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__07066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__17124 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__17127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__27184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl7211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__07248 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__07251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Atomic__Group_3_2__0__Impl7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__17310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__07371 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__07374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__17430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl7457 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__07492 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__07495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__17553 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__17556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__27613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__07676 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__07679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AtTimePrimary__Group_0__0__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__17738 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__17741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__27797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtTimePrimary__Group_0__2__Impl7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__07862 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__07865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__17923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__07984 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__07987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__18045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__0__Impl_in_rule__InTimeExpression__Group__08106 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__1_in_rule__InTimeExpression__Group__08109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__Group__0__Impl8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__1__Impl_in_rule__InTimeExpression__Group__18165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__0_in_rule__InTimeExpression__Group__1__Impl8192 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__0__Impl_in_rule__InTimeExpression__Group_1__08227 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__1_in_rule__InTimeExpression__Group_1__08230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__1__Impl_in_rule__InTimeExpression__Group_1__18288 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__2_in_rule__InTimeExpression__Group_1__18291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__OpAssignment_1_1_in_rule__InTimeExpression__Group_1__1__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__2__Impl_in_rule__InTimeExpression__Group_1__28348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__RightAssignment_1_2_in_rule__InTimeExpression__Group_1__2__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__0__Impl_in_rule__InTimePrimary__Group_0__08411 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__1_in_rule__InTimePrimary__Group_0__08414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InTimePrimary__Group_0__0__Impl8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__1__Impl_in_rule__InTimePrimary__Group_0__18473 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__2_in_rule__InTimePrimary__Group_0__18476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpr_in_rule__InTimePrimary__Group_0__1__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__2__Impl_in_rule__InTimePrimary__Group_0__28532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InTimePrimary__Group_0__2__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__0__Impl_in_rule__InTimeAtomic__Group_0__08597 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__1_in_rule__InTimeAtomic__Group_0__08600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__1__Impl_in_rule__InTimeAtomic__Group_0__18658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__ValueAssignment_0_1_in_rule__InTimeAtomic__Group_0__1__Impl8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__0__Impl_in_rule__InTimeAtomic__Group_1__08719 = new BitSet(new long[]{0x0000008040000040L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__1_in_rule__InTimeAtomic__Group_1__08722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__1__Impl_in_rule__InTimeAtomic__Group_1__18780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__InTimeValueAssignment_1_1_in_rule__InTimeAtomic__Group_1__1__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_38908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_18939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_08970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_19001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamAssignment_1_2_19032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_09063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_1_19094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_2_19125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_19156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_19187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_19218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_rule__InRule__InTimeExprAssignment_19249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_29311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_29342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_19373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_29406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_19437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_29470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_19501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_19532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_29565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_29596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_19627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_19658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_19689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_19726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_19761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_19792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_29825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_19856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_19892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__OpAlternatives_1_1_0_in_rule__InTimeExpression__OpAssignment_1_19931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__RightAssignment_1_29964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InTimeAtomic__ValueAssignment_0_19995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__InTimeAtomic__InTimeValueAssignment_1_110031 = new BitSet(new long[]{0x0000000000000002L});

}