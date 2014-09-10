
package hoja.de.trabajo.pkg8;


public class Clasificar {
    private int[] repetidas;
    private String cadena, cadenaNueva;
    String[] cad;
     
    public Clasificar(String cadena){
         this.cadena = cadena;
         repetidas = new int[cadena.length()];                  
         clasificarCadena(cadena);
     }
     
     public void clasificarCadena(String cadena){
         
         cad = new String[cadena.length()];         
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
         String[] caden = new String[cadena.length()];
         int[] num = new int[cadena.length()];                               
         while(f<cadena.length()){
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
