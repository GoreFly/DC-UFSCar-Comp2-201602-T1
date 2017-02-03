// Generated from src\t3cc2\SSL.g4 by ANTLR 4.5.3
package t3cc2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SSLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(SSLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#script_cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_cont(SSLParser.Script_contContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#decl_principais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_principais(SSLParser.Decl_principaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCena(SSLParser.CenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#cena_cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCena_cont(SSLParser.Cena_contContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SSLParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#chamada_personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_personagem(SSLParser.Chamada_personagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#decl_personagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_personagens(SSLParser.Decl_personagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#decl_cenarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cenarios(SSLParser.Decl_cenariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#decl_cenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cenario(SSLParser.Decl_cenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#decl_autores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_autores(SSLParser.Decl_autoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#ordem_cenas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdem_cenas(SSLParser.Ordem_cenasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSLParser#fala}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFala(SSLParser.FalaContext ctx);
}