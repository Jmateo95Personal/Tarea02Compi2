package analizadores; // Paquete donde estará nuestro scanner
import java_cup.runtime.Symbol; 
%% 

%{
    /*Area de declaración de codigo java. 
    *Funciones y variables necesarias
    *
    */
    String nombre;
    public void imprimir(String cadena)
    {
    	System.out.println(cadena);
    }
%}

// Area de directivas
%cupsym sym 
%class Lexico
%cup
%public
%unicode
%line
%column
%char
%ignorecase


// Area de definición de expresiones regulares. Tokens.
Comentario = "//" [^\r\n]* [^\r\n]
ComentarioMulti = "/*" [^/] ~"*/" | "/*" "/"+ "*/"
numerico =[0-1]
espacio = \t|\f|" "|\r|\n


%%

// Acciones
/* Espacios en blanco */
{espacio}     {/*Ignorar*/}
{numerico}          {return new Symbol(sym.numerico,yycolumn,yyline,yytext());}
"."                 {return new Symbol(sym.pun,yyline,yycolumn,yytext());}
{Comentario} { /*Se ignora.*/}
{ComentarioMulti} { /*Se ignora.*/}
/*Recolección de errores*/
.   
{               
        System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
}