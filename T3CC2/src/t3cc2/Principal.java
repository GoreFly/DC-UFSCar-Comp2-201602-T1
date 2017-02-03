package t3cc2;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Thalles
 */
public class Principal {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        String arquivoEntrada = args[0];
        ANTLRInputStream ais = new ANTLRInputStream(new FileInputStream(arquivoEntrada));
        SSLLexer lexer = new SSLLexer(ais);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        SSLParser parser = new SSLParser(cts);
        Saida out = new Saida();
        
        try {
            SSLParser.ScriptContext raiz = parser.script();
            SSLVisit visitor = new SSLVisit();
            visitor.visitScript(raiz);
//            GeradorDeCodigo gdc = new GeradorDeCodigo(out);
//            ParseTreeWalker ptw = new ParseTreeWalker();
//            ptw.walk(gdc, raiz);
            
        }
        // sintatico
        catch(ParseCancellationException pce) {
             if(pce.getMessage() != null && !out.modificado)
                out.print(pce.getMessage());
        }
        // semantico
        catch(RuntimeException re) {
            //re.printStackTrace();
            if(re.getMessage() != null && !out.modificado)
                out.print(re.getMessage());
            out.println("\nFim da compilacao");
        }
        
        System.out.print(out.getTexto());
    }
}
