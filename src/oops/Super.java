package oops;

class Father {
    String car = "BMW";
    public Father(String car) {
        this.car = car;
    }

    public void method1() {
        System.out.println(car);
    }
}

class Son  extends  Father {
    String car = "Audi";

    public void method1() {
        System.out.println("Son car:" + car);
        System.out.println("Father car: "+ super.car);
    }

    public void method2() {
        super.method1();
    }


}

public class Super {

    public static void main(String[] args) {

        Father f = new Father();
        Son s = new Son();
        //s.method1();
        s.method2();


    }

}
