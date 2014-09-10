
package hoja.de.trabajo.pkg8;


public class Clasificar {
    private int[] repetidas;
    private String cadena, cadenaNueva;
    String[] cad;
     
    public Clasificar(String cadena){
         this.cadena = cadena;
         repetidas = new int[];                  
         clasificarCadena(cadena);
     }
     
     public void clasificarCadena(String cadena){
         
         cant= cadena.length();
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
         String[] caden = new String[20];
         int[] num = new int[20];                               
         while(f<20){
             if(cad[f] != null){
                 caden[s] = cad[f];
                 num[s] = repetidas[f];
                 s++;
             }
             f++;
         }         
         cad = caden;
         repetidas = num;           
     }    
    public VectorHeap Arbol()
    {
        List<Nodo> cantidad = new SinglyLinkedList<Nodo>();
        for (int k = 0; k < cadena.length(); k++) {             
             if(cad[k]!=  null){
                 Nodo quey = new Nodo(cad[k],repetidas[k]);
                 Nodo elemento = cantidad.remove(quey);
            
            if(elemento == null){
                cantidad.addFirst(quey);
            } 
            else {
                cantidad.addFirst(elemento);
            }
             }
        }
        VectorHeap<ArbolHuffman> arboles = new VectorHeap<ArbolHuffman>();
        for(Nodo n : cantidad){
            arboles.add(new ArbolHuffman(n));
        }
        
        Iterator ti =arboles.iterator();
        /* Si alguno de los nodos se mantiene se mezclan */
        while(arboles.size() > 1){
            /* Obtiene los dos arboles siguientes */
            ti=arboles.iterator();
            ArbolHuffman pequeñito=(ArbolHuffman)ti.next();
            ArbolHuffman pequeño=(ArbolHuffman)ti.next();
            arboles.remove(pequeñito);
            arboles.remove(pequeño);
            
            /* Ingresa los nuevos arboles a la foresta y los mezcla*/
            arboles.add(new ArbolHuffman(pequeñito, pequeño));
        }
        ti =arboles.iterador();
        return arboles;
        
    }
     public String toString(){         
         System.out.println("RESULTADOS");
         for (int k = 0; k < cadena.length(); k++) {             
             if(cad[k]!=  null){
                 System.out.println("Letra: ["+cad[k]+"] se repitió: "+repetidas[k]);
             }             
         }
         return "";
     }
}
