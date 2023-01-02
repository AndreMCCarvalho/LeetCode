package one;

public class FindTheDifference {

    public static void main(String[] args) {
        new FindTheDifference().findTheDifference("abcd", "abcde");
    }

    public char findTheDifference(String s, String t){
        int[] lettersOfS = new int[26];
        int[] lettersOfT = new int[26];

        for (int i = 0; i < s.length(); i++){
            lettersOfS[s.charAt(i) - 'a'] = ++lettersOfS[s.charAt(i) - 'a'];
            lettersOfT[t.charAt(i) - 'a'] = ++lettersOfT[t.charAt(i) - 'a'];
        }

        lettersOfT[t.charAt(t.length() - 1) - 'a'] = ++lettersOfT[t.charAt(t.length() - 1) - 'a'];

        for (int j = 0; j < lettersOfS.length; j++){
            if (lettersOfT[j] > lettersOfS[j]){
                return (char)(j + 'a');
            }
        }
        return 'a';
    }

}
