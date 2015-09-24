package intropro.javacore;

/**
 * Написать метод, который преобразует String в int, не используя библиотечных функций.
 *
 * Created by burdun on 15.08.2015.
 */
public class StringToInt {

    public static int atoi(String buf) {
        int result = 0;
        for (int i = 0; i < buf.length(); i++) {
            result = result*10 + ( buf.charAt(i)-'0' );
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(atoi("999"));
    }
}
