// Generated from C:/Users/Minh/Desktop/Mod 8 Project/Mod8FinalProjectGroup22/src/finalproject/grammar\JAFAR.g4 by ANTLR 4.10.1
package finalproject.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JAFARParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, BEGIN=2, BOOLEAN=3, INTEGER=4, VOID=5, SHARED=6, ELSE=7, END=8, 
		EXIT=9, FALSE=10, FUNC=11, RETURN=12, IF=13, INPUT=14, NOT=15, OR=16, 
		PRINT=17, PROC=18, PROGRAM=19, TRUE=20, WHILE=21, THREAD=22, PARBEGIN=23, 
		PAREND=24, LOCK=25, UNLOCK=26, ASS=27, COLON=28, COMMA=29, DQUOTE=30, 
		EQ=31, GE=32, GT=33, LE=34, LBRACE=35, LPAR=36, LT=37, MINUS=38, NE=39, 
		PLUS=40, RBRACE=41, RPAR=42, SEMI=43, SLASH=44, STAR=45, LSQ=46, RSQ=47, 
		EXPLNMARK=48, ID=49, NUM=50, STR=51, COMMENT=52, WS=53;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_decl = 2, RULE_sharedDecl = 3, RULE_func = 4, 
		RULE_params = 5, RULE_var = 6, RULE_block = 7, RULE_threadBlock = 8, RULE_stat = 9, 
		RULE_target = 10, RULE_expr = 11, RULE_arrayID = 12, RULE_prfOp = 13, 
		RULE_multOp = 14, RULE_plusOp = 15, RULE_boolOp = 16, RULE_compOp = 17, 
		RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "decl", "sharedDecl", "func", "params", "var", "block", 
			"threadBlock", "stat", "target", "expr", "arrayID", "prfOp", "multOp", 
			"plusOp", "boolOp", "compOp", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "':='", "':'", "','", "'\"'", "'=='", "'>='", "'>'", 
			"'<='", "'{'", "'('", "'<'", "'-'", "'!='", "'+'", "'}'", "')'", "';'", 
			"'/'", "'*'", "'['", "']'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "BEGIN", "BOOLEAN", "INTEGER", "VOID", "SHARED", "ELSE", 
			"END", "EXIT", "FALSE", "FUNC", "RETURN", "IF", "INPUT", "NOT", "OR", 
			"PRINT", "PROC", "PROGRAM", "TRUE", "WHILE", "THREAD", "PARBEGIN", "PAREND", 
			"LOCK", "UNLOCK", "ASS", "COLON", "COMMA", "DQUOTE", "EQ", "GE", "GT", 
			"LE", "LBRACE", "LPAR", "LT", "MINUS", "NE", "PLUS", "RBRACE", "RPAR", 
			"SEMI", "SLASH", "STAR", "LSQ", "RSQ", "EXPLNMARK", "ID", "NUM", "STR", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JAFAR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JAFARParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(JAFARParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JAFARParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PROGRAM);
			setState(39);
			match(ID);
			setState(40);
			match(SEMI);
			setState(41);
			body();
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SharedDeclContext> sharedDecl() {
			return getRuleContexts(SharedDeclContext.class);
		}
		public SharedDeclContext sharedDecl(int i) {
			return getRuleContext(SharedDeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARED) {
				{
				{
				setState(44);
				sharedDecl();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << VOID))) != 0)) {
				{
				{
				setState(50);
				decl();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(56);
				func();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclContext extends DeclContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JAFARParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JAFARParser.SEMI, i);
		}
		public VarDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			int _alt;
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					var();
					setState(65);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SharedDeclContext extends ParserRuleContext {
		public TerminalNode SHARED() { return getToken(JAFARParser.SHARED, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public SharedDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterSharedDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitSharedDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitSharedDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedDeclContext sharedDecl() throws RecognitionException {
		SharedDeclContext _localctx = new SharedDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sharedDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SHARED);
			setState(72);
			type();
			setState(73);
			match(ID);
			setState(74);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDeclContext extends FuncContext {
		public TerminalNode FUNC() { return getToken(JAFARParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(JAFARParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(JAFARParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(JAFARParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public TerminalNode END() { return getToken(JAFARParser.END, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncDeclContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			_localctx = new FuncDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(FUNC);
			setState(77);
			match(ID);
			setState(78);
			match(LPAR);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << VOID))) != 0)) {
				{
				setState(79);
				params();
				}
			}

			setState(82);
			match(RPAR);
			setState(83);
			match(COLON);
			setState(84);
			type();
			setState(85);
			match(BEGIN);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << VOID))) != 0)) {
				{
				{
				setState(86);
				decl();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << PARBEGIN) | (1L << LOCK) | (1L << UNLOCK) | (1L << ID))) != 0)) {
				{
				{
				setState(92);
				stat();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(RETURN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NOT) | (1L << TRUE) | (1L << LPAR) | (1L << MINUS) | (1L << LSQ) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(99);
				expr(0);
				}
			}

			setState(102);
			match(SEMI);
			setState(103);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsDeclContext extends ParamsContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JAFARParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JAFARParser.SEMI, i);
		}
		public ParamsDeclContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterParamsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitParamsDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitParamsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			_localctx = new ParamsDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			var();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(106);
				match(SEMI);
				setState(107);
				var();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JAFARParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JAFARParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JAFARParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JAFARParser.COMMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			match(ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				match(ID);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(JAFARParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(JAFARParser.END, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(BEGIN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << VOID))) != 0)) {
				{
				{
				setState(123);
				decl();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				stat();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << PARBEGIN) | (1L << LOCK) | (1L << UNLOCK) | (1L << ID))) != 0) );
			setState(134);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThreadBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ThreadBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threadBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterThreadBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitThreadBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitThreadBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreadBlockContext threadBlock() throws RecognitionException {
		ThreadBlockContext _localctx = new ThreadBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_threadBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssStatContext extends StatContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode ASS() { return getToken(JAFARParser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public AssStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterAssStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitAssStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitAssStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public TerminalNode IF() { return getToken(JAFARParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JAFARParser.COLON, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JAFARParser.ELSE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThreadStatContext extends StatContext {
		public TerminalNode PARBEGIN() { return getToken(JAFARParser.PARBEGIN, 0); }
		public TerminalNode COLON() { return getToken(JAFARParser.COLON, 0); }
		public TerminalNode PAREND() { return getToken(JAFARParser.PAREND, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public List<ThreadBlockContext> threadBlock() {
			return getRuleContexts(ThreadBlockContext.class);
		}
		public ThreadBlockContext threadBlock(int i) {
			return getRuleContext(ThreadBlockContext.class,i);
		}
		public ThreadStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterThreadStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitThreadStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitThreadStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LockStatContext extends StatContext {
		public TerminalNode LOCK() { return getToken(JAFARParser.LOCK, 0); }
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public LockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterLockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitLockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitLockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutStatContext extends StatContext {
		public TerminalNode PRINT() { return getToken(JAFARParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public OutStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterOutStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitOutStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitOutStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncStatContext extends StatContext {
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JAFARParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JAFARParser.COMMA, i);
		}
		public FuncStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterFuncStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitFuncStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitFuncStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnlockStatContext extends StatContext {
		public TerminalNode UNLOCK() { return getToken(JAFARParser.UNLOCK, 0); }
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(JAFARParser.SEMI, 0); }
		public UnlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterUnlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitUnlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitUnlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatContext {
		public TerminalNode WHILE() { return getToken(JAFARParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JAFARParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				target();
				setState(139);
				match(ASS);
				setState(140);
				expr(0);
				setState(141);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IF);
				setState(144);
				expr(0);
				setState(145);
				match(COLON);
				setState(146);
				block();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(147);
					match(ELSE);
					setState(148);
					block();
					}
				}

				}
				break;
			case 3:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(WHILE);
				setState(152);
				expr(0);
				setState(153);
				match(COLON);
				setState(154);
				block();
				}
				break;
			case 4:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				block();
				}
				break;
			case 5:
				_localctx = new ThreadStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(PARBEGIN);
				setState(158);
				match(COLON);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					threadBlock();
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BEGIN );
				setState(164);
				match(PAREND);
				setState(165);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new LockStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(LOCK);
				setState(168);
				match(LPAR);
				setState(169);
				match(RPAR);
				setState(170);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new UnlockStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(UNLOCK);
				setState(172);
				match(LPAR);
				setState(173);
				match(RPAR);
				setState(174);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new OutStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				match(PRINT);
				setState(176);
				match(LPAR);
				setState(177);
				expr(0);
				setState(178);
				match(RPAR);
				setState(179);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new FuncStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				match(ID);
				setState(182);
				match(LPAR);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NOT) | (1L << TRUE) | (1L << LPAR) | (1L << MINUS) | (1L << LSQ) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(183);
					expr(0);
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(184);
						match(COMMA);
						setState(185);
						expr(0);
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(193);
				match(RPAR);
				setState(194);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	 
		public TargetContext() { }
		public void copyFrom(TargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdTargetContext extends TargetContext {
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public IdTargetContext(TargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterIdTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitIdTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitIdTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTargetContext extends TargetContext {
		public ArrayIDContext arrayID() {
			return getRuleContext(ArrayIDContext.class,0);
		}
		public List<TerminalNode> LSQ() { return getTokens(JAFARParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(JAFARParser.LSQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RSQ() { return getTokens(JAFARParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(JAFARParser.RSQ, i);
		}
		public ArrayTargetContext(TargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterArrayTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitArrayTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitArrayTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_target);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IdTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				arrayID();
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					match(LSQ);
					setState(200);
					expr(0);
					setState(201);
					match(RSQ);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LSQ );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JAFARParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JAFARParser.COMMA, i);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public TerminalNode LSQ() { return getToken(JAFARParser.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(JAFARParser.RSQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JAFARParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JAFARParser.COMMA, i);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(JAFARParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(JAFARParser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlusOpContext plusOp() {
			return getRuleContext(PlusOpContext.class,0);
		}
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExprContext extends ExprContext {
		public ArrayIDContext arrayID() {
			return getRuleContext(ArrayIDContext.class,0);
		}
		public List<TerminalNode> LSQ() { return getTokens(JAFARParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(JAFARParser.LSQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RSQ() { return getTokens(JAFARParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(JAFARParser.RSQ, i);
		}
		public IndexExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(JAFARParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(JAFARParser.RPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrfExprContext extends ExprContext {
		public PrfOpContext prfOp() {
			return getRuleContext(PrfOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterPrfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitPrfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitPrfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(JAFARParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new PrfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				prfOp();
				setState(211);
				expr(13);
				}
				break;
			case 2:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(LPAR);
				setState(214);
				expr(0);
				setState(215);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(NUM);
				}
				break;
			case 5:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(LSQ);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NOT) | (1L << TRUE) | (1L << LPAR) | (1L << MINUS) | (1L << LSQ) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(222);
					expr(0);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(223);
						match(COMMA);
						setState(224);
						expr(0);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(232);
				match(RSQ);
				}
				break;
			case 8:
				{
				_localctx = new IndexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				arrayID();
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(LSQ);
						setState(235);
						expr(0);
						setState(236);
						match(RSQ);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(ID);
				setState(243);
				match(LPAR);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NOT) | (1L << TRUE) | (1L << LPAR) | (1L << MINUS) | (1L << LSQ) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(244);
					expr(0);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(245);
						match(COMMA);
						setState(246);
						expr(0);
						}
						}
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(254);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(258);
						multOp();
						setState(259);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(262);
						plusOp();
						setState(263);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(266);
						compOp();
						setState(267);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(270);
						boolOp();
						setState(271);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JAFARParser.ID, 0); }
		public ArrayIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterArrayID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitArrayID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitArrayID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIDContext arrayID() throws RecognitionException {
		ArrayIDContext _localctx = new ArrayIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrfOpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(JAFARParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(JAFARParser.NOT, 0); }
		public PrfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prfOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterPrfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitPrfOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitPrfOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrfOpContext prfOp() throws RecognitionException {
		PrfOpContext _localctx = new PrfOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(JAFARParser.STAR, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(JAFARParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JAFARParser.MINUS, 0); }
		public PlusOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitPlusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitPlusOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOpContext plusOp() throws RecognitionException {
		PlusOpContext _localctx = new PlusOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plusOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(JAFARParser.AND, 0); }
		public TerminalNode OR() { return getToken(JAFARParser.OR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(JAFARParser.LE, 0); }
		public TerminalNode LT() { return getToken(JAFARParser.LT, 0); }
		public TerminalNode GE() { return getToken(JAFARParser.GE, 0); }
		public TerminalNode GT() { return getToken(JAFARParser.GT, 0); }
		public TerminalNode EQ() { return getToken(JAFARParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JAFARParser.NE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanArrayTypeContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(JAFARParser.BOOLEAN, 0); }
		public List<TerminalNode> LSQ() { return getTokens(JAFARParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(JAFARParser.LSQ, i);
		}
		public List<TerminalNode> NUM() { return getTokens(JAFARParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(JAFARParser.NUM, i);
		}
		public List<TerminalNode> RSQ() { return getTokens(JAFARParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(JAFARParser.RSQ, i);
		}
		public BooleanArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBooleanArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBooleanArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBooleanArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(JAFARParser.INTEGER, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidTypeContext extends TypeContext {
		public TerminalNode VOID() { return getToken(JAFARParser.VOID, 0); }
		public VoidTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerArrayTypeContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(JAFARParser.INTEGER, 0); }
		public List<TerminalNode> LSQ() { return getTokens(JAFARParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(JAFARParser.LSQ, i);
		}
		public List<TerminalNode> NUM() { return getTokens(JAFARParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(JAFARParser.NUM, i);
		}
		public List<TerminalNode> RSQ() { return getTokens(JAFARParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(JAFARParser.RSQ, i);
		}
		public IntegerArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterIntegerArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitIntegerArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitIntegerArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(JAFARParser.BOOLEAN, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAFARListener ) ((JAFARListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAFARVisitor ) return ((JAFARVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new IntegerArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(INTEGER);
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(291);
					match(LSQ);
					setState(292);
					match(NUM);
					setState(293);
					match(RSQ);
					}
					}
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LSQ );
				}
				break;
			case 2:
				_localctx = new BooleanArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(BOOLEAN);
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(299);
					match(LSQ);
					setState(300);
					match(NUM);
					setState(301);
					match(RSQ);
					}
					}
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LSQ );
				}
				break;
			case 3:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(INTEGER);
				}
				break;
			case 4:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(BOOLEAN);
				}
				break;
			case 5:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0138\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001"+
		"\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0005\u0001"+
		":\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002D\b\u0002\u000b\u0002\f\u0002E\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004X\b\u0004\n\u0004"+
		"\f\u0004[\t\u0004\u0001\u0004\u0005\u0004^\b\u0004\n\u0004\f\u0004a\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005m\b"+
		"\u0005\n\u0005\f\u0005p\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006v\b\u0006\n\u0006\f\u0006y\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080\t\u0007\u0001\u0007"+
		"\u0004\u0007\u0083\b\u0007\u000b\u0007\f\u0007\u0084\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0096\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00a1"+
		"\b\t\u000b\t\f\t\u00a2\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00bb"+
		"\b\t\n\t\f\t\u00be\t\t\u0003\t\u00c0\b\t\u0001\t\u0001\t\u0003\t\u00c4"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00cc\b\n"+
		"\u000b\n\f\n\u00cd\u0003\n\u00d0\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00e2\b\u000b\n\u000b\f\u000b\u00e5\t\u000b\u0003"+
		"\u000b\u00e7\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00ef\b\u000b\u000b\u000b\f\u000b\u00f0"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00f8\b\u000b\n\u000b\f\u000b\u00fb\t\u000b\u0003\u000b\u00fd\b\u000b"+
		"\u0001\u000b\u0003\u000b\u0100\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0112\b\u000b\n\u000b\f\u000b\u0115\t\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u0127\b\u0012\u000b\u0012\f\u0012"+
		"\u0128\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u012f"+
		"\b\u0012\u000b\u0012\f\u0012\u0130\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0136\b\u0012\u0001\u0012\u0000\u0001\u0016\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0004\u0002\u0000\u000f\u000f&&\u0002\u0000&&((\u0002\u0000"+
		"\u0001\u0001\u0010\u0010\u0003\u0000\u001f\"%%\'\'\u0155\u0000&\u0001"+
		"\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000"+
		"\u0000\u0006G\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\ni\u0001"+
		"\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000"+
		"\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u00c3\u0001\u0000\u0000"+
		"\u0000\u0014\u00cf\u0001\u0000\u0000\u0000\u0016\u00ff\u0001\u0000\u0000"+
		"\u0000\u0018\u0116\u0001\u0000\u0000\u0000\u001a\u0118\u0001\u0000\u0000"+
		"\u0000\u001c\u011a\u0001\u0000\u0000\u0000\u001e\u011c\u0001\u0000\u0000"+
		"\u0000 \u011e\u0001\u0000\u0000\u0000\"\u0120\u0001\u0000\u0000\u0000"+
		"$\u0135\u0001\u0000\u0000\u0000&\'\u0005\u0013\u0000\u0000\'(\u00051\u0000"+
		"\u0000()\u0005+\u0000\u0000)*\u0003\u0002\u0001\u0000*+\u0005\u0000\u0000"+
		"\u0001+\u0001\u0001\u0000\u0000\u0000,.\u0003\u0006\u0003\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000005\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000024\u0003\u0004\u0002\u000032\u0001\u0000\u0000\u000047\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006;\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0003\b\u0004\u000098\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>?\u0003\u000e\u0007\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0003"+
		"\f\u0006\u0000AB\u0005+\u0000\u0000BD\u0001\u0000\u0000\u0000C@\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005\u0006"+
		"\u0000\u0000HI\u0003$\u0012\u0000IJ\u00051\u0000\u0000JK\u0005+\u0000"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005\u000b\u0000\u0000MN\u0005"+
		"1\u0000\u0000NP\u0005$\u0000\u0000OQ\u0003\n\u0005\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005"+
		"*\u0000\u0000ST\u0005\u001c\u0000\u0000TU\u0003$\u0012\u0000UY\u0005\u0002"+
		"\u0000\u0000VX\u0003\u0004\u0002\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z_\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0003\u0012\t"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bd\u0005\f\u0000\u0000ce\u0003\u0016\u000b\u0000dc\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fg\u0005+\u0000\u0000gh\u0005\b\u0000\u0000h\t\u0001\u0000\u0000\u0000"+
		"in\u0003\f\u0006\u0000jk\u0005+\u0000\u0000km\u0003\f\u0006\u0000lj\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000o\u000b\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qr\u0003$\u0012\u0000rw\u00051\u0000\u0000st\u0005\u001d\u0000"+
		"\u0000tv\u00051\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\r\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z~\u0005\u0002\u0000\u0000{}\u0003"+
		"\u0004\u0002\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0003\u0012\t\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\b\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u000e"+
		"\u0007\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0014"+
		"\n\u0000\u008b\u008c\u0005\u001b\u0000\u0000\u008c\u008d\u0003\u0016\u000b"+
		"\u0000\u008d\u008e\u0005+\u0000\u0000\u008e\u00c4\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\r\u0000\u0000\u0090\u0091\u0003\u0016\u000b\u0000\u0091"+
		"\u0092\u0005\u001c\u0000\u0000\u0092\u0095\u0003\u000e\u0007\u0000\u0093"+
		"\u0094\u0005\u0007\u0000\u0000\u0094\u0096\u0003\u000e\u0007\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u00c4\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098"+
		"\u0099\u0003\u0016\u000b\u0000\u0099\u009a\u0005\u001c\u0000\u0000\u009a"+
		"\u009b\u0003\u000e\u0007\u0000\u009b\u00c4\u0001\u0000\u0000\u0000\u009c"+
		"\u00c4\u0003\u000e\u0007\u0000\u009d\u009e\u0005\u0017\u0000\u0000\u009e"+
		"\u00a0\u0005\u001c\u0000\u0000\u009f\u00a1\u0003\u0010\b\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0018\u0000\u0000\u00a5\u00a6"+
		"\u0005+\u0000\u0000\u00a6\u00c4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0019\u0000\u0000\u00a8\u00a9\u0005$\u0000\u0000\u00a9\u00aa\u0005*\u0000"+
		"\u0000\u00aa\u00c4\u0005+\u0000\u0000\u00ab\u00ac\u0005\u001a\u0000\u0000"+
		"\u00ac\u00ad\u0005$\u0000\u0000\u00ad\u00ae\u0005*\u0000\u0000\u00ae\u00c4"+
		"\u0005+\u0000\u0000\u00af\u00b0\u0005\u0011\u0000\u0000\u00b0\u00b1\u0005"+
		"$\u0000\u0000\u00b1\u00b2\u0003\u0016\u000b\u0000\u00b2\u00b3\u0005*\u0000"+
		"\u0000\u00b3\u00b4\u0005+\u0000\u0000\u00b4\u00c4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u00051\u0000\u0000\u00b6\u00bf\u0005$\u0000\u0000\u00b7\u00bc"+
		"\u0003\u0016\u000b\u0000\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9\u00bb"+
		"\u0003\u0016\u000b\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005*\u0000\u0000\u00c2\u00c4\u0005+\u0000\u0000\u00c3\u008a\u0001\u0000"+
		"\u0000\u0000\u00c3\u008f\u0001\u0000\u0000\u0000\u00c3\u0097\u0001\u0000"+
		"\u0000\u0000\u00c3\u009c\u0001\u0000\u0000\u0000\u00c3\u009d\u0001\u0000"+
		"\u0000\u0000\u00c3\u00a7\u0001\u0000\u0000\u0000\u00c3\u00ab\u0001\u0000"+
		"\u0000\u0000\u00c3\u00af\u0001\u0000\u0000\u0000\u00c3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5\u00d0\u00051\u0000"+
		"\u0000\u00c6\u00cb\u0003\u0018\f\u0000\u00c7\u00c8\u0005.\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0016\u000b\u0000\u00c9\u00ca\u0005/\u0000\u0000\u00ca"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00d0"+
		"\u0015\u0001\u0000\u0000\u0000\u00d1\u00d2\u0006\u000b\uffff\uffff\u0000"+
		"\u00d2\u00d3\u0003\u001a\r\u0000\u00d3\u00d4\u0003\u0016\u000b\r\u00d4"+
		"\u0100\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005$\u0000\u0000\u00d6\u00d7"+
		"\u0003\u0016\u000b\u0000\u00d7\u00d8\u0005*\u0000\u0000\u00d8\u0100\u0001"+
		"\u0000\u0000\u0000\u00d9\u0100\u00051\u0000\u0000\u00da\u0100\u00052\u0000"+
		"\u0000\u00db\u0100\u0005\u0014\u0000\u0000\u00dc\u0100\u0005\n\u0000\u0000"+
		"\u00dd\u00e6\u0005.\u0000\u0000\u00de\u00e3\u0003\u0016\u000b\u0000\u00df"+
		"\u00e0\u0005\u001d\u0000\u0000\u00e0\u00e2\u0003\u0016\u000b\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00de\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u0100\u0005/\u0000\u0000\u00e9\u00ee"+
		"\u0003\u0018\f\u0000\u00ea\u00eb\u0005.\u0000\u0000\u00eb\u00ec\u0003"+
		"\u0016\u000b\u0000\u00ec\u00ed\u0005/\u0000\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u0100\u0001\u0000\u0000\u0000\u00f2\u00f3\u00051\u0000"+
		"\u0000\u00f3\u00fc\u0005$\u0000\u0000\u00f4\u00f9\u0003\u0016\u000b\u0000"+
		"\u00f5\u00f6\u0005\u001d\u0000\u0000\u00f6\u00f8\u0003\u0016\u000b\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0005*\u0000\u0000\u00ff"+
		"\u00d1\u0001\u0000\u0000\u0000\u00ff\u00d5\u0001\u0000\u0000\u0000\u00ff"+
		"\u00d9\u0001\u0000\u0000\u0000\u00ff\u00da\u0001\u0000\u0000\u0000\u00ff"+
		"\u00db\u0001\u0000\u0000\u0000\u00ff\u00dc\u0001\u0000\u0000\u0000\u00ff"+
		"\u00dd\u0001\u0000\u0000\u0000\u00ff\u00e9\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f2\u0001\u0000\u0000\u0000\u0100\u0113\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\n\f\u0000\u0000\u0102\u0103\u0003\u001c\u000e\u0000\u0103\u0104"+
		"\u0003\u0016\u000b\r\u0104\u0112\u0001\u0000\u0000\u0000\u0105\u0106\n"+
		"\u000b\u0000\u0000\u0106\u0107\u0003\u001e\u000f\u0000\u0107\u0108\u0003"+
		"\u0016\u000b\f\u0108\u0112\u0001\u0000\u0000\u0000\u0109\u010a\n\n\u0000"+
		"\u0000\u010a\u010b\u0003\"\u0011\u0000\u010b\u010c\u0003\u0016\u000b\u000b"+
		"\u010c\u0112\u0001\u0000\u0000\u0000\u010d\u010e\n\t\u0000\u0000\u010e"+
		"\u010f\u0003 \u0010\u0000\u010f\u0110\u0003\u0016\u000b\n\u0110\u0112"+
		"\u0001\u0000\u0000\u0000\u0111\u0101\u0001\u0000\u0000\u0000\u0111\u0105"+
		"\u0001\u0000\u0000\u0000\u0111\u0109\u0001\u0000\u0000\u0000\u0111\u010d"+
		"\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0017"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u00051\u0000\u0000\u0117\u0019\u0001\u0000\u0000\u0000\u0118\u0119\u0007"+
		"\u0000\u0000\u0000\u0119\u001b\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"-\u0000\u0000\u011b\u001d\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0001"+
		"\u0000\u0000\u011d\u001f\u0001\u0000\u0000\u0000\u011e\u011f\u0007\u0002"+
		"\u0000\u0000\u011f!\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0003\u0000"+
		"\u0000\u0121#\u0001\u0000\u0000\u0000\u0122\u0126\u0005\u0004\u0000\u0000"+
		"\u0123\u0124\u0005.\u0000\u0000\u0124\u0125\u00052\u0000\u0000\u0125\u0127"+
		"\u0005/\u0000\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u0136\u0001\u0000\u0000\u0000\u012a\u012e\u0005"+
		"\u0003\u0000\u0000\u012b\u012c\u0005.\u0000\u0000\u012c\u012d\u00052\u0000"+
		"\u0000\u012d\u012f\u0005/\u0000\u0000\u012e\u012b\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0136\u0001\u0000\u0000\u0000"+
		"\u0132\u0136\u0005\u0004\u0000\u0000\u0133\u0136\u0005\u0003\u0000\u0000"+
		"\u0134\u0136\u0005\u0005\u0000\u0000\u0135\u0122\u0001\u0000\u0000\u0000"+
		"\u0135\u012a\u0001\u0000\u0000\u0000\u0135\u0132\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0136%\u0001\u0000\u0000\u0000\u001e/5;EPY_dnw~\u0084\u0095\u00a2\u00bc"+
		"\u00bf\u00c3\u00cd\u00cf\u00e3\u00e6\u00f0\u00f9\u00fc\u00ff\u0111\u0113"+
		"\u0128\u0130\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}