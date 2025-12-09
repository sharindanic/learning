@FunctionalInterface
interface Phone {
    void smart();
}

//class Apple implements Phone{
//    public void smart(){
//        System.out.println("This is the first smart phone in history");
//    }
//}


// the class now in the obj part write as a method in the main 
public class Main {
    public static void main(String[]args){
        Phone oj=new Phone(){
            public void smart(){
                System.out.println("This is the first smart phone in the history");
            }
        };
        oj.smart();
    }
}
