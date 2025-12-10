import java.util.ArrayList;
import java.util.List;

public class Main{
  public static void main(String []args){
    ArrayList<String>Foods=new ArrayList<String>();
    Foods.add("Pizza");
    Foods.add("Tiramisu");
    Foods.add("Ravioli");
    Foods.add("Kebab");

    Foods.set(0,"Lasagna");
    Foods.add("Pizza");
    Foods.remove(2);
    //Foods.clear();

    for(int i=0;i<Foods.size();i++){
      System.out.println(Foods.get(i));
    }
  }
  
}
