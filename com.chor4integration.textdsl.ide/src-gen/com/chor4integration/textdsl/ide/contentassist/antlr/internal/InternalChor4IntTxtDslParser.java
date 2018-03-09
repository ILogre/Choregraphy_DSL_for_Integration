package com.chor4integration.textdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.chor4integration.textdsl.services.Chor4IntTxtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChor4IntTxtDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EJavaObject'", "'true'", "'false'", "'Choreography'", "'{'", "'}'", "'flowElements'", "','", "'roles'", "'Role'", "'actor'", "'SequenceFlow'", "'target'", "'source'", "'ExclusiveGateway'", "'incomings'", "'('", "')'", "'outgoings'", "'ParallelGateway'", "'StartEvent'", "'EndEvent'", "'AtomicInteraction'", "'sender'", "'receiver'", "'targetOperation'", "'Operation'", "'sideEffect'", "'invokingMsg'", "'answeringMsg'", "'Parameter'", "'type'", "'Service'", "'operations'", "'User'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalChor4IntTxtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChor4IntTxtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChor4IntTxtDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChor4IntTxtDsl.g"; }


    	private Chor4IntTxtDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(Chor4IntTxtDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleChoreography"
    // InternalChor4IntTxtDsl.g:53:1: entryRuleChoreography : ruleChoreography EOF ;
    public final void entryRuleChoreography() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:54:1: ( ruleChoreography EOF )
            // InternalChor4IntTxtDsl.g:55:1: ruleChoreography EOF
            {
             before(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_1);
            ruleChoreography();

            state._fsp--;

             after(grammarAccess.getChoreographyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalChor4IntTxtDsl.g:62:1: ruleChoreography : ( ( rule__Choreography__Group__0 ) ) ;
    public final void ruleChoreography() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:66:2: ( ( ( rule__Choreography__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:67:2: ( ( rule__Choreography__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:67:2: ( ( rule__Choreography__Group__0 ) )
            // InternalChor4IntTxtDsl.g:68:3: ( rule__Choreography__Group__0 )
            {
             before(grammarAccess.getChoreographyAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:69:3: ( rule__Choreography__Group__0 )
            // InternalChor4IntTxtDsl.g:69:4: rule__Choreography__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleFlowElement"
    // InternalChor4IntTxtDsl.g:78:1: entryRuleFlowElement : ruleFlowElement EOF ;
    public final void entryRuleFlowElement() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:79:1: ( ruleFlowElement EOF )
            // InternalChor4IntTxtDsl.g:80:1: ruleFlowElement EOF
            {
             before(grammarAccess.getFlowElementRule()); 
            pushFollow(FOLLOW_1);
            ruleFlowElement();

            state._fsp--;

             after(grammarAccess.getFlowElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFlowElement"


    // $ANTLR start "ruleFlowElement"
    // InternalChor4IntTxtDsl.g:87:1: ruleFlowElement : ( ( rule__FlowElement__Alternatives ) ) ;
    public final void ruleFlowElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:91:2: ( ( ( rule__FlowElement__Alternatives ) ) )
            // InternalChor4IntTxtDsl.g:92:2: ( ( rule__FlowElement__Alternatives ) )
            {
            // InternalChor4IntTxtDsl.g:92:2: ( ( rule__FlowElement__Alternatives ) )
            // InternalChor4IntTxtDsl.g:93:3: ( rule__FlowElement__Alternatives )
            {
             before(grammarAccess.getFlowElementAccess().getAlternatives()); 
            // InternalChor4IntTxtDsl.g:94:3: ( rule__FlowElement__Alternatives )
            // InternalChor4IntTxtDsl.g:94:4: rule__FlowElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FlowElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFlowElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlowElement"


    // $ANTLR start "entryRuleRole"
    // InternalChor4IntTxtDsl.g:103:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:104:1: ( ruleRole EOF )
            // InternalChor4IntTxtDsl.g:105:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalChor4IntTxtDsl.g:112:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:116:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:117:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:117:2: ( ( rule__Role__Group__0 ) )
            // InternalChor4IntTxtDsl.g:118:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:119:3: ( rule__Role__Group__0 )
            // InternalChor4IntTxtDsl.g:119:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEString"
    // InternalChor4IntTxtDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:129:1: ( ruleEString EOF )
            // InternalChor4IntTxtDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalChor4IntTxtDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalChor4IntTxtDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalChor4IntTxtDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalChor4IntTxtDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalChor4IntTxtDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalChor4IntTxtDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSequenceFlow"
    // InternalChor4IntTxtDsl.g:153:1: entryRuleSequenceFlow : ruleSequenceFlow EOF ;
    public final void entryRuleSequenceFlow() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:154:1: ( ruleSequenceFlow EOF )
            // InternalChor4IntTxtDsl.g:155:1: ruleSequenceFlow EOF
            {
             before(grammarAccess.getSequenceFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceFlow();

            state._fsp--;

             after(grammarAccess.getSequenceFlowRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequenceFlow"


    // $ANTLR start "ruleSequenceFlow"
    // InternalChor4IntTxtDsl.g:162:1: ruleSequenceFlow : ( ( rule__SequenceFlow__Group__0 ) ) ;
    public final void ruleSequenceFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:166:2: ( ( ( rule__SequenceFlow__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:167:2: ( ( rule__SequenceFlow__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:167:2: ( ( rule__SequenceFlow__Group__0 ) )
            // InternalChor4IntTxtDsl.g:168:3: ( rule__SequenceFlow__Group__0 )
            {
             before(grammarAccess.getSequenceFlowAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:169:3: ( rule__SequenceFlow__Group__0 )
            // InternalChor4IntTxtDsl.g:169:4: rule__SequenceFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceFlow"


    // $ANTLR start "entryRuleExclusiveGateway"
    // InternalChor4IntTxtDsl.g:178:1: entryRuleExclusiveGateway : ruleExclusiveGateway EOF ;
    public final void entryRuleExclusiveGateway() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:179:1: ( ruleExclusiveGateway EOF )
            // InternalChor4IntTxtDsl.g:180:1: ruleExclusiveGateway EOF
            {
             before(grammarAccess.getExclusiveGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleExclusiveGateway();

            state._fsp--;

             after(grammarAccess.getExclusiveGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExclusiveGateway"


    // $ANTLR start "ruleExclusiveGateway"
    // InternalChor4IntTxtDsl.g:187:1: ruleExclusiveGateway : ( ( rule__ExclusiveGateway__Group__0 ) ) ;
    public final void ruleExclusiveGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:191:2: ( ( ( rule__ExclusiveGateway__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:192:2: ( ( rule__ExclusiveGateway__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:192:2: ( ( rule__ExclusiveGateway__Group__0 ) )
            // InternalChor4IntTxtDsl.g:193:3: ( rule__ExclusiveGateway__Group__0 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:194:3: ( rule__ExclusiveGateway__Group__0 )
            // InternalChor4IntTxtDsl.g:194:4: rule__ExclusiveGateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExclusiveGateway"


    // $ANTLR start "entryRuleParallelGateway"
    // InternalChor4IntTxtDsl.g:203:1: entryRuleParallelGateway : ruleParallelGateway EOF ;
    public final void entryRuleParallelGateway() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:204:1: ( ruleParallelGateway EOF )
            // InternalChor4IntTxtDsl.g:205:1: ruleParallelGateway EOF
            {
             before(grammarAccess.getParallelGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleParallelGateway();

            state._fsp--;

             after(grammarAccess.getParallelGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParallelGateway"


    // $ANTLR start "ruleParallelGateway"
    // InternalChor4IntTxtDsl.g:212:1: ruleParallelGateway : ( ( rule__ParallelGateway__Group__0 ) ) ;
    public final void ruleParallelGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:216:2: ( ( ( rule__ParallelGateway__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:217:2: ( ( rule__ParallelGateway__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:217:2: ( ( rule__ParallelGateway__Group__0 ) )
            // InternalChor4IntTxtDsl.g:218:3: ( rule__ParallelGateway__Group__0 )
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:219:3: ( rule__ParallelGateway__Group__0 )
            // InternalChor4IntTxtDsl.g:219:4: rule__ParallelGateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallelGateway"


    // $ANTLR start "entryRuleStartEvent"
    // InternalChor4IntTxtDsl.g:228:1: entryRuleStartEvent : ruleStartEvent EOF ;
    public final void entryRuleStartEvent() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:229:1: ( ruleStartEvent EOF )
            // InternalChor4IntTxtDsl.g:230:1: ruleStartEvent EOF
            {
             before(grammarAccess.getStartEventRule()); 
            pushFollow(FOLLOW_1);
            ruleStartEvent();

            state._fsp--;

             after(grammarAccess.getStartEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartEvent"


    // $ANTLR start "ruleStartEvent"
    // InternalChor4IntTxtDsl.g:237:1: ruleStartEvent : ( ( rule__StartEvent__Group__0 ) ) ;
    public final void ruleStartEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:241:2: ( ( ( rule__StartEvent__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:242:2: ( ( rule__StartEvent__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:242:2: ( ( rule__StartEvent__Group__0 ) )
            // InternalChor4IntTxtDsl.g:243:3: ( rule__StartEvent__Group__0 )
            {
             before(grammarAccess.getStartEventAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:244:3: ( rule__StartEvent__Group__0 )
            // InternalChor4IntTxtDsl.g:244:4: rule__StartEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartEvent"


    // $ANTLR start "entryRuleEndEvent"
    // InternalChor4IntTxtDsl.g:253:1: entryRuleEndEvent : ruleEndEvent EOF ;
    public final void entryRuleEndEvent() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:254:1: ( ruleEndEvent EOF )
            // InternalChor4IntTxtDsl.g:255:1: ruleEndEvent EOF
            {
             before(grammarAccess.getEndEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEndEvent();

            state._fsp--;

             after(grammarAccess.getEndEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndEvent"


    // $ANTLR start "ruleEndEvent"
    // InternalChor4IntTxtDsl.g:262:1: ruleEndEvent : ( ( rule__EndEvent__Group__0 ) ) ;
    public final void ruleEndEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:266:2: ( ( ( rule__EndEvent__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:267:2: ( ( rule__EndEvent__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:267:2: ( ( rule__EndEvent__Group__0 ) )
            // InternalChor4IntTxtDsl.g:268:3: ( rule__EndEvent__Group__0 )
            {
             before(grammarAccess.getEndEventAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:269:3: ( rule__EndEvent__Group__0 )
            // InternalChor4IntTxtDsl.g:269:4: rule__EndEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndEvent"


    // $ANTLR start "entryRuleAtomicInteraction"
    // InternalChor4IntTxtDsl.g:278:1: entryRuleAtomicInteraction : ruleAtomicInteraction EOF ;
    public final void entryRuleAtomicInteraction() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:279:1: ( ruleAtomicInteraction EOF )
            // InternalChor4IntTxtDsl.g:280:1: ruleAtomicInteraction EOF
            {
             before(grammarAccess.getAtomicInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicInteraction();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomicInteraction"


    // $ANTLR start "ruleAtomicInteraction"
    // InternalChor4IntTxtDsl.g:287:1: ruleAtomicInteraction : ( ( rule__AtomicInteraction__Group__0 ) ) ;
    public final void ruleAtomicInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:291:2: ( ( ( rule__AtomicInteraction__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:292:2: ( ( rule__AtomicInteraction__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:292:2: ( ( rule__AtomicInteraction__Group__0 ) )
            // InternalChor4IntTxtDsl.g:293:3: ( rule__AtomicInteraction__Group__0 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:294:3: ( rule__AtomicInteraction__Group__0 )
            // InternalChor4IntTxtDsl.g:294:4: rule__AtomicInteraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicInteraction"


    // $ANTLR start "entryRuleOperation"
    // InternalChor4IntTxtDsl.g:303:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:304:1: ( ruleOperation EOF )
            // InternalChor4IntTxtDsl.g:305:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalChor4IntTxtDsl.g:312:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:316:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:317:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:317:2: ( ( rule__Operation__Group__0 ) )
            // InternalChor4IntTxtDsl.g:318:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:319:3: ( rule__Operation__Group__0 )
            // InternalChor4IntTxtDsl.g:319:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEBoolean"
    // InternalChor4IntTxtDsl.g:328:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:329:1: ( ruleEBoolean EOF )
            // InternalChor4IntTxtDsl.g:330:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalChor4IntTxtDsl.g:337:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:341:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalChor4IntTxtDsl.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalChor4IntTxtDsl.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalChor4IntTxtDsl.g:343:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalChor4IntTxtDsl.g:344:3: ( rule__EBoolean__Alternatives )
            // InternalChor4IntTxtDsl.g:344:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleParameter"
    // InternalChor4IntTxtDsl.g:353:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:354:1: ( ruleParameter EOF )
            // InternalChor4IntTxtDsl.g:355:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalChor4IntTxtDsl.g:362:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:366:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:367:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:367:2: ( ( rule__Parameter__Group__0 ) )
            // InternalChor4IntTxtDsl.g:368:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:369:3: ( rule__Parameter__Group__0 )
            // InternalChor4IntTxtDsl.g:369:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalChor4IntTxtDsl.g:378:1: entryRuleEJavaObject : ruleEJavaObject EOF ;
    public final void entryRuleEJavaObject() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:379:1: ( ruleEJavaObject EOF )
            // InternalChor4IntTxtDsl.g:380:1: ruleEJavaObject EOF
            {
             before(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEJavaObject();

            state._fsp--;

             after(grammarAccess.getEJavaObjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEJavaObject"


    // $ANTLR start "ruleEJavaObject"
    // InternalChor4IntTxtDsl.g:387:1: ruleEJavaObject : ( 'EJavaObject' ) ;
    public final void ruleEJavaObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:391:2: ( ( 'EJavaObject' ) )
            // InternalChor4IntTxtDsl.g:392:2: ( 'EJavaObject' )
            {
            // InternalChor4IntTxtDsl.g:392:2: ( 'EJavaObject' )
            // InternalChor4IntTxtDsl.g:393:3: 'EJavaObject'
            {
             before(grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEJavaObject"


    // $ANTLR start "entryRuleService"
    // InternalChor4IntTxtDsl.g:403:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:404:1: ( ruleService EOF )
            // InternalChor4IntTxtDsl.g:405:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalChor4IntTxtDsl.g:412:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:416:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:417:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:417:2: ( ( rule__Service__Group__0 ) )
            // InternalChor4IntTxtDsl.g:418:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:419:3: ( rule__Service__Group__0 )
            // InternalChor4IntTxtDsl.g:419:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleUser"
    // InternalChor4IntTxtDsl.g:428:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:429:1: ( ruleUser EOF )
            // InternalChor4IntTxtDsl.g:430:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalChor4IntTxtDsl.g:437:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:441:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:442:2: ( ( rule__User__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:442:2: ( ( rule__User__Group__0 ) )
            // InternalChor4IntTxtDsl.g:443:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:444:3: ( rule__User__Group__0 )
            // InternalChor4IntTxtDsl.g:444:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "rule__FlowElement__Alternatives"
    // InternalChor4IntTxtDsl.g:452:1: rule__FlowElement__Alternatives : ( ( ruleSequenceFlow ) | ( ruleExclusiveGateway ) | ( ruleParallelGateway ) | ( ruleStartEvent ) | ( ruleEndEvent ) | ( ruleAtomicInteraction ) );
    public final void rule__FlowElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:456:1: ( ( ruleSequenceFlow ) | ( ruleExclusiveGateway ) | ( ruleParallelGateway ) | ( ruleStartEvent ) | ( ruleEndEvent ) | ( ruleAtomicInteraction ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 32:
                {
                alt1=5;
                }
                break;
            case 33:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:457:2: ( ruleSequenceFlow )
                    {
                    // InternalChor4IntTxtDsl.g:457:2: ( ruleSequenceFlow )
                    // InternalChor4IntTxtDsl.g:458:3: ruleSequenceFlow
                    {
                     before(grammarAccess.getFlowElementAccess().getSequenceFlowParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceFlow();

                    state._fsp--;

                     after(grammarAccess.getFlowElementAccess().getSequenceFlowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:463:2: ( ruleExclusiveGateway )
                    {
                    // InternalChor4IntTxtDsl.g:463:2: ( ruleExclusiveGateway )
                    // InternalChor4IntTxtDsl.g:464:3: ruleExclusiveGateway
                    {
                     before(grammarAccess.getFlowElementAccess().getExclusiveGatewayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExclusiveGateway();

                    state._fsp--;

                     after(grammarAccess.getFlowElementAccess().getExclusiveGatewayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChor4IntTxtDsl.g:469:2: ( ruleParallelGateway )
                    {
                    // InternalChor4IntTxtDsl.g:469:2: ( ruleParallelGateway )
                    // InternalChor4IntTxtDsl.g:470:3: ruleParallelGateway
                    {
                     before(grammarAccess.getFlowElementAccess().getParallelGatewayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParallelGateway();

                    state._fsp--;

                     after(grammarAccess.getFlowElementAccess().getParallelGatewayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChor4IntTxtDsl.g:475:2: ( ruleStartEvent )
                    {
                    // InternalChor4IntTxtDsl.g:475:2: ( ruleStartEvent )
                    // InternalChor4IntTxtDsl.g:476:3: ruleStartEvent
                    {
                     before(grammarAccess.getFlowElementAccess().getStartEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStartEvent();

                    state._fsp--;

                     after(grammarAccess.getFlowElementAccess().getStartEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChor4IntTxtDsl.g:481:2: ( ruleEndEvent )
                    {
                    // InternalChor4IntTxtDsl.g:481:2: ( ruleEndEvent )
                    // InternalChor4IntTxtDsl.g:482:3: ruleEndEvent
                    {
                     before(grammarAccess.getFlowElementAccess().getEndEventParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEndEvent();

                    state._fsp--;

                     after(grammarAccess.getFlowElementAccess().getEndEventParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChor4IntTxtDsl.g:487:2: ( ruleAtomicInteraction )
                    {
                    // InternalChor4IntTxtDsl.g:487:2: ( ruleAtomicInteraction )
                    // InternalChor4IntTxtDsl.g:488:3: ruleAtomicInteraction
                    {
                     before(grammarAccess.getFlowElementAccess().getAtomicInteractionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicInteraction();

                    state._fsp--;

                     after(grammarAccess.getFlowElementAccess().getAtomicInteractionParserRuleCall_5()); 

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
    // $ANTLR end "rule__FlowElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalChor4IntTxtDsl.g:497:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:501:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:502:2: ( RULE_STRING )
                    {
                    // InternalChor4IntTxtDsl.g:502:2: ( RULE_STRING )
                    // InternalChor4IntTxtDsl.g:503:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:508:2: ( RULE_ID )
                    {
                    // InternalChor4IntTxtDsl.g:508:2: ( RULE_ID )
                    // InternalChor4IntTxtDsl.g:509:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalChor4IntTxtDsl.g:518:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:522:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:523:2: ( 'true' )
                    {
                    // InternalChor4IntTxtDsl.g:523:2: ( 'true' )
                    // InternalChor4IntTxtDsl.g:524:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:529:2: ( 'false' )
                    {
                    // InternalChor4IntTxtDsl.g:529:2: ( 'false' )
                    // InternalChor4IntTxtDsl.g:530:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Choreography__Group__0"
    // InternalChor4IntTxtDsl.g:539:1: rule__Choreography__Group__0 : rule__Choreography__Group__0__Impl rule__Choreography__Group__1 ;
    public final void rule__Choreography__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:543:1: ( rule__Choreography__Group__0__Impl rule__Choreography__Group__1 )
            // InternalChor4IntTxtDsl.g:544:2: rule__Choreography__Group__0__Impl rule__Choreography__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Choreography__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__0"


    // $ANTLR start "rule__Choreography__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:551:1: rule__Choreography__Group__0__Impl : ( () ) ;
    public final void rule__Choreography__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:555:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:556:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:556:1: ( () )
            // InternalChor4IntTxtDsl.g:557:2: ()
            {
             before(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); 
            // InternalChor4IntTxtDsl.g:558:2: ()
            // InternalChor4IntTxtDsl.g:558:3: 
            {
            }

             after(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__0__Impl"


    // $ANTLR start "rule__Choreography__Group__1"
    // InternalChor4IntTxtDsl.g:566:1: rule__Choreography__Group__1 : rule__Choreography__Group__1__Impl rule__Choreography__Group__2 ;
    public final void rule__Choreography__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:570:1: ( rule__Choreography__Group__1__Impl rule__Choreography__Group__2 )
            // InternalChor4IntTxtDsl.g:571:2: rule__Choreography__Group__1__Impl rule__Choreography__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choreography__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__1"


    // $ANTLR start "rule__Choreography__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:578:1: rule__Choreography__Group__1__Impl : ( 'Choreography' ) ;
    public final void rule__Choreography__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:582:1: ( ( 'Choreography' ) )
            // InternalChor4IntTxtDsl.g:583:1: ( 'Choreography' )
            {
            // InternalChor4IntTxtDsl.g:583:1: ( 'Choreography' )
            // InternalChor4IntTxtDsl.g:584:2: 'Choreography'
            {
             before(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__1__Impl"


    // $ANTLR start "rule__Choreography__Group__2"
    // InternalChor4IntTxtDsl.g:593:1: rule__Choreography__Group__2 : rule__Choreography__Group__2__Impl rule__Choreography__Group__3 ;
    public final void rule__Choreography__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:597:1: ( rule__Choreography__Group__2__Impl rule__Choreography__Group__3 )
            // InternalChor4IntTxtDsl.g:598:2: rule__Choreography__Group__2__Impl rule__Choreography__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Choreography__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__2"


    // $ANTLR start "rule__Choreography__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:605:1: rule__Choreography__Group__2__Impl : ( '{' ) ;
    public final void rule__Choreography__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:609:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:610:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:610:1: ( '{' )
            // InternalChor4IntTxtDsl.g:611:2: '{'
            {
             before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__2__Impl"


    // $ANTLR start "rule__Choreography__Group__3"
    // InternalChor4IntTxtDsl.g:620:1: rule__Choreography__Group__3 : rule__Choreography__Group__3__Impl rule__Choreography__Group__4 ;
    public final void rule__Choreography__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:624:1: ( rule__Choreography__Group__3__Impl rule__Choreography__Group__4 )
            // InternalChor4IntTxtDsl.g:625:2: rule__Choreography__Group__3__Impl rule__Choreography__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Choreography__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__3"


    // $ANTLR start "rule__Choreography__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:632:1: rule__Choreography__Group__3__Impl : ( ( rule__Choreography__Group_3__0 )? ) ;
    public final void rule__Choreography__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:636:1: ( ( ( rule__Choreography__Group_3__0 )? ) )
            // InternalChor4IntTxtDsl.g:637:1: ( ( rule__Choreography__Group_3__0 )? )
            {
            // InternalChor4IntTxtDsl.g:637:1: ( ( rule__Choreography__Group_3__0 )? )
            // InternalChor4IntTxtDsl.g:638:2: ( rule__Choreography__Group_3__0 )?
            {
             before(grammarAccess.getChoreographyAccess().getGroup_3()); 
            // InternalChor4IntTxtDsl.g:639:2: ( rule__Choreography__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:639:3: rule__Choreography__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choreography__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoreographyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__3__Impl"


    // $ANTLR start "rule__Choreography__Group__4"
    // InternalChor4IntTxtDsl.g:647:1: rule__Choreography__Group__4 : rule__Choreography__Group__4__Impl rule__Choreography__Group__5 ;
    public final void rule__Choreography__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:651:1: ( rule__Choreography__Group__4__Impl rule__Choreography__Group__5 )
            // InternalChor4IntTxtDsl.g:652:2: rule__Choreography__Group__4__Impl rule__Choreography__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Choreography__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__4"


    // $ANTLR start "rule__Choreography__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:659:1: rule__Choreography__Group__4__Impl : ( ( rule__Choreography__Group_4__0 )? ) ;
    public final void rule__Choreography__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:663:1: ( ( ( rule__Choreography__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:664:1: ( ( rule__Choreography__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:664:1: ( ( rule__Choreography__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:665:2: ( rule__Choreography__Group_4__0 )?
            {
             before(grammarAccess.getChoreographyAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:666:2: ( rule__Choreography__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:666:3: rule__Choreography__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choreography__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoreographyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__4__Impl"


    // $ANTLR start "rule__Choreography__Group__5"
    // InternalChor4IntTxtDsl.g:674:1: rule__Choreography__Group__5 : rule__Choreography__Group__5__Impl ;
    public final void rule__Choreography__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:678:1: ( rule__Choreography__Group__5__Impl )
            // InternalChor4IntTxtDsl.g:679:2: rule__Choreography__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__5"


    // $ANTLR start "rule__Choreography__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:685:1: rule__Choreography__Group__5__Impl : ( '}' ) ;
    public final void rule__Choreography__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:689:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:690:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:690:1: ( '}' )
            // InternalChor4IntTxtDsl.g:691:2: '}'
            {
             before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__5__Impl"


    // $ANTLR start "rule__Choreography__Group_3__0"
    // InternalChor4IntTxtDsl.g:701:1: rule__Choreography__Group_3__0 : rule__Choreography__Group_3__0__Impl rule__Choreography__Group_3__1 ;
    public final void rule__Choreography__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:705:1: ( rule__Choreography__Group_3__0__Impl rule__Choreography__Group_3__1 )
            // InternalChor4IntTxtDsl.g:706:2: rule__Choreography__Group_3__0__Impl rule__Choreography__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Choreography__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__0"


    // $ANTLR start "rule__Choreography__Group_3__0__Impl"
    // InternalChor4IntTxtDsl.g:713:1: rule__Choreography__Group_3__0__Impl : ( 'flowElements' ) ;
    public final void rule__Choreography__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:717:1: ( ( 'flowElements' ) )
            // InternalChor4IntTxtDsl.g:718:1: ( 'flowElements' )
            {
            // InternalChor4IntTxtDsl.g:718:1: ( 'flowElements' )
            // InternalChor4IntTxtDsl.g:719:2: 'flowElements'
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getFlowElementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__0__Impl"


    // $ANTLR start "rule__Choreography__Group_3__1"
    // InternalChor4IntTxtDsl.g:728:1: rule__Choreography__Group_3__1 : rule__Choreography__Group_3__1__Impl rule__Choreography__Group_3__2 ;
    public final void rule__Choreography__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:732:1: ( rule__Choreography__Group_3__1__Impl rule__Choreography__Group_3__2 )
            // InternalChor4IntTxtDsl.g:733:2: rule__Choreography__Group_3__1__Impl rule__Choreography__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Choreography__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__1"


    // $ANTLR start "rule__Choreography__Group_3__1__Impl"
    // InternalChor4IntTxtDsl.g:740:1: rule__Choreography__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Choreography__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:744:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:745:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:745:1: ( '{' )
            // InternalChor4IntTxtDsl.g:746:2: '{'
            {
             before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__1__Impl"


    // $ANTLR start "rule__Choreography__Group_3__2"
    // InternalChor4IntTxtDsl.g:755:1: rule__Choreography__Group_3__2 : rule__Choreography__Group_3__2__Impl rule__Choreography__Group_3__3 ;
    public final void rule__Choreography__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:759:1: ( rule__Choreography__Group_3__2__Impl rule__Choreography__Group_3__3 )
            // InternalChor4IntTxtDsl.g:760:2: rule__Choreography__Group_3__2__Impl rule__Choreography__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Choreography__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__2"


    // $ANTLR start "rule__Choreography__Group_3__2__Impl"
    // InternalChor4IntTxtDsl.g:767:1: rule__Choreography__Group_3__2__Impl : ( ( rule__Choreography__FlowElementsAssignment_3_2 ) ) ;
    public final void rule__Choreography__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:771:1: ( ( ( rule__Choreography__FlowElementsAssignment_3_2 ) ) )
            // InternalChor4IntTxtDsl.g:772:1: ( ( rule__Choreography__FlowElementsAssignment_3_2 ) )
            {
            // InternalChor4IntTxtDsl.g:772:1: ( ( rule__Choreography__FlowElementsAssignment_3_2 ) )
            // InternalChor4IntTxtDsl.g:773:2: ( rule__Choreography__FlowElementsAssignment_3_2 )
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsAssignment_3_2()); 
            // InternalChor4IntTxtDsl.g:774:2: ( rule__Choreography__FlowElementsAssignment_3_2 )
            // InternalChor4IntTxtDsl.g:774:3: rule__Choreography__FlowElementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__FlowElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getFlowElementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__2__Impl"


    // $ANTLR start "rule__Choreography__Group_3__3"
    // InternalChor4IntTxtDsl.g:782:1: rule__Choreography__Group_3__3 : rule__Choreography__Group_3__3__Impl rule__Choreography__Group_3__4 ;
    public final void rule__Choreography__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:786:1: ( rule__Choreography__Group_3__3__Impl rule__Choreography__Group_3__4 )
            // InternalChor4IntTxtDsl.g:787:2: rule__Choreography__Group_3__3__Impl rule__Choreography__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Choreography__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__3"


    // $ANTLR start "rule__Choreography__Group_3__3__Impl"
    // InternalChor4IntTxtDsl.g:794:1: rule__Choreography__Group_3__3__Impl : ( ( rule__Choreography__Group_3_3__0 )* ) ;
    public final void rule__Choreography__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:798:1: ( ( ( rule__Choreography__Group_3_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:799:1: ( ( rule__Choreography__Group_3_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:799:1: ( ( rule__Choreography__Group_3_3__0 )* )
            // InternalChor4IntTxtDsl.g:800:2: ( rule__Choreography__Group_3_3__0 )*
            {
             before(grammarAccess.getChoreographyAccess().getGroup_3_3()); 
            // InternalChor4IntTxtDsl.g:801:2: ( rule__Choreography__Group_3_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:801:3: rule__Choreography__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Choreography__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getChoreographyAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__3__Impl"


    // $ANTLR start "rule__Choreography__Group_3__4"
    // InternalChor4IntTxtDsl.g:809:1: rule__Choreography__Group_3__4 : rule__Choreography__Group_3__4__Impl ;
    public final void rule__Choreography__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:813:1: ( rule__Choreography__Group_3__4__Impl )
            // InternalChor4IntTxtDsl.g:814:2: rule__Choreography__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__4"


    // $ANTLR start "rule__Choreography__Group_3__4__Impl"
    // InternalChor4IntTxtDsl.g:820:1: rule__Choreography__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Choreography__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:824:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:825:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:825:1: ( '}' )
            // InternalChor4IntTxtDsl.g:826:2: '}'
            {
             before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3__4__Impl"


    // $ANTLR start "rule__Choreography__Group_3_3__0"
    // InternalChor4IntTxtDsl.g:836:1: rule__Choreography__Group_3_3__0 : rule__Choreography__Group_3_3__0__Impl rule__Choreography__Group_3_3__1 ;
    public final void rule__Choreography__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:840:1: ( rule__Choreography__Group_3_3__0__Impl rule__Choreography__Group_3_3__1 )
            // InternalChor4IntTxtDsl.g:841:2: rule__Choreography__Group_3_3__0__Impl rule__Choreography__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Choreography__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3_3__0"


    // $ANTLR start "rule__Choreography__Group_3_3__0__Impl"
    // InternalChor4IntTxtDsl.g:848:1: rule__Choreography__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Choreography__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:852:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:853:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:853:1: ( ',' )
            // InternalChor4IntTxtDsl.g:854:2: ','
            {
             before(grammarAccess.getChoreographyAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3_3__0__Impl"


    // $ANTLR start "rule__Choreography__Group_3_3__1"
    // InternalChor4IntTxtDsl.g:863:1: rule__Choreography__Group_3_3__1 : rule__Choreography__Group_3_3__1__Impl ;
    public final void rule__Choreography__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:867:1: ( rule__Choreography__Group_3_3__1__Impl )
            // InternalChor4IntTxtDsl.g:868:2: rule__Choreography__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3_3__1"


    // $ANTLR start "rule__Choreography__Group_3_3__1__Impl"
    // InternalChor4IntTxtDsl.g:874:1: rule__Choreography__Group_3_3__1__Impl : ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) ) ;
    public final void rule__Choreography__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:878:1: ( ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:879:1: ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:879:1: ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) )
            // InternalChor4IntTxtDsl.g:880:2: ( rule__Choreography__FlowElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsAssignment_3_3_1()); 
            // InternalChor4IntTxtDsl.g:881:2: ( rule__Choreography__FlowElementsAssignment_3_3_1 )
            // InternalChor4IntTxtDsl.g:881:3: rule__Choreography__FlowElementsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__FlowElementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getFlowElementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_3_3__1__Impl"


    // $ANTLR start "rule__Choreography__Group_4__0"
    // InternalChor4IntTxtDsl.g:890:1: rule__Choreography__Group_4__0 : rule__Choreography__Group_4__0__Impl rule__Choreography__Group_4__1 ;
    public final void rule__Choreography__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:894:1: ( rule__Choreography__Group_4__0__Impl rule__Choreography__Group_4__1 )
            // InternalChor4IntTxtDsl.g:895:2: rule__Choreography__Group_4__0__Impl rule__Choreography__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Choreography__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__0"


    // $ANTLR start "rule__Choreography__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:902:1: rule__Choreography__Group_4__0__Impl : ( 'roles' ) ;
    public final void rule__Choreography__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:906:1: ( ( 'roles' ) )
            // InternalChor4IntTxtDsl.g:907:1: ( 'roles' )
            {
            // InternalChor4IntTxtDsl.g:907:1: ( 'roles' )
            // InternalChor4IntTxtDsl.g:908:2: 'roles'
            {
             before(grammarAccess.getChoreographyAccess().getRolesKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRolesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__0__Impl"


    // $ANTLR start "rule__Choreography__Group_4__1"
    // InternalChor4IntTxtDsl.g:917:1: rule__Choreography__Group_4__1 : rule__Choreography__Group_4__1__Impl rule__Choreography__Group_4__2 ;
    public final void rule__Choreography__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:921:1: ( rule__Choreography__Group_4__1__Impl rule__Choreography__Group_4__2 )
            // InternalChor4IntTxtDsl.g:922:2: rule__Choreography__Group_4__1__Impl rule__Choreography__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Choreography__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__1"


    // $ANTLR start "rule__Choreography__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:929:1: rule__Choreography__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Choreography__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:933:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:934:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:934:1: ( '{' )
            // InternalChor4IntTxtDsl.g:935:2: '{'
            {
             before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__1__Impl"


    // $ANTLR start "rule__Choreography__Group_4__2"
    // InternalChor4IntTxtDsl.g:944:1: rule__Choreography__Group_4__2 : rule__Choreography__Group_4__2__Impl rule__Choreography__Group_4__3 ;
    public final void rule__Choreography__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:948:1: ( rule__Choreography__Group_4__2__Impl rule__Choreography__Group_4__3 )
            // InternalChor4IntTxtDsl.g:949:2: rule__Choreography__Group_4__2__Impl rule__Choreography__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Choreography__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__2"


    // $ANTLR start "rule__Choreography__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:956:1: rule__Choreography__Group_4__2__Impl : ( ( rule__Choreography__RolesAssignment_4_2 ) ) ;
    public final void rule__Choreography__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:960:1: ( ( ( rule__Choreography__RolesAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:961:1: ( ( rule__Choreography__RolesAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:961:1: ( ( rule__Choreography__RolesAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:962:2: ( rule__Choreography__RolesAssignment_4_2 )
            {
             before(grammarAccess.getChoreographyAccess().getRolesAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:963:2: ( rule__Choreography__RolesAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:963:3: rule__Choreography__RolesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__RolesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getRolesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__2__Impl"


    // $ANTLR start "rule__Choreography__Group_4__3"
    // InternalChor4IntTxtDsl.g:971:1: rule__Choreography__Group_4__3 : rule__Choreography__Group_4__3__Impl rule__Choreography__Group_4__4 ;
    public final void rule__Choreography__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:975:1: ( rule__Choreography__Group_4__3__Impl rule__Choreography__Group_4__4 )
            // InternalChor4IntTxtDsl.g:976:2: rule__Choreography__Group_4__3__Impl rule__Choreography__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Choreography__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__3"


    // $ANTLR start "rule__Choreography__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:983:1: rule__Choreography__Group_4__3__Impl : ( ( rule__Choreography__Group_4_3__0 )* ) ;
    public final void rule__Choreography__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:987:1: ( ( ( rule__Choreography__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:988:1: ( ( rule__Choreography__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:988:1: ( ( rule__Choreography__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:989:2: ( rule__Choreography__Group_4_3__0 )*
            {
             before(grammarAccess.getChoreographyAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:990:2: ( rule__Choreography__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:990:3: rule__Choreography__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Choreography__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getChoreographyAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__3__Impl"


    // $ANTLR start "rule__Choreography__Group_4__4"
    // InternalChor4IntTxtDsl.g:998:1: rule__Choreography__Group_4__4 : rule__Choreography__Group_4__4__Impl ;
    public final void rule__Choreography__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1002:1: ( rule__Choreography__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:1003:2: rule__Choreography__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__4"


    // $ANTLR start "rule__Choreography__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:1009:1: rule__Choreography__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Choreography__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1013:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1014:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1014:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1015:2: '}'
            {
             before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__4__Impl"


    // $ANTLR start "rule__Choreography__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:1025:1: rule__Choreography__Group_4_3__0 : rule__Choreography__Group_4_3__0__Impl rule__Choreography__Group_4_3__1 ;
    public final void rule__Choreography__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1029:1: ( rule__Choreography__Group_4_3__0__Impl rule__Choreography__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:1030:2: rule__Choreography__Group_4_3__0__Impl rule__Choreography__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Choreography__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__0"


    // $ANTLR start "rule__Choreography__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:1037:1: rule__Choreography__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Choreography__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1041:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:1042:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:1042:1: ( ',' )
            // InternalChor4IntTxtDsl.g:1043:2: ','
            {
             before(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__0__Impl"


    // $ANTLR start "rule__Choreography__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:1052:1: rule__Choreography__Group_4_3__1 : rule__Choreography__Group_4_3__1__Impl ;
    public final void rule__Choreography__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1056:1: ( rule__Choreography__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:1057:2: rule__Choreography__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__1"


    // $ANTLR start "rule__Choreography__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:1063:1: rule__Choreography__Group_4_3__1__Impl : ( ( rule__Choreography__RolesAssignment_4_3_1 ) ) ;
    public final void rule__Choreography__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1067:1: ( ( ( rule__Choreography__RolesAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:1068:1: ( ( rule__Choreography__RolesAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1068:1: ( ( rule__Choreography__RolesAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:1069:2: ( rule__Choreography__RolesAssignment_4_3_1 )
            {
             before(grammarAccess.getChoreographyAccess().getRolesAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:1070:2: ( rule__Choreography__RolesAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:1070:3: rule__Choreography__RolesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__RolesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getRolesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalChor4IntTxtDsl.g:1079:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1083:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalChor4IntTxtDsl.g:1084:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:1091:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1095:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:1096:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:1096:1: ( () )
            // InternalChor4IntTxtDsl.g:1097:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalChor4IntTxtDsl.g:1098:2: ()
            // InternalChor4IntTxtDsl.g:1098:3: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalChor4IntTxtDsl.g:1106:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1110:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalChor4IntTxtDsl.g:1111:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:1118:1: rule__Role__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1122:1: ( ( 'Role' ) )
            // InternalChor4IntTxtDsl.g:1123:1: ( 'Role' )
            {
            // InternalChor4IntTxtDsl.g:1123:1: ( 'Role' )
            // InternalChor4IntTxtDsl.g:1124:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalChor4IntTxtDsl.g:1133:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1137:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalChor4IntTxtDsl.g:1138:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:1145:1: rule__Role__Group__2__Impl : ( ( rule__Role__NameAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1149:1: ( ( ( rule__Role__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:1150:1: ( ( rule__Role__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1150:1: ( ( rule__Role__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:1151:2: ( rule__Role__NameAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:1152:2: ( rule__Role__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:1152:3: rule__Role__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalChor4IntTxtDsl.g:1160:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1164:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalChor4IntTxtDsl.g:1165:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:1172:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1176:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:1177:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:1177:1: ( '{' )
            // InternalChor4IntTxtDsl.g:1178:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalChor4IntTxtDsl.g:1187:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1191:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalChor4IntTxtDsl.g:1192:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:1199:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1203:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:1204:1: ( ( rule__Role__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1204:1: ( ( rule__Role__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:1205:2: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:1206:2: ( rule__Role__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1206:3: rule__Role__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalChor4IntTxtDsl.g:1214:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1218:1: ( rule__Role__Group__5__Impl )
            // InternalChor4IntTxtDsl.g:1219:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:1225:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1229:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1230:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1230:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1231:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // InternalChor4IntTxtDsl.g:1241:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1245:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // InternalChor4IntTxtDsl.g:1246:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:1253:1: rule__Role__Group_4__0__Impl : ( 'actor' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1257:1: ( ( 'actor' ) )
            // InternalChor4IntTxtDsl.g:1258:1: ( 'actor' )
            {
            // InternalChor4IntTxtDsl.g:1258:1: ( 'actor' )
            // InternalChor4IntTxtDsl.g:1259:2: 'actor'
            {
             before(grammarAccess.getRoleAccess().getActorKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getActorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // InternalChor4IntTxtDsl.g:1268:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1272:1: ( rule__Role__Group_4__1__Impl )
            // InternalChor4IntTxtDsl.g:1273:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:1279:1: rule__Role__Group_4__1__Impl : ( ( rule__Role__ActorAssignment_4_1 ) ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1283:1: ( ( ( rule__Role__ActorAssignment_4_1 ) ) )
            // InternalChor4IntTxtDsl.g:1284:1: ( ( rule__Role__ActorAssignment_4_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1284:1: ( ( rule__Role__ActorAssignment_4_1 ) )
            // InternalChor4IntTxtDsl.g:1285:2: ( rule__Role__ActorAssignment_4_1 )
            {
             before(grammarAccess.getRoleAccess().getActorAssignment_4_1()); 
            // InternalChor4IntTxtDsl.g:1286:2: ( rule__Role__ActorAssignment_4_1 )
            // InternalChor4IntTxtDsl.g:1286:3: rule__Role__ActorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__ActorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getActorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__0"
    // InternalChor4IntTxtDsl.g:1295:1: rule__SequenceFlow__Group__0 : rule__SequenceFlow__Group__0__Impl rule__SequenceFlow__Group__1 ;
    public final void rule__SequenceFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1299:1: ( rule__SequenceFlow__Group__0__Impl rule__SequenceFlow__Group__1 )
            // InternalChor4IntTxtDsl.g:1300:2: rule__SequenceFlow__Group__0__Impl rule__SequenceFlow__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SequenceFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__0"


    // $ANTLR start "rule__SequenceFlow__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:1307:1: rule__SequenceFlow__Group__0__Impl : ( 'SequenceFlow' ) ;
    public final void rule__SequenceFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1311:1: ( ( 'SequenceFlow' ) )
            // InternalChor4IntTxtDsl.g:1312:1: ( 'SequenceFlow' )
            {
            // InternalChor4IntTxtDsl.g:1312:1: ( 'SequenceFlow' )
            // InternalChor4IntTxtDsl.g:1313:2: 'SequenceFlow'
            {
             before(grammarAccess.getSequenceFlowAccess().getSequenceFlowKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSequenceFlowAccess().getSequenceFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__0__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__1"
    // InternalChor4IntTxtDsl.g:1322:1: rule__SequenceFlow__Group__1 : rule__SequenceFlow__Group__1__Impl rule__SequenceFlow__Group__2 ;
    public final void rule__SequenceFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1326:1: ( rule__SequenceFlow__Group__1__Impl rule__SequenceFlow__Group__2 )
            // InternalChor4IntTxtDsl.g:1327:2: rule__SequenceFlow__Group__1__Impl rule__SequenceFlow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SequenceFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__1"


    // $ANTLR start "rule__SequenceFlow__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:1334:1: rule__SequenceFlow__Group__1__Impl : ( ( rule__SequenceFlow__NameAssignment_1 ) ) ;
    public final void rule__SequenceFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1338:1: ( ( ( rule__SequenceFlow__NameAssignment_1 ) ) )
            // InternalChor4IntTxtDsl.g:1339:1: ( ( rule__SequenceFlow__NameAssignment_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1339:1: ( ( rule__SequenceFlow__NameAssignment_1 ) )
            // InternalChor4IntTxtDsl.g:1340:2: ( rule__SequenceFlow__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceFlowAccess().getNameAssignment_1()); 
            // InternalChor4IntTxtDsl.g:1341:2: ( rule__SequenceFlow__NameAssignment_1 )
            // InternalChor4IntTxtDsl.g:1341:3: rule__SequenceFlow__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceFlow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceFlowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__1__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__2"
    // InternalChor4IntTxtDsl.g:1349:1: rule__SequenceFlow__Group__2 : rule__SequenceFlow__Group__2__Impl rule__SequenceFlow__Group__3 ;
    public final void rule__SequenceFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1353:1: ( rule__SequenceFlow__Group__2__Impl rule__SequenceFlow__Group__3 )
            // InternalChor4IntTxtDsl.g:1354:2: rule__SequenceFlow__Group__2__Impl rule__SequenceFlow__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SequenceFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__2"


    // $ANTLR start "rule__SequenceFlow__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:1361:1: rule__SequenceFlow__Group__2__Impl : ( '{' ) ;
    public final void rule__SequenceFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1365:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:1366:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:1366:1: ( '{' )
            // InternalChor4IntTxtDsl.g:1367:2: '{'
            {
             before(grammarAccess.getSequenceFlowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSequenceFlowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__2__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__3"
    // InternalChor4IntTxtDsl.g:1376:1: rule__SequenceFlow__Group__3 : rule__SequenceFlow__Group__3__Impl rule__SequenceFlow__Group__4 ;
    public final void rule__SequenceFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1380:1: ( rule__SequenceFlow__Group__3__Impl rule__SequenceFlow__Group__4 )
            // InternalChor4IntTxtDsl.g:1381:2: rule__SequenceFlow__Group__3__Impl rule__SequenceFlow__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SequenceFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__3"


    // $ANTLR start "rule__SequenceFlow__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:1388:1: rule__SequenceFlow__Group__3__Impl : ( 'target' ) ;
    public final void rule__SequenceFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1392:1: ( ( 'target' ) )
            // InternalChor4IntTxtDsl.g:1393:1: ( 'target' )
            {
            // InternalChor4IntTxtDsl.g:1393:1: ( 'target' )
            // InternalChor4IntTxtDsl.g:1394:2: 'target'
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSequenceFlowAccess().getTargetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__3__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__4"
    // InternalChor4IntTxtDsl.g:1403:1: rule__SequenceFlow__Group__4 : rule__SequenceFlow__Group__4__Impl rule__SequenceFlow__Group__5 ;
    public final void rule__SequenceFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1407:1: ( rule__SequenceFlow__Group__4__Impl rule__SequenceFlow__Group__5 )
            // InternalChor4IntTxtDsl.g:1408:2: rule__SequenceFlow__Group__4__Impl rule__SequenceFlow__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__SequenceFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__4"


    // $ANTLR start "rule__SequenceFlow__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:1415:1: rule__SequenceFlow__Group__4__Impl : ( ( rule__SequenceFlow__TargetAssignment_4 ) ) ;
    public final void rule__SequenceFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1419:1: ( ( ( rule__SequenceFlow__TargetAssignment_4 ) ) )
            // InternalChor4IntTxtDsl.g:1420:1: ( ( rule__SequenceFlow__TargetAssignment_4 ) )
            {
            // InternalChor4IntTxtDsl.g:1420:1: ( ( rule__SequenceFlow__TargetAssignment_4 ) )
            // InternalChor4IntTxtDsl.g:1421:2: ( rule__SequenceFlow__TargetAssignment_4 )
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetAssignment_4()); 
            // InternalChor4IntTxtDsl.g:1422:2: ( rule__SequenceFlow__TargetAssignment_4 )
            // InternalChor4IntTxtDsl.g:1422:3: rule__SequenceFlow__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SequenceFlow__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSequenceFlowAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__4__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__5"
    // InternalChor4IntTxtDsl.g:1430:1: rule__SequenceFlow__Group__5 : rule__SequenceFlow__Group__5__Impl rule__SequenceFlow__Group__6 ;
    public final void rule__SequenceFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1434:1: ( rule__SequenceFlow__Group__5__Impl rule__SequenceFlow__Group__6 )
            // InternalChor4IntTxtDsl.g:1435:2: rule__SequenceFlow__Group__5__Impl rule__SequenceFlow__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SequenceFlow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__5"


    // $ANTLR start "rule__SequenceFlow__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:1442:1: rule__SequenceFlow__Group__5__Impl : ( 'source' ) ;
    public final void rule__SequenceFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1446:1: ( ( 'source' ) )
            // InternalChor4IntTxtDsl.g:1447:1: ( 'source' )
            {
            // InternalChor4IntTxtDsl.g:1447:1: ( 'source' )
            // InternalChor4IntTxtDsl.g:1448:2: 'source'
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSequenceFlowAccess().getSourceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__5__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__6"
    // InternalChor4IntTxtDsl.g:1457:1: rule__SequenceFlow__Group__6 : rule__SequenceFlow__Group__6__Impl rule__SequenceFlow__Group__7 ;
    public final void rule__SequenceFlow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1461:1: ( rule__SequenceFlow__Group__6__Impl rule__SequenceFlow__Group__7 )
            // InternalChor4IntTxtDsl.g:1462:2: rule__SequenceFlow__Group__6__Impl rule__SequenceFlow__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__SequenceFlow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__6"


    // $ANTLR start "rule__SequenceFlow__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:1469:1: rule__SequenceFlow__Group__6__Impl : ( ( rule__SequenceFlow__SourceAssignment_6 ) ) ;
    public final void rule__SequenceFlow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1473:1: ( ( ( rule__SequenceFlow__SourceAssignment_6 ) ) )
            // InternalChor4IntTxtDsl.g:1474:1: ( ( rule__SequenceFlow__SourceAssignment_6 ) )
            {
            // InternalChor4IntTxtDsl.g:1474:1: ( ( rule__SequenceFlow__SourceAssignment_6 ) )
            // InternalChor4IntTxtDsl.g:1475:2: ( rule__SequenceFlow__SourceAssignment_6 )
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceAssignment_6()); 
            // InternalChor4IntTxtDsl.g:1476:2: ( rule__SequenceFlow__SourceAssignment_6 )
            // InternalChor4IntTxtDsl.g:1476:3: rule__SequenceFlow__SourceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SequenceFlow__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSequenceFlowAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__6__Impl"


    // $ANTLR start "rule__SequenceFlow__Group__7"
    // InternalChor4IntTxtDsl.g:1484:1: rule__SequenceFlow__Group__7 : rule__SequenceFlow__Group__7__Impl ;
    public final void rule__SequenceFlow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1488:1: ( rule__SequenceFlow__Group__7__Impl )
            // InternalChor4IntTxtDsl.g:1489:2: rule__SequenceFlow__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceFlow__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__7"


    // $ANTLR start "rule__SequenceFlow__Group__7__Impl"
    // InternalChor4IntTxtDsl.g:1495:1: rule__SequenceFlow__Group__7__Impl : ( '}' ) ;
    public final void rule__SequenceFlow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1499:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1500:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1500:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1501:2: '}'
            {
             before(grammarAccess.getSequenceFlowAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSequenceFlowAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__Group__7__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__0"
    // InternalChor4IntTxtDsl.g:1511:1: rule__ExclusiveGateway__Group__0 : rule__ExclusiveGateway__Group__0__Impl rule__ExclusiveGateway__Group__1 ;
    public final void rule__ExclusiveGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1515:1: ( rule__ExclusiveGateway__Group__0__Impl rule__ExclusiveGateway__Group__1 )
            // InternalChor4IntTxtDsl.g:1516:2: rule__ExclusiveGateway__Group__0__Impl rule__ExclusiveGateway__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ExclusiveGateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__0"


    // $ANTLR start "rule__ExclusiveGateway__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:1523:1: rule__ExclusiveGateway__Group__0__Impl : ( () ) ;
    public final void rule__ExclusiveGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1527:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:1528:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:1528:1: ( () )
            // InternalChor4IntTxtDsl.g:1529:2: ()
            {
             before(grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayAction_0()); 
            // InternalChor4IntTxtDsl.g:1530:2: ()
            // InternalChor4IntTxtDsl.g:1530:3: 
            {
            }

             after(grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__0__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__1"
    // InternalChor4IntTxtDsl.g:1538:1: rule__ExclusiveGateway__Group__1 : rule__ExclusiveGateway__Group__1__Impl rule__ExclusiveGateway__Group__2 ;
    public final void rule__ExclusiveGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1542:1: ( rule__ExclusiveGateway__Group__1__Impl rule__ExclusiveGateway__Group__2 )
            // InternalChor4IntTxtDsl.g:1543:2: rule__ExclusiveGateway__Group__1__Impl rule__ExclusiveGateway__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveGateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__1"


    // $ANTLR start "rule__ExclusiveGateway__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:1550:1: rule__ExclusiveGateway__Group__1__Impl : ( 'ExclusiveGateway' ) ;
    public final void rule__ExclusiveGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1554:1: ( ( 'ExclusiveGateway' ) )
            // InternalChor4IntTxtDsl.g:1555:1: ( 'ExclusiveGateway' )
            {
            // InternalChor4IntTxtDsl.g:1555:1: ( 'ExclusiveGateway' )
            // InternalChor4IntTxtDsl.g:1556:2: 'ExclusiveGateway'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__1__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__2"
    // InternalChor4IntTxtDsl.g:1565:1: rule__ExclusiveGateway__Group__2 : rule__ExclusiveGateway__Group__2__Impl rule__ExclusiveGateway__Group__3 ;
    public final void rule__ExclusiveGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1569:1: ( rule__ExclusiveGateway__Group__2__Impl rule__ExclusiveGateway__Group__3 )
            // InternalChor4IntTxtDsl.g:1570:2: rule__ExclusiveGateway__Group__2__Impl rule__ExclusiveGateway__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ExclusiveGateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__2"


    // $ANTLR start "rule__ExclusiveGateway__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:1577:1: rule__ExclusiveGateway__Group__2__Impl : ( ( rule__ExclusiveGateway__NameAssignment_2 ) ) ;
    public final void rule__ExclusiveGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1581:1: ( ( ( rule__ExclusiveGateway__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:1582:1: ( ( rule__ExclusiveGateway__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1582:1: ( ( rule__ExclusiveGateway__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:1583:2: ( rule__ExclusiveGateway__NameAssignment_2 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:1584:2: ( rule__ExclusiveGateway__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:1584:3: rule__ExclusiveGateway__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveGatewayAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__2__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__3"
    // InternalChor4IntTxtDsl.g:1592:1: rule__ExclusiveGateway__Group__3 : rule__ExclusiveGateway__Group__3__Impl rule__ExclusiveGateway__Group__4 ;
    public final void rule__ExclusiveGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1596:1: ( rule__ExclusiveGateway__Group__3__Impl rule__ExclusiveGateway__Group__4 )
            // InternalChor4IntTxtDsl.g:1597:2: rule__ExclusiveGateway__Group__3__Impl rule__ExclusiveGateway__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ExclusiveGateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__3"


    // $ANTLR start "rule__ExclusiveGateway__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:1604:1: rule__ExclusiveGateway__Group__3__Impl : ( '{' ) ;
    public final void rule__ExclusiveGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1608:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:1609:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:1609:1: ( '{' )
            // InternalChor4IntTxtDsl.g:1610:2: '{'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__3__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__4"
    // InternalChor4IntTxtDsl.g:1619:1: rule__ExclusiveGateway__Group__4 : rule__ExclusiveGateway__Group__4__Impl rule__ExclusiveGateway__Group__5 ;
    public final void rule__ExclusiveGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1623:1: ( rule__ExclusiveGateway__Group__4__Impl rule__ExclusiveGateway__Group__5 )
            // InternalChor4IntTxtDsl.g:1624:2: rule__ExclusiveGateway__Group__4__Impl rule__ExclusiveGateway__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ExclusiveGateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__4"


    // $ANTLR start "rule__ExclusiveGateway__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:1631:1: rule__ExclusiveGateway__Group__4__Impl : ( ( rule__ExclusiveGateway__Group_4__0 )? ) ;
    public final void rule__ExclusiveGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1635:1: ( ( ( rule__ExclusiveGateway__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:1636:1: ( ( rule__ExclusiveGateway__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1636:1: ( ( rule__ExclusiveGateway__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:1637:2: ( rule__ExclusiveGateway__Group_4__0 )?
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:1638:2: ( rule__ExclusiveGateway__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1638:3: rule__ExclusiveGateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExclusiveGateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExclusiveGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__4__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__5"
    // InternalChor4IntTxtDsl.g:1646:1: rule__ExclusiveGateway__Group__5 : rule__ExclusiveGateway__Group__5__Impl rule__ExclusiveGateway__Group__6 ;
    public final void rule__ExclusiveGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1650:1: ( rule__ExclusiveGateway__Group__5__Impl rule__ExclusiveGateway__Group__6 )
            // InternalChor4IntTxtDsl.g:1651:2: rule__ExclusiveGateway__Group__5__Impl rule__ExclusiveGateway__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ExclusiveGateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__5"


    // $ANTLR start "rule__ExclusiveGateway__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:1658:1: rule__ExclusiveGateway__Group__5__Impl : ( ( rule__ExclusiveGateway__Group_5__0 )? ) ;
    public final void rule__ExclusiveGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1662:1: ( ( ( rule__ExclusiveGateway__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:1663:1: ( ( rule__ExclusiveGateway__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1663:1: ( ( rule__ExclusiveGateway__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:1664:2: ( rule__ExclusiveGateway__Group_5__0 )?
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:1665:2: ( rule__ExclusiveGateway__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1665:3: rule__ExclusiveGateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExclusiveGateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExclusiveGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__5__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group__6"
    // InternalChor4IntTxtDsl.g:1673:1: rule__ExclusiveGateway__Group__6 : rule__ExclusiveGateway__Group__6__Impl ;
    public final void rule__ExclusiveGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1677:1: ( rule__ExclusiveGateway__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:1678:2: rule__ExclusiveGateway__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__6"


    // $ANTLR start "rule__ExclusiveGateway__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:1684:1: rule__ExclusiveGateway__Group__6__Impl : ( '}' ) ;
    public final void rule__ExclusiveGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1688:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1689:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1689:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1690:2: '}'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group__6__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__0"
    // InternalChor4IntTxtDsl.g:1700:1: rule__ExclusiveGateway__Group_4__0 : rule__ExclusiveGateway__Group_4__0__Impl rule__ExclusiveGateway__Group_4__1 ;
    public final void rule__ExclusiveGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1704:1: ( rule__ExclusiveGateway__Group_4__0__Impl rule__ExclusiveGateway__Group_4__1 )
            // InternalChor4IntTxtDsl.g:1705:2: rule__ExclusiveGateway__Group_4__0__Impl rule__ExclusiveGateway__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__ExclusiveGateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__0"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:1712:1: rule__ExclusiveGateway__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__ExclusiveGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1716:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:1717:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:1717:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:1718:2: 'incomings'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__0__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__1"
    // InternalChor4IntTxtDsl.g:1727:1: rule__ExclusiveGateway__Group_4__1 : rule__ExclusiveGateway__Group_4__1__Impl rule__ExclusiveGateway__Group_4__2 ;
    public final void rule__ExclusiveGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1731:1: ( rule__ExclusiveGateway__Group_4__1__Impl rule__ExclusiveGateway__Group_4__2 )
            // InternalChor4IntTxtDsl.g:1732:2: rule__ExclusiveGateway__Group_4__1__Impl rule__ExclusiveGateway__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveGateway__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__1"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:1739:1: rule__ExclusiveGateway__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ExclusiveGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1743:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:1744:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:1744:1: ( '(' )
            // InternalChor4IntTxtDsl.g:1745:2: '('
            {
             before(grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__1__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__2"
    // InternalChor4IntTxtDsl.g:1754:1: rule__ExclusiveGateway__Group_4__2 : rule__ExclusiveGateway__Group_4__2__Impl rule__ExclusiveGateway__Group_4__3 ;
    public final void rule__ExclusiveGateway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1758:1: ( rule__ExclusiveGateway__Group_4__2__Impl rule__ExclusiveGateway__Group_4__3 )
            // InternalChor4IntTxtDsl.g:1759:2: rule__ExclusiveGateway__Group_4__2__Impl rule__ExclusiveGateway__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__ExclusiveGateway__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__2"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:1766:1: rule__ExclusiveGateway__Group_4__2__Impl : ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) ) ;
    public final void rule__ExclusiveGateway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1770:1: ( ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:1771:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1771:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:1772:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:1773:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:1773:3: rule__ExclusiveGateway__IncomingsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__IncomingsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__2__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__3"
    // InternalChor4IntTxtDsl.g:1781:1: rule__ExclusiveGateway__Group_4__3 : rule__ExclusiveGateway__Group_4__3__Impl rule__ExclusiveGateway__Group_4__4 ;
    public final void rule__ExclusiveGateway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1785:1: ( rule__ExclusiveGateway__Group_4__3__Impl rule__ExclusiveGateway__Group_4__4 )
            // InternalChor4IntTxtDsl.g:1786:2: rule__ExclusiveGateway__Group_4__3__Impl rule__ExclusiveGateway__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__ExclusiveGateway__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__3"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:1793:1: rule__ExclusiveGateway__Group_4__3__Impl : ( ( rule__ExclusiveGateway__Group_4_3__0 )* ) ;
    public final void rule__ExclusiveGateway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1797:1: ( ( ( rule__ExclusiveGateway__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:1798:1: ( ( rule__ExclusiveGateway__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:1798:1: ( ( rule__ExclusiveGateway__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:1799:2: ( rule__ExclusiveGateway__Group_4_3__0 )*
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:1800:2: ( rule__ExclusiveGateway__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:1800:3: rule__ExclusiveGateway__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExclusiveGateway__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExclusiveGatewayAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__3__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__4"
    // InternalChor4IntTxtDsl.g:1808:1: rule__ExclusiveGateway__Group_4__4 : rule__ExclusiveGateway__Group_4__4__Impl ;
    public final void rule__ExclusiveGateway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1812:1: ( rule__ExclusiveGateway__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:1813:2: rule__ExclusiveGateway__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__4"


    // $ANTLR start "rule__ExclusiveGateway__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:1819:1: rule__ExclusiveGateway__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ExclusiveGateway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1823:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:1824:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:1824:1: ( ')' )
            // InternalChor4IntTxtDsl.g:1825:2: ')'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4__4__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:1835:1: rule__ExclusiveGateway__Group_4_3__0 : rule__ExclusiveGateway__Group_4_3__0__Impl rule__ExclusiveGateway__Group_4_3__1 ;
    public final void rule__ExclusiveGateway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1839:1: ( rule__ExclusiveGateway__Group_4_3__0__Impl rule__ExclusiveGateway__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:1840:2: rule__ExclusiveGateway__Group_4_3__0__Impl rule__ExclusiveGateway__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveGateway__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4_3__0"


    // $ANTLR start "rule__ExclusiveGateway__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:1847:1: rule__ExclusiveGateway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ExclusiveGateway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1851:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:1852:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:1852:1: ( ',' )
            // InternalChor4IntTxtDsl.g:1853:2: ','
            {
             before(grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4_3__0__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:1862:1: rule__ExclusiveGateway__Group_4_3__1 : rule__ExclusiveGateway__Group_4_3__1__Impl ;
    public final void rule__ExclusiveGateway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1866:1: ( rule__ExclusiveGateway__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:1867:2: rule__ExclusiveGateway__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4_3__1"


    // $ANTLR start "rule__ExclusiveGateway__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:1873:1: rule__ExclusiveGateway__Group_4_3__1__Impl : ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__ExclusiveGateway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1877:1: ( ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:1878:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1878:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:1879:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:1880:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:1880:3: rule__ExclusiveGateway__IncomingsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__IncomingsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_4_3__1__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__0"
    // InternalChor4IntTxtDsl.g:1889:1: rule__ExclusiveGateway__Group_5__0 : rule__ExclusiveGateway__Group_5__0__Impl rule__ExclusiveGateway__Group_5__1 ;
    public final void rule__ExclusiveGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1893:1: ( rule__ExclusiveGateway__Group_5__0__Impl rule__ExclusiveGateway__Group_5__1 )
            // InternalChor4IntTxtDsl.g:1894:2: rule__ExclusiveGateway__Group_5__0__Impl rule__ExclusiveGateway__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__ExclusiveGateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__0"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__0__Impl"
    // InternalChor4IntTxtDsl.g:1901:1: rule__ExclusiveGateway__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__ExclusiveGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1905:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:1906:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:1906:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:1907:2: 'outgoings'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__0__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__1"
    // InternalChor4IntTxtDsl.g:1916:1: rule__ExclusiveGateway__Group_5__1 : rule__ExclusiveGateway__Group_5__1__Impl rule__ExclusiveGateway__Group_5__2 ;
    public final void rule__ExclusiveGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1920:1: ( rule__ExclusiveGateway__Group_5__1__Impl rule__ExclusiveGateway__Group_5__2 )
            // InternalChor4IntTxtDsl.g:1921:2: rule__ExclusiveGateway__Group_5__1__Impl rule__ExclusiveGateway__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveGateway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__1"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__1__Impl"
    // InternalChor4IntTxtDsl.g:1928:1: rule__ExclusiveGateway__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ExclusiveGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1932:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:1933:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:1933:1: ( '(' )
            // InternalChor4IntTxtDsl.g:1934:2: '('
            {
             before(grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__1__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__2"
    // InternalChor4IntTxtDsl.g:1943:1: rule__ExclusiveGateway__Group_5__2 : rule__ExclusiveGateway__Group_5__2__Impl rule__ExclusiveGateway__Group_5__3 ;
    public final void rule__ExclusiveGateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1947:1: ( rule__ExclusiveGateway__Group_5__2__Impl rule__ExclusiveGateway__Group_5__3 )
            // InternalChor4IntTxtDsl.g:1948:2: rule__ExclusiveGateway__Group_5__2__Impl rule__ExclusiveGateway__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__ExclusiveGateway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__2"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__2__Impl"
    // InternalChor4IntTxtDsl.g:1955:1: rule__ExclusiveGateway__Group_5__2__Impl : ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__ExclusiveGateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1959:1: ( ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:1960:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1960:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:1961:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:1962:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:1962:3: rule__ExclusiveGateway__OutgoingsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__OutgoingsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__2__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__3"
    // InternalChor4IntTxtDsl.g:1970:1: rule__ExclusiveGateway__Group_5__3 : rule__ExclusiveGateway__Group_5__3__Impl rule__ExclusiveGateway__Group_5__4 ;
    public final void rule__ExclusiveGateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1974:1: ( rule__ExclusiveGateway__Group_5__3__Impl rule__ExclusiveGateway__Group_5__4 )
            // InternalChor4IntTxtDsl.g:1975:2: rule__ExclusiveGateway__Group_5__3__Impl rule__ExclusiveGateway__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__ExclusiveGateway__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__3"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__3__Impl"
    // InternalChor4IntTxtDsl.g:1982:1: rule__ExclusiveGateway__Group_5__3__Impl : ( ( rule__ExclusiveGateway__Group_5_3__0 )* ) ;
    public final void rule__ExclusiveGateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1986:1: ( ( ( rule__ExclusiveGateway__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:1987:1: ( ( rule__ExclusiveGateway__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:1987:1: ( ( rule__ExclusiveGateway__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:1988:2: ( rule__ExclusiveGateway__Group_5_3__0 )*
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:1989:2: ( rule__ExclusiveGateway__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:1989:3: rule__ExclusiveGateway__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExclusiveGateway__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExclusiveGatewayAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__3__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__4"
    // InternalChor4IntTxtDsl.g:1997:1: rule__ExclusiveGateway__Group_5__4 : rule__ExclusiveGateway__Group_5__4__Impl ;
    public final void rule__ExclusiveGateway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2001:1: ( rule__ExclusiveGateway__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:2002:2: rule__ExclusiveGateway__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__4"


    // $ANTLR start "rule__ExclusiveGateway__Group_5__4__Impl"
    // InternalChor4IntTxtDsl.g:2008:1: rule__ExclusiveGateway__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ExclusiveGateway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2012:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2013:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2013:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2014:2: ')'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5__4__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5_3__0"
    // InternalChor4IntTxtDsl.g:2024:1: rule__ExclusiveGateway__Group_5_3__0 : rule__ExclusiveGateway__Group_5_3__0__Impl rule__ExclusiveGateway__Group_5_3__1 ;
    public final void rule__ExclusiveGateway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2028:1: ( rule__ExclusiveGateway__Group_5_3__0__Impl rule__ExclusiveGateway__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:2029:2: rule__ExclusiveGateway__Group_5_3__0__Impl rule__ExclusiveGateway__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveGateway__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5_3__0"


    // $ANTLR start "rule__ExclusiveGateway__Group_5_3__0__Impl"
    // InternalChor4IntTxtDsl.g:2036:1: rule__ExclusiveGateway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ExclusiveGateway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2040:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2041:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2041:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2042:2: ','
            {
             before(grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5_3__0__Impl"


    // $ANTLR start "rule__ExclusiveGateway__Group_5_3__1"
    // InternalChor4IntTxtDsl.g:2051:1: rule__ExclusiveGateway__Group_5_3__1 : rule__ExclusiveGateway__Group_5_3__1__Impl ;
    public final void rule__ExclusiveGateway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2055:1: ( rule__ExclusiveGateway__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:2056:2: rule__ExclusiveGateway__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5_3__1"


    // $ANTLR start "rule__ExclusiveGateway__Group_5_3__1__Impl"
    // InternalChor4IntTxtDsl.g:2062:1: rule__ExclusiveGateway__Group_5_3__1__Impl : ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__ExclusiveGateway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2066:1: ( ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:2067:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:2067:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:2068:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:2069:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:2069:3: rule__ExclusiveGateway__OutgoingsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveGateway__OutgoingsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__Group_5_3__1__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__0"
    // InternalChor4IntTxtDsl.g:2078:1: rule__ParallelGateway__Group__0 : rule__ParallelGateway__Group__0__Impl rule__ParallelGateway__Group__1 ;
    public final void rule__ParallelGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2082:1: ( rule__ParallelGateway__Group__0__Impl rule__ParallelGateway__Group__1 )
            // InternalChor4IntTxtDsl.g:2083:2: rule__ParallelGateway__Group__0__Impl rule__ParallelGateway__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ParallelGateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__0"


    // $ANTLR start "rule__ParallelGateway__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:2090:1: rule__ParallelGateway__Group__0__Impl : ( () ) ;
    public final void rule__ParallelGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2094:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:2095:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:2095:1: ( () )
            // InternalChor4IntTxtDsl.g:2096:2: ()
            {
             before(grammarAccess.getParallelGatewayAccess().getParallelGatewayAction_0()); 
            // InternalChor4IntTxtDsl.g:2097:2: ()
            // InternalChor4IntTxtDsl.g:2097:3: 
            {
            }

             after(grammarAccess.getParallelGatewayAccess().getParallelGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__0__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__1"
    // InternalChor4IntTxtDsl.g:2105:1: rule__ParallelGateway__Group__1 : rule__ParallelGateway__Group__1__Impl rule__ParallelGateway__Group__2 ;
    public final void rule__ParallelGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2109:1: ( rule__ParallelGateway__Group__1__Impl rule__ParallelGateway__Group__2 )
            // InternalChor4IntTxtDsl.g:2110:2: rule__ParallelGateway__Group__1__Impl rule__ParallelGateway__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ParallelGateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__1"


    // $ANTLR start "rule__ParallelGateway__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:2117:1: rule__ParallelGateway__Group__1__Impl : ( 'ParallelGateway' ) ;
    public final void rule__ParallelGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2121:1: ( ( 'ParallelGateway' ) )
            // InternalChor4IntTxtDsl.g:2122:1: ( 'ParallelGateway' )
            {
            // InternalChor4IntTxtDsl.g:2122:1: ( 'ParallelGateway' )
            // InternalChor4IntTxtDsl.g:2123:2: 'ParallelGateway'
            {
             before(grammarAccess.getParallelGatewayAccess().getParallelGatewayKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getParallelGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__1__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__2"
    // InternalChor4IntTxtDsl.g:2132:1: rule__ParallelGateway__Group__2 : rule__ParallelGateway__Group__2__Impl rule__ParallelGateway__Group__3 ;
    public final void rule__ParallelGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2136:1: ( rule__ParallelGateway__Group__2__Impl rule__ParallelGateway__Group__3 )
            // InternalChor4IntTxtDsl.g:2137:2: rule__ParallelGateway__Group__2__Impl rule__ParallelGateway__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ParallelGateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__2"


    // $ANTLR start "rule__ParallelGateway__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:2144:1: rule__ParallelGateway__Group__2__Impl : ( ( rule__ParallelGateway__NameAssignment_2 ) ) ;
    public final void rule__ParallelGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2148:1: ( ( ( rule__ParallelGateway__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:2149:1: ( ( rule__ParallelGateway__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2149:1: ( ( rule__ParallelGateway__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:2150:2: ( rule__ParallelGateway__NameAssignment_2 )
            {
             before(grammarAccess.getParallelGatewayAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:2151:2: ( rule__ParallelGateway__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:2151:3: rule__ParallelGateway__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelGatewayAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__2__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__3"
    // InternalChor4IntTxtDsl.g:2159:1: rule__ParallelGateway__Group__3 : rule__ParallelGateway__Group__3__Impl rule__ParallelGateway__Group__4 ;
    public final void rule__ParallelGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2163:1: ( rule__ParallelGateway__Group__3__Impl rule__ParallelGateway__Group__4 )
            // InternalChor4IntTxtDsl.g:2164:2: rule__ParallelGateway__Group__3__Impl rule__ParallelGateway__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ParallelGateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__3"


    // $ANTLR start "rule__ParallelGateway__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:2171:1: rule__ParallelGateway__Group__3__Impl : ( '{' ) ;
    public final void rule__ParallelGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2175:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:2176:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:2176:1: ( '{' )
            // InternalChor4IntTxtDsl.g:2177:2: '{'
            {
             before(grammarAccess.getParallelGatewayAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__3__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__4"
    // InternalChor4IntTxtDsl.g:2186:1: rule__ParallelGateway__Group__4 : rule__ParallelGateway__Group__4__Impl rule__ParallelGateway__Group__5 ;
    public final void rule__ParallelGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2190:1: ( rule__ParallelGateway__Group__4__Impl rule__ParallelGateway__Group__5 )
            // InternalChor4IntTxtDsl.g:2191:2: rule__ParallelGateway__Group__4__Impl rule__ParallelGateway__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ParallelGateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__4"


    // $ANTLR start "rule__ParallelGateway__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:2198:1: rule__ParallelGateway__Group__4__Impl : ( ( rule__ParallelGateway__Group_4__0 )? ) ;
    public final void rule__ParallelGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2202:1: ( ( ( rule__ParallelGateway__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:2203:1: ( ( rule__ParallelGateway__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2203:1: ( ( rule__ParallelGateway__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:2204:2: ( rule__ParallelGateway__Group_4__0 )?
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:2205:2: ( rule__ParallelGateway__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2205:3: rule__ParallelGateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParallelGateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParallelGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__4__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__5"
    // InternalChor4IntTxtDsl.g:2213:1: rule__ParallelGateway__Group__5 : rule__ParallelGateway__Group__5__Impl rule__ParallelGateway__Group__6 ;
    public final void rule__ParallelGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2217:1: ( rule__ParallelGateway__Group__5__Impl rule__ParallelGateway__Group__6 )
            // InternalChor4IntTxtDsl.g:2218:2: rule__ParallelGateway__Group__5__Impl rule__ParallelGateway__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ParallelGateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__5"


    // $ANTLR start "rule__ParallelGateway__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:2225:1: rule__ParallelGateway__Group__5__Impl : ( ( rule__ParallelGateway__Group_5__0 )? ) ;
    public final void rule__ParallelGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2229:1: ( ( ( rule__ParallelGateway__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:2230:1: ( ( rule__ParallelGateway__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2230:1: ( ( rule__ParallelGateway__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:2231:2: ( rule__ParallelGateway__Group_5__0 )?
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:2232:2: ( rule__ParallelGateway__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2232:3: rule__ParallelGateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParallelGateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParallelGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__5__Impl"


    // $ANTLR start "rule__ParallelGateway__Group__6"
    // InternalChor4IntTxtDsl.g:2240:1: rule__ParallelGateway__Group__6 : rule__ParallelGateway__Group__6__Impl ;
    public final void rule__ParallelGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2244:1: ( rule__ParallelGateway__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:2245:2: rule__ParallelGateway__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__6"


    // $ANTLR start "rule__ParallelGateway__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:2251:1: rule__ParallelGateway__Group__6__Impl : ( '}' ) ;
    public final void rule__ParallelGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2255:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:2256:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:2256:1: ( '}' )
            // InternalChor4IntTxtDsl.g:2257:2: '}'
            {
             before(grammarAccess.getParallelGatewayAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group__6__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4__0"
    // InternalChor4IntTxtDsl.g:2267:1: rule__ParallelGateway__Group_4__0 : rule__ParallelGateway__Group_4__0__Impl rule__ParallelGateway__Group_4__1 ;
    public final void rule__ParallelGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2271:1: ( rule__ParallelGateway__Group_4__0__Impl rule__ParallelGateway__Group_4__1 )
            // InternalChor4IntTxtDsl.g:2272:2: rule__ParallelGateway__Group_4__0__Impl rule__ParallelGateway__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__ParallelGateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__0"


    // $ANTLR start "rule__ParallelGateway__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:2279:1: rule__ParallelGateway__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__ParallelGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2283:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:2284:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:2284:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:2285:2: 'incomings'
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getIncomingsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__0__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4__1"
    // InternalChor4IntTxtDsl.g:2294:1: rule__ParallelGateway__Group_4__1 : rule__ParallelGateway__Group_4__1__Impl rule__ParallelGateway__Group_4__2 ;
    public final void rule__ParallelGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2298:1: ( rule__ParallelGateway__Group_4__1__Impl rule__ParallelGateway__Group_4__2 )
            // InternalChor4IntTxtDsl.g:2299:2: rule__ParallelGateway__Group_4__1__Impl rule__ParallelGateway__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__ParallelGateway__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__1"


    // $ANTLR start "rule__ParallelGateway__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:2306:1: rule__ParallelGateway__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ParallelGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2310:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2311:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2311:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2312:2: '('
            {
             before(grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__1__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4__2"
    // InternalChor4IntTxtDsl.g:2321:1: rule__ParallelGateway__Group_4__2 : rule__ParallelGateway__Group_4__2__Impl rule__ParallelGateway__Group_4__3 ;
    public final void rule__ParallelGateway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2325:1: ( rule__ParallelGateway__Group_4__2__Impl rule__ParallelGateway__Group_4__3 )
            // InternalChor4IntTxtDsl.g:2326:2: rule__ParallelGateway__Group_4__2__Impl rule__ParallelGateway__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__ParallelGateway__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__2"


    // $ANTLR start "rule__ParallelGateway__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:2333:1: rule__ParallelGateway__Group_4__2__Impl : ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) ) ;
    public final void rule__ParallelGateway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2337:1: ( ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:2338:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2338:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:2339:2: ( rule__ParallelGateway__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:2340:2: ( rule__ParallelGateway__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:2340:3: rule__ParallelGateway__IncomingsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__IncomingsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelGatewayAccess().getIncomingsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__2__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4__3"
    // InternalChor4IntTxtDsl.g:2348:1: rule__ParallelGateway__Group_4__3 : rule__ParallelGateway__Group_4__3__Impl rule__ParallelGateway__Group_4__4 ;
    public final void rule__ParallelGateway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2352:1: ( rule__ParallelGateway__Group_4__3__Impl rule__ParallelGateway__Group_4__4 )
            // InternalChor4IntTxtDsl.g:2353:2: rule__ParallelGateway__Group_4__3__Impl rule__ParallelGateway__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__ParallelGateway__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__3"


    // $ANTLR start "rule__ParallelGateway__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:2360:1: rule__ParallelGateway__Group_4__3__Impl : ( ( rule__ParallelGateway__Group_4_3__0 )* ) ;
    public final void rule__ParallelGateway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2364:1: ( ( ( rule__ParallelGateway__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:2365:1: ( ( rule__ParallelGateway__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:2365:1: ( ( rule__ParallelGateway__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:2366:2: ( rule__ParallelGateway__Group_4_3__0 )*
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:2367:2: ( rule__ParallelGateway__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:2367:3: rule__ParallelGateway__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ParallelGateway__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getParallelGatewayAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__3__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4__4"
    // InternalChor4IntTxtDsl.g:2375:1: rule__ParallelGateway__Group_4__4 : rule__ParallelGateway__Group_4__4__Impl ;
    public final void rule__ParallelGateway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2379:1: ( rule__ParallelGateway__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:2380:2: rule__ParallelGateway__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__4"


    // $ANTLR start "rule__ParallelGateway__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:2386:1: rule__ParallelGateway__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ParallelGateway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2390:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2391:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2391:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2392:2: ')'
            {
             before(grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4__4__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:2402:1: rule__ParallelGateway__Group_4_3__0 : rule__ParallelGateway__Group_4_3__0__Impl rule__ParallelGateway__Group_4_3__1 ;
    public final void rule__ParallelGateway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2406:1: ( rule__ParallelGateway__Group_4_3__0__Impl rule__ParallelGateway__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:2407:2: rule__ParallelGateway__Group_4_3__0__Impl rule__ParallelGateway__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ParallelGateway__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4_3__0"


    // $ANTLR start "rule__ParallelGateway__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:2414:1: rule__ParallelGateway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ParallelGateway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2418:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2419:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2419:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2420:2: ','
            {
             before(grammarAccess.getParallelGatewayAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4_3__0__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:2429:1: rule__ParallelGateway__Group_4_3__1 : rule__ParallelGateway__Group_4_3__1__Impl ;
    public final void rule__ParallelGateway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2433:1: ( rule__ParallelGateway__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:2434:2: rule__ParallelGateway__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4_3__1"


    // $ANTLR start "rule__ParallelGateway__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:2440:1: rule__ParallelGateway__Group_4_3__1__Impl : ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__ParallelGateway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2444:1: ( ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:2445:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:2445:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:2446:2: ( rule__ParallelGateway__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:2447:2: ( rule__ParallelGateway__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:2447:3: rule__ParallelGateway__IncomingsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__IncomingsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelGatewayAccess().getIncomingsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_4_3__1__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5__0"
    // InternalChor4IntTxtDsl.g:2456:1: rule__ParallelGateway__Group_5__0 : rule__ParallelGateway__Group_5__0__Impl rule__ParallelGateway__Group_5__1 ;
    public final void rule__ParallelGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2460:1: ( rule__ParallelGateway__Group_5__0__Impl rule__ParallelGateway__Group_5__1 )
            // InternalChor4IntTxtDsl.g:2461:2: rule__ParallelGateway__Group_5__0__Impl rule__ParallelGateway__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__ParallelGateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__0"


    // $ANTLR start "rule__ParallelGateway__Group_5__0__Impl"
    // InternalChor4IntTxtDsl.g:2468:1: rule__ParallelGateway__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__ParallelGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2472:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:2473:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:2473:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:2474:2: 'outgoings'
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getOutgoingsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__0__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5__1"
    // InternalChor4IntTxtDsl.g:2483:1: rule__ParallelGateway__Group_5__1 : rule__ParallelGateway__Group_5__1__Impl rule__ParallelGateway__Group_5__2 ;
    public final void rule__ParallelGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2487:1: ( rule__ParallelGateway__Group_5__1__Impl rule__ParallelGateway__Group_5__2 )
            // InternalChor4IntTxtDsl.g:2488:2: rule__ParallelGateway__Group_5__1__Impl rule__ParallelGateway__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__ParallelGateway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__1"


    // $ANTLR start "rule__ParallelGateway__Group_5__1__Impl"
    // InternalChor4IntTxtDsl.g:2495:1: rule__ParallelGateway__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ParallelGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2499:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2500:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2500:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2501:2: '('
            {
             before(grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__1__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5__2"
    // InternalChor4IntTxtDsl.g:2510:1: rule__ParallelGateway__Group_5__2 : rule__ParallelGateway__Group_5__2__Impl rule__ParallelGateway__Group_5__3 ;
    public final void rule__ParallelGateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2514:1: ( rule__ParallelGateway__Group_5__2__Impl rule__ParallelGateway__Group_5__3 )
            // InternalChor4IntTxtDsl.g:2515:2: rule__ParallelGateway__Group_5__2__Impl rule__ParallelGateway__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__ParallelGateway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__2"


    // $ANTLR start "rule__ParallelGateway__Group_5__2__Impl"
    // InternalChor4IntTxtDsl.g:2522:1: rule__ParallelGateway__Group_5__2__Impl : ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__ParallelGateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2526:1: ( ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:2527:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2527:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:2528:2: ( rule__ParallelGateway__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:2529:2: ( rule__ParallelGateway__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:2529:3: rule__ParallelGateway__OutgoingsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__OutgoingsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelGatewayAccess().getOutgoingsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__2__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5__3"
    // InternalChor4IntTxtDsl.g:2537:1: rule__ParallelGateway__Group_5__3 : rule__ParallelGateway__Group_5__3__Impl rule__ParallelGateway__Group_5__4 ;
    public final void rule__ParallelGateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2541:1: ( rule__ParallelGateway__Group_5__3__Impl rule__ParallelGateway__Group_5__4 )
            // InternalChor4IntTxtDsl.g:2542:2: rule__ParallelGateway__Group_5__3__Impl rule__ParallelGateway__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__ParallelGateway__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__3"


    // $ANTLR start "rule__ParallelGateway__Group_5__3__Impl"
    // InternalChor4IntTxtDsl.g:2549:1: rule__ParallelGateway__Group_5__3__Impl : ( ( rule__ParallelGateway__Group_5_3__0 )* ) ;
    public final void rule__ParallelGateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2553:1: ( ( ( rule__ParallelGateway__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:2554:1: ( ( rule__ParallelGateway__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:2554:1: ( ( rule__ParallelGateway__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:2555:2: ( rule__ParallelGateway__Group_5_3__0 )*
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:2556:2: ( rule__ParallelGateway__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:2556:3: rule__ParallelGateway__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ParallelGateway__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getParallelGatewayAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__3__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5__4"
    // InternalChor4IntTxtDsl.g:2564:1: rule__ParallelGateway__Group_5__4 : rule__ParallelGateway__Group_5__4__Impl ;
    public final void rule__ParallelGateway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2568:1: ( rule__ParallelGateway__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:2569:2: rule__ParallelGateway__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__4"


    // $ANTLR start "rule__ParallelGateway__Group_5__4__Impl"
    // InternalChor4IntTxtDsl.g:2575:1: rule__ParallelGateway__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ParallelGateway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2579:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2580:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2580:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2581:2: ')'
            {
             before(grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5__4__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5_3__0"
    // InternalChor4IntTxtDsl.g:2591:1: rule__ParallelGateway__Group_5_3__0 : rule__ParallelGateway__Group_5_3__0__Impl rule__ParallelGateway__Group_5_3__1 ;
    public final void rule__ParallelGateway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2595:1: ( rule__ParallelGateway__Group_5_3__0__Impl rule__ParallelGateway__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:2596:2: rule__ParallelGateway__Group_5_3__0__Impl rule__ParallelGateway__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ParallelGateway__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5_3__0"


    // $ANTLR start "rule__ParallelGateway__Group_5_3__0__Impl"
    // InternalChor4IntTxtDsl.g:2603:1: rule__ParallelGateway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ParallelGateway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2607:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2608:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2608:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2609:2: ','
            {
             before(grammarAccess.getParallelGatewayAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParallelGatewayAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5_3__0__Impl"


    // $ANTLR start "rule__ParallelGateway__Group_5_3__1"
    // InternalChor4IntTxtDsl.g:2618:1: rule__ParallelGateway__Group_5_3__1 : rule__ParallelGateway__Group_5_3__1__Impl ;
    public final void rule__ParallelGateway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2622:1: ( rule__ParallelGateway__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:2623:2: rule__ParallelGateway__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5_3__1"


    // $ANTLR start "rule__ParallelGateway__Group_5_3__1__Impl"
    // InternalChor4IntTxtDsl.g:2629:1: rule__ParallelGateway__Group_5_3__1__Impl : ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__ParallelGateway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2633:1: ( ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:2634:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:2634:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:2635:2: ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:2636:2: ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:2636:3: rule__ParallelGateway__OutgoingsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelGateway__OutgoingsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelGatewayAccess().getOutgoingsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__Group_5_3__1__Impl"


    // $ANTLR start "rule__StartEvent__Group__0"
    // InternalChor4IntTxtDsl.g:2645:1: rule__StartEvent__Group__0 : rule__StartEvent__Group__0__Impl rule__StartEvent__Group__1 ;
    public final void rule__StartEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2649:1: ( rule__StartEvent__Group__0__Impl rule__StartEvent__Group__1 )
            // InternalChor4IntTxtDsl.g:2650:2: rule__StartEvent__Group__0__Impl rule__StartEvent__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__StartEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__0"


    // $ANTLR start "rule__StartEvent__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:2657:1: rule__StartEvent__Group__0__Impl : ( () ) ;
    public final void rule__StartEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2661:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:2662:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:2662:1: ( () )
            // InternalChor4IntTxtDsl.g:2663:2: ()
            {
             before(grammarAccess.getStartEventAccess().getStartEventAction_0()); 
            // InternalChor4IntTxtDsl.g:2664:2: ()
            // InternalChor4IntTxtDsl.g:2664:3: 
            {
            }

             after(grammarAccess.getStartEventAccess().getStartEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__0__Impl"


    // $ANTLR start "rule__StartEvent__Group__1"
    // InternalChor4IntTxtDsl.g:2672:1: rule__StartEvent__Group__1 : rule__StartEvent__Group__1__Impl rule__StartEvent__Group__2 ;
    public final void rule__StartEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2676:1: ( rule__StartEvent__Group__1__Impl rule__StartEvent__Group__2 )
            // InternalChor4IntTxtDsl.g:2677:2: rule__StartEvent__Group__1__Impl rule__StartEvent__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StartEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__1"


    // $ANTLR start "rule__StartEvent__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:2684:1: rule__StartEvent__Group__1__Impl : ( 'StartEvent' ) ;
    public final void rule__StartEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2688:1: ( ( 'StartEvent' ) )
            // InternalChor4IntTxtDsl.g:2689:1: ( 'StartEvent' )
            {
            // InternalChor4IntTxtDsl.g:2689:1: ( 'StartEvent' )
            // InternalChor4IntTxtDsl.g:2690:2: 'StartEvent'
            {
             before(grammarAccess.getStartEventAccess().getStartEventKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getStartEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__1__Impl"


    // $ANTLR start "rule__StartEvent__Group__2"
    // InternalChor4IntTxtDsl.g:2699:1: rule__StartEvent__Group__2 : rule__StartEvent__Group__2__Impl rule__StartEvent__Group__3 ;
    public final void rule__StartEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2703:1: ( rule__StartEvent__Group__2__Impl rule__StartEvent__Group__3 )
            // InternalChor4IntTxtDsl.g:2704:2: rule__StartEvent__Group__2__Impl rule__StartEvent__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__StartEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__2"


    // $ANTLR start "rule__StartEvent__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:2711:1: rule__StartEvent__Group__2__Impl : ( ( rule__StartEvent__NameAssignment_2 ) ) ;
    public final void rule__StartEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2715:1: ( ( ( rule__StartEvent__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:2716:1: ( ( rule__StartEvent__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2716:1: ( ( rule__StartEvent__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:2717:2: ( rule__StartEvent__NameAssignment_2 )
            {
             before(grammarAccess.getStartEventAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:2718:2: ( rule__StartEvent__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:2718:3: rule__StartEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__2__Impl"


    // $ANTLR start "rule__StartEvent__Group__3"
    // InternalChor4IntTxtDsl.g:2726:1: rule__StartEvent__Group__3 : rule__StartEvent__Group__3__Impl rule__StartEvent__Group__4 ;
    public final void rule__StartEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2730:1: ( rule__StartEvent__Group__3__Impl rule__StartEvent__Group__4 )
            // InternalChor4IntTxtDsl.g:2731:2: rule__StartEvent__Group__3__Impl rule__StartEvent__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__StartEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__3"


    // $ANTLR start "rule__StartEvent__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:2738:1: rule__StartEvent__Group__3__Impl : ( '{' ) ;
    public final void rule__StartEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2742:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:2743:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:2743:1: ( '{' )
            // InternalChor4IntTxtDsl.g:2744:2: '{'
            {
             before(grammarAccess.getStartEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__3__Impl"


    // $ANTLR start "rule__StartEvent__Group__4"
    // InternalChor4IntTxtDsl.g:2753:1: rule__StartEvent__Group__4 : rule__StartEvent__Group__4__Impl rule__StartEvent__Group__5 ;
    public final void rule__StartEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2757:1: ( rule__StartEvent__Group__4__Impl rule__StartEvent__Group__5 )
            // InternalChor4IntTxtDsl.g:2758:2: rule__StartEvent__Group__4__Impl rule__StartEvent__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__StartEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__4"


    // $ANTLR start "rule__StartEvent__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:2765:1: rule__StartEvent__Group__4__Impl : ( ( rule__StartEvent__Group_4__0 )? ) ;
    public final void rule__StartEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2769:1: ( ( ( rule__StartEvent__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:2770:1: ( ( rule__StartEvent__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2770:1: ( ( rule__StartEvent__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:2771:2: ( rule__StartEvent__Group_4__0 )?
            {
             before(grammarAccess.getStartEventAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:2772:2: ( rule__StartEvent__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2772:3: rule__StartEvent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartEvent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__4__Impl"


    // $ANTLR start "rule__StartEvent__Group__5"
    // InternalChor4IntTxtDsl.g:2780:1: rule__StartEvent__Group__5 : rule__StartEvent__Group__5__Impl rule__StartEvent__Group__6 ;
    public final void rule__StartEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2784:1: ( rule__StartEvent__Group__5__Impl rule__StartEvent__Group__6 )
            // InternalChor4IntTxtDsl.g:2785:2: rule__StartEvent__Group__5__Impl rule__StartEvent__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__StartEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__5"


    // $ANTLR start "rule__StartEvent__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:2792:1: rule__StartEvent__Group__5__Impl : ( ( rule__StartEvent__Group_5__0 )? ) ;
    public final void rule__StartEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2796:1: ( ( ( rule__StartEvent__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:2797:1: ( ( rule__StartEvent__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2797:1: ( ( rule__StartEvent__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:2798:2: ( rule__StartEvent__Group_5__0 )?
            {
             before(grammarAccess.getStartEventAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:2799:2: ( rule__StartEvent__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2799:3: rule__StartEvent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartEvent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__5__Impl"


    // $ANTLR start "rule__StartEvent__Group__6"
    // InternalChor4IntTxtDsl.g:2807:1: rule__StartEvent__Group__6 : rule__StartEvent__Group__6__Impl ;
    public final void rule__StartEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2811:1: ( rule__StartEvent__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:2812:2: rule__StartEvent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__6"


    // $ANTLR start "rule__StartEvent__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:2818:1: rule__StartEvent__Group__6__Impl : ( '}' ) ;
    public final void rule__StartEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2822:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:2823:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:2823:1: ( '}' )
            // InternalChor4IntTxtDsl.g:2824:2: '}'
            {
             before(grammarAccess.getStartEventAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group__6__Impl"


    // $ANTLR start "rule__StartEvent__Group_4__0"
    // InternalChor4IntTxtDsl.g:2834:1: rule__StartEvent__Group_4__0 : rule__StartEvent__Group_4__0__Impl rule__StartEvent__Group_4__1 ;
    public final void rule__StartEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2838:1: ( rule__StartEvent__Group_4__0__Impl rule__StartEvent__Group_4__1 )
            // InternalChor4IntTxtDsl.g:2839:2: rule__StartEvent__Group_4__0__Impl rule__StartEvent__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__StartEvent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__0"


    // $ANTLR start "rule__StartEvent__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:2846:1: rule__StartEvent__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__StartEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2850:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:2851:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:2851:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:2852:2: 'incomings'
            {
             before(grammarAccess.getStartEventAccess().getIncomingsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getIncomingsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__0__Impl"


    // $ANTLR start "rule__StartEvent__Group_4__1"
    // InternalChor4IntTxtDsl.g:2861:1: rule__StartEvent__Group_4__1 : rule__StartEvent__Group_4__1__Impl rule__StartEvent__Group_4__2 ;
    public final void rule__StartEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2865:1: ( rule__StartEvent__Group_4__1__Impl rule__StartEvent__Group_4__2 )
            // InternalChor4IntTxtDsl.g:2866:2: rule__StartEvent__Group_4__1__Impl rule__StartEvent__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__StartEvent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__1"


    // $ANTLR start "rule__StartEvent__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:2873:1: rule__StartEvent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__StartEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2877:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2878:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2878:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2879:2: '('
            {
             before(grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__1__Impl"


    // $ANTLR start "rule__StartEvent__Group_4__2"
    // InternalChor4IntTxtDsl.g:2888:1: rule__StartEvent__Group_4__2 : rule__StartEvent__Group_4__2__Impl rule__StartEvent__Group_4__3 ;
    public final void rule__StartEvent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2892:1: ( rule__StartEvent__Group_4__2__Impl rule__StartEvent__Group_4__3 )
            // InternalChor4IntTxtDsl.g:2893:2: rule__StartEvent__Group_4__2__Impl rule__StartEvent__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__StartEvent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__2"


    // $ANTLR start "rule__StartEvent__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:2900:1: rule__StartEvent__Group_4__2__Impl : ( ( rule__StartEvent__IncomingsAssignment_4_2 ) ) ;
    public final void rule__StartEvent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2904:1: ( ( ( rule__StartEvent__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:2905:1: ( ( rule__StartEvent__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2905:1: ( ( rule__StartEvent__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:2906:2: ( rule__StartEvent__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:2907:2: ( rule__StartEvent__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:2907:3: rule__StartEvent__IncomingsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__IncomingsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStartEventAccess().getIncomingsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__2__Impl"


    // $ANTLR start "rule__StartEvent__Group_4__3"
    // InternalChor4IntTxtDsl.g:2915:1: rule__StartEvent__Group_4__3 : rule__StartEvent__Group_4__3__Impl rule__StartEvent__Group_4__4 ;
    public final void rule__StartEvent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2919:1: ( rule__StartEvent__Group_4__3__Impl rule__StartEvent__Group_4__4 )
            // InternalChor4IntTxtDsl.g:2920:2: rule__StartEvent__Group_4__3__Impl rule__StartEvent__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__StartEvent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__3"


    // $ANTLR start "rule__StartEvent__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:2927:1: rule__StartEvent__Group_4__3__Impl : ( ( rule__StartEvent__Group_4_3__0 )* ) ;
    public final void rule__StartEvent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2931:1: ( ( ( rule__StartEvent__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:2932:1: ( ( rule__StartEvent__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:2932:1: ( ( rule__StartEvent__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:2933:2: ( rule__StartEvent__Group_4_3__0 )*
            {
             before(grammarAccess.getStartEventAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:2934:2: ( rule__StartEvent__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:2934:3: rule__StartEvent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StartEvent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStartEventAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__3__Impl"


    // $ANTLR start "rule__StartEvent__Group_4__4"
    // InternalChor4IntTxtDsl.g:2942:1: rule__StartEvent__Group_4__4 : rule__StartEvent__Group_4__4__Impl ;
    public final void rule__StartEvent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2946:1: ( rule__StartEvent__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:2947:2: rule__StartEvent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__4"


    // $ANTLR start "rule__StartEvent__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:2953:1: rule__StartEvent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__StartEvent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2957:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2958:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2958:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2959:2: ')'
            {
             before(grammarAccess.getStartEventAccess().getRightParenthesisKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4__4__Impl"


    // $ANTLR start "rule__StartEvent__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:2969:1: rule__StartEvent__Group_4_3__0 : rule__StartEvent__Group_4_3__0__Impl rule__StartEvent__Group_4_3__1 ;
    public final void rule__StartEvent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2973:1: ( rule__StartEvent__Group_4_3__0__Impl rule__StartEvent__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:2974:2: rule__StartEvent__Group_4_3__0__Impl rule__StartEvent__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__StartEvent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4_3__0"


    // $ANTLR start "rule__StartEvent__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:2981:1: rule__StartEvent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__StartEvent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2985:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2986:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2986:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2987:2: ','
            {
             before(grammarAccess.getStartEventAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4_3__0__Impl"


    // $ANTLR start "rule__StartEvent__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:2996:1: rule__StartEvent__Group_4_3__1 : rule__StartEvent__Group_4_3__1__Impl ;
    public final void rule__StartEvent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3000:1: ( rule__StartEvent__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3001:2: rule__StartEvent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4_3__1"


    // $ANTLR start "rule__StartEvent__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:3007:1: rule__StartEvent__Group_4_3__1__Impl : ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__StartEvent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3011:1: ( ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3012:1: ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3012:1: ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:3013:2: ( rule__StartEvent__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:3014:2: ( rule__StartEvent__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:3014:3: rule__StartEvent__IncomingsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__IncomingsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStartEventAccess().getIncomingsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_4_3__1__Impl"


    // $ANTLR start "rule__StartEvent__Group_5__0"
    // InternalChor4IntTxtDsl.g:3023:1: rule__StartEvent__Group_5__0 : rule__StartEvent__Group_5__0__Impl rule__StartEvent__Group_5__1 ;
    public final void rule__StartEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3027:1: ( rule__StartEvent__Group_5__0__Impl rule__StartEvent__Group_5__1 )
            // InternalChor4IntTxtDsl.g:3028:2: rule__StartEvent__Group_5__0__Impl rule__StartEvent__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__StartEvent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__0"


    // $ANTLR start "rule__StartEvent__Group_5__0__Impl"
    // InternalChor4IntTxtDsl.g:3035:1: rule__StartEvent__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__StartEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3039:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:3040:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:3040:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:3041:2: 'outgoings'
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getOutgoingsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__0__Impl"


    // $ANTLR start "rule__StartEvent__Group_5__1"
    // InternalChor4IntTxtDsl.g:3050:1: rule__StartEvent__Group_5__1 : rule__StartEvent__Group_5__1__Impl rule__StartEvent__Group_5__2 ;
    public final void rule__StartEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3054:1: ( rule__StartEvent__Group_5__1__Impl rule__StartEvent__Group_5__2 )
            // InternalChor4IntTxtDsl.g:3055:2: rule__StartEvent__Group_5__1__Impl rule__StartEvent__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__StartEvent__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__1"


    // $ANTLR start "rule__StartEvent__Group_5__1__Impl"
    // InternalChor4IntTxtDsl.g:3062:1: rule__StartEvent__Group_5__1__Impl : ( '(' ) ;
    public final void rule__StartEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3066:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:3067:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:3067:1: ( '(' )
            // InternalChor4IntTxtDsl.g:3068:2: '('
            {
             before(grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__1__Impl"


    // $ANTLR start "rule__StartEvent__Group_5__2"
    // InternalChor4IntTxtDsl.g:3077:1: rule__StartEvent__Group_5__2 : rule__StartEvent__Group_5__2__Impl rule__StartEvent__Group_5__3 ;
    public final void rule__StartEvent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3081:1: ( rule__StartEvent__Group_5__2__Impl rule__StartEvent__Group_5__3 )
            // InternalChor4IntTxtDsl.g:3082:2: rule__StartEvent__Group_5__2__Impl rule__StartEvent__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__StartEvent__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__2"


    // $ANTLR start "rule__StartEvent__Group_5__2__Impl"
    // InternalChor4IntTxtDsl.g:3089:1: rule__StartEvent__Group_5__2__Impl : ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__StartEvent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3093:1: ( ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:3094:1: ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3094:1: ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:3095:2: ( rule__StartEvent__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:3096:2: ( rule__StartEvent__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:3096:3: rule__StartEvent__OutgoingsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__OutgoingsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStartEventAccess().getOutgoingsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__2__Impl"


    // $ANTLR start "rule__StartEvent__Group_5__3"
    // InternalChor4IntTxtDsl.g:3104:1: rule__StartEvent__Group_5__3 : rule__StartEvent__Group_5__3__Impl rule__StartEvent__Group_5__4 ;
    public final void rule__StartEvent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3108:1: ( rule__StartEvent__Group_5__3__Impl rule__StartEvent__Group_5__4 )
            // InternalChor4IntTxtDsl.g:3109:2: rule__StartEvent__Group_5__3__Impl rule__StartEvent__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__StartEvent__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__3"


    // $ANTLR start "rule__StartEvent__Group_5__3__Impl"
    // InternalChor4IntTxtDsl.g:3116:1: rule__StartEvent__Group_5__3__Impl : ( ( rule__StartEvent__Group_5_3__0 )* ) ;
    public final void rule__StartEvent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3120:1: ( ( ( rule__StartEvent__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3121:1: ( ( rule__StartEvent__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3121:1: ( ( rule__StartEvent__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:3122:2: ( rule__StartEvent__Group_5_3__0 )*
            {
             before(grammarAccess.getStartEventAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:3123:2: ( rule__StartEvent__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3123:3: rule__StartEvent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StartEvent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStartEventAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__3__Impl"


    // $ANTLR start "rule__StartEvent__Group_5__4"
    // InternalChor4IntTxtDsl.g:3131:1: rule__StartEvent__Group_5__4 : rule__StartEvent__Group_5__4__Impl ;
    public final void rule__StartEvent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3135:1: ( rule__StartEvent__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:3136:2: rule__StartEvent__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__4"


    // $ANTLR start "rule__StartEvent__Group_5__4__Impl"
    // InternalChor4IntTxtDsl.g:3142:1: rule__StartEvent__Group_5__4__Impl : ( ')' ) ;
    public final void rule__StartEvent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3146:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3147:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3147:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3148:2: ')'
            {
             before(grammarAccess.getStartEventAccess().getRightParenthesisKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5__4__Impl"


    // $ANTLR start "rule__StartEvent__Group_5_3__0"
    // InternalChor4IntTxtDsl.g:3158:1: rule__StartEvent__Group_5_3__0 : rule__StartEvent__Group_5_3__0__Impl rule__StartEvent__Group_5_3__1 ;
    public final void rule__StartEvent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3162:1: ( rule__StartEvent__Group_5_3__0__Impl rule__StartEvent__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:3163:2: rule__StartEvent__Group_5_3__0__Impl rule__StartEvent__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__StartEvent__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5_3__0"


    // $ANTLR start "rule__StartEvent__Group_5_3__0__Impl"
    // InternalChor4IntTxtDsl.g:3170:1: rule__StartEvent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__StartEvent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3174:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3175:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3175:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3176:2: ','
            {
             before(grammarAccess.getStartEventAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStartEventAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5_3__0__Impl"


    // $ANTLR start "rule__StartEvent__Group_5_3__1"
    // InternalChor4IntTxtDsl.g:3185:1: rule__StartEvent__Group_5_3__1 : rule__StartEvent__Group_5_3__1__Impl ;
    public final void rule__StartEvent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3189:1: ( rule__StartEvent__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3190:2: rule__StartEvent__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5_3__1"


    // $ANTLR start "rule__StartEvent__Group_5_3__1__Impl"
    // InternalChor4IntTxtDsl.g:3196:1: rule__StartEvent__Group_5_3__1__Impl : ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__StartEvent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3200:1: ( ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3201:1: ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3201:1: ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:3202:2: ( rule__StartEvent__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:3203:2: ( rule__StartEvent__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:3203:3: rule__StartEvent__OutgoingsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StartEvent__OutgoingsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStartEventAccess().getOutgoingsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__Group_5_3__1__Impl"


    // $ANTLR start "rule__EndEvent__Group__0"
    // InternalChor4IntTxtDsl.g:3212:1: rule__EndEvent__Group__0 : rule__EndEvent__Group__0__Impl rule__EndEvent__Group__1 ;
    public final void rule__EndEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3216:1: ( rule__EndEvent__Group__0__Impl rule__EndEvent__Group__1 )
            // InternalChor4IntTxtDsl.g:3217:2: rule__EndEvent__Group__0__Impl rule__EndEvent__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EndEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__0"


    // $ANTLR start "rule__EndEvent__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:3224:1: rule__EndEvent__Group__0__Impl : ( () ) ;
    public final void rule__EndEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3228:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:3229:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:3229:1: ( () )
            // InternalChor4IntTxtDsl.g:3230:2: ()
            {
             before(grammarAccess.getEndEventAccess().getEndEventAction_0()); 
            // InternalChor4IntTxtDsl.g:3231:2: ()
            // InternalChor4IntTxtDsl.g:3231:3: 
            {
            }

             after(grammarAccess.getEndEventAccess().getEndEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__0__Impl"


    // $ANTLR start "rule__EndEvent__Group__1"
    // InternalChor4IntTxtDsl.g:3239:1: rule__EndEvent__Group__1 : rule__EndEvent__Group__1__Impl rule__EndEvent__Group__2 ;
    public final void rule__EndEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3243:1: ( rule__EndEvent__Group__1__Impl rule__EndEvent__Group__2 )
            // InternalChor4IntTxtDsl.g:3244:2: rule__EndEvent__Group__1__Impl rule__EndEvent__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EndEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__1"


    // $ANTLR start "rule__EndEvent__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:3251:1: rule__EndEvent__Group__1__Impl : ( 'EndEvent' ) ;
    public final void rule__EndEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3255:1: ( ( 'EndEvent' ) )
            // InternalChor4IntTxtDsl.g:3256:1: ( 'EndEvent' )
            {
            // InternalChor4IntTxtDsl.g:3256:1: ( 'EndEvent' )
            // InternalChor4IntTxtDsl.g:3257:2: 'EndEvent'
            {
             before(grammarAccess.getEndEventAccess().getEndEventKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getEndEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__1__Impl"


    // $ANTLR start "rule__EndEvent__Group__2"
    // InternalChor4IntTxtDsl.g:3266:1: rule__EndEvent__Group__2 : rule__EndEvent__Group__2__Impl rule__EndEvent__Group__3 ;
    public final void rule__EndEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3270:1: ( rule__EndEvent__Group__2__Impl rule__EndEvent__Group__3 )
            // InternalChor4IntTxtDsl.g:3271:2: rule__EndEvent__Group__2__Impl rule__EndEvent__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EndEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__2"


    // $ANTLR start "rule__EndEvent__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:3278:1: rule__EndEvent__Group__2__Impl : ( ( rule__EndEvent__NameAssignment_2 ) ) ;
    public final void rule__EndEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3282:1: ( ( ( rule__EndEvent__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:3283:1: ( ( rule__EndEvent__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3283:1: ( ( rule__EndEvent__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:3284:2: ( rule__EndEvent__NameAssignment_2 )
            {
             before(grammarAccess.getEndEventAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:3285:2: ( rule__EndEvent__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:3285:3: rule__EndEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__2__Impl"


    // $ANTLR start "rule__EndEvent__Group__3"
    // InternalChor4IntTxtDsl.g:3293:1: rule__EndEvent__Group__3 : rule__EndEvent__Group__3__Impl rule__EndEvent__Group__4 ;
    public final void rule__EndEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3297:1: ( rule__EndEvent__Group__3__Impl rule__EndEvent__Group__4 )
            // InternalChor4IntTxtDsl.g:3298:2: rule__EndEvent__Group__3__Impl rule__EndEvent__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__EndEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__3"


    // $ANTLR start "rule__EndEvent__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:3305:1: rule__EndEvent__Group__3__Impl : ( '{' ) ;
    public final void rule__EndEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3309:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:3310:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:3310:1: ( '{' )
            // InternalChor4IntTxtDsl.g:3311:2: '{'
            {
             before(grammarAccess.getEndEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__3__Impl"


    // $ANTLR start "rule__EndEvent__Group__4"
    // InternalChor4IntTxtDsl.g:3320:1: rule__EndEvent__Group__4 : rule__EndEvent__Group__4__Impl rule__EndEvent__Group__5 ;
    public final void rule__EndEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3324:1: ( rule__EndEvent__Group__4__Impl rule__EndEvent__Group__5 )
            // InternalChor4IntTxtDsl.g:3325:2: rule__EndEvent__Group__4__Impl rule__EndEvent__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__EndEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__4"


    // $ANTLR start "rule__EndEvent__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:3332:1: rule__EndEvent__Group__4__Impl : ( ( rule__EndEvent__Group_4__0 )? ) ;
    public final void rule__EndEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3336:1: ( ( ( rule__EndEvent__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:3337:1: ( ( rule__EndEvent__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3337:1: ( ( rule__EndEvent__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:3338:2: ( rule__EndEvent__Group_4__0 )?
            {
             before(grammarAccess.getEndEventAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:3339:2: ( rule__EndEvent__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3339:3: rule__EndEvent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndEvent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__4__Impl"


    // $ANTLR start "rule__EndEvent__Group__5"
    // InternalChor4IntTxtDsl.g:3347:1: rule__EndEvent__Group__5 : rule__EndEvent__Group__5__Impl rule__EndEvent__Group__6 ;
    public final void rule__EndEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3351:1: ( rule__EndEvent__Group__5__Impl rule__EndEvent__Group__6 )
            // InternalChor4IntTxtDsl.g:3352:2: rule__EndEvent__Group__5__Impl rule__EndEvent__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__EndEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__5"


    // $ANTLR start "rule__EndEvent__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:3359:1: rule__EndEvent__Group__5__Impl : ( ( rule__EndEvent__Group_5__0 )? ) ;
    public final void rule__EndEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3363:1: ( ( ( rule__EndEvent__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:3364:1: ( ( rule__EndEvent__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3364:1: ( ( rule__EndEvent__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:3365:2: ( rule__EndEvent__Group_5__0 )?
            {
             before(grammarAccess.getEndEventAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:3366:2: ( rule__EndEvent__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3366:3: rule__EndEvent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndEvent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__5__Impl"


    // $ANTLR start "rule__EndEvent__Group__6"
    // InternalChor4IntTxtDsl.g:3374:1: rule__EndEvent__Group__6 : rule__EndEvent__Group__6__Impl ;
    public final void rule__EndEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3378:1: ( rule__EndEvent__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:3379:2: rule__EndEvent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__6"


    // $ANTLR start "rule__EndEvent__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:3385:1: rule__EndEvent__Group__6__Impl : ( '}' ) ;
    public final void rule__EndEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3389:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:3390:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:3390:1: ( '}' )
            // InternalChor4IntTxtDsl.g:3391:2: '}'
            {
             before(grammarAccess.getEndEventAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group__6__Impl"


    // $ANTLR start "rule__EndEvent__Group_4__0"
    // InternalChor4IntTxtDsl.g:3401:1: rule__EndEvent__Group_4__0 : rule__EndEvent__Group_4__0__Impl rule__EndEvent__Group_4__1 ;
    public final void rule__EndEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3405:1: ( rule__EndEvent__Group_4__0__Impl rule__EndEvent__Group_4__1 )
            // InternalChor4IntTxtDsl.g:3406:2: rule__EndEvent__Group_4__0__Impl rule__EndEvent__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__EndEvent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__0"


    // $ANTLR start "rule__EndEvent__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:3413:1: rule__EndEvent__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__EndEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3417:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:3418:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:3418:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:3419:2: 'incomings'
            {
             before(grammarAccess.getEndEventAccess().getIncomingsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getIncomingsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__0__Impl"


    // $ANTLR start "rule__EndEvent__Group_4__1"
    // InternalChor4IntTxtDsl.g:3428:1: rule__EndEvent__Group_4__1 : rule__EndEvent__Group_4__1__Impl rule__EndEvent__Group_4__2 ;
    public final void rule__EndEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3432:1: ( rule__EndEvent__Group_4__1__Impl rule__EndEvent__Group_4__2 )
            // InternalChor4IntTxtDsl.g:3433:2: rule__EndEvent__Group_4__1__Impl rule__EndEvent__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__EndEvent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__1"


    // $ANTLR start "rule__EndEvent__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:3440:1: rule__EndEvent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__EndEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3444:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:3445:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:3445:1: ( '(' )
            // InternalChor4IntTxtDsl.g:3446:2: '('
            {
             before(grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__1__Impl"


    // $ANTLR start "rule__EndEvent__Group_4__2"
    // InternalChor4IntTxtDsl.g:3455:1: rule__EndEvent__Group_4__2 : rule__EndEvent__Group_4__2__Impl rule__EndEvent__Group_4__3 ;
    public final void rule__EndEvent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3459:1: ( rule__EndEvent__Group_4__2__Impl rule__EndEvent__Group_4__3 )
            // InternalChor4IntTxtDsl.g:3460:2: rule__EndEvent__Group_4__2__Impl rule__EndEvent__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__EndEvent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__2"


    // $ANTLR start "rule__EndEvent__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:3467:1: rule__EndEvent__Group_4__2__Impl : ( ( rule__EndEvent__IncomingsAssignment_4_2 ) ) ;
    public final void rule__EndEvent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3471:1: ( ( ( rule__EndEvent__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:3472:1: ( ( rule__EndEvent__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3472:1: ( ( rule__EndEvent__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:3473:2: ( rule__EndEvent__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:3474:2: ( rule__EndEvent__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:3474:3: rule__EndEvent__IncomingsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__IncomingsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEndEventAccess().getIncomingsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__2__Impl"


    // $ANTLR start "rule__EndEvent__Group_4__3"
    // InternalChor4IntTxtDsl.g:3482:1: rule__EndEvent__Group_4__3 : rule__EndEvent__Group_4__3__Impl rule__EndEvent__Group_4__4 ;
    public final void rule__EndEvent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3486:1: ( rule__EndEvent__Group_4__3__Impl rule__EndEvent__Group_4__4 )
            // InternalChor4IntTxtDsl.g:3487:2: rule__EndEvent__Group_4__3__Impl rule__EndEvent__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__EndEvent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__3"


    // $ANTLR start "rule__EndEvent__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:3494:1: rule__EndEvent__Group_4__3__Impl : ( ( rule__EndEvent__Group_4_3__0 )* ) ;
    public final void rule__EndEvent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3498:1: ( ( ( rule__EndEvent__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3499:1: ( ( rule__EndEvent__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3499:1: ( ( rule__EndEvent__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:3500:2: ( rule__EndEvent__Group_4_3__0 )*
            {
             before(grammarAccess.getEndEventAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:3501:2: ( rule__EndEvent__Group_4_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3501:3: rule__EndEvent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EndEvent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEndEventAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__3__Impl"


    // $ANTLR start "rule__EndEvent__Group_4__4"
    // InternalChor4IntTxtDsl.g:3509:1: rule__EndEvent__Group_4__4 : rule__EndEvent__Group_4__4__Impl ;
    public final void rule__EndEvent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3513:1: ( rule__EndEvent__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:3514:2: rule__EndEvent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__4"


    // $ANTLR start "rule__EndEvent__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:3520:1: rule__EndEvent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__EndEvent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3524:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3525:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3525:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3526:2: ')'
            {
             before(grammarAccess.getEndEventAccess().getRightParenthesisKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4__4__Impl"


    // $ANTLR start "rule__EndEvent__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:3536:1: rule__EndEvent__Group_4_3__0 : rule__EndEvent__Group_4_3__0__Impl rule__EndEvent__Group_4_3__1 ;
    public final void rule__EndEvent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3540:1: ( rule__EndEvent__Group_4_3__0__Impl rule__EndEvent__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:3541:2: rule__EndEvent__Group_4_3__0__Impl rule__EndEvent__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__EndEvent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4_3__0"


    // $ANTLR start "rule__EndEvent__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:3548:1: rule__EndEvent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__EndEvent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3552:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3553:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3553:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3554:2: ','
            {
             before(grammarAccess.getEndEventAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4_3__0__Impl"


    // $ANTLR start "rule__EndEvent__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:3563:1: rule__EndEvent__Group_4_3__1 : rule__EndEvent__Group_4_3__1__Impl ;
    public final void rule__EndEvent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3567:1: ( rule__EndEvent__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3568:2: rule__EndEvent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4_3__1"


    // $ANTLR start "rule__EndEvent__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:3574:1: rule__EndEvent__Group_4_3__1__Impl : ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__EndEvent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3578:1: ( ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3579:1: ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3579:1: ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:3580:2: ( rule__EndEvent__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:3581:2: ( rule__EndEvent__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:3581:3: rule__EndEvent__IncomingsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__IncomingsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndEventAccess().getIncomingsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_4_3__1__Impl"


    // $ANTLR start "rule__EndEvent__Group_5__0"
    // InternalChor4IntTxtDsl.g:3590:1: rule__EndEvent__Group_5__0 : rule__EndEvent__Group_5__0__Impl rule__EndEvent__Group_5__1 ;
    public final void rule__EndEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3594:1: ( rule__EndEvent__Group_5__0__Impl rule__EndEvent__Group_5__1 )
            // InternalChor4IntTxtDsl.g:3595:2: rule__EndEvent__Group_5__0__Impl rule__EndEvent__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__EndEvent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__0"


    // $ANTLR start "rule__EndEvent__Group_5__0__Impl"
    // InternalChor4IntTxtDsl.g:3602:1: rule__EndEvent__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__EndEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3606:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:3607:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:3607:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:3608:2: 'outgoings'
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getOutgoingsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__0__Impl"


    // $ANTLR start "rule__EndEvent__Group_5__1"
    // InternalChor4IntTxtDsl.g:3617:1: rule__EndEvent__Group_5__1 : rule__EndEvent__Group_5__1__Impl rule__EndEvent__Group_5__2 ;
    public final void rule__EndEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3621:1: ( rule__EndEvent__Group_5__1__Impl rule__EndEvent__Group_5__2 )
            // InternalChor4IntTxtDsl.g:3622:2: rule__EndEvent__Group_5__1__Impl rule__EndEvent__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__EndEvent__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__1"


    // $ANTLR start "rule__EndEvent__Group_5__1__Impl"
    // InternalChor4IntTxtDsl.g:3629:1: rule__EndEvent__Group_5__1__Impl : ( '(' ) ;
    public final void rule__EndEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3633:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:3634:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:3634:1: ( '(' )
            // InternalChor4IntTxtDsl.g:3635:2: '('
            {
             before(grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__1__Impl"


    // $ANTLR start "rule__EndEvent__Group_5__2"
    // InternalChor4IntTxtDsl.g:3644:1: rule__EndEvent__Group_5__2 : rule__EndEvent__Group_5__2__Impl rule__EndEvent__Group_5__3 ;
    public final void rule__EndEvent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3648:1: ( rule__EndEvent__Group_5__2__Impl rule__EndEvent__Group_5__3 )
            // InternalChor4IntTxtDsl.g:3649:2: rule__EndEvent__Group_5__2__Impl rule__EndEvent__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__EndEvent__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__2"


    // $ANTLR start "rule__EndEvent__Group_5__2__Impl"
    // InternalChor4IntTxtDsl.g:3656:1: rule__EndEvent__Group_5__2__Impl : ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__EndEvent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3660:1: ( ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:3661:1: ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3661:1: ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:3662:2: ( rule__EndEvent__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:3663:2: ( rule__EndEvent__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:3663:3: rule__EndEvent__OutgoingsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__OutgoingsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEndEventAccess().getOutgoingsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__2__Impl"


    // $ANTLR start "rule__EndEvent__Group_5__3"
    // InternalChor4IntTxtDsl.g:3671:1: rule__EndEvent__Group_5__3 : rule__EndEvent__Group_5__3__Impl rule__EndEvent__Group_5__4 ;
    public final void rule__EndEvent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3675:1: ( rule__EndEvent__Group_5__3__Impl rule__EndEvent__Group_5__4 )
            // InternalChor4IntTxtDsl.g:3676:2: rule__EndEvent__Group_5__3__Impl rule__EndEvent__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__EndEvent__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__3"


    // $ANTLR start "rule__EndEvent__Group_5__3__Impl"
    // InternalChor4IntTxtDsl.g:3683:1: rule__EndEvent__Group_5__3__Impl : ( ( rule__EndEvent__Group_5_3__0 )* ) ;
    public final void rule__EndEvent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3687:1: ( ( ( rule__EndEvent__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3688:1: ( ( rule__EndEvent__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3688:1: ( ( rule__EndEvent__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:3689:2: ( rule__EndEvent__Group_5_3__0 )*
            {
             before(grammarAccess.getEndEventAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:3690:2: ( rule__EndEvent__Group_5_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3690:3: rule__EndEvent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EndEvent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEndEventAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__3__Impl"


    // $ANTLR start "rule__EndEvent__Group_5__4"
    // InternalChor4IntTxtDsl.g:3698:1: rule__EndEvent__Group_5__4 : rule__EndEvent__Group_5__4__Impl ;
    public final void rule__EndEvent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3702:1: ( rule__EndEvent__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:3703:2: rule__EndEvent__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__4"


    // $ANTLR start "rule__EndEvent__Group_5__4__Impl"
    // InternalChor4IntTxtDsl.g:3709:1: rule__EndEvent__Group_5__4__Impl : ( ')' ) ;
    public final void rule__EndEvent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3713:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3714:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3714:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3715:2: ')'
            {
             before(grammarAccess.getEndEventAccess().getRightParenthesisKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5__4__Impl"


    // $ANTLR start "rule__EndEvent__Group_5_3__0"
    // InternalChor4IntTxtDsl.g:3725:1: rule__EndEvent__Group_5_3__0 : rule__EndEvent__Group_5_3__0__Impl rule__EndEvent__Group_5_3__1 ;
    public final void rule__EndEvent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3729:1: ( rule__EndEvent__Group_5_3__0__Impl rule__EndEvent__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:3730:2: rule__EndEvent__Group_5_3__0__Impl rule__EndEvent__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__EndEvent__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5_3__0"


    // $ANTLR start "rule__EndEvent__Group_5_3__0__Impl"
    // InternalChor4IntTxtDsl.g:3737:1: rule__EndEvent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EndEvent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3741:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3742:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3742:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3743:2: ','
            {
             before(grammarAccess.getEndEventAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEndEventAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5_3__0__Impl"


    // $ANTLR start "rule__EndEvent__Group_5_3__1"
    // InternalChor4IntTxtDsl.g:3752:1: rule__EndEvent__Group_5_3__1 : rule__EndEvent__Group_5_3__1__Impl ;
    public final void rule__EndEvent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3756:1: ( rule__EndEvent__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3757:2: rule__EndEvent__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5_3__1"


    // $ANTLR start "rule__EndEvent__Group_5_3__1__Impl"
    // InternalChor4IntTxtDsl.g:3763:1: rule__EndEvent__Group_5_3__1__Impl : ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__EndEvent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3767:1: ( ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3768:1: ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3768:1: ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:3769:2: ( rule__EndEvent__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:3770:2: ( rule__EndEvent__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:3770:3: rule__EndEvent__OutgoingsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EndEvent__OutgoingsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndEventAccess().getOutgoingsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__Group_5_3__1__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__0"
    // InternalChor4IntTxtDsl.g:3779:1: rule__AtomicInteraction__Group__0 : rule__AtomicInteraction__Group__0__Impl rule__AtomicInteraction__Group__1 ;
    public final void rule__AtomicInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3783:1: ( rule__AtomicInteraction__Group__0__Impl rule__AtomicInteraction__Group__1 )
            // InternalChor4IntTxtDsl.g:3784:2: rule__AtomicInteraction__Group__0__Impl rule__AtomicInteraction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__0"


    // $ANTLR start "rule__AtomicInteraction__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:3791:1: rule__AtomicInteraction__Group__0__Impl : ( 'AtomicInteraction' ) ;
    public final void rule__AtomicInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3795:1: ( ( 'AtomicInteraction' ) )
            // InternalChor4IntTxtDsl.g:3796:1: ( 'AtomicInteraction' )
            {
            // InternalChor4IntTxtDsl.g:3796:1: ( 'AtomicInteraction' )
            // InternalChor4IntTxtDsl.g:3797:2: 'AtomicInteraction'
            {
             before(grammarAccess.getAtomicInteractionAccess().getAtomicInteractionKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getAtomicInteractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__0__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__1"
    // InternalChor4IntTxtDsl.g:3806:1: rule__AtomicInteraction__Group__1 : rule__AtomicInteraction__Group__1__Impl rule__AtomicInteraction__Group__2 ;
    public final void rule__AtomicInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3810:1: ( rule__AtomicInteraction__Group__1__Impl rule__AtomicInteraction__Group__2 )
            // InternalChor4IntTxtDsl.g:3811:2: rule__AtomicInteraction__Group__1__Impl rule__AtomicInteraction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AtomicInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__1"


    // $ANTLR start "rule__AtomicInteraction__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:3818:1: rule__AtomicInteraction__Group__1__Impl : ( ( rule__AtomicInteraction__NameAssignment_1 ) ) ;
    public final void rule__AtomicInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3822:1: ( ( ( rule__AtomicInteraction__NameAssignment_1 ) ) )
            // InternalChor4IntTxtDsl.g:3823:1: ( ( rule__AtomicInteraction__NameAssignment_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3823:1: ( ( rule__AtomicInteraction__NameAssignment_1 ) )
            // InternalChor4IntTxtDsl.g:3824:2: ( rule__AtomicInteraction__NameAssignment_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getNameAssignment_1()); 
            // InternalChor4IntTxtDsl.g:3825:2: ( rule__AtomicInteraction__NameAssignment_1 )
            // InternalChor4IntTxtDsl.g:3825:3: rule__AtomicInteraction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__1__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__2"
    // InternalChor4IntTxtDsl.g:3833:1: rule__AtomicInteraction__Group__2 : rule__AtomicInteraction__Group__2__Impl rule__AtomicInteraction__Group__3 ;
    public final void rule__AtomicInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3837:1: ( rule__AtomicInteraction__Group__2__Impl rule__AtomicInteraction__Group__3 )
            // InternalChor4IntTxtDsl.g:3838:2: rule__AtomicInteraction__Group__2__Impl rule__AtomicInteraction__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AtomicInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__2"


    // $ANTLR start "rule__AtomicInteraction__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:3845:1: rule__AtomicInteraction__Group__2__Impl : ( '{' ) ;
    public final void rule__AtomicInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3849:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:3850:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:3850:1: ( '{' )
            // InternalChor4IntTxtDsl.g:3851:2: '{'
            {
             before(grammarAccess.getAtomicInteractionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__2__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__3"
    // InternalChor4IntTxtDsl.g:3860:1: rule__AtomicInteraction__Group__3 : rule__AtomicInteraction__Group__3__Impl rule__AtomicInteraction__Group__4 ;
    public final void rule__AtomicInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3864:1: ( rule__AtomicInteraction__Group__3__Impl rule__AtomicInteraction__Group__4 )
            // InternalChor4IntTxtDsl.g:3865:2: rule__AtomicInteraction__Group__3__Impl rule__AtomicInteraction__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__AtomicInteraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__3"


    // $ANTLR start "rule__AtomicInteraction__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:3872:1: rule__AtomicInteraction__Group__3__Impl : ( ( rule__AtomicInteraction__Group_3__0 )? ) ;
    public final void rule__AtomicInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3876:1: ( ( ( rule__AtomicInteraction__Group_3__0 )? ) )
            // InternalChor4IntTxtDsl.g:3877:1: ( ( rule__AtomicInteraction__Group_3__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3877:1: ( ( rule__AtomicInteraction__Group_3__0 )? )
            // InternalChor4IntTxtDsl.g:3878:2: ( rule__AtomicInteraction__Group_3__0 )?
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_3()); 
            // InternalChor4IntTxtDsl.g:3879:2: ( rule__AtomicInteraction__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3879:3: rule__AtomicInteraction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicInteraction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicInteractionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__3__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__4"
    // InternalChor4IntTxtDsl.g:3887:1: rule__AtomicInteraction__Group__4 : rule__AtomicInteraction__Group__4__Impl rule__AtomicInteraction__Group__5 ;
    public final void rule__AtomicInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3891:1: ( rule__AtomicInteraction__Group__4__Impl rule__AtomicInteraction__Group__5 )
            // InternalChor4IntTxtDsl.g:3892:2: rule__AtomicInteraction__Group__4__Impl rule__AtomicInteraction__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__AtomicInteraction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__4"


    // $ANTLR start "rule__AtomicInteraction__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:3899:1: rule__AtomicInteraction__Group__4__Impl : ( ( rule__AtomicInteraction__Group_4__0 )? ) ;
    public final void rule__AtomicInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3903:1: ( ( ( rule__AtomicInteraction__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:3904:1: ( ( rule__AtomicInteraction__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3904:1: ( ( rule__AtomicInteraction__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:3905:2: ( rule__AtomicInteraction__Group_4__0 )?
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:3906:2: ( rule__AtomicInteraction__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3906:3: rule__AtomicInteraction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicInteraction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicInteractionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__4__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__5"
    // InternalChor4IntTxtDsl.g:3914:1: rule__AtomicInteraction__Group__5 : rule__AtomicInteraction__Group__5__Impl rule__AtomicInteraction__Group__6 ;
    public final void rule__AtomicInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3918:1: ( rule__AtomicInteraction__Group__5__Impl rule__AtomicInteraction__Group__6 )
            // InternalChor4IntTxtDsl.g:3919:2: rule__AtomicInteraction__Group__5__Impl rule__AtomicInteraction__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__5"


    // $ANTLR start "rule__AtomicInteraction__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:3926:1: rule__AtomicInteraction__Group__5__Impl : ( 'sender' ) ;
    public final void rule__AtomicInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3930:1: ( ( 'sender' ) )
            // InternalChor4IntTxtDsl.g:3931:1: ( 'sender' )
            {
            // InternalChor4IntTxtDsl.g:3931:1: ( 'sender' )
            // InternalChor4IntTxtDsl.g:3932:2: 'sender'
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getSenderKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__5__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__6"
    // InternalChor4IntTxtDsl.g:3941:1: rule__AtomicInteraction__Group__6 : rule__AtomicInteraction__Group__6__Impl rule__AtomicInteraction__Group__7 ;
    public final void rule__AtomicInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3945:1: ( rule__AtomicInteraction__Group__6__Impl rule__AtomicInteraction__Group__7 )
            // InternalChor4IntTxtDsl.g:3946:2: rule__AtomicInteraction__Group__6__Impl rule__AtomicInteraction__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__AtomicInteraction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__6"


    // $ANTLR start "rule__AtomicInteraction__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:3953:1: rule__AtomicInteraction__Group__6__Impl : ( ( rule__AtomicInteraction__SenderAssignment_6 ) ) ;
    public final void rule__AtomicInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3957:1: ( ( ( rule__AtomicInteraction__SenderAssignment_6 ) ) )
            // InternalChor4IntTxtDsl.g:3958:1: ( ( rule__AtomicInteraction__SenderAssignment_6 ) )
            {
            // InternalChor4IntTxtDsl.g:3958:1: ( ( rule__AtomicInteraction__SenderAssignment_6 ) )
            // InternalChor4IntTxtDsl.g:3959:2: ( rule__AtomicInteraction__SenderAssignment_6 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderAssignment_6()); 
            // InternalChor4IntTxtDsl.g:3960:2: ( rule__AtomicInteraction__SenderAssignment_6 )
            // InternalChor4IntTxtDsl.g:3960:3: rule__AtomicInteraction__SenderAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__SenderAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getSenderAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__6__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__7"
    // InternalChor4IntTxtDsl.g:3968:1: rule__AtomicInteraction__Group__7 : rule__AtomicInteraction__Group__7__Impl rule__AtomicInteraction__Group__8 ;
    public final void rule__AtomicInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3972:1: ( rule__AtomicInteraction__Group__7__Impl rule__AtomicInteraction__Group__8 )
            // InternalChor4IntTxtDsl.g:3973:2: rule__AtomicInteraction__Group__7__Impl rule__AtomicInteraction__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__7"


    // $ANTLR start "rule__AtomicInteraction__Group__7__Impl"
    // InternalChor4IntTxtDsl.g:3980:1: rule__AtomicInteraction__Group__7__Impl : ( 'receiver' ) ;
    public final void rule__AtomicInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3984:1: ( ( 'receiver' ) )
            // InternalChor4IntTxtDsl.g:3985:1: ( 'receiver' )
            {
            // InternalChor4IntTxtDsl.g:3985:1: ( 'receiver' )
            // InternalChor4IntTxtDsl.g:3986:2: 'receiver'
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getReceiverKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__7__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__8"
    // InternalChor4IntTxtDsl.g:3995:1: rule__AtomicInteraction__Group__8 : rule__AtomicInteraction__Group__8__Impl rule__AtomicInteraction__Group__9 ;
    public final void rule__AtomicInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3999:1: ( rule__AtomicInteraction__Group__8__Impl rule__AtomicInteraction__Group__9 )
            // InternalChor4IntTxtDsl.g:4000:2: rule__AtomicInteraction__Group__8__Impl rule__AtomicInteraction__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__AtomicInteraction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__8"


    // $ANTLR start "rule__AtomicInteraction__Group__8__Impl"
    // InternalChor4IntTxtDsl.g:4007:1: rule__AtomicInteraction__Group__8__Impl : ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) ) ;
    public final void rule__AtomicInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4011:1: ( ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) ) )
            // InternalChor4IntTxtDsl.g:4012:1: ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) )
            {
            // InternalChor4IntTxtDsl.g:4012:1: ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) )
            // InternalChor4IntTxtDsl.g:4013:2: ( rule__AtomicInteraction__ReceiverAssignment_8 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverAssignment_8()); 
            // InternalChor4IntTxtDsl.g:4014:2: ( rule__AtomicInteraction__ReceiverAssignment_8 )
            // InternalChor4IntTxtDsl.g:4014:3: rule__AtomicInteraction__ReceiverAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__ReceiverAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getReceiverAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__8__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__9"
    // InternalChor4IntTxtDsl.g:4022:1: rule__AtomicInteraction__Group__9 : rule__AtomicInteraction__Group__9__Impl rule__AtomicInteraction__Group__10 ;
    public final void rule__AtomicInteraction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4026:1: ( rule__AtomicInteraction__Group__9__Impl rule__AtomicInteraction__Group__10 )
            // InternalChor4IntTxtDsl.g:4027:2: rule__AtomicInteraction__Group__9__Impl rule__AtomicInteraction__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__AtomicInteraction__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__9"


    // $ANTLR start "rule__AtomicInteraction__Group__9__Impl"
    // InternalChor4IntTxtDsl.g:4034:1: rule__AtomicInteraction__Group__9__Impl : ( ( rule__AtomicInteraction__Group_9__0 )? ) ;
    public final void rule__AtomicInteraction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4038:1: ( ( ( rule__AtomicInteraction__Group_9__0 )? ) )
            // InternalChor4IntTxtDsl.g:4039:1: ( ( rule__AtomicInteraction__Group_9__0 )? )
            {
            // InternalChor4IntTxtDsl.g:4039:1: ( ( rule__AtomicInteraction__Group_9__0 )? )
            // InternalChor4IntTxtDsl.g:4040:2: ( rule__AtomicInteraction__Group_9__0 )?
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_9()); 
            // InternalChor4IntTxtDsl.g:4041:2: ( rule__AtomicInteraction__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:4041:3: rule__AtomicInteraction__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicInteraction__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicInteractionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__9__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group__10"
    // InternalChor4IntTxtDsl.g:4049:1: rule__AtomicInteraction__Group__10 : rule__AtomicInteraction__Group__10__Impl ;
    public final void rule__AtomicInteraction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4053:1: ( rule__AtomicInteraction__Group__10__Impl )
            // InternalChor4IntTxtDsl.g:4054:2: rule__AtomicInteraction__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__10"


    // $ANTLR start "rule__AtomicInteraction__Group__10__Impl"
    // InternalChor4IntTxtDsl.g:4060:1: rule__AtomicInteraction__Group__10__Impl : ( '}' ) ;
    public final void rule__AtomicInteraction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4064:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:4065:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:4065:1: ( '}' )
            // InternalChor4IntTxtDsl.g:4066:2: '}'
            {
             before(grammarAccess.getAtomicInteractionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group__10__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3__0"
    // InternalChor4IntTxtDsl.g:4076:1: rule__AtomicInteraction__Group_3__0 : rule__AtomicInteraction__Group_3__0__Impl rule__AtomicInteraction__Group_3__1 ;
    public final void rule__AtomicInteraction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4080:1: ( rule__AtomicInteraction__Group_3__0__Impl rule__AtomicInteraction__Group_3__1 )
            // InternalChor4IntTxtDsl.g:4081:2: rule__AtomicInteraction__Group_3__0__Impl rule__AtomicInteraction__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__AtomicInteraction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__0"


    // $ANTLR start "rule__AtomicInteraction__Group_3__0__Impl"
    // InternalChor4IntTxtDsl.g:4088:1: rule__AtomicInteraction__Group_3__0__Impl : ( 'incomings' ) ;
    public final void rule__AtomicInteraction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4092:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:4093:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:4093:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:4094:2: 'incomings'
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getIncomingsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3__1"
    // InternalChor4IntTxtDsl.g:4103:1: rule__AtomicInteraction__Group_3__1 : rule__AtomicInteraction__Group_3__1__Impl rule__AtomicInteraction__Group_3__2 ;
    public final void rule__AtomicInteraction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4107:1: ( rule__AtomicInteraction__Group_3__1__Impl rule__AtomicInteraction__Group_3__2 )
            // InternalChor4IntTxtDsl.g:4108:2: rule__AtomicInteraction__Group_3__1__Impl rule__AtomicInteraction__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__1"


    // $ANTLR start "rule__AtomicInteraction__Group_3__1__Impl"
    // InternalChor4IntTxtDsl.g:4115:1: rule__AtomicInteraction__Group_3__1__Impl : ( '(' ) ;
    public final void rule__AtomicInteraction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4119:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:4120:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:4120:1: ( '(' )
            // InternalChor4IntTxtDsl.g:4121:2: '('
            {
             before(grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__1__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3__2"
    // InternalChor4IntTxtDsl.g:4130:1: rule__AtomicInteraction__Group_3__2 : rule__AtomicInteraction__Group_3__2__Impl rule__AtomicInteraction__Group_3__3 ;
    public final void rule__AtomicInteraction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4134:1: ( rule__AtomicInteraction__Group_3__2__Impl rule__AtomicInteraction__Group_3__3 )
            // InternalChor4IntTxtDsl.g:4135:2: rule__AtomicInteraction__Group_3__2__Impl rule__AtomicInteraction__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__AtomicInteraction__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__2"


    // $ANTLR start "rule__AtomicInteraction__Group_3__2__Impl"
    // InternalChor4IntTxtDsl.g:4142:1: rule__AtomicInteraction__Group_3__2__Impl : ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) ) ;
    public final void rule__AtomicInteraction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4146:1: ( ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) ) )
            // InternalChor4IntTxtDsl.g:4147:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) )
            {
            // InternalChor4IntTxtDsl.g:4147:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) )
            // InternalChor4IntTxtDsl.g:4148:2: ( rule__AtomicInteraction__IncomingsAssignment_3_2 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsAssignment_3_2()); 
            // InternalChor4IntTxtDsl.g:4149:2: ( rule__AtomicInteraction__IncomingsAssignment_3_2 )
            // InternalChor4IntTxtDsl.g:4149:3: rule__AtomicInteraction__IncomingsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__IncomingsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getIncomingsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__2__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3__3"
    // InternalChor4IntTxtDsl.g:4157:1: rule__AtomicInteraction__Group_3__3 : rule__AtomicInteraction__Group_3__3__Impl rule__AtomicInteraction__Group_3__4 ;
    public final void rule__AtomicInteraction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4161:1: ( rule__AtomicInteraction__Group_3__3__Impl rule__AtomicInteraction__Group_3__4 )
            // InternalChor4IntTxtDsl.g:4162:2: rule__AtomicInteraction__Group_3__3__Impl rule__AtomicInteraction__Group_3__4
            {
            pushFollow(FOLLOW_18);
            rule__AtomicInteraction__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__3"


    // $ANTLR start "rule__AtomicInteraction__Group_3__3__Impl"
    // InternalChor4IntTxtDsl.g:4169:1: rule__AtomicInteraction__Group_3__3__Impl : ( ( rule__AtomicInteraction__Group_3_3__0 )* ) ;
    public final void rule__AtomicInteraction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4173:1: ( ( ( rule__AtomicInteraction__Group_3_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:4174:1: ( ( rule__AtomicInteraction__Group_3_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:4174:1: ( ( rule__AtomicInteraction__Group_3_3__0 )* )
            // InternalChor4IntTxtDsl.g:4175:2: ( rule__AtomicInteraction__Group_3_3__0 )*
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_3_3()); 
            // InternalChor4IntTxtDsl.g:4176:2: ( rule__AtomicInteraction__Group_3_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:4176:3: rule__AtomicInteraction__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AtomicInteraction__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAtomicInteractionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__3__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3__4"
    // InternalChor4IntTxtDsl.g:4184:1: rule__AtomicInteraction__Group_3__4 : rule__AtomicInteraction__Group_3__4__Impl ;
    public final void rule__AtomicInteraction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4188:1: ( rule__AtomicInteraction__Group_3__4__Impl )
            // InternalChor4IntTxtDsl.g:4189:2: rule__AtomicInteraction__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__4"


    // $ANTLR start "rule__AtomicInteraction__Group_3__4__Impl"
    // InternalChor4IntTxtDsl.g:4195:1: rule__AtomicInteraction__Group_3__4__Impl : ( ')' ) ;
    public final void rule__AtomicInteraction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4199:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:4200:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:4200:1: ( ')' )
            // InternalChor4IntTxtDsl.g:4201:2: ')'
            {
             before(grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3__4__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3_3__0"
    // InternalChor4IntTxtDsl.g:4211:1: rule__AtomicInteraction__Group_3_3__0 : rule__AtomicInteraction__Group_3_3__0__Impl rule__AtomicInteraction__Group_3_3__1 ;
    public final void rule__AtomicInteraction__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4215:1: ( rule__AtomicInteraction__Group_3_3__0__Impl rule__AtomicInteraction__Group_3_3__1 )
            // InternalChor4IntTxtDsl.g:4216:2: rule__AtomicInteraction__Group_3_3__0__Impl rule__AtomicInteraction__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3_3__0"


    // $ANTLR start "rule__AtomicInteraction__Group_3_3__0__Impl"
    // InternalChor4IntTxtDsl.g:4223:1: rule__AtomicInteraction__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicInteraction__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4227:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:4228:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:4228:1: ( ',' )
            // InternalChor4IntTxtDsl.g:4229:2: ','
            {
             before(grammarAccess.getAtomicInteractionAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3_3__0__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_3_3__1"
    // InternalChor4IntTxtDsl.g:4238:1: rule__AtomicInteraction__Group_3_3__1 : rule__AtomicInteraction__Group_3_3__1__Impl ;
    public final void rule__AtomicInteraction__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4242:1: ( rule__AtomicInteraction__Group_3_3__1__Impl )
            // InternalChor4IntTxtDsl.g:4243:2: rule__AtomicInteraction__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3_3__1"


    // $ANTLR start "rule__AtomicInteraction__Group_3_3__1__Impl"
    // InternalChor4IntTxtDsl.g:4249:1: rule__AtomicInteraction__Group_3_3__1__Impl : ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) ) ;
    public final void rule__AtomicInteraction__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4253:1: ( ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:4254:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4254:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) )
            // InternalChor4IntTxtDsl.g:4255:2: ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsAssignment_3_3_1()); 
            // InternalChor4IntTxtDsl.g:4256:2: ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 )
            // InternalChor4IntTxtDsl.g:4256:3: rule__AtomicInteraction__IncomingsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__IncomingsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getIncomingsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_3_3__1__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4__0"
    // InternalChor4IntTxtDsl.g:4265:1: rule__AtomicInteraction__Group_4__0 : rule__AtomicInteraction__Group_4__0__Impl rule__AtomicInteraction__Group_4__1 ;
    public final void rule__AtomicInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4269:1: ( rule__AtomicInteraction__Group_4__0__Impl rule__AtomicInteraction__Group_4__1 )
            // InternalChor4IntTxtDsl.g:4270:2: rule__AtomicInteraction__Group_4__0__Impl rule__AtomicInteraction__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__AtomicInteraction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__0"


    // $ANTLR start "rule__AtomicInteraction__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:4277:1: rule__AtomicInteraction__Group_4__0__Impl : ( 'outgoings' ) ;
    public final void rule__AtomicInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4281:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:4282:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:4282:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:4283:2: 'outgoings'
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__0__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4__1"
    // InternalChor4IntTxtDsl.g:4292:1: rule__AtomicInteraction__Group_4__1 : rule__AtomicInteraction__Group_4__1__Impl rule__AtomicInteraction__Group_4__2 ;
    public final void rule__AtomicInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4296:1: ( rule__AtomicInteraction__Group_4__1__Impl rule__AtomicInteraction__Group_4__2 )
            // InternalChor4IntTxtDsl.g:4297:2: rule__AtomicInteraction__Group_4__1__Impl rule__AtomicInteraction__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__1"


    // $ANTLR start "rule__AtomicInteraction__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:4304:1: rule__AtomicInteraction__Group_4__1__Impl : ( '(' ) ;
    public final void rule__AtomicInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4308:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:4309:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:4309:1: ( '(' )
            // InternalChor4IntTxtDsl.g:4310:2: '('
            {
             before(grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__1__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4__2"
    // InternalChor4IntTxtDsl.g:4319:1: rule__AtomicInteraction__Group_4__2 : rule__AtomicInteraction__Group_4__2__Impl rule__AtomicInteraction__Group_4__3 ;
    public final void rule__AtomicInteraction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4323:1: ( rule__AtomicInteraction__Group_4__2__Impl rule__AtomicInteraction__Group_4__3 )
            // InternalChor4IntTxtDsl.g:4324:2: rule__AtomicInteraction__Group_4__2__Impl rule__AtomicInteraction__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__AtomicInteraction__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__2"


    // $ANTLR start "rule__AtomicInteraction__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:4331:1: rule__AtomicInteraction__Group_4__2__Impl : ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) ) ;
    public final void rule__AtomicInteraction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4335:1: ( ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:4336:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:4336:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:4337:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_2 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:4338:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:4338:3: rule__AtomicInteraction__OutgoingsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__OutgoingsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__2__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4__3"
    // InternalChor4IntTxtDsl.g:4346:1: rule__AtomicInteraction__Group_4__3 : rule__AtomicInteraction__Group_4__3__Impl rule__AtomicInteraction__Group_4__4 ;
    public final void rule__AtomicInteraction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4350:1: ( rule__AtomicInteraction__Group_4__3__Impl rule__AtomicInteraction__Group_4__4 )
            // InternalChor4IntTxtDsl.g:4351:2: rule__AtomicInteraction__Group_4__3__Impl rule__AtomicInteraction__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__AtomicInteraction__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__3"


    // $ANTLR start "rule__AtomicInteraction__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:4358:1: rule__AtomicInteraction__Group_4__3__Impl : ( ( rule__AtomicInteraction__Group_4_3__0 )* ) ;
    public final void rule__AtomicInteraction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4362:1: ( ( ( rule__AtomicInteraction__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:4363:1: ( ( rule__AtomicInteraction__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:4363:1: ( ( rule__AtomicInteraction__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:4364:2: ( rule__AtomicInteraction__Group_4_3__0 )*
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:4365:2: ( rule__AtomicInteraction__Group_4_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:4365:3: rule__AtomicInteraction__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AtomicInteraction__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAtomicInteractionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__3__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4__4"
    // InternalChor4IntTxtDsl.g:4373:1: rule__AtomicInteraction__Group_4__4 : rule__AtomicInteraction__Group_4__4__Impl ;
    public final void rule__AtomicInteraction__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4377:1: ( rule__AtomicInteraction__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:4378:2: rule__AtomicInteraction__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__4"


    // $ANTLR start "rule__AtomicInteraction__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:4384:1: rule__AtomicInteraction__Group_4__4__Impl : ( ')' ) ;
    public final void rule__AtomicInteraction__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4388:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:4389:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:4389:1: ( ')' )
            // InternalChor4IntTxtDsl.g:4390:2: ')'
            {
             before(grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4__4__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:4400:1: rule__AtomicInteraction__Group_4_3__0 : rule__AtomicInteraction__Group_4_3__0__Impl rule__AtomicInteraction__Group_4_3__1 ;
    public final void rule__AtomicInteraction__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4404:1: ( rule__AtomicInteraction__Group_4_3__0__Impl rule__AtomicInteraction__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:4405:2: rule__AtomicInteraction__Group_4_3__0__Impl rule__AtomicInteraction__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4_3__0"


    // $ANTLR start "rule__AtomicInteraction__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:4412:1: rule__AtomicInteraction__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicInteraction__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4416:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:4417:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:4417:1: ( ',' )
            // InternalChor4IntTxtDsl.g:4418:2: ','
            {
             before(grammarAccess.getAtomicInteractionAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4_3__0__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:4427:1: rule__AtomicInteraction__Group_4_3__1 : rule__AtomicInteraction__Group_4_3__1__Impl ;
    public final void rule__AtomicInteraction__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4431:1: ( rule__AtomicInteraction__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:4432:2: rule__AtomicInteraction__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4_3__1"


    // $ANTLR start "rule__AtomicInteraction__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:4438:1: rule__AtomicInteraction__Group_4_3__1__Impl : ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) ) ;
    public final void rule__AtomicInteraction__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4442:1: ( ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:4443:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4443:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:4444:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:4445:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:4445:3: rule__AtomicInteraction__OutgoingsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__OutgoingsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_4_3__1__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_9__0"
    // InternalChor4IntTxtDsl.g:4454:1: rule__AtomicInteraction__Group_9__0 : rule__AtomicInteraction__Group_9__0__Impl rule__AtomicInteraction__Group_9__1 ;
    public final void rule__AtomicInteraction__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4458:1: ( rule__AtomicInteraction__Group_9__0__Impl rule__AtomicInteraction__Group_9__1 )
            // InternalChor4IntTxtDsl.g:4459:2: rule__AtomicInteraction__Group_9__0__Impl rule__AtomicInteraction__Group_9__1
            {
            pushFollow(FOLLOW_10);
            rule__AtomicInteraction__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_9__0"


    // $ANTLR start "rule__AtomicInteraction__Group_9__0__Impl"
    // InternalChor4IntTxtDsl.g:4466:1: rule__AtomicInteraction__Group_9__0__Impl : ( 'targetOperation' ) ;
    public final void rule__AtomicInteraction__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4470:1: ( ( 'targetOperation' ) )
            // InternalChor4IntTxtDsl.g:4471:1: ( 'targetOperation' )
            {
            // InternalChor4IntTxtDsl.g:4471:1: ( 'targetOperation' )
            // InternalChor4IntTxtDsl.g:4472:2: 'targetOperation'
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationKeyword_9_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAtomicInteractionAccess().getTargetOperationKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_9__0__Impl"


    // $ANTLR start "rule__AtomicInteraction__Group_9__1"
    // InternalChor4IntTxtDsl.g:4481:1: rule__AtomicInteraction__Group_9__1 : rule__AtomicInteraction__Group_9__1__Impl ;
    public final void rule__AtomicInteraction__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4485:1: ( rule__AtomicInteraction__Group_9__1__Impl )
            // InternalChor4IntTxtDsl.g:4486:2: rule__AtomicInteraction__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_9__1"


    // $ANTLR start "rule__AtomicInteraction__Group_9__1__Impl"
    // InternalChor4IntTxtDsl.g:4492:1: rule__AtomicInteraction__Group_9__1__Impl : ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) ) ;
    public final void rule__AtomicInteraction__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4496:1: ( ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) ) )
            // InternalChor4IntTxtDsl.g:4497:1: ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4497:1: ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) )
            // InternalChor4IntTxtDsl.g:4498:2: ( rule__AtomicInteraction__TargetOperationAssignment_9_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationAssignment_9_1()); 
            // InternalChor4IntTxtDsl.g:4499:2: ( rule__AtomicInteraction__TargetOperationAssignment_9_1 )
            // InternalChor4IntTxtDsl.g:4499:3: rule__AtomicInteraction__TargetOperationAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicInteraction__TargetOperationAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicInteractionAccess().getTargetOperationAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__Group_9__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalChor4IntTxtDsl.g:4508:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4512:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalChor4IntTxtDsl.g:4513:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:4520:1: rule__Operation__Group__0__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4524:1: ( ( 'Operation' ) )
            // InternalChor4IntTxtDsl.g:4525:1: ( 'Operation' )
            {
            // InternalChor4IntTxtDsl.g:4525:1: ( 'Operation' )
            // InternalChor4IntTxtDsl.g:4526:2: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalChor4IntTxtDsl.g:4535:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4539:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalChor4IntTxtDsl.g:4540:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:4547:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4551:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalChor4IntTxtDsl.g:4552:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4552:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalChor4IntTxtDsl.g:4553:2: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // InternalChor4IntTxtDsl.g:4554:2: ( rule__Operation__NameAssignment_1 )
            // InternalChor4IntTxtDsl.g:4554:3: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalChor4IntTxtDsl.g:4562:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4566:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalChor4IntTxtDsl.g:4567:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:4574:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4578:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:4579:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:4579:1: ( '{' )
            // InternalChor4IntTxtDsl.g:4580:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalChor4IntTxtDsl.g:4589:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4593:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalChor4IntTxtDsl.g:4594:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:4601:1: rule__Operation__Group__3__Impl : ( 'sideEffect' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4605:1: ( ( 'sideEffect' ) )
            // InternalChor4IntTxtDsl.g:4606:1: ( 'sideEffect' )
            {
            // InternalChor4IntTxtDsl.g:4606:1: ( 'sideEffect' )
            // InternalChor4IntTxtDsl.g:4607:2: 'sideEffect'
            {
             before(grammarAccess.getOperationAccess().getSideEffectKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getSideEffectKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalChor4IntTxtDsl.g:4616:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4620:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalChor4IntTxtDsl.g:4621:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:4628:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__SideEffectAssignment_4 ) ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4632:1: ( ( ( rule__Operation__SideEffectAssignment_4 ) ) )
            // InternalChor4IntTxtDsl.g:4633:1: ( ( rule__Operation__SideEffectAssignment_4 ) )
            {
            // InternalChor4IntTxtDsl.g:4633:1: ( ( rule__Operation__SideEffectAssignment_4 ) )
            // InternalChor4IntTxtDsl.g:4634:2: ( rule__Operation__SideEffectAssignment_4 )
            {
             before(grammarAccess.getOperationAccess().getSideEffectAssignment_4()); 
            // InternalChor4IntTxtDsl.g:4635:2: ( rule__Operation__SideEffectAssignment_4 )
            // InternalChor4IntTxtDsl.g:4635:3: rule__Operation__SideEffectAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Operation__SideEffectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getSideEffectAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalChor4IntTxtDsl.g:4643:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4647:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalChor4IntTxtDsl.g:4648:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:4655:1: rule__Operation__Group__5__Impl : ( 'invokingMsg' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4659:1: ( ( 'invokingMsg' ) )
            // InternalChor4IntTxtDsl.g:4660:1: ( 'invokingMsg' )
            {
            // InternalChor4IntTxtDsl.g:4660:1: ( 'invokingMsg' )
            // InternalChor4IntTxtDsl.g:4661:2: 'invokingMsg'
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getInvokingMsgKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalChor4IntTxtDsl.g:4670:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4674:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // InternalChor4IntTxtDsl.g:4675:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalChor4IntTxtDsl.g:4682:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__InvokingMsgAssignment_6 ) ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4686:1: ( ( ( rule__Operation__InvokingMsgAssignment_6 ) ) )
            // InternalChor4IntTxtDsl.g:4687:1: ( ( rule__Operation__InvokingMsgAssignment_6 ) )
            {
            // InternalChor4IntTxtDsl.g:4687:1: ( ( rule__Operation__InvokingMsgAssignment_6 ) )
            // InternalChor4IntTxtDsl.g:4688:2: ( rule__Operation__InvokingMsgAssignment_6 )
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgAssignment_6()); 
            // InternalChor4IntTxtDsl.g:4689:2: ( rule__Operation__InvokingMsgAssignment_6 )
            // InternalChor4IntTxtDsl.g:4689:3: rule__Operation__InvokingMsgAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Operation__InvokingMsgAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getInvokingMsgAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // InternalChor4IntTxtDsl.g:4697:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl rule__Operation__Group__8 ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4701:1: ( rule__Operation__Group__7__Impl rule__Operation__Group__8 )
            // InternalChor4IntTxtDsl.g:4702:2: rule__Operation__Group__7__Impl rule__Operation__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Operation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // InternalChor4IntTxtDsl.g:4709:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__Group_7__0 )? ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4713:1: ( ( ( rule__Operation__Group_7__0 )? ) )
            // InternalChor4IntTxtDsl.g:4714:1: ( ( rule__Operation__Group_7__0 )? )
            {
            // InternalChor4IntTxtDsl.g:4714:1: ( ( rule__Operation__Group_7__0 )? )
            // InternalChor4IntTxtDsl.g:4715:2: ( rule__Operation__Group_7__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_7()); 
            // InternalChor4IntTxtDsl.g:4716:2: ( rule__Operation__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:4716:3: rule__Operation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group__8"
    // InternalChor4IntTxtDsl.g:4724:1: rule__Operation__Group__8 : rule__Operation__Group__8__Impl ;
    public final void rule__Operation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4728:1: ( rule__Operation__Group__8__Impl )
            // InternalChor4IntTxtDsl.g:4729:2: rule__Operation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__8"


    // $ANTLR start "rule__Operation__Group__8__Impl"
    // InternalChor4IntTxtDsl.g:4735:1: rule__Operation__Group__8__Impl : ( '}' ) ;
    public final void rule__Operation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4739:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:4740:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:4740:1: ( '}' )
            // InternalChor4IntTxtDsl.g:4741:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__8__Impl"


    // $ANTLR start "rule__Operation__Group_7__0"
    // InternalChor4IntTxtDsl.g:4751:1: rule__Operation__Group_7__0 : rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 ;
    public final void rule__Operation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4755:1: ( rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 )
            // InternalChor4IntTxtDsl.g:4756:2: rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__0"


    // $ANTLR start "rule__Operation__Group_7__0__Impl"
    // InternalChor4IntTxtDsl.g:4763:1: rule__Operation__Group_7__0__Impl : ( 'answeringMsg' ) ;
    public final void rule__Operation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4767:1: ( ( 'answeringMsg' ) )
            // InternalChor4IntTxtDsl.g:4768:1: ( 'answeringMsg' )
            {
            // InternalChor4IntTxtDsl.g:4768:1: ( 'answeringMsg' )
            // InternalChor4IntTxtDsl.g:4769:2: 'answeringMsg'
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getAnsweringMsgKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__0__Impl"


    // $ANTLR start "rule__Operation__Group_7__1"
    // InternalChor4IntTxtDsl.g:4778:1: rule__Operation__Group_7__1 : rule__Operation__Group_7__1__Impl ;
    public final void rule__Operation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4782:1: ( rule__Operation__Group_7__1__Impl )
            // InternalChor4IntTxtDsl.g:4783:2: rule__Operation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__1"


    // $ANTLR start "rule__Operation__Group_7__1__Impl"
    // InternalChor4IntTxtDsl.g:4789:1: rule__Operation__Group_7__1__Impl : ( ( rule__Operation__AnsweringMsgAssignment_7_1 ) ) ;
    public final void rule__Operation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4793:1: ( ( ( rule__Operation__AnsweringMsgAssignment_7_1 ) ) )
            // InternalChor4IntTxtDsl.g:4794:1: ( ( rule__Operation__AnsweringMsgAssignment_7_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4794:1: ( ( rule__Operation__AnsweringMsgAssignment_7_1 ) )
            // InternalChor4IntTxtDsl.g:4795:2: ( rule__Operation__AnsweringMsgAssignment_7_1 )
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgAssignment_7_1()); 
            // InternalChor4IntTxtDsl.g:4796:2: ( rule__Operation__AnsweringMsgAssignment_7_1 )
            // InternalChor4IntTxtDsl.g:4796:3: rule__Operation__AnsweringMsgAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__AnsweringMsgAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAnsweringMsgAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalChor4IntTxtDsl.g:4805:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4809:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalChor4IntTxtDsl.g:4810:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:4817:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4821:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:4822:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:4822:1: ( () )
            // InternalChor4IntTxtDsl.g:4823:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalChor4IntTxtDsl.g:4824:2: ()
            // InternalChor4IntTxtDsl.g:4824:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalChor4IntTxtDsl.g:4832:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4836:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalChor4IntTxtDsl.g:4837:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:4844:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4848:1: ( ( 'Parameter' ) )
            // InternalChor4IntTxtDsl.g:4849:1: ( 'Parameter' )
            {
            // InternalChor4IntTxtDsl.g:4849:1: ( 'Parameter' )
            // InternalChor4IntTxtDsl.g:4850:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalChor4IntTxtDsl.g:4859:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4863:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalChor4IntTxtDsl.g:4864:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:4871:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4875:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:4876:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:4876:1: ( '{' )
            // InternalChor4IntTxtDsl.g:4877:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalChor4IntTxtDsl.g:4886:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4890:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalChor4IntTxtDsl.g:4891:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:4898:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4902:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // InternalChor4IntTxtDsl.g:4903:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // InternalChor4IntTxtDsl.g:4903:1: ( ( rule__Parameter__Group_3__0 )? )
            // InternalChor4IntTxtDsl.g:4904:2: ( rule__Parameter__Group_3__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_3()); 
            // InternalChor4IntTxtDsl.g:4905:2: ( rule__Parameter__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:4905:3: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalChor4IntTxtDsl.g:4913:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4917:1: ( rule__Parameter__Group__4__Impl )
            // InternalChor4IntTxtDsl.g:4918:2: rule__Parameter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:4924:1: rule__Parameter__Group__4__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4928:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:4929:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:4929:1: ( '}' )
            // InternalChor4IntTxtDsl.g:4930:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // InternalChor4IntTxtDsl.g:4940:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4944:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // InternalChor4IntTxtDsl.g:4945:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // InternalChor4IntTxtDsl.g:4952:1: rule__Parameter__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4956:1: ( ( 'type' ) )
            // InternalChor4IntTxtDsl.g:4957:1: ( 'type' )
            {
            // InternalChor4IntTxtDsl.g:4957:1: ( 'type' )
            // InternalChor4IntTxtDsl.g:4958:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // InternalChor4IntTxtDsl.g:4967:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4971:1: ( rule__Parameter__Group_3__1__Impl )
            // InternalChor4IntTxtDsl.g:4972:2: rule__Parameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // InternalChor4IntTxtDsl.g:4978:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__TypeAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4982:1: ( ( ( rule__Parameter__TypeAssignment_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:4983:1: ( ( rule__Parameter__TypeAssignment_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4983:1: ( ( rule__Parameter__TypeAssignment_3_1 ) )
            // InternalChor4IntTxtDsl.g:4984:2: ( rule__Parameter__TypeAssignment_3_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3_1()); 
            // InternalChor4IntTxtDsl.g:4985:2: ( rule__Parameter__TypeAssignment_3_1 )
            // InternalChor4IntTxtDsl.g:4985:3: rule__Parameter__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalChor4IntTxtDsl.g:4994:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4998:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalChor4IntTxtDsl.g:4999:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:5006:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5010:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:5011:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:5011:1: ( () )
            // InternalChor4IntTxtDsl.g:5012:2: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // InternalChor4IntTxtDsl.g:5013:2: ()
            // InternalChor4IntTxtDsl.g:5013:3: 
            {
            }

             after(grammarAccess.getServiceAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalChor4IntTxtDsl.g:5021:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5025:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalChor4IntTxtDsl.g:5026:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:5033:1: rule__Service__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5037:1: ( ( 'Service' ) )
            // InternalChor4IntTxtDsl.g:5038:1: ( 'Service' )
            {
            // InternalChor4IntTxtDsl.g:5038:1: ( 'Service' )
            // InternalChor4IntTxtDsl.g:5039:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalChor4IntTxtDsl.g:5048:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5052:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalChor4IntTxtDsl.g:5053:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:5060:1: rule__Service__Group__2__Impl : ( ( rule__Service__NameAssignment_2 ) ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5064:1: ( ( ( rule__Service__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:5065:1: ( ( rule__Service__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:5065:1: ( ( rule__Service__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:5066:2: ( rule__Service__NameAssignment_2 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:5067:2: ( rule__Service__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:5067:3: rule__Service__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalChor4IntTxtDsl.g:5075:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5079:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalChor4IntTxtDsl.g:5080:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalChor4IntTxtDsl.g:5087:1: rule__Service__Group__3__Impl : ( '{' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5091:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:5092:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:5092:1: ( '{' )
            // InternalChor4IntTxtDsl.g:5093:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalChor4IntTxtDsl.g:5102:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5106:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalChor4IntTxtDsl.g:5107:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalChor4IntTxtDsl.g:5114:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )? ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5118:1: ( ( ( rule__Service__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:5119:1: ( ( rule__Service__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:5119:1: ( ( rule__Service__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:5120:2: ( rule__Service__Group_4__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:5121:2: ( rule__Service__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:5121:3: rule__Service__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalChor4IntTxtDsl.g:5129:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5133:1: ( rule__Service__Group__5__Impl )
            // InternalChor4IntTxtDsl.g:5134:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalChor4IntTxtDsl.g:5140:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5144:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:5145:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:5145:1: ( '}' )
            // InternalChor4IntTxtDsl.g:5146:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // InternalChor4IntTxtDsl.g:5156:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5160:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // InternalChor4IntTxtDsl.g:5161:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // InternalChor4IntTxtDsl.g:5168:1: rule__Service__Group_4__0__Impl : ( 'operations' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5172:1: ( ( 'operations' ) )
            // InternalChor4IntTxtDsl.g:5173:1: ( 'operations' )
            {
            // InternalChor4IntTxtDsl.g:5173:1: ( 'operations' )
            // InternalChor4IntTxtDsl.g:5174:2: 'operations'
            {
             before(grammarAccess.getServiceAccess().getOperationsKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getOperationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // InternalChor4IntTxtDsl.g:5183:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl rule__Service__Group_4__2 ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5187:1: ( rule__Service__Group_4__1__Impl rule__Service__Group_4__2 )
            // InternalChor4IntTxtDsl.g:5188:2: rule__Service__Group_4__1__Impl rule__Service__Group_4__2
            {
            pushFollow(FOLLOW_34);
            rule__Service__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // InternalChor4IntTxtDsl.g:5195:1: rule__Service__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5199:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:5200:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:5200:1: ( '{' )
            // InternalChor4IntTxtDsl.g:5201:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__Service__Group_4__2"
    // InternalChor4IntTxtDsl.g:5210:1: rule__Service__Group_4__2 : rule__Service__Group_4__2__Impl rule__Service__Group_4__3 ;
    public final void rule__Service__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5214:1: ( rule__Service__Group_4__2__Impl rule__Service__Group_4__3 )
            // InternalChor4IntTxtDsl.g:5215:2: rule__Service__Group_4__2__Impl rule__Service__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__2"


    // $ANTLR start "rule__Service__Group_4__2__Impl"
    // InternalChor4IntTxtDsl.g:5222:1: rule__Service__Group_4__2__Impl : ( ( rule__Service__OperationsAssignment_4_2 ) ) ;
    public final void rule__Service__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5226:1: ( ( ( rule__Service__OperationsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:5227:1: ( ( rule__Service__OperationsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:5227:1: ( ( rule__Service__OperationsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:5228:2: ( rule__Service__OperationsAssignment_4_2 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:5229:2: ( rule__Service__OperationsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:5229:3: rule__Service__OperationsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__OperationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOperationsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__2__Impl"


    // $ANTLR start "rule__Service__Group_4__3"
    // InternalChor4IntTxtDsl.g:5237:1: rule__Service__Group_4__3 : rule__Service__Group_4__3__Impl rule__Service__Group_4__4 ;
    public final void rule__Service__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5241:1: ( rule__Service__Group_4__3__Impl rule__Service__Group_4__4 )
            // InternalChor4IntTxtDsl.g:5242:2: rule__Service__Group_4__3__Impl rule__Service__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__3"


    // $ANTLR start "rule__Service__Group_4__3__Impl"
    // InternalChor4IntTxtDsl.g:5249:1: rule__Service__Group_4__3__Impl : ( ( rule__Service__Group_4_3__0 )* ) ;
    public final void rule__Service__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5253:1: ( ( ( rule__Service__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:5254:1: ( ( rule__Service__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:5254:1: ( ( rule__Service__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:5255:2: ( rule__Service__Group_4_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:5256:2: ( rule__Service__Group_4_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==18) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:5256:3: rule__Service__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__3__Impl"


    // $ANTLR start "rule__Service__Group_4__4"
    // InternalChor4IntTxtDsl.g:5264:1: rule__Service__Group_4__4 : rule__Service__Group_4__4__Impl ;
    public final void rule__Service__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5268:1: ( rule__Service__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:5269:2: rule__Service__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__4"


    // $ANTLR start "rule__Service__Group_4__4__Impl"
    // InternalChor4IntTxtDsl.g:5275:1: rule__Service__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5279:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:5280:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:5280:1: ( '}' )
            // InternalChor4IntTxtDsl.g:5281:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__4__Impl"


    // $ANTLR start "rule__Service__Group_4_3__0"
    // InternalChor4IntTxtDsl.g:5291:1: rule__Service__Group_4_3__0 : rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 ;
    public final void rule__Service__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5295:1: ( rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:5296:2: rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Service__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_3__0"


    // $ANTLR start "rule__Service__Group_4_3__0__Impl"
    // InternalChor4IntTxtDsl.g:5303:1: rule__Service__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5307:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:5308:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:5308:1: ( ',' )
            // InternalChor4IntTxtDsl.g:5309:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_3__0__Impl"


    // $ANTLR start "rule__Service__Group_4_3__1"
    // InternalChor4IntTxtDsl.g:5318:1: rule__Service__Group_4_3__1 : rule__Service__Group_4_3__1__Impl ;
    public final void rule__Service__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5322:1: ( rule__Service__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:5323:2: rule__Service__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_3__1"


    // $ANTLR start "rule__Service__Group_4_3__1__Impl"
    // InternalChor4IntTxtDsl.g:5329:1: rule__Service__Group_4_3__1__Impl : ( ( rule__Service__OperationsAssignment_4_3_1 ) ) ;
    public final void rule__Service__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5333:1: ( ( ( rule__Service__OperationsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:5334:1: ( ( rule__Service__OperationsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:5334:1: ( ( rule__Service__OperationsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:5335:2: ( rule__Service__OperationsAssignment_4_3_1 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:5336:2: ( rule__Service__OperationsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:5336:3: rule__Service__OperationsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__OperationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOperationsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_3__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalChor4IntTxtDsl.g:5345:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5349:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalChor4IntTxtDsl.g:5350:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalChor4IntTxtDsl.g:5357:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5361:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:5362:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:5362:1: ( () )
            // InternalChor4IntTxtDsl.g:5363:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalChor4IntTxtDsl.g:5364:2: ()
            // InternalChor4IntTxtDsl.g:5364:3: 
            {
            }

             after(grammarAccess.getUserAccess().getUserAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalChor4IntTxtDsl.g:5372:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5376:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalChor4IntTxtDsl.g:5377:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalChor4IntTxtDsl.g:5384:1: rule__User__Group__1__Impl : ( 'User' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5388:1: ( ( 'User' ) )
            // InternalChor4IntTxtDsl.g:5389:1: ( 'User' )
            {
            // InternalChor4IntTxtDsl.g:5389:1: ( 'User' )
            // InternalChor4IntTxtDsl.g:5390:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // InternalChor4IntTxtDsl.g:5399:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5403:1: ( rule__User__Group__2__Impl )
            // InternalChor4IntTxtDsl.g:5404:2: rule__User__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // InternalChor4IntTxtDsl.g:5410:1: rule__User__Group__2__Impl : ( ( rule__User__NameAssignment_2 ) ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5414:1: ( ( ( rule__User__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:5415:1: ( ( rule__User__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:5415:1: ( ( rule__User__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:5416:2: ( rule__User__NameAssignment_2 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:5417:2: ( rule__User__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:5417:3: rule__User__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__Choreography__FlowElementsAssignment_3_2"
    // InternalChor4IntTxtDsl.g:5426:1: rule__Choreography__FlowElementsAssignment_3_2 : ( ruleFlowElement ) ;
    public final void rule__Choreography__FlowElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5430:1: ( ( ruleFlowElement ) )
            // InternalChor4IntTxtDsl.g:5431:2: ( ruleFlowElement )
            {
            // InternalChor4IntTxtDsl.g:5431:2: ( ruleFlowElement )
            // InternalChor4IntTxtDsl.g:5432:3: ruleFlowElement
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsFlowElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFlowElement();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getFlowElementsFlowElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__FlowElementsAssignment_3_2"


    // $ANTLR start "rule__Choreography__FlowElementsAssignment_3_3_1"
    // InternalChor4IntTxtDsl.g:5441:1: rule__Choreography__FlowElementsAssignment_3_3_1 : ( ruleFlowElement ) ;
    public final void rule__Choreography__FlowElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5445:1: ( ( ruleFlowElement ) )
            // InternalChor4IntTxtDsl.g:5446:2: ( ruleFlowElement )
            {
            // InternalChor4IntTxtDsl.g:5446:2: ( ruleFlowElement )
            // InternalChor4IntTxtDsl.g:5447:3: ruleFlowElement
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsFlowElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFlowElement();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getFlowElementsFlowElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__FlowElementsAssignment_3_3_1"


    // $ANTLR start "rule__Choreography__RolesAssignment_4_2"
    // InternalChor4IntTxtDsl.g:5456:1: rule__Choreography__RolesAssignment_4_2 : ( ruleRole ) ;
    public final void rule__Choreography__RolesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5460:1: ( ( ruleRole ) )
            // InternalChor4IntTxtDsl.g:5461:2: ( ruleRole )
            {
            // InternalChor4IntTxtDsl.g:5461:2: ( ruleRole )
            // InternalChor4IntTxtDsl.g:5462:3: ruleRole
            {
             before(grammarAccess.getChoreographyAccess().getRolesRoleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getRolesRoleParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__RolesAssignment_4_2"


    // $ANTLR start "rule__Choreography__RolesAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:5471:1: rule__Choreography__RolesAssignment_4_3_1 : ( ruleRole ) ;
    public final void rule__Choreography__RolesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5475:1: ( ( ruleRole ) )
            // InternalChor4IntTxtDsl.g:5476:2: ( ruleRole )
            {
            // InternalChor4IntTxtDsl.g:5476:2: ( ruleRole )
            // InternalChor4IntTxtDsl.g:5477:3: ruleRole
            {
             before(grammarAccess.getChoreographyAccess().getRolesRoleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getRolesRoleParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__RolesAssignment_4_3_1"


    // $ANTLR start "rule__Role__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:5486:1: rule__Role__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5490:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5491:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5491:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5492:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_2"


    // $ANTLR start "rule__Role__ActorAssignment_4_1"
    // InternalChor4IntTxtDsl.g:5501:1: rule__Role__ActorAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__ActorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5505:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5506:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5506:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5507:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getActorActorCrossReference_4_1_0()); 
            // InternalChor4IntTxtDsl.g:5508:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5509:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getActorActorEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getActorActorEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getActorActorCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__ActorAssignment_4_1"


    // $ANTLR start "rule__SequenceFlow__NameAssignment_1"
    // InternalChor4IntTxtDsl.g:5520:1: rule__SequenceFlow__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SequenceFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5524:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5525:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5525:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5526:3: ruleEString
            {
             before(grammarAccess.getSequenceFlowAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSequenceFlowAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__NameAssignment_1"


    // $ANTLR start "rule__SequenceFlow__TargetAssignment_4"
    // InternalChor4IntTxtDsl.g:5535:1: rule__SequenceFlow__TargetAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__SequenceFlow__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5539:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5540:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5540:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5541:3: ( ruleEString )
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeCrossReference_4_0()); 
            // InternalChor4IntTxtDsl.g:5542:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5543:4: ruleEString
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__TargetAssignment_4"


    // $ANTLR start "rule__SequenceFlow__SourceAssignment_6"
    // InternalChor4IntTxtDsl.g:5554:1: rule__SequenceFlow__SourceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__SequenceFlow__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5558:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5559:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5559:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5560:3: ( ruleEString )
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeCrossReference_6_0()); 
            // InternalChor4IntTxtDsl.g:5561:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5562:4: ruleEString
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceFlow__SourceAssignment_6"


    // $ANTLR start "rule__ExclusiveGateway__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:5573:1: rule__ExclusiveGateway__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExclusiveGateway__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5577:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5578:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5578:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5579:3: ruleEString
            {
             before(grammarAccess.getExclusiveGatewayAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExclusiveGatewayAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__NameAssignment_2"


    // $ANTLR start "rule__ExclusiveGateway__IncomingsAssignment_4_2"
    // InternalChor4IntTxtDsl.g:5588:1: rule__ExclusiveGateway__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5592:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5593:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5593:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5594:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5595:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5596:4: ruleEString
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__IncomingsAssignment_4_2"


    // $ANTLR start "rule__ExclusiveGateway__IncomingsAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:5607:1: rule__ExclusiveGateway__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5611:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5612:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5612:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5613:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5614:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5615:4: ruleEString
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__IncomingsAssignment_4_3_1"


    // $ANTLR start "rule__ExclusiveGateway__OutgoingsAssignment_5_2"
    // InternalChor4IntTxtDsl.g:5626:1: rule__ExclusiveGateway__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5630:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5631:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5631:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5632:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5633:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5634:4: ruleEString
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__OutgoingsAssignment_5_2"


    // $ANTLR start "rule__ExclusiveGateway__OutgoingsAssignment_5_3_1"
    // InternalChor4IntTxtDsl.g:5645:1: rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5649:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5650:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5650:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5651:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5652:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5653:4: ruleEString
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveGateway__OutgoingsAssignment_5_3_1"


    // $ANTLR start "rule__ParallelGateway__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:5664:1: rule__ParallelGateway__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParallelGateway__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5668:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5669:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5669:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5670:3: ruleEString
            {
             before(grammarAccess.getParallelGatewayAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParallelGatewayAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__NameAssignment_2"


    // $ANTLR start "rule__ParallelGateway__IncomingsAssignment_4_2"
    // InternalChor4IntTxtDsl.g:5679:1: rule__ParallelGateway__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5683:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5684:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5684:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5685:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5686:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5687:4: ruleEString
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__IncomingsAssignment_4_2"


    // $ANTLR start "rule__ParallelGateway__IncomingsAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:5698:1: rule__ParallelGateway__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5702:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5703:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5703:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5704:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5705:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5706:4: ruleEString
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__IncomingsAssignment_4_3_1"


    // $ANTLR start "rule__ParallelGateway__OutgoingsAssignment_5_2"
    // InternalChor4IntTxtDsl.g:5717:1: rule__ParallelGateway__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5721:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5722:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5722:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5723:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5724:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5725:4: ruleEString
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__OutgoingsAssignment_5_2"


    // $ANTLR start "rule__ParallelGateway__OutgoingsAssignment_5_3_1"
    // InternalChor4IntTxtDsl.g:5736:1: rule__ParallelGateway__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5740:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5741:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5741:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5742:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5743:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5744:4: ruleEString
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelGateway__OutgoingsAssignment_5_3_1"


    // $ANTLR start "rule__StartEvent__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:5755:1: rule__StartEvent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StartEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5759:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5760:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5760:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5761:3: ruleEString
            {
             before(grammarAccess.getStartEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartEventAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__NameAssignment_2"


    // $ANTLR start "rule__StartEvent__IncomingsAssignment_4_2"
    // InternalChor4IntTxtDsl.g:5770:1: rule__StartEvent__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5774:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5775:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5775:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5776:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5777:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5778:4: ruleEString
            {
             before(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__IncomingsAssignment_4_2"


    // $ANTLR start "rule__StartEvent__IncomingsAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:5789:1: rule__StartEvent__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5793:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5794:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5794:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5795:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5796:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5797:4: ruleEString
            {
             before(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__IncomingsAssignment_4_3_1"


    // $ANTLR start "rule__StartEvent__OutgoingsAssignment_5_2"
    // InternalChor4IntTxtDsl.g:5808:1: rule__StartEvent__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5812:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5813:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5813:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5814:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5815:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5816:4: ruleEString
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__OutgoingsAssignment_5_2"


    // $ANTLR start "rule__StartEvent__OutgoingsAssignment_5_3_1"
    // InternalChor4IntTxtDsl.g:5827:1: rule__StartEvent__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5831:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5832:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5832:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5833:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5834:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5835:4: ruleEString
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEvent__OutgoingsAssignment_5_3_1"


    // $ANTLR start "rule__EndEvent__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:5846:1: rule__EndEvent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EndEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5850:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5851:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5851:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5852:3: ruleEString
            {
             before(grammarAccess.getEndEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndEventAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__NameAssignment_2"


    // $ANTLR start "rule__EndEvent__IncomingsAssignment_4_2"
    // InternalChor4IntTxtDsl.g:5861:1: rule__EndEvent__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5865:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5866:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5866:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5867:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5868:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5869:4: ruleEString
            {
             before(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__IncomingsAssignment_4_2"


    // $ANTLR start "rule__EndEvent__IncomingsAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:5880:1: rule__EndEvent__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5884:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5885:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5885:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5886:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5887:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5888:4: ruleEString
            {
             before(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__IncomingsAssignment_4_3_1"


    // $ANTLR start "rule__EndEvent__OutgoingsAssignment_5_2"
    // InternalChor4IntTxtDsl.g:5899:1: rule__EndEvent__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5903:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5904:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5904:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5905:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5906:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5907:4: ruleEString
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__OutgoingsAssignment_5_2"


    // $ANTLR start "rule__EndEvent__OutgoingsAssignment_5_3_1"
    // InternalChor4IntTxtDsl.g:5918:1: rule__EndEvent__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5922:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5923:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5923:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5924:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5925:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5926:4: ruleEString
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndEvent__OutgoingsAssignment_5_3_1"


    // $ANTLR start "rule__AtomicInteraction__NameAssignment_1"
    // InternalChor4IntTxtDsl.g:5937:1: rule__AtomicInteraction__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AtomicInteraction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5941:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5942:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5942:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5943:3: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__NameAssignment_1"


    // $ANTLR start "rule__AtomicInteraction__IncomingsAssignment_3_2"
    // InternalChor4IntTxtDsl.g:5952:1: rule__AtomicInteraction__IncomingsAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__IncomingsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5956:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5957:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5957:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5958:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_2_0()); 
            // InternalChor4IntTxtDsl.g:5959:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5960:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__IncomingsAssignment_3_2"


    // $ANTLR start "rule__AtomicInteraction__IncomingsAssignment_3_3_1"
    // InternalChor4IntTxtDsl.g:5971:1: rule__AtomicInteraction__IncomingsAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__IncomingsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5975:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5976:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5976:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5977:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5978:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5979:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__IncomingsAssignment_3_3_1"


    // $ANTLR start "rule__AtomicInteraction__OutgoingsAssignment_4_2"
    // InternalChor4IntTxtDsl.g:5990:1: rule__AtomicInteraction__OutgoingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__OutgoingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5994:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5995:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5995:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5996:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5997:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5998:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__OutgoingsAssignment_4_2"


    // $ANTLR start "rule__AtomicInteraction__OutgoingsAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:6009:1: rule__AtomicInteraction__OutgoingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__OutgoingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6013:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:6014:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:6014:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6015:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:6016:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6017:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__OutgoingsAssignment_4_3_1"


    // $ANTLR start "rule__AtomicInteraction__SenderAssignment_6"
    // InternalChor4IntTxtDsl.g:6028:1: rule__AtomicInteraction__SenderAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__SenderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6032:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:6033:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:6033:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6034:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderRoleCrossReference_6_0()); 
            // InternalChor4IntTxtDsl.g:6035:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6036:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderRoleEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getSenderRoleEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getSenderRoleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__SenderAssignment_6"


    // $ANTLR start "rule__AtomicInteraction__ReceiverAssignment_8"
    // InternalChor4IntTxtDsl.g:6047:1: rule__AtomicInteraction__ReceiverAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__ReceiverAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6051:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:6052:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:6052:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6053:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverRoleCrossReference_8_0()); 
            // InternalChor4IntTxtDsl.g:6054:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6055:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverRoleEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getReceiverRoleEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getReceiverRoleCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__ReceiverAssignment_8"


    // $ANTLR start "rule__AtomicInteraction__TargetOperationAssignment_9_1"
    // InternalChor4IntTxtDsl.g:6066:1: rule__AtomicInteraction__TargetOperationAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__TargetOperationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6070:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:6071:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:6071:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6072:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationCrossReference_9_1_0()); 
            // InternalChor4IntTxtDsl.g:6073:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6074:4: ruleEString
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicInteraction__TargetOperationAssignment_9_1"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // InternalChor4IntTxtDsl.g:6085:1: rule__Operation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6089:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6090:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:6090:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6091:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__SideEffectAssignment_4"
    // InternalChor4IntTxtDsl.g:6100:1: rule__Operation__SideEffectAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__Operation__SideEffectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6104:1: ( ( ruleEBoolean ) )
            // InternalChor4IntTxtDsl.g:6105:2: ( ruleEBoolean )
            {
            // InternalChor4IntTxtDsl.g:6105:2: ( ruleEBoolean )
            // InternalChor4IntTxtDsl.g:6106:3: ruleEBoolean
            {
             before(grammarAccess.getOperationAccess().getSideEffectEBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getSideEffectEBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__SideEffectAssignment_4"


    // $ANTLR start "rule__Operation__InvokingMsgAssignment_6"
    // InternalChor4IntTxtDsl.g:6115:1: rule__Operation__InvokingMsgAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Operation__InvokingMsgAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6119:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:6120:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:6120:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6121:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgMessageCrossReference_6_0()); 
            // InternalChor4IntTxtDsl.g:6122:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6123:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgMessageEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getInvokingMsgMessageEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getInvokingMsgMessageCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__InvokingMsgAssignment_6"


    // $ANTLR start "rule__Operation__AnsweringMsgAssignment_7_1"
    // InternalChor4IntTxtDsl.g:6134:1: rule__Operation__AnsweringMsgAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__AnsweringMsgAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6138:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:6139:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:6139:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6140:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgMessageCrossReference_7_1_0()); 
            // InternalChor4IntTxtDsl.g:6141:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6142:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgMessageEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getAnsweringMsgMessageEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getAnsweringMsgMessageCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__AnsweringMsgAssignment_7_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_3_1"
    // InternalChor4IntTxtDsl.g:6153:1: rule__Parameter__TypeAssignment_3_1 : ( ruleEJavaObject ) ;
    public final void rule__Parameter__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6157:1: ( ( ruleEJavaObject ) )
            // InternalChor4IntTxtDsl.g:6158:2: ( ruleEJavaObject )
            {
            // InternalChor4IntTxtDsl.g:6158:2: ( ruleEJavaObject )
            // InternalChor4IntTxtDsl.g:6159:3: ruleEJavaObject
            {
             before(grammarAccess.getParameterAccess().getTypeEJavaObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEJavaObject();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeEJavaObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_3_1"


    // $ANTLR start "rule__Service__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:6168:1: rule__Service__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6172:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6173:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:6173:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6174:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_2"


    // $ANTLR start "rule__Service__OperationsAssignment_4_2"
    // InternalChor4IntTxtDsl.g:6183:1: rule__Service__OperationsAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6187:1: ( ( ruleOperation ) )
            // InternalChor4IntTxtDsl.g:6188:2: ( ruleOperation )
            {
            // InternalChor4IntTxtDsl.g:6188:2: ( ruleOperation )
            // InternalChor4IntTxtDsl.g:6189:3: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__OperationsAssignment_4_2"


    // $ANTLR start "rule__Service__OperationsAssignment_4_3_1"
    // InternalChor4IntTxtDsl.g:6198:1: rule__Service__OperationsAssignment_4_3_1 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6202:1: ( ( ruleOperation ) )
            // InternalChor4IntTxtDsl.g:6203:2: ( ruleOperation )
            {
            // InternalChor4IntTxtDsl.g:6203:2: ( ruleOperation )
            // InternalChor4IntTxtDsl.g:6204:3: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__OperationsAssignment_4_3_1"


    // $ANTLR start "rule__User__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:6213:1: rule__User__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__User__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:6217:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:6218:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:6218:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:6219:3: ruleEString
            {
             before(grammarAccess.getUserAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003C2400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});

}