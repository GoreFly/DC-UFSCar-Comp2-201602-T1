#Trabalhos Contrução de Compiladores 2

##Gerar ANTLR
`java -cp lib\CopyLibs\antlr-4.5.3-complete.jar org.antlr.v4.Tool PATHTO.G4 -package PACKAGENAME`

##Rodar o corretor T1
`java -jar corretorTrabalho1\CorretorTrabalho1.jar "java -jar D:\Projects\Github_locals\DC-UFSCar-Comp2-201602-T1\LA_Compiler\dist\LA_Compiler.jar" gcc test casosDeTeste "551554, 551872, 551805, 551724" completo`

##Testar Linguagem T3
`java -jar "PATH_TO_BUILT_JAR" PATH_TO_TEST_FILE`
