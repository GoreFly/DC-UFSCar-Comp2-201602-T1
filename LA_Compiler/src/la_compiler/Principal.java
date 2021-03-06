package la_compiler;



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
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Thalles
 */
public class Principal {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        String arquivoEntrada = args[0];
        String arquivoSaida = args[1];
        
        ANTLRInputStream ais = new ANTLRInputStream(new FileInputStream(arquivoEntrada));
        LALexer lexer = new LALexer(ais);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        LAParser parser = new LAParser(cts);
        
        Saida out = new Saida();
        MeuErrorListener mel = new MeuErrorListener(out);
        parser.removeErrorListeners();
        parser.addErrorListener(mel);
        
        try {
            LAParser.ProgramaContext raiz = parser.programa();
            GeradorDeCodigo gdc = new GeradorDeCodigo(out);
            ParseTreeWalker ptw = new ParseTreeWalker();
            ptw.walk(gdc, raiz);
            
        }
        // sintatico
        catch(ParseCancellationException pce) {
             if(pce.getMessage() != null && !out.modificado)
                out.print(pce.getMessage());
        }
        // semantico
        catch(RuntimeException re) {
            if(re.getMessage() != null && !out.modificado)
                out.print(re.getMessage());
            out.println("Fim da compilacao");
        }
        
        
        PrintWriter pw = new PrintWriter(arquivoSaida);
        
        pw.print(out.getTexto());
        
        pw.close();
    }
}
