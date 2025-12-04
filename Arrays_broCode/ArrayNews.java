public class ArrayNews{
  public static void main(String []args){
    String[]name=new String[7];
    name[0]="Joe";
    name[1]="bear";
    name[2]="Joe";
    name[3]="bear";
    name[4]="Joe";
    name[5]="bear";
    name[6]="Joe";

    for(int i=0; i<name.length;i++){
      System.out.println(name[i]);
    }
  }
}
