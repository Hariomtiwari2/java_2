package Java8;



interface A {
    default void hello(){
        System.out.println("A says my hello");
    }

    int a = 45;
}

interface B {
    default void hello() {
        System.out.println("B says hello");
    }
}

class C implements A ,B {
    @Override
    public void hello() {
        B.super.hello();
    }
}

public class Main {
    public static void main(String[] args) {

        C c = new C();
        c.hello();



    }
}
