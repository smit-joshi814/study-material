class c12{
    void m1(){
        System.out.println("Method of m1");
    }
}

class c123 extends c12{
    void m2(){
        System.out.println("Method of m2");
    }
}

class c3 extends c12{
    void m3(){
        System.out.println("Method of m3");
    }
}

public class HirrarchicalInheritance {
    public static void main(String[] args){
        //creating obj of c123 and c3
        c123 obj1=new c123();
        obj1.m1();
        obj1.m2();

        c3 obj2=new c3();
        obj2.m1();
        obj2.m3();

    }
}
