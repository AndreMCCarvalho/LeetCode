package one;

import java.util.*;

public class WordPattern {

    public static void main(String[] args) {
        new WordPattern().wordPattern("abba", "dog cat cat fish");
    }

    public boolean wordPattern(String pattern, String s){
        String[] words = s.trim().split(" ");
        if (words.length != pattern.length()) return false;
        Map<String, Character> letterToWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            System.out.print("here");
            if (!letterToWord.containsKey(words[i]) && !letterToWord.containsValue(pattern.charAt(i))) letterToWord.put(words[i], pattern.charAt(i));
            if (!letterToWord.containsKey(words[i]) && letterToWord.containsValue(pattern.charAt(i))) return false;
            if (letterToWord.containsKey(words[i]) && letterToWord.get(words[i]) != pattern.charAt(i)) return false;
        }


        return true;
    }

}
