import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*for loop
        
        syntex for(var,condition,i++/i--)
        */
        int i=0;
        for(i=1;i<=10;i++){
            System.out.println(i);
        }

        /*
        While loop

        syntex While(condition){
            //Ststments
        }
        */
        int j=1;
        while(j<=10){
            System.out.println(j);
            j++;
        }

        //Do while loop
        /* Syntex
        do{
            //Ststments
        }while(condition);
        */
        
        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);


        //Sum of first n numbers
        int num,sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            num=sc.nextInt();
        }
        for(i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
