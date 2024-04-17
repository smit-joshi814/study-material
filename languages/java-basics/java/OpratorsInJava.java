//Operators In Java
class OperatorsInJava{
    public static void main(String[] args){
     
     //Arithmatic
     int a,b,c;
     a=10;
     b=25;
     c=a+b;
     System.out.println("The Sum is "+c);
     c=a-b;
     System.out.println("The substraction is "+c);
     c=a*b;
     System.out.println("The Multiplicaction is "+c);
     c=b/a;
     System.out.println("The Division is "+c);
     c=b%a;
     System.out.println("The Reminder is "+c);


     //Relational 
     int x,y;
     x=10;
     y=20;
     System.out.println(x<y);   //true
     System.out.println(x>y);   //false
     System.out.println(x==y);  //false
     System.out.println(x!=y);  //true


     //Bitwise
     int d,e,f;
     d=5;
     e=7;
     
     f=d&e;
     System.out.println("Bitwise AND ="+f);

     f=d|e;
     System.out.println("Bitwise OR = "+f);

     f=d^e;
     System.out.println("Bitwise XOR = "+f);

     //Logical
     int i,j,k;
     i=50;
     j=20;
     k=30;

     if(i>j && i>k){
         System.out.println("Logical AND");
     }
     if(i>j || i>k){
         System.out.println("Logical OR");
     }
    }
}