
package hoja.de.trabajo.pkg8;
//import structure.BinaryTree;
import java.util.*;
//import structure.SinglyLinkedList;
//import structure.VectorHeap;

public class Clasificar {
    private int[] repetidas;
    private String cadena, cadenaNueva;
    String[] cad,codigo;
     
    public Clasificar(String cadena){
         this.cadena = cadena;
         repetidas = new int[cadena.length()];                           
         codigo = new String[cadena.length()];
         clasificarCadena(cadena);
         
     }
     
     public void clasificarCadena(String cadena){
         
         int cant= cadena.length();
         cad = new String[cant];         
         cadenaNueva = cadena;
         StringBuilder concatenar;         
         int numX = 0;
                  
         for (int i = 0; i < cadena.length(); i++) {
             for (int j = 0; j < cadena.length(); j++) {
                 if(cadena.charAt(i)==cadenaNueva.charAt(j)){                     
                     numX++;
                 }                     
            }
             if(numX>0){
                 concatenar = new StringBuilder();                     
                 cad[i]= (concatenar.append(cadena.charAt(i))).toString();
                 repetidas[i]= numX;
                 numX =0;
                 cadenaNueva = cadenaNueva.replace(cadena.charAt(i),'.');                         
             }
             else if(numX == 0 && cadenaNueva.charAt(i) !='.'){                 
                 concatenar = new StringBuilder();                     
                 cad[i]= (concatenar.append(cadena.charAt(i))).toString();
                 numX = 1;
                 repetidas[i]= numX;
                 numX =0;
             }                          
         }  
         int f = 0;
         int s = 0;
         String[] caden = new String[cant];
         int[] num = new int[cant];                               
         while(f<cant){
             if(cad[f] != null){
                 caden[s] = cad[f];
                 num[s] = repetidas[f];
                 s++;
             }
             f++;
         }         
         cad = caden;
         repetidas = num;  
         int h = 100;
         while(h>0){
             ordenar();
             h--;
         }
         codificar();
     }    
     
     public void ordenar(){         
         String[] caden = new String[cadena.length()];
         int[] num = new int[cadena.length()];                                                          
         for (int i = 0; i < cadena.length()-1; i++) {
            if(repetidas[i]<repetidas[i+1]){
                
                num[i] = repetidas[i];
                caden[i] = cad[i];
                
                repetidas[i] = repetidas[i+1];                                       
                cad[i] = cad[i+1];
                
                repetidas[i+1] = num[i];
                cad[i+1] = caden[i];
            }                        
        }
     }
     
     public void codificar(){
         int contador = 0;         
         String c = "1";
         String u = "0";
         String v = "";
         codigo[0] = u;
         
         for (int i = 1; i < cadena.length(); i++) {
             if(i%2!=0){
                 v = v+c;
                 codigo[i] = v;
             }
             else if(i%2==0){
                 v = v+u;
                 codigo[i] = v;
             }
         }
     }     

//    // public VectorHeap Arbol()
//    {
//        List<Nodo> cantidad = new SinglyLinkedList<Nodo>();
//        for (int k = 0; k < cadena.length(); k++) {             
//             if(cad[k]!=  null){
//                 Nodo quey = new Nodo(cad[k],repetidas[k]);
//                 Nodo elemento = cantidad.remove(quey);
//            
//            if(elemento == null){
//                cantidad.addFirst(quey);
//            } 
//            else {
//                cantidad.addFirst(elemento);
//            }
//             }
//        }
//        VectorHeap<ArbolDeHuffman> arboles = new VectorHeap<ArbolDeHuffman>();
//        for(Nodo n : cantidad){
//    //        arboles.add(new ArbolDeHuffman(n));
//        }
//        
//        Iterator ti =arboles.iterator();
//        /* Si alguno de los nodos se mantiene se mezclan */
//        while(arboles.size() > 1){
//            /* Obtiene los dos arboles siguientes */
//            ti=arboles.iterator();
//            ArbolDeHuffman pequeñito=(ArbolDeHuffman)ti.next();
//            ArbolDeHuffman pequeño=(ArbolDeHuffman)ti.next();
//            arboles.remove(pequeñito);
//            arboles.remove(pequeño);
//            
//            /* Ingresa los nuevos arboles a la foresta y los mezcla*/
//  //          arboles.add(new ArbolHuffman(pequeñito, pequeño));
//        }
//        ti =arboles.iterador();
//        return arboles;
    //}
     
     public String toString(){         
         System.out.println("RESULTADOS");
         for (int k = 0; k < cadena.length(); k++) {             
             if(cad[k]!=  null){
                 System.out.println("Letra: ["+cad[k]+"] su frecuencia: "+repetidas[k]+" y su código es: "+codigo[k]);
             }             
         }
         return "";
     }
}
