
package hoja.de.trabajo.pkg8;
public class Nodo {                                       //Se implementa Comparable, clase ya dentro de los paquetes de Java.
    
    private int frecuencia;                                                         //Es el valor del Nodo                                                                  //Permite apuntar al siguiente objeto
    private int codigo;
    private Nodo derecha;
    private Nodo izquierda;
        
    public Nodo(){                                                              //Nodo predeterminado
        this.frecuencia = 0;
        this.codigo = 1;       
        this.derecha = null;
        this.izquierda = null;
    }
    
    public Nodo(int frecuencia,int codigo){                                                    //Nodo que es modificable
        this.frecuencia= frecuencia;
        this.codigo = codigo;          
    }
    
    public Nodo getDerecha() {
        return derecha;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    public String toString ()                                              
   {
      return "La frecuencia del nodo es"+this.frecuencia+"/Codigo:"+this.codigo;
   }
}
