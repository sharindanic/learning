class Vehicle{
  String name;
  int price;
  static String type;

  public void displaying(){
    System.out.println(name+":"+ price+":"+ type);
  }
  static void statdisplaying(Vehicle vehicle){
    System.out.println(vehicle.name+":"+ vehicle.price+":"+ type);
  }
}
