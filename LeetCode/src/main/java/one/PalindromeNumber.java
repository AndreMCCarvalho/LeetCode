package one;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        new PalindromeNumber().isPalindrome(1001);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String number = String.valueOf(x);
        if(number.length() % 2 == 0){
            int i = number.length() / 2 - 1;
            int j = number.length() / 2;
            while(i >=0 && j < number.length()){
                if(number.charAt(i) != number.charAt(j)) return false;
                i--;
                j++;
            }
        }
        else{
            int i = number.length() / 2;
            int j = number.length() / 2;
            while(i >=0 && j < number.length()){
                if(number.charAt(i) != number.charAt(j)) return false;
                i--;
                j++;
            }
        }

        return true;
    }
}
