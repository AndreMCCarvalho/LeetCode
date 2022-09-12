package one;

public class ValidPalindrome {

    public static void main(String[] args) {
        new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s){
        if (s == null || s.length() < 2) return true;

        s = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = s.length() - 1, j = 0; i > (s.length() - 1) / 2; i--, j++){
            if (s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }

}
