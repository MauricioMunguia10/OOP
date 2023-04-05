public class Aplica{
   public static void main(String a[]){
      
      //Airplane
      Airplane myAirplane = new Airplane();
      myAirplane.takeOff();
      myAirplane.land();
      myAirplane.fly();
      //Bird
      Bird myBird = new Bird();
      myBird.takeOff();
      myBird.land();
      myBird.fly();
      myBird.buildNest();
      myBird.layEggs();
      myBird.eat();
      //Superman
      Superman mySuperman = new Superman();
      mySuperman.takeOff();
      mySuperman.land();
      mySuperman.fly();
      mySuperman.leapBuilding();
      mySuperman.stopBullet();
      mySuperman.eat();
      
   }
}