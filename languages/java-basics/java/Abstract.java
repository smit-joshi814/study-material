abstract class vhicle{
    void Speed(){}
    void Color(){}
}

class car extends vhicle{
    void Speed(){
        System.out.println("Top Speed Is 230Km/h");
    }
    void Color(){
        System.out.println("Color is Red");
    }
}

class bike extends vhicle{
    void Speed(){
        System.out.println("Top Speed is 150km/h");
    }
    void Color(){
        System.out.println("Color is Black");
    }
}

public class Abstract {
    public static void main(String[] args){
        car BMW=new car();
        BMW.Speed();
        BMW.Color();

        bike KTM=new bike();
        KTM.Speed();
        KTM.Color();
    }
}
