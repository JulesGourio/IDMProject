package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'", "'notes'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalPDL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL3.g"; }



     	private PDL3GrammarAccess grammarAccess;

        public InternalPDL3Parser(TokenStream input, PDL3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL3.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL3.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL3.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';' )? (otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';' )? (otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';' )? ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_workDefinitions_5_0 = null;

        EObject lv_workDefinitions_7_0 = null;

        EObject lv_workSequences_11_0 = null;

        EObject lv_workSequences_13_0 = null;

        EObject lv_guidances_17_0 = null;

        EObject lv_guidances_19_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:78:2: ( (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';' )? (otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';' )? (otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';' )? ) )
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';' )? (otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';' )? (otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';' )? )
            {
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';' )? (otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';' )? (otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';' )? )
            // InternalPDL3.g:80:3: otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';' )? (otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';' )? (otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalPDL3.g:88:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            // InternalPDL3.g:90:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPDL3.g:106:3: (otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL3.g:107:4: otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )* otherlv_8= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getColonKeyword_3_1());
                    			
                    // InternalPDL3.g:115:4: ( (lv_workDefinitions_5_0= ruleWorkDefinitionRef ) )
                    // InternalPDL3.g:116:5: (lv_workDefinitions_5_0= ruleWorkDefinitionRef )
                    {
                    // InternalPDL3.g:116:5: (lv_workDefinitions_5_0= ruleWorkDefinitionRef )
                    // InternalPDL3.g:117:6: lv_workDefinitions_5_0= ruleWorkDefinitionRef
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionRefParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_workDefinitions_5_0=ruleWorkDefinitionRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"workDefinitions",
                    							lv_workDefinitions_5_0,
                    							"fr.n7.PDL3.WorkDefinitionRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL3.g:134:4: (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==RULE_ID) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPDL3.g:135:5: otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getSemicolonKeyword_3_3_0());
                    	    				
                    	    // InternalPDL3.g:139:5: ( (lv_workDefinitions_7_0= ruleWorkDefinitionRef ) )
                    	    // InternalPDL3.g:140:6: (lv_workDefinitions_7_0= ruleWorkDefinitionRef )
                    	    {
                    	    // InternalPDL3.g:140:6: (lv_workDefinitions_7_0= ruleWorkDefinitionRef )
                    	    // InternalPDL3.g:141:7: lv_workDefinitions_7_0= ruleWorkDefinitionRef
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionRefParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_workDefinitions_7_0=ruleWorkDefinitionRef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"workDefinitions",
                    	    								lv_workDefinitions_7_0,
                    	    								"fr.n7.PDL3.WorkDefinitionRef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getSemicolonKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalPDL3.g:164:3: (otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL3.g:165:4: otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequenceRef ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )* otherlv_14= ';'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getWorksequencesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getColonKeyword_4_1());
                    			
                    // InternalPDL3.g:173:4: ( (lv_workSequences_11_0= ruleWorkSequenceRef ) )
                    // InternalPDL3.g:174:5: (lv_workSequences_11_0= ruleWorkSequenceRef )
                    {
                    // InternalPDL3.g:174:5: (lv_workSequences_11_0= ruleWorkSequenceRef )
                    // InternalPDL3.g:175:6: lv_workSequences_11_0= ruleWorkSequenceRef
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceRefParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_workSequences_11_0=ruleWorkSequenceRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"workSequences",
                    							lv_workSequences_11_0,
                    							"fr.n7.PDL3.WorkSequenceRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL3.g:192:4: (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPDL3.g:193:5: otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequenceRef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getSemicolonKeyword_4_3_0());
                    	    				
                    	    // InternalPDL3.g:197:5: ( (lv_workSequences_13_0= ruleWorkSequenceRef ) )
                    	    // InternalPDL3.g:198:6: (lv_workSequences_13_0= ruleWorkSequenceRef )
                    	    {
                    	    // InternalPDL3.g:198:6: (lv_workSequences_13_0= ruleWorkSequenceRef )
                    	    // InternalPDL3.g:199:7: lv_workSequences_13_0= ruleWorkSequenceRef
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceRefParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_workSequences_13_0=ruleWorkSequenceRef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"workSequences",
                    	    								lv_workSequences_13_0,
                    	    								"fr.n7.PDL3.WorkSequenceRef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getSemicolonKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPDL3.g:222:3: (otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL3.g:223:4: otherlv_15= 'notes' otherlv_16= ':' ( (lv_guidances_17_0= ruleGuidanceRef ) ) (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )* otherlv_20= ';'
                    {
                    otherlv_15=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getNotesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcessAccess().getColonKeyword_5_1());
                    			
                    // InternalPDL3.g:231:4: ( (lv_guidances_17_0= ruleGuidanceRef ) )
                    // InternalPDL3.g:232:5: (lv_guidances_17_0= ruleGuidanceRef )
                    {
                    // InternalPDL3.g:232:5: (lv_guidances_17_0= ruleGuidanceRef )
                    // InternalPDL3.g:233:6: lv_guidances_17_0= ruleGuidanceRef
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getGuidancesGuidanceRefParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_guidances_17_0=ruleGuidanceRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"guidances",
                    							lv_guidances_17_0,
                    							"fr.n7.PDL3.GuidanceRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL3.g:250:4: (otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==RULE_STRING) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPDL3.g:251:5: otherlv_18= ';' ( (lv_guidances_19_0= ruleGuidanceRef ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getSemicolonKeyword_5_3_0());
                    	    				
                    	    // InternalPDL3.g:255:5: ( (lv_guidances_19_0= ruleGuidanceRef ) )
                    	    // InternalPDL3.g:256:6: (lv_guidances_19_0= ruleGuidanceRef )
                    	    {
                    	    // InternalPDL3.g:256:6: (lv_guidances_19_0= ruleGuidanceRef )
                    	    // InternalPDL3.g:257:7: lv_guidances_19_0= ruleGuidanceRef
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getGuidancesGuidanceRefParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_guidances_19_0=ruleGuidanceRef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guidances",
                    	    								lv_guidances_19_0,
                    	    								"fr.n7.PDL3.GuidanceRef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getProcessAccess().getSemicolonKeyword_5_4());
                    			

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkDefinitionRef"
    // InternalPDL3.g:284:1: entryRuleWorkDefinitionRef returns [EObject current=null] : iv_ruleWorkDefinitionRef= ruleWorkDefinitionRef EOF ;
    public final EObject entryRuleWorkDefinitionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinitionRef = null;


        try {
            // InternalPDL3.g:284:58: (iv_ruleWorkDefinitionRef= ruleWorkDefinitionRef EOF )
            // InternalPDL3.g:285:2: iv_ruleWorkDefinitionRef= ruleWorkDefinitionRef EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinitionRef=ruleWorkDefinitionRef();

            state._fsp--;

             current =iv_ruleWorkDefinitionRef; 
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
    // $ANTLR end "entryRuleWorkDefinitionRef"


    // $ANTLR start "ruleWorkDefinitionRef"
    // InternalPDL3.g:291:1: ruleWorkDefinitionRef returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleWorkDefinitionRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPDL3.g:298:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPDL3.g:298:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPDL3.g:299:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPDL3.g:299:3: (lv_name_0_0= RULE_ID )
            // InternalPDL3.g:300:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getWorkDefinitionRefAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWorkDefinitionRefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleWorkDefinitionRef"


    // $ANTLR start "entryRuleWorkSequenceRef"
    // InternalPDL3.g:319:1: entryRuleWorkSequenceRef returns [EObject current=null] : iv_ruleWorkSequenceRef= ruleWorkSequenceRef EOF ;
    public final EObject entryRuleWorkSequenceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequenceRef = null;


        try {
            // InternalPDL3.g:319:56: (iv_ruleWorkSequenceRef= ruleWorkSequenceRef EOF )
            // InternalPDL3.g:320:2: iv_ruleWorkSequenceRef= ruleWorkSequenceRef EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequenceRef=ruleWorkSequenceRef();

            state._fsp--;

             current =iv_ruleWorkSequenceRef; 
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
    // $ANTLR end "entryRuleWorkSequenceRef"


    // $ANTLR start "ruleWorkSequenceRef"
    // InternalPDL3.g:326:1: ruleWorkSequenceRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequenceRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:332:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPDL3.g:333:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPDL3.g:333:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPDL3.g:334:3: ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPDL3.g:334:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL3.g:335:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL3.g:335:4: (otherlv_0= RULE_ID )
            // InternalPDL3.g:336:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getWorkSequenceRefAccess().getPredecessorWorkDefinitionRefCrossReference_0_0());
            				

            }


            }

            // InternalPDL3.g:347:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL3.g:348:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL3.g:348:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL3.g:349:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceRefAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRefRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL3.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:366:3: ( (otherlv_2= RULE_ID ) )
            // InternalPDL3.g:367:4: (otherlv_2= RULE_ID )
            {
            // InternalPDL3.g:367:4: (otherlv_2= RULE_ID )
            // InternalPDL3.g:368:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getWorkSequenceRefAccess().getSuccessorWorkDefinitionRefCrossReference_2_0());
            				

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
    // $ANTLR end "ruleWorkSequenceRef"


    // $ANTLR start "entryRuleGuidanceRef"
    // InternalPDL3.g:383:1: entryRuleGuidanceRef returns [EObject current=null] : iv_ruleGuidanceRef= ruleGuidanceRef EOF ;
    public final EObject entryRuleGuidanceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidanceRef = null;


        try {
            // InternalPDL3.g:383:52: (iv_ruleGuidanceRef= ruleGuidanceRef EOF )
            // InternalPDL3.g:384:2: iv_ruleGuidanceRef= ruleGuidanceRef EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidanceRef=ruleGuidanceRef();

            state._fsp--;

             current =iv_ruleGuidanceRef; 
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
    // $ANTLR end "entryRuleGuidanceRef"


    // $ANTLR start "ruleGuidanceRef"
    // InternalPDL3.g:390:1: ruleGuidanceRef returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleGuidanceRef() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:396:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalPDL3.g:397:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalPDL3.g:397:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalPDL3.g:398:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalPDL3.g:398:3: (lv_text_0_0= RULE_STRING )
            // InternalPDL3.g:399:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getGuidanceRefAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGuidanceRefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleGuidanceRef"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL3.g:418:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL3.g:424:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL3.g:425:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL3.g:425:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
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
                    // InternalPDL3.g:426:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL3.g:426:3: (enumLiteral_0= 's2s' )
                    // InternalPDL3.g:427:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:434:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL3.g:434:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL3.g:435:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:442:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL3.g:442:3: (enumLiteral_2= 's2f' )
                    // InternalPDL3.g:443:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:450:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL3.g:450:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL3.g:451:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});

}