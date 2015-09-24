package intropro.javacore.initialization.inheritance.inheritance_explanation;

/**
 * Created by burdun on 15.08.2015.
 */
class Base {

    String s = "Base";

    public void init() {
        System.out.print("Method init() in class Base: ");
        System.out.println("s == " + s);
    }

    Base() {
        System.out.println("Base constructor");
        init();
    }
}


class Desc extends Base {

    String s = "Desc";

    @Override
    public void init() {
        System.out.print("Method init() in class Desc: ");
        System.out.println("s == " + s);
    }

    Desc() {
        System.out.print("Desc constructor: ");
        System.out.println("s == " + s);
        super.init();
    }
}


public class InheritanceAndInitialization_Explanation {
    public static void main(String[] args) {
        Base inst = new Desc();
    }
}
