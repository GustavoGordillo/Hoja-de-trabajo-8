
package hoja.de.trabajo.pkg8;

import java.util.Scanner;


public class HojaDeTrabajo8 {


    public static void main(String[] args) {
                        
        Scanner _in  = new Scanner(System.in);        
        Clasificar clasificar;
        int opcion =0;
        int i =0;
        
        int opp = 0;

        while (opcion!= 2){
            System.out.print("1. Ingresar una cadena de caracteres\n");            
            System.out.print("2. Salir\n");
            opcion = _in.nextInt();
            opp = opcion;
            
            if(opp == 1){
                System.out.print("Ingrese su cadena a continuacion:\n");
                String vacio = _in.nextLine();
                String cadena = _in.next();
                clasificar = new Clasificar(cadena);                
                System.out.println(clasificar.toString());
            }            
        } 
    }
}
