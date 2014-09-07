package hoja.de.trabajo.pkg8;

//Clasificar
public class Aussortieren {
    private String cadena;
    private int numX;
    private StringBuilder st,filtro;
    private int[] numLetras;
    private String[] cuerpo;
     
    public Aussortieren(String cadena){
        this.cadena = cadena;      
        this.numX = 0;
        this.numLetras = new int[25];
        this.cuerpo = new String[25];
        st =  new StringBuilder();
        filtro =  new StringBuilder();        
        clasicarCadena(cadena.length());
    }
           
    public void clasicarCadena(int num){                
        for(int i =0;i < cadena.length(); i++){
            for(int s = 0; s < cadena.length(); s++){
                if(cadena.charAt(i) == cadena.charAt(s)){
                    numX = numX +1;                                        
                }                                
            }            
            numLetras[i] = numX;           
            st =  st.append(cadena.charAt(i)); 
            numX=0;
        }        
        st =  st.append('s'); 
    } 
    
    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getNumX() {
        return numX;
    }

    public void setNumX(int numX) {
        this.numX = numX;
    }

    public StringBuilder getSt() {
        return st;
    }

    public void setSt(StringBuilder st) {
        this.st = st;
    }
    
    public String toString (){   
       String titulo = "CADENA INGRESADA: "+this.cadena+"\n";       
       for(int k = 0; k < cadena.length();k++){           
           if(st.charAt(k+1)!= st.charAt(k)){
               cuerpo[k] = "Letra:"+st.charAt(k)+"/ Repetida: "+numLetras[k]+"veces";
               System.out.println(cuerpo[k]);
           }
           
           
       }
       return    titulo;
   }
}
