class Butter{
  public void licky(){
    System.out.println("Licky....");
  }
}

class Jam extends Butter{
  @override
  public void licky(){
    System.out.println("Licky....");
  }
}

class Main{
  public static void main(String []args){
    Jam obj=new Jam();
    obj.licky();
    
  }
}
