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




    //construye un nodo con el caracter y frecuencia 1
    public Nodo(char caracter,int frecuencia) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
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
