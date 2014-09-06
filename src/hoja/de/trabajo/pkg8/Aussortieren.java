package hoja.de.trabajo.pkg8;

//Clasificar
public class Aussortieren {
    private String cadena;
    private int numX;
    private StringBuilder st;
    private int[] numLetras;
     
    public Aussortieren(String cadena){
        this.cadena = cadena;
        this.numX = 0;
        this.numLetras = new int[25];
    }
    
       
    public void clasicarCadena(){                
        for(int i =0;i == cadena.length(); i++){
            for(int s = 0; s == cadena.length(); s++){
                if(cadena.charAt(i) == cadena.charAt(s)){
                    numX = numX +1;
                    numLetras[i] = numX;
                    st =  new StringBuilder().append(cadena.charAt(i));                    
                }
            }                 
        }        
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
    
    public String toString ()                                              
   {
    return "CADENA INGRESADA: "+this.cadena+"\n";
   }
}
