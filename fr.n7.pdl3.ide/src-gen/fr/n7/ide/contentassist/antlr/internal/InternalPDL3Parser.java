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
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'", "'notes'"
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

    	public void setGrammarAccess(PDL3GrammarAccess grammarAccess) {
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
    // InternalPDL3.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL3.g:54:1: ( ruleProcess EOF )
            // InternalPDL3.g:55:1: ruleProcess EOF
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
    // InternalPDL3.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL3.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL3.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL3.g:69:4: rule__Process__Group__0
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


    // $ANTLR start "entryRuleWorkDefinitionRef"
    // InternalPDL3.g:78:1: entryRuleWorkDefinitionRef : ruleWorkDefinitionRef EOF ;
    public final void entryRuleWorkDefinitionRef() throws RecognitionException {
        try {
            // InternalPDL3.g:79:1: ( ruleWorkDefinitionRef EOF )
            // InternalPDL3.g:80:1: ruleWorkDefinitionRef EOF
            {
             before(grammarAccess.getWorkDefinitionRefRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinitionRef();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRefRule()); 
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
    // $ANTLR end "entryRuleWorkDefinitionRef"


    // $ANTLR start "ruleWorkDefinitionRef"
    // InternalPDL3.g:87:1: ruleWorkDefinitionRef : ( ( rule__WorkDefinitionRef__NameAssignment ) ) ;
    public final void ruleWorkDefinitionRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:91:2: ( ( ( rule__WorkDefinitionRef__NameAssignment ) ) )
            // InternalPDL3.g:92:2: ( ( rule__WorkDefinitionRef__NameAssignment ) )
            {
            // InternalPDL3.g:92:2: ( ( rule__WorkDefinitionRef__NameAssignment ) )
            // InternalPDL3.g:93:3: ( rule__WorkDefinitionRef__NameAssignment )
            {
             before(grammarAccess.getWorkDefinitionRefAccess().getNameAssignment()); 
            // InternalPDL3.g:94:3: ( rule__WorkDefinitionRef__NameAssignment )
            // InternalPDL3.g:94:4: rule__WorkDefinitionRef__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinitionRef__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionRefAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinitionRef"


    // $ANTLR start "entryRuleWorkSequenceRef"
    // InternalPDL3.g:103:1: entryRuleWorkSequenceRef : ruleWorkSequenceRef EOF ;
    public final void entryRuleWorkSequenceRef() throws RecognitionException {
        try {
            // InternalPDL3.g:104:1: ( ruleWorkSequenceRef EOF )
            // InternalPDL3.g:105:1: ruleWorkSequenceRef EOF
            {
             before(grammarAccess.getWorkSequenceRefRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequenceRef();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRefRule()); 
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
    // $ANTLR end "entryRuleWorkSequenceRef"


    // $ANTLR start "ruleWorkSequenceRef"
    // InternalPDL3.g:112:1: ruleWorkSequenceRef : ( ( rule__WorkSequenceRef__Group__0 ) ) ;
    public final void ruleWorkSequenceRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:116:2: ( ( ( rule__WorkSequenceRef__Group__0 ) ) )
            // InternalPDL3.g:117:2: ( ( rule__WorkSequenceRef__Group__0 ) )
            {
            // InternalPDL3.g:117:2: ( ( rule__WorkSequenceRef__Group__0 ) )
            // InternalPDL3.g:118:3: ( rule__WorkSequenceRef__Group__0 )
            {
             before(grammarAccess.getWorkSequenceRefAccess().getGroup()); 
            // InternalPDL3.g:119:3: ( rule__WorkSequenceRef__Group__0 )
            // InternalPDL3.g:119:4: rule__WorkSequenceRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceRef"


    // $ANTLR start "entryRuleGuidanceRef"
    // InternalPDL3.g:128:1: entryRuleGuidanceRef : ruleGuidanceRef EOF ;
    public final void entryRuleGuidanceRef() throws RecognitionException {
        try {
            // InternalPDL3.g:129:1: ( ruleGuidanceRef EOF )
            // InternalPDL3.g:130:1: ruleGuidanceRef EOF
            {
             before(grammarAccess.getGuidanceRefRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidanceRef();

            state._fsp--;

             after(grammarAccess.getGuidanceRefRule()); 
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
    // $ANTLR end "entryRuleGuidanceRef"


    // $ANTLR start "ruleGuidanceRef"
    // InternalPDL3.g:137:1: ruleGuidanceRef : ( ( rule__GuidanceRef__TextAssignment ) ) ;
    public final void ruleGuidanceRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:141:2: ( ( ( rule__GuidanceRef__TextAssignment ) ) )
            // InternalPDL3.g:142:2: ( ( rule__GuidanceRef__TextAssignment ) )
            {
            // InternalPDL3.g:142:2: ( ( rule__GuidanceRef__TextAssignment ) )
            // InternalPDL3.g:143:3: ( rule__GuidanceRef__TextAssignment )
            {
             before(grammarAccess.getGuidanceRefAccess().getTextAssignment()); 
            // InternalPDL3.g:144:3: ( rule__GuidanceRef__TextAssignment )
            // InternalPDL3.g:144:4: rule__GuidanceRef__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GuidanceRef__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceRefAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidanceRef"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL3.g:153:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:157:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL3.g:158:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL3.g:158:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL3.g:159:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL3.g:160:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL3.g:160:4: rule__WorkSequenceType__Alternatives
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


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL3.g:168:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:172:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    // InternalPDL3.g:173:2: ( ( 's2s' ) )
                    {
                    // InternalPDL3.g:173:2: ( ( 's2s' ) )
                    // InternalPDL3.g:174:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDL3.g:175:3: ( 's2s' )
                    // InternalPDL3.g:175:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:179:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL3.g:179:2: ( ( 'f2s' ) )
                    // InternalPDL3.g:180:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDL3.g:181:3: ( 'f2s' )
                    // InternalPDL3.g:181:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:185:2: ( ( 's2f' ) )
                    {
                    // InternalPDL3.g:185:2: ( ( 's2f' ) )
                    // InternalPDL3.g:186:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDL3.g:187:3: ( 's2f' )
                    // InternalPDL3.g:187:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:191:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL3.g:191:2: ( ( 'f2f' ) )
                    // InternalPDL3.g:192:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDL3.g:193:3: ( 'f2f' )
                    // InternalPDL3.g:193:4: 'f2f'
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
    // InternalPDL3.g:201:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:205:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL3.g:206:2: rule__Process__Group__0__Impl rule__Process__Group__1
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
    // InternalPDL3.g:213:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:217:1: ( ( 'process' ) )
            // InternalPDL3.g:218:1: ( 'process' )
            {
            // InternalPDL3.g:218:1: ( 'process' )
            // InternalPDL3.g:219:2: 'process'
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
    // InternalPDL3.g:228:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:232:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL3.g:233:2: rule__Process__Group__1__Impl rule__Process__Group__2
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
    // InternalPDL3.g:240:1: rule__Process__Group__1__Impl : ( ':' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:244:1: ( ( ':' ) )
            // InternalPDL3.g:245:1: ( ':' )
            {
            // InternalPDL3.g:245:1: ( ':' )
            // InternalPDL3.g:246:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalPDL3.g:255:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:259:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL3.g:260:2: rule__Process__Group__2__Impl rule__Process__Group__3
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
    // InternalPDL3.g:267:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:271:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL3.g:272:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL3.g:272:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL3.g:273:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL3.g:274:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL3.g:274:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalPDL3.g:282:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:286:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL3.g:287:2: rule__Process__Group__3__Impl rule__Process__Group__4
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
    // InternalPDL3.g:294:1: rule__Process__Group__3__Impl : ( ( rule__Process__Group_3__0 )? ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:298:1: ( ( ( rule__Process__Group_3__0 )? ) )
            // InternalPDL3.g:299:1: ( ( rule__Process__Group_3__0 )? )
            {
            // InternalPDL3.g:299:1: ( ( rule__Process__Group_3__0 )? )
            // InternalPDL3.g:300:2: ( rule__Process__Group_3__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_3()); 
            // InternalPDL3.g:301:2: ( rule__Process__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL3.g:301:3: rule__Process__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalPDL3.g:309:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:313:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL3.g:314:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
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
    // InternalPDL3.g:321:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:325:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalPDL3.g:326:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalPDL3.g:326:1: ( ( rule__Process__Group_4__0 )? )
            // InternalPDL3.g:327:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalPDL3.g:328:2: ( rule__Process__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPDL3.g:328:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL3.g:336:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:340:1: ( rule__Process__Group__5__Impl )
            // InternalPDL3.g:341:2: rule__Process__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL3.g:347:1: rule__Process__Group__5__Impl : ( ( rule__Process__Group_5__0 )? ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:351:1: ( ( ( rule__Process__Group_5__0 )? ) )
            // InternalPDL3.g:352:1: ( ( rule__Process__Group_5__0 )? )
            {
            // InternalPDL3.g:352:1: ( ( rule__Process__Group_5__0 )? )
            // InternalPDL3.g:353:2: ( rule__Process__Group_5__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_5()); 
            // InternalPDL3.g:354:2: ( rule__Process__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL3.g:354:3: rule__Process__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group_3__0"
    // InternalPDL3.g:363:1: rule__Process__Group_3__0 : rule__Process__Group_3__0__Impl rule__Process__Group_3__1 ;
    public final void rule__Process__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:367:1: ( rule__Process__Group_3__0__Impl rule__Process__Group_3__1 )
            // InternalPDL3.g:368:2: rule__Process__Group_3__0__Impl rule__Process__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__0"


    // $ANTLR start "rule__Process__Group_3__0__Impl"
    // InternalPDL3.g:375:1: rule__Process__Group_3__0__Impl : ( 'workdefinitions' ) ;
    public final void rule__Process__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:379:1: ( ( 'workdefinitions' ) )
            // InternalPDL3.g:380:1: ( 'workdefinitions' )
            {
            // InternalPDL3.g:380:1: ( 'workdefinitions' )
            // InternalPDL3.g:381:2: 'workdefinitions'
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__0__Impl"


    // $ANTLR start "rule__Process__Group_3__1"
    // InternalPDL3.g:390:1: rule__Process__Group_3__1 : rule__Process__Group_3__1__Impl rule__Process__Group_3__2 ;
    public final void rule__Process__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:394:1: ( rule__Process__Group_3__1__Impl rule__Process__Group_3__2 )
            // InternalPDL3.g:395:2: rule__Process__Group_3__1__Impl rule__Process__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__1"


    // $ANTLR start "rule__Process__Group_3__1__Impl"
    // InternalPDL3.g:402:1: rule__Process__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Process__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:406:1: ( ( ':' ) )
            // InternalPDL3.g:407:1: ( ':' )
            {
            // InternalPDL3.g:407:1: ( ':' )
            // InternalPDL3.g:408:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__1__Impl"


    // $ANTLR start "rule__Process__Group_3__2"
    // InternalPDL3.g:417:1: rule__Process__Group_3__2 : rule__Process__Group_3__2__Impl rule__Process__Group_3__3 ;
    public final void rule__Process__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:421:1: ( rule__Process__Group_3__2__Impl rule__Process__Group_3__3 )
            // InternalPDL3.g:422:2: rule__Process__Group_3__2__Impl rule__Process__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__2"


    // $ANTLR start "rule__Process__Group_3__2__Impl"
    // InternalPDL3.g:429:1: rule__Process__Group_3__2__Impl : ( ( rule__Process__WorkDefinitionsAssignment_3_2 ) ) ;
    public final void rule__Process__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:433:1: ( ( ( rule__Process__WorkDefinitionsAssignment_3_2 ) ) )
            // InternalPDL3.g:434:1: ( ( rule__Process__WorkDefinitionsAssignment_3_2 ) )
            {
            // InternalPDL3.g:434:1: ( ( rule__Process__WorkDefinitionsAssignment_3_2 ) )
            // InternalPDL3.g:435:2: ( rule__Process__WorkDefinitionsAssignment_3_2 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_3_2()); 
            // InternalPDL3.g:436:2: ( rule__Process__WorkDefinitionsAssignment_3_2 )
            // InternalPDL3.g:436:3: rule__Process__WorkDefinitionsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__2__Impl"


    // $ANTLR start "rule__Process__Group_3__3"
    // InternalPDL3.g:444:1: rule__Process__Group_3__3 : rule__Process__Group_3__3__Impl rule__Process__Group_3__4 ;
    public final void rule__Process__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:448:1: ( rule__Process__Group_3__3__Impl rule__Process__Group_3__4 )
            // InternalPDL3.g:449:2: rule__Process__Group_3__3__Impl rule__Process__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__3"


    // $ANTLR start "rule__Process__Group_3__3__Impl"
    // InternalPDL3.g:456:1: rule__Process__Group_3__3__Impl : ( ( rule__Process__Group_3_3__0 )* ) ;
    public final void rule__Process__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:460:1: ( ( ( rule__Process__Group_3_3__0 )* ) )
            // InternalPDL3.g:461:1: ( ( rule__Process__Group_3_3__0 )* )
            {
            // InternalPDL3.g:461:1: ( ( rule__Process__Group_3_3__0 )* )
            // InternalPDL3.g:462:2: ( rule__Process__Group_3_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_3_3()); 
            // InternalPDL3.g:463:2: ( rule__Process__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_ID) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL3.g:463:3: rule__Process__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__3__Impl"


    // $ANTLR start "rule__Process__Group_3__4"
    // InternalPDL3.g:471:1: rule__Process__Group_3__4 : rule__Process__Group_3__4__Impl ;
    public final void rule__Process__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:475:1: ( rule__Process__Group_3__4__Impl )
            // InternalPDL3.g:476:2: rule__Process__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__4"


    // $ANTLR start "rule__Process__Group_3__4__Impl"
    // InternalPDL3.g:482:1: rule__Process__Group_3__4__Impl : ( ';' ) ;
    public final void rule__Process__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:486:1: ( ( ';' ) )
            // InternalPDL3.g:487:1: ( ';' )
            {
            // InternalPDL3.g:487:1: ( ';' )
            // InternalPDL3.g:488:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_3_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__4__Impl"


    // $ANTLR start "rule__Process__Group_3_3__0"
    // InternalPDL3.g:498:1: rule__Process__Group_3_3__0 : rule__Process__Group_3_3__0__Impl rule__Process__Group_3_3__1 ;
    public final void rule__Process__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:502:1: ( rule__Process__Group_3_3__0__Impl rule__Process__Group_3_3__1 )
            // InternalPDL3.g:503:2: rule__Process__Group_3_3__0__Impl rule__Process__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3_3__0"


    // $ANTLR start "rule__Process__Group_3_3__0__Impl"
    // InternalPDL3.g:510:1: rule__Process__Group_3_3__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:514:1: ( ( ';' ) )
            // InternalPDL3.g:515:1: ( ';' )
            {
            // InternalPDL3.g:515:1: ( ';' )
            // InternalPDL3.g:516:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3_3__0__Impl"


    // $ANTLR start "rule__Process__Group_3_3__1"
    // InternalPDL3.g:525:1: rule__Process__Group_3_3__1 : rule__Process__Group_3_3__1__Impl ;
    public final void rule__Process__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:529:1: ( rule__Process__Group_3_3__1__Impl )
            // InternalPDL3.g:530:2: rule__Process__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3_3__1"


    // $ANTLR start "rule__Process__Group_3_3__1__Impl"
    // InternalPDL3.g:536:1: rule__Process__Group_3_3__1__Impl : ( ( rule__Process__WorkDefinitionsAssignment_3_3_1 ) ) ;
    public final void rule__Process__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:540:1: ( ( ( rule__Process__WorkDefinitionsAssignment_3_3_1 ) ) )
            // InternalPDL3.g:541:1: ( ( rule__Process__WorkDefinitionsAssignment_3_3_1 ) )
            {
            // InternalPDL3.g:541:1: ( ( rule__Process__WorkDefinitionsAssignment_3_3_1 ) )
            // InternalPDL3.g:542:2: ( rule__Process__WorkDefinitionsAssignment_3_3_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_3_3_1()); 
            // InternalPDL3.g:543:2: ( rule__Process__WorkDefinitionsAssignment_3_3_1 )
            // InternalPDL3.g:543:3: rule__Process__WorkDefinitionsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3_3__1__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalPDL3.g:552:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:556:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalPDL3.g:557:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalPDL3.g:564:1: rule__Process__Group_4__0__Impl : ( 'worksequences' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:568:1: ( ( 'worksequences' ) )
            // InternalPDL3.g:569:1: ( 'worksequences' )
            {
            // InternalPDL3.g:569:1: ( 'worksequences' )
            // InternalPDL3.g:570:2: 'worksequences'
            {
             before(grammarAccess.getProcessAccess().getWorksequencesKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorksequencesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalPDL3.g:579:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:583:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalPDL3.g:584:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalPDL3.g:591:1: rule__Process__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:595:1: ( ( ':' ) )
            // InternalPDL3.g:596:1: ( ':' )
            {
            // InternalPDL3.g:596:1: ( ':' )
            // InternalPDL3.g:597:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_4__2"
    // InternalPDL3.g:606:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:610:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalPDL3.g:611:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2"


    // $ANTLR start "rule__Process__Group_4__2__Impl"
    // InternalPDL3.g:618:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__WorkSequencesAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:622:1: ( ( ( rule__Process__WorkSequencesAssignment_4_2 ) ) )
            // InternalPDL3.g:623:1: ( ( rule__Process__WorkSequencesAssignment_4_2 ) )
            {
            // InternalPDL3.g:623:1: ( ( rule__Process__WorkSequencesAssignment_4_2 ) )
            // InternalPDL3.g:624:2: ( rule__Process__WorkSequencesAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_4_2()); 
            // InternalPDL3.g:625:2: ( rule__Process__WorkSequencesAssignment_4_2 )
            // InternalPDL3.g:625:3: rule__Process__WorkSequencesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group_4__3"
    // InternalPDL3.g:633:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:637:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalPDL3.g:638:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3"


    // $ANTLR start "rule__Process__Group_4__3__Impl"
    // InternalPDL3.g:645:1: rule__Process__Group_4__3__Impl : ( ( rule__Process__Group_4_3__0 )* ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:649:1: ( ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalPDL3.g:650:1: ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalPDL3.g:650:1: ( ( rule__Process__Group_4_3__0 )* )
            // InternalPDL3.g:651:2: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3()); 
            // InternalPDL3.g:652:2: ( rule__Process__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPDL3.g:652:3: rule__Process__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3__Impl"


    // $ANTLR start "rule__Process__Group_4__4"
    // InternalPDL3.g:660:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:664:1: ( rule__Process__Group_4__4__Impl )
            // InternalPDL3.g:665:2: rule__Process__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4"


    // $ANTLR start "rule__Process__Group_4__4__Impl"
    // InternalPDL3.g:671:1: rule__Process__Group_4__4__Impl : ( ';' ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:675:1: ( ( ';' ) )
            // InternalPDL3.g:676:1: ( ';' )
            {
            // InternalPDL3.g:676:1: ( ';' )
            // InternalPDL3.g:677:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_4_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4__Impl"


    // $ANTLR start "rule__Process__Group_4_3__0"
    // InternalPDL3.g:687:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:691:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalPDL3.g:692:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0"


    // $ANTLR start "rule__Process__Group_4_3__0__Impl"
    // InternalPDL3.g:699:1: rule__Process__Group_4_3__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:703:1: ( ( ';' ) )
            // InternalPDL3.g:704:1: ( ';' )
            {
            // InternalPDL3.g:704:1: ( ';' )
            // InternalPDL3.g:705:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0__Impl"


    // $ANTLR start "rule__Process__Group_4_3__1"
    // InternalPDL3.g:714:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:718:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalPDL3.g:719:2: rule__Process__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1"


    // $ANTLR start "rule__Process__Group_4_3__1__Impl"
    // InternalPDL3.g:725:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__WorkSequencesAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:729:1: ( ( ( rule__Process__WorkSequencesAssignment_4_3_1 ) ) )
            // InternalPDL3.g:730:1: ( ( rule__Process__WorkSequencesAssignment_4_3_1 ) )
            {
            // InternalPDL3.g:730:1: ( ( rule__Process__WorkSequencesAssignment_4_3_1 ) )
            // InternalPDL3.g:731:2: ( rule__Process__WorkSequencesAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_4_3_1()); 
            // InternalPDL3.g:732:2: ( rule__Process__WorkSequencesAssignment_4_3_1 )
            // InternalPDL3.g:732:3: rule__Process__WorkSequencesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1__Impl"


    // $ANTLR start "rule__Process__Group_5__0"
    // InternalPDL3.g:741:1: rule__Process__Group_5__0 : rule__Process__Group_5__0__Impl rule__Process__Group_5__1 ;
    public final void rule__Process__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:745:1: ( rule__Process__Group_5__0__Impl rule__Process__Group_5__1 )
            // InternalPDL3.g:746:2: rule__Process__Group_5__0__Impl rule__Process__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0"


    // $ANTLR start "rule__Process__Group_5__0__Impl"
    // InternalPDL3.g:753:1: rule__Process__Group_5__0__Impl : ( 'notes' ) ;
    public final void rule__Process__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:757:1: ( ( 'notes' ) )
            // InternalPDL3.g:758:1: ( 'notes' )
            {
            // InternalPDL3.g:758:1: ( 'notes' )
            // InternalPDL3.g:759:2: 'notes'
            {
             before(grammarAccess.getProcessAccess().getNotesKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNotesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0__Impl"


    // $ANTLR start "rule__Process__Group_5__1"
    // InternalPDL3.g:768:1: rule__Process__Group_5__1 : rule__Process__Group_5__1__Impl rule__Process__Group_5__2 ;
    public final void rule__Process__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:772:1: ( rule__Process__Group_5__1__Impl rule__Process__Group_5__2 )
            // InternalPDL3.g:773:2: rule__Process__Group_5__1__Impl rule__Process__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1"


    // $ANTLR start "rule__Process__Group_5__1__Impl"
    // InternalPDL3.g:780:1: rule__Process__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Process__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:784:1: ( ( ':' ) )
            // InternalPDL3.g:785:1: ( ':' )
            {
            // InternalPDL3.g:785:1: ( ':' )
            // InternalPDL3.g:786:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1__Impl"


    // $ANTLR start "rule__Process__Group_5__2"
    // InternalPDL3.g:795:1: rule__Process__Group_5__2 : rule__Process__Group_5__2__Impl rule__Process__Group_5__3 ;
    public final void rule__Process__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:799:1: ( rule__Process__Group_5__2__Impl rule__Process__Group_5__3 )
            // InternalPDL3.g:800:2: rule__Process__Group_5__2__Impl rule__Process__Group_5__3
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__2"


    // $ANTLR start "rule__Process__Group_5__2__Impl"
    // InternalPDL3.g:807:1: rule__Process__Group_5__2__Impl : ( ( rule__Process__GuidancesAssignment_5_2 ) ) ;
    public final void rule__Process__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:811:1: ( ( ( rule__Process__GuidancesAssignment_5_2 ) ) )
            // InternalPDL3.g:812:1: ( ( rule__Process__GuidancesAssignment_5_2 ) )
            {
            // InternalPDL3.g:812:1: ( ( rule__Process__GuidancesAssignment_5_2 ) )
            // InternalPDL3.g:813:2: ( rule__Process__GuidancesAssignment_5_2 )
            {
             before(grammarAccess.getProcessAccess().getGuidancesAssignment_5_2()); 
            // InternalPDL3.g:814:2: ( rule__Process__GuidancesAssignment_5_2 )
            // InternalPDL3.g:814:3: rule__Process__GuidancesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__GuidancesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGuidancesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__2__Impl"


    // $ANTLR start "rule__Process__Group_5__3"
    // InternalPDL3.g:822:1: rule__Process__Group_5__3 : rule__Process__Group_5__3__Impl rule__Process__Group_5__4 ;
    public final void rule__Process__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:826:1: ( rule__Process__Group_5__3__Impl rule__Process__Group_5__4 )
            // InternalPDL3.g:827:2: rule__Process__Group_5__3__Impl rule__Process__Group_5__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__3"


    // $ANTLR start "rule__Process__Group_5__3__Impl"
    // InternalPDL3.g:834:1: rule__Process__Group_5__3__Impl : ( ( rule__Process__Group_5_3__0 )* ) ;
    public final void rule__Process__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:838:1: ( ( ( rule__Process__Group_5_3__0 )* ) )
            // InternalPDL3.g:839:1: ( ( rule__Process__Group_5_3__0 )* )
            {
            // InternalPDL3.g:839:1: ( ( rule__Process__Group_5_3__0 )* )
            // InternalPDL3.g:840:2: ( rule__Process__Group_5_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_5_3()); 
            // InternalPDL3.g:841:2: ( rule__Process__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_STRING) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalPDL3.g:841:3: rule__Process__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__3__Impl"


    // $ANTLR start "rule__Process__Group_5__4"
    // InternalPDL3.g:849:1: rule__Process__Group_5__4 : rule__Process__Group_5__4__Impl ;
    public final void rule__Process__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:853:1: ( rule__Process__Group_5__4__Impl )
            // InternalPDL3.g:854:2: rule__Process__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__4"


    // $ANTLR start "rule__Process__Group_5__4__Impl"
    // InternalPDL3.g:860:1: rule__Process__Group_5__4__Impl : ( ';' ) ;
    public final void rule__Process__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:864:1: ( ( ';' ) )
            // InternalPDL3.g:865:1: ( ';' )
            {
            // InternalPDL3.g:865:1: ( ';' )
            // InternalPDL3.g:866:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__4__Impl"


    // $ANTLR start "rule__Process__Group_5_3__0"
    // InternalPDL3.g:876:1: rule__Process__Group_5_3__0 : rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1 ;
    public final void rule__Process__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:880:1: ( rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1 )
            // InternalPDL3.g:881:2: rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__0"


    // $ANTLR start "rule__Process__Group_5_3__0__Impl"
    // InternalPDL3.g:888:1: rule__Process__Group_5_3__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:892:1: ( ( ';' ) )
            // InternalPDL3.g:893:1: ( ';' )
            {
            // InternalPDL3.g:893:1: ( ';' )
            // InternalPDL3.g:894:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__0__Impl"


    // $ANTLR start "rule__Process__Group_5_3__1"
    // InternalPDL3.g:903:1: rule__Process__Group_5_3__1 : rule__Process__Group_5_3__1__Impl ;
    public final void rule__Process__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:907:1: ( rule__Process__Group_5_3__1__Impl )
            // InternalPDL3.g:908:2: rule__Process__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__1"


    // $ANTLR start "rule__Process__Group_5_3__1__Impl"
    // InternalPDL3.g:914:1: rule__Process__Group_5_3__1__Impl : ( ( rule__Process__GuidancesAssignment_5_3_1 ) ) ;
    public final void rule__Process__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:918:1: ( ( ( rule__Process__GuidancesAssignment_5_3_1 ) ) )
            // InternalPDL3.g:919:1: ( ( rule__Process__GuidancesAssignment_5_3_1 ) )
            {
            // InternalPDL3.g:919:1: ( ( rule__Process__GuidancesAssignment_5_3_1 ) )
            // InternalPDL3.g:920:2: ( rule__Process__GuidancesAssignment_5_3_1 )
            {
             before(grammarAccess.getProcessAccess().getGuidancesAssignment_5_3_1()); 
            // InternalPDL3.g:921:2: ( rule__Process__GuidancesAssignment_5_3_1 )
            // InternalPDL3.g:921:3: rule__Process__GuidancesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__GuidancesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGuidancesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__1__Impl"


    // $ANTLR start "rule__WorkSequenceRef__Group__0"
    // InternalPDL3.g:930:1: rule__WorkSequenceRef__Group__0 : rule__WorkSequenceRef__Group__0__Impl rule__WorkSequenceRef__Group__1 ;
    public final void rule__WorkSequenceRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:934:1: ( rule__WorkSequenceRef__Group__0__Impl rule__WorkSequenceRef__Group__1 )
            // InternalPDL3.g:935:2: rule__WorkSequenceRef__Group__0__Impl rule__WorkSequenceRef__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequenceRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__Group__0"


    // $ANTLR start "rule__WorkSequenceRef__Group__0__Impl"
    // InternalPDL3.g:942:1: rule__WorkSequenceRef__Group__0__Impl : ( ( rule__WorkSequenceRef__PredecessorAssignment_0 ) ) ;
    public final void rule__WorkSequenceRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:946:1: ( ( ( rule__WorkSequenceRef__PredecessorAssignment_0 ) ) )
            // InternalPDL3.g:947:1: ( ( rule__WorkSequenceRef__PredecessorAssignment_0 ) )
            {
            // InternalPDL3.g:947:1: ( ( rule__WorkSequenceRef__PredecessorAssignment_0 ) )
            // InternalPDL3.g:948:2: ( rule__WorkSequenceRef__PredecessorAssignment_0 )
            {
             before(grammarAccess.getWorkSequenceRefAccess().getPredecessorAssignment_0()); 
            // InternalPDL3.g:949:2: ( rule__WorkSequenceRef__PredecessorAssignment_0 )
            // InternalPDL3.g:949:3: rule__WorkSequenceRef__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceRefAccess().getPredecessorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__Group__0__Impl"


    // $ANTLR start "rule__WorkSequenceRef__Group__1"
    // InternalPDL3.g:957:1: rule__WorkSequenceRef__Group__1 : rule__WorkSequenceRef__Group__1__Impl rule__WorkSequenceRef__Group__2 ;
    public final void rule__WorkSequenceRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:961:1: ( rule__WorkSequenceRef__Group__1__Impl rule__WorkSequenceRef__Group__2 )
            // InternalPDL3.g:962:2: rule__WorkSequenceRef__Group__1__Impl rule__WorkSequenceRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequenceRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__Group__1"


    // $ANTLR start "rule__WorkSequenceRef__Group__1__Impl"
    // InternalPDL3.g:969:1: rule__WorkSequenceRef__Group__1__Impl : ( ( rule__WorkSequenceRef__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequenceRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:973:1: ( ( ( rule__WorkSequenceRef__LinkTypeAssignment_1 ) ) )
            // InternalPDL3.g:974:1: ( ( rule__WorkSequenceRef__LinkTypeAssignment_1 ) )
            {
            // InternalPDL3.g:974:1: ( ( rule__WorkSequenceRef__LinkTypeAssignment_1 ) )
            // InternalPDL3.g:975:2: ( rule__WorkSequenceRef__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceRefAccess().getLinkTypeAssignment_1()); 
            // InternalPDL3.g:976:2: ( rule__WorkSequenceRef__LinkTypeAssignment_1 )
            // InternalPDL3.g:976:3: rule__WorkSequenceRef__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceRefAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__Group__1__Impl"


    // $ANTLR start "rule__WorkSequenceRef__Group__2"
    // InternalPDL3.g:984:1: rule__WorkSequenceRef__Group__2 : rule__WorkSequenceRef__Group__2__Impl ;
    public final void rule__WorkSequenceRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:988:1: ( rule__WorkSequenceRef__Group__2__Impl )
            // InternalPDL3.g:989:2: rule__WorkSequenceRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__Group__2"


    // $ANTLR start "rule__WorkSequenceRef__Group__2__Impl"
    // InternalPDL3.g:995:1: rule__WorkSequenceRef__Group__2__Impl : ( ( rule__WorkSequenceRef__SuccessorAssignment_2 ) ) ;
    public final void rule__WorkSequenceRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:999:1: ( ( ( rule__WorkSequenceRef__SuccessorAssignment_2 ) ) )
            // InternalPDL3.g:1000:1: ( ( rule__WorkSequenceRef__SuccessorAssignment_2 ) )
            {
            // InternalPDL3.g:1000:1: ( ( rule__WorkSequenceRef__SuccessorAssignment_2 ) )
            // InternalPDL3.g:1001:2: ( rule__WorkSequenceRef__SuccessorAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceRefAccess().getSuccessorAssignment_2()); 
            // InternalPDL3.g:1002:2: ( rule__WorkSequenceRef__SuccessorAssignment_2 )
            // InternalPDL3.g:1002:3: rule__WorkSequenceRef__SuccessorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceRef__SuccessorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceRefAccess().getSuccessorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__Group__2__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL3.g:1011:1: rule__Process__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1015:1: ( ( RULE_ID ) )
            // InternalPDL3.g:1016:2: ( RULE_ID )
            {
            // InternalPDL3.g:1016:2: ( RULE_ID )
            // InternalPDL3.g:1017:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_3_2"
    // InternalPDL3.g:1026:1: rule__Process__WorkDefinitionsAssignment_3_2 : ( ruleWorkDefinitionRef ) ;
    public final void rule__Process__WorkDefinitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1030:1: ( ( ruleWorkDefinitionRef ) )
            // InternalPDL3.g:1031:2: ( ruleWorkDefinitionRef )
            {
            // InternalPDL3.g:1031:2: ( ruleWorkDefinitionRef )
            // InternalPDL3.g:1032:3: ruleWorkDefinitionRef
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionRefParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinitionRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionRefParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_3_2"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_3_3_1"
    // InternalPDL3.g:1041:1: rule__Process__WorkDefinitionsAssignment_3_3_1 : ( ruleWorkDefinitionRef ) ;
    public final void rule__Process__WorkDefinitionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1045:1: ( ( ruleWorkDefinitionRef ) )
            // InternalPDL3.g:1046:2: ( ruleWorkDefinitionRef )
            {
            // InternalPDL3.g:1046:2: ( ruleWorkDefinitionRef )
            // InternalPDL3.g:1047:3: ruleWorkDefinitionRef
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionRefParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinitionRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionRefParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_3_3_1"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_4_2"
    // InternalPDL3.g:1056:1: rule__Process__WorkSequencesAssignment_4_2 : ( ruleWorkSequenceRef ) ;
    public final void rule__Process__WorkSequencesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1060:1: ( ( ruleWorkSequenceRef ) )
            // InternalPDL3.g:1061:2: ( ruleWorkSequenceRef )
            {
            // InternalPDL3.g:1061:2: ( ruleWorkSequenceRef )
            // InternalPDL3.g:1062:3: ruleWorkSequenceRef
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceRefParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceRefParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkSequencesAssignment_4_2"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_4_3_1"
    // InternalPDL3.g:1071:1: rule__Process__WorkSequencesAssignment_4_3_1 : ( ruleWorkSequenceRef ) ;
    public final void rule__Process__WorkSequencesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1075:1: ( ( ruleWorkSequenceRef ) )
            // InternalPDL3.g:1076:2: ( ruleWorkSequenceRef )
            {
            // InternalPDL3.g:1076:2: ( ruleWorkSequenceRef )
            // InternalPDL3.g:1077:3: ruleWorkSequenceRef
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceRefParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceRefParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkSequencesAssignment_4_3_1"


    // $ANTLR start "rule__Process__GuidancesAssignment_5_2"
    // InternalPDL3.g:1086:1: rule__Process__GuidancesAssignment_5_2 : ( ruleGuidanceRef ) ;
    public final void rule__Process__GuidancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1090:1: ( ( ruleGuidanceRef ) )
            // InternalPDL3.g:1091:2: ( ruleGuidanceRef )
            {
            // InternalPDL3.g:1091:2: ( ruleGuidanceRef )
            // InternalPDL3.g:1092:3: ruleGuidanceRef
            {
             before(grammarAccess.getProcessAccess().getGuidancesGuidanceRefParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGuidanceRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getGuidancesGuidanceRefParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__GuidancesAssignment_5_2"


    // $ANTLR start "rule__Process__GuidancesAssignment_5_3_1"
    // InternalPDL3.g:1101:1: rule__Process__GuidancesAssignment_5_3_1 : ( ruleGuidanceRef ) ;
    public final void rule__Process__GuidancesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1105:1: ( ( ruleGuidanceRef ) )
            // InternalPDL3.g:1106:2: ( ruleGuidanceRef )
            {
            // InternalPDL3.g:1106:2: ( ruleGuidanceRef )
            // InternalPDL3.g:1107:3: ruleGuidanceRef
            {
             before(grammarAccess.getProcessAccess().getGuidancesGuidanceRefParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGuidanceRef();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getGuidancesGuidanceRefParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__GuidancesAssignment_5_3_1"


    // $ANTLR start "rule__WorkDefinitionRef__NameAssignment"
    // InternalPDL3.g:1116:1: rule__WorkDefinitionRef__NameAssignment : ( RULE_ID ) ;
    public final void rule__WorkDefinitionRef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1120:1: ( ( RULE_ID ) )
            // InternalPDL3.g:1121:2: ( RULE_ID )
            {
            // InternalPDL3.g:1121:2: ( RULE_ID )
            // InternalPDL3.g:1122:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionRefAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionRefAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinitionRef__NameAssignment"


    // $ANTLR start "rule__WorkSequenceRef__PredecessorAssignment_0"
    // InternalPDL3.g:1131:1: rule__WorkSequenceRef__PredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequenceRef__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1135:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:1136:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:1136:2: ( ( RULE_ID ) )
            // InternalPDL3.g:1137:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceRefAccess().getPredecessorWorkDefinitionRefCrossReference_0_0()); 
            // InternalPDL3.g:1138:3: ( RULE_ID )
            // InternalPDL3.g:1139:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceRefAccess().getPredecessorWorkDefinitionRefIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceRefAccess().getPredecessorWorkDefinitionRefIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWorkSequenceRefAccess().getPredecessorWorkDefinitionRefCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__PredecessorAssignment_0"


    // $ANTLR start "rule__WorkSequenceRef__LinkTypeAssignment_1"
    // InternalPDL3.g:1150:1: rule__WorkSequenceRef__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequenceRef__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1154:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL3.g:1155:2: ( ruleWorkSequenceType )
            {
            // InternalPDL3.g:1155:2: ( ruleWorkSequenceType )
            // InternalPDL3.g:1156:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceRefAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRefAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequenceRef__SuccessorAssignment_2"
    // InternalPDL3.g:1165:1: rule__WorkSequenceRef__SuccessorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequenceRef__SuccessorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1169:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:1170:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:1170:2: ( ( RULE_ID ) )
            // InternalPDL3.g:1171:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceRefAccess().getSuccessorWorkDefinitionRefCrossReference_2_0()); 
            // InternalPDL3.g:1172:3: ( RULE_ID )
            // InternalPDL3.g:1173:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceRefAccess().getSuccessorWorkDefinitionRefIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceRefAccess().getSuccessorWorkDefinitionRefIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorkSequenceRefAccess().getSuccessorWorkDefinitionRefCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceRef__SuccessorAssignment_2"


    // $ANTLR start "rule__GuidanceRef__TextAssignment"
    // InternalPDL3.g:1184:1: rule__GuidanceRef__TextAssignment : ( RULE_STRING ) ;
    public final void rule__GuidanceRef__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1188:1: ( ( RULE_STRING ) )
            // InternalPDL3.g:1189:2: ( RULE_STRING )
            {
            // InternalPDL3.g:1189:2: ( RULE_STRING )
            // InternalPDL3.g:1190:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceRefAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceRefAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceRef__TextAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});

}