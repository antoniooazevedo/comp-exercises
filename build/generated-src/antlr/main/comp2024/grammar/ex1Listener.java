// Generated from comp2024/grammar/ex1.g4 by ANTLR 4.5.3

    package pt.up.fe.comp2024;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ex1Parser}.
 */
public interface ex1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ex1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ex1Parser.ProgramContext ctx);
}