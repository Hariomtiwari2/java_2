package ATM_PROJECT;

class Father {
    String car = "BMW";

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


}

public class Super {

    public static void main(String[] args) {

        Father f = new Father();
        Son s = new Son();
        s.method1();



    }

}
