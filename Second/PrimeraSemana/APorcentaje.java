public class APorcentaje{
   public static void main(String a[]){
      Porcentaje miPorcentaje = new Porcentaje();
      miPorcentaje.setNum(200);
      miPorcentaje.setPor(5);
      miPorcentaje.setTotal();
      /*miPorcentaje.getNum();
      miPorcentaje.getPor();
      miPorcentaje.getTotal();*/
      System.out.println("El numero es: "+ miPorcentaje.getNum());
      System.out.println("El porcentaje es: "+ miPorcentaje.getPor()+ "%");
      System.out.println("El total es: "+ miPorcentaje.getTotal());
   }
}