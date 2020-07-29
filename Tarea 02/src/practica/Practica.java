/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import analizadores.Lexico;
import analizadores.parser1;

import java.io.StringReader;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jonathan
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese un Numero Binario con decimales");
        String Binario=new BufferedReader(new InputStreamReader(System.in)).readLine();
        analizadores.Lexico lexico=new Lexico(new BufferedReader(new StringReader(Binario)));
        analizadores.parser1 sin1=new parser1(lexico);
        try {
            System.out.print("El Binario: "+Binario+" es: ");
            sin1.parse();
            System.out.println(" en Decimal");
        }catch (Exception e) {
        }    
    }
}




