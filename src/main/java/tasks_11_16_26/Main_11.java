package tasks_11_16_26;

public class Main_11 {
    public static void main(String[] args) {
        int res = 0;

        for (String str : args)
            res += str.length();

        System.out.println(res);
    }
}

