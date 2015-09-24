package intropro.javacore.initialization.static_methods;

/**
 * Какой результат работы данной программы? (Будет ли ошибка?)
 *
 * Created by burdun on 15.08.2015.
 */
public class A {
    public static void method() {}
    public static void main(String[] args) {
        A a = null;
        a.method();
    }
}


class A_Explanation {

    A_Explanation() {
        System.out.println("A_Explanation constructor");
    }

    public static void method() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        A_Explanation a = null;
        a.method();
    }
}


class A_Extended_Explanation {

    public static int static_field = 1;

    A_Extended_Explanation() {
        System.out.println("A_Extended_Explanation constructor");
    }

    public static void method() {
        System.out.println("Static method");
        System.out.println("static_field == " + static_field);
    }

    public static void main(String[] args) {
        A_Extended_Explanation a = null;
        a.method();
    }
}
