public class APedido{
   public static void main(String a[]){
      Pedido miPedido = new Pedido();
      miPedido.setCantidad(51);
      miPedido.setDescripcion("Rollos de papel");
      miPedido.setPrecioU(10);
      miPedido.costo();
   }
}