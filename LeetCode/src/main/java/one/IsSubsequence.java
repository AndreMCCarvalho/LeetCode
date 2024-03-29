package main.java.one;

public class IsSubsequence {

    public static void main(String[] args) {
        new IsSubsequence().isSubsequence("abc", "ahbgdc");
    }

    public boolean isSubsequence(String s, String t){
        if (s.length() == 0) return true;
        if (s.length() > t.length()) return false;

        int i = 0;

        for (int j = 0; j < t.length(); j++){
            if(s.charAt(i) == t.charAt(j)) i++;
            if(i == s.length()) return true;
        }

        return false;
    }

}
