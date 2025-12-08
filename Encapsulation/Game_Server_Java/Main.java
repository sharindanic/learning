public class Main{
    public static void main(String []args){
        Game obj1=new Game();  
        obj1.setPlayerName("NikoReturns"); 
        obj1.setLevel(-10);
        obj1.setExperiencePoints(0.0);
        obj1.setHealth(87);
        obj1.setIsAlive(false); //I'm fed up with this bullshit


        System.out.println(obj1.getPlayerName()+":"+obj1.getLevel() +":"+
                obj1.getExperiencePoints()+":"+obj1.getHealth()+":"+obj1.isAlive());

      // can be write like this 
      // no idea why i wrote like this but need to have self check: 
      
      /* Game obj1 = new Game("NikoReturns", 21, 10.0, 87, false);

        System.out.println(
                obj1.getPlayerName() + ":" +
                obj1.getLevel() + ":" +
                obj1.getExperiencePoints() + ":" +
                obj1.getHealth() + ":" +
                obj1.isAlive()
        );
      */

    }
}
