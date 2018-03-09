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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Choreography'", "'{'", "'flowElements'", "','", "'}'", "'roles'", "'Role'", "'actor'", "'SequenceFlow'", "'target'", "'source'", "'ExclusiveGateway'", "'incomings'", "'('", "')'", "'outgoings'", "'ParallelGateway'", "'StartEvent'", "'EndEvent'", "'AtomicInteraction'", "'sender'", "'receiver'", "'targetOperation'", "'Operation'", "'sideEffect'", "'invokingMsg'", "'answeringMsg'", "'true'", "'false'", "'Parameter'", "'type'", "'EJavaObject'", "'Service'", "'operations'", "'User'"
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
    // InternalChor4IntTxtDsl.g:71:1: ruleChoreography returns [EObject current=null] : ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        EObject lv_flowElements_5_0 = null;

        EObject lv_flowElements_7_0 = null;

        EObject lv_roles_11_0 = null;

        EObject lv_roles_13_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:77:2: ( ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalChor4IntTxtDsl.g:78:2: ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalChor4IntTxtDsl.g:78:2: ( () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalChor4IntTxtDsl.g:79:3: () otherlv_1= 'Choreography' otherlv_2= '{' (otherlv_3= 'flowElements' otherlv_4= '{' ( (lv_flowElements_5_0= ruleFlowElement ) ) (otherlv_6= ',' ( (lv_flowElements_7_0= ruleFlowElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}' )? otherlv_15= '}'
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

            // InternalChor4IntTxtDsl.g:152:3: (otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:153:4: otherlv_9= 'roles' otherlv_10= '{' ( (lv_roles_11_0= ruleRole ) ) (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getChoreographyAccess().getRolesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:161:4: ( (lv_roles_11_0= ruleRole ) )
                    // InternalChor4IntTxtDsl.g:162:5: (lv_roles_11_0= ruleRole )
                    {
                    // InternalChor4IntTxtDsl.g:162:5: (lv_roles_11_0= ruleRole )
                    // InternalChor4IntTxtDsl.g:163:6: lv_roles_11_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getChoreographyAccess().getRolesRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_roles_11_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    						}
                    						add(
                    							current,
                    							"roles",
                    							lv_roles_11_0,
                    							"com.chor4integration.textdsl.Chor4IntTxtDsl.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:180:4: (otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:181:5: otherlv_12= ',' ( (lv_roles_13_0= ruleRole ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:185:5: ( (lv_roles_13_0= ruleRole ) )
                    	    // InternalChor4IntTxtDsl.g:186:6: (lv_roles_13_0= ruleRole )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:186:6: (lv_roles_13_0= ruleRole )
                    	    // InternalChor4IntTxtDsl.g:187:7: lv_roles_13_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoreographyAccess().getRolesRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_roles_13_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_13_0,
                    	    								"com.chor4integration.textdsl.Chor4IntTxtDsl.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalChor4IntTxtDsl.g:218:1: entryRuleFlowElement returns [EObject current=null] : iv_ruleFlowElement= ruleFlowElement EOF ;
    public final EObject entryRuleFlowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowElement = null;


        try {
            // InternalChor4IntTxtDsl.g:218:52: (iv_ruleFlowElement= ruleFlowElement EOF )
            // InternalChor4IntTxtDsl.g:219:2: iv_ruleFlowElement= ruleFlowElement EOF
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
    // InternalChor4IntTxtDsl.g:225:1: ruleFlowElement returns [EObject current=null] : (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction ) ;
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
            // InternalChor4IntTxtDsl.g:231:2: ( (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction ) )
            // InternalChor4IntTxtDsl.g:232:2: (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction )
            {
            // InternalChor4IntTxtDsl.g:232:2: (this_SequenceFlow_0= ruleSequenceFlow | this_ExclusiveGateway_1= ruleExclusiveGateway | this_ParallelGateway_2= ruleParallelGateway | this_StartEvent_3= ruleStartEvent | this_EndEvent_4= ruleEndEvent | this_AtomicInteraction_5= ruleAtomicInteraction )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:233:3: this_SequenceFlow_0= ruleSequenceFlow
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
                    // InternalChor4IntTxtDsl.g:242:3: this_ExclusiveGateway_1= ruleExclusiveGateway
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
                    // InternalChor4IntTxtDsl.g:251:3: this_ParallelGateway_2= ruleParallelGateway
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
                    // InternalChor4IntTxtDsl.g:260:3: this_StartEvent_3= ruleStartEvent
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
                    // InternalChor4IntTxtDsl.g:269:3: this_EndEvent_4= ruleEndEvent
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
                    // InternalChor4IntTxtDsl.g:278:3: this_AtomicInteraction_5= ruleAtomicInteraction
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


    // $ANTLR start "entryRuleRole"
    // InternalChor4IntTxtDsl.g:290:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalChor4IntTxtDsl.g:290:45: (iv_ruleRole= ruleRole EOF )
            // InternalChor4IntTxtDsl.g:291:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalChor4IntTxtDsl.g:297:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:303:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalChor4IntTxtDsl.g:304:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalChor4IntTxtDsl.g:304:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalChor4IntTxtDsl.g:305:3: () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalChor4IntTxtDsl.g:305:3: ()
            // InternalChor4IntTxtDsl.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:316:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:317:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:317:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:318:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:339:3: (otherlv_4= 'actor' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:340:4: otherlv_4= 'actor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getActorKeyword_4_0());
                    			
                    // InternalChor4IntTxtDsl.g:344:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:345:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:345:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:346:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getActorActorCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEString"
    // InternalChor4IntTxtDsl.g:369:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalChor4IntTxtDsl.g:369:47: (iv_ruleEString= ruleEString EOF )
            // InternalChor4IntTxtDsl.g:370:2: iv_ruleEString= ruleEString EOF
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
    // InternalChor4IntTxtDsl.g:376:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:382:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalChor4IntTxtDsl.g:383:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalChor4IntTxtDsl.g:383:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:384:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:392:3: this_ID_1= RULE_ID
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
    // InternalChor4IntTxtDsl.g:403:1: entryRuleSequenceFlow returns [EObject current=null] : iv_ruleSequenceFlow= ruleSequenceFlow EOF ;
    public final EObject entryRuleSequenceFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceFlow = null;


        try {
            // InternalChor4IntTxtDsl.g:403:53: (iv_ruleSequenceFlow= ruleSequenceFlow EOF )
            // InternalChor4IntTxtDsl.g:404:2: iv_ruleSequenceFlow= ruleSequenceFlow EOF
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
    // InternalChor4IntTxtDsl.g:410:1: ruleSequenceFlow returns [EObject current=null] : (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:416:2: ( (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalChor4IntTxtDsl.g:417:2: (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalChor4IntTxtDsl.g:417:2: (otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalChor4IntTxtDsl.g:418:3: otherlv_0= 'SequenceFlow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( ( ruleEString ) ) otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceFlowAccess().getSequenceFlowKeyword_0());
            		
            // InternalChor4IntTxtDsl.g:422:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:423:4: (lv_name_1_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:423:4: (lv_name_1_0= ruleEString )
            // InternalChor4IntTxtDsl.g:424:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceFlowAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceFlowAccess().getTargetKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:449:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:450:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:450:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:451:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceFlowAccess().getSourceKeyword_5());
            		
            // InternalChor4IntTxtDsl.g:469:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:470:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:470:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:471:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalChor4IntTxtDsl.g:493:1: entryRuleExclusiveGateway returns [EObject current=null] : iv_ruleExclusiveGateway= ruleExclusiveGateway EOF ;
    public final EObject entryRuleExclusiveGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveGateway = null;


        try {
            // InternalChor4IntTxtDsl.g:493:57: (iv_ruleExclusiveGateway= ruleExclusiveGateway EOF )
            // InternalChor4IntTxtDsl.g:494:2: iv_ruleExclusiveGateway= ruleExclusiveGateway EOF
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
    // InternalChor4IntTxtDsl.g:500:1: ruleExclusiveGateway returns [EObject current=null] : ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:506:2: ( ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:507:2: ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:507:2: ( () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:508:3: () otherlv_1= 'ExclusiveGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:508:3: ()
            // InternalChor4IntTxtDsl.g:509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveGatewayAccess().getExclusiveGatewayKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:519:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:520:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:520:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:521:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getExclusiveGatewayAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:542:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:543:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getExclusiveGatewayAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:551:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:552:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:552:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:553:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:567:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:568:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:572:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:573:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:573:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:574:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getExclusiveGatewayAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:594:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:595:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getExclusiveGatewayAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getExclusiveGatewayAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:603:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:604:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:604:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:605:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:619:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:620:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getExclusiveGatewayAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:624:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:625:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:625:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:626:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExclusiveGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExclusiveGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_9); 

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
    // InternalChor4IntTxtDsl.g:654:1: entryRuleParallelGateway returns [EObject current=null] : iv_ruleParallelGateway= ruleParallelGateway EOF ;
    public final EObject entryRuleParallelGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelGateway = null;


        try {
            // InternalChor4IntTxtDsl.g:654:56: (iv_ruleParallelGateway= ruleParallelGateway EOF )
            // InternalChor4IntTxtDsl.g:655:2: iv_ruleParallelGateway= ruleParallelGateway EOF
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
    // InternalChor4IntTxtDsl.g:661:1: ruleParallelGateway returns [EObject current=null] : ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:667:2: ( ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:668:2: ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:668:2: ( () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:669:3: () otherlv_1= 'ParallelGateway' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:669:3: ()
            // InternalChor4IntTxtDsl.g:670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelGatewayAccess().getParallelGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelGatewayAccess().getParallelGatewayKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:680:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:681:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:681:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:682:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getParallelGatewayAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:703:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:704:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallelGatewayAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:712:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:713:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:713:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:714:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:728:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:729:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParallelGatewayAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:733:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:734:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:734:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:735:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelGatewayAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getParallelGatewayAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:755:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:756:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallelGatewayAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallelGatewayAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:764:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:765:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:765:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:766:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:780:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:781:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getParallelGatewayAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:785:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:786:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:786:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:787:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelGatewayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelGatewayAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_9); 

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
    // InternalChor4IntTxtDsl.g:815:1: entryRuleStartEvent returns [EObject current=null] : iv_ruleStartEvent= ruleStartEvent EOF ;
    public final EObject entryRuleStartEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartEvent = null;


        try {
            // InternalChor4IntTxtDsl.g:815:51: (iv_ruleStartEvent= ruleStartEvent EOF )
            // InternalChor4IntTxtDsl.g:816:2: iv_ruleStartEvent= ruleStartEvent EOF
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
    // InternalChor4IntTxtDsl.g:822:1: ruleStartEvent returns [EObject current=null] : ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:828:2: ( ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:829:2: ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:829:2: ( () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:830:3: () otherlv_1= 'StartEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:830:3: ()
            // InternalChor4IntTxtDsl.g:831:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartEventAccess().getStartEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStartEventAccess().getStartEventKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:841:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:842:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:842:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:843:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getStartEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:864:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:865:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getStartEventAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:873:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:874:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:874:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:875:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:889:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:890:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStartEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:894:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:895:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:895:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:896:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStartEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStartEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getStartEventAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:916:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:917:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getStartEventAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getStartEventAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:925:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:926:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:926:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:927:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:941:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:942:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStartEventAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:946:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:947:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:947:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:948:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStartEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStartEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_9); 

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
    // InternalChor4IntTxtDsl.g:976:1: entryRuleEndEvent returns [EObject current=null] : iv_ruleEndEvent= ruleEndEvent EOF ;
    public final EObject entryRuleEndEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndEvent = null;


        try {
            // InternalChor4IntTxtDsl.g:976:49: (iv_ruleEndEvent= ruleEndEvent EOF )
            // InternalChor4IntTxtDsl.g:977:2: iv_ruleEndEvent= ruleEndEvent EOF
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
    // InternalChor4IntTxtDsl.g:983:1: ruleEndEvent returns [EObject current=null] : ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:989:2: ( ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalChor4IntTxtDsl.g:990:2: ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalChor4IntTxtDsl.g:990:2: ( () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalChor4IntTxtDsl.g:991:3: () otherlv_1= 'EndEvent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalChor4IntTxtDsl.g:991:3: ()
            // InternalChor4IntTxtDsl.g:992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndEventAccess().getEndEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEndEventAccess().getEndEventKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:1002:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1003:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1003:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1004:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEndEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:1025:3: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1026:4: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getEndEventAccess().getIncomingsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:1034:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1035:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1035:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1036:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1050:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1051:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEndEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1055:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:1056:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1056:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:1057:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndEventAccess().getIncomingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getEndEventAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:1077:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1078:4: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getEndEventAccess().getOutgoingsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getEndEventAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChor4IntTxtDsl.g:1086:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1087:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1087:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1088:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1102:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1103:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEndEventAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1107:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:1108:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1108:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:1109:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndEventAccess().getOutgoingsSequenceFlowCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_9); 

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
    // InternalChor4IntTxtDsl.g:1137:1: entryRuleAtomicInteraction returns [EObject current=null] : iv_ruleAtomicInteraction= ruleAtomicInteraction EOF ;
    public final EObject entryRuleAtomicInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicInteraction = null;


        try {
            // InternalChor4IntTxtDsl.g:1137:58: (iv_ruleAtomicInteraction= ruleAtomicInteraction EOF )
            // InternalChor4IntTxtDsl.g:1138:2: iv_ruleAtomicInteraction= ruleAtomicInteraction EOF
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
    // InternalChor4IntTxtDsl.g:1144:1: ruleAtomicInteraction returns [EObject current=null] : (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:1150:2: ( (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' ) )
            // InternalChor4IntTxtDsl.g:1151:2: (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' )
            {
            // InternalChor4IntTxtDsl.g:1151:2: (otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}' )
            // InternalChor4IntTxtDsl.g:1152:3: otherlv_0= 'AtomicInteraction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'sender' ( ( ruleEString ) ) otherlv_17= 'receiver' ( ( ruleEString ) ) (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicInteractionAccess().getAtomicInteractionKeyword_0());
            		
            // InternalChor4IntTxtDsl.g:1156:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1157:4: (lv_name_1_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1157:4: (lv_name_1_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1158:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChor4IntTxtDsl.g:1179:3: (otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1180:4: otherlv_3= 'incomings' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomicInteractionAccess().getIncomingsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalChor4IntTxtDsl.g:1188:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1189:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1189:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1190:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1204:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1205:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAtomicInteractionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1209:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:1210:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1210:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:1211:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicInteractionAccess().getIncomingsSequenceFlowCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalChor4IntTxtDsl.g:1231:3: (otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1232:4: otherlv_9= 'outgoings' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicInteractionAccess().getOutgoingsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicInteractionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:1240:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1241:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1241:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1242:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChor4IntTxtDsl.g:1256:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1257:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAtomicInteractionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1261:5: ( ( ruleEString ) )
                    	    // InternalChor4IntTxtDsl.g:1262:6: ( ruleEString )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1262:6: ( ruleEString )
                    	    // InternalChor4IntTxtDsl.g:1263:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicInteractionAccess().getOutgoingsSequenceFlowCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getAtomicInteractionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getAtomicInteractionAccess().getSenderKeyword_5());
            		
            // InternalChor4IntTxtDsl.g:1287:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:1288:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1288:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:1289:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicInteractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomicInteractionAccess().getSenderRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getAtomicInteractionAccess().getReceiverKeyword_7());
            		
            // InternalChor4IntTxtDsl.g:1307:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:1308:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1308:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:1309:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicInteractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomicInteractionAccess().getReceiverRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChor4IntTxtDsl.g:1323:3: (otherlv_19= 'targetOperation' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1324:4: otherlv_19= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getAtomicInteractionAccess().getTargetOperationKeyword_9_0());
                    			
                    // InternalChor4IntTxtDsl.g:1328:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1329:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1329:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1330:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicInteractionAccess().getTargetOperationOperationCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_9);
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


    // $ANTLR start "entryRuleOperation"
    // InternalChor4IntTxtDsl.g:1353:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalChor4IntTxtDsl.g:1353:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalChor4IntTxtDsl.g:1354:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalChor4IntTxtDsl.g:1360:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sideEffect' ( (lv_sideEffect_4_0= ruleEBoolean ) ) otherlv_5= 'invokingMsg' ( ( ruleEString ) ) (otherlv_7= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sideEffect_4_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1366:2: ( (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sideEffect' ( (lv_sideEffect_4_0= ruleEBoolean ) ) otherlv_5= 'invokingMsg' ( ( ruleEString ) ) (otherlv_7= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalChor4IntTxtDsl.g:1367:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sideEffect' ( (lv_sideEffect_4_0= ruleEBoolean ) ) otherlv_5= 'invokingMsg' ( ( ruleEString ) ) (otherlv_7= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalChor4IntTxtDsl.g:1367:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sideEffect' ( (lv_sideEffect_4_0= ruleEBoolean ) ) otherlv_5= 'invokingMsg' ( ( ruleEString ) ) (otherlv_7= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalChor4IntTxtDsl.g:1368:3: otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sideEffect' ( (lv_sideEffect_4_0= ruleEBoolean ) ) otherlv_5= 'invokingMsg' ( ( ruleEString ) ) (otherlv_7= 'answeringMsg' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalChor4IntTxtDsl.g:1372:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1373:4: (lv_name_1_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1373:4: (lv_name_1_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1374:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getSideEffectKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:1399:3: ( (lv_sideEffect_4_0= ruleEBoolean ) )
            // InternalChor4IntTxtDsl.g:1400:4: (lv_sideEffect_4_0= ruleEBoolean )
            {
            // InternalChor4IntTxtDsl.g:1400:4: (lv_sideEffect_4_0= ruleEBoolean )
            // InternalChor4IntTxtDsl.g:1401:5: lv_sideEffect_4_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getSideEffectEBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_sideEffect_4_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"sideEffect",
            						lv_sideEffect_4_0,
            						"com.chor4integration.textdsl.Chor4IntTxtDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getInvokingMsgKeyword_5());
            		
            // InternalChor4IntTxtDsl.g:1422:3: ( ( ruleEString ) )
            // InternalChor4IntTxtDsl.g:1423:4: ( ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1423:4: ( ruleEString )
            // InternalChor4IntTxtDsl.g:1424:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOperationAccess().getInvokingMsgMessageCrossReference_6_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChor4IntTxtDsl.g:1438:3: (otherlv_7= 'answeringMsg' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1439:4: otherlv_7= 'answeringMsg' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getAnsweringMsgKeyword_7_0());
                    			
                    // InternalChor4IntTxtDsl.g:1443:4: ( ( ruleEString ) )
                    // InternalChor4IntTxtDsl.g:1444:5: ( ruleEString )
                    {
                    // InternalChor4IntTxtDsl.g:1444:5: ( ruleEString )
                    // InternalChor4IntTxtDsl.g:1445:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getAnsweringMsgMessageCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalChor4IntTxtDsl.g:1468:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalChor4IntTxtDsl.g:1468:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalChor4IntTxtDsl.g:1469:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalChor4IntTxtDsl.g:1475:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1481:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalChor4IntTxtDsl.g:1482:2: (kw= 'true' | kw= 'false' )
            {
            // InternalChor4IntTxtDsl.g:1482:2: (kw= 'true' | kw= 'false' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( (LA30_0==39) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1483:3: kw= 'true'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChor4IntTxtDsl.g:1489:3: kw= 'false'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameter"
    // InternalChor4IntTxtDsl.g:1498:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalChor4IntTxtDsl.g:1498:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalChor4IntTxtDsl.g:1499:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalChor4IntTxtDsl.g:1505:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1511:2: ( ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) ) )? otherlv_5= '}' ) )
            // InternalChor4IntTxtDsl.g:1512:2: ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) ) )? otherlv_5= '}' )
            {
            // InternalChor4IntTxtDsl.g:1512:2: ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) ) )? otherlv_5= '}' )
            // InternalChor4IntTxtDsl.g:1513:3: () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) ) )? otherlv_5= '}'
            {
            // InternalChor4IntTxtDsl.g:1513:3: ()
            // InternalChor4IntTxtDsl.g:1514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChor4IntTxtDsl.g:1528:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1529:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaObject ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3_0());
                    			
                    // InternalChor4IntTxtDsl.g:1533:4: ( (lv_type_4_0= ruleEJavaObject ) )
                    // InternalChor4IntTxtDsl.g:1534:5: (lv_type_4_0= ruleEJavaObject )
                    {
                    // InternalChor4IntTxtDsl.g:1534:5: (lv_type_4_0= ruleEJavaObject )
                    // InternalChor4IntTxtDsl.g:1535:6: lv_type_4_0= ruleEJavaObject
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeEJavaObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_type_4_0=ruleEJavaObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"com.chor4integration.textdsl.Chor4IntTxtDsl.EJavaObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalChor4IntTxtDsl.g:1561:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // InternalChor4IntTxtDsl.g:1561:51: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // InternalChor4IntTxtDsl.g:1562:2: iv_ruleEJavaObject= ruleEJavaObject EOF
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
    // InternalChor4IntTxtDsl.g:1568:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1574:2: (kw= 'EJavaObject' )
            // InternalChor4IntTxtDsl.g:1575:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

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


    // $ANTLR start "entryRuleService"
    // InternalChor4IntTxtDsl.g:1583:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalChor4IntTxtDsl.g:1583:48: (iv_ruleService= ruleService EOF )
            // InternalChor4IntTxtDsl.g:1584:2: iv_ruleService= ruleService EOF
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
    // InternalChor4IntTxtDsl.g:1590:1: ruleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalChor4IntTxtDsl.g:1596:2: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalChor4IntTxtDsl.g:1597:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalChor4IntTxtDsl.g:1597:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalChor4IntTxtDsl.g:1598:3: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalChor4IntTxtDsl.g:1598:3: ()
            // InternalChor4IntTxtDsl.g:1599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:1609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1610:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1610:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1611:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalChor4IntTxtDsl.g:1632:3: (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalChor4IntTxtDsl.g:1633:4: otherlv_4= 'operations' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getOperationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalChor4IntTxtDsl.g:1641:4: ( (lv_operations_6_0= ruleOperation ) )
                    // InternalChor4IntTxtDsl.g:1642:5: (lv_operations_6_0= ruleOperation )
                    {
                    // InternalChor4IntTxtDsl.g:1642:5: (lv_operations_6_0= ruleOperation )
                    // InternalChor4IntTxtDsl.g:1643:6: lv_operations_6_0= ruleOperation
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

                    // InternalChor4IntTxtDsl.g:1660:4: (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalChor4IntTxtDsl.g:1661:5: otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_30); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalChor4IntTxtDsl.g:1665:5: ( (lv_operations_8_0= ruleOperation ) )
                    	    // InternalChor4IntTxtDsl.g:1666:6: (lv_operations_8_0= ruleOperation )
                    	    {
                    	    // InternalChor4IntTxtDsl.g:1666:6: (lv_operations_8_0= ruleOperation )
                    	    // InternalChor4IntTxtDsl.g:1667:7: lv_operations_8_0= ruleOperation
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

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
    // InternalChor4IntTxtDsl.g:1698:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalChor4IntTxtDsl.g:1698:45: (iv_ruleUser= ruleUser EOF )
            // InternalChor4IntTxtDsl.g:1699:2: iv_ruleUser= ruleUser EOF
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
    // InternalChor4IntTxtDsl.g:1705:1: ruleUser returns [EObject current=null] : ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalChor4IntTxtDsl.g:1711:2: ( ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalChor4IntTxtDsl.g:1712:2: ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalChor4IntTxtDsl.g:1712:2: ( () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) ) )
            // InternalChor4IntTxtDsl.g:1713:3: () otherlv_1= 'User' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalChor4IntTxtDsl.g:1713:3: ()
            // InternalChor4IntTxtDsl.g:1714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserAccess().getUserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getUserKeyword_1());
            		
            // InternalChor4IntTxtDsl.g:1724:3: ( (lv_name_2_0= ruleEString ) )
            // InternalChor4IntTxtDsl.g:1725:4: (lv_name_2_0= ruleEString )
            {
            // InternalChor4IntTxtDsl.g:1725:4: (lv_name_2_0= ruleEString )
            // InternalChor4IntTxtDsl.g:1726:5: lv_name_2_0= ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000078480000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004808000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000084800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});

}