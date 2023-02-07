package main.java.one;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        new RepeatedSubstringPattern().repeatedSubstringPattern("ababba");
    }

    public boolean repeatedSubstringPattern(String s){
        int size = s.length();

        String fold = s.substring(1, size) + s.substring(0, size - 1);

        return fold.contains(s);
    }

}
