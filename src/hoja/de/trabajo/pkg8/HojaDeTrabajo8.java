
package hoja.de.trabajo.pkg8;

import java.util.Scanner;


public class HojaDeTrabajo8 {


    public static void main(String[] args) {
        
        Aussortieren clasificar;
        //Aussortieren clasifica = new Aussortieren();
        Scanner _in  = new Scanner(System.in);
        
        int opcion =0;
        int i =0;
        
        int opp = 0;
        
        System.out.println("carro".codePointAt(1));
        
        while (opcion!= 2){
            System.out.print("1. Ingresar una cadena de caracteres\n");            
            System.out.print("2. Salir\n");
            opcion = _in.nextInt();
            opp = opcion;
            
            if(opp == 1){
                System.out.print("Ingrese su cadena a continuacion:\n");
                String op2 = _in.nextLine();                
                switch(opcion)
            {               
                case 1:  
                    clasificar = new Aussortieren(opcion);                                        
                    break;
                      
            }
                
            }
            
            
            
            
        } 

    }
}
