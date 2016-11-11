Para gerar os analisadores da linguaguem:
java -cp lib\CopyLibs\antlr-4.5.3-complete.jar org.antlr.v4.Tool src\la_compiler\LA.g4

Para rodar o corretor:
java -jar corretorTrabalho1\CorretorTrabalho1.jar "java -jar D:\Projects\Github_locals\DC-UFSCar-Comp2-201602-T1\LA_Compiler\dist\LA_Compiler.jar" gcc test casosDeTeste "551805" sintatico
