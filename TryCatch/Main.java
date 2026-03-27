public class Main{
    public static void main(String []args){
        int i=2;
        int j=0;
        int nums[]=new int[5] ;
        String name=null;


        try{
            j=19/i;
            System.out.println(name.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("There is an Arithmetic error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is a ArrayIndexOutOfBounds error");
        }catch(Exception e){
            System.out.println("There is an Error...");
        }
        System.out.println(j);
        
        



    }
}
