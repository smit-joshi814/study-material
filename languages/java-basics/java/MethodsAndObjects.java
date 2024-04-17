    class A{

        //These all Are considered As methods of class A
        void m1(){
            System.out.println("This is First Method");
        }
        void Add(int x,int y){
            System.out.println("The Sum is "+(x+y));
        }
        int Mul(int x,int y){
            return x*y;
        }

    }


    //Methoad overloading
    class Overloading{
        void Data(){
                System.out.println("No Arguments No return value");
            }
        void Data(int x){
            System.out.println("Passed value is "+ x);
        }
        int Data(int x,int y){
            return x+y;
        }
    }

public class MethodsAndObjects {
    public static void main(String[] args){
        //obj1 is Considered as object of Class A
       A obj1=new A();
    //calling 1st method
       obj1.m1();
    //calling second method
       obj1.Add(10,20);
    //Method With With Arg & return Type
        int ans=obj1.Mul(10,20);
        System.out.println("The ans is "+ans);


        //Method Overloading
        Overloading obj2=new Overloading();
        obj2.Data();
        obj2.Data(10);
        int val=obj2.Data(10, 20);
        System.out.println("The returning val is "+ val);
    }
}

