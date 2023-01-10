package one;

import java.util.ArrayList;

public class LongestPalindrome {

    public static void main(String[] args) {
        new LongestPalindrome().longestPalindrome("abccccdd");
    }

    public int longestPalindrome(String s){
        if (s == null) return 0;
        if (s.length() < 2) return 1;

        int longest = 0;
        ArrayList<Character> memory = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            if (!memory.contains(s.charAt(i))) memory.add(s.charAt(i));
            else {
                longest += 2;
                memory.remove((Character) s.charAt(i));
            }
        }

        return memory.isEmpty() ? longest : ++longest;
    }
}
