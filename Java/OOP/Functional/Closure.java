package Functional;

import java.util.stream.IntStream;

public class Closure {
    public static void main(String[] args) {
        int a[] = {5};
        IntStream stream = IntStream.range(1, 15).map(e -> e * a[0]);
        a[0] = 0;
        stream.forEach(System.out::println);
    }
}
