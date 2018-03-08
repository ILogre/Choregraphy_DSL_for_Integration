package com.chor4integration.textdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.chor4integration.textdsl.services.Chor4IntTxtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChor4IntTxtDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Choreography'", "'{'", "'flowElements'", "','", "'}'", "'SequenceFlow'", "'target'", "'source'", "'ExclusiveGateway'", "'incomings'", "'('", "')'", "'outgoings'", "'ParallelGateway'", "'StartEvent'", "'EndEvent'", "'AtomicInteraction'", "'sender'", "'receiver'", "'targetOperation'", "'Service'", "'operations'", "'User'", "'Operation'", "'args'", "'sideEffect'", "'invokingMsg'", "'answeringMsg'", "'EJavaObject'", "'true'", "'false'"
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

        public InternalChor4IntTxtDslParser(TokenStream input, Chor4IntTxtDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Choreography";
       	}

       	@Override
       	protected Chor4IntTxtDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChoreography"
    // InternalChor4IntTxtDsl.g:64:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // InternalChor4IntTxtDsl.g:64:53: (iv_ruleChoreography= ruleChoreography EOF )
            // InternalChor4IntTxtDsl.g:65:2: iv_ruleChoreography= ruleChoreography EOF
            {
             newCompositeNode(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;

             current =iv_ruleChoreography; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalChor4IntTxtDsl.g:71:1: ruleChoreography returns [EObject current=null] : ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_flowElements_5_0 = null;

        EObject lv_flowElements_7_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:77:2: ( ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalChor4IntTxtDsl.g:78:2: ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalChor4IntTxtDsl.g:78:2: ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalChor4IntTxtDsl.g:79:3: () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalChor4IntTxtDsl.g:79:3: ()
            // InternalChor4IntTxtDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChoreographyAccess().getChoreographyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getChoreographyAccess().getChoreographyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChor4IntTxtDsl.g:94:3: (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:95:4: otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getChoreographyAccess().getFlowElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalChor4IntTxtDsl.g:103:4: ( (lv_flowElements_5_0= ruleFlowElement ) )
                    // InternalChor4IntTxtDsl.g:104:5: (lv_flowElements_5_0= ruleFlowElement )
                    {
                    // InternalChor4IntTxtDsl.g:104:5: (lv_flowElements_5_0= ruleFlowElement )
                    // InternalChor4IntTxtDsl.g:105:6: lv_flowElements_5_0= ruleFlowElement
                    {

                    						newCompositeNode(grammarAccess.getChoreographyAccess().getFlowElementsFlowElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_flowElements_5_0=ruleFlowElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    						}
                    						add(
                    							current,
                    							"flowElements",
                    							lv_flowElements_5_0,
                    							"com.chor4integration.textdsl.Chor4IntTxtDsl.FlowElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:122:4: (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:123:5: otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getChoreographyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:127:5: ( (lv_flowElements_7_0= ruleFlowElement ) )
                    	    // InternalChor4IntTxtDsl.g:128:6: (lv_flowElements_7_0= ruleFlowElement )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:128:6: (lv_flowElements_7_0= ruleFlowElement )
                    	    // InternalChor4IntTxtDsl.g:129:7: lv_flowElements_7_0= ruleFlowElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoreographyAccess().getFlowElementsFlowElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_flowElements_7_0=ruleFlowElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"flowElements",
                    	    								lv_flowElements_7_0,
                    	    								"com.chor4integration.textdsl.Chor4IntTxtDsl.FlowElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleFlowElement"
    // InternalChor4IntTxtDsl.g:160:1: entryRuleFlowElement returns [EObject current=null] : iv_ruleFlowElement= ruleFlowElement EOF ;
    public final EObject entryRuleFlowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowElement = null;


        try {
            // InternalChor4IntTxtDsl.g:160:52: (iv_ruleFlowElement= ruleFlowElement EOF )
            // InternalChor4IntTxtDsl.g:161:2: iv_ruleFlowElement= ruleFlowElement EOF
            {
             newCompositeNode(grammarAccess.getFlowElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowElement=ruleFlowElement();

            state._fsp--;

             current =iv_ruleFlowElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFlowElement"


    // $ANTLR start "ruleFlowElement"
    // InternalChor4IntTxtDsl.g:167:1: ruleFlowElement returns [EObject current=null] : (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction ) ;
    public final EObject ruleFlowElement() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceFlow_0 = null;

        EObject this_ExclusiveGateway_1 = null;

        EObject this_ParallelGateway_2 = null;

        EObject this_StartEvent_3 = null;

        EObject this_EndEvent_4 = null;

        EObject this_AtomicInteraction_5 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:173:2: ( (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction ) )
            // InternalChor4IntTxtDsl.g:174:2: (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction )
            {
            // InternalChor4IntTxtDsl.g:174:2: (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 27:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:175:3: this_SequenceFlow_0= ruleSequenceFlow
                    {

                    			newCompositeNode(grammarAccess.getFlowElementAccess().getSequenceFlowParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceFlow_0=ruleSequenceFlow();

                    state._fsp--;


                    			current = this_SequenceFlow_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:184:3: this_ExclusiveGateway_1= ruleExclusiveGateway
                    {

                    			newCompositeNode(grammarAccess.getFlowElementAccess().getExclusiveGatewayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExclusiveGateway_1=ruleExclusiveGateway();

                    state._fsp--;


                    			current = this_ExclusiveGateway_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalChor4IntTxtDsl.g:193:3: this_ParallelGateway_2= ruleParallelGateway
                    {

                    			newCompositeNode(grammarAccess.getFlowElementAccess().getParallelGatewayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelGateway_2=ruleParallelGateway();

                    state._fsp--;


                    			current = this_ParallelGateway_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalChor4IntTxtDsl.g:202:3: this_StartEvent_3= ruleStartEvent
                    {

                    			newCompositeNode(grammarAccess.getFlowElementAccess().getStartEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartEvent_3=ruleStartEvent();

                    state._fsp--;


                    			current = this_StartEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalChor4IntTxtDsl.g:211:3: this_EndEvent_4= ruleEndEvent
                    {

                    			newCompositeNode(grammarAccess.getFlowElementAccess().getEndEventParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndEvent_4=ruleEndEvent();

                    state._fsp--;


                    			current = this_EndEvent_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalChor4IntTxtDsl.g:220:3: this_AtomicInteraction_5= ruleAtomicInteraction
                    {

                    			newCompositeNode(grammarAccess.getFlowElementAccess().getAtomicInteractionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicInteraction_5=ruleAtomicInteraction();

                    state._fsp--;


                    			current = this_AtomicInteraction_5;
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
    // $ANTLR end "ruleFlowElement"


    // $ANTLR start "entryRuleEString"
    // InternalChor4IntTxtDsl.g:232:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalChor4IntTxtDsl.g:232:47: (iv_ruleEString= ruleEString EOF )
            // InternalChor4IntTxtDsl.g:233:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalChor4IntTxtDsl.g:239:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:245:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalChor4IntTxtDsl.g:246:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalChor4IntTxtDsl.g:246:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:247:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:255:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSequenceFlow"
    // InternalChor4IntTxtDsl.g:266:1: entryRuleSequenceFlow returns [EObject current=null] : iv_ruleSequenceFlow= ruleSequenceFlow EOF ;
    public final EObject entryRuleSequenceFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceFlow = null;


        try {
            // InternalChor4IntTxtDsl.g:266:53: (iv_ruleSequenceFlow= ruleSequenceFlow EOF )
            // InternalChor4IntTxtDsl.g:267:2: iv_ruleSequenceFlow= ruleSequenceFlow EOF
            {
             newCompositeNode(grammarAccess.getSequenceFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceFlow=ruleSequenceFlow();

            state._fsp--;

             current =iv_ruleSequenceFlow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequenceFlow"


    // $ANTLR start "ruleSequenceFlow"
    // InternalChor4IntTxtDsl.g:273:1: ruleSequenceFlow returns [EObject current=null] : (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleSequenceFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:279:2: ( (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalChor4IntTxtDsl.g:280:2: (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalChor4IntTxtDsl.g:280:2: (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalChor4IntTxtDsl.g:281:3: otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceFlowAccess().getSequenceFlowKeyword_0());
            		
            // InternalChor4IntTxtDsl.g:285:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:286:4: (lv_name_1_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:286:4: (lv_name_1_0= ruleEString )
            // InternalChor4IntTxtDsl.g:287:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceFlowAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceFlowRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceFlowAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceFlowAccess().getTargetKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:312:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:313:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:313:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:314:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeCrossReference_4_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceFlowAccess().getSourceKeyword_5());
            		
            // InternalChor4IntTxtDsl.g:332:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:333:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:333:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:334:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSequenceFlowAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSequenceFlow"


    // $ANTLR start "entryRuleExclusiveGateway"
    // InternalChor4IntTxtDsl.g:356:1: entryRuleExclusiveGateway returns [EObject current=null] : iv_ruleExclusiveGateway= ruleExclusiveGateway EOF ;
    public final EObject entryRuleExclusiveGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveGateway = null;


        try {
            // InternalChor4IntTxtDsl.g:356:57: (iv_ruleExclusiveGateway= ruleExclusiveGateway EOF )
            // InternalChor4IntTxtDsl.g:357:2: iv_ruleExclusiveGateway= ruleExclusiveGateway EOF
            {
             newCompositeNode(grammarAccess.getExclusiveGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveGateway=ruleExclusiveGateway();

            state._fsp--;

             current =iv_ruleExclusiveGateway; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExclusiveGateway"


    // $ANTLR start "ruleExclusiveGateway"
    // InternalChor4IntTxtDsl.g:363:1: ruleExclusiveGateway returns [EObject current=null] : ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleExclusiveGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:369:2: ( ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:370:2: ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:370:2: ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:371:3: () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:371:3: ()
            // InternalChor4IntTxtDsl.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:382:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:383:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:383:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:384:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExclusiveGatewayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getExclusiveGatewayAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:405:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:406:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getExclusiveGatewayAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:414:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:415:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:415:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:416:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:430:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:431:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:435:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:436:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:436:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:437:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:457:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:458:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getExclusiveGatewayAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:466:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:467:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:467:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:468:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:482:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:483:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:487:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:488:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:488:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:489:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getExclusiveGatewayAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExclusiveGateway"


    // $ANTLR start "entryRuleParallelGateway"
    // InternalChor4IntTxtDsl.g:517:1: entryRuleParallelGateway returns [EObject current=null] : iv_ruleParallelGateway= ruleParallelGateway EOF ;
    public final EObject entryRuleParallelGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelGateway = null;


        try {
            // InternalChor4IntTxtDsl.g:517:56: (iv_ruleParallelGateway= ruleParallelGateway EOF )
            // InternalChor4IntTxtDsl.g:518:2: iv_ruleParallelGateway= ruleParallelGateway EOF
            {
             newCompositeNode(grammarAccess.getParallelGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelGateway=ruleParallelGateway();

            state._fsp--;

             current =iv_ruleParallelGateway; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParallelGateway"


    // $ANTLR start "ruleParallelGateway"
    // InternalChor4IntTxtDsl.g:524:1: ruleParallelGateway returns [EObject current=null] : ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleParallelGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:530:2: ( ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:531:2: ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:531:2: ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:532:3: () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:532:3: ()
            // InternalChor4IntTxtDsl.g:533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelGatewayAccess().getParallelGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelGatewayAccess().getParallelGatewayKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:543:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:544:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:544:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:545:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParallelGatewayAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelGatewayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getParallelGatewayAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:566:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:567:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallelGatewayAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:575:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:576:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:576:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:577:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:591:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:592:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParallelGatewayAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:596:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:597:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:597:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:598:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:618:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:619:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallelGatewayAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:627:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:628:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:628:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:629:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:643:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:644:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getParallelGatewayAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:648:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:649:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:649:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:650:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getParallelGatewayAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParallelGateway"


    // $ANTLR start "entryRuleStartEvent"
    // InternalChor4IntTxtDsl.g:678:1: entryRuleStartEvent returns [EObject current=null] : iv_ruleStartEvent= ruleStartEvent EOF ;
    public final EObject entryRuleStartEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartEvent = null;


        try {
            // InternalChor4IntTxtDsl.g:678:51: (iv_ruleStartEvent= ruleStartEvent EOF )
            // InternalChor4IntTxtDsl.g:679:2: iv_ruleStartEvent= ruleStartEvent EOF
            {
             newCompositeNode(grammarAccess.getStartEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartEvent=ruleStartEvent();

            state._fsp--;

             current =iv_ruleStartEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartEvent"


    // $ANTLR start "ruleStartEvent"
    // InternalChor4IntTxtDsl.g:685:1: ruleStartEvent returns [EObject current=null] : ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleStartEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:691:2: ( ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:692:2: ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:692:2: ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:693:3: () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:693:3: ()
            // InternalChor4IntTxtDsl.g:694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartEventAccess().getStartEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getStartEventAccess().getStartEventKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:704:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:705:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:705:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:706:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStartEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStartEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:727:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:728:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getStartEventAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:736:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:737:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:737:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:738:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:752:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:753:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStartEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:757:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:758:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:758:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:759:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStartEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getStartEventAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:779:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:780:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getStartEventAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:788:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:789:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:789:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:790:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:804:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:805:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStartEventAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:809:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:810:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:810:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:811:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStartEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getStartEventAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStartEventAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStartEvent"


    // $ANTLR start "entryRuleEndEvent"
    // InternalChor4IntTxtDsl.g:839:1: entryRuleEndEvent returns [EObject current=null] : iv_ruleEndEvent= ruleEndEvent EOF ;
    public final EObject entryRuleEndEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndEvent = null;


        try {
            // InternalChor4IntTxtDsl.g:839:49: (iv_ruleEndEvent= ruleEndEvent EOF )
            // InternalChor4IntTxtDsl.g:840:2: iv_ruleEndEvent= ruleEndEvent EOF
            {
             newCompositeNode(grammarAccess.getEndEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndEvent=ruleEndEvent();

            state._fsp--;

             current =iv_ruleEndEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndEvent"


    // $ANTLR start "ruleEndEvent"
    // InternalChor4IntTxtDsl.g:846:1: ruleEndEvent returns [EObject current=null] : ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleEndEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:852:2: ( ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:853:2: ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:853:2: ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:854:3: () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:854:3: ()
            // InternalChor4IntTxtDsl.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndEventAccess().getEndEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEndEventAccess().getEndEventKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:865:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:866:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:866:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:867:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEndEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:888:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:889:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEndEventAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:897:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:898:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:898:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:899:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:913:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:914:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEndEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:918:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:919:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:919:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:920:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getEndEventAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:940:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:941:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getEndEventAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:949:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:950:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:950:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:951:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:965:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:966:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEndEventAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:970:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:971:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:971:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:972:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getEndEventAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEndEventAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEndEvent"


    // $ANTLR start "entryRuleAtomicInteraction"
    // InternalChor4IntTxtDsl.g:1000:1: entryRuleAtomicInteraction returns [EObject current=null] : iv_ruleAtomicInteraction= ruleAtomicInteraction EOF ;
    public final EObject entryRuleAtomicInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicInteraction = null;


        try {
            // InternalChor4IntTxtDsl.g:1000:58: (iv_ruleAtomicInteraction= ruleAtomicInteraction EOF )
            // InternalChor4IntTxtDsl.g:1001:2: iv_ruleAtomicInteraction= ruleAtomicInteraction EOF
            {
             newCompositeNode(grammarAccess.getAtomicInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicInteraction=ruleAtomicInteraction();

            state._fsp--;

             current =iv_ruleAtomicInteraction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomicInteraction"


    // $ANTLR start "ruleAtomicInteraction"
    // InternalChor4IntTxtDsl.g:1007:1: ruleAtomicInteraction returns [EObject current=null] : (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleAtomicInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1013:2: ( (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' ) )
            // InternalChor4IntTxtDsl.g:1014:2: (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' )
            {
            // InternalChor4IntTxtDsl.g:1014:2: (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' )
            // InternalChor4IntTxtDsl.g:1015:3: otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicInteractionAccess().getAtomicInteractionKeyword_0());
            		
            // InternalChor4IntTxtDsl.g:1019:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1020:4: (lv_name_1_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1020:4: (lv_name_1_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1021:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtomicInteractionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicInteractionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChor4IntTxtDsl.g:1042:3: (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1043:4: otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomicInteractionAccess().getIncomingsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalChor4IntTxtDsl.g:1051:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1052:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1052:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1053:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1067:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1068:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAtomicInteractionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1072:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:1073:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1073:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:1074:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:1094:3: (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1095:4: otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicInteractionAccess().getOutgoingsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:1103:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1104:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1104:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1105:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1119:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1120:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAtomicInteractionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1124:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:1125:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1125:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:1126:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getAtomicInteractionAccess().getSenderKeyword_5());
            		
            // InternalChor4IntTxtDsl.g:1150:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:1151:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1151:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:1152:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicInteractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomicInteractionAccess().getSenderRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getAtomicInteractionAccess().getReceiverKeyword_7());
            		
            // InternalChor4IntTxtDsl.g:1170:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:1171:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1171:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:1172:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicInteractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomicInteractionAccess().getReceiverRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChor4IntTxtDsl.g:1186:3: (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1187:4: otherlv_19= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getAtomicInteractionAccess().getTargetOperationKeyword_9_0());
                    			
                    // InternalChor4IntTxtDsl.g:1191:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1192:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1192:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1193:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getAtomicInteractionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAtomicInteraction"


    // $ANTLR start "entryRuleService"
    // InternalChor4IntTxtDsl.g:1216:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalChor4IntTxtDsl.g:1216:48: (iv_ruleService= ruleService EOF )
            // InternalChor4IntTxtDsl.g:1217:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalChor4IntTxtDsl.g:1223:1: ruleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_operations_8_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1229:2: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalChor4IntTxtDsl.g:1230:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalChor4IntTxtDsl.g:1230:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalChor4IntTxtDsl.g:1231:3: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalChor4IntTxtDsl.g:1231:3: ()
            // InternalChor4IntTxtDsl.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:1242:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1243:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1243:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1244:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:1265:3: (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1266:4: otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getOperationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:1274:4: ( (lv_operations_6_0= ruleOperation ) )
                    // InternalChor4IntTxtDsl.g:1275:5: (lv_operations_6_0= ruleOperation )
                    {
                    // InternalChor4IntTxtDsl.g:1275:5: (lv_operations_6_0= ruleOperation )
                    // InternalChor4IntTxtDsl.g:1276:6: lv_operations_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operations_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_6_0,
                    							"com.chor4integration.textdsl.Chor4IntTxtDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1293:4: (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1294:5: otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1298:5: ( (lv_operations_8_0= ruleOperation ) )
                    	    // InternalChor4IntTxtDsl.g:1299:6: (lv_operations_8_0= ruleOperation )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1299:6: (lv_operations_8_0= ruleOperation )
                    	    // InternalChor4IntTxtDsl.g:1300:7: lv_operations_8_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_operations_8_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_8_0,
                    	    								"com.chor4integration.textdsl.Chor4IntTxtDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleUser"
    // InternalChor4IntTxtDsl.g:1331:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalChor4IntTxtDsl.g:1331:45: (iv_ruleUser= ruleUser EOF )
            // InternalChor4IntTxtDsl.g:1332:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalChor4IntTxtDsl.g:1338:1: ruleUser returns [EObject current=null] : ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1344:2: ( ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalChor4IntTxtDsl.g:1345:2: ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalChor4IntTxtDsl.g:1345:2: ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:1346:3: () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:1346:3: ()
            // InternalChor4IntTxtDsl.g:1347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserAccess().getUserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getUserKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:1357:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1358:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1358:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1359:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleOperation"
    // InternalChor4IntTxtDsl.g:1380:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalChor4IntTxtDsl.g:1380:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalChor4IntTxtDsl.g:1381:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalChor4IntTxtDsl.g:1387:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) ) )? otherlv_5= 'sideEffect' ( (lv_sideEffect_6_0= ruleEBoolean ) ) otherlv_7= 'invokingMsg' ( ( ruleEString ) ) (otherlv_9= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_args_4_0 = null;

        AntlrDatatypeRuleToken lv_sideEffect_6_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1393:2: ( (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) ) )? otherlv_5= 'sideEffect' ( (lv_sideEffect_6_0= ruleEBoolean ) ) otherlv_7= 'invokingMsg' ( ( ruleEString ) ) (otherlv_9= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalChor4IntTxtDsl.g:1394:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) ) )? otherlv_5= 'sideEffect' ( (lv_sideEffect_6_0= ruleEBoolean ) ) otherlv_7= 'invokingMsg' ( ( ruleEString ) ) (otherlv_9= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalChor4IntTxtDsl.g:1394:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) ) )? otherlv_5= 'sideEffect' ( (lv_sideEffect_6_0= ruleEBoolean ) ) otherlv_7= 'invokingMsg' ( ( ruleEString ) ) (otherlv_9= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // InternalChor4IntTxtDsl.g:1395:3: otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) ) )? otherlv_5= 'sideEffect' ( (lv_sideEffect_6_0= ruleEBoolean ) ) otherlv_7= 'invokingMsg' ( ( ruleEString ) ) (otherlv_9= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalChor4IntTxtDsl.g:1399:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1400:4: (lv_name_1_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1400:4: (lv_name_1_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1401:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChor4IntTxtDsl.g:1422:3: (otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1423:4: otherlv_3= 'args' ( (lv_args_4_0= ruleEJavaObject ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getArgsKeyword_3_0());
                    			
                    // InternalChor4IntTxtDsl.g:1427:4: ( (lv_args_4_0= ruleEJavaObject ) )
                    // InternalChor4IntTxtDsl.g:1428:5: (lv_args_4_0= ruleEJavaObject )
                    {
                    // InternalChor4IntTxtDsl.g:1428:5: (lv_args_4_0= ruleEJavaObject )
                    // InternalChor4IntTxtDsl.g:1429:6: lv_args_4_0= ruleEJavaObject
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getArgsEJavaObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_args_4_0=ruleEJavaObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"args",
                    							lv_args_4_0,
                    							"com.chor4integration.textdsl.Chor4IntTxtDsl.EJavaObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getSideEffectKeyword_4());
            		
            // InternalChor4IntTxtDsl.g:1451:3: ( (lv_sideEffect_6_0= ruleEBoolean ) )
            // InternalChor4IntTxtDsl.g:1452:4: (lv_sideEffect_6_0= ruleEBoolean )
            {
            // InternalChor4IntTxtDsl.g:1452:4: (lv_sideEffect_6_0= ruleEBoolean )
            // InternalChor4IntTxtDsl.g:1453:5: lv_sideEffect_6_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getSideEffectEBooleanParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_sideEffect_6_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"sideEffect",
            						lv_sideEffect_6_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getInvokingMsgKeyword_6());
            		
            // InternalChor4IntTxtDsl.g:1474:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:1475:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1475:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:1476:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOperationAccess().getInvokingMsgMessageCrossReference_7_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChor4IntTxtDsl.g:1490:3: (otherlv_9= 'answeringMsg' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1491:4: otherlv_9= 'answeringMsg' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getAnsweringMsgKeyword_8_0());
                    			
                    // InternalChor4IntTxtDsl.g:1495:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1496:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1496:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1497:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getAnsweringMsgMessageCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalChor4IntTxtDsl.g:1520:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // InternalChor4IntTxtDsl.g:1520:51: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // InternalChor4IntTxtDsl.g:1521:2: iv_ruleEJavaObject= ruleEJavaObject EOF
            {
             newCompositeNode(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJavaObject=ruleEJavaObject();

            state._fsp--;

             current =iv_ruleEJavaObject.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEJavaObject"


    // $ANTLR start "ruleEJavaObject"
    // InternalChor4IntTxtDsl.g:1527:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1533:2: (kw= 'EJavaObject' )
            // InternalChor4IntTxtDsl.g:1534:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword());
            	

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
    // $ANTLR end "ruleEJavaObject"


    // $ANTLR start "entryRuleEBoolean"
    // InternalChor4IntTxtDsl.g:1542:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalChor4IntTxtDsl.g:1542:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalChor4IntTxtDsl.g:1543:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalChor4IntTxtDsl.g:1549:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1555:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalChor4IntTxtDsl.g:1556:2: (kw= 'true' | kw= 'false' )
            {
            // InternalChor4IntTxtDsl.g:1556:2: (kw= 'true' | kw= 'false' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            else if ( (LA30_0==41) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1557:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:1563:3: kw= 'false'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000F090000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000908000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000008000L});

}