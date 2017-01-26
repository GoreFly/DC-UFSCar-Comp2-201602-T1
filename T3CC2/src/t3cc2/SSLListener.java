// Generated from src\t3cc2\SSL.g4 by ANTLR 4.5.3
package t3cc2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SSLParser}.
 */
public interface SSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SSLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SSLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SSLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#script_cont}.
	 * @param ctx the parse tree
	 */
	void enterScript_cont(SSLParser.Script_contContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#script_cont}.
	 * @param ctx the parse tree
	 */
	void exitScript_cont(SSLParser.Script_contContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#decl_principais}.
	 * @param ctx the parse tree
	 */
	void enterDecl_principais(SSLParser.Decl_principaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#decl_principais}.
	 * @param ctx the parse tree
	 */
	void exitDecl_principais(SSLParser.Decl_principaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#cena}.
	 * @param ctx the parse tree
	 */
	void enterCena(SSLParser.CenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#cena}.
	 * @param ctx the parse tree
	 */
	void exitCena(SSLParser.CenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#cena_cont}.
	 * @param ctx the parse tree
	 */
	void enterCena_cont(SSLParser.Cena_contContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#cena_cont}.
	 * @param ctx the parse tree
	 */
	void exitCena_cont(SSLParser.Cena_contContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SSLParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SSLParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#chamada_personagem}.
	 * @param ctx the parse tree
	 */
	void enterChamada_personagem(SSLParser.Chamada_personagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#chamada_personagem}.
	 * @param ctx the parse tree
	 */
	void exitChamada_personagem(SSLParser.Chamada_personagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#decl_personagens}.
	 * @param ctx the parse tree
	 */
	void enterDecl_personagens(SSLParser.Decl_personagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#decl_personagens}.
	 * @param ctx the parse tree
	 */
	void exitDecl_personagens(SSLParser.Decl_personagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#decl_cenarios}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cenarios(SSLParser.Decl_cenariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#decl_cenarios}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cenarios(SSLParser.Decl_cenariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#decl_cenario}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cenario(SSLParser.Decl_cenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#decl_cenario}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cenario(SSLParser.Decl_cenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#decl_autores}.
	 * @param ctx the parse tree
	 */
	void enterDecl_autores(SSLParser.Decl_autoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#decl_autores}.
	 * @param ctx the parse tree
	 */
	void exitDecl_autores(SSLParser.Decl_autoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#ordem_cenas}.
	 * @param ctx the parse tree
	 */
	void enterOrdem_cenas(SSLParser.Ordem_cenasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#ordem_cenas}.
	 * @param ctx the parse tree
	 */
	void exitOrdem_cenas(SSLParser.Ordem_cenasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSLParser#fala}.
	 * @param ctx the parse tree
	 */
	void enterFala(SSLParser.FalaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSLParser#fala}.
	 * @param ctx the parse tree
	 */
	void exitFala(SSLParser.FalaContext ctx);
}