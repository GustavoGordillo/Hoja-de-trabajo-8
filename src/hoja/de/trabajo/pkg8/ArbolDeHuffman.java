/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg8;

/**
 *
 * @author Temp
 */
 
     import structure.BinaryTree;
import java.util.HashMap;

public class ArbolDeHuffman {

public class ArbolDeHuffman implements Comparable<ArbolDeHuffman>{
    private BinaryTree<Nodo> raiz;
    private int valor;
    
    /* Constructor */
    public ArbolDeHuffman(Nodo e){
        raiz = new BinaryTree<Nodo>(e);
        valor = e.frecuencia;
    }
    
    //se construye la cabeza de dos arboles propios
    public ArbolDeHuffman(ArbolDeHuffman izq, ArbolDeHuffman der){
        valor = izq.valor + der.valor;
        Nodo r = new Nodo(pesoTotal);
        
        raiz = new BinaryTree<Nodo>(r, izq.raiz, der.raiz);
    }
    
    
    public int compareTo(ArbolDeHuffman otro) {
        return this.valor - otro.valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }
    
    BinaryTree<Nodo> obtenerArbol(){
        return raiz;
    }
    public void print() {
        print( raiz, "" );
    }
    
    //Imprime el arbol 
    private void print(BinaryTree<Nodo> arbol, String representacion){
       
        if(arbol.left().isEmpty() && arbol.right().isEmpty()){
            
            Nodo n = arbol.value();
            System.out.println("Codificación de " + n.car + " es " + representacion + "(frecuencia = " + n.frecuencia + ")");
        } 
        else {
            if(!arbol.left().isEmpty())
                print(arbol.left(), representacion + "0");
            if(!arbol.right().isEmpty())
                print(arbol.right(), representacion + "1");
        }
    }
}
