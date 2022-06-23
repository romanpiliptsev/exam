package tasks_11_16_26;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main_26 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
        System.out.println(strings);

        List<String> filteredList = strings.stream().filter(new Predicate<String>() {
            int counter = 1;
            @Override
            public boolean test(String s) {
                return counter++ % 5 != 0;
            }
        }).collect(Collectors.toList());

        System.out.println(filteredList);
    }
}
