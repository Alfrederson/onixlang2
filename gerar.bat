cls
SET CLASSPATH=.;%cd%\antlr-4.8-complete.jar;%CLASSPATH%


rd /S / Q "%cd%\onix"
md "%cd%\onix"


java org.antlr.v4.Tool "%cd%\onix.g4" -o "%cd%\onix" -visitor -no-listener -Dlanguage=JavaScript
cd onix

dir
cd ..
pause