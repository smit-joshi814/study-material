class class12{
    void m1(){
        System.out.println("M1 of class12");
    }
}

class d1 extends class12{
    void m2(){
        System.out.println("M2 of d1");
    }
}

class j2 extends d1{
    void m3(){
        System.out.println("M3 of j2");
    }
}

public class MultiInheritance {
    public static void main(String[] args){
        //Creating obj of j2
        j2 obj1=new j2();
        obj1.m1();  //method of class12
        obj1.m2();  //method of d1
        obj1.m3();  //method of j2
    }
}
