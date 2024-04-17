public class ConditionalStatments {
    public static void main(String[] args){
        // Simple If & if else
        //Check if the numbe is equal to 10 if condition is satisfied print hello
        int n=10;
        if(n==1){
            System.out.println("Condition satisfied");
        }
        else{
            System.out.println("Condition failed");
        }

        //if else if 
        //if char='x' print hello or 'y' print or 'z' print laptop else default
        char ch='a';
        if(ch=='x'){
            System.out.println("Hello");
        }
        else if(ch=='y'){
            System.out.println("World");
        }
        else if(ch=='z'){
            System.out.println("Laptop");
        }
        else{
            System.out.println("Default");
        }

        //Nested if

        //check two  numbers if both are satisfied print hello else print world
        int n1=10;
        int n2=20;
        if(n1==10){
            if(n2==20){
                System.out.println("Hello");
            }
        }

        //Switch case

        //if num=10 print'A', num=20 print 'B',numb=30 print'C', else print Wrong case
        int num=50;
        switch(num){
            case 10:
                System.out.println("A");
                break;
            case 20:
                System.out.println("B");
                break;
            case 30:
                System.out.println("C");
                break;
            default:
                System.out.println("Wrong case");
        }


        
    }
}
