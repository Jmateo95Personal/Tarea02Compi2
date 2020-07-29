/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Jonathan
 */
public class OError {
    String tipo;
    int fila;
    int columna;
    String comentario;

    public OError(String tipo, int fila, int columna, String comentario) {
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
        this.comentario = comentario;
    }
    
   
    
    
}
