package one;

import java.util.*;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        new FirstUniqueCharacterInString().firstUniqChar("leetcode");
    }

    public int firstUniqChar(String s){
        if (s.length() == 0 || s == null) return 0;
        LinkedHashMap<Character, Integer> seenValues = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (seenValues.containsKey(s.charAt(i))){
                seenValues.put(s.charAt(i), seenValues.get(s.charAt(i)) + 1);
            }
            else{
                seenValues.put(s.charAt(i),1);
            }
        }

        for (Character c: seenValues.keySet()){
            if (seenValues.get(c) == 1){
                return s.indexOf(c);
            }
        }

        return -1;
    }

}
