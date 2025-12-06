public class Main{
  public static void main(String []args){
    //create 3 objts as ev1 , ev2 and ev3 
    // after that object refernce and instance variable name and the name choseen
    Ev ev1=new Ev();
    ev1.name="Tesla";
    ev1.price=50;
    Ev.type="electric"; //prob need to use class name cuz its static variable 
    
    Ev ev2=new Ev();
    ev2.name="Xiomi";
    ev2.price=35;
    Ev.type="electric"; //same here 
    
    Ev ev3=new Ev();
    ev3.name="Panda";
    ev3.price=17;
    Ev.type="electric"; //again

    Ev.type="Electric Vehicle" //secure the all the type in variables 

    ev1.displaying(); //dispaly the print
    ev2.displaying(); //
    ev3.displaying();
    
  }
}
