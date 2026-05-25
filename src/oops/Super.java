package oops;

import java.security.PublicKey;

class Father {
    String car ;
    public Father() {
        System.out.println("Father class constructor is running");
    }


    public void method1() {
        System.out.println(car);
    }
}

class Son  extends  Father {
    String car ;
    String bike;

    public Son() {
        super();
        System.out.println("Son class constructor is running");
    }


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




    }

}
