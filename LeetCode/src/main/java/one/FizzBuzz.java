package one;

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        new FizzBuzz().fizzBuzz(3);
    }

    public List<String> fizzBuzz(int n) {
        if (n == 0 ) return List.of();
        List<String> fizzBuzz = new ArrayList<>();
        int i = 0;
        while (i < n) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) fizzBuzz.add("FizzBuzz");
            else if ((i + 1) % 3 == 0) fizzBuzz.add("Fizz");
            else if ((i + 1) % 5 == 0) fizzBuzz.add("Buzz");
            else fizzBuzz.add(String.valueOf(i + 1));
            i++;
        }
        return fizzBuzz;
    }

}
