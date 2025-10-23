package module2.package02;

public class Abc {
    public int b = 2;
    static int a = 1;
    public static void sayHello() {
//        System.out.println("module2.package02.Abc");
            Abc abc = new Abc();
//            abc.a
        System.out.println(Abc.a);
        System.out.println(Abc.a);
    }

    public static void main(String[] args) {
        Abc doi = new Abc();
        System.out.println(doi.b);
    }
}
