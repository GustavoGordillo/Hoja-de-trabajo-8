/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg8;

/**
 *
 * @author Temp
 */
public class Nodo {
    int frecuencia;     
    char caracter;           

    //Asigan una frecuencia a un nodo en particular
    public Nodo(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    //construye un nodo con el caracter y frecuencia 1
    public Nodo(char caracter) {
        this.caracter = caracter;
        this.frecuencia = 1;
    }
    
    @Override
    public boolean equals(Object nodo) {
        if (nodo == null) {
            return false;
        }
        
        Nodo other = (Nodo) nodo;
        if (this.caracter != other.caracter) {
            return false;
        }
        return true;
    }

}
