package intropro.javacore.initialization.inheritance;

/**
 * Какой результат работы программы?
 *
 * Created by burdun on 15.08.2015.
 */
class Base {
    String s = "Base";
    public void init() { System.out.println(s); }
    Base() { init(); }
}

class Desc extends Base {
    String s = "Desc";
    public void init() { System.out.println(s); }
}

public class InheritanceAndInitialization {
    public static void main(String[] args) {
        Base inst = new Desc();
    }
}
