//Emotions 

interface X{
  void sad();
  void Happy();
}

class B implements X,Y{
  public void sad(){
    System.out.println("Sad");
  }
  public void Happy(){
    System.out.println("Happy");
  }
  public void mood(){
    System.out.println("MoodOff");
  }
}

interface Y{
  void mood();
}
interface Z extends Y{
  
}

public class Main{
  public static void main(String []args){
    X obj;
    obj=new B();
    obj.sad();
    obj.Happy();

    Y obj1=new B();
    obj1.mood();
    
  }
}
