public class Main {
    public static void main(String[] args) {
        Car c1 = new BMW();
        System.out.println(c1+" has "+c1.tyers );
        c1.brake();
    }
}

abstract class Car {
    int tyers ;

    public Car(int tyers) {
        this.tyers = tyers;
    }
    abstract void brake();
}

class BMW extends Car{


    public BMW() {
        super(4);
    }

    @Override
    void brake() {
        System.out.println("very good break");
    }
}
