package tasks_11_16_26;

import java.util.function.Predicate;

public class Main_16 {
    public static void main(String[] args) {
        Predicate<String> tester = str ->
                (str.toUpperCase().startsWith("J") || str.toUpperCase().startsWith("N")) && str.toUpperCase().endsWith("A");

        String str = "nfhgbfhgba";

        System.out.println(tester.test(str));
    }
}
