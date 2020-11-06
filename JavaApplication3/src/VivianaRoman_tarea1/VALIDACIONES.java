
package vivianaroman_tarea1;
import java.util.Scanner;

public class VALIDACIONES {
    
       Scanner sc = new Scanner (System.in);
 
       // devuelve al usuario a la solicitud si este ingresa ENTER
       public String ingresarDatos (String datos){
         String s1 = ""; 
           
        while (s1.equals("")){
          System.out.println(datos);
          s1 = sc.nextLine();       
        }
       return s1;
       }
       //Obtiene los datos del usuario 
       public int ingresarDatos2 (String datos){
           int s1;
      
          System.out.println(datos);
          s1 = sc.nextInt();       
        
       return s1;
       }
}

    
