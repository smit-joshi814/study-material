class c1{
    void m1(){
        System.out.println("This is M1 of c1");
    }
}

class c2 extends c1{
    void m2(){
        System.out.println("This is M2 of c2");
    }

    void m1(){
        System.out.println("M1 is overridden by M1 of c2");
    }
}

public class Overriding {
    public static void main(String[] args){
        c2 obj1=new c2();
        obj1.m1();
        obj1.m2();
    }
}
