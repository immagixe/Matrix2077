package main.java.Matrix2077;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int x = numbers.remove(0);

        List<Entity> before = new ArrayList<>();
        before.add(new Entity(1,2));

        List<Entity> after = new ArrayList<>();
        after.add(new Entity(1,2));

        System.out.println(before.equals(after));


        System.out.println(before.equals(after));

        String predator = (char) 27 + "[31mWarning! " + (char)27 + "[0m";
        String hervibore = (char) 27 + "[32mWarning! " + (char)27 + "[0m";
        String s = (char) 27 + "[31mWarning! " + (char)27 + "[0m";
        String s2 = (char) 27 + "[31mWarning! " + (char)27 + "[0m";
        String s3 = (char) 27 + "[31mWarning! " + (char)27 + "[0m";

        System.out.println(predator);
        System.out.println(hervibore);

    }
}
