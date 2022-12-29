package one;

public class RansomNote {

    public static void main(String[] args)
    {
        new RansomNote().canConstruct("aa", "ab");
    }

    public boolean canConstruct(String ransomNote, String magazine){
        if (ransomNote.length() == 0 && ransomNote == "") return true;
        if (ransomNote.length() > magazine.length()) return false;

        StringBuilder sb = new StringBuilder(magazine);

        for (int i = 0; i < ransomNote.length(); i++){
            char ransomLetter = ransomNote.charAt(i);
            int positionMagazine = sb.indexOf(String.valueOf(ransomLetter));
            if (positionMagazine == -1) return false;
            else sb.deleteCharAt(positionMagazine);
        }

        return true;
    }

}
