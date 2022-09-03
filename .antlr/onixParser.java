// Generated from c:\Users\ruy_g\OneDrive\Área de Trabalho\Transpileitor2\onix.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class onixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Libstring=1, StringLiteral=2, L_PAR=3, R_PAR=4, L_BRAC=5, R_BRAC=6, L_SBRAC=7, 
		R_SBRAC=8, EQUAL=9, PLUS=10, MINUS=11, MULT=12, POWER=13, DIV=14, NEGATION=15, 
		MOD=16, LESSER_THAN=17, GREATER_THAN=18, LESSER_EQUAL=19, GREATER_EQUAL=20, 
		NOT_EQUAL=21, EQUALS_TO=22, PLUS_ASSIGN=23, MINUS_ASSIGN=24, MULT_ASSIGN=25, 
		DIV_ASSIGN=26, LSH_ASSIGN=27, RSH_ASSIGN=28, AND_ASSIGN=29, XOR_ASSIGN=30, 
		OR_ASSIGN=31, ADDROP=32, BOOL_AND=33, BOOL_OR=34, BITWISE_AND=35, BITWISE_OR=36, 
		BITWISE_XOR=37, BITWISE_LSH=38, BITWISE_RSH=39, DOUBLE_PERIOD=40, ELLIPSIS=41, 
		PERIOD=42, COLON=43, COMMA=44, DOUBLE_COLON=45, ARROW=46, DOUBLE_QUOTE=47, 
		INTERROGATION=48, INCREMENT=49, DECREMENT=50, K_GOTO=51, K_AS=52, K_IMPORT=53, 
		K_USING=54, K_SUB=55, K_FUNC=56, K_RECORD=57, K_LOOP=58, K_CONST=59, K_VAR=60, 
		K_COUNT=61, K_FOR=62, K_BREAK=63, K_CONTINUE=64, K_EACH=65, K_OF=66, K_IN=67, 
		K_WHILE=68, K_REPEAT=69, K_UNTIL=70, K_VM=71, K_CPP=72, K_CPP_VAR=73, 
		K_IF=74, K_ELSE=75, K_END=76, K_RETURN=77, DOUBLE_ARROW=78, K_FALSE=79, 
		K_TRUE=80, K_BYTE=81, K_INT=82, K_LONG=83, K_FLOAT=84, K_STRING=85, LABEL=86, 
		NAME=87, INT=88, HEX=89, BIN=90, FLOAT=91, COMMENT=92, LINE_COMMENT=93, 
		WS=94;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_import_directive = 2, RULE_use_directive = 3, 
		RULE_statement = 4, RULE_ext_block = 5, RULE_body = 6, RULE_record_def = 7, 
		RULE_func_def = 8, RULE_func_stub = 9, RULE_cpp_ext_block = 10, RULE_vm_ext_block = 11, 
		RULE_cpp_func_def = 12, RULE_cpp_var_def = 13, RULE_vm_func_def = 14, 
		RULE_sub_name = 15, RULE_sub_def = 16, RULE_sub_stub = 17, RULE_cpp_sub_def = 18, 
		RULE_vm_sub_def = 19, RULE_any_args = 20, RULE_labelDef = 21, RULE_gotoJump = 22, 
		RULE_breakLoop = 23, RULE_continueLoop = 24, RULE_retStatement = 25, RULE_par = 26, 
		RULE_parlist = 27, RULE_conditional = 28, RULE_if_elseif = 29, RULE_if_else = 30, 
		RULE_for_loop = 31, RULE_range_loop = 32, RULE_for_each_loop = 33, RULE_while_loop = 34, 
		RULE_repeat_loop = 35, RULE_think_loop = 36, RULE_declaration = 37, RULE_constDecUnit = 38, 
		RULE_constDeclaration = 39, RULE_initializer = 40, RULE_varDecUnit = 41, 
		RULE_varDeclaration = 42, RULE_arrayInitializer = 43, RULE_arrayDecUnit = 44, 
		RULE_arrayDeclaration = 45, RULE_assignmentUnit = 46, RULE_assignment = 47, 
		RULE_assignOp = 48, RULE_unaryOp = 49, RULE_propOp = 50, RULE_primaryExpression = 51, 
		RULE_postfixExpression = 52, RULE_exp = 53, RULE_multiplicative = 54, 
		RULE_additive = 55, RULE_shift = 56, RULE_relational = 57, RULE_equality = 58, 
		RULE_bitAnd = 59, RULE_bitXor = 60, RULE_bitOr = 61, RULE_boolAnd = 62, 
		RULE_boolOr = 63, RULE_expList = 64, RULE_number = 65, RULE_string = 66, 
		RULE_type = 67, RULE_unary = 68, RULE_identifier = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "import_directive", "use_directive", "statement", 
			"ext_block", "body", "record_def", "func_def", "func_stub", "cpp_ext_block", 
			"vm_ext_block", "cpp_func_def", "cpp_var_def", "vm_func_def", "sub_name", 
			"sub_def", "sub_stub", "cpp_sub_def", "vm_sub_def", "any_args", "labelDef", 
			"gotoJump", "breakLoop", "continueLoop", "retStatement", "par", "parlist", 
			"conditional", "if_elseif", "if_else", "for_loop", "range_loop", "for_each_loop", 
			"while_loop", "repeat_loop", "think_loop", "declaration", "constDecUnit", 
			"constDeclaration", "initializer", "varDecUnit", "varDeclaration", "arrayInitializer", 
			"arrayDecUnit", "arrayDeclaration", "assignmentUnit", "assignment", "assignOp", 
			"unaryOp", "propOp", "primaryExpression", "postfixExpression", "exp", 
			"multiplicative", "additive", "shift", "relational", "equality", "bitAnd", 
			"bitXor", "bitOr", "boolAnd", "boolOr", "expList", "number", "string", 
			"type", "unary", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'+'", 
			"'-'", "'*'", "'**'", "'/'", "'!'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'!='", "'=='", "'+='", "'-='", "'*='", "'/='", "'<<='", "'>>='", "'&='", 
			"'^='", "'|='", "'@'", null, null, "'&'", "'|'", "'^'", "'<<'", "'>>'", 
			"'..'", "'...'", "'.'", "':'", "','", "'::'", "'->'", "'\"'", "'?'", 
			"'++'", "'--'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Libstring", "StringLiteral", "L_PAR", "R_PAR", "L_BRAC", "R_BRAC", 
			"L_SBRAC", "R_SBRAC", "EQUAL", "PLUS", "MINUS", "MULT", "POWER", "DIV", 
			"NEGATION", "MOD", "LESSER_THAN", "GREATER_THAN", "LESSER_EQUAL", "GREATER_EQUAL", 
			"NOT_EQUAL", "EQUALS_TO", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "LSH_ASSIGN", "RSH_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", 
			"OR_ASSIGN", "ADDROP", "BOOL_AND", "BOOL_OR", "BITWISE_AND", "BITWISE_OR", 
			"BITWISE_XOR", "BITWISE_LSH", "BITWISE_RSH", "DOUBLE_PERIOD", "ELLIPSIS", 
			"PERIOD", "COLON", "COMMA", "DOUBLE_COLON", "ARROW", "DOUBLE_QUOTE", 
			"INTERROGATION", "INCREMENT", "DECREMENT", "K_GOTO", "K_AS", "K_IMPORT", 
			"K_USING", "K_SUB", "K_FUNC", "K_RECORD", "K_LOOP", "K_CONST", "K_VAR", 
			"K_COUNT", "K_FOR", "K_BREAK", "K_CONTINUE", "K_EACH", "K_OF", "K_IN", 
			"K_WHILE", "K_REPEAT", "K_UNTIL", "K_VM", "K_CPP", "K_CPP_VAR", "K_IF", 
			"K_ELSE", "K_END", "K_RETURN", "DOUBLE_ARROW", "K_FALSE", "K_TRUE", "K_BYTE", 
			"K_INT", "K_LONG", "K_FLOAT", "K_STRING", "LABEL", "NAME", "INT", "HEX", 
			"BIN", "FLOAT", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "onix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public onixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(onixParser.EOF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(140);
					block();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(146);
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

	public static class BlockContext extends ParserRuleContext {
		public Import_directiveContext import_directive() {
			return getRuleContext(Import_directiveContext.class,0);
		}
		public Use_directiveContext use_directive() {
			return getRuleContext(Use_directiveContext.class,0);
		}
		public Sub_defContext sub_def() {
			return getRuleContext(Sub_defContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Ext_blockContext ext_block() {
			return getRuleContext(Ext_blockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				import_directive();
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				use_directive();
				}
				break;
			case K_SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				sub_def();
				}
				break;
			case K_FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				func_def();
				}
				break;
			case K_RECORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				record_def();
				}
				break;
			case K_VM:
			case K_CPP:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				ext_block();
				}
				break;
			case StringLiteral:
			case L_BRAC:
			case ADDROP:
			case K_GOTO:
			case K_LOOP:
			case K_CONST:
			case K_VAR:
			case K_COUNT:
			case K_FOR:
			case K_BREAK:
			case K_CONTINUE:
			case K_WHILE:
			case K_REPEAT:
			case K_IF:
			case K_RETURN:
			case K_FALSE:
			case K_TRUE:
			case LABEL:
			case NAME:
			case INT:
			case HEX:
			case BIN:
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Import_directiveContext extends ParserRuleContext {
		public TerminalNode K_IMPORT() { return getToken(onixParser.K_IMPORT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Libstring() { return getToken(onixParser.Libstring, 0); }
		public Import_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_directive; }
	}

	public final Import_directiveContext import_directive() throws RecognitionException {
		Import_directiveContext _localctx = new Import_directiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(K_IMPORT);
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(158);
				string();
				}
				break;
			case Libstring:
				{
				setState(159);
				match(Libstring);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Use_directiveContext extends ParserRuleContext {
		public TerminalNode K_USING() { return getToken(onixParser.K_USING, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Libstring() { return getToken(onixParser.Libstring, 0); }
		public Use_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_directive; }
	}

	public final Use_directiveContext use_directive() throws RecognitionException {
		Use_directiveContext _localctx = new Use_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_use_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(K_USING);
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(163);
				string();
				}
				break;
			case Libstring:
				{
				setState(164);
				match(Libstring);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Repeat_loopContext repeat_loop() {
			return getRuleContext(Repeat_loopContext.class,0);
		}
		public For_each_loopContext for_each_loop() {
			return getRuleContext(For_each_loopContext.class,0);
		}
		public Think_loopContext think_loop() {
			return getRuleContext(Think_loopContext.class,0);
		}
		public Range_loopContext range_loop() {
			return getRuleContext(Range_loopContext.class,0);
		}
		public LabelDefContext labelDef() {
			return getRuleContext(LabelDefContext.class,0);
		}
		public GotoJumpContext gotoJump() {
			return getRuleContext(GotoJumpContext.class,0);
		}
		public BreakLoopContext breakLoop() {
			return getRuleContext(BreakLoopContext.class,0);
		}
		public ContinueLoopContext continueLoop() {
			return getRuleContext(ContinueLoopContext.class,0);
		}
		public RetStatementContext retStatement() {
			return getRuleContext(RetStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				postfixExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				repeat_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				for_each_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				think_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(176);
				range_loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(177);
				labelDef();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(178);
				gotoJump();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(179);
				breakLoop();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(180);
				continueLoop();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(181);
				retStatement();
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

	public static class Ext_blockContext extends ParserRuleContext {
		public Cpp_ext_blockContext cpp_ext_block() {
			return getRuleContext(Cpp_ext_blockContext.class,0);
		}
		public Vm_ext_blockContext vm_ext_block() {
			return getRuleContext(Vm_ext_blockContext.class,0);
		}
		public Ext_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ext_block; }
	}

	public final Ext_blockContext ext_block() throws RecognitionException {
		Ext_blockContext _localctx = new Ext_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ext_block);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CPP:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				cpp_ext_block();
				}
				break;
			case K_VM:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				vm_ext_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << L_BRAC) | (1L << ADDROP) | (1L << K_GOTO) | (1L << K_LOOP) | (1L << K_CONST) | (1L << K_VAR) | (1L << K_COUNT) | (1L << K_FOR) | (1L << K_BREAK))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CONTINUE - 64)) | (1L << (K_WHILE - 64)) | (1L << (K_REPEAT - 64)) | (1L << (K_IF - 64)) | (1L << (K_RETURN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_TRUE - 64)) | (1L << (LABEL - 64)) | (1L << (NAME - 64)) | (1L << (INT - 64)) | (1L << (HEX - 64)) | (1L << (BIN - 64)) | (1L << (FLOAT - 64)))) != 0)) {
				{
				{
				setState(188);
				statement();
				}
				}
				setState(193);
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

	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode K_RECORD() { return getToken(onixParser.K_RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(K_RECORD);
			setState(195);
			identifier();
			setState(196);
			match(COLON);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CONST || _la==K_VAR) {
				{
				{
				setState(197);
				declaration();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(K_END);
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode K_FUNC() { return getToken(onixParser.K_FUNC, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_ARROW() { return getToken(onixParser.DOUBLE_ARROW, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(onixParser.PERIOD, 0); }
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_def);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(K_FUNC);
				setState(206);
				type();
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(207);
					type();
					setState(208);
					match(PERIOD);
					}
					break;
				}
				setState(212);
				identifier();
				setState(213);
				match(DOUBLE_ARROW);
				setState(214);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(K_FUNC);
				setState(217);
				type();
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(218);
					type();
					setState(219);
					match(PERIOD);
					}
					break;
				}
				setState(223);
				identifier();
				setState(224);
				parlist();
				setState(225);
				match(DOUBLE_ARROW);
				setState(226);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(K_FUNC);
				setState(229);
				type();
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(230);
					type();
					setState(231);
					match(PERIOD);
					}
					break;
				}
				setState(235);
				identifier();
				setState(236);
				match(COLON);
				setState(237);
				body();
				setState(238);
				match(K_END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(K_FUNC);
				setState(241);
				type();
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(242);
					type();
					setState(243);
					match(PERIOD);
					}
					break;
				}
				setState(247);
				identifier();
				setState(248);
				parlist();
				setState(249);
				match(COLON);
				setState(250);
				body();
				setState(251);
				match(K_END);
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

	public static class Func_stubContext extends ParserRuleContext {
		public TerminalNode K_FUNC() { return getToken(onixParser.K_FUNC, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(onixParser.PERIOD, 0); }
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public Func_stubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stub; }
	}

	public final Func_stubContext func_stub() throws RecognitionException {
		Func_stubContext _localctx = new Func_stubContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_stub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(K_FUNC);
			setState(256);
			type();
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(257);
				type();
				setState(258);
				match(PERIOD);
				}
				break;
			}
			setState(262);
			identifier();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAR || _la==ELLIPSIS || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (K_BYTE - 81)) | (1L << (K_INT - 81)) | (1L << (K_LONG - 81)) | (1L << (K_FLOAT - 81)) | (1L << (K_STRING - 81)) | (1L << (NAME - 81)))) != 0)) {
				{
				setState(263);
				parlist();
				}
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

	public static class Cpp_ext_blockContext extends ParserRuleContext {
		public TerminalNode K_CPP() { return getToken(onixParser.K_CPP, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public List<Cpp_func_defContext> cpp_func_def() {
			return getRuleContexts(Cpp_func_defContext.class);
		}
		public Cpp_func_defContext cpp_func_def(int i) {
			return getRuleContext(Cpp_func_defContext.class,i);
		}
		public List<Cpp_sub_defContext> cpp_sub_def() {
			return getRuleContexts(Cpp_sub_defContext.class);
		}
		public Cpp_sub_defContext cpp_sub_def(int i) {
			return getRuleContext(Cpp_sub_defContext.class,i);
		}
		public List<Cpp_var_defContext> cpp_var_def() {
			return getRuleContexts(Cpp_var_defContext.class);
		}
		public Cpp_var_defContext cpp_var_def(int i) {
			return getRuleContext(Cpp_var_defContext.class,i);
		}
		public Cpp_ext_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_ext_block; }
	}

	public final Cpp_ext_blockContext cpp_ext_block() throws RecognitionException {
		Cpp_ext_blockContext _localctx = new Cpp_ext_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cpp_ext_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(K_CPP);
			setState(267);
			match(COLON);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringLiteral) {
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(268);
					cpp_func_def();
					}
					break;
				case 2:
					{
					setState(269);
					cpp_sub_def();
					}
					break;
				case 3:
					{
					setState(270);
					cpp_var_def();
					}
					break;
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(K_END);
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

	public static class Vm_ext_blockContext extends ParserRuleContext {
		public TerminalNode K_VM() { return getToken(onixParser.K_VM, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public List<Vm_func_defContext> vm_func_def() {
			return getRuleContexts(Vm_func_defContext.class);
		}
		public Vm_func_defContext vm_func_def(int i) {
			return getRuleContext(Vm_func_defContext.class,i);
		}
		public List<Vm_sub_defContext> vm_sub_def() {
			return getRuleContexts(Vm_sub_defContext.class);
		}
		public Vm_sub_defContext vm_sub_def(int i) {
			return getRuleContext(Vm_sub_defContext.class,i);
		}
		public Vm_ext_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vm_ext_block; }
	}

	public final Vm_ext_blockContext vm_ext_block() throws RecognitionException {
		Vm_ext_blockContext _localctx = new Vm_ext_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vm_ext_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(K_VM);
			setState(279);
			match(COLON);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_FALSE - 79)) | (1L << (K_TRUE - 79)) | (1L << (INT - 79)) | (1L << (HEX - 79)) | (1L << (BIN - 79)) | (1L << (FLOAT - 79)))) != 0)) {
				{
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(280);
					vm_func_def();
					}
					break;
				case 2:
					{
					setState(281);
					vm_sub_def();
					}
					break;
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(K_END);
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

	public static class Cpp_func_defContext extends ParserRuleContext {
		public StringContext sub;
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public Func_stubContext func_stub() {
			return getRuleContext(Func_stubContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Cpp_func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_func_def; }
	}

	public final Cpp_func_defContext cpp_func_def() throws RecognitionException {
		Cpp_func_defContext _localctx = new Cpp_func_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cpp_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((Cpp_func_defContext)_localctx).sub = string();
			setState(290);
			match(COLON);
			setState(291);
			func_stub();
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

	public static class Cpp_var_defContext extends ParserRuleContext {
		public StringContext sub;
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Cpp_var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_var_def; }
	}

	public final Cpp_var_defContext cpp_var_def() throws RecognitionException {
		Cpp_var_defContext _localctx = new Cpp_var_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cpp_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((Cpp_var_defContext)_localctx).sub = string();
			setState(294);
			match(COLON);
			setState(295);
			declaration();
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

	public static class Vm_func_defContext extends ParserRuleContext {
		public NumberContext id;
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public Func_stubContext func_stub() {
			return getRuleContext(Func_stubContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Vm_func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vm_func_def; }
	}

	public final Vm_func_defContext vm_func_def() throws RecognitionException {
		Vm_func_defContext _localctx = new Vm_func_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vm_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			((Vm_func_defContext)_localctx).id = number();
			setState(298);
			match(COLON);
			setState(299);
			func_stub();
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

	public static class Sub_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Sub_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_name; }
	}

	public final Sub_nameContext sub_name() throws RecognitionException {
		Sub_nameContext _localctx = new Sub_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sub_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			identifier();
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

	public static class Sub_defContext extends ParserRuleContext {
		public TerminalNode K_SUB() { return getToken(onixParser.K_SUB, 0); }
		public Sub_nameContext sub_name() {
			return getRuleContext(Sub_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(onixParser.PERIOD, 0); }
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public Sub_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_def; }
	}

	public final Sub_defContext sub_def() throws RecognitionException {
		Sub_defContext _localctx = new Sub_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sub_def);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(K_SUB);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(304);
					type();
					setState(305);
					match(PERIOD);
					}
					break;
				}
				setState(309);
				sub_name();
				setState(310);
				match(COLON);
				setState(311);
				body();
				setState(312);
				match(K_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(K_SUB);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(315);
					type();
					setState(316);
					match(PERIOD);
					}
					break;
				}
				setState(320);
				sub_name();
				setState(321);
				parlist();
				setState(322);
				match(COLON);
				setState(323);
				body();
				setState(324);
				match(K_END);
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

	public static class Sub_stubContext extends ParserRuleContext {
		public TerminalNode K_SUB() { return getToken(onixParser.K_SUB, 0); }
		public Sub_nameContext sub_name() {
			return getRuleContext(Sub_nameContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public Sub_stubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_stub; }
	}

	public final Sub_stubContext sub_stub() throws RecognitionException {
		Sub_stubContext _localctx = new Sub_stubContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sub_stub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(K_SUB);
			setState(329);
			sub_name();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAR || _la==ELLIPSIS || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (K_BYTE - 81)) | (1L << (K_INT - 81)) | (1L << (K_LONG - 81)) | (1L << (K_FLOAT - 81)) | (1L << (K_STRING - 81)) | (1L << (NAME - 81)))) != 0)) {
				{
				setState(330);
				parlist();
				}
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

	public static class Cpp_sub_defContext extends ParserRuleContext {
		public StringContext sub;
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public Sub_stubContext sub_stub() {
			return getRuleContext(Sub_stubContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Cpp_sub_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_sub_def; }
	}

	public final Cpp_sub_defContext cpp_sub_def() throws RecognitionException {
		Cpp_sub_defContext _localctx = new Cpp_sub_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cpp_sub_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((Cpp_sub_defContext)_localctx).sub = string();
			setState(334);
			match(COLON);
			setState(335);
			sub_stub();
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

	public static class Vm_sub_defContext extends ParserRuleContext {
		public NumberContext id;
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public Sub_stubContext sub_stub() {
			return getRuleContext(Sub_stubContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Vm_sub_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vm_sub_def; }
	}

	public final Vm_sub_defContext vm_sub_def() throws RecognitionException {
		Vm_sub_defContext _localctx = new Vm_sub_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vm_sub_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((Vm_sub_defContext)_localctx).id = number();
			setState(338);
			match(COLON);
			setState(339);
			sub_stub();
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

	public static class Any_argsContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(onixParser.ELLIPSIS, 0); }
		public Any_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_args; }
	}

	public final Any_argsContext any_args() throws RecognitionException {
		Any_argsContext _localctx = new Any_argsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_any_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ELLIPSIS);
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

	public static class LabelDefContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(onixParser.LABEL, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public LabelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDef; }
	}

	public final LabelDefContext labelDef() throws RecognitionException {
		LabelDefContext _localctx = new LabelDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_labelDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LABEL);
			setState(344);
			match(COLON);
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

	public static class GotoJumpContext extends ParserRuleContext {
		public TerminalNode K_GOTO() { return getToken(onixParser.K_GOTO, 0); }
		public TerminalNode LABEL() { return getToken(onixParser.LABEL, 0); }
		public GotoJumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoJump; }
	}

	public final GotoJumpContext gotoJump() throws RecognitionException {
		GotoJumpContext _localctx = new GotoJumpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gotoJump);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(K_GOTO);
			setState(347);
			match(LABEL);
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

	public static class BreakLoopContext extends ParserRuleContext {
		public TerminalNode K_BREAK() { return getToken(onixParser.K_BREAK, 0); }
		public BreakLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakLoop; }
	}

	public final BreakLoopContext breakLoop() throws RecognitionException {
		BreakLoopContext _localctx = new BreakLoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_breakLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(K_BREAK);
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

	public static class ContinueLoopContext extends ParserRuleContext {
		public TerminalNode K_CONTINUE() { return getToken(onixParser.K_CONTINUE, 0); }
		public ContinueLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueLoop; }
	}

	public final ContinueLoopContext continueLoop() throws RecognitionException {
		ContinueLoopContext _localctx = new ContinueLoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continueLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(K_CONTINUE);
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

	public static class RetStatementContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(onixParser.K_RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStatement; }
	}

	public final RetStatementContext retStatement() throws RecognitionException {
		RetStatementContext _localctx = new RetStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_retStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(K_RETURN);
			setState(354);
			exp(0);
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

	public static class ParContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_SBRAC() { return getToken(onixParser.L_SBRAC, 0); }
		public TerminalNode R_SBRAC() { return getToken(onixParser.R_SBRAC, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public Any_argsContext any_args() {
			return getRuleContext(Any_argsContext.class,0);
		}
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_par);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(356);
					type();
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==L_SBRAC) {
						{
						setState(357);
						match(L_SBRAC);
						setState(358);
						match(R_SBRAC);
						}
					}

					}
					break;
				}
				setState(363);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				identifier();
				setState(365);
				match(COLON);
				setState(366);
				type();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_SBRAC) {
					{
					setState(367);
					match(L_SBRAC);
					setState(368);
					match(R_SBRAC);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				any_args();
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

	public static class ParlistContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(onixParser.L_PAR, 0); }
		public List<ParContext> par() {
			return getRuleContexts(ParContext.class);
		}
		public ParContext par(int i) {
			return getRuleContext(ParContext.class,i);
		}
		public TerminalNode R_PAR() { return getToken(onixParser.R_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parlist);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(L_PAR);
				setState(375);
				par();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(377);
					par();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(R_PAR);
				}
				break;
			case ELLIPSIS:
			case K_BYTE:
			case K_INT:
			case K_LONG:
			case K_FLOAT:
			case K_STRING:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				par();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(386);
					match(COMMA);
					setState(387);
					par();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(onixParser.K_IF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public List<TerminalNode> INTERROGATION() { return getTokens(onixParser.INTERROGATION); }
		public TerminalNode INTERROGATION(int i) {
			return getToken(onixParser.INTERROGATION, i);
		}
		public List<TerminalNode> COLON() { return getTokens(onixParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(onixParser.COLON, i);
		}
		public List<If_elseifContext> if_elseif() {
			return getRuleContexts(If_elseifContext.class);
		}
		public If_elseifContext if_elseif(int i) {
			return getRuleContext(If_elseifContext.class,i);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(K_IF);
			setState(396);
			exp(0);
			setState(397);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==INTERROGATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(398);
			body();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					if_elseif();
					setState(400);
					exp(0);
					setState(401);
					_la = _input.LA(1);
					if ( !(_la==COLON || _la==INTERROGATION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(402);
					body();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(409);
				if_else();
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==INTERROGATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				body();
				}
			}

			setState(415);
			match(K_END);
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

	public static class If_elseifContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(onixParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(onixParser.K_IF, 0); }
		public If_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elseif; }
	}

	public final If_elseifContext if_elseif() throws RecognitionException {
		If_elseifContext _localctx = new If_elseifContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(K_ELSE);
			setState(418);
			match(K_IF);
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(onixParser.K_ELSE, 0); }
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(K_ELSE);
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

	public static class For_loopContext extends ParserRuleContext {
		public AssignmentContext init;
		public ExpContext test;
		public TerminalNode K_COUNT() { return getToken(onixParser.K_COUNT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(K_COUNT);
			setState(423);
			((For_loopContext)_localctx).init = assignment();
			setState(424);
			match(COMMA);
			setState(425);
			((For_loopContext)_localctx).test = exp(0);
			setState(426);
			match(COMMA);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(427);
				assignment();
				}
				break;
			case 2:
				{
				setState(428);
				postfixExpression(0);
				}
				break;
			}
			setState(431);
			match(COLON);
			setState(432);
			body();
			setState(433);
			match(K_END);
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

	public static class Range_loopContext extends ParserRuleContext {
		public ExpContext startExp;
		public ExpContext endExp;
		public TerminalNode K_FOR() { return getToken(onixParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(onixParser.K_EACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_PERIOD() { return getToken(onixParser.DOUBLE_PERIOD, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public TerminalNode K_IN() { return getToken(onixParser.K_IN, 0); }
		public TerminalNode K_OF() { return getToken(onixParser.K_OF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Range_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_loop; }
	}

	public final Range_loopContext range_loop() throws RecognitionException {
		Range_loopContext _localctx = new Range_loopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_range_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(K_FOR);
			setState(436);
			match(K_EACH);
			setState(437);
			identifier();
			setState(438);
			_la = _input.LA(1);
			if ( !(_la==K_OF || _la==K_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(439);
			((Range_loopContext)_localctx).startExp = exp(0);
			setState(440);
			match(DOUBLE_PERIOD);
			setState(441);
			((Range_loopContext)_localctx).endExp = exp(0);
			setState(442);
			match(COLON);
			setState(443);
			body();
			setState(444);
			match(K_END);
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

	public static class For_each_loopContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(onixParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(onixParser.K_EACH, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public TerminalNode K_IN() { return getToken(onixParser.K_IN, 0); }
		public TerminalNode K_OF() { return getToken(onixParser.K_OF, 0); }
		public TerminalNode ADDROP() { return getToken(onixParser.ADDROP, 0); }
		public TerminalNode COMMA() { return getToken(onixParser.COMMA, 0); }
		public For_each_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_loop; }
	}

	public final For_each_loopContext for_each_loop() throws RecognitionException {
		For_each_loopContext _localctx = new For_each_loopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(K_FOR);
			setState(447);
			match(K_EACH);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDROP) {
				{
				setState(448);
				match(ADDROP);
				}
			}

			setState(451);
			identifier();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(452);
				match(COMMA);
				setState(453);
				identifier();
				}
			}

			setState(456);
			_la = _input.LA(1);
			if ( !(_la==K_OF || _la==K_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(457);
			postfixExpression(0);
			setState(458);
			match(COLON);
			setState(459);
			body();
			setState(460);
			match(K_END);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(onixParser.K_WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(K_WHILE);
			setState(463);
			exp(0);
			setState(464);
			match(COLON);
			setState(465);
			body();
			setState(466);
			match(K_END);
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

	public static class Repeat_loopContext extends ParserRuleContext {
		public TerminalNode K_REPEAT() { return getToken(onixParser.K_REPEAT, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_UNTIL() { return getToken(onixParser.K_UNTIL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Repeat_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_loop; }
	}

	public final Repeat_loopContext repeat_loop() throws RecognitionException {
		Repeat_loopContext _localctx = new Repeat_loopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_repeat_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(K_REPEAT);
			setState(469);
			match(COLON);
			setState(470);
			body();
			setState(471);
			match(K_UNTIL);
			setState(472);
			exp(0);
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

	public static class Think_loopContext extends ParserRuleContext {
		public TerminalNode K_LOOP() { return getToken(onixParser.K_LOOP, 0); }
		public TerminalNode COLON() { return getToken(onixParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_END() { return getToken(onixParser.K_END, 0); }
		public Think_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_think_loop; }
	}

	public final Think_loopContext think_loop() throws RecognitionException {
		Think_loopContext _localctx = new Think_loopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_think_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(K_LOOP);
			setState(475);
			match(COLON);
			setState(476);
			body();
			setState(477);
			match(K_END);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declaration);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				constDeclaration();
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

	public static class ConstDecUnitContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(onixParser.EQUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ConstDecUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecUnit; }
	}

	public final ConstDecUnitContext constDecUnit() throws RecognitionException {
		ConstDecUnitContext _localctx = new ConstDecUnitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constDecUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			identifier();
			setState(485);
			match(EQUAL);
			setState(486);
			exp(0);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode K_CONST() { return getToken(onixParser.K_CONST, 0); }
		public List<ConstDecUnitContext> constDecUnit() {
			return getRuleContexts(ConstDecUnitContext.class);
		}
		public ConstDecUnitContext constDecUnit(int i) {
			return getRuleContext(ConstDecUnitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(K_CONST);
			setState(489);
			constDecUnit();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(490);
				match(COMMA);
				setState(491);
				constDecUnit();
				}
				}
				setState(496);
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

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(onixParser.L_PAR, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(onixParser.R_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initializer);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(L_PAR);
				setState(498);
				expList();
				setState(499);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				exp(0);
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

	public static class VarDecUnitContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(onixParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public VarDecUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecUnit; }
	}

	public final VarDecUnitContext varDecUnit() throws RecognitionException {
		VarDecUnitContext _localctx = new VarDecUnitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_varDecUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			identifier();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(505);
				match(EQUAL);
				setState(506);
				initializer();
				}
			}

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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(onixParser.K_VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDecUnitContext> varDecUnit() {
			return getRuleContexts(VarDecUnitContext.class);
		}
		public VarDecUnitContext varDecUnit(int i) {
			return getRuleContext(VarDecUnitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(K_VAR);
			setState(510);
			type();
			setState(511);
			varDecUnit();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(512);
				match(COMMA);
				setState(513);
				varDecUnit();
				}
				}
				setState(518);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode L_SBRAC() { return getToken(onixParser.L_SBRAC, 0); }
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public TerminalNode R_SBRAC() { return getToken(onixParser.R_SBRAC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(L_SBRAC);
			setState(520);
			initializer();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(521);
				match(COMMA);
				setState(522);
				initializer();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(R_SBRAC);
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

	public static class ArrayDecUnitContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode L_SBRAC() { return getToken(onixParser.L_SBRAC, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode R_SBRAC() { return getToken(onixParser.R_SBRAC, 0); }
		public TerminalNode EQUAL() { return getToken(onixParser.EQUAL, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayDecUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecUnit; }
	}

	public final ArrayDecUnitContext arrayDecUnit() throws RecognitionException {
		ArrayDecUnitContext _localctx = new ArrayDecUnitContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayDecUnit);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				identifier();
				setState(531);
				match(L_SBRAC);
				setState(532);
				exp(0);
				setState(533);
				match(R_SBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				identifier();
				setState(536);
				match(EQUAL);
				setState(537);
				arrayInitializer();
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(onixParser.K_VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ArrayDecUnitContext> arrayDecUnit() {
			return getRuleContexts(ArrayDecUnitContext.class);
		}
		public ArrayDecUnitContext arrayDecUnit(int i) {
			return getRuleContext(ArrayDecUnitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(K_VAR);
			setState(542);
			type();
			setState(543);
			arrayDecUnit();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(544);
				match(COMMA);
				setState(545);
				arrayDecUnit();
				}
				}
				setState(550);
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

	public static class AssignmentUnitContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public AssignmentUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentUnit; }
	}

	public final AssignmentUnitContext assignmentUnit() throws RecognitionException {
		AssignmentUnitContext _localctx = new AssignmentUnitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignmentUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			postfixExpression(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<AssignmentUnitContext> assignmentUnit() {
			return getRuleContexts(AssignmentUnitContext.class);
		}
		public AssignmentUnitContext assignmentUnit(int i) {
			return getRuleContext(AssignmentUnitContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			assignmentUnit();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				assignmentUnit();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			assignOp();
			setState(562);
			exp(0);
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

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(onixParser.EQUAL, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(onixParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(onixParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(onixParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(onixParser.DIV_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(onixParser.OR_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(onixParser.AND_ASSIGN, 0); }
		public TerminalNode LSH_ASSIGN() { return getToken(onixParser.LSH_ASSIGN, 0); }
		public TerminalNode RSH_ASSIGN() { return getToken(onixParser.RSH_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(onixParser.XOR_ASSIGN, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MULT_ASSIGN) | (1L << DIV_ASSIGN) | (1L << LSH_ASSIGN) | (1L << RSH_ASSIGN) | (1L << AND_ASSIGN) | (1L << XOR_ASSIGN) | (1L << OR_ASSIGN))) != 0)) ) {
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

	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(onixParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(onixParser.DECREMENT, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
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

	public static class PropOpContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(onixParser.PERIOD, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(onixParser.DOUBLE_COLON, 0); }
		public TerminalNode ARROW() { return getToken(onixParser.ARROW, 0); }
		public PropOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOp; }
	}

	public final PropOpContext propOp() throws RecognitionException {
		PropOpContext _localctx = new PropOpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERIOD) | (1L << DOUBLE_COLON) | (1L << ARROW))) != 0)) ) {
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primaryExpression);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				identifier();
				}
				break;
			case K_FALSE:
			case K_TRUE:
			case INT:
			case HEX:
			case BIN:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				number();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ADDROP() { return getToken(onixParser.ADDROP, 0); }
		public List<PostfixExpressionContext> postfixExpression() {
			return getRuleContexts(PostfixExpressionContext.class);
		}
		public PostfixExpressionContext postfixExpression(int i) {
			return getRuleContext(PostfixExpressionContext.class,i);
		}
		public TerminalNode L_BRAC() { return getToken(onixParser.L_BRAC, 0); }
		public TerminalNode R_BRAC() { return getToken(onixParser.R_BRAC, 0); }
		public PropOpContext propOp() {
			return getRuleContext(PropOpContext.class,0);
		}
		public TerminalNode L_PAR() { return getToken(onixParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(onixParser.R_PAR, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode L_SBRAC() { return getToken(onixParser.L_SBRAC, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode R_SBRAC() { return getToken(onixParser.R_SBRAC, 0); }
		public TerminalNode DECREMENT() { return getToken(onixParser.DECREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(onixParser.INCREMENT, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
			case K_FALSE:
			case K_TRUE:
			case NAME:
			case INT:
			case HEX:
			case BIN:
			case FLOAT:
				{
				setState(576);
				primaryExpression();
				}
				break;
			case ADDROP:
				{
				setState(577);
				match(ADDROP);
				setState(578);
				postfixExpression(2);
				}
				break;
			case L_BRAC:
				{
				setState(579);
				match(L_BRAC);
				setState(580);
				postfixExpression(0);
				setState(581);
				match(R_BRAC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(604);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(585);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(586);
						propOp();
						setState(587);
						postfixExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(589);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(590);
						match(L_PAR);
						setState(592);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << L_PAR) | (1L << L_BRAC) | (1L << MINUS) | (1L << NEGATION) | (1L << ADDROP))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_FALSE - 79)) | (1L << (K_TRUE - 79)) | (1L << (NAME - 79)) | (1L << (INT - 79)) | (1L << (HEX - 79)) | (1L << (BIN - 79)) | (1L << (FLOAT - 79)))) != 0)) {
							{
							setState(591);
							expList();
							}
						}

						setState(594);
						match(R_PAR);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(595);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(596);
						match(L_SBRAC);
						setState(597);
						exp(0);
						setState(598);
						match(R_SBRAC);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(600);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(601);
						match(DECREMENT);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(602);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(603);
						match(INCREMENT);
						}
						break;
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode L_PAR() { return getToken(onixParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(onixParser.R_PAR, 0); }
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public ShiftContext shift() {
			return getRuleContext(ShiftContext.class,0);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public BitAndContext bitAnd() {
			return getRuleContext(BitAndContext.class,0);
		}
		public BitXorContext bitXor() {
			return getRuleContext(BitXorContext.class,0);
		}
		public BitOrContext bitOr() {
			return getRuleContext(BitOrContext.class,0);
		}
		public BoolAndContext boolAnd() {
			return getRuleContext(BoolAndContext.class,0);
		}
		public BoolOrContext boolOr() {
			return getRuleContext(BoolOrContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(onixParser.K_AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
			case L_BRAC:
			case ADDROP:
			case K_FALSE:
			case K_TRUE:
			case NAME:
			case INT:
			case HEX:
			case BIN:
			case FLOAT:
				{
				setState(610);
				postfixExpression(0);
				}
				break;
			case MINUS:
			case NEGATION:
				{
				setState(611);
				unary();
				setState(612);
				exp(13);
				}
				break;
			case L_PAR:
				{
				setState(614);
				match(L_PAR);
				setState(615);
				exp(0);
				setState(616);
				match(R_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(663);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(620);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(621);
						multiplicative();
						setState(622);
						exp(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(624);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(625);
						additive();
						setState(626);
						exp(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(628);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(629);
						shift();
						setState(630);
						exp(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(632);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(633);
						relational();
						setState(634);
						exp(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(636);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(637);
						equality();
						setState(638);
						exp(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(640);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(641);
						bitAnd();
						setState(642);
						exp(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(644);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(645);
						bitXor();
						setState(646);
						exp(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(648);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(649);
						bitOr();
						setState(650);
						exp(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(652);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(653);
						boolAnd();
						setState(654);
						exp(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(656);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(657);
						boolOr();
						setState(658);
						exp(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(660);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(661);
						match(K_AS);
						setState(662);
						type();
						}
						break;
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class MultiplicativeContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(onixParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(onixParser.MOD, 0); }
		public TerminalNode MULT() { return getToken(onixParser.MULT, 0); }
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class AdditiveContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(onixParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(onixParser.MINUS, 0); }
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class ShiftContext extends ParserRuleContext {
		public TerminalNode BITWISE_LSH() { return getToken(onixParser.BITWISE_LSH, 0); }
		public TerminalNode BITWISE_RSH() { return getToken(onixParser.BITWISE_RSH, 0); }
		public ShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift; }
	}

	public final ShiftContext shift() throws RecognitionException {
		ShiftContext _localctx = new ShiftContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_shift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !(_la==BITWISE_LSH || _la==BITWISE_RSH) ) {
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

	public static class RelationalContext extends ParserRuleContext {
		public TerminalNode LESSER_THAN() { return getToken(onixParser.LESSER_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(onixParser.GREATER_THAN, 0); }
		public TerminalNode LESSER_EQUAL() { return getToken(onixParser.LESSER_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(onixParser.GREATER_EQUAL, 0); }
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSER_THAN) | (1L << GREATER_THAN) | (1L << LESSER_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
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

	public static class EqualityContext extends ParserRuleContext {
		public TerminalNode EQUALS_TO() { return getToken(onixParser.EQUALS_TO, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(onixParser.NOT_EQUAL, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(_la==NOT_EQUAL || _la==EQUALS_TO) ) {
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

	public static class BitAndContext extends ParserRuleContext {
		public TerminalNode BITWISE_AND() { return getToken(onixParser.BITWISE_AND, 0); }
		public BitAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitAnd; }
	}

	public final BitAndContext bitAnd() throws RecognitionException {
		BitAndContext _localctx = new BitAndContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_bitAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(BITWISE_AND);
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

	public static class BitXorContext extends ParserRuleContext {
		public TerminalNode BITWISE_XOR() { return getToken(onixParser.BITWISE_XOR, 0); }
		public BitXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitXor; }
	}

	public final BitXorContext bitXor() throws RecognitionException {
		BitXorContext _localctx = new BitXorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_bitXor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(BITWISE_XOR);
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

	public static class BitOrContext extends ParserRuleContext {
		public TerminalNode BITWISE_OR() { return getToken(onixParser.BITWISE_OR, 0); }
		public BitOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOr; }
	}

	public final BitOrContext bitOr() throws RecognitionException {
		BitOrContext _localctx = new BitOrContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_bitOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(BITWISE_OR);
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

	public static class BoolAndContext extends ParserRuleContext {
		public TerminalNode BOOL_AND() { return getToken(onixParser.BOOL_AND, 0); }
		public BoolAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAnd; }
	}

	public final BoolAndContext boolAnd() throws RecognitionException {
		BoolAndContext _localctx = new BoolAndContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_boolAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(BOOL_AND);
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

	public static class BoolOrContext extends ParserRuleContext {
		public TerminalNode BOOL_OR() { return getToken(onixParser.BOOL_OR, 0); }
		public BoolOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOr; }
	}

	public final BoolOrContext boolOr() throws RecognitionException {
		BoolOrContext _localctx = new BoolOrContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_boolOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(BOOL_OR);
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

	public static class ExpListContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(onixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(onixParser.COMMA, i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			exp(0);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(689);
				match(COMMA);
				setState(690);
				exp(0);
				}
				}
				setState(695);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode BIN() { return getToken(onixParser.BIN, 0); }
		public TerminalNode HEX() { return getToken(onixParser.HEX, 0); }
		public TerminalNode INT() { return getToken(onixParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(onixParser.FLOAT, 0); }
		public TerminalNode K_FALSE() { return getToken(onixParser.K_FALSE, 0); }
		public TerminalNode K_TRUE() { return getToken(onixParser.K_TRUE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_FALSE - 79)) | (1L << (K_TRUE - 79)) | (1L << (INT - 79)) | (1L << (HEX - 79)) | (1L << (BIN - 79)) | (1L << (FLOAT - 79)))) != 0)) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(onixParser.StringLiteral, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(StringLiteral);
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
		public TerminalNode K_BYTE() { return getToken(onixParser.K_BYTE, 0); }
		public TerminalNode K_INT() { return getToken(onixParser.K_INT, 0); }
		public TerminalNode K_LONG() { return getToken(onixParser.K_LONG, 0); }
		public TerminalNode K_FLOAT() { return getToken(onixParser.K_FLOAT, 0); }
		public TerminalNode K_STRING() { return getToken(onixParser.K_STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADDROP() { return getToken(onixParser.ADDROP, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BYTE:
				{
				setState(700);
				match(K_BYTE);
				}
				break;
			case K_INT:
				{
				setState(701);
				match(K_INT);
				}
				break;
			case K_LONG:
				{
				setState(702);
				match(K_LONG);
				}
				break;
			case K_FLOAT:
				{
				setState(703);
				match(K_FLOAT);
				}
				break;
			case K_STRING:
				{
				setState(704);
				match(K_STRING);
				}
				break;
			case NAME:
				{
				setState(705);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(708);
				match(ADDROP);
				}
				break;
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(onixParser.MINUS, 0); }
		public TerminalNode NEGATION() { return getToken(onixParser.NEGATION, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==NEGATION) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(onixParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(NAME);
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
		case 52:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 53:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u02ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\7\2\u0090"+
		"\n\2\f\2\16\2\u0093\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u009e"+
		"\n\3\3\4\3\4\3\4\5\4\u00a3\n\4\3\5\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b9\n\6\3\7\3\7\5"+
		"\7\u00bd\n\7\3\b\7\b\u00c0\n\b\f\b\16\b\u00c3\13\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00c9\n\t\f\t\16\t\u00cc\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d5\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e0\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ec\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00f8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0100\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0107\n\13\3\13\3\13\5\13\u010b\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0112\n\f\f\f\16\f\u0115\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u011d"+
		"\n\r\f\r\16\r\u0120\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0136\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0141\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0149\n\22\3\23\3\23\3\23\5\23\u014e\n\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u016a"+
		"\n\34\5\34\u016c\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0174\n\34\3"+
		"\34\5\34\u0177\n\34\3\35\3\35\3\35\3\35\7\35\u017d\n\35\f\35\16\35\u0180"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\7\35\u0187\n\35\f\35\16\35\u018a\13\35"+
		"\5\35\u018c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0197"+
		"\n\36\f\36\16\36\u019a\13\36\3\36\3\36\3\36\3\36\5\36\u01a0\n\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u01b0\n!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u01c4\n#\3#"+
		"\3#\3#\5#\u01c9\n#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u01e5\n\'\3(\3(\3(\3(\3)\3)\3)\3)\7"+
		")\u01ef\n)\f)\16)\u01f2\13)\3*\3*\3*\3*\3*\5*\u01f9\n*\3+\3+\3+\5+\u01fe"+
		"\n+\3,\3,\3,\3,\3,\7,\u0205\n,\f,\16,\u0208\13,\3-\3-\3-\3-\7-\u020e\n"+
		"-\f-\16-\u0211\13-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u021e\n.\3/\3/"+
		"\3/\3/\3/\7/\u0225\n/\f/\16/\u0228\13/\3\60\3\60\3\61\3\61\3\61\7\61\u022f"+
		"\n\61\f\61\16\61\u0232\13\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\65\5\65\u0240\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u024a\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0253\n"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u025f\n\66"+
		"\f\66\16\66\u0262\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5"+
		"\67\u026d\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u029a\n\67\f\67\16\67\u029d\13\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\7B\u02b6\n"+
		"B\fB\16B\u02b9\13B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\5E\u02c5\nE\3E\5E\u02c8"+
		"\nE\3F\3F\3G\3G\3G\3\u0091\4jlH\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\2\16\4\2--\62\62\3\2DE\4\2\13\13\31!\3"+
		"\2\63\64\4\2,,/\60\5\2\16\16\20\20\22\22\3\2\f\r\3\2()\3\2\23\26\3\2\27"+
		"\30\4\2QRZ]\4\2\r\r\21\21\2\u02e8\2\u0091\3\2\2\2\4\u009d\3\2\2\2\6\u009f"+
		"\3\2\2\2\b\u00a4\3\2\2\2\n\u00b8\3\2\2\2\f\u00bc\3\2\2\2\16\u00c1\3\2"+
		"\2\2\20\u00c4\3\2\2\2\22\u00ff\3\2\2\2\24\u0101\3\2\2\2\26\u010c\3\2\2"+
		"\2\30\u0118\3\2\2\2\32\u0123\3\2\2\2\34\u0127\3\2\2\2\36\u012b\3\2\2\2"+
		" \u012f\3\2\2\2\"\u0148\3\2\2\2$\u014a\3\2\2\2&\u014f\3\2\2\2(\u0153\3"+
		"\2\2\2*\u0157\3\2\2\2,\u0159\3\2\2\2.\u015c\3\2\2\2\60\u015f\3\2\2\2\62"+
		"\u0161\3\2\2\2\64\u0163\3\2\2\2\66\u0176\3\2\2\28\u018b\3\2\2\2:\u018d"+
		"\3\2\2\2<\u01a3\3\2\2\2>\u01a6\3\2\2\2@\u01a8\3\2\2\2B\u01b5\3\2\2\2D"+
		"\u01c0\3\2\2\2F\u01d0\3\2\2\2H\u01d6\3\2\2\2J\u01dc\3\2\2\2L\u01e4\3\2"+
		"\2\2N\u01e6\3\2\2\2P\u01ea\3\2\2\2R\u01f8\3\2\2\2T\u01fa\3\2\2\2V\u01ff"+
		"\3\2\2\2X\u0209\3\2\2\2Z\u021d\3\2\2\2\\\u021f\3\2\2\2^\u0229\3\2\2\2"+
		"`\u022b\3\2\2\2b\u0236\3\2\2\2d\u0238\3\2\2\2f\u023a\3\2\2\2h\u023f\3"+
		"\2\2\2j\u0249\3\2\2\2l\u026c\3\2\2\2n\u029e\3\2\2\2p\u02a0\3\2\2\2r\u02a2"+
		"\3\2\2\2t\u02a4\3\2\2\2v\u02a6\3\2\2\2x\u02a8\3\2\2\2z\u02aa\3\2\2\2|"+
		"\u02ac\3\2\2\2~\u02ae\3\2\2\2\u0080\u02b0\3\2\2\2\u0082\u02b2\3\2\2\2"+
		"\u0084\u02ba\3\2\2\2\u0086\u02bc\3\2\2\2\u0088\u02c4\3\2\2\2\u008a\u02c9"+
		"\3\2\2\2\u008c\u02cb\3\2\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\2\2\3\u0095\3\3\2\2\2\u0096\u009e"+
		"\5\6\4\2\u0097\u009e\5\b\5\2\u0098\u009e\5\"\22\2\u0099\u009e\5\22\n\2"+
		"\u009a\u009e\5\20\t\2\u009b\u009e\5\f\7\2\u009c\u009e\5\n\6\2\u009d\u0096"+
		"\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\5\3\2\2\2"+
		"\u009f\u00a2\7\67\2\2\u00a0\u00a3\5\u0086D\2\u00a1\u00a3\7\3\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\7\3\2\2\2\u00a4\u00a7\78\2\2"+
		"\u00a5\u00a8\5\u0086D\2\u00a6\u00a8\7\3\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\t\3\2\2\2\u00a9\u00b9\5L\'\2\u00aa\u00b9\5`\61\2"+
		"\u00ab\u00b9\5j\66\2\u00ac\u00b9\5:\36\2\u00ad\u00b9\5@!\2\u00ae\u00b9"+
		"\5F$\2\u00af\u00b9\5H%\2\u00b0\u00b9\5D#\2\u00b1\u00b9\5J&\2\u00b2\u00b9"+
		"\5B\"\2\u00b3\u00b9\5,\27\2\u00b4\u00b9\5.\30\2\u00b5\u00b9\5\60\31\2"+
		"\u00b6\u00b9\5\62\32\2\u00b7\u00b9\5\64\33\2\u00b8\u00a9\3\2\2\2\u00b8"+
		"\u00aa\3\2\2\2\u00b8\u00ab\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ad\3\2"+
		"\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8"+
		"\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\13\3\2\2\2\u00ba\u00bd\5\26\f\2\u00bb\u00bd\5\30\r\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00c0\5\n\6\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\17\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7;\2\2\u00c5\u00c6\5\u008c"+
		"G\2\u00c6\u00ca\7-\2\2\u00c7\u00c9\5L\'\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7N\2\2\u00ce\21\3\2\2\2\u00cf\u00d0\7:\2\2"+
		"\u00d0\u00d4\5\u0088E\2\u00d1\u00d2\5\u0088E\2\u00d2\u00d3\7,\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\5\u008cG\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\5l\67\2\u00d9"+
		"\u0100\3\2\2\2\u00da\u00db\7:\2\2\u00db\u00df\5\u0088E\2\u00dc\u00dd\5"+
		"\u0088E\2\u00dd\u00de\7,\2\2\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\5\u008cG\2\u00e2\u00e3"+
		"\58\35\2\u00e3\u00e4\7P\2\2\u00e4\u00e5\5l\67\2\u00e5\u0100\3\2\2\2\u00e6"+
		"\u00e7\7:\2\2\u00e7\u00eb\5\u0088E\2\u00e8\u00e9\5\u0088E\2\u00e9\u00ea"+
		"\7,\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\5\u008cG\2\u00ee\u00ef\7-\2\2\u00ef\u00f0\5"+
		"\16\b\2\u00f0\u00f1\7N\2\2\u00f1\u0100\3\2\2\2\u00f2\u00f3\7:\2\2\u00f3"+
		"\u00f7\5\u0088E\2\u00f4\u00f5\5\u0088E\2\u00f5\u00f6\7,\2\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\5\u008cG\2\u00fa\u00fb\58\35\2\u00fb\u00fc\7-\2\2\u00fc\u00fd\5"+
		"\16\b\2\u00fd\u00fe\7N\2\2\u00fe\u0100\3\2\2\2\u00ff\u00cf\3\2\2\2\u00ff"+
		"\u00da\3\2\2\2\u00ff\u00e6\3\2\2\2\u00ff\u00f2\3\2\2\2\u0100\23\3\2\2"+
		"\2\u0101\u0102\7:\2\2\u0102\u0106\5\u0088E\2\u0103\u0104\5\u0088E\2\u0104"+
		"\u0105\7,\2\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u010a\5\u008cG\2\u0109\u010b\58\35\2\u010a"+
		"\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\25\3\2\2\2\u010c\u010d\7J\2\2"+
		"\u010d\u0113\7-\2\2\u010e\u0112\5\32\16\2\u010f\u0112\5&\24\2\u0110\u0112"+
		"\5\34\17\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2"+
		"\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7N\2\2\u0117\27\3\2\2\2\u0118"+
		"\u0119\7I\2\2\u0119\u011e\7-\2\2\u011a\u011d\5\36\20\2\u011b\u011d\5("+
		"\25\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\7N\2\2\u0122\31\3\2\2\2\u0123\u0124\5\u0086D\2\u0124"+
		"\u0125\7-\2\2\u0125\u0126\5\24\13\2\u0126\33\3\2\2\2\u0127\u0128\5\u0086"+
		"D\2\u0128\u0129\7-\2\2\u0129\u012a\5L\'\2\u012a\35\3\2\2\2\u012b\u012c"+
		"\5\u0084C\2\u012c\u012d\7-\2\2\u012d\u012e\5\24\13\2\u012e\37\3\2\2\2"+
		"\u012f\u0130\5\u008cG\2\u0130!\3\2\2\2\u0131\u0135\79\2\2\u0132\u0133"+
		"\5\u0088E\2\u0133\u0134\7,\2\2\u0134\u0136\3\2\2\2\u0135\u0132\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\5 \21\2\u0138\u0139"+
		"\7-\2\2\u0139\u013a\5\16\b\2\u013a\u013b\7N\2\2\u013b\u0149\3\2\2\2\u013c"+
		"\u0140\79\2\2\u013d\u013e\5\u0088E\2\u013e\u013f\7,\2\2\u013f\u0141\3"+
		"\2\2\2\u0140\u013d\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\5 \21\2\u0143\u0144\58\35\2\u0144\u0145\7-\2\2\u0145\u0146\5\16"+
		"\b\2\u0146\u0147\7N\2\2\u0147\u0149\3\2\2\2\u0148\u0131\3\2\2\2\u0148"+
		"\u013c\3\2\2\2\u0149#\3\2\2\2\u014a\u014b\79\2\2\u014b\u014d\5 \21\2\u014c"+
		"\u014e\58\35\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e%\3\2\2\2"+
		"\u014f\u0150\5\u0086D\2\u0150\u0151\7-\2\2\u0151\u0152\5$\23\2\u0152\'"+
		"\3\2\2\2\u0153\u0154\5\u0084C\2\u0154\u0155\7-\2\2\u0155\u0156\5$\23\2"+
		"\u0156)\3\2\2\2\u0157\u0158\7+\2\2\u0158+\3\2\2\2\u0159\u015a\7X\2\2\u015a"+
		"\u015b\7-\2\2\u015b-\3\2\2\2\u015c\u015d\7\65\2\2\u015d\u015e\7X\2\2\u015e"+
		"/\3\2\2\2\u015f\u0160\7A\2\2\u0160\61\3\2\2\2\u0161\u0162\7B\2\2\u0162"+
		"\63\3\2\2\2\u0163\u0164\7O\2\2\u0164\u0165\5l\67\2\u0165\65\3\2\2\2\u0166"+
		"\u0169\5\u0088E\2\u0167\u0168\7\t\2\2\u0168\u016a\7\n\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0166\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0177\5\u008cG\2\u016e\u016f"+
		"\5\u008cG\2\u016f\u0170\7-\2\2\u0170\u0173\5\u0088E\2\u0171\u0172\7\t"+
		"\2\2\u0172\u0174\7\n\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0177\5*\26\2\u0176\u016b\3\2\2\2\u0176\u016e\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177\67\3\2\2\2\u0178\u0179\7\5\2\2\u0179\u017e"+
		"\5\66\34\2\u017a\u017b\7.\2\2\u017b\u017d\5\66\34\2\u017c\u017a\3\2\2"+
		"\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\6\2\2\u0182\u018c\3\2\2\2\u0183"+
		"\u0188\5\66\34\2\u0184\u0185\7.\2\2\u0185\u0187\5\66\34\2\u0186\u0184"+
		"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0178\3\2\2\2\u018b\u0183\3\2"+
		"\2\2\u018c9\3\2\2\2\u018d\u018e\7L\2\2\u018e\u018f\5l\67\2\u018f\u0190"+
		"\t\2\2\2\u0190\u0198\5\16\b\2\u0191\u0192\5<\37\2\u0192\u0193\5l\67\2"+
		"\u0193\u0194\t\2\2\2\u0194\u0195\5\16\b\2\u0195\u0197\3\2\2\2\u0196\u0191"+
		"\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019f\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5> \2\u019c\u019d\t\2\2"+
		"\2\u019d\u019e\5\16\b\2\u019e\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7N\2\2\u01a2;\3\2\2\2\u01a3"+
		"\u01a4\7M\2\2\u01a4\u01a5\7L\2\2\u01a5=\3\2\2\2\u01a6\u01a7\7M\2\2\u01a7"+
		"?\3\2\2\2\u01a8\u01a9\7?\2\2\u01a9\u01aa\5`\61\2\u01aa\u01ab\7.\2\2\u01ab"+
		"\u01ac\5l\67\2\u01ac\u01af\7.\2\2\u01ad\u01b0\5`\61\2\u01ae\u01b0\5j\66"+
		"\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\7-\2\2\u01b2\u01b3\5\16\b\2\u01b3\u01b4\7N\2\2\u01b4A\3\2\2\2\u01b5\u01b6"+
		"\7@\2\2\u01b6\u01b7\7C\2\2\u01b7\u01b8\5\u008cG\2\u01b8\u01b9\t\3\2\2"+
		"\u01b9\u01ba\5l\67\2\u01ba\u01bb\7*\2\2\u01bb\u01bc\5l\67\2\u01bc\u01bd"+
		"\7-\2\2\u01bd\u01be\5\16\b\2\u01be\u01bf\7N\2\2\u01bfC\3\2\2\2\u01c0\u01c1"+
		"\7@\2\2\u01c1\u01c3\7C\2\2\u01c2\u01c4\7\"\2\2\u01c3\u01c2\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\5\u008cG\2\u01c6\u01c7"+
		"\7.\2\2\u01c7\u01c9\5\u008cG\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2"+
		"\u01c9\u01ca\3\2\2\2\u01ca\u01cb\t\3\2\2\u01cb\u01cc\5j\66\2\u01cc\u01cd"+
		"\7-\2\2\u01cd\u01ce\5\16\b\2\u01ce\u01cf\7N\2\2\u01cfE\3\2\2\2\u01d0\u01d1"+
		"\7F\2\2\u01d1\u01d2\5l\67\2\u01d2\u01d3\7-\2\2\u01d3\u01d4\5\16\b\2\u01d4"+
		"\u01d5\7N\2\2\u01d5G\3\2\2\2\u01d6\u01d7\7G\2\2\u01d7\u01d8\7-\2\2\u01d8"+
		"\u01d9\5\16\b\2\u01d9\u01da\7H\2\2\u01da\u01db\5l\67\2\u01dbI\3\2\2\2"+
		"\u01dc\u01dd\7<\2\2\u01dd\u01de\7-\2\2\u01de\u01df\5\16\b\2\u01df\u01e0"+
		"\7N\2\2\u01e0K\3\2\2\2\u01e1\u01e5\5V,\2\u01e2\u01e5\5\\/\2\u01e3\u01e5"+
		"\5P)\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"M\3\2\2\2\u01e6\u01e7\5\u008cG\2\u01e7\u01e8\7\13\2\2\u01e8\u01e9\5l\67"+
		"\2\u01e9O\3\2\2\2\u01ea\u01eb\7=\2\2\u01eb\u01f0\5N(\2\u01ec\u01ed\7."+
		"\2\2\u01ed\u01ef\5N(\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1Q\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3"+
		"\u01f4\7\5\2\2\u01f4\u01f5\5\u0082B\2\u01f5\u01f6\7\6\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f9\5l\67\2\u01f8\u01f3\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9"+
		"S\3\2\2\2\u01fa\u01fd\5\u008cG\2\u01fb\u01fc\7\13\2\2\u01fc\u01fe\5R*"+
		"\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01feU\3\2\2\2\u01ff\u0200"+
		"\7>\2\2\u0200\u0201\5\u0088E\2\u0201\u0206\5T+\2\u0202\u0203\7.\2\2\u0203"+
		"\u0205\5T+\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207W\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a"+
		"\7\t\2\2\u020a\u020f\5R*\2\u020b\u020c\7.\2\2\u020c\u020e\5R*\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7\n\2\2\u0213"+
		"Y\3\2\2\2\u0214\u0215\5\u008cG\2\u0215\u0216\7\t\2\2\u0216\u0217\5l\67"+
		"\2\u0217\u0218\7\n\2\2\u0218\u021e\3\2\2\2\u0219\u021a\5\u008cG\2\u021a"+
		"\u021b\7\13\2\2\u021b\u021c\5X-\2\u021c\u021e\3\2\2\2\u021d\u0214\3\2"+
		"\2\2\u021d\u0219\3\2\2\2\u021e[\3\2\2\2\u021f\u0220\7>\2\2\u0220\u0221"+
		"\5\u0088E\2\u0221\u0226\5Z.\2\u0222\u0223\7.\2\2\u0223\u0225\5Z.\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227]\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\5j\66\2\u022a_\3\2"+
		"\2\2\u022b\u0230\5^\60\2\u022c\u022d\7.\2\2\u022d\u022f\5^\60\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\5b\62\2\u0234"+
		"\u0235\5l\67\2\u0235a\3\2\2\2\u0236\u0237\t\4\2\2\u0237c\3\2\2\2\u0238"+
		"\u0239\t\5\2\2\u0239e\3\2\2\2\u023a\u023b\t\6\2\2\u023bg\3\2\2\2\u023c"+
		"\u0240\5\u008cG\2\u023d\u0240\5\u0084C\2\u023e\u0240\5\u0086D\2\u023f"+
		"\u023c\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240i\3\2\2\2"+
		"\u0241\u0242\b\66\1\2\u0242\u024a\5h\65\2\u0243\u0244\7\"\2\2\u0244\u024a"+
		"\5j\66\4\u0245\u0246\7\7\2\2\u0246\u0247\5j\66\2\u0247\u0248\7\b\2\2\u0248"+
		"\u024a\3\2\2\2\u0249\u0241\3\2\2\2\u0249\u0243\3\2\2\2\u0249\u0245\3\2"+
		"\2\2\u024a\u0260\3\2\2\2\u024b\u024c\f\b\2\2\u024c\u024d\5f\64\2\u024d"+
		"\u024e\5j\66\t\u024e\u025f\3\2\2\2\u024f\u0250\f\t\2\2\u0250\u0252\7\5"+
		"\2\2\u0251\u0253\5\u0082B\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u025f\7\6\2\2\u0255\u0256\f\7\2\2\u0256\u0257\7\t"+
		"\2\2\u0257\u0258\5l\67\2\u0258\u0259\7\n\2\2\u0259\u025f\3\2\2\2\u025a"+
		"\u025b\f\6\2\2\u025b\u025f\7\64\2\2\u025c\u025d\f\5\2\2\u025d\u025f\7"+
		"\63\2\2\u025e\u024b\3\2\2\2\u025e\u024f\3\2\2\2\u025e\u0255\3\2\2\2\u025e"+
		"\u025a\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261k\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264"+
		"\b\67\1\2\u0264\u026d\5j\66\2\u0265\u0266\5\u008aF\2\u0266\u0267\5l\67"+
		"\17\u0267\u026d\3\2\2\2\u0268\u0269\7\5\2\2\u0269\u026a\5l\67\2\u026a"+
		"\u026b\7\6\2\2\u026b\u026d\3\2\2\2\u026c\u0263\3\2\2\2\u026c\u0265\3\2"+
		"\2\2\u026c\u0268\3\2\2\2\u026d\u029b\3\2\2\2\u026e\u026f\f\r\2\2\u026f"+
		"\u0270\5n8\2\u0270\u0271\5l\67\16\u0271\u029a\3\2\2\2\u0272\u0273\f\f"+
		"\2\2\u0273\u0274\5p9\2\u0274\u0275\5l\67\r\u0275\u029a\3\2\2\2\u0276\u0277"+
		"\f\13\2\2\u0277\u0278\5r:\2\u0278\u0279\5l\67\f\u0279\u029a\3\2\2\2\u027a"+
		"\u027b\f\n\2\2\u027b\u027c\5t;\2\u027c\u027d\5l\67\13\u027d\u029a\3\2"+
		"\2\2\u027e\u027f\f\t\2\2\u027f\u0280\5v<\2\u0280\u0281\5l\67\n\u0281\u029a"+
		"\3\2\2\2\u0282\u0283\f\b\2\2\u0283\u0284\5x=\2\u0284\u0285\5l\67\t\u0285"+
		"\u029a\3\2\2\2\u0286\u0287\f\7\2\2\u0287\u0288\5z>\2\u0288\u0289\5l\67"+
		"\b\u0289\u029a\3\2\2\2\u028a\u028b\f\6\2\2\u028b\u028c\5|?\2\u028c\u028d"+
		"\5l\67\7\u028d\u029a\3\2\2\2\u028e\u028f\f\5\2\2\u028f\u0290\5~@\2\u0290"+
		"\u0291\5l\67\6\u0291\u029a\3\2\2\2\u0292\u0293\f\4\2\2\u0293\u0294\5\u0080"+
		"A\2\u0294\u0295\5l\67\5\u0295\u029a\3\2\2\2\u0296\u0297\f\3\2\2\u0297"+
		"\u0298\7\66\2\2\u0298\u029a\5\u0088E\2\u0299\u026e\3\2\2\2\u0299\u0272"+
		"\3\2\2\2\u0299\u0276\3\2\2\2\u0299\u027a\3\2\2\2\u0299\u027e\3\2\2\2\u0299"+
		"\u0282\3\2\2\2\u0299\u0286\3\2\2\2\u0299\u028a\3\2\2\2\u0299\u028e\3\2"+
		"\2\2\u0299\u0292\3\2\2\2\u0299\u0296\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029cm\3\2\2\2\u029d\u029b\3\2\2\2"+
		"\u029e\u029f\t\7\2\2\u029fo\3\2\2\2\u02a0\u02a1\t\b\2\2\u02a1q\3\2\2\2"+
		"\u02a2\u02a3\t\t\2\2\u02a3s\3\2\2\2\u02a4\u02a5\t\n\2\2\u02a5u\3\2\2\2"+
		"\u02a6\u02a7\t\13\2\2\u02a7w\3\2\2\2\u02a8\u02a9\7%\2\2\u02a9y\3\2\2\2"+
		"\u02aa\u02ab\7\'\2\2\u02ab{\3\2\2\2\u02ac\u02ad\7&\2\2\u02ad}\3\2\2\2"+
		"\u02ae\u02af\7#\2\2\u02af\177\3\2\2\2\u02b0\u02b1\7$\2\2\u02b1\u0081\3"+
		"\2\2\2\u02b2\u02b7\5l\67\2\u02b3\u02b4\7.\2\2\u02b4\u02b6\5l\67\2\u02b5"+
		"\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u0083\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\t\f\2\2\u02bb"+
		"\u0085\3\2\2\2\u02bc\u02bd\7\4\2\2\u02bd\u0087\3\2\2\2\u02be\u02c5\7S"+
		"\2\2\u02bf\u02c5\7T\2\2\u02c0\u02c5\7U\2\2\u02c1\u02c5\7V\2\2\u02c2\u02c5"+
		"\7W\2\2\u02c3\u02c5\5\u008cG\2\u02c4\u02be\3\2\2\2\u02c4\u02bf\3\2\2\2"+
		"\u02c4\u02c0\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3"+
		"\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c8\7\"\2\2\u02c7\u02c6\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u0089\3\2\2\2\u02c9\u02ca\t\r\2\2\u02ca\u008b\3\2"+
		"\2\2\u02cb\u02cc\7Y\2\2\u02cc\u008d\3\2\2\29\u0091\u009d\u00a2\u00a7\u00b8"+
		"\u00bc\u00c1\u00ca\u00d4\u00df\u00eb\u00f7\u00ff\u0106\u010a\u0111\u0113"+
		"\u011c\u011e\u0135\u0140\u0148\u014d\u0169\u016b\u0173\u0176\u017e\u0188"+
		"\u018b\u0198\u019f\u01af\u01c3\u01c8\u01e4\u01f0\u01f8\u01fd\u0206\u020f"+
		"\u021d\u0226\u0230\u023f\u0249\u0252\u025e\u0260\u026c\u0299\u029b\u02b7"+
		"\u02c4\u02c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}