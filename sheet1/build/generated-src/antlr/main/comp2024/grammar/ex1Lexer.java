// Generated from comp2024/grammar/ex1.g4 by ANTLR 4.5.3

    package pt.up.fe.comp2024;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ex1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, OCTET=2, IP=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGER", "OCTET", "IP"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGER", "OCTET", "IP"
	};
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


	public ex1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ex1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5%\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\2"+
		"\5\3\3\5\4\7\5\3\2\5\3\2\62;\3\2\62\66\3\2\62\67)\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\3\n\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\13\t\2\2\2\n"+
		"\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\4\3\2\2\2\16\34\t\2"+
		"\2\2\17\20\t\2\2\2\20\34\t\2\2\2\21\22\7\63\2\2\22\23\t\2\2\2\23\34\t"+
		"\2\2\2\24\25\7\64\2\2\25\26\t\3\2\2\26\34\t\2\2\2\27\30\7\64\2\2\30\31"+
		"\7\67\2\2\31\32\3\2\2\2\32\34\t\4\2\2\33\16\3\2\2\2\33\17\3\2\2\2\33\21"+
		"\3\2\2\2\33\24\3\2\2\2\33\27\3\2\2\2\34\6\3\2\2\2\35\36\5\5\3\2\36\37"+
		"\7\60\2\2\37 \5\5\3\2 !\7\60\2\2!\"\5\5\3\2\"#\7\60\2\2#$\5\5\3\2$\b\3"+
		"\2\2\2\5\2\f\33\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}