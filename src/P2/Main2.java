package P2;

public class Main2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Hariom";
        s1.age  = 17;


        System.out.println(s1);

//        System.out.println(s1.name);
//        String x = s1.toString();
//        System.out.println(x);


    }
}

class Student {
    final String sch_name = "DAV NOIDA";
    String name;
    int age;

    @Override
    public String toString(){
        return  "Student name is " + name + " and his age is "+ age;
    }
}
