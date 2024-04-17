//Data Types in Java
class DataTypes{
    public static void main(String[] args){
        //int 4 bytes
        int x=15;
        int x1=15;
        System.out.println(x);

        //byte 1 byte
        byte y=100;
        System.out.println(y);

        //sort 2 byte
        short b=120;
        System.out.println(b);

        //long 8 byte
        long c=78989;
        System.out.println(c);


        //Double
        double d=15.20;
        System.out.println(d);

        //float
        float e=20.15f;
        System.out.println(e);


        //Boolean
        boolean i=true;
        boolean s=false;
        System.out.println(i);
        System.out.println(s);
        System.out.println(x==x1);

        //Char
        char c1='I';
        System.out.println(c1);

        //String
        String s1="Hay i'm Missing You";
        System.out.println(s1);
        System.out.println(s1.charAt(4));
        System.out.println(s1.length());

        //Arrays
        int arr[]= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr[3]);

        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr1[2]);
        System.out.println(arr1.length);
        arr1[5]=17;
        System.out.println(arr1[5]);
    }
}