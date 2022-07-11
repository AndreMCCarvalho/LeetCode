package one;

public class LengthOfLastWord
{

    public static void main(String[] args)
    {

    }

    public int lengthOfLastWord(String s){
        if (s == null || s.length() == 0) return 0;

        s = s.trim();
        int length = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            else{
                length++;
            }
        }
        return length;
    }

}
