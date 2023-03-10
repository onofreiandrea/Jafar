// Generated from C:/Users/Minh/Desktop/Mod 8 Project/Mod8FinalProjectGroup22/src/finalproject/grammar\JAFAR.g4 by ANTLR 4.10.1
package finalproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JAFARParser}.
 */
public interface JAFARListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JAFARParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JAFARParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JAFARParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JAFARParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JAFARParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link JAFARParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(JAFARParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link JAFARParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(JAFARParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#sharedDecl}.
	 * @param ctx the parse tree
	 */
	void enterSharedDecl(JAFARParser.SharedDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#sharedDecl}.
	 * @param ctx the parse tree
	 */
	void exitSharedDecl(JAFARParser.SharedDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link JAFARParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(JAFARParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link JAFARParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(JAFARParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsDecl}
	 * labeled alternative in {@link JAFARParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsDecl(JAFARParser.ParamsDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsDecl}
	 * labeled alternative in {@link JAFARParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsDecl(JAFARParser.ParamsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(JAFARParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(JAFARParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JAFARParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JAFARParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#threadBlock}.
	 * @param ctx the parse tree
	 */
	void enterThreadBlock(JAFARParser.ThreadBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#threadBlock}.
	 * @param ctx the parse tree
	 */
	void exitThreadBlock(JAFARParser.ThreadBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(JAFARParser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(JAFARParser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(JAFARParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(JAFARParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(JAFARParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(JAFARParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(JAFARParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(JAFARParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code threadStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterThreadStat(JAFARParser.ThreadStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code threadStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitThreadStat(JAFARParser.ThreadStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLockStat(JAFARParser.LockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLockStat(JAFARParser.LockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unlockStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStat(JAFARParser.UnlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unlockStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStat(JAFARParser.UnlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(JAFARParser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(JAFARParser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncStat(JAFARParser.FuncStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcStat}
	 * labeled alternative in {@link JAFARParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncStat(JAFARParser.FuncStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link JAFARParser#target}.
	 * @param ctx the parse tree
	 */
	void enterIdTarget(JAFARParser.IdTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link JAFARParser#target}.
	 * @param ctx the parse tree
	 */
	void exitIdTarget(JAFARParser.IdTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTarget}
	 * labeled alternative in {@link JAFARParser#target}.
	 * @param ctx the parse tree
	 */
	void enterArrayTarget(JAFARParser.ArrayTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTarget}
	 * labeled alternative in {@link JAFARParser#target}.
	 * @param ctx the parse tree
	 */
	void exitArrayTarget(JAFARParser.ArrayTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(JAFARParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(JAFARParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(JAFARParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(JAFARParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(JAFARParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(JAFARParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(JAFARParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(JAFARParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(JAFARParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(JAFARParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(JAFARParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(JAFARParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(JAFARParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(JAFARParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(JAFARParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(JAFARParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(JAFARParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(JAFARParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrfExpr(JAFARParser.PrfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrfExpr(JAFARParser.PrfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(JAFARParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(JAFARParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(JAFARParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(JAFARParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(JAFARParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link JAFARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(JAFARParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#arrayID}.
	 * @param ctx the parse tree
	 */
	void enterArrayID(JAFARParser.ArrayIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#arrayID}.
	 * @param ctx the parse tree
	 */
	void exitArrayID(JAFARParser.ArrayIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void enterPrfOp(JAFARParser.PrfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void exitPrfOp(JAFARParser.PrfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(JAFARParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(JAFARParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(JAFARParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(JAFARParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(JAFARParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(JAFARParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAFARParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(JAFARParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAFARParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(JAFARParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerArrayType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerArrayType(JAFARParser.IntegerArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerArrayType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerArrayType(JAFARParser.IntegerArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanArrayType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayType(JAFARParser.BooleanArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanArrayType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayType(JAFARParser.BooleanArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(JAFARParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(JAFARParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(JAFARParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(JAFARParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(JAFARParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link JAFARParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(JAFARParser.VoidTypeContext ctx);
}