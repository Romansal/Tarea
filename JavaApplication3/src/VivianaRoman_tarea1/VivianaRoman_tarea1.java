/*Viviana Pamela Romas Salazar
ced 110990462*/
package vivianaroman_tarea1;


public class VivianaRoman_tarea1{

    public static void main(String[] args) { 
        
   
        VALIDACIONES validacion1 = new VALIDACIONES ();

     //Pedimos la informacion al usuario, se invoca la clase VALIDACIONES para validar y guardar la informacion ingresada por el usario
       
       String nombre = validacion1.ingresarDatos ("Dijite el nombre del propietario");
       String discap = validacion1.ingresarDatos ("Es discapacitado: Si/No");
       String placa = validacion1.ingresarDatos ("Dijite la placa");
       int identificacion = validacion1.ingresarDatos2("Dijite la identificacion:");
       int modelo = validacion1.ingresarDatos2("Dijite el modelo:");
       int seguro = validacion1.ingresarDatos2("Dijite el monto asegurado(Debe ser mayor a 1,000,000 y menor a 100,000,000): ");

     //Creacion de un objeto de tipo DATCARSEG
     DATCARSEG car1 = new DATCARSEG();
     
     //Llamamos a los metodos para desplegar la informacion 
        
               car1.setPlaca(placa);
               car1.setIdentificacion(identificacion);
               car1.setNombre(nombre);
               car1.setModelo(modelo);
               //car1.calculoSeguro(seguro);
       
                
        // Impresion de datos 
         System.out.println("\n***Los datos del cliente:*** \n");
        System.out.println("Nombre: "+ car1.getNombre());
        System.out.println("Identificacion: "+ car1.getIdentificacion());
        System.out.println("Placa: "+ car1.getPlaca());
        System.out.println("Modelo: "+ car1.getModelo());
        System.out.println("Prima: "+ car1.calculoSeguro(seguro, modelo,discap));
        System.out.println("Es discapacitado: "+ discap);
    }
    
}
