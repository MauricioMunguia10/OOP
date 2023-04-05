/*Tarea. Realice un programa que muestre el costo de un pedido del cual se tiene la 
descripcion, cantidad pedida y precio unitario.Si la cantidad pedida excede a 50 unidades,
se hace un descuento del 15%
MMG*/
public class Pedido{
   private double cost;
   private String description;
   private int cant;
   private double precio;
   
   public void setCantidad(int n1){
      cant = n1;
   }
   public void setDescripcion(String n2){
      description = n2;
   }
   public void setPrecioU(double n3){
      precio = n3;
   }
   public int getCantidad(){
      return cant;
   }
   public String getDescripcion(){
      return description;
   }
   public double getPrecioU(){
      return precio;
   }
   public void costo(){
      cost = (cant*precio);
      System.out.println("Descripcion: "+ getDescripcion());
      System.out.println("Cantidad: "+ getCantidad());
      System.out.println("Precio unitario: "+ getPrecioU());
      
      if(cant>50){
         cost = cost-(cost*15/100);
         System.out.println("El costo final es: "+cost);   
      }else{
         System.out.println("El costo final es: "+cost);         
      }
   }
}