final class Cal{ //to stop the inheritence 
    public final void add(int a,int b){ // added final to stop the method overriding 
        System.out.println(a+b);
    }
    public final void sub(int a,int b){ // ""
        System.out.println(a-b);
    }
}


//we use final in methods to stop the method overiding 
// we use in varibale to make it  const 
// can use in class to stop inheritence 
