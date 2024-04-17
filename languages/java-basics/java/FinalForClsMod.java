final class c1{
   final void m1(){
        System.out.println("This is m1 of c1");
    }
}

class c2 /*extends c1*/{
    // void m1(){
    //     System.out.println("Overridden by C2");
    // }
    void m2(){
        System.out.println("This is m2 of c2");
    }
}

public class FinalForClsMod {
    public static void main(String[] args){
        c2 obj1=new c2();
        obj1.m2();
    }
}
