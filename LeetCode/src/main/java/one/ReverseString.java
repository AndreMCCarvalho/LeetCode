package one;

public class ReverseString {

    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        if (s.length < 2) return;

        int x = 0, y = s.length -1;

        while (x < y){
            char temp = s[x];
            s[x] = s[y];
            s[y] = temp;
            x++;
            y--;
        }
    }

}
