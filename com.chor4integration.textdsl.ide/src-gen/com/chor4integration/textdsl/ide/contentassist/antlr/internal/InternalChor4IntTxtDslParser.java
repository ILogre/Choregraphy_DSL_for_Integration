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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EJavaObject'", "'true'", "'false'", "'Choreography'", "'{'", "'}'", "'flowElements'", "','", "'SequenceFlow'", "'target'", "'source'", "'ExclusiveGateway'", "'incomings'", "'('", "')'", "'outgoings'", "'ParallelGateway'", "'StartEvent'", "'EndEvent'", "'AtomicInteraction'", "'sender'", "'receiver'", "'targetOperation'", "'Service'", "'operations'", "'User'", "'Operation'", "'sideEffect'", "'invokingMsg'", "'args'", "'answeringMsg'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleEString"
    // InternalChor4IntTxtDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:104:1: ( ruleEString EOF )
            // InternalChor4IntTxtDsl.g:105:1: ruleEString EOF
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
    // InternalChor4IntTxtDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalChor4IntTxtDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalChor4IntTxtDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalChor4IntTxtDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalChor4IntTxtDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalChor4IntTxtDsl.g:119:4: rule__EString__Alternatives
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
    // InternalChor4IntTxtDsl.g:128:1: entryRuleSequenceFlow : ruleSequenceFlow EOF ;
    public final void entryRuleSequenceFlow() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:129:1: ( ruleSequenceFlow EOF )
            // InternalChor4IntTxtDsl.g:130:1: ruleSequenceFlow EOF
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
    // InternalChor4IntTxtDsl.g:137:1: ruleSequenceFlow : ( ( rule__SequenceFlow__Group__0 ) ) ;
    public final void ruleSequenceFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:141:2: ( ( ( rule__SequenceFlow__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:142:2: ( ( rule__SequenceFlow__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:142:2: ( ( rule__SequenceFlow__Group__0 ) )
            // InternalChor4IntTxtDsl.g:143:3: ( rule__SequenceFlow__Group__0 )
            {
             before(grammarAccess.getSequenceFlowAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:144:3: ( rule__SequenceFlow__Group__0 )
            // InternalChor4IntTxtDsl.g:144:4: rule__SequenceFlow__Group__0
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
    // InternalChor4IntTxtDsl.g:153:1: entryRuleExclusiveGateway : ruleExclusiveGateway EOF ;
    public final void entryRuleExclusiveGateway() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:154:1: ( ruleExclusiveGateway EOF )
            // InternalChor4IntTxtDsl.g:155:1: ruleExclusiveGateway EOF
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
    // InternalChor4IntTxtDsl.g:162:1: ruleExclusiveGateway : ( ( rule__ExclusiveGateway__Group__0 ) ) ;
    public final void ruleExclusiveGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:166:2: ( ( ( rule__ExclusiveGateway__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:167:2: ( ( rule__ExclusiveGateway__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:167:2: ( ( rule__ExclusiveGateway__Group__0 ) )
            // InternalChor4IntTxtDsl.g:168:3: ( rule__ExclusiveGateway__Group__0 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:169:3: ( rule__ExclusiveGateway__Group__0 )
            // InternalChor4IntTxtDsl.g:169:4: rule__ExclusiveGateway__Group__0
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
    // InternalChor4IntTxtDsl.g:178:1: entryRuleParallelGateway : ruleParallelGateway EOF ;
    public final void entryRuleParallelGateway() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:179:1: ( ruleParallelGateway EOF )
            // InternalChor4IntTxtDsl.g:180:1: ruleParallelGateway EOF
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
    // InternalChor4IntTxtDsl.g:187:1: ruleParallelGateway : ( ( rule__ParallelGateway__Group__0 ) ) ;
    public final void ruleParallelGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:191:2: ( ( ( rule__ParallelGateway__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:192:2: ( ( rule__ParallelGateway__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:192:2: ( ( rule__ParallelGateway__Group__0 ) )
            // InternalChor4IntTxtDsl.g:193:3: ( rule__ParallelGateway__Group__0 )
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:194:3: ( rule__ParallelGateway__Group__0 )
            // InternalChor4IntTxtDsl.g:194:4: rule__ParallelGateway__Group__0
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
    // InternalChor4IntTxtDsl.g:203:1: entryRuleStartEvent : ruleStartEvent EOF ;
    public final void entryRuleStartEvent() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:204:1: ( ruleStartEvent EOF )
            // InternalChor4IntTxtDsl.g:205:1: ruleStartEvent EOF
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
    // InternalChor4IntTxtDsl.g:212:1: ruleStartEvent : ( ( rule__StartEvent__Group__0 ) ) ;
    public final void ruleStartEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:216:2: ( ( ( rule__StartEvent__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:217:2: ( ( rule__StartEvent__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:217:2: ( ( rule__StartEvent__Group__0 ) )
            // InternalChor4IntTxtDsl.g:218:3: ( rule__StartEvent__Group__0 )
            {
             before(grammarAccess.getStartEventAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:219:3: ( rule__StartEvent__Group__0 )
            // InternalChor4IntTxtDsl.g:219:4: rule__StartEvent__Group__0
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
    // InternalChor4IntTxtDsl.g:228:1: entryRuleEndEvent : ruleEndEvent EOF ;
    public final void entryRuleEndEvent() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:229:1: ( ruleEndEvent EOF )
            // InternalChor4IntTxtDsl.g:230:1: ruleEndEvent EOF
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
    // InternalChor4IntTxtDsl.g:237:1: ruleEndEvent : ( ( rule__EndEvent__Group__0 ) ) ;
    public final void ruleEndEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:241:2: ( ( ( rule__EndEvent__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:242:2: ( ( rule__EndEvent__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:242:2: ( ( rule__EndEvent__Group__0 ) )
            // InternalChor4IntTxtDsl.g:243:3: ( rule__EndEvent__Group__0 )
            {
             before(grammarAccess.getEndEventAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:244:3: ( rule__EndEvent__Group__0 )
            // InternalChor4IntTxtDsl.g:244:4: rule__EndEvent__Group__0
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
    // InternalChor4IntTxtDsl.g:253:1: entryRuleAtomicInteraction : ruleAtomicInteraction EOF ;
    public final void entryRuleAtomicInteraction() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:254:1: ( ruleAtomicInteraction EOF )
            // InternalChor4IntTxtDsl.g:255:1: ruleAtomicInteraction EOF
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
    // InternalChor4IntTxtDsl.g:262:1: ruleAtomicInteraction : ( ( rule__AtomicInteraction__Group__0 ) ) ;
    public final void ruleAtomicInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:266:2: ( ( ( rule__AtomicInteraction__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:267:2: ( ( rule__AtomicInteraction__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:267:2: ( ( rule__AtomicInteraction__Group__0 ) )
            // InternalChor4IntTxtDsl.g:268:3: ( rule__AtomicInteraction__Group__0 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:269:3: ( rule__AtomicInteraction__Group__0 )
            // InternalChor4IntTxtDsl.g:269:4: rule__AtomicInteraction__Group__0
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


    // $ANTLR start "entryRuleService"
    // InternalChor4IntTxtDsl.g:278:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:279:1: ( ruleService EOF )
            // InternalChor4IntTxtDsl.g:280:1: ruleService EOF
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
    // InternalChor4IntTxtDsl.g:287:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:291:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:292:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:292:2: ( ( rule__Service__Group__0 ) )
            // InternalChor4IntTxtDsl.g:293:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:294:3: ( rule__Service__Group__0 )
            // InternalChor4IntTxtDsl.g:294:4: rule__Service__Group__0
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
    // InternalChor4IntTxtDsl.g:303:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:304:1: ( ruleUser EOF )
            // InternalChor4IntTxtDsl.g:305:1: ruleUser EOF
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
    // InternalChor4IntTxtDsl.g:312:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:316:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:317:2: ( ( rule__User__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:317:2: ( ( rule__User__Group__0 ) )
            // InternalChor4IntTxtDsl.g:318:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:319:3: ( rule__User__Group__0 )
            // InternalChor4IntTxtDsl.g:319:4: rule__User__Group__0
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


    // $ANTLR start "entryRuleOperation"
    // InternalChor4IntTxtDsl.g:328:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:329:1: ( ruleOperation EOF )
            // InternalChor4IntTxtDsl.g:330:1: ruleOperation EOF
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
    // InternalChor4IntTxtDsl.g:337:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:341:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalChor4IntTxtDsl.g:342:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalChor4IntTxtDsl.g:342:2: ( ( rule__Operation__Group__0 ) )
            // InternalChor4IntTxtDsl.g:343:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalChor4IntTxtDsl.g:344:3: ( rule__Operation__Group__0 )
            // InternalChor4IntTxtDsl.g:344:4: rule__Operation__Group__0
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


    // $ANTLR start "entryRuleEJavaObject"
    // InternalChor4IntTxtDsl.g:353:1: entryRuleEJavaObject : ruleEJavaObject EOF ;
    public final void entryRuleEJavaObject() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:354:1: ( ruleEJavaObject EOF )
            // InternalChor4IntTxtDsl.g:355:1: ruleEJavaObject EOF
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
    // InternalChor4IntTxtDsl.g:362:1: ruleEJavaObject : ( 'EJavaObject' ) ;
    public final void ruleEJavaObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:366:2: ( ( 'EJavaObject' ) )
            // InternalChor4IntTxtDsl.g:367:2: ( 'EJavaObject' )
            {
            // InternalChor4IntTxtDsl.g:367:2: ( 'EJavaObject' )
            // InternalChor4IntTxtDsl.g:368:3: 'EJavaObject'
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalChor4IntTxtDsl.g:378:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalChor4IntTxtDsl.g:379:1: ( ruleEBoolean EOF )
            // InternalChor4IntTxtDsl.g:380:1: ruleEBoolean EOF
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
    // InternalChor4IntTxtDsl.g:387:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:391:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalChor4IntTxtDsl.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalChor4IntTxtDsl.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalChor4IntTxtDsl.g:393:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalChor4IntTxtDsl.g:394:3: ( rule__EBoolean__Alternatives )
            // InternalChor4IntTxtDsl.g:394:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "rule__FlowElement__Alternatives"
    // InternalChor4IntTxtDsl.g:402:1: rule__FlowElement__Alternatives : ( ( ruleSequenceFlow ) | ( ruleExclusiveGateway ) | ( ruleParallelGateway ) | ( ruleStartEvent ) | ( ruleEndEvent ) | ( ruleAtomicInteraction ) );
    public final void rule__FlowElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:406:1: ( ( ruleSequenceFlow ) | ( ruleExclusiveGateway ) | ( ruleParallelGateway ) | ( ruleStartEvent ) | ( ruleEndEvent ) | ( ruleAtomicInteraction ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 29:
                {
                alt1=5;
                }
                break;
            case 30:
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
                    // InternalChor4IntTxtDsl.g:407:2: ( ruleSequenceFlow )
                    {
                    // InternalChor4IntTxtDsl.g:407:2: ( ruleSequenceFlow )
                    // InternalChor4IntTxtDsl.g:408:3: ruleSequenceFlow
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
                    // InternalChor4IntTxtDsl.g:413:2: ( ruleExclusiveGateway )
                    {
                    // InternalChor4IntTxtDsl.g:413:2: ( ruleExclusiveGateway )
                    // InternalChor4IntTxtDsl.g:414:3: ruleExclusiveGateway
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
                    // InternalChor4IntTxtDsl.g:419:2: ( ruleParallelGateway )
                    {
                    // InternalChor4IntTxtDsl.g:419:2: ( ruleParallelGateway )
                    // InternalChor4IntTxtDsl.g:420:3: ruleParallelGateway
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
                    // InternalChor4IntTxtDsl.g:425:2: ( ruleStartEvent )
                    {
                    // InternalChor4IntTxtDsl.g:425:2: ( ruleStartEvent )
                    // InternalChor4IntTxtDsl.g:426:3: ruleStartEvent
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
                    // InternalChor4IntTxtDsl.g:431:2: ( ruleEndEvent )
                    {
                    // InternalChor4IntTxtDsl.g:431:2: ( ruleEndEvent )
                    // InternalChor4IntTxtDsl.g:432:3: ruleEndEvent
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
                    // InternalChor4IntTxtDsl.g:437:2: ( ruleAtomicInteraction )
                    {
                    // InternalChor4IntTxtDsl.g:437:2: ( ruleAtomicInteraction )
                    // InternalChor4IntTxtDsl.g:438:3: ruleAtomicInteraction
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
    // InternalChor4IntTxtDsl.g:447:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:451:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalChor4IntTxtDsl.g:452:2: ( RULE_STRING )
                    {
                    // InternalChor4IntTxtDsl.g:452:2: ( RULE_STRING )
                    // InternalChor4IntTxtDsl.g:453:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:458:2: ( RULE_ID )
                    {
                    // InternalChor4IntTxtDsl.g:458:2: ( RULE_ID )
                    // InternalChor4IntTxtDsl.g:459:3: RULE_ID
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
    // InternalChor4IntTxtDsl.g:468:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:472:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalChor4IntTxtDsl.g:473:2: ( 'true' )
                    {
                    // InternalChor4IntTxtDsl.g:473:2: ( 'true' )
                    // InternalChor4IntTxtDsl.g:474:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:479:2: ( 'false' )
                    {
                    // InternalChor4IntTxtDsl.g:479:2: ( 'false' )
                    // InternalChor4IntTxtDsl.g:480:3: 'false'
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
    // InternalChor4IntTxtDsl.g:489:1: rule__Choreography__Group__0 : rule__Choreography__Group__0__Impl rule__Choreography__Group__1 ;
    public final void rule__Choreography__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:493:1: ( rule__Choreography__Group__0__Impl rule__Choreography__Group__1 )
            // InternalChor4IntTxtDsl.g:494:2: rule__Choreography__Group__0__Impl rule__Choreography__Group__1
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
    // InternalChor4IntTxtDsl.g:501:1: rule__Choreography__Group__0__Impl : ( () ) ;
    public final void rule__Choreography__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:505:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:506:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:506:1: ( () )
            // InternalChor4IntTxtDsl.g:507:2: ()
            {
             before(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); 
            // InternalChor4IntTxtDsl.g:508:2: ()
            // InternalChor4IntTxtDsl.g:508:3: 
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
    // InternalChor4IntTxtDsl.g:516:1: rule__Choreography__Group__1 : rule__Choreography__Group__1__Impl rule__Choreography__Group__2 ;
    public final void rule__Choreography__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:520:1: ( rule__Choreography__Group__1__Impl rule__Choreography__Group__2 )
            // InternalChor4IntTxtDsl.g:521:2: rule__Choreography__Group__1__Impl rule__Choreography__Group__2
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
    // InternalChor4IntTxtDsl.g:528:1: rule__Choreography__Group__1__Impl : ( 'Choreography' ) ;
    public final void rule__Choreography__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:532:1: ( ( 'Choreography' ) )
            // InternalChor4IntTxtDsl.g:533:1: ( 'Choreography' )
            {
            // InternalChor4IntTxtDsl.g:533:1: ( 'Choreography' )
            // InternalChor4IntTxtDsl.g:534:2: 'Choreography'
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
    // InternalChor4IntTxtDsl.g:543:1: rule__Choreography__Group__2 : rule__Choreography__Group__2__Impl rule__Choreography__Group__3 ;
    public final void rule__Choreography__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:547:1: ( rule__Choreography__Group__2__Impl rule__Choreography__Group__3 )
            // InternalChor4IntTxtDsl.g:548:2: rule__Choreography__Group__2__Impl rule__Choreography__Group__3
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
    // InternalChor4IntTxtDsl.g:555:1: rule__Choreography__Group__2__Impl : ( '{' ) ;
    public final void rule__Choreography__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:559:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:560:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:560:1: ( '{' )
            // InternalChor4IntTxtDsl.g:561:2: '{'
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
    // InternalChor4IntTxtDsl.g:570:1: rule__Choreography__Group__3 : rule__Choreography__Group__3__Impl rule__Choreography__Group__4 ;
    public final void rule__Choreography__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:574:1: ( rule__Choreography__Group__3__Impl rule__Choreography__Group__4 )
            // InternalChor4IntTxtDsl.g:575:2: rule__Choreography__Group__3__Impl rule__Choreography__Group__4
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
    // InternalChor4IntTxtDsl.g:582:1: rule__Choreography__Group__3__Impl : ( ( rule__Choreography__Group_3__0 )? ) ;
    public final void rule__Choreography__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:586:1: ( ( ( rule__Choreography__Group_3__0 )? ) )
            // InternalChor4IntTxtDsl.g:587:1: ( ( rule__Choreography__Group_3__0 )? )
            {
            // InternalChor4IntTxtDsl.g:587:1: ( ( rule__Choreography__Group_3__0 )? )
            // InternalChor4IntTxtDsl.g:588:2: ( rule__Choreography__Group_3__0 )?
            {
             before(grammarAccess.getChoreographyAccess().getGroup_3()); 
            // InternalChor4IntTxtDsl.g:589:2: ( rule__Choreography__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:589:3: rule__Choreography__Group_3__0
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
    // InternalChor4IntTxtDsl.g:597:1: rule__Choreography__Group__4 : rule__Choreography__Group__4__Impl ;
    public final void rule__Choreography__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:601:1: ( rule__Choreography__Group__4__Impl )
            // InternalChor4IntTxtDsl.g:602:2: rule__Choreography__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalChor4IntTxtDsl.g:608:1: rule__Choreography__Group__4__Impl : ( '}' ) ;
    public final void rule__Choreography__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:612:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:613:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:613:1: ( '}' )
            // InternalChor4IntTxtDsl.g:614:2: '}'
            {
             before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choreography__Group_3__0"
    // InternalChor4IntTxtDsl.g:624:1: rule__Choreography__Group_3__0 : rule__Choreography__Group_3__0__Impl rule__Choreography__Group_3__1 ;
    public final void rule__Choreography__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:628:1: ( rule__Choreography__Group_3__0__Impl rule__Choreography__Group_3__1 )
            // InternalChor4IntTxtDsl.g:629:2: rule__Choreography__Group_3__0__Impl rule__Choreography__Group_3__1
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
    // InternalChor4IntTxtDsl.g:636:1: rule__Choreography__Group_3__0__Impl : ( 'flowElements' ) ;
    public final void rule__Choreography__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:640:1: ( ( 'flowElements' ) )
            // InternalChor4IntTxtDsl.g:641:1: ( 'flowElements' )
            {
            // InternalChor4IntTxtDsl.g:641:1: ( 'flowElements' )
            // InternalChor4IntTxtDsl.g:642:2: 'flowElements'
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
    // InternalChor4IntTxtDsl.g:651:1: rule__Choreography__Group_3__1 : rule__Choreography__Group_3__1__Impl rule__Choreography__Group_3__2 ;
    public final void rule__Choreography__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:655:1: ( rule__Choreography__Group_3__1__Impl rule__Choreography__Group_3__2 )
            // InternalChor4IntTxtDsl.g:656:2: rule__Choreography__Group_3__1__Impl rule__Choreography__Group_3__2
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
    // InternalChor4IntTxtDsl.g:663:1: rule__Choreography__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Choreography__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:667:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:668:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:668:1: ( '{' )
            // InternalChor4IntTxtDsl.g:669:2: '{'
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
    // InternalChor4IntTxtDsl.g:678:1: rule__Choreography__Group_3__2 : rule__Choreography__Group_3__2__Impl rule__Choreography__Group_3__3 ;
    public final void rule__Choreography__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:682:1: ( rule__Choreography__Group_3__2__Impl rule__Choreography__Group_3__3 )
            // InternalChor4IntTxtDsl.g:683:2: rule__Choreography__Group_3__2__Impl rule__Choreography__Group_3__3
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
    // InternalChor4IntTxtDsl.g:690:1: rule__Choreography__Group_3__2__Impl : ( ( rule__Choreography__FlowElementsAssignment_3_2 ) ) ;
    public final void rule__Choreography__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:694:1: ( ( ( rule__Choreography__FlowElementsAssignment_3_2 ) ) )
            // InternalChor4IntTxtDsl.g:695:1: ( ( rule__Choreography__FlowElementsAssignment_3_2 ) )
            {
            // InternalChor4IntTxtDsl.g:695:1: ( ( rule__Choreography__FlowElementsAssignment_3_2 ) )
            // InternalChor4IntTxtDsl.g:696:2: ( rule__Choreography__FlowElementsAssignment_3_2 )
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsAssignment_3_2()); 
            // InternalChor4IntTxtDsl.g:697:2: ( rule__Choreography__FlowElementsAssignment_3_2 )
            // InternalChor4IntTxtDsl.g:697:3: rule__Choreography__FlowElementsAssignment_3_2
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
    // InternalChor4IntTxtDsl.g:705:1: rule__Choreography__Group_3__3 : rule__Choreography__Group_3__3__Impl rule__Choreography__Group_3__4 ;
    public final void rule__Choreography__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:709:1: ( rule__Choreography__Group_3__3__Impl rule__Choreography__Group_3__4 )
            // InternalChor4IntTxtDsl.g:710:2: rule__Choreography__Group_3__3__Impl rule__Choreography__Group_3__4
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
    // InternalChor4IntTxtDsl.g:717:1: rule__Choreography__Group_3__3__Impl : ( ( rule__Choreography__Group_3_3__0 )* ) ;
    public final void rule__Choreography__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:721:1: ( ( ( rule__Choreography__Group_3_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:722:1: ( ( rule__Choreography__Group_3_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:722:1: ( ( rule__Choreography__Group_3_3__0 )* )
            // InternalChor4IntTxtDsl.g:723:2: ( rule__Choreography__Group_3_3__0 )*
            {
             before(grammarAccess.getChoreographyAccess().getGroup_3_3()); 
            // InternalChor4IntTxtDsl.g:724:2: ( rule__Choreography__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:724:3: rule__Choreography__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Choreography__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalChor4IntTxtDsl.g:732:1: rule__Choreography__Group_3__4 : rule__Choreography__Group_3__4__Impl ;
    public final void rule__Choreography__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:736:1: ( rule__Choreography__Group_3__4__Impl )
            // InternalChor4IntTxtDsl.g:737:2: rule__Choreography__Group_3__4__Impl
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
    // InternalChor4IntTxtDsl.g:743:1: rule__Choreography__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Choreography__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:747:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:748:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:748:1: ( '}' )
            // InternalChor4IntTxtDsl.g:749:2: '}'
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
    // InternalChor4IntTxtDsl.g:759:1: rule__Choreography__Group_3_3__0 : rule__Choreography__Group_3_3__0__Impl rule__Choreography__Group_3_3__1 ;
    public final void rule__Choreography__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:763:1: ( rule__Choreography__Group_3_3__0__Impl rule__Choreography__Group_3_3__1 )
            // InternalChor4IntTxtDsl.g:764:2: rule__Choreography__Group_3_3__0__Impl rule__Choreography__Group_3_3__1
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
    // InternalChor4IntTxtDsl.g:771:1: rule__Choreography__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Choreography__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:775:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:776:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:776:1: ( ',' )
            // InternalChor4IntTxtDsl.g:777:2: ','
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
    // InternalChor4IntTxtDsl.g:786:1: rule__Choreography__Group_3_3__1 : rule__Choreography__Group_3_3__1__Impl ;
    public final void rule__Choreography__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:790:1: ( rule__Choreography__Group_3_3__1__Impl )
            // InternalChor4IntTxtDsl.g:791:2: rule__Choreography__Group_3_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:797:1: rule__Choreography__Group_3_3__1__Impl : ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) ) ;
    public final void rule__Choreography__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:801:1: ( ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:802:1: ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:802:1: ( ( rule__Choreography__FlowElementsAssignment_3_3_1 ) )
            // InternalChor4IntTxtDsl.g:803:2: ( rule__Choreography__FlowElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getChoreographyAccess().getFlowElementsAssignment_3_3_1()); 
            // InternalChor4IntTxtDsl.g:804:2: ( rule__Choreography__FlowElementsAssignment_3_3_1 )
            // InternalChor4IntTxtDsl.g:804:3: rule__Choreography__FlowElementsAssignment_3_3_1
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


    // $ANTLR start "rule__SequenceFlow__Group__0"
    // InternalChor4IntTxtDsl.g:813:1: rule__SequenceFlow__Group__0 : rule__SequenceFlow__Group__0__Impl rule__SequenceFlow__Group__1 ;
    public final void rule__SequenceFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:817:1: ( rule__SequenceFlow__Group__0__Impl rule__SequenceFlow__Group__1 )
            // InternalChor4IntTxtDsl.g:818:2: rule__SequenceFlow__Group__0__Impl rule__SequenceFlow__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:825:1: rule__SequenceFlow__Group__0__Impl : ( 'SequenceFlow' ) ;
    public final void rule__SequenceFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:829:1: ( ( 'SequenceFlow' ) )
            // InternalChor4IntTxtDsl.g:830:1: ( 'SequenceFlow' )
            {
            // InternalChor4IntTxtDsl.g:830:1: ( 'SequenceFlow' )
            // InternalChor4IntTxtDsl.g:831:2: 'SequenceFlow'
            {
             before(grammarAccess.getSequenceFlowAccess().getSequenceFlowKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:840:1: rule__SequenceFlow__Group__1 : rule__SequenceFlow__Group__1__Impl rule__SequenceFlow__Group__2 ;
    public final void rule__SequenceFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:844:1: ( rule__SequenceFlow__Group__1__Impl rule__SequenceFlow__Group__2 )
            // InternalChor4IntTxtDsl.g:845:2: rule__SequenceFlow__Group__1__Impl rule__SequenceFlow__Group__2
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
    // InternalChor4IntTxtDsl.g:852:1: rule__SequenceFlow__Group__1__Impl : ( ( rule__SequenceFlow__NameAssignment_1 ) ) ;
    public final void rule__SequenceFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:856:1: ( ( ( rule__SequenceFlow__NameAssignment_1 ) ) )
            // InternalChor4IntTxtDsl.g:857:1: ( ( rule__SequenceFlow__NameAssignment_1 ) )
            {
            // InternalChor4IntTxtDsl.g:857:1: ( ( rule__SequenceFlow__NameAssignment_1 ) )
            // InternalChor4IntTxtDsl.g:858:2: ( rule__SequenceFlow__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceFlowAccess().getNameAssignment_1()); 
            // InternalChor4IntTxtDsl.g:859:2: ( rule__SequenceFlow__NameAssignment_1 )
            // InternalChor4IntTxtDsl.g:859:3: rule__SequenceFlow__NameAssignment_1
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
    // InternalChor4IntTxtDsl.g:867:1: rule__SequenceFlow__Group__2 : rule__SequenceFlow__Group__2__Impl rule__SequenceFlow__Group__3 ;
    public final void rule__SequenceFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:871:1: ( rule__SequenceFlow__Group__2__Impl rule__SequenceFlow__Group__3 )
            // InternalChor4IntTxtDsl.g:872:2: rule__SequenceFlow__Group__2__Impl rule__SequenceFlow__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalChor4IntTxtDsl.g:879:1: rule__SequenceFlow__Group__2__Impl : ( '{' ) ;
    public final void rule__SequenceFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:883:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:884:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:884:1: ( '{' )
            // InternalChor4IntTxtDsl.g:885:2: '{'
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
    // InternalChor4IntTxtDsl.g:894:1: rule__SequenceFlow__Group__3 : rule__SequenceFlow__Group__3__Impl rule__SequenceFlow__Group__4 ;
    public final void rule__SequenceFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:898:1: ( rule__SequenceFlow__Group__3__Impl rule__SequenceFlow__Group__4 )
            // InternalChor4IntTxtDsl.g:899:2: rule__SequenceFlow__Group__3__Impl rule__SequenceFlow__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:906:1: rule__SequenceFlow__Group__3__Impl : ( 'target' ) ;
    public final void rule__SequenceFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:910:1: ( ( 'target' ) )
            // InternalChor4IntTxtDsl.g:911:1: ( 'target' )
            {
            // InternalChor4IntTxtDsl.g:911:1: ( 'target' )
            // InternalChor4IntTxtDsl.g:912:2: 'target'
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:921:1: rule__SequenceFlow__Group__4 : rule__SequenceFlow__Group__4__Impl rule__SequenceFlow__Group__5 ;
    public final void rule__SequenceFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:925:1: ( rule__SequenceFlow__Group__4__Impl rule__SequenceFlow__Group__5 )
            // InternalChor4IntTxtDsl.g:926:2: rule__SequenceFlow__Group__4__Impl rule__SequenceFlow__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalChor4IntTxtDsl.g:933:1: rule__SequenceFlow__Group__4__Impl : ( ( rule__SequenceFlow__TargetAssignment_4 ) ) ;
    public final void rule__SequenceFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:937:1: ( ( ( rule__SequenceFlow__TargetAssignment_4 ) ) )
            // InternalChor4IntTxtDsl.g:938:1: ( ( rule__SequenceFlow__TargetAssignment_4 ) )
            {
            // InternalChor4IntTxtDsl.g:938:1: ( ( rule__SequenceFlow__TargetAssignment_4 ) )
            // InternalChor4IntTxtDsl.g:939:2: ( rule__SequenceFlow__TargetAssignment_4 )
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetAssignment_4()); 
            // InternalChor4IntTxtDsl.g:940:2: ( rule__SequenceFlow__TargetAssignment_4 )
            // InternalChor4IntTxtDsl.g:940:3: rule__SequenceFlow__TargetAssignment_4
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
    // InternalChor4IntTxtDsl.g:948:1: rule__SequenceFlow__Group__5 : rule__SequenceFlow__Group__5__Impl rule__SequenceFlow__Group__6 ;
    public final void rule__SequenceFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:952:1: ( rule__SequenceFlow__Group__5__Impl rule__SequenceFlow__Group__6 )
            // InternalChor4IntTxtDsl.g:953:2: rule__SequenceFlow__Group__5__Impl rule__SequenceFlow__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:960:1: rule__SequenceFlow__Group__5__Impl : ( 'source' ) ;
    public final void rule__SequenceFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:964:1: ( ( 'source' ) )
            // InternalChor4IntTxtDsl.g:965:1: ( 'source' )
            {
            // InternalChor4IntTxtDsl.g:965:1: ( 'source' )
            // InternalChor4IntTxtDsl.g:966:2: 'source'
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:975:1: rule__SequenceFlow__Group__6 : rule__SequenceFlow__Group__6__Impl rule__SequenceFlow__Group__7 ;
    public final void rule__SequenceFlow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:979:1: ( rule__SequenceFlow__Group__6__Impl rule__SequenceFlow__Group__7 )
            // InternalChor4IntTxtDsl.g:980:2: rule__SequenceFlow__Group__6__Impl rule__SequenceFlow__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalChor4IntTxtDsl.g:987:1: rule__SequenceFlow__Group__6__Impl : ( ( rule__SequenceFlow__SourceAssignment_6 ) ) ;
    public final void rule__SequenceFlow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:991:1: ( ( ( rule__SequenceFlow__SourceAssignment_6 ) ) )
            // InternalChor4IntTxtDsl.g:992:1: ( ( rule__SequenceFlow__SourceAssignment_6 ) )
            {
            // InternalChor4IntTxtDsl.g:992:1: ( ( rule__SequenceFlow__SourceAssignment_6 ) )
            // InternalChor4IntTxtDsl.g:993:2: ( rule__SequenceFlow__SourceAssignment_6 )
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceAssignment_6()); 
            // InternalChor4IntTxtDsl.g:994:2: ( rule__SequenceFlow__SourceAssignment_6 )
            // InternalChor4IntTxtDsl.g:994:3: rule__SequenceFlow__SourceAssignment_6
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
    // InternalChor4IntTxtDsl.g:1002:1: rule__SequenceFlow__Group__7 : rule__SequenceFlow__Group__7__Impl ;
    public final void rule__SequenceFlow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1006:1: ( rule__SequenceFlow__Group__7__Impl )
            // InternalChor4IntTxtDsl.g:1007:2: rule__SequenceFlow__Group__7__Impl
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
    // InternalChor4IntTxtDsl.g:1013:1: rule__SequenceFlow__Group__7__Impl : ( '}' ) ;
    public final void rule__SequenceFlow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1017:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1018:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1018:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1019:2: '}'
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
    // InternalChor4IntTxtDsl.g:1029:1: rule__ExclusiveGateway__Group__0 : rule__ExclusiveGateway__Group__0__Impl rule__ExclusiveGateway__Group__1 ;
    public final void rule__ExclusiveGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1033:1: ( rule__ExclusiveGateway__Group__0__Impl rule__ExclusiveGateway__Group__1 )
            // InternalChor4IntTxtDsl.g:1034:2: rule__ExclusiveGateway__Group__0__Impl rule__ExclusiveGateway__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalChor4IntTxtDsl.g:1041:1: rule__ExclusiveGateway__Group__0__Impl : ( () ) ;
    public final void rule__ExclusiveGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1045:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:1046:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:1046:1: ( () )
            // InternalChor4IntTxtDsl.g:1047:2: ()
            {
             before(grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayAction_0()); 
            // InternalChor4IntTxtDsl.g:1048:2: ()
            // InternalChor4IntTxtDsl.g:1048:3: 
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
    // InternalChor4IntTxtDsl.g:1056:1: rule__ExclusiveGateway__Group__1 : rule__ExclusiveGateway__Group__1__Impl rule__ExclusiveGateway__Group__2 ;
    public final void rule__ExclusiveGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1060:1: ( rule__ExclusiveGateway__Group__1__Impl rule__ExclusiveGateway__Group__2 )
            // InternalChor4IntTxtDsl.g:1061:2: rule__ExclusiveGateway__Group__1__Impl rule__ExclusiveGateway__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1068:1: rule__ExclusiveGateway__Group__1__Impl : ( 'ExclusiveGateway' ) ;
    public final void rule__ExclusiveGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1072:1: ( ( 'ExclusiveGateway' ) )
            // InternalChor4IntTxtDsl.g:1073:1: ( 'ExclusiveGateway' )
            {
            // InternalChor4IntTxtDsl.g:1073:1: ( 'ExclusiveGateway' )
            // InternalChor4IntTxtDsl.g:1074:2: 'ExclusiveGateway'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1083:1: rule__ExclusiveGateway__Group__2 : rule__ExclusiveGateway__Group__2__Impl rule__ExclusiveGateway__Group__3 ;
    public final void rule__ExclusiveGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1087:1: ( rule__ExclusiveGateway__Group__2__Impl rule__ExclusiveGateway__Group__3 )
            // InternalChor4IntTxtDsl.g:1088:2: rule__ExclusiveGateway__Group__2__Impl rule__ExclusiveGateway__Group__3
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
    // InternalChor4IntTxtDsl.g:1095:1: rule__ExclusiveGateway__Group__2__Impl : ( ( rule__ExclusiveGateway__NameAssignment_2 ) ) ;
    public final void rule__ExclusiveGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1099:1: ( ( ( rule__ExclusiveGateway__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:1100:1: ( ( rule__ExclusiveGateway__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1100:1: ( ( rule__ExclusiveGateway__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:1101:2: ( rule__ExclusiveGateway__NameAssignment_2 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:1102:2: ( rule__ExclusiveGateway__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:1102:3: rule__ExclusiveGateway__NameAssignment_2
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
    // InternalChor4IntTxtDsl.g:1110:1: rule__ExclusiveGateway__Group__3 : rule__ExclusiveGateway__Group__3__Impl rule__ExclusiveGateway__Group__4 ;
    public final void rule__ExclusiveGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1114:1: ( rule__ExclusiveGateway__Group__3__Impl rule__ExclusiveGateway__Group__4 )
            // InternalChor4IntTxtDsl.g:1115:2: rule__ExclusiveGateway__Group__3__Impl rule__ExclusiveGateway__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:1122:1: rule__ExclusiveGateway__Group__3__Impl : ( '{' ) ;
    public final void rule__ExclusiveGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1126:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:1127:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:1127:1: ( '{' )
            // InternalChor4IntTxtDsl.g:1128:2: '{'
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
    // InternalChor4IntTxtDsl.g:1137:1: rule__ExclusiveGateway__Group__4 : rule__ExclusiveGateway__Group__4__Impl rule__ExclusiveGateway__Group__5 ;
    public final void rule__ExclusiveGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1141:1: ( rule__ExclusiveGateway__Group__4__Impl rule__ExclusiveGateway__Group__5 )
            // InternalChor4IntTxtDsl.g:1142:2: rule__ExclusiveGateway__Group__4__Impl rule__ExclusiveGateway__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:1149:1: rule__ExclusiveGateway__Group__4__Impl : ( ( rule__ExclusiveGateway__Group_4__0 )? ) ;
    public final void rule__ExclusiveGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1153:1: ( ( ( rule__ExclusiveGateway__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:1154:1: ( ( rule__ExclusiveGateway__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1154:1: ( ( rule__ExclusiveGateway__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:1155:2: ( rule__ExclusiveGateway__Group_4__0 )?
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:1156:2: ( rule__ExclusiveGateway__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1156:3: rule__ExclusiveGateway__Group_4__0
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
    // InternalChor4IntTxtDsl.g:1164:1: rule__ExclusiveGateway__Group__5 : rule__ExclusiveGateway__Group__5__Impl rule__ExclusiveGateway__Group__6 ;
    public final void rule__ExclusiveGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1168:1: ( rule__ExclusiveGateway__Group__5__Impl rule__ExclusiveGateway__Group__6 )
            // InternalChor4IntTxtDsl.g:1169:2: rule__ExclusiveGateway__Group__5__Impl rule__ExclusiveGateway__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:1176:1: rule__ExclusiveGateway__Group__5__Impl : ( ( rule__ExclusiveGateway__Group_5__0 )? ) ;
    public final void rule__ExclusiveGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1180:1: ( ( ( rule__ExclusiveGateway__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:1181:1: ( ( rule__ExclusiveGateway__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1181:1: ( ( rule__ExclusiveGateway__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:1182:2: ( rule__ExclusiveGateway__Group_5__0 )?
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:1183:2: ( rule__ExclusiveGateway__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1183:3: rule__ExclusiveGateway__Group_5__0
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
    // InternalChor4IntTxtDsl.g:1191:1: rule__ExclusiveGateway__Group__6 : rule__ExclusiveGateway__Group__6__Impl ;
    public final void rule__ExclusiveGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1195:1: ( rule__ExclusiveGateway__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:1196:2: rule__ExclusiveGateway__Group__6__Impl
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
    // InternalChor4IntTxtDsl.g:1202:1: rule__ExclusiveGateway__Group__6__Impl : ( '}' ) ;
    public final void rule__ExclusiveGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1206:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1207:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1207:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1208:2: '}'
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
    // InternalChor4IntTxtDsl.g:1218:1: rule__ExclusiveGateway__Group_4__0 : rule__ExclusiveGateway__Group_4__0__Impl rule__ExclusiveGateway__Group_4__1 ;
    public final void rule__ExclusiveGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1222:1: ( rule__ExclusiveGateway__Group_4__0__Impl rule__ExclusiveGateway__Group_4__1 )
            // InternalChor4IntTxtDsl.g:1223:2: rule__ExclusiveGateway__Group_4__0__Impl rule__ExclusiveGateway__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:1230:1: rule__ExclusiveGateway__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__ExclusiveGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1234:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:1235:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:1235:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:1236:2: 'incomings'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1245:1: rule__ExclusiveGateway__Group_4__1 : rule__ExclusiveGateway__Group_4__1__Impl rule__ExclusiveGateway__Group_4__2 ;
    public final void rule__ExclusiveGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1249:1: ( rule__ExclusiveGateway__Group_4__1__Impl rule__ExclusiveGateway__Group_4__2 )
            // InternalChor4IntTxtDsl.g:1250:2: rule__ExclusiveGateway__Group_4__1__Impl rule__ExclusiveGateway__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1257:1: rule__ExclusiveGateway__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ExclusiveGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1261:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:1262:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:1262:1: ( '(' )
            // InternalChor4IntTxtDsl.g:1263:2: '('
            {
             before(grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1272:1: rule__ExclusiveGateway__Group_4__2 : rule__ExclusiveGateway__Group_4__2__Impl rule__ExclusiveGateway__Group_4__3 ;
    public final void rule__ExclusiveGateway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1276:1: ( rule__ExclusiveGateway__Group_4__2__Impl rule__ExclusiveGateway__Group_4__3 )
            // InternalChor4IntTxtDsl.g:1277:2: rule__ExclusiveGateway__Group_4__2__Impl rule__ExclusiveGateway__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:1284:1: rule__ExclusiveGateway__Group_4__2__Impl : ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) ) ;
    public final void rule__ExclusiveGateway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1288:1: ( ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:1289:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1289:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:1290:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:1291:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:1291:3: rule__ExclusiveGateway__IncomingsAssignment_4_2
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
    // InternalChor4IntTxtDsl.g:1299:1: rule__ExclusiveGateway__Group_4__3 : rule__ExclusiveGateway__Group_4__3__Impl rule__ExclusiveGateway__Group_4__4 ;
    public final void rule__ExclusiveGateway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1303:1: ( rule__ExclusiveGateway__Group_4__3__Impl rule__ExclusiveGateway__Group_4__4 )
            // InternalChor4IntTxtDsl.g:1304:2: rule__ExclusiveGateway__Group_4__3__Impl rule__ExclusiveGateway__Group_4__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:1311:1: rule__ExclusiveGateway__Group_4__3__Impl : ( ( rule__ExclusiveGateway__Group_4_3__0 )* ) ;
    public final void rule__ExclusiveGateway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1315:1: ( ( ( rule__ExclusiveGateway__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:1316:1: ( ( rule__ExclusiveGateway__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:1316:1: ( ( rule__ExclusiveGateway__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:1317:2: ( rule__ExclusiveGateway__Group_4_3__0 )*
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:1318:2: ( rule__ExclusiveGateway__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:1318:3: rule__ExclusiveGateway__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExclusiveGateway__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalChor4IntTxtDsl.g:1326:1: rule__ExclusiveGateway__Group_4__4 : rule__ExclusiveGateway__Group_4__4__Impl ;
    public final void rule__ExclusiveGateway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1330:1: ( rule__ExclusiveGateway__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:1331:2: rule__ExclusiveGateway__Group_4__4__Impl
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
    // InternalChor4IntTxtDsl.g:1337:1: rule__ExclusiveGateway__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ExclusiveGateway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1341:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:1342:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:1342:1: ( ')' )
            // InternalChor4IntTxtDsl.g:1343:2: ')'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1353:1: rule__ExclusiveGateway__Group_4_3__0 : rule__ExclusiveGateway__Group_4_3__0__Impl rule__ExclusiveGateway__Group_4_3__1 ;
    public final void rule__ExclusiveGateway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1357:1: ( rule__ExclusiveGateway__Group_4_3__0__Impl rule__ExclusiveGateway__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:1358:2: rule__ExclusiveGateway__Group_4_3__0__Impl rule__ExclusiveGateway__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1365:1: rule__ExclusiveGateway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ExclusiveGateway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1369:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:1370:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:1370:1: ( ',' )
            // InternalChor4IntTxtDsl.g:1371:2: ','
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
    // InternalChor4IntTxtDsl.g:1380:1: rule__ExclusiveGateway__Group_4_3__1 : rule__ExclusiveGateway__Group_4_3__1__Impl ;
    public final void rule__ExclusiveGateway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1384:1: ( rule__ExclusiveGateway__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:1385:2: rule__ExclusiveGateway__Group_4_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:1391:1: rule__ExclusiveGateway__Group_4_3__1__Impl : ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__ExclusiveGateway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1395:1: ( ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:1396:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1396:1: ( ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:1397:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:1398:2: ( rule__ExclusiveGateway__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:1398:3: rule__ExclusiveGateway__IncomingsAssignment_4_3_1
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
    // InternalChor4IntTxtDsl.g:1407:1: rule__ExclusiveGateway__Group_5__0 : rule__ExclusiveGateway__Group_5__0__Impl rule__ExclusiveGateway__Group_5__1 ;
    public final void rule__ExclusiveGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1411:1: ( rule__ExclusiveGateway__Group_5__0__Impl rule__ExclusiveGateway__Group_5__1 )
            // InternalChor4IntTxtDsl.g:1412:2: rule__ExclusiveGateway__Group_5__0__Impl rule__ExclusiveGateway__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:1419:1: rule__ExclusiveGateway__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__ExclusiveGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1423:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:1424:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:1424:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:1425:2: 'outgoings'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1434:1: rule__ExclusiveGateway__Group_5__1 : rule__ExclusiveGateway__Group_5__1__Impl rule__ExclusiveGateway__Group_5__2 ;
    public final void rule__ExclusiveGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1438:1: ( rule__ExclusiveGateway__Group_5__1__Impl rule__ExclusiveGateway__Group_5__2 )
            // InternalChor4IntTxtDsl.g:1439:2: rule__ExclusiveGateway__Group_5__1__Impl rule__ExclusiveGateway__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1446:1: rule__ExclusiveGateway__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ExclusiveGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1450:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:1451:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:1451:1: ( '(' )
            // InternalChor4IntTxtDsl.g:1452:2: '('
            {
             before(grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1461:1: rule__ExclusiveGateway__Group_5__2 : rule__ExclusiveGateway__Group_5__2__Impl rule__ExclusiveGateway__Group_5__3 ;
    public final void rule__ExclusiveGateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1465:1: ( rule__ExclusiveGateway__Group_5__2__Impl rule__ExclusiveGateway__Group_5__3 )
            // InternalChor4IntTxtDsl.g:1466:2: rule__ExclusiveGateway__Group_5__2__Impl rule__ExclusiveGateway__Group_5__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:1473:1: rule__ExclusiveGateway__Group_5__2__Impl : ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__ExclusiveGateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1477:1: ( ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:1478:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1478:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:1479:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:1480:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:1480:3: rule__ExclusiveGateway__OutgoingsAssignment_5_2
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
    // InternalChor4IntTxtDsl.g:1488:1: rule__ExclusiveGateway__Group_5__3 : rule__ExclusiveGateway__Group_5__3__Impl rule__ExclusiveGateway__Group_5__4 ;
    public final void rule__ExclusiveGateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1492:1: ( rule__ExclusiveGateway__Group_5__3__Impl rule__ExclusiveGateway__Group_5__4 )
            // InternalChor4IntTxtDsl.g:1493:2: rule__ExclusiveGateway__Group_5__3__Impl rule__ExclusiveGateway__Group_5__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:1500:1: rule__ExclusiveGateway__Group_5__3__Impl : ( ( rule__ExclusiveGateway__Group_5_3__0 )* ) ;
    public final void rule__ExclusiveGateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1504:1: ( ( ( rule__ExclusiveGateway__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:1505:1: ( ( rule__ExclusiveGateway__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:1505:1: ( ( rule__ExclusiveGateway__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:1506:2: ( rule__ExclusiveGateway__Group_5_3__0 )*
            {
             before(grammarAccess.getExclusiveGatewayAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:1507:2: ( rule__ExclusiveGateway__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:1507:3: rule__ExclusiveGateway__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExclusiveGateway__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalChor4IntTxtDsl.g:1515:1: rule__ExclusiveGateway__Group_5__4 : rule__ExclusiveGateway__Group_5__4__Impl ;
    public final void rule__ExclusiveGateway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1519:1: ( rule__ExclusiveGateway__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:1520:2: rule__ExclusiveGateway__Group_5__4__Impl
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
    // InternalChor4IntTxtDsl.g:1526:1: rule__ExclusiveGateway__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ExclusiveGateway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1530:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:1531:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:1531:1: ( ')' )
            // InternalChor4IntTxtDsl.g:1532:2: ')'
            {
             before(grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1542:1: rule__ExclusiveGateway__Group_5_3__0 : rule__ExclusiveGateway__Group_5_3__0__Impl rule__ExclusiveGateway__Group_5_3__1 ;
    public final void rule__ExclusiveGateway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1546:1: ( rule__ExclusiveGateway__Group_5_3__0__Impl rule__ExclusiveGateway__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:1547:2: rule__ExclusiveGateway__Group_5_3__0__Impl rule__ExclusiveGateway__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1554:1: rule__ExclusiveGateway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ExclusiveGateway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1558:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:1559:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:1559:1: ( ',' )
            // InternalChor4IntTxtDsl.g:1560:2: ','
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
    // InternalChor4IntTxtDsl.g:1569:1: rule__ExclusiveGateway__Group_5_3__1 : rule__ExclusiveGateway__Group_5_3__1__Impl ;
    public final void rule__ExclusiveGateway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1573:1: ( rule__ExclusiveGateway__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:1574:2: rule__ExclusiveGateway__Group_5_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:1580:1: rule__ExclusiveGateway__Group_5_3__1__Impl : ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__ExclusiveGateway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1584:1: ( ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:1585:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1585:1: ( ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:1586:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:1587:2: ( rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:1587:3: rule__ExclusiveGateway__OutgoingsAssignment_5_3_1
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
    // InternalChor4IntTxtDsl.g:1596:1: rule__ParallelGateway__Group__0 : rule__ParallelGateway__Group__0__Impl rule__ParallelGateway__Group__1 ;
    public final void rule__ParallelGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1600:1: ( rule__ParallelGateway__Group__0__Impl rule__ParallelGateway__Group__1 )
            // InternalChor4IntTxtDsl.g:1601:2: rule__ParallelGateway__Group__0__Impl rule__ParallelGateway__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalChor4IntTxtDsl.g:1608:1: rule__ParallelGateway__Group__0__Impl : ( () ) ;
    public final void rule__ParallelGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1612:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:1613:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:1613:1: ( () )
            // InternalChor4IntTxtDsl.g:1614:2: ()
            {
             before(grammarAccess.getParallelGatewayAccess().getParallelGatewayAction_0()); 
            // InternalChor4IntTxtDsl.g:1615:2: ()
            // InternalChor4IntTxtDsl.g:1615:3: 
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
    // InternalChor4IntTxtDsl.g:1623:1: rule__ParallelGateway__Group__1 : rule__ParallelGateway__Group__1__Impl rule__ParallelGateway__Group__2 ;
    public final void rule__ParallelGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1627:1: ( rule__ParallelGateway__Group__1__Impl rule__ParallelGateway__Group__2 )
            // InternalChor4IntTxtDsl.g:1628:2: rule__ParallelGateway__Group__1__Impl rule__ParallelGateway__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1635:1: rule__ParallelGateway__Group__1__Impl : ( 'ParallelGateway' ) ;
    public final void rule__ParallelGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1639:1: ( ( 'ParallelGateway' ) )
            // InternalChor4IntTxtDsl.g:1640:1: ( 'ParallelGateway' )
            {
            // InternalChor4IntTxtDsl.g:1640:1: ( 'ParallelGateway' )
            // InternalChor4IntTxtDsl.g:1641:2: 'ParallelGateway'
            {
             before(grammarAccess.getParallelGatewayAccess().getParallelGatewayKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1650:1: rule__ParallelGateway__Group__2 : rule__ParallelGateway__Group__2__Impl rule__ParallelGateway__Group__3 ;
    public final void rule__ParallelGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1654:1: ( rule__ParallelGateway__Group__2__Impl rule__ParallelGateway__Group__3 )
            // InternalChor4IntTxtDsl.g:1655:2: rule__ParallelGateway__Group__2__Impl rule__ParallelGateway__Group__3
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
    // InternalChor4IntTxtDsl.g:1662:1: rule__ParallelGateway__Group__2__Impl : ( ( rule__ParallelGateway__NameAssignment_2 ) ) ;
    public final void rule__ParallelGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1666:1: ( ( ( rule__ParallelGateway__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:1667:1: ( ( rule__ParallelGateway__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1667:1: ( ( rule__ParallelGateway__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:1668:2: ( rule__ParallelGateway__NameAssignment_2 )
            {
             before(grammarAccess.getParallelGatewayAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:1669:2: ( rule__ParallelGateway__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:1669:3: rule__ParallelGateway__NameAssignment_2
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
    // InternalChor4IntTxtDsl.g:1677:1: rule__ParallelGateway__Group__3 : rule__ParallelGateway__Group__3__Impl rule__ParallelGateway__Group__4 ;
    public final void rule__ParallelGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1681:1: ( rule__ParallelGateway__Group__3__Impl rule__ParallelGateway__Group__4 )
            // InternalChor4IntTxtDsl.g:1682:2: rule__ParallelGateway__Group__3__Impl rule__ParallelGateway__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:1689:1: rule__ParallelGateway__Group__3__Impl : ( '{' ) ;
    public final void rule__ParallelGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1693:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:1694:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:1694:1: ( '{' )
            // InternalChor4IntTxtDsl.g:1695:2: '{'
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
    // InternalChor4IntTxtDsl.g:1704:1: rule__ParallelGateway__Group__4 : rule__ParallelGateway__Group__4__Impl rule__ParallelGateway__Group__5 ;
    public final void rule__ParallelGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1708:1: ( rule__ParallelGateway__Group__4__Impl rule__ParallelGateway__Group__5 )
            // InternalChor4IntTxtDsl.g:1709:2: rule__ParallelGateway__Group__4__Impl rule__ParallelGateway__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:1716:1: rule__ParallelGateway__Group__4__Impl : ( ( rule__ParallelGateway__Group_4__0 )? ) ;
    public final void rule__ParallelGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1720:1: ( ( ( rule__ParallelGateway__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:1721:1: ( ( rule__ParallelGateway__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1721:1: ( ( rule__ParallelGateway__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:1722:2: ( rule__ParallelGateway__Group_4__0 )?
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:1723:2: ( rule__ParallelGateway__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1723:3: rule__ParallelGateway__Group_4__0
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
    // InternalChor4IntTxtDsl.g:1731:1: rule__ParallelGateway__Group__5 : rule__ParallelGateway__Group__5__Impl rule__ParallelGateway__Group__6 ;
    public final void rule__ParallelGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1735:1: ( rule__ParallelGateway__Group__5__Impl rule__ParallelGateway__Group__6 )
            // InternalChor4IntTxtDsl.g:1736:2: rule__ParallelGateway__Group__5__Impl rule__ParallelGateway__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:1743:1: rule__ParallelGateway__Group__5__Impl : ( ( rule__ParallelGateway__Group_5__0 )? ) ;
    public final void rule__ParallelGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1747:1: ( ( ( rule__ParallelGateway__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:1748:1: ( ( rule__ParallelGateway__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:1748:1: ( ( rule__ParallelGateway__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:1749:2: ( rule__ParallelGateway__Group_5__0 )?
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:1750:2: ( rule__ParallelGateway__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1750:3: rule__ParallelGateway__Group_5__0
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
    // InternalChor4IntTxtDsl.g:1758:1: rule__ParallelGateway__Group__6 : rule__ParallelGateway__Group__6__Impl ;
    public final void rule__ParallelGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1762:1: ( rule__ParallelGateway__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:1763:2: rule__ParallelGateway__Group__6__Impl
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
    // InternalChor4IntTxtDsl.g:1769:1: rule__ParallelGateway__Group__6__Impl : ( '}' ) ;
    public final void rule__ParallelGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1773:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:1774:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:1774:1: ( '}' )
            // InternalChor4IntTxtDsl.g:1775:2: '}'
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
    // InternalChor4IntTxtDsl.g:1785:1: rule__ParallelGateway__Group_4__0 : rule__ParallelGateway__Group_4__0__Impl rule__ParallelGateway__Group_4__1 ;
    public final void rule__ParallelGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1789:1: ( rule__ParallelGateway__Group_4__0__Impl rule__ParallelGateway__Group_4__1 )
            // InternalChor4IntTxtDsl.g:1790:2: rule__ParallelGateway__Group_4__0__Impl rule__ParallelGateway__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:1797:1: rule__ParallelGateway__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__ParallelGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1801:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:1802:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:1802:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:1803:2: 'incomings'
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1812:1: rule__ParallelGateway__Group_4__1 : rule__ParallelGateway__Group_4__1__Impl rule__ParallelGateway__Group_4__2 ;
    public final void rule__ParallelGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1816:1: ( rule__ParallelGateway__Group_4__1__Impl rule__ParallelGateway__Group_4__2 )
            // InternalChor4IntTxtDsl.g:1817:2: rule__ParallelGateway__Group_4__1__Impl rule__ParallelGateway__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1824:1: rule__ParallelGateway__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ParallelGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1828:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:1829:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:1829:1: ( '(' )
            // InternalChor4IntTxtDsl.g:1830:2: '('
            {
             before(grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1839:1: rule__ParallelGateway__Group_4__2 : rule__ParallelGateway__Group_4__2__Impl rule__ParallelGateway__Group_4__3 ;
    public final void rule__ParallelGateway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1843:1: ( rule__ParallelGateway__Group_4__2__Impl rule__ParallelGateway__Group_4__3 )
            // InternalChor4IntTxtDsl.g:1844:2: rule__ParallelGateway__Group_4__2__Impl rule__ParallelGateway__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:1851:1: rule__ParallelGateway__Group_4__2__Impl : ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) ) ;
    public final void rule__ParallelGateway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1855:1: ( ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:1856:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:1856:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:1857:2: ( rule__ParallelGateway__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:1858:2: ( rule__ParallelGateway__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:1858:3: rule__ParallelGateway__IncomingsAssignment_4_2
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
    // InternalChor4IntTxtDsl.g:1866:1: rule__ParallelGateway__Group_4__3 : rule__ParallelGateway__Group_4__3__Impl rule__ParallelGateway__Group_4__4 ;
    public final void rule__ParallelGateway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1870:1: ( rule__ParallelGateway__Group_4__3__Impl rule__ParallelGateway__Group_4__4 )
            // InternalChor4IntTxtDsl.g:1871:2: rule__ParallelGateway__Group_4__3__Impl rule__ParallelGateway__Group_4__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:1878:1: rule__ParallelGateway__Group_4__3__Impl : ( ( rule__ParallelGateway__Group_4_3__0 )* ) ;
    public final void rule__ParallelGateway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1882:1: ( ( ( rule__ParallelGateway__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:1883:1: ( ( rule__ParallelGateway__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:1883:1: ( ( rule__ParallelGateway__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:1884:2: ( rule__ParallelGateway__Group_4_3__0 )*
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:1885:2: ( rule__ParallelGateway__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:1885:3: rule__ParallelGateway__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ParallelGateway__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalChor4IntTxtDsl.g:1893:1: rule__ParallelGateway__Group_4__4 : rule__ParallelGateway__Group_4__4__Impl ;
    public final void rule__ParallelGateway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1897:1: ( rule__ParallelGateway__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:1898:2: rule__ParallelGateway__Group_4__4__Impl
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
    // InternalChor4IntTxtDsl.g:1904:1: rule__ParallelGateway__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ParallelGateway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1908:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:1909:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:1909:1: ( ')' )
            // InternalChor4IntTxtDsl.g:1910:2: ')'
            {
             before(grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:1920:1: rule__ParallelGateway__Group_4_3__0 : rule__ParallelGateway__Group_4_3__0__Impl rule__ParallelGateway__Group_4_3__1 ;
    public final void rule__ParallelGateway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1924:1: ( rule__ParallelGateway__Group_4_3__0__Impl rule__ParallelGateway__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:1925:2: rule__ParallelGateway__Group_4_3__0__Impl rule__ParallelGateway__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:1932:1: rule__ParallelGateway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ParallelGateway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1936:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:1937:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:1937:1: ( ',' )
            // InternalChor4IntTxtDsl.g:1938:2: ','
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
    // InternalChor4IntTxtDsl.g:1947:1: rule__ParallelGateway__Group_4_3__1 : rule__ParallelGateway__Group_4_3__1__Impl ;
    public final void rule__ParallelGateway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1951:1: ( rule__ParallelGateway__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:1952:2: rule__ParallelGateway__Group_4_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:1958:1: rule__ParallelGateway__Group_4_3__1__Impl : ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__ParallelGateway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1962:1: ( ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:1963:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:1963:1: ( ( rule__ParallelGateway__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:1964:2: ( rule__ParallelGateway__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:1965:2: ( rule__ParallelGateway__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:1965:3: rule__ParallelGateway__IncomingsAssignment_4_3_1
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
    // InternalChor4IntTxtDsl.g:1974:1: rule__ParallelGateway__Group_5__0 : rule__ParallelGateway__Group_5__0__Impl rule__ParallelGateway__Group_5__1 ;
    public final void rule__ParallelGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1978:1: ( rule__ParallelGateway__Group_5__0__Impl rule__ParallelGateway__Group_5__1 )
            // InternalChor4IntTxtDsl.g:1979:2: rule__ParallelGateway__Group_5__0__Impl rule__ParallelGateway__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:1986:1: rule__ParallelGateway__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__ParallelGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:1990:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:1991:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:1991:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:1992:2: 'outgoings'
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2001:1: rule__ParallelGateway__Group_5__1 : rule__ParallelGateway__Group_5__1__Impl rule__ParallelGateway__Group_5__2 ;
    public final void rule__ParallelGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2005:1: ( rule__ParallelGateway__Group_5__1__Impl rule__ParallelGateway__Group_5__2 )
            // InternalChor4IntTxtDsl.g:2006:2: rule__ParallelGateway__Group_5__1__Impl rule__ParallelGateway__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2013:1: rule__ParallelGateway__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ParallelGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2017:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2018:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2018:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2019:2: '('
            {
             before(grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2028:1: rule__ParallelGateway__Group_5__2 : rule__ParallelGateway__Group_5__2__Impl rule__ParallelGateway__Group_5__3 ;
    public final void rule__ParallelGateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2032:1: ( rule__ParallelGateway__Group_5__2__Impl rule__ParallelGateway__Group_5__3 )
            // InternalChor4IntTxtDsl.g:2033:2: rule__ParallelGateway__Group_5__2__Impl rule__ParallelGateway__Group_5__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2040:1: rule__ParallelGateway__Group_5__2__Impl : ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__ParallelGateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2044:1: ( ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:2045:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2045:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:2046:2: ( rule__ParallelGateway__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:2047:2: ( rule__ParallelGateway__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:2047:3: rule__ParallelGateway__OutgoingsAssignment_5_2
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
    // InternalChor4IntTxtDsl.g:2055:1: rule__ParallelGateway__Group_5__3 : rule__ParallelGateway__Group_5__3__Impl rule__ParallelGateway__Group_5__4 ;
    public final void rule__ParallelGateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2059:1: ( rule__ParallelGateway__Group_5__3__Impl rule__ParallelGateway__Group_5__4 )
            // InternalChor4IntTxtDsl.g:2060:2: rule__ParallelGateway__Group_5__3__Impl rule__ParallelGateway__Group_5__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2067:1: rule__ParallelGateway__Group_5__3__Impl : ( ( rule__ParallelGateway__Group_5_3__0 )* ) ;
    public final void rule__ParallelGateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2071:1: ( ( ( rule__ParallelGateway__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:2072:1: ( ( rule__ParallelGateway__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:2072:1: ( ( rule__ParallelGateway__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:2073:2: ( rule__ParallelGateway__Group_5_3__0 )*
            {
             before(grammarAccess.getParallelGatewayAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:2074:2: ( rule__ParallelGateway__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:2074:3: rule__ParallelGateway__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ParallelGateway__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalChor4IntTxtDsl.g:2082:1: rule__ParallelGateway__Group_5__4 : rule__ParallelGateway__Group_5__4__Impl ;
    public final void rule__ParallelGateway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2086:1: ( rule__ParallelGateway__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:2087:2: rule__ParallelGateway__Group_5__4__Impl
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
    // InternalChor4IntTxtDsl.g:2093:1: rule__ParallelGateway__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ParallelGateway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2097:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2098:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2098:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2099:2: ')'
            {
             before(grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2109:1: rule__ParallelGateway__Group_5_3__0 : rule__ParallelGateway__Group_5_3__0__Impl rule__ParallelGateway__Group_5_3__1 ;
    public final void rule__ParallelGateway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2113:1: ( rule__ParallelGateway__Group_5_3__0__Impl rule__ParallelGateway__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:2114:2: rule__ParallelGateway__Group_5_3__0__Impl rule__ParallelGateway__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2121:1: rule__ParallelGateway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ParallelGateway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2125:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2126:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2126:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2127:2: ','
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
    // InternalChor4IntTxtDsl.g:2136:1: rule__ParallelGateway__Group_5_3__1 : rule__ParallelGateway__Group_5_3__1__Impl ;
    public final void rule__ParallelGateway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2140:1: ( rule__ParallelGateway__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:2141:2: rule__ParallelGateway__Group_5_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:2147:1: rule__ParallelGateway__Group_5_3__1__Impl : ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__ParallelGateway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2151:1: ( ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:2152:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:2152:1: ( ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:2153:2: ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:2154:2: ( rule__ParallelGateway__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:2154:3: rule__ParallelGateway__OutgoingsAssignment_5_3_1
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
    // InternalChor4IntTxtDsl.g:2163:1: rule__StartEvent__Group__0 : rule__StartEvent__Group__0__Impl rule__StartEvent__Group__1 ;
    public final void rule__StartEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2167:1: ( rule__StartEvent__Group__0__Impl rule__StartEvent__Group__1 )
            // InternalChor4IntTxtDsl.g:2168:2: rule__StartEvent__Group__0__Impl rule__StartEvent__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalChor4IntTxtDsl.g:2175:1: rule__StartEvent__Group__0__Impl : ( () ) ;
    public final void rule__StartEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2179:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:2180:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:2180:1: ( () )
            // InternalChor4IntTxtDsl.g:2181:2: ()
            {
             before(grammarAccess.getStartEventAccess().getStartEventAction_0()); 
            // InternalChor4IntTxtDsl.g:2182:2: ()
            // InternalChor4IntTxtDsl.g:2182:3: 
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
    // InternalChor4IntTxtDsl.g:2190:1: rule__StartEvent__Group__1 : rule__StartEvent__Group__1__Impl rule__StartEvent__Group__2 ;
    public final void rule__StartEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2194:1: ( rule__StartEvent__Group__1__Impl rule__StartEvent__Group__2 )
            // InternalChor4IntTxtDsl.g:2195:2: rule__StartEvent__Group__1__Impl rule__StartEvent__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2202:1: rule__StartEvent__Group__1__Impl : ( 'StartEvent' ) ;
    public final void rule__StartEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2206:1: ( ( 'StartEvent' ) )
            // InternalChor4IntTxtDsl.g:2207:1: ( 'StartEvent' )
            {
            // InternalChor4IntTxtDsl.g:2207:1: ( 'StartEvent' )
            // InternalChor4IntTxtDsl.g:2208:2: 'StartEvent'
            {
             before(grammarAccess.getStartEventAccess().getStartEventKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2217:1: rule__StartEvent__Group__2 : rule__StartEvent__Group__2__Impl rule__StartEvent__Group__3 ;
    public final void rule__StartEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2221:1: ( rule__StartEvent__Group__2__Impl rule__StartEvent__Group__3 )
            // InternalChor4IntTxtDsl.g:2222:2: rule__StartEvent__Group__2__Impl rule__StartEvent__Group__3
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
    // InternalChor4IntTxtDsl.g:2229:1: rule__StartEvent__Group__2__Impl : ( ( rule__StartEvent__NameAssignment_2 ) ) ;
    public final void rule__StartEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2233:1: ( ( ( rule__StartEvent__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:2234:1: ( ( rule__StartEvent__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2234:1: ( ( rule__StartEvent__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:2235:2: ( rule__StartEvent__NameAssignment_2 )
            {
             before(grammarAccess.getStartEventAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:2236:2: ( rule__StartEvent__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:2236:3: rule__StartEvent__NameAssignment_2
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
    // InternalChor4IntTxtDsl.g:2244:1: rule__StartEvent__Group__3 : rule__StartEvent__Group__3__Impl rule__StartEvent__Group__4 ;
    public final void rule__StartEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2248:1: ( rule__StartEvent__Group__3__Impl rule__StartEvent__Group__4 )
            // InternalChor4IntTxtDsl.g:2249:2: rule__StartEvent__Group__3__Impl rule__StartEvent__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:2256:1: rule__StartEvent__Group__3__Impl : ( '{' ) ;
    public final void rule__StartEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2260:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:2261:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:2261:1: ( '{' )
            // InternalChor4IntTxtDsl.g:2262:2: '{'
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
    // InternalChor4IntTxtDsl.g:2271:1: rule__StartEvent__Group__4 : rule__StartEvent__Group__4__Impl rule__StartEvent__Group__5 ;
    public final void rule__StartEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2275:1: ( rule__StartEvent__Group__4__Impl rule__StartEvent__Group__5 )
            // InternalChor4IntTxtDsl.g:2276:2: rule__StartEvent__Group__4__Impl rule__StartEvent__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:2283:1: rule__StartEvent__Group__4__Impl : ( ( rule__StartEvent__Group_4__0 )? ) ;
    public final void rule__StartEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2287:1: ( ( ( rule__StartEvent__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:2288:1: ( ( rule__StartEvent__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2288:1: ( ( rule__StartEvent__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:2289:2: ( rule__StartEvent__Group_4__0 )?
            {
             before(grammarAccess.getStartEventAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:2290:2: ( rule__StartEvent__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2290:3: rule__StartEvent__Group_4__0
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
    // InternalChor4IntTxtDsl.g:2298:1: rule__StartEvent__Group__5 : rule__StartEvent__Group__5__Impl rule__StartEvent__Group__6 ;
    public final void rule__StartEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2302:1: ( rule__StartEvent__Group__5__Impl rule__StartEvent__Group__6 )
            // InternalChor4IntTxtDsl.g:2303:2: rule__StartEvent__Group__5__Impl rule__StartEvent__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:2310:1: rule__StartEvent__Group__5__Impl : ( ( rule__StartEvent__Group_5__0 )? ) ;
    public final void rule__StartEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2314:1: ( ( ( rule__StartEvent__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:2315:1: ( ( rule__StartEvent__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2315:1: ( ( rule__StartEvent__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:2316:2: ( rule__StartEvent__Group_5__0 )?
            {
             before(grammarAccess.getStartEventAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:2317:2: ( rule__StartEvent__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2317:3: rule__StartEvent__Group_5__0
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
    // InternalChor4IntTxtDsl.g:2325:1: rule__StartEvent__Group__6 : rule__StartEvent__Group__6__Impl ;
    public final void rule__StartEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2329:1: ( rule__StartEvent__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:2330:2: rule__StartEvent__Group__6__Impl
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
    // InternalChor4IntTxtDsl.g:2336:1: rule__StartEvent__Group__6__Impl : ( '}' ) ;
    public final void rule__StartEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2340:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:2341:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:2341:1: ( '}' )
            // InternalChor4IntTxtDsl.g:2342:2: '}'
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
    // InternalChor4IntTxtDsl.g:2352:1: rule__StartEvent__Group_4__0 : rule__StartEvent__Group_4__0__Impl rule__StartEvent__Group_4__1 ;
    public final void rule__StartEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2356:1: ( rule__StartEvent__Group_4__0__Impl rule__StartEvent__Group_4__1 )
            // InternalChor4IntTxtDsl.g:2357:2: rule__StartEvent__Group_4__0__Impl rule__StartEvent__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:2364:1: rule__StartEvent__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__StartEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2368:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:2369:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:2369:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:2370:2: 'incomings'
            {
             before(grammarAccess.getStartEventAccess().getIncomingsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2379:1: rule__StartEvent__Group_4__1 : rule__StartEvent__Group_4__1__Impl rule__StartEvent__Group_4__2 ;
    public final void rule__StartEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2383:1: ( rule__StartEvent__Group_4__1__Impl rule__StartEvent__Group_4__2 )
            // InternalChor4IntTxtDsl.g:2384:2: rule__StartEvent__Group_4__1__Impl rule__StartEvent__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2391:1: rule__StartEvent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__StartEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2395:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2396:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2396:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2397:2: '('
            {
             before(grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2406:1: rule__StartEvent__Group_4__2 : rule__StartEvent__Group_4__2__Impl rule__StartEvent__Group_4__3 ;
    public final void rule__StartEvent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2410:1: ( rule__StartEvent__Group_4__2__Impl rule__StartEvent__Group_4__3 )
            // InternalChor4IntTxtDsl.g:2411:2: rule__StartEvent__Group_4__2__Impl rule__StartEvent__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2418:1: rule__StartEvent__Group_4__2__Impl : ( ( rule__StartEvent__IncomingsAssignment_4_2 ) ) ;
    public final void rule__StartEvent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2422:1: ( ( ( rule__StartEvent__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:2423:1: ( ( rule__StartEvent__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2423:1: ( ( rule__StartEvent__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:2424:2: ( rule__StartEvent__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:2425:2: ( rule__StartEvent__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:2425:3: rule__StartEvent__IncomingsAssignment_4_2
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
    // InternalChor4IntTxtDsl.g:2433:1: rule__StartEvent__Group_4__3 : rule__StartEvent__Group_4__3__Impl rule__StartEvent__Group_4__4 ;
    public final void rule__StartEvent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2437:1: ( rule__StartEvent__Group_4__3__Impl rule__StartEvent__Group_4__4 )
            // InternalChor4IntTxtDsl.g:2438:2: rule__StartEvent__Group_4__3__Impl rule__StartEvent__Group_4__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2445:1: rule__StartEvent__Group_4__3__Impl : ( ( rule__StartEvent__Group_4_3__0 )* ) ;
    public final void rule__StartEvent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2449:1: ( ( ( rule__StartEvent__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:2450:1: ( ( rule__StartEvent__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:2450:1: ( ( rule__StartEvent__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:2451:2: ( rule__StartEvent__Group_4_3__0 )*
            {
             before(grammarAccess.getStartEventAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:2452:2: ( rule__StartEvent__Group_4_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:2452:3: rule__StartEvent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StartEvent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalChor4IntTxtDsl.g:2460:1: rule__StartEvent__Group_4__4 : rule__StartEvent__Group_4__4__Impl ;
    public final void rule__StartEvent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2464:1: ( rule__StartEvent__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:2465:2: rule__StartEvent__Group_4__4__Impl
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
    // InternalChor4IntTxtDsl.g:2471:1: rule__StartEvent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__StartEvent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2475:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2476:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2476:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2477:2: ')'
            {
             before(grammarAccess.getStartEventAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2487:1: rule__StartEvent__Group_4_3__0 : rule__StartEvent__Group_4_3__0__Impl rule__StartEvent__Group_4_3__1 ;
    public final void rule__StartEvent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2491:1: ( rule__StartEvent__Group_4_3__0__Impl rule__StartEvent__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:2492:2: rule__StartEvent__Group_4_3__0__Impl rule__StartEvent__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2499:1: rule__StartEvent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__StartEvent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2503:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2504:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2504:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2505:2: ','
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
    // InternalChor4IntTxtDsl.g:2514:1: rule__StartEvent__Group_4_3__1 : rule__StartEvent__Group_4_3__1__Impl ;
    public final void rule__StartEvent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2518:1: ( rule__StartEvent__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:2519:2: rule__StartEvent__Group_4_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:2525:1: rule__StartEvent__Group_4_3__1__Impl : ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__StartEvent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2529:1: ( ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:2530:1: ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:2530:1: ( ( rule__StartEvent__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:2531:2: ( rule__StartEvent__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:2532:2: ( rule__StartEvent__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:2532:3: rule__StartEvent__IncomingsAssignment_4_3_1
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
    // InternalChor4IntTxtDsl.g:2541:1: rule__StartEvent__Group_5__0 : rule__StartEvent__Group_5__0__Impl rule__StartEvent__Group_5__1 ;
    public final void rule__StartEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2545:1: ( rule__StartEvent__Group_5__0__Impl rule__StartEvent__Group_5__1 )
            // InternalChor4IntTxtDsl.g:2546:2: rule__StartEvent__Group_5__0__Impl rule__StartEvent__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:2553:1: rule__StartEvent__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__StartEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2557:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:2558:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:2558:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:2559:2: 'outgoings'
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2568:1: rule__StartEvent__Group_5__1 : rule__StartEvent__Group_5__1__Impl rule__StartEvent__Group_5__2 ;
    public final void rule__StartEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2572:1: ( rule__StartEvent__Group_5__1__Impl rule__StartEvent__Group_5__2 )
            // InternalChor4IntTxtDsl.g:2573:2: rule__StartEvent__Group_5__1__Impl rule__StartEvent__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2580:1: rule__StartEvent__Group_5__1__Impl : ( '(' ) ;
    public final void rule__StartEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2584:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2585:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2585:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2586:2: '('
            {
             before(grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2595:1: rule__StartEvent__Group_5__2 : rule__StartEvent__Group_5__2__Impl rule__StartEvent__Group_5__3 ;
    public final void rule__StartEvent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2599:1: ( rule__StartEvent__Group_5__2__Impl rule__StartEvent__Group_5__3 )
            // InternalChor4IntTxtDsl.g:2600:2: rule__StartEvent__Group_5__2__Impl rule__StartEvent__Group_5__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2607:1: rule__StartEvent__Group_5__2__Impl : ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__StartEvent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2611:1: ( ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:2612:1: ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2612:1: ( ( rule__StartEvent__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:2613:2: ( rule__StartEvent__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:2614:2: ( rule__StartEvent__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:2614:3: rule__StartEvent__OutgoingsAssignment_5_2
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
    // InternalChor4IntTxtDsl.g:2622:1: rule__StartEvent__Group_5__3 : rule__StartEvent__Group_5__3__Impl rule__StartEvent__Group_5__4 ;
    public final void rule__StartEvent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2626:1: ( rule__StartEvent__Group_5__3__Impl rule__StartEvent__Group_5__4 )
            // InternalChor4IntTxtDsl.g:2627:2: rule__StartEvent__Group_5__3__Impl rule__StartEvent__Group_5__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2634:1: rule__StartEvent__Group_5__3__Impl : ( ( rule__StartEvent__Group_5_3__0 )* ) ;
    public final void rule__StartEvent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2638:1: ( ( ( rule__StartEvent__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:2639:1: ( ( rule__StartEvent__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:2639:1: ( ( rule__StartEvent__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:2640:2: ( rule__StartEvent__Group_5_3__0 )*
            {
             before(grammarAccess.getStartEventAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:2641:2: ( rule__StartEvent__Group_5_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:2641:3: rule__StartEvent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StartEvent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalChor4IntTxtDsl.g:2649:1: rule__StartEvent__Group_5__4 : rule__StartEvent__Group_5__4__Impl ;
    public final void rule__StartEvent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2653:1: ( rule__StartEvent__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:2654:2: rule__StartEvent__Group_5__4__Impl
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
    // InternalChor4IntTxtDsl.g:2660:1: rule__StartEvent__Group_5__4__Impl : ( ')' ) ;
    public final void rule__StartEvent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2664:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:2665:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:2665:1: ( ')' )
            // InternalChor4IntTxtDsl.g:2666:2: ')'
            {
             before(grammarAccess.getStartEventAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2676:1: rule__StartEvent__Group_5_3__0 : rule__StartEvent__Group_5_3__0__Impl rule__StartEvent__Group_5_3__1 ;
    public final void rule__StartEvent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2680:1: ( rule__StartEvent__Group_5_3__0__Impl rule__StartEvent__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:2681:2: rule__StartEvent__Group_5_3__0__Impl rule__StartEvent__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2688:1: rule__StartEvent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__StartEvent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2692:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:2693:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:2693:1: ( ',' )
            // InternalChor4IntTxtDsl.g:2694:2: ','
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
    // InternalChor4IntTxtDsl.g:2703:1: rule__StartEvent__Group_5_3__1 : rule__StartEvent__Group_5_3__1__Impl ;
    public final void rule__StartEvent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2707:1: ( rule__StartEvent__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:2708:2: rule__StartEvent__Group_5_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:2714:1: rule__StartEvent__Group_5_3__1__Impl : ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__StartEvent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2718:1: ( ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:2719:1: ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:2719:1: ( ( rule__StartEvent__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:2720:2: ( rule__StartEvent__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:2721:2: ( rule__StartEvent__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:2721:3: rule__StartEvent__OutgoingsAssignment_5_3_1
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
    // InternalChor4IntTxtDsl.g:2730:1: rule__EndEvent__Group__0 : rule__EndEvent__Group__0__Impl rule__EndEvent__Group__1 ;
    public final void rule__EndEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2734:1: ( rule__EndEvent__Group__0__Impl rule__EndEvent__Group__1 )
            // InternalChor4IntTxtDsl.g:2735:2: rule__EndEvent__Group__0__Impl rule__EndEvent__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalChor4IntTxtDsl.g:2742:1: rule__EndEvent__Group__0__Impl : ( () ) ;
    public final void rule__EndEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2746:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:2747:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:2747:1: ( () )
            // InternalChor4IntTxtDsl.g:2748:2: ()
            {
             before(grammarAccess.getEndEventAccess().getEndEventAction_0()); 
            // InternalChor4IntTxtDsl.g:2749:2: ()
            // InternalChor4IntTxtDsl.g:2749:3: 
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
    // InternalChor4IntTxtDsl.g:2757:1: rule__EndEvent__Group__1 : rule__EndEvent__Group__1__Impl rule__EndEvent__Group__2 ;
    public final void rule__EndEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2761:1: ( rule__EndEvent__Group__1__Impl rule__EndEvent__Group__2 )
            // InternalChor4IntTxtDsl.g:2762:2: rule__EndEvent__Group__1__Impl rule__EndEvent__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2769:1: rule__EndEvent__Group__1__Impl : ( 'EndEvent' ) ;
    public final void rule__EndEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2773:1: ( ( 'EndEvent' ) )
            // InternalChor4IntTxtDsl.g:2774:1: ( 'EndEvent' )
            {
            // InternalChor4IntTxtDsl.g:2774:1: ( 'EndEvent' )
            // InternalChor4IntTxtDsl.g:2775:2: 'EndEvent'
            {
             before(grammarAccess.getEndEventAccess().getEndEventKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2784:1: rule__EndEvent__Group__2 : rule__EndEvent__Group__2__Impl rule__EndEvent__Group__3 ;
    public final void rule__EndEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2788:1: ( rule__EndEvent__Group__2__Impl rule__EndEvent__Group__3 )
            // InternalChor4IntTxtDsl.g:2789:2: rule__EndEvent__Group__2__Impl rule__EndEvent__Group__3
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
    // InternalChor4IntTxtDsl.g:2796:1: rule__EndEvent__Group__2__Impl : ( ( rule__EndEvent__NameAssignment_2 ) ) ;
    public final void rule__EndEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2800:1: ( ( ( rule__EndEvent__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:2801:1: ( ( rule__EndEvent__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2801:1: ( ( rule__EndEvent__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:2802:2: ( rule__EndEvent__NameAssignment_2 )
            {
             before(grammarAccess.getEndEventAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:2803:2: ( rule__EndEvent__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:2803:3: rule__EndEvent__NameAssignment_2
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
    // InternalChor4IntTxtDsl.g:2811:1: rule__EndEvent__Group__3 : rule__EndEvent__Group__3__Impl rule__EndEvent__Group__4 ;
    public final void rule__EndEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2815:1: ( rule__EndEvent__Group__3__Impl rule__EndEvent__Group__4 )
            // InternalChor4IntTxtDsl.g:2816:2: rule__EndEvent__Group__3__Impl rule__EndEvent__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:2823:1: rule__EndEvent__Group__3__Impl : ( '{' ) ;
    public final void rule__EndEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2827:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:2828:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:2828:1: ( '{' )
            // InternalChor4IntTxtDsl.g:2829:2: '{'
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
    // InternalChor4IntTxtDsl.g:2838:1: rule__EndEvent__Group__4 : rule__EndEvent__Group__4__Impl rule__EndEvent__Group__5 ;
    public final void rule__EndEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2842:1: ( rule__EndEvent__Group__4__Impl rule__EndEvent__Group__5 )
            // InternalChor4IntTxtDsl.g:2843:2: rule__EndEvent__Group__4__Impl rule__EndEvent__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:2850:1: rule__EndEvent__Group__4__Impl : ( ( rule__EndEvent__Group_4__0 )? ) ;
    public final void rule__EndEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2854:1: ( ( ( rule__EndEvent__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:2855:1: ( ( rule__EndEvent__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2855:1: ( ( rule__EndEvent__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:2856:2: ( rule__EndEvent__Group_4__0 )?
            {
             before(grammarAccess.getEndEventAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:2857:2: ( rule__EndEvent__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2857:3: rule__EndEvent__Group_4__0
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
    // InternalChor4IntTxtDsl.g:2865:1: rule__EndEvent__Group__5 : rule__EndEvent__Group__5__Impl rule__EndEvent__Group__6 ;
    public final void rule__EndEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2869:1: ( rule__EndEvent__Group__5__Impl rule__EndEvent__Group__6 )
            // InternalChor4IntTxtDsl.g:2870:2: rule__EndEvent__Group__5__Impl rule__EndEvent__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalChor4IntTxtDsl.g:2877:1: rule__EndEvent__Group__5__Impl : ( ( rule__EndEvent__Group_5__0 )? ) ;
    public final void rule__EndEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2881:1: ( ( ( rule__EndEvent__Group_5__0 )? ) )
            // InternalChor4IntTxtDsl.g:2882:1: ( ( rule__EndEvent__Group_5__0 )? )
            {
            // InternalChor4IntTxtDsl.g:2882:1: ( ( rule__EndEvent__Group_5__0 )? )
            // InternalChor4IntTxtDsl.g:2883:2: ( rule__EndEvent__Group_5__0 )?
            {
             before(grammarAccess.getEndEventAccess().getGroup_5()); 
            // InternalChor4IntTxtDsl.g:2884:2: ( rule__EndEvent__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:2884:3: rule__EndEvent__Group_5__0
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
    // InternalChor4IntTxtDsl.g:2892:1: rule__EndEvent__Group__6 : rule__EndEvent__Group__6__Impl ;
    public final void rule__EndEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2896:1: ( rule__EndEvent__Group__6__Impl )
            // InternalChor4IntTxtDsl.g:2897:2: rule__EndEvent__Group__6__Impl
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
    // InternalChor4IntTxtDsl.g:2903:1: rule__EndEvent__Group__6__Impl : ( '}' ) ;
    public final void rule__EndEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2907:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:2908:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:2908:1: ( '}' )
            // InternalChor4IntTxtDsl.g:2909:2: '}'
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
    // InternalChor4IntTxtDsl.g:2919:1: rule__EndEvent__Group_4__0 : rule__EndEvent__Group_4__0__Impl rule__EndEvent__Group_4__1 ;
    public final void rule__EndEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2923:1: ( rule__EndEvent__Group_4__0__Impl rule__EndEvent__Group_4__1 )
            // InternalChor4IntTxtDsl.g:2924:2: rule__EndEvent__Group_4__0__Impl rule__EndEvent__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:2931:1: rule__EndEvent__Group_4__0__Impl : ( 'incomings' ) ;
    public final void rule__EndEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2935:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:2936:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:2936:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:2937:2: 'incomings'
            {
             before(grammarAccess.getEndEventAccess().getIncomingsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2946:1: rule__EndEvent__Group_4__1 : rule__EndEvent__Group_4__1__Impl rule__EndEvent__Group_4__2 ;
    public final void rule__EndEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2950:1: ( rule__EndEvent__Group_4__1__Impl rule__EndEvent__Group_4__2 )
            // InternalChor4IntTxtDsl.g:2951:2: rule__EndEvent__Group_4__1__Impl rule__EndEvent__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:2958:1: rule__EndEvent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__EndEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2962:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:2963:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:2963:1: ( '(' )
            // InternalChor4IntTxtDsl.g:2964:2: '('
            {
             before(grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:2973:1: rule__EndEvent__Group_4__2 : rule__EndEvent__Group_4__2__Impl rule__EndEvent__Group_4__3 ;
    public final void rule__EndEvent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2977:1: ( rule__EndEvent__Group_4__2__Impl rule__EndEvent__Group_4__3 )
            // InternalChor4IntTxtDsl.g:2978:2: rule__EndEvent__Group_4__2__Impl rule__EndEvent__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:2985:1: rule__EndEvent__Group_4__2__Impl : ( ( rule__EndEvent__IncomingsAssignment_4_2 ) ) ;
    public final void rule__EndEvent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:2989:1: ( ( ( rule__EndEvent__IncomingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:2990:1: ( ( rule__EndEvent__IncomingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:2990:1: ( ( rule__EndEvent__IncomingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:2991:2: ( rule__EndEvent__IncomingsAssignment_4_2 )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:2992:2: ( rule__EndEvent__IncomingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:2992:3: rule__EndEvent__IncomingsAssignment_4_2
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
    // InternalChor4IntTxtDsl.g:3000:1: rule__EndEvent__Group_4__3 : rule__EndEvent__Group_4__3__Impl rule__EndEvent__Group_4__4 ;
    public final void rule__EndEvent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3004:1: ( rule__EndEvent__Group_4__3__Impl rule__EndEvent__Group_4__4 )
            // InternalChor4IntTxtDsl.g:3005:2: rule__EndEvent__Group_4__3__Impl rule__EndEvent__Group_4__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3012:1: rule__EndEvent__Group_4__3__Impl : ( ( rule__EndEvent__Group_4_3__0 )* ) ;
    public final void rule__EndEvent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3016:1: ( ( ( rule__EndEvent__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3017:1: ( ( rule__EndEvent__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3017:1: ( ( rule__EndEvent__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:3018:2: ( rule__EndEvent__Group_4_3__0 )*
            {
             before(grammarAccess.getEndEventAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:3019:2: ( rule__EndEvent__Group_4_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3019:3: rule__EndEvent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EndEvent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalChor4IntTxtDsl.g:3027:1: rule__EndEvent__Group_4__4 : rule__EndEvent__Group_4__4__Impl ;
    public final void rule__EndEvent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3031:1: ( rule__EndEvent__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:3032:2: rule__EndEvent__Group_4__4__Impl
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
    // InternalChor4IntTxtDsl.g:3038:1: rule__EndEvent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__EndEvent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3042:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3043:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3043:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3044:2: ')'
            {
             before(grammarAccess.getEndEventAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3054:1: rule__EndEvent__Group_4_3__0 : rule__EndEvent__Group_4_3__0__Impl rule__EndEvent__Group_4_3__1 ;
    public final void rule__EndEvent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3058:1: ( rule__EndEvent__Group_4_3__0__Impl rule__EndEvent__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:3059:2: rule__EndEvent__Group_4_3__0__Impl rule__EndEvent__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3066:1: rule__EndEvent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__EndEvent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3070:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3071:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3071:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3072:2: ','
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
    // InternalChor4IntTxtDsl.g:3081:1: rule__EndEvent__Group_4_3__1 : rule__EndEvent__Group_4_3__1__Impl ;
    public final void rule__EndEvent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3085:1: ( rule__EndEvent__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3086:2: rule__EndEvent__Group_4_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:3092:1: rule__EndEvent__Group_4_3__1__Impl : ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) ) ;
    public final void rule__EndEvent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3096:1: ( ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3097:1: ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3097:1: ( ( rule__EndEvent__IncomingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:3098:2: ( rule__EndEvent__IncomingsAssignment_4_3_1 )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:3099:2: ( rule__EndEvent__IncomingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:3099:3: rule__EndEvent__IncomingsAssignment_4_3_1
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
    // InternalChor4IntTxtDsl.g:3108:1: rule__EndEvent__Group_5__0 : rule__EndEvent__Group_5__0__Impl rule__EndEvent__Group_5__1 ;
    public final void rule__EndEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3112:1: ( rule__EndEvent__Group_5__0__Impl rule__EndEvent__Group_5__1 )
            // InternalChor4IntTxtDsl.g:3113:2: rule__EndEvent__Group_5__0__Impl rule__EndEvent__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:3120:1: rule__EndEvent__Group_5__0__Impl : ( 'outgoings' ) ;
    public final void rule__EndEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3124:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:3125:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:3125:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:3126:2: 'outgoings'
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3135:1: rule__EndEvent__Group_5__1 : rule__EndEvent__Group_5__1__Impl rule__EndEvent__Group_5__2 ;
    public final void rule__EndEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3139:1: ( rule__EndEvent__Group_5__1__Impl rule__EndEvent__Group_5__2 )
            // InternalChor4IntTxtDsl.g:3140:2: rule__EndEvent__Group_5__1__Impl rule__EndEvent__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3147:1: rule__EndEvent__Group_5__1__Impl : ( '(' ) ;
    public final void rule__EndEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3151:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:3152:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:3152:1: ( '(' )
            // InternalChor4IntTxtDsl.g:3153:2: '('
            {
             before(grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3162:1: rule__EndEvent__Group_5__2 : rule__EndEvent__Group_5__2__Impl rule__EndEvent__Group_5__3 ;
    public final void rule__EndEvent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3166:1: ( rule__EndEvent__Group_5__2__Impl rule__EndEvent__Group_5__3 )
            // InternalChor4IntTxtDsl.g:3167:2: rule__EndEvent__Group_5__2__Impl rule__EndEvent__Group_5__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3174:1: rule__EndEvent__Group_5__2__Impl : ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) ) ;
    public final void rule__EndEvent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3178:1: ( ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) ) )
            // InternalChor4IntTxtDsl.g:3179:1: ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3179:1: ( ( rule__EndEvent__OutgoingsAssignment_5_2 ) )
            // InternalChor4IntTxtDsl.g:3180:2: ( rule__EndEvent__OutgoingsAssignment_5_2 )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsAssignment_5_2()); 
            // InternalChor4IntTxtDsl.g:3181:2: ( rule__EndEvent__OutgoingsAssignment_5_2 )
            // InternalChor4IntTxtDsl.g:3181:3: rule__EndEvent__OutgoingsAssignment_5_2
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
    // InternalChor4IntTxtDsl.g:3189:1: rule__EndEvent__Group_5__3 : rule__EndEvent__Group_5__3__Impl rule__EndEvent__Group_5__4 ;
    public final void rule__EndEvent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3193:1: ( rule__EndEvent__Group_5__3__Impl rule__EndEvent__Group_5__4 )
            // InternalChor4IntTxtDsl.g:3194:2: rule__EndEvent__Group_5__3__Impl rule__EndEvent__Group_5__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3201:1: rule__EndEvent__Group_5__3__Impl : ( ( rule__EndEvent__Group_5_3__0 )* ) ;
    public final void rule__EndEvent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3205:1: ( ( ( rule__EndEvent__Group_5_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3206:1: ( ( rule__EndEvent__Group_5_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3206:1: ( ( rule__EndEvent__Group_5_3__0 )* )
            // InternalChor4IntTxtDsl.g:3207:2: ( rule__EndEvent__Group_5_3__0 )*
            {
             before(grammarAccess.getEndEventAccess().getGroup_5_3()); 
            // InternalChor4IntTxtDsl.g:3208:2: ( rule__EndEvent__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3208:3: rule__EndEvent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EndEvent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalChor4IntTxtDsl.g:3216:1: rule__EndEvent__Group_5__4 : rule__EndEvent__Group_5__4__Impl ;
    public final void rule__EndEvent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3220:1: ( rule__EndEvent__Group_5__4__Impl )
            // InternalChor4IntTxtDsl.g:3221:2: rule__EndEvent__Group_5__4__Impl
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
    // InternalChor4IntTxtDsl.g:3227:1: rule__EndEvent__Group_5__4__Impl : ( ')' ) ;
    public final void rule__EndEvent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3231:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3232:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3232:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3233:2: ')'
            {
             before(grammarAccess.getEndEventAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3243:1: rule__EndEvent__Group_5_3__0 : rule__EndEvent__Group_5_3__0__Impl rule__EndEvent__Group_5_3__1 ;
    public final void rule__EndEvent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3247:1: ( rule__EndEvent__Group_5_3__0__Impl rule__EndEvent__Group_5_3__1 )
            // InternalChor4IntTxtDsl.g:3248:2: rule__EndEvent__Group_5_3__0__Impl rule__EndEvent__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3255:1: rule__EndEvent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EndEvent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3259:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3260:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3260:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3261:2: ','
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
    // InternalChor4IntTxtDsl.g:3270:1: rule__EndEvent__Group_5_3__1 : rule__EndEvent__Group_5_3__1__Impl ;
    public final void rule__EndEvent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3274:1: ( rule__EndEvent__Group_5_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3275:2: rule__EndEvent__Group_5_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:3281:1: rule__EndEvent__Group_5_3__1__Impl : ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) ) ;
    public final void rule__EndEvent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3285:1: ( ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3286:1: ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3286:1: ( ( rule__EndEvent__OutgoingsAssignment_5_3_1 ) )
            // InternalChor4IntTxtDsl.g:3287:2: ( rule__EndEvent__OutgoingsAssignment_5_3_1 )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsAssignment_5_3_1()); 
            // InternalChor4IntTxtDsl.g:3288:2: ( rule__EndEvent__OutgoingsAssignment_5_3_1 )
            // InternalChor4IntTxtDsl.g:3288:3: rule__EndEvent__OutgoingsAssignment_5_3_1
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
    // InternalChor4IntTxtDsl.g:3297:1: rule__AtomicInteraction__Group__0 : rule__AtomicInteraction__Group__0__Impl rule__AtomicInteraction__Group__1 ;
    public final void rule__AtomicInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3301:1: ( rule__AtomicInteraction__Group__0__Impl rule__AtomicInteraction__Group__1 )
            // InternalChor4IntTxtDsl.g:3302:2: rule__AtomicInteraction__Group__0__Impl rule__AtomicInteraction__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3309:1: rule__AtomicInteraction__Group__0__Impl : ( 'AtomicInteraction' ) ;
    public final void rule__AtomicInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3313:1: ( ( 'AtomicInteraction' ) )
            // InternalChor4IntTxtDsl.g:3314:1: ( 'AtomicInteraction' )
            {
            // InternalChor4IntTxtDsl.g:3314:1: ( 'AtomicInteraction' )
            // InternalChor4IntTxtDsl.g:3315:2: 'AtomicInteraction'
            {
             before(grammarAccess.getAtomicInteractionAccess().getAtomicInteractionKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3324:1: rule__AtomicInteraction__Group__1 : rule__AtomicInteraction__Group__1__Impl rule__AtomicInteraction__Group__2 ;
    public final void rule__AtomicInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3328:1: ( rule__AtomicInteraction__Group__1__Impl rule__AtomicInteraction__Group__2 )
            // InternalChor4IntTxtDsl.g:3329:2: rule__AtomicInteraction__Group__1__Impl rule__AtomicInteraction__Group__2
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
    // InternalChor4IntTxtDsl.g:3336:1: rule__AtomicInteraction__Group__1__Impl : ( ( rule__AtomicInteraction__NameAssignment_1 ) ) ;
    public final void rule__AtomicInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3340:1: ( ( ( rule__AtomicInteraction__NameAssignment_1 ) ) )
            // InternalChor4IntTxtDsl.g:3341:1: ( ( rule__AtomicInteraction__NameAssignment_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3341:1: ( ( rule__AtomicInteraction__NameAssignment_1 ) )
            // InternalChor4IntTxtDsl.g:3342:2: ( rule__AtomicInteraction__NameAssignment_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getNameAssignment_1()); 
            // InternalChor4IntTxtDsl.g:3343:2: ( rule__AtomicInteraction__NameAssignment_1 )
            // InternalChor4IntTxtDsl.g:3343:3: rule__AtomicInteraction__NameAssignment_1
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
    // InternalChor4IntTxtDsl.g:3351:1: rule__AtomicInteraction__Group__2 : rule__AtomicInteraction__Group__2__Impl rule__AtomicInteraction__Group__3 ;
    public final void rule__AtomicInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3355:1: ( rule__AtomicInteraction__Group__2__Impl rule__AtomicInteraction__Group__3 )
            // InternalChor4IntTxtDsl.g:3356:2: rule__AtomicInteraction__Group__2__Impl rule__AtomicInteraction__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalChor4IntTxtDsl.g:3363:1: rule__AtomicInteraction__Group__2__Impl : ( '{' ) ;
    public final void rule__AtomicInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3367:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:3368:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:3368:1: ( '{' )
            // InternalChor4IntTxtDsl.g:3369:2: '{'
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
    // InternalChor4IntTxtDsl.g:3378:1: rule__AtomicInteraction__Group__3 : rule__AtomicInteraction__Group__3__Impl rule__AtomicInteraction__Group__4 ;
    public final void rule__AtomicInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3382:1: ( rule__AtomicInteraction__Group__3__Impl rule__AtomicInteraction__Group__4 )
            // InternalChor4IntTxtDsl.g:3383:2: rule__AtomicInteraction__Group__3__Impl rule__AtomicInteraction__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalChor4IntTxtDsl.g:3390:1: rule__AtomicInteraction__Group__3__Impl : ( ( rule__AtomicInteraction__Group_3__0 )? ) ;
    public final void rule__AtomicInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3394:1: ( ( ( rule__AtomicInteraction__Group_3__0 )? ) )
            // InternalChor4IntTxtDsl.g:3395:1: ( ( rule__AtomicInteraction__Group_3__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3395:1: ( ( rule__AtomicInteraction__Group_3__0 )? )
            // InternalChor4IntTxtDsl.g:3396:2: ( rule__AtomicInteraction__Group_3__0 )?
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_3()); 
            // InternalChor4IntTxtDsl.g:3397:2: ( rule__AtomicInteraction__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3397:3: rule__AtomicInteraction__Group_3__0
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
    // InternalChor4IntTxtDsl.g:3405:1: rule__AtomicInteraction__Group__4 : rule__AtomicInteraction__Group__4__Impl rule__AtomicInteraction__Group__5 ;
    public final void rule__AtomicInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3409:1: ( rule__AtomicInteraction__Group__4__Impl rule__AtomicInteraction__Group__5 )
            // InternalChor4IntTxtDsl.g:3410:2: rule__AtomicInteraction__Group__4__Impl rule__AtomicInteraction__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalChor4IntTxtDsl.g:3417:1: rule__AtomicInteraction__Group__4__Impl : ( ( rule__AtomicInteraction__Group_4__0 )? ) ;
    public final void rule__AtomicInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3421:1: ( ( ( rule__AtomicInteraction__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:3422:1: ( ( rule__AtomicInteraction__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3422:1: ( ( rule__AtomicInteraction__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:3423:2: ( rule__AtomicInteraction__Group_4__0 )?
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:3424:2: ( rule__AtomicInteraction__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3424:3: rule__AtomicInteraction__Group_4__0
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
    // InternalChor4IntTxtDsl.g:3432:1: rule__AtomicInteraction__Group__5 : rule__AtomicInteraction__Group__5__Impl rule__AtomicInteraction__Group__6 ;
    public final void rule__AtomicInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3436:1: ( rule__AtomicInteraction__Group__5__Impl rule__AtomicInteraction__Group__6 )
            // InternalChor4IntTxtDsl.g:3437:2: rule__AtomicInteraction__Group__5__Impl rule__AtomicInteraction__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3444:1: rule__AtomicInteraction__Group__5__Impl : ( 'sender' ) ;
    public final void rule__AtomicInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3448:1: ( ( 'sender' ) )
            // InternalChor4IntTxtDsl.g:3449:1: ( 'sender' )
            {
            // InternalChor4IntTxtDsl.g:3449:1: ( 'sender' )
            // InternalChor4IntTxtDsl.g:3450:2: 'sender'
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3459:1: rule__AtomicInteraction__Group__6 : rule__AtomicInteraction__Group__6__Impl rule__AtomicInteraction__Group__7 ;
    public final void rule__AtomicInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3463:1: ( rule__AtomicInteraction__Group__6__Impl rule__AtomicInteraction__Group__7 )
            // InternalChor4IntTxtDsl.g:3464:2: rule__AtomicInteraction__Group__6__Impl rule__AtomicInteraction__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalChor4IntTxtDsl.g:3471:1: rule__AtomicInteraction__Group__6__Impl : ( ( rule__AtomicInteraction__SenderAssignment_6 ) ) ;
    public final void rule__AtomicInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3475:1: ( ( ( rule__AtomicInteraction__SenderAssignment_6 ) ) )
            // InternalChor4IntTxtDsl.g:3476:1: ( ( rule__AtomicInteraction__SenderAssignment_6 ) )
            {
            // InternalChor4IntTxtDsl.g:3476:1: ( ( rule__AtomicInteraction__SenderAssignment_6 ) )
            // InternalChor4IntTxtDsl.g:3477:2: ( rule__AtomicInteraction__SenderAssignment_6 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderAssignment_6()); 
            // InternalChor4IntTxtDsl.g:3478:2: ( rule__AtomicInteraction__SenderAssignment_6 )
            // InternalChor4IntTxtDsl.g:3478:3: rule__AtomicInteraction__SenderAssignment_6
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
    // InternalChor4IntTxtDsl.g:3486:1: rule__AtomicInteraction__Group__7 : rule__AtomicInteraction__Group__7__Impl rule__AtomicInteraction__Group__8 ;
    public final void rule__AtomicInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3490:1: ( rule__AtomicInteraction__Group__7__Impl rule__AtomicInteraction__Group__8 )
            // InternalChor4IntTxtDsl.g:3491:2: rule__AtomicInteraction__Group__7__Impl rule__AtomicInteraction__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3498:1: rule__AtomicInteraction__Group__7__Impl : ( 'receiver' ) ;
    public final void rule__AtomicInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3502:1: ( ( 'receiver' ) )
            // InternalChor4IntTxtDsl.g:3503:1: ( 'receiver' )
            {
            // InternalChor4IntTxtDsl.g:3503:1: ( 'receiver' )
            // InternalChor4IntTxtDsl.g:3504:2: 'receiver'
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverKeyword_7()); 
            match(input,32,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3513:1: rule__AtomicInteraction__Group__8 : rule__AtomicInteraction__Group__8__Impl rule__AtomicInteraction__Group__9 ;
    public final void rule__AtomicInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3517:1: ( rule__AtomicInteraction__Group__8__Impl rule__AtomicInteraction__Group__9 )
            // InternalChor4IntTxtDsl.g:3518:2: rule__AtomicInteraction__Group__8__Impl rule__AtomicInteraction__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalChor4IntTxtDsl.g:3525:1: rule__AtomicInteraction__Group__8__Impl : ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) ) ;
    public final void rule__AtomicInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3529:1: ( ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) ) )
            // InternalChor4IntTxtDsl.g:3530:1: ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) )
            {
            // InternalChor4IntTxtDsl.g:3530:1: ( ( rule__AtomicInteraction__ReceiverAssignment_8 ) )
            // InternalChor4IntTxtDsl.g:3531:2: ( rule__AtomicInteraction__ReceiverAssignment_8 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverAssignment_8()); 
            // InternalChor4IntTxtDsl.g:3532:2: ( rule__AtomicInteraction__ReceiverAssignment_8 )
            // InternalChor4IntTxtDsl.g:3532:3: rule__AtomicInteraction__ReceiverAssignment_8
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
    // InternalChor4IntTxtDsl.g:3540:1: rule__AtomicInteraction__Group__9 : rule__AtomicInteraction__Group__9__Impl rule__AtomicInteraction__Group__10 ;
    public final void rule__AtomicInteraction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3544:1: ( rule__AtomicInteraction__Group__9__Impl rule__AtomicInteraction__Group__10 )
            // InternalChor4IntTxtDsl.g:3545:2: rule__AtomicInteraction__Group__9__Impl rule__AtomicInteraction__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalChor4IntTxtDsl.g:3552:1: rule__AtomicInteraction__Group__9__Impl : ( ( rule__AtomicInteraction__Group_9__0 )? ) ;
    public final void rule__AtomicInteraction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3556:1: ( ( ( rule__AtomicInteraction__Group_9__0 )? ) )
            // InternalChor4IntTxtDsl.g:3557:1: ( ( rule__AtomicInteraction__Group_9__0 )? )
            {
            // InternalChor4IntTxtDsl.g:3557:1: ( ( rule__AtomicInteraction__Group_9__0 )? )
            // InternalChor4IntTxtDsl.g:3558:2: ( rule__AtomicInteraction__Group_9__0 )?
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_9()); 
            // InternalChor4IntTxtDsl.g:3559:2: ( rule__AtomicInteraction__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:3559:3: rule__AtomicInteraction__Group_9__0
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
    // InternalChor4IntTxtDsl.g:3567:1: rule__AtomicInteraction__Group__10 : rule__AtomicInteraction__Group__10__Impl ;
    public final void rule__AtomicInteraction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3571:1: ( rule__AtomicInteraction__Group__10__Impl )
            // InternalChor4IntTxtDsl.g:3572:2: rule__AtomicInteraction__Group__10__Impl
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
    // InternalChor4IntTxtDsl.g:3578:1: rule__AtomicInteraction__Group__10__Impl : ( '}' ) ;
    public final void rule__AtomicInteraction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3582:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:3583:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:3583:1: ( '}' )
            // InternalChor4IntTxtDsl.g:3584:2: '}'
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
    // InternalChor4IntTxtDsl.g:3594:1: rule__AtomicInteraction__Group_3__0 : rule__AtomicInteraction__Group_3__0__Impl rule__AtomicInteraction__Group_3__1 ;
    public final void rule__AtomicInteraction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3598:1: ( rule__AtomicInteraction__Group_3__0__Impl rule__AtomicInteraction__Group_3__1 )
            // InternalChor4IntTxtDsl.g:3599:2: rule__AtomicInteraction__Group_3__0__Impl rule__AtomicInteraction__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:3606:1: rule__AtomicInteraction__Group_3__0__Impl : ( 'incomings' ) ;
    public final void rule__AtomicInteraction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3610:1: ( ( 'incomings' ) )
            // InternalChor4IntTxtDsl.g:3611:1: ( 'incomings' )
            {
            // InternalChor4IntTxtDsl.g:3611:1: ( 'incomings' )
            // InternalChor4IntTxtDsl.g:3612:2: 'incomings'
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3621:1: rule__AtomicInteraction__Group_3__1 : rule__AtomicInteraction__Group_3__1__Impl rule__AtomicInteraction__Group_3__2 ;
    public final void rule__AtomicInteraction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3625:1: ( rule__AtomicInteraction__Group_3__1__Impl rule__AtomicInteraction__Group_3__2 )
            // InternalChor4IntTxtDsl.g:3626:2: rule__AtomicInteraction__Group_3__1__Impl rule__AtomicInteraction__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3633:1: rule__AtomicInteraction__Group_3__1__Impl : ( '(' ) ;
    public final void rule__AtomicInteraction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3637:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:3638:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:3638:1: ( '(' )
            // InternalChor4IntTxtDsl.g:3639:2: '('
            {
             before(grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3648:1: rule__AtomicInteraction__Group_3__2 : rule__AtomicInteraction__Group_3__2__Impl rule__AtomicInteraction__Group_3__3 ;
    public final void rule__AtomicInteraction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3652:1: ( rule__AtomicInteraction__Group_3__2__Impl rule__AtomicInteraction__Group_3__3 )
            // InternalChor4IntTxtDsl.g:3653:2: rule__AtomicInteraction__Group_3__2__Impl rule__AtomicInteraction__Group_3__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3660:1: rule__AtomicInteraction__Group_3__2__Impl : ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) ) ;
    public final void rule__AtomicInteraction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3664:1: ( ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) ) )
            // InternalChor4IntTxtDsl.g:3665:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3665:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_2 ) )
            // InternalChor4IntTxtDsl.g:3666:2: ( rule__AtomicInteraction__IncomingsAssignment_3_2 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsAssignment_3_2()); 
            // InternalChor4IntTxtDsl.g:3667:2: ( rule__AtomicInteraction__IncomingsAssignment_3_2 )
            // InternalChor4IntTxtDsl.g:3667:3: rule__AtomicInteraction__IncomingsAssignment_3_2
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
    // InternalChor4IntTxtDsl.g:3675:1: rule__AtomicInteraction__Group_3__3 : rule__AtomicInteraction__Group_3__3__Impl rule__AtomicInteraction__Group_3__4 ;
    public final void rule__AtomicInteraction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3679:1: ( rule__AtomicInteraction__Group_3__3__Impl rule__AtomicInteraction__Group_3__4 )
            // InternalChor4IntTxtDsl.g:3680:2: rule__AtomicInteraction__Group_3__3__Impl rule__AtomicInteraction__Group_3__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3687:1: rule__AtomicInteraction__Group_3__3__Impl : ( ( rule__AtomicInteraction__Group_3_3__0 )* ) ;
    public final void rule__AtomicInteraction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3691:1: ( ( ( rule__AtomicInteraction__Group_3_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3692:1: ( ( rule__AtomicInteraction__Group_3_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3692:1: ( ( rule__AtomicInteraction__Group_3_3__0 )* )
            // InternalChor4IntTxtDsl.g:3693:2: ( rule__AtomicInteraction__Group_3_3__0 )*
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_3_3()); 
            // InternalChor4IntTxtDsl.g:3694:2: ( rule__AtomicInteraction__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3694:3: rule__AtomicInteraction__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AtomicInteraction__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalChor4IntTxtDsl.g:3702:1: rule__AtomicInteraction__Group_3__4 : rule__AtomicInteraction__Group_3__4__Impl ;
    public final void rule__AtomicInteraction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3706:1: ( rule__AtomicInteraction__Group_3__4__Impl )
            // InternalChor4IntTxtDsl.g:3707:2: rule__AtomicInteraction__Group_3__4__Impl
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
    // InternalChor4IntTxtDsl.g:3713:1: rule__AtomicInteraction__Group_3__4__Impl : ( ')' ) ;
    public final void rule__AtomicInteraction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3717:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3718:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3718:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3719:2: ')'
            {
             before(grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3729:1: rule__AtomicInteraction__Group_3_3__0 : rule__AtomicInteraction__Group_3_3__0__Impl rule__AtomicInteraction__Group_3_3__1 ;
    public final void rule__AtomicInteraction__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3733:1: ( rule__AtomicInteraction__Group_3_3__0__Impl rule__AtomicInteraction__Group_3_3__1 )
            // InternalChor4IntTxtDsl.g:3734:2: rule__AtomicInteraction__Group_3_3__0__Impl rule__AtomicInteraction__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3741:1: rule__AtomicInteraction__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicInteraction__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3745:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3746:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3746:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3747:2: ','
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
    // InternalChor4IntTxtDsl.g:3756:1: rule__AtomicInteraction__Group_3_3__1 : rule__AtomicInteraction__Group_3_3__1__Impl ;
    public final void rule__AtomicInteraction__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3760:1: ( rule__AtomicInteraction__Group_3_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3761:2: rule__AtomicInteraction__Group_3_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:3767:1: rule__AtomicInteraction__Group_3_3__1__Impl : ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) ) ;
    public final void rule__AtomicInteraction__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3771:1: ( ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3772:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3772:1: ( ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 ) )
            // InternalChor4IntTxtDsl.g:3773:2: ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsAssignment_3_3_1()); 
            // InternalChor4IntTxtDsl.g:3774:2: ( rule__AtomicInteraction__IncomingsAssignment_3_3_1 )
            // InternalChor4IntTxtDsl.g:3774:3: rule__AtomicInteraction__IncomingsAssignment_3_3_1
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
    // InternalChor4IntTxtDsl.g:3783:1: rule__AtomicInteraction__Group_4__0 : rule__AtomicInteraction__Group_4__0__Impl rule__AtomicInteraction__Group_4__1 ;
    public final void rule__AtomicInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3787:1: ( rule__AtomicInteraction__Group_4__0__Impl rule__AtomicInteraction__Group_4__1 )
            // InternalChor4IntTxtDsl.g:3788:2: rule__AtomicInteraction__Group_4__0__Impl rule__AtomicInteraction__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalChor4IntTxtDsl.g:3795:1: rule__AtomicInteraction__Group_4__0__Impl : ( 'outgoings' ) ;
    public final void rule__AtomicInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3799:1: ( ( 'outgoings' ) )
            // InternalChor4IntTxtDsl.g:3800:1: ( 'outgoings' )
            {
            // InternalChor4IntTxtDsl.g:3800:1: ( 'outgoings' )
            // InternalChor4IntTxtDsl.g:3801:2: 'outgoings'
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3810:1: rule__AtomicInteraction__Group_4__1 : rule__AtomicInteraction__Group_4__1__Impl rule__AtomicInteraction__Group_4__2 ;
    public final void rule__AtomicInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3814:1: ( rule__AtomicInteraction__Group_4__1__Impl rule__AtomicInteraction__Group_4__2 )
            // InternalChor4IntTxtDsl.g:3815:2: rule__AtomicInteraction__Group_4__1__Impl rule__AtomicInteraction__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3822:1: rule__AtomicInteraction__Group_4__1__Impl : ( '(' ) ;
    public final void rule__AtomicInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3826:1: ( ( '(' ) )
            // InternalChor4IntTxtDsl.g:3827:1: ( '(' )
            {
            // InternalChor4IntTxtDsl.g:3827:1: ( '(' )
            // InternalChor4IntTxtDsl.g:3828:2: '('
            {
             before(grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3837:1: rule__AtomicInteraction__Group_4__2 : rule__AtomicInteraction__Group_4__2__Impl rule__AtomicInteraction__Group_4__3 ;
    public final void rule__AtomicInteraction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3841:1: ( rule__AtomicInteraction__Group_4__2__Impl rule__AtomicInteraction__Group_4__3 )
            // InternalChor4IntTxtDsl.g:3842:2: rule__AtomicInteraction__Group_4__2__Impl rule__AtomicInteraction__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3849:1: rule__AtomicInteraction__Group_4__2__Impl : ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) ) ;
    public final void rule__AtomicInteraction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3853:1: ( ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:3854:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:3854:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:3855:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_2 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:3856:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:3856:3: rule__AtomicInteraction__OutgoingsAssignment_4_2
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
    // InternalChor4IntTxtDsl.g:3864:1: rule__AtomicInteraction__Group_4__3 : rule__AtomicInteraction__Group_4__3__Impl rule__AtomicInteraction__Group_4__4 ;
    public final void rule__AtomicInteraction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3868:1: ( rule__AtomicInteraction__Group_4__3__Impl rule__AtomicInteraction__Group_4__4 )
            // InternalChor4IntTxtDsl.g:3869:2: rule__AtomicInteraction__Group_4__3__Impl rule__AtomicInteraction__Group_4__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChor4IntTxtDsl.g:3876:1: rule__AtomicInteraction__Group_4__3__Impl : ( ( rule__AtomicInteraction__Group_4_3__0 )* ) ;
    public final void rule__AtomicInteraction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3880:1: ( ( ( rule__AtomicInteraction__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:3881:1: ( ( rule__AtomicInteraction__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:3881:1: ( ( rule__AtomicInteraction__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:3882:2: ( rule__AtomicInteraction__Group_4_3__0 )*
            {
             before(grammarAccess.getAtomicInteractionAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:3883:2: ( rule__AtomicInteraction__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:3883:3: rule__AtomicInteraction__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AtomicInteraction__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalChor4IntTxtDsl.g:3891:1: rule__AtomicInteraction__Group_4__4 : rule__AtomicInteraction__Group_4__4__Impl ;
    public final void rule__AtomicInteraction__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3895:1: ( rule__AtomicInteraction__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:3896:2: rule__AtomicInteraction__Group_4__4__Impl
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
    // InternalChor4IntTxtDsl.g:3902:1: rule__AtomicInteraction__Group_4__4__Impl : ( ')' ) ;
    public final void rule__AtomicInteraction__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3906:1: ( ( ')' ) )
            // InternalChor4IntTxtDsl.g:3907:1: ( ')' )
            {
            // InternalChor4IntTxtDsl.g:3907:1: ( ')' )
            // InternalChor4IntTxtDsl.g:3908:2: ')'
            {
             before(grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3918:1: rule__AtomicInteraction__Group_4_3__0 : rule__AtomicInteraction__Group_4_3__0__Impl rule__AtomicInteraction__Group_4_3__1 ;
    public final void rule__AtomicInteraction__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3922:1: ( rule__AtomicInteraction__Group_4_3__0__Impl rule__AtomicInteraction__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:3923:2: rule__AtomicInteraction__Group_4_3__0__Impl rule__AtomicInteraction__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3930:1: rule__AtomicInteraction__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicInteraction__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3934:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:3935:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:3935:1: ( ',' )
            // InternalChor4IntTxtDsl.g:3936:2: ','
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
    // InternalChor4IntTxtDsl.g:3945:1: rule__AtomicInteraction__Group_4_3__1 : rule__AtomicInteraction__Group_4_3__1__Impl ;
    public final void rule__AtomicInteraction__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3949:1: ( rule__AtomicInteraction__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:3950:2: rule__AtomicInteraction__Group_4_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:3956:1: rule__AtomicInteraction__Group_4_3__1__Impl : ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) ) ;
    public final void rule__AtomicInteraction__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3960:1: ( ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:3961:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:3961:1: ( ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:3962:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:3963:2: ( rule__AtomicInteraction__OutgoingsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:3963:3: rule__AtomicInteraction__OutgoingsAssignment_4_3_1
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
    // InternalChor4IntTxtDsl.g:3972:1: rule__AtomicInteraction__Group_9__0 : rule__AtomicInteraction__Group_9__0__Impl rule__AtomicInteraction__Group_9__1 ;
    public final void rule__AtomicInteraction__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3976:1: ( rule__AtomicInteraction__Group_9__0__Impl rule__AtomicInteraction__Group_9__1 )
            // InternalChor4IntTxtDsl.g:3977:2: rule__AtomicInteraction__Group_9__0__Impl rule__AtomicInteraction__Group_9__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:3984:1: rule__AtomicInteraction__Group_9__0__Impl : ( 'targetOperation' ) ;
    public final void rule__AtomicInteraction__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:3988:1: ( ( 'targetOperation' ) )
            // InternalChor4IntTxtDsl.g:3989:1: ( 'targetOperation' )
            {
            // InternalChor4IntTxtDsl.g:3989:1: ( 'targetOperation' )
            // InternalChor4IntTxtDsl.g:3990:2: 'targetOperation'
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationKeyword_9_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:3999:1: rule__AtomicInteraction__Group_9__1 : rule__AtomicInteraction__Group_9__1__Impl ;
    public final void rule__AtomicInteraction__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4003:1: ( rule__AtomicInteraction__Group_9__1__Impl )
            // InternalChor4IntTxtDsl.g:4004:2: rule__AtomicInteraction__Group_9__1__Impl
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
    // InternalChor4IntTxtDsl.g:4010:1: rule__AtomicInteraction__Group_9__1__Impl : ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) ) ;
    public final void rule__AtomicInteraction__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4014:1: ( ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) ) )
            // InternalChor4IntTxtDsl.g:4015:1: ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4015:1: ( ( rule__AtomicInteraction__TargetOperationAssignment_9_1 ) )
            // InternalChor4IntTxtDsl.g:4016:2: ( rule__AtomicInteraction__TargetOperationAssignment_9_1 )
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationAssignment_9_1()); 
            // InternalChor4IntTxtDsl.g:4017:2: ( rule__AtomicInteraction__TargetOperationAssignment_9_1 )
            // InternalChor4IntTxtDsl.g:4017:3: rule__AtomicInteraction__TargetOperationAssignment_9_1
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


    // $ANTLR start "rule__Service__Group__0"
    // InternalChor4IntTxtDsl.g:4026:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4030:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalChor4IntTxtDsl.g:4031:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalChor4IntTxtDsl.g:4038:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4042:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:4043:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:4043:1: ( () )
            // InternalChor4IntTxtDsl.g:4044:2: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // InternalChor4IntTxtDsl.g:4045:2: ()
            // InternalChor4IntTxtDsl.g:4045:3: 
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
    // InternalChor4IntTxtDsl.g:4053:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4057:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalChor4IntTxtDsl.g:4058:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:4065:1: rule__Service__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4069:1: ( ( 'Service' ) )
            // InternalChor4IntTxtDsl.g:4070:1: ( 'Service' )
            {
            // InternalChor4IntTxtDsl.g:4070:1: ( 'Service' )
            // InternalChor4IntTxtDsl.g:4071:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:4080:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4084:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalChor4IntTxtDsl.g:4085:2: rule__Service__Group__2__Impl rule__Service__Group__3
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
    // InternalChor4IntTxtDsl.g:4092:1: rule__Service__Group__2__Impl : ( ( rule__Service__NameAssignment_2 ) ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4096:1: ( ( ( rule__Service__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:4097:1: ( ( rule__Service__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:4097:1: ( ( rule__Service__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:4098:2: ( rule__Service__NameAssignment_2 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:4099:2: ( rule__Service__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:4099:3: rule__Service__NameAssignment_2
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
    // InternalChor4IntTxtDsl.g:4107:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4111:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalChor4IntTxtDsl.g:4112:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalChor4IntTxtDsl.g:4119:1: rule__Service__Group__3__Impl : ( '{' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4123:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:4124:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:4124:1: ( '{' )
            // InternalChor4IntTxtDsl.g:4125:2: '{'
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
    // InternalChor4IntTxtDsl.g:4134:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4138:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalChor4IntTxtDsl.g:4139:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalChor4IntTxtDsl.g:4146:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )? ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4150:1: ( ( ( rule__Service__Group_4__0 )? ) )
            // InternalChor4IntTxtDsl.g:4151:1: ( ( rule__Service__Group_4__0 )? )
            {
            // InternalChor4IntTxtDsl.g:4151:1: ( ( rule__Service__Group_4__0 )? )
            // InternalChor4IntTxtDsl.g:4152:2: ( rule__Service__Group_4__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // InternalChor4IntTxtDsl.g:4153:2: ( rule__Service__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:4153:3: rule__Service__Group_4__0
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
    // InternalChor4IntTxtDsl.g:4161:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4165:1: ( rule__Service__Group__5__Impl )
            // InternalChor4IntTxtDsl.g:4166:2: rule__Service__Group__5__Impl
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
    // InternalChor4IntTxtDsl.g:4172:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4176:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:4177:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:4177:1: ( '}' )
            // InternalChor4IntTxtDsl.g:4178:2: '}'
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
    // InternalChor4IntTxtDsl.g:4188:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4192:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // InternalChor4IntTxtDsl.g:4193:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
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
    // InternalChor4IntTxtDsl.g:4200:1: rule__Service__Group_4__0__Impl : ( 'operations' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4204:1: ( ( 'operations' ) )
            // InternalChor4IntTxtDsl.g:4205:1: ( 'operations' )
            {
            // InternalChor4IntTxtDsl.g:4205:1: ( 'operations' )
            // InternalChor4IntTxtDsl.g:4206:2: 'operations'
            {
             before(grammarAccess.getServiceAccess().getOperationsKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:4215:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl rule__Service__Group_4__2 ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4219:1: ( rule__Service__Group_4__1__Impl rule__Service__Group_4__2 )
            // InternalChor4IntTxtDsl.g:4220:2: rule__Service__Group_4__1__Impl rule__Service__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalChor4IntTxtDsl.g:4227:1: rule__Service__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4231:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:4232:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:4232:1: ( '{' )
            // InternalChor4IntTxtDsl.g:4233:2: '{'
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
    // InternalChor4IntTxtDsl.g:4242:1: rule__Service__Group_4__2 : rule__Service__Group_4__2__Impl rule__Service__Group_4__3 ;
    public final void rule__Service__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4246:1: ( rule__Service__Group_4__2__Impl rule__Service__Group_4__3 )
            // InternalChor4IntTxtDsl.g:4247:2: rule__Service__Group_4__2__Impl rule__Service__Group_4__3
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
    // InternalChor4IntTxtDsl.g:4254:1: rule__Service__Group_4__2__Impl : ( ( rule__Service__OperationsAssignment_4_2 ) ) ;
    public final void rule__Service__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4258:1: ( ( ( rule__Service__OperationsAssignment_4_2 ) ) )
            // InternalChor4IntTxtDsl.g:4259:1: ( ( rule__Service__OperationsAssignment_4_2 ) )
            {
            // InternalChor4IntTxtDsl.g:4259:1: ( ( rule__Service__OperationsAssignment_4_2 ) )
            // InternalChor4IntTxtDsl.g:4260:2: ( rule__Service__OperationsAssignment_4_2 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_4_2()); 
            // InternalChor4IntTxtDsl.g:4261:2: ( rule__Service__OperationsAssignment_4_2 )
            // InternalChor4IntTxtDsl.g:4261:3: rule__Service__OperationsAssignment_4_2
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
    // InternalChor4IntTxtDsl.g:4269:1: rule__Service__Group_4__3 : rule__Service__Group_4__3__Impl rule__Service__Group_4__4 ;
    public final void rule__Service__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4273:1: ( rule__Service__Group_4__3__Impl rule__Service__Group_4__4 )
            // InternalChor4IntTxtDsl.g:4274:2: rule__Service__Group_4__3__Impl rule__Service__Group_4__4
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
    // InternalChor4IntTxtDsl.g:4281:1: rule__Service__Group_4__3__Impl : ( ( rule__Service__Group_4_3__0 )* ) ;
    public final void rule__Service__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4285:1: ( ( ( rule__Service__Group_4_3__0 )* ) )
            // InternalChor4IntTxtDsl.g:4286:1: ( ( rule__Service__Group_4_3__0 )* )
            {
            // InternalChor4IntTxtDsl.g:4286:1: ( ( rule__Service__Group_4_3__0 )* )
            // InternalChor4IntTxtDsl.g:4287:2: ( rule__Service__Group_4_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4_3()); 
            // InternalChor4IntTxtDsl.g:4288:2: ( rule__Service__Group_4_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalChor4IntTxtDsl.g:4288:3: rule__Service__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalChor4IntTxtDsl.g:4296:1: rule__Service__Group_4__4 : rule__Service__Group_4__4__Impl ;
    public final void rule__Service__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4300:1: ( rule__Service__Group_4__4__Impl )
            // InternalChor4IntTxtDsl.g:4301:2: rule__Service__Group_4__4__Impl
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
    // InternalChor4IntTxtDsl.g:4307:1: rule__Service__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4311:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:4312:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:4312:1: ( '}' )
            // InternalChor4IntTxtDsl.g:4313:2: '}'
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
    // InternalChor4IntTxtDsl.g:4323:1: rule__Service__Group_4_3__0 : rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 ;
    public final void rule__Service__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4327:1: ( rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 )
            // InternalChor4IntTxtDsl.g:4328:2: rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalChor4IntTxtDsl.g:4335:1: rule__Service__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4339:1: ( ( ',' ) )
            // InternalChor4IntTxtDsl.g:4340:1: ( ',' )
            {
            // InternalChor4IntTxtDsl.g:4340:1: ( ',' )
            // InternalChor4IntTxtDsl.g:4341:2: ','
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
    // InternalChor4IntTxtDsl.g:4350:1: rule__Service__Group_4_3__1 : rule__Service__Group_4_3__1__Impl ;
    public final void rule__Service__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4354:1: ( rule__Service__Group_4_3__1__Impl )
            // InternalChor4IntTxtDsl.g:4355:2: rule__Service__Group_4_3__1__Impl
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
    // InternalChor4IntTxtDsl.g:4361:1: rule__Service__Group_4_3__1__Impl : ( ( rule__Service__OperationsAssignment_4_3_1 ) ) ;
    public final void rule__Service__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4365:1: ( ( ( rule__Service__OperationsAssignment_4_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:4366:1: ( ( rule__Service__OperationsAssignment_4_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4366:1: ( ( rule__Service__OperationsAssignment_4_3_1 ) )
            // InternalChor4IntTxtDsl.g:4367:2: ( rule__Service__OperationsAssignment_4_3_1 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_4_3_1()); 
            // InternalChor4IntTxtDsl.g:4368:2: ( rule__Service__OperationsAssignment_4_3_1 )
            // InternalChor4IntTxtDsl.g:4368:3: rule__Service__OperationsAssignment_4_3_1
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
    // InternalChor4IntTxtDsl.g:4377:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4381:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalChor4IntTxtDsl.g:4382:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalChor4IntTxtDsl.g:4389:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4393:1: ( ( () ) )
            // InternalChor4IntTxtDsl.g:4394:1: ( () )
            {
            // InternalChor4IntTxtDsl.g:4394:1: ( () )
            // InternalChor4IntTxtDsl.g:4395:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalChor4IntTxtDsl.g:4396:2: ()
            // InternalChor4IntTxtDsl.g:4396:3: 
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
    // InternalChor4IntTxtDsl.g:4404:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4408:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalChor4IntTxtDsl.g:4409:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:4416:1: rule__User__Group__1__Impl : ( 'User' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4420:1: ( ( 'User' ) )
            // InternalChor4IntTxtDsl.g:4421:1: ( 'User' )
            {
            // InternalChor4IntTxtDsl.g:4421:1: ( 'User' )
            // InternalChor4IntTxtDsl.g:4422:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalChor4IntTxtDsl.g:4431:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4435:1: ( rule__User__Group__2__Impl )
            // InternalChor4IntTxtDsl.g:4436:2: rule__User__Group__2__Impl
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
    // InternalChor4IntTxtDsl.g:4442:1: rule__User__Group__2__Impl : ( ( rule__User__NameAssignment_2 ) ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4446:1: ( ( ( rule__User__NameAssignment_2 ) ) )
            // InternalChor4IntTxtDsl.g:4447:1: ( ( rule__User__NameAssignment_2 ) )
            {
            // InternalChor4IntTxtDsl.g:4447:1: ( ( rule__User__NameAssignment_2 ) )
            // InternalChor4IntTxtDsl.g:4448:2: ( rule__User__NameAssignment_2 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_2()); 
            // InternalChor4IntTxtDsl.g:4449:2: ( rule__User__NameAssignment_2 )
            // InternalChor4IntTxtDsl.g:4449:3: rule__User__NameAssignment_2
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


    // $ANTLR start "rule__Operation__Group__0"
    // InternalChor4IntTxtDsl.g:4458:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4462:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalChor4IntTxtDsl.g:4463:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:4470:1: rule__Operation__Group__0__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4474:1: ( ( 'Operation' ) )
            // InternalChor4IntTxtDsl.g:4475:1: ( 'Operation' )
            {
            // InternalChor4IntTxtDsl.g:4475:1: ( 'Operation' )
            // InternalChor4IntTxtDsl.g:4476:2: 'Operation'
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
    // InternalChor4IntTxtDsl.g:4485:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4489:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalChor4IntTxtDsl.g:4490:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
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
    // InternalChor4IntTxtDsl.g:4497:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4501:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalChor4IntTxtDsl.g:4502:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4502:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalChor4IntTxtDsl.g:4503:2: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // InternalChor4IntTxtDsl.g:4504:2: ( rule__Operation__NameAssignment_1 )
            // InternalChor4IntTxtDsl.g:4504:3: rule__Operation__NameAssignment_1
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
    // InternalChor4IntTxtDsl.g:4512:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4516:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalChor4IntTxtDsl.g:4517:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalChor4IntTxtDsl.g:4524:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4528:1: ( ( '{' ) )
            // InternalChor4IntTxtDsl.g:4529:1: ( '{' )
            {
            // InternalChor4IntTxtDsl.g:4529:1: ( '{' )
            // InternalChor4IntTxtDsl.g:4530:2: '{'
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
    // InternalChor4IntTxtDsl.g:4539:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4543:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalChor4IntTxtDsl.g:4544:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalChor4IntTxtDsl.g:4551:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4555:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // InternalChor4IntTxtDsl.g:4556:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // InternalChor4IntTxtDsl.g:4556:1: ( ( rule__Operation__Group_3__0 )? )
            // InternalChor4IntTxtDsl.g:4557:2: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // InternalChor4IntTxtDsl.g:4558:2: ( rule__Operation__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:4558:3: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalChor4IntTxtDsl.g:4566:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4570:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalChor4IntTxtDsl.g:4571:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalChor4IntTxtDsl.g:4578:1: rule__Operation__Group__4__Impl : ( 'sideEffect' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4582:1: ( ( 'sideEffect' ) )
            // InternalChor4IntTxtDsl.g:4583:1: ( 'sideEffect' )
            {
            // InternalChor4IntTxtDsl.g:4583:1: ( 'sideEffect' )
            // InternalChor4IntTxtDsl.g:4584:2: 'sideEffect'
            {
             before(grammarAccess.getOperationAccess().getSideEffectKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getSideEffectKeyword_4()); 

            }


            }

        }
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
    // InternalChor4IntTxtDsl.g:4593:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4597:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalChor4IntTxtDsl.g:4598:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalChor4IntTxtDsl.g:4605:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__SideEffectAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4609:1: ( ( ( rule__Operation__SideEffectAssignment_5 ) ) )
            // InternalChor4IntTxtDsl.g:4610:1: ( ( rule__Operation__SideEffectAssignment_5 ) )
            {
            // InternalChor4IntTxtDsl.g:4610:1: ( ( rule__Operation__SideEffectAssignment_5 ) )
            // InternalChor4IntTxtDsl.g:4611:2: ( rule__Operation__SideEffectAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getSideEffectAssignment_5()); 
            // InternalChor4IntTxtDsl.g:4612:2: ( rule__Operation__SideEffectAssignment_5 )
            // InternalChor4IntTxtDsl.g:4612:3: rule__Operation__SideEffectAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Operation__SideEffectAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getSideEffectAssignment_5()); 

            }


            }

        }
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
    // InternalChor4IntTxtDsl.g:4620:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4624:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // InternalChor4IntTxtDsl.g:4625:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:4632:1: rule__Operation__Group__6__Impl : ( 'invokingMsg' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4636:1: ( ( 'invokingMsg' ) )
            // InternalChor4IntTxtDsl.g:4637:1: ( 'invokingMsg' )
            {
            // InternalChor4IntTxtDsl.g:4637:1: ( 'invokingMsg' )
            // InternalChor4IntTxtDsl.g:4638:2: 'invokingMsg'
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getInvokingMsgKeyword_6()); 

            }


            }

        }
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
    // InternalChor4IntTxtDsl.g:4647:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl rule__Operation__Group__8 ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4651:1: ( rule__Operation__Group__7__Impl rule__Operation__Group__8 )
            // InternalChor4IntTxtDsl.g:4652:2: rule__Operation__Group__7__Impl rule__Operation__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalChor4IntTxtDsl.g:4659:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__InvokingMsgAssignment_7 ) ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4663:1: ( ( ( rule__Operation__InvokingMsgAssignment_7 ) ) )
            // InternalChor4IntTxtDsl.g:4664:1: ( ( rule__Operation__InvokingMsgAssignment_7 ) )
            {
            // InternalChor4IntTxtDsl.g:4664:1: ( ( rule__Operation__InvokingMsgAssignment_7 ) )
            // InternalChor4IntTxtDsl.g:4665:2: ( rule__Operation__InvokingMsgAssignment_7 )
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgAssignment_7()); 
            // InternalChor4IntTxtDsl.g:4666:2: ( rule__Operation__InvokingMsgAssignment_7 )
            // InternalChor4IntTxtDsl.g:4666:3: rule__Operation__InvokingMsgAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Operation__InvokingMsgAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getInvokingMsgAssignment_7()); 

            }


            }

        }
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
    // InternalChor4IntTxtDsl.g:4674:1: rule__Operation__Group__8 : rule__Operation__Group__8__Impl rule__Operation__Group__9 ;
    public final void rule__Operation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4678:1: ( rule__Operation__Group__8__Impl rule__Operation__Group__9 )
            // InternalChor4IntTxtDsl.g:4679:2: rule__Operation__Group__8__Impl rule__Operation__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Operation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__9();

            state._fsp--;


            }

        }
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
    // InternalChor4IntTxtDsl.g:4686:1: rule__Operation__Group__8__Impl : ( ( rule__Operation__Group_8__0 )? ) ;
    public final void rule__Operation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4690:1: ( ( ( rule__Operation__Group_8__0 )? ) )
            // InternalChor4IntTxtDsl.g:4691:1: ( ( rule__Operation__Group_8__0 )? )
            {
            // InternalChor4IntTxtDsl.g:4691:1: ( ( rule__Operation__Group_8__0 )? )
            // InternalChor4IntTxtDsl.g:4692:2: ( rule__Operation__Group_8__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_8()); 
            // InternalChor4IntTxtDsl.g:4693:2: ( rule__Operation__Group_8__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:4693:3: rule__Operation__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Operation__Group__9"
    // InternalChor4IntTxtDsl.g:4701:1: rule__Operation__Group__9 : rule__Operation__Group__9__Impl ;
    public final void rule__Operation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4705:1: ( rule__Operation__Group__9__Impl )
            // InternalChor4IntTxtDsl.g:4706:2: rule__Operation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__9"


    // $ANTLR start "rule__Operation__Group__9__Impl"
    // InternalChor4IntTxtDsl.g:4712:1: rule__Operation__Group__9__Impl : ( '}' ) ;
    public final void rule__Operation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4716:1: ( ( '}' ) )
            // InternalChor4IntTxtDsl.g:4717:1: ( '}' )
            {
            // InternalChor4IntTxtDsl.g:4717:1: ( '}' )
            // InternalChor4IntTxtDsl.g:4718:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__9__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // InternalChor4IntTxtDsl.g:4728:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4732:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalChor4IntTxtDsl.g:4733:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // InternalChor4IntTxtDsl.g:4740:1: rule__Operation__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4744:1: ( ( 'args' ) )
            // InternalChor4IntTxtDsl.g:4745:1: ( 'args' )
            {
            // InternalChor4IntTxtDsl.g:4745:1: ( 'args' )
            // InternalChor4IntTxtDsl.g:4746:2: 'args'
            {
             before(grammarAccess.getOperationAccess().getArgsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getArgsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // InternalChor4IntTxtDsl.g:4755:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4759:1: ( rule__Operation__Group_3__1__Impl )
            // InternalChor4IntTxtDsl.g:4760:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // InternalChor4IntTxtDsl.g:4766:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ArgsAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4770:1: ( ( ( rule__Operation__ArgsAssignment_3_1 ) ) )
            // InternalChor4IntTxtDsl.g:4771:1: ( ( rule__Operation__ArgsAssignment_3_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4771:1: ( ( rule__Operation__ArgsAssignment_3_1 ) )
            // InternalChor4IntTxtDsl.g:4772:2: ( rule__Operation__ArgsAssignment_3_1 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_1()); 
            // InternalChor4IntTxtDsl.g:4773:2: ( rule__Operation__ArgsAssignment_3_1 )
            // InternalChor4IntTxtDsl.g:4773:3: rule__Operation__ArgsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ArgsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getArgsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_8__0"
    // InternalChor4IntTxtDsl.g:4782:1: rule__Operation__Group_8__0 : rule__Operation__Group_8__0__Impl rule__Operation__Group_8__1 ;
    public final void rule__Operation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4786:1: ( rule__Operation__Group_8__0__Impl rule__Operation__Group_8__1 )
            // InternalChor4IntTxtDsl.g:4787:2: rule__Operation__Group_8__0__Impl rule__Operation__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Operation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_8__0"


    // $ANTLR start "rule__Operation__Group_8__0__Impl"
    // InternalChor4IntTxtDsl.g:4794:1: rule__Operation__Group_8__0__Impl : ( 'answeringMsg' ) ;
    public final void rule__Operation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4798:1: ( ( 'answeringMsg' ) )
            // InternalChor4IntTxtDsl.g:4799:1: ( 'answeringMsg' )
            {
            // InternalChor4IntTxtDsl.g:4799:1: ( 'answeringMsg' )
            // InternalChor4IntTxtDsl.g:4800:2: 'answeringMsg'
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgKeyword_8_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getAnsweringMsgKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_8__0__Impl"


    // $ANTLR start "rule__Operation__Group_8__1"
    // InternalChor4IntTxtDsl.g:4809:1: rule__Operation__Group_8__1 : rule__Operation__Group_8__1__Impl ;
    public final void rule__Operation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4813:1: ( rule__Operation__Group_8__1__Impl )
            // InternalChor4IntTxtDsl.g:4814:2: rule__Operation__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_8__1"


    // $ANTLR start "rule__Operation__Group_8__1__Impl"
    // InternalChor4IntTxtDsl.g:4820:1: rule__Operation__Group_8__1__Impl : ( ( rule__Operation__AnsweringMsgAssignment_8_1 ) ) ;
    public final void rule__Operation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4824:1: ( ( ( rule__Operation__AnsweringMsgAssignment_8_1 ) ) )
            // InternalChor4IntTxtDsl.g:4825:1: ( ( rule__Operation__AnsweringMsgAssignment_8_1 ) )
            {
            // InternalChor4IntTxtDsl.g:4825:1: ( ( rule__Operation__AnsweringMsgAssignment_8_1 ) )
            // InternalChor4IntTxtDsl.g:4826:2: ( rule__Operation__AnsweringMsgAssignment_8_1 )
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgAssignment_8_1()); 
            // InternalChor4IntTxtDsl.g:4827:2: ( rule__Operation__AnsweringMsgAssignment_8_1 )
            // InternalChor4IntTxtDsl.g:4827:3: rule__Operation__AnsweringMsgAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__AnsweringMsgAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAnsweringMsgAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_8__1__Impl"


    // $ANTLR start "rule__Choreography__FlowElementsAssignment_3_2"
    // InternalChor4IntTxtDsl.g:4836:1: rule__Choreography__FlowElementsAssignment_3_2 : ( ruleFlowElement ) ;
    public final void rule__Choreography__FlowElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4840:1: ( ( ruleFlowElement ) )
            // InternalChor4IntTxtDsl.g:4841:2: ( ruleFlowElement )
            {
            // InternalChor4IntTxtDsl.g:4841:2: ( ruleFlowElement )
            // InternalChor4IntTxtDsl.g:4842:3: ruleFlowElement
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
    // InternalChor4IntTxtDsl.g:4851:1: rule__Choreography__FlowElementsAssignment_3_3_1 : ( ruleFlowElement ) ;
    public final void rule__Choreography__FlowElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4855:1: ( ( ruleFlowElement ) )
            // InternalChor4IntTxtDsl.g:4856:2: ( ruleFlowElement )
            {
            // InternalChor4IntTxtDsl.g:4856:2: ( ruleFlowElement )
            // InternalChor4IntTxtDsl.g:4857:3: ruleFlowElement
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


    // $ANTLR start "rule__SequenceFlow__NameAssignment_1"
    // InternalChor4IntTxtDsl.g:4866:1: rule__SequenceFlow__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SequenceFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4870:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4871:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:4871:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4872:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:4881:1: rule__SequenceFlow__TargetAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__SequenceFlow__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4885:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:4886:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:4886:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4887:3: ( ruleEString )
            {
             before(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeCrossReference_4_0()); 
            // InternalChor4IntTxtDsl.g:4888:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4889:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:4900:1: rule__SequenceFlow__SourceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__SequenceFlow__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4904:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:4905:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:4905:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4906:3: ( ruleEString )
            {
             before(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeCrossReference_6_0()); 
            // InternalChor4IntTxtDsl.g:4907:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4908:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:4919:1: rule__ExclusiveGateway__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExclusiveGateway__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4923:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4924:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:4924:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4925:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:4934:1: rule__ExclusiveGateway__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4938:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:4939:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:4939:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4940:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:4941:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4942:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:4953:1: rule__ExclusiveGateway__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4957:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:4958:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:4958:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4959:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:4960:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4961:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:4972:1: rule__ExclusiveGateway__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4976:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:4977:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:4977:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4978:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:4979:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4980:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:4991:1: rule__ExclusiveGateway__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExclusiveGateway__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:4995:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:4996:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:4996:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:4997:3: ( ruleEString )
            {
             before(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:4998:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:4999:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5010:1: rule__ParallelGateway__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParallelGateway__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5014:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5015:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5015:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5016:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:5025:1: rule__ParallelGateway__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5029:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5030:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5030:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5031:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5032:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5033:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5044:1: rule__ParallelGateway__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5048:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5049:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5049:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5050:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5051:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5052:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5063:1: rule__ParallelGateway__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5067:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5068:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5068:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5069:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5070:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5071:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5082:1: rule__ParallelGateway__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ParallelGateway__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5086:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5087:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5087:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5088:3: ( ruleEString )
            {
             before(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5089:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5090:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5101:1: rule__StartEvent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StartEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5105:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5106:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5106:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5107:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:5116:1: rule__StartEvent__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5120:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5121:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5121:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5122:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5123:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5124:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5135:1: rule__StartEvent__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5139:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5140:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5140:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5141:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5142:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5143:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5154:1: rule__StartEvent__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5158:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5159:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5159:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5160:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5161:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5162:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5173:1: rule__StartEvent__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StartEvent__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5177:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5178:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5178:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5179:3: ( ruleEString )
            {
             before(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5180:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5181:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5192:1: rule__EndEvent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EndEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5196:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5197:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5197:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5198:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:5207:1: rule__EndEvent__IncomingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__IncomingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5211:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5212:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5212:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5213:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5214:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5215:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5226:1: rule__EndEvent__IncomingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__IncomingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5230:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5231:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5231:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5232:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5233:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5234:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5245:1: rule__EndEvent__OutgoingsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__OutgoingsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5249:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5250:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5250:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5251:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0()); 
            // InternalChor4IntTxtDsl.g:5252:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5253:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5264:1: rule__EndEvent__OutgoingsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EndEvent__OutgoingsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5268:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5269:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5269:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5270:3: ( ruleEString )
            {
             before(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5271:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5272:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5283:1: rule__AtomicInteraction__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AtomicInteraction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5287:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5288:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5288:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5289:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:5298:1: rule__AtomicInteraction__IncomingsAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__IncomingsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5302:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5303:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5303:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5304:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_2_0()); 
            // InternalChor4IntTxtDsl.g:5305:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5306:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5317:1: rule__AtomicInteraction__IncomingsAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__IncomingsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5321:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5322:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5322:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5323:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5324:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5325:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5336:1: rule__AtomicInteraction__OutgoingsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__OutgoingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5340:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5341:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5341:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5342:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_2_0()); 
            // InternalChor4IntTxtDsl.g:5343:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5344:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5355:1: rule__AtomicInteraction__OutgoingsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__OutgoingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5359:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5360:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5360:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5361:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_3_1_0()); 
            // InternalChor4IntTxtDsl.g:5362:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5363:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5374:1: rule__AtomicInteraction__SenderAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__SenderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5378:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5379:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5379:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5380:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getSenderRoleCrossReference_6_0()); 
            // InternalChor4IntTxtDsl.g:5381:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5382:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5393:1: rule__AtomicInteraction__ReceiverAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__ReceiverAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5397:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5398:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5398:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5399:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getReceiverRoleCrossReference_8_0()); 
            // InternalChor4IntTxtDsl.g:5400:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5401:4: ruleEString
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
    // InternalChor4IntTxtDsl.g:5412:1: rule__AtomicInteraction__TargetOperationAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicInteraction__TargetOperationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5416:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5417:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5417:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5418:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationCrossReference_9_1_0()); 
            // InternalChor4IntTxtDsl.g:5419:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5420:4: ruleEString
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


    // $ANTLR start "rule__Service__NameAssignment_2"
    // InternalChor4IntTxtDsl.g:5431:1: rule__Service__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5435:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5436:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5436:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5437:3: ruleEString
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
    // InternalChor4IntTxtDsl.g:5446:1: rule__Service__OperationsAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5450:1: ( ( ruleOperation ) )
            // InternalChor4IntTxtDsl.g:5451:2: ( ruleOperation )
            {
            // InternalChor4IntTxtDsl.g:5451:2: ( ruleOperation )
            // InternalChor4IntTxtDsl.g:5452:3: ruleOperation
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
    // InternalChor4IntTxtDsl.g:5461:1: rule__Service__OperationsAssignment_4_3_1 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5465:1: ( ( ruleOperation ) )
            // InternalChor4IntTxtDsl.g:5466:2: ( ruleOperation )
            {
            // InternalChor4IntTxtDsl.g:5466:2: ( ruleOperation )
            // InternalChor4IntTxtDsl.g:5467:3: ruleOperation
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
    // InternalChor4IntTxtDsl.g:5476:1: rule__User__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__User__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5480:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5481:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5481:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5482:3: ruleEString
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


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // InternalChor4IntTxtDsl.g:5491:1: rule__Operation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5495:1: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5496:2: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:5496:2: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5497:3: ruleEString
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


    // $ANTLR start "rule__Operation__ArgsAssignment_3_1"
    // InternalChor4IntTxtDsl.g:5506:1: rule__Operation__ArgsAssignment_3_1 : ( ruleEJavaObject ) ;
    public final void rule__Operation__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5510:1: ( ( ruleEJavaObject ) )
            // InternalChor4IntTxtDsl.g:5511:2: ( ruleEJavaObject )
            {
            // InternalChor4IntTxtDsl.g:5511:2: ( ruleEJavaObject )
            // InternalChor4IntTxtDsl.g:5512:3: ruleEJavaObject
            {
             before(grammarAccess.getOperationAccess().getArgsEJavaObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEJavaObject();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getArgsEJavaObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgsAssignment_3_1"


    // $ANTLR start "rule__Operation__SideEffectAssignment_5"
    // InternalChor4IntTxtDsl.g:5521:1: rule__Operation__SideEffectAssignment_5 : ( ruleEBoolean ) ;
    public final void rule__Operation__SideEffectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5525:1: ( ( ruleEBoolean ) )
            // InternalChor4IntTxtDsl.g:5526:2: ( ruleEBoolean )
            {
            // InternalChor4IntTxtDsl.g:5526:2: ( ruleEBoolean )
            // InternalChor4IntTxtDsl.g:5527:3: ruleEBoolean
            {
             before(grammarAccess.getOperationAccess().getSideEffectEBooleanParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getSideEffectEBooleanParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__SideEffectAssignment_5"


    // $ANTLR start "rule__Operation__InvokingMsgAssignment_7"
    // InternalChor4IntTxtDsl.g:5536:1: rule__Operation__InvokingMsgAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Operation__InvokingMsgAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5540:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5541:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5541:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5542:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgMessageCrossReference_7_0()); 
            // InternalChor4IntTxtDsl.g:5543:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5544:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getInvokingMsgMessageEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getInvokingMsgMessageEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getInvokingMsgMessageCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__InvokingMsgAssignment_7"


    // $ANTLR start "rule__Operation__AnsweringMsgAssignment_8_1"
    // InternalChor4IntTxtDsl.g:5555:1: rule__Operation__AnsweringMsgAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__AnsweringMsgAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChor4IntTxtDsl.g:5559:1: ( ( ( ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:5560:2: ( ( ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:5560:2: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:5561:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgMessageCrossReference_8_1_0()); 
            // InternalChor4IntTxtDsl.g:5562:3: ( ruleEString )
            // InternalChor4IntTxtDsl.g:5563:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getAnsweringMsgMessageEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getAnsweringMsgMessageEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getAnsweringMsgMessageCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__AnsweringMsgAssignment_8_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000078480000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004810000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000084800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});

}