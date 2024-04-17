class class1{
    void m1(){
        System.out.println("This is M1 of class 1");
    }
}

class class2 extends class1{
    void m2(){
        System.out.println("This is M2 of class 2");
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        class2 obj1=new class2();
        obj1.m1();  //m1 is in class 1
        obj1.m2();  //m2 is in class 2

        //This is An example of single Inheritance
    }
}
