public class Main{
  public static void main(String []args){
    Vehicle vehicle1=new Vehicle();
    vehicle1.name="Toyota";
    vehicle1.price=120;
    Vehicle.type="Stututu";

    Vehicle vehicle2=new Vehicle();
    vehicle2.name="Nissan";
    vehicle2.price=230;
    Vehicle.type="GtR";

    Vehicle vehicle3=new Vehicle();
    vehicle3.name="Subaru";
    vehicle3.price=445;
    Vehicle.type="mitzu";

    Vehicle.type="JDM";

    vehicle1.displaying();
    vehicle2.displaying();
    vehicle3.displaying();

    Vehicle.statdisplaying(vehicle2);
    
  }
}
