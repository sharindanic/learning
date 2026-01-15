interface Car{
    String Car="Toyota"; //static and final 
    int model=101;
    void manu();
    void sub();

}
class B implements Car {
    public void manu(){
        System.out.println("hello");
    }
    public void sub(){
        System.out.println("Java");
    }
}
