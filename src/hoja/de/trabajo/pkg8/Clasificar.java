
package hoja.de.trabajo.pkg8;


public class Clasificar {
    private int[] repetidas;
    private String cadena, cadenaNueva;
    String[] cad;
     
    public Clasificar(String cadena){
         this.cadena = cadena;
         repetidas = new int[20];                  
         clasificarCadena(cadena);
     }
     
     public void clasificarCadena(String cadena){
         
         cad = new String[20];         
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
         
     }    
          
     public String toString(){         
         System.out.println("RESULTADOS");
         for (int k = 0; k < 10; k++) {             
             System.out.println("Letra: ["+cad[k]+"] se repitió: "+repetidas[k]);
         }
         return "";
     }
}
