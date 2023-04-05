/*Construya un programa para calcular y mostrar el precio de un terreno del cual se tienen
los siguientes datos: largo, ancho y precio por metro cuadrado. Si el terreno
tienen más de 400 metros cuadrados se da un descuento del 10%, si el terreno
tiene más de 500 metros cuadrados el descuento es 17% y si tiene más de 1000 el
descuento es de 25%.
MMG*/
public class Terreno{
   private double largo;
   private double ancho;
   private double area;
   private double precioMetro;
   private double precio;
   
   public void setLargo(double x){
      largo = x;
   }
   public void setAncho(double x){
      ancho = x;
   }
   public void setPrecioM(double x){
      precioMetro = x;
   }
   public double getLargo(){
      return largo;
   }
   public double getAncho(){
      return ancho;
   }
   public double getPrecioM(){
      return precioMetro;
   }
   public void setPrecio(){
      area = largo*ancho; 
      precio = area*precioMetro;
      if(area>1000){
         precio = precio-(precio*25/100);
      }else if(area>500){
         precio = precio-(precio*17/100);
      }else if(area>400){
         precio = precio-(precio*10/100);
      }
   }
   public double getPrecio(){
      return precio;
   }
   public void muestra(){
      System.out.println("El terreno con un area de "+area+" metros cuadrados");
      System.out.println("Vale "+getPrecio()+" pesos");
   }
   
}