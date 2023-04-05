public class Publicacion{
   private String titulo;
   private double precio;
   
   public Publicacion(){
      System.out.println("Esto es una publicacion");
   }
   public void setTitle(String n){
      titulo = n;
   }
   public String getTitle(){
      return titulo;
   }
   public void setPrecio(double n){
      precio = n;
   }
   public double getPrecio(){
      return precio;
   }
   
}