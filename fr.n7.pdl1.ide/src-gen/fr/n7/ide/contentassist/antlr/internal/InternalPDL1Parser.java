package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'uses'", "','", "'ws'", "'from'", "'to'", "'resource'", "'quantity'", "'note'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL1.g"; }


    	private PDL1GrammarAccess grammarAccess;

    	public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL1.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL1.g:54:1: ( ruleProcess EOF )
            // InternalPDL1.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL1.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL1.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL1.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL1.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL1.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL1.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL1.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL1.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL1.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL1.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL1.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL1.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL1.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL1.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL1.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL1.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL1.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDL1.g:105:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL1.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:116:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL1.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL1.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL1.g:118:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL1.g:119:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL1.g:119:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL1.g:128:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL1.g:129:1: ( ruleWorkSequence EOF )
            // InternalPDL1.g:130:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL1.g:137:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:141:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL1.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL1.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL1.g:143:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL1.g:144:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL1.g:144:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleResource"
    // InternalPDL1.g:153:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalPDL1.g:154:1: ( ruleResource EOF )
            // InternalPDL1.g:155:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL1.g:162:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:166:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalPDL1.g:167:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalPDL1.g:167:2: ( ( rule__Resource__Group__0 ) )
            // InternalPDL1.g:168:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalPDL1.g:169:3: ( rule__Resource__Group__0 )
            // InternalPDL1.g:169:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL1.g:178:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL1.g:179:1: ( ruleGuidance EOF )
            // InternalPDL1.g:180:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL1.g:187:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:191:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL1.g:192:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL1.g:192:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL1.g:193:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL1.g:194:3: ( rule__Guidance__Group__0 )
            // InternalPDL1.g:194:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL1.g:203:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:207:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL1.g:208:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL1.g:208:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL1.g:209:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL1.g:210:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL1.g:210:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL1.g:218:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:222:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResource ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL1.g:223:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL1.g:223:2: ( ruleWorkDefinition )
                    // InternalPDL1.g:224:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:229:2: ( ruleWorkSequence )
                    {
                    // InternalPDL1.g:229:2: ( ruleWorkSequence )
                    // InternalPDL1.g:230:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:235:2: ( ruleGuidance )
                    {
                    // InternalPDL1.g:235:2: ( ruleGuidance )
                    // InternalPDL1.g:236:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:241:2: ( ruleResource )
                    {
                    // InternalPDL1.g:241:2: ( ruleResource )
                    // InternalPDL1.g:242:3: ruleResource
                    {
                     before(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL1.g:251:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:255:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL1.g:256:2: ( ( 's2s' ) )
                    {
                    // InternalPDL1.g:256:2: ( ( 's2s' ) )
                    // InternalPDL1.g:257:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDL1.g:258:3: ( 's2s' )
                    // InternalPDL1.g:258:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:262:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL1.g:262:2: ( ( 'f2s' ) )
                    // InternalPDL1.g:263:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDL1.g:264:3: ( 'f2s' )
                    // InternalPDL1.g:264:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:268:2: ( ( 's2f' ) )
                    {
                    // InternalPDL1.g:268:2: ( ( 's2f' ) )
                    // InternalPDL1.g:269:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDL1.g:270:3: ( 's2f' )
                    // InternalPDL1.g:270:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:274:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL1.g:274:2: ( ( 'f2f' ) )
                    // InternalPDL1.g:275:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDL1.g:276:3: ( 'f2f' )
                    // InternalPDL1.g:276:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL1.g:284:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:288:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL1.g:289:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL1.g:296:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:300:1: ( ( 'process' ) )
            // InternalPDL1.g:301:1: ( 'process' )
            {
            // InternalPDL1.g:301:1: ( 'process' )
            // InternalPDL1.g:302:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL1.g:311:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:315:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL1.g:316:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL1.g:323:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:327:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalPDL1.g:328:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalPDL1.g:328:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalPDL1.g:329:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalPDL1.g:330:2: ( rule__Process__NameAssignment_1 )
            // InternalPDL1.g:330:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL1.g:338:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:342:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL1.g:343:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL1.g:350:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:354:1: ( ( '{' ) )
            // InternalPDL1.g:355:1: ( '{' )
            {
            // InternalPDL1.g:355:1: ( '{' )
            // InternalPDL1.g:356:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL1.g:365:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:369:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL1.g:370:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL1.g:377:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:381:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // InternalPDL1.g:382:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // InternalPDL1.g:382:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // InternalPDL1.g:383:2: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // InternalPDL1.g:384:2: ( rule__Process__ProcessElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==21||LA3_0==24||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL1.g:384:3: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL1.g:392:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:396:1: ( rule__Process__Group__4__Impl )
            // InternalPDL1.g:397:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL1.g:403:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:407:1: ( ( '}' ) )
            // InternalPDL1.g:408:1: ( '}' )
            {
            // InternalPDL1.g:408:1: ( '}' )
            // InternalPDL1.g:409:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL1.g:419:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:423:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL1.g:424:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL1.g:431:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:435:1: ( ( 'wd' ) )
            // InternalPDL1.g:436:1: ( 'wd' )
            {
            // InternalPDL1.g:436:1: ( 'wd' )
            // InternalPDL1.g:437:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL1.g:446:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:450:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL1.g:451:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL1.g:458:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:462:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalPDL1.g:463:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalPDL1.g:463:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalPDL1.g:464:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalPDL1.g:465:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalPDL1.g:465:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL1.g:473:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:477:1: ( rule__WorkDefinition__Group__2__Impl )
            // InternalPDL1.g:478:2: rule__WorkDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL1.g:484:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__Group_2__0 )? ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:488:1: ( ( ( rule__WorkDefinition__Group_2__0 )? ) )
            // InternalPDL1.g:489:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            {
            // InternalPDL1.g:489:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            // InternalPDL1.g:490:2: ( rule__WorkDefinition__Group_2__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 
            // InternalPDL1.g:491:2: ( rule__WorkDefinition__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL1.g:491:3: rule__WorkDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__0"
    // InternalPDL1.g:500:1: rule__WorkDefinition__Group_2__0 : rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 ;
    public final void rule__WorkDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:504:1: ( rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 )
            // InternalPDL1.g:505:2: rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2__0__Impl"
    // InternalPDL1.g:512:1: rule__WorkDefinition__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__WorkDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:516:1: ( ( 'uses' ) )
            // InternalPDL1.g:517:1: ( 'uses' )
            {
            // InternalPDL1.g:517:1: ( 'uses' )
            // InternalPDL1.g:518:2: 'uses'
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__1"
    // InternalPDL1.g:527:1: rule__WorkDefinition__Group_2__1 : rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 ;
    public final void rule__WorkDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:531:1: ( rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 )
            // InternalPDL1.g:532:2: rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2__1__Impl"
    // InternalPDL1.g:539:1: rule__WorkDefinition__Group_2__1__Impl : ( ( rule__WorkDefinition__UsedResourcesAssignment_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:543:1: ( ( ( rule__WorkDefinition__UsedResourcesAssignment_2_1 ) ) )
            // InternalPDL1.g:544:1: ( ( rule__WorkDefinition__UsedResourcesAssignment_2_1 ) )
            {
            // InternalPDL1.g:544:1: ( ( rule__WorkDefinition__UsedResourcesAssignment_2_1 ) )
            // InternalPDL1.g:545:2: ( rule__WorkDefinition__UsedResourcesAssignment_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsedResourcesAssignment_2_1()); 
            // InternalPDL1.g:546:2: ( rule__WorkDefinition__UsedResourcesAssignment_2_1 )
            // InternalPDL1.g:546:3: rule__WorkDefinition__UsedResourcesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__UsedResourcesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getUsedResourcesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__2"
    // InternalPDL1.g:554:1: rule__WorkDefinition__Group_2__2 : rule__WorkDefinition__Group_2__2__Impl ;
    public final void rule__WorkDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:558:1: ( rule__WorkDefinition__Group_2__2__Impl )
            // InternalPDL1.g:559:2: rule__WorkDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2"


    // $ANTLR start "rule__WorkDefinition__Group_2__2__Impl"
    // InternalPDL1.g:565:1: rule__WorkDefinition__Group_2__2__Impl : ( ( rule__WorkDefinition__Group_2_2__0 )* ) ;
    public final void rule__WorkDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:569:1: ( ( ( rule__WorkDefinition__Group_2_2__0 )* ) )
            // InternalPDL1.g:570:1: ( ( rule__WorkDefinition__Group_2_2__0 )* )
            {
            // InternalPDL1.g:570:1: ( ( rule__WorkDefinition__Group_2_2__0 )* )
            // InternalPDL1.g:571:2: ( rule__WorkDefinition__Group_2_2__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2_2()); 
            // InternalPDL1.g:572:2: ( rule__WorkDefinition__Group_2_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL1.g:572:3: rule__WorkDefinition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__0"
    // InternalPDL1.g:581:1: rule__WorkDefinition__Group_2_2__0 : rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1 ;
    public final void rule__WorkDefinition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:585:1: ( rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1 )
            // InternalPDL1.g:586:2: rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__0__Impl"
    // InternalPDL1.g:593:1: rule__WorkDefinition__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:597:1: ( ( ',' ) )
            // InternalPDL1.g:598:1: ( ',' )
            {
            // InternalPDL1.g:598:1: ( ',' )
            // InternalPDL1.g:599:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__1"
    // InternalPDL1.g:608:1: rule__WorkDefinition__Group_2_2__1 : rule__WorkDefinition__Group_2_2__1__Impl ;
    public final void rule__WorkDefinition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:612:1: ( rule__WorkDefinition__Group_2_2__1__Impl )
            // InternalPDL1.g:613:2: rule__WorkDefinition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__1__Impl"
    // InternalPDL1.g:619:1: rule__WorkDefinition__Group_2_2__1__Impl : ( ( rule__WorkDefinition__UsedResourcesAssignment_2_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:623:1: ( ( ( rule__WorkDefinition__UsedResourcesAssignment_2_2_1 ) ) )
            // InternalPDL1.g:624:1: ( ( rule__WorkDefinition__UsedResourcesAssignment_2_2_1 ) )
            {
            // InternalPDL1.g:624:1: ( ( rule__WorkDefinition__UsedResourcesAssignment_2_2_1 ) )
            // InternalPDL1.g:625:2: ( rule__WorkDefinition__UsedResourcesAssignment_2_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsedResourcesAssignment_2_2_1()); 
            // InternalPDL1.g:626:2: ( rule__WorkDefinition__UsedResourcesAssignment_2_2_1 )
            // InternalPDL1.g:626:3: rule__WorkDefinition__UsedResourcesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__UsedResourcesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getUsedResourcesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL1.g:635:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:639:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL1.g:640:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL1.g:647:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:651:1: ( ( 'ws' ) )
            // InternalPDL1.g:652:1: ( 'ws' )
            {
            // InternalPDL1.g:652:1: ( 'ws' )
            // InternalPDL1.g:653:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL1.g:662:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:666:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL1.g:667:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL1.g:674:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:678:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL1.g:679:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL1.g:679:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL1.g:680:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL1.g:681:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL1.g:681:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL1.g:689:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:693:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL1.g:694:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL1.g:701:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:705:1: ( ( 'from' ) )
            // InternalPDL1.g:706:1: ( 'from' )
            {
            // InternalPDL1.g:706:1: ( 'from' )
            // InternalPDL1.g:707:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL1.g:716:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:720:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL1.g:721:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL1.g:728:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:732:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL1.g:733:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL1.g:733:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL1.g:734:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL1.g:735:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL1.g:735:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL1.g:743:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:747:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL1.g:748:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL1.g:755:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:759:1: ( ( 'to' ) )
            // InternalPDL1.g:760:1: ( 'to' )
            {
            // InternalPDL1.g:760:1: ( 'to' )
            // InternalPDL1.g:761:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL1.g:770:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:774:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL1.g:775:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL1.g:781:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:785:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL1.g:786:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL1.g:786:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL1.g:787:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL1.g:788:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL1.g:788:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalPDL1.g:797:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:801:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalPDL1.g:802:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalPDL1.g:809:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:813:1: ( ( 'resource' ) )
            // InternalPDL1.g:814:1: ( 'resource' )
            {
            // InternalPDL1.g:814:1: ( 'resource' )
            // InternalPDL1.g:815:2: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalPDL1.g:824:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:828:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalPDL1.g:829:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalPDL1.g:836:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:840:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalPDL1.g:841:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalPDL1.g:841:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalPDL1.g:842:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalPDL1.g:843:2: ( rule__Resource__NameAssignment_1 )
            // InternalPDL1.g:843:3: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalPDL1.g:851:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:855:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalPDL1.g:856:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalPDL1.g:863:1: rule__Resource__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:867:1: ( ( 'quantity' ) )
            // InternalPDL1.g:868:1: ( 'quantity' )
            {
            // InternalPDL1.g:868:1: ( 'quantity' )
            // InternalPDL1.g:869:2: 'quantity'
            {
             before(grammarAccess.getResourceAccess().getQuantityKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getQuantityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalPDL1.g:878:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:882:1: ( rule__Resource__Group__3__Impl )
            // InternalPDL1.g:883:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalPDL1.g:889:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__QuantityAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:893:1: ( ( ( rule__Resource__QuantityAssignment_3 ) ) )
            // InternalPDL1.g:894:1: ( ( rule__Resource__QuantityAssignment_3 ) )
            {
            // InternalPDL1.g:894:1: ( ( rule__Resource__QuantityAssignment_3 ) )
            // InternalPDL1.g:895:2: ( rule__Resource__QuantityAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getQuantityAssignment_3()); 
            // InternalPDL1.g:896:2: ( rule__Resource__QuantityAssignment_3 )
            // InternalPDL1.g:896:3: rule__Resource__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resource__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL1.g:905:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:909:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL1.g:910:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL1.g:917:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:921:1: ( ( 'note' ) )
            // InternalPDL1.g:922:1: ( 'note' )
            {
            // InternalPDL1.g:922:1: ( 'note' )
            // InternalPDL1.g:923:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL1.g:932:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:936:1: ( rule__Guidance__Group__1__Impl )
            // InternalPDL1.g:937:2: rule__Guidance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL1.g:943:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TexteAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:947:1: ( ( ( rule__Guidance__TexteAssignment_1 ) ) )
            // InternalPDL1.g:948:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            {
            // InternalPDL1.g:948:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            // InternalPDL1.g:949:2: ( rule__Guidance__TexteAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 
            // InternalPDL1.g:950:2: ( rule__Guidance__TexteAssignment_1 )
            // InternalPDL1.g:950:3: rule__Guidance__TexteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TexteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalPDL1.g:959:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:963:1: ( ( RULE_ID ) )
            // InternalPDL1.g:964:2: ( RULE_ID )
            {
            // InternalPDL1.g:964:2: ( RULE_ID )
            // InternalPDL1.g:965:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // InternalPDL1.g:974:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:978:1: ( ( ruleProcessElement ) )
            // InternalPDL1.g:979:2: ( ruleProcessElement )
            {
            // InternalPDL1.g:979:2: ( ruleProcessElement )
            // InternalPDL1.g:980:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalPDL1.g:989:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:993:1: ( ( RULE_ID ) )
            // InternalPDL1.g:994:2: ( RULE_ID )
            {
            // InternalPDL1.g:994:2: ( RULE_ID )
            // InternalPDL1.g:995:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__UsedResourcesAssignment_2_1"
    // InternalPDL1.g:1004:1: rule__WorkDefinition__UsedResourcesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__WorkDefinition__UsedResourcesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1008:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1009:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1009:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1010:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceCrossReference_2_1_0()); 
            // InternalPDL1.g:1011:3: ( RULE_ID )
            // InternalPDL1.g:1012:4: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__UsedResourcesAssignment_2_1"


    // $ANTLR start "rule__WorkDefinition__UsedResourcesAssignment_2_2_1"
    // InternalPDL1.g:1023:1: rule__WorkDefinition__UsedResourcesAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__WorkDefinition__UsedResourcesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1027:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1028:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1028:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1029:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceCrossReference_2_2_1_0()); 
            // InternalPDL1.g:1030:3: ( RULE_ID )
            // InternalPDL1.g:1031:4: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getUsedResourcesResourceCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__UsedResourcesAssignment_2_2_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL1.g:1042:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1046:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL1.g:1047:2: ( ruleWorkSequenceType )
            {
            // InternalPDL1.g:1047:2: ( ruleWorkSequenceType )
            // InternalPDL1.g:1048:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL1.g:1057:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1061:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1062:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1062:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1063:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL1.g:1064:3: ( RULE_ID )
            // InternalPDL1.g:1065:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL1.g:1076:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1080:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1081:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1081:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1082:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL1.g:1083:3: ( RULE_ID )
            // InternalPDL1.g:1084:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalPDL1.g:1095:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1099:1: ( ( RULE_ID ) )
            // InternalPDL1.g:1100:2: ( RULE_ID )
            {
            // InternalPDL1.g:1100:2: ( RULE_ID )
            // InternalPDL1.g:1101:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__QuantityAssignment_3"
    // InternalPDL1.g:1110:1: rule__Resource__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Resource__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1114:1: ( ( RULE_INT ) )
            // InternalPDL1.g:1115:2: ( RULE_INT )
            {
            // InternalPDL1.g:1115:2: ( RULE_INT )
            // InternalPDL1.g:1116:3: RULE_INT
            {
             before(grammarAccess.getResourceAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__QuantityAssignment_3"


    // $ANTLR start "rule__Guidance__TexteAssignment_1"
    // InternalPDL1.g:1125:1: rule__Guidance__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1129:1: ( ( RULE_STRING ) )
            // InternalPDL1.g:1130:2: ( RULE_STRING )
            {
            // InternalPDL1.g:1130:2: ( RULE_STRING )
            // InternalPDL1.g:1131:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TexteAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000005260000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005240002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}