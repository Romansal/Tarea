

package vivianaroman_tarea1;


public class DATCARSEG {
    
    //Atributos
     private String placa;
     private int identificacion;
     private String nombre;
     private int modelo;
     private int seguro;
     private String discap;
     
     // Constructor vacio
    public DATCARSEG (){
      
     } 
     
     //Metodo de la clase, get y set para el atributo nombre
      public void setNombre(String nombre ){
       this.nombre = nombre;
     }
      public String getNombre(){
       return this.nombre;
     }
      
     
     //Metodo de la clase, get y set  para el atributo placa
     public void setPlaca(String placa ){
      this.placa = placa;
     }
     public String getPlaca(){
      return this.placa;
     }
     
    //Metodo de la clase, get y set para el atributo identificacion
     public void setIdentificacion(int identificacion ){
       this.identificacion = identificacion;
     }
     public int getIdentificacion (){
      return this.identificacion;
     }
  
      
     //Metodo de la clase, get y set  para el atributo modelo
      public void setModelo( int modelo){
      this.modelo = modelo;
     }
      public int getModelo(){
      return modelo; 
     }
      
      
      // Calculo de la prima 
      public int calculoSeguro(int seguro, int modelo, String discap){
          
          int primaMensual;
          int descMensual;
          int recargo=0;
          int montoFinal=0;
          int montoseguro=0;
         
          //calculo para el recargo
          if (modelo <= 1979){
           recargo = 90000;
          }else if (modelo >= 1980 && modelo <=1999){
           recargo = 45000;
          }else  if(modelo >= 2000 && modelo <= 2014){
          recargo = 35000;
          }else if(modelo >= 2015 && modelo <= 2018){
          recargo = 25000;
          }else if (modelo >= 2019 && modelo <= 2021){
           recargo=0;
            } 
  
          // calculo que arroja si el usuario tiene derecho al descuento
          if ("Si".equals(discap) || "si".equals(discap)){
              
              primaMensual = seguro/4;
              descMensual = primaMensual-(primaMensual/10); 
              montoFinal = descMensual + recargo;
             
          } else  if ("No".equals(discap) || "no".equals(discap)) {
              primaMensual = seguro/4;
              montoFinal= primaMensual+ recargo; 
          } 
         
          return montoFinal;
     }
     
}
