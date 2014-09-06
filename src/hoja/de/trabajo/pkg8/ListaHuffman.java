
package hoja.de.trabajo.pkg8;


public class ListaHuffman {
    
    
    private Nodo padre;
    private Nodo hijoD;
    private Nodo hijoI;
            
    public ListaHuffman(){
        padre = null;
        hijoI = null;       
        hijoD = null;        
    }
        
    public void agregarNodoDerecho(int frecuencia, int codigo){                //Permite agregar otro nodo a la cadena din�mica
        Nodo nuevoNodo = new Nodo(frecuencia,codigo);                                       
        if(padre == null){                                                     //Si el pivote no tiene nada se le asigna un nodo y actual apunta al pivote
            padre = nuevoNodo;                                                 //para tener una referencia
            hijoD = padre;
        }
        else{
            hijoD.setDerecha(nuevoNodo);            
            hijoD = nuevoNodo;            
        }                
    }
    
    public void agregarNodoIzquierdo(int frecuencia, int codigo){                                         //Permite agregar otro nodo a la cadena din�mica
        Nodo nuevoNodo = new Nodo(frecuencia,codigo);                                       
        if(padre == null){                                                     //Si el pivote no tiene nada se le asigna un nodo y actual apunta al pivote
            padre = nuevoNodo;                                                 //para tener una referencia
            hijoI = padre;
        }
        else{
            hijoI.setIzquierda(nuevoNodo);            
            hijoI = nuevoNodo;            
        }                                    
    }
}
