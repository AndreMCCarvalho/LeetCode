package one;

import java.util.*;

public class LongestCommonPrefix
{

    public static void main(String[] args)
    {
        new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"});
    }

    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs, Comparator.comparing(string -> string.length()));

        StringBuilder prefix = new StringBuilder();
        outer:
        while(strs[0].length() > 0)
        {
            prefix.append(strs[0].charAt(0));
            strs[0] = strs[0].substring(1);

            for (int i = 1; i < strs.length; i++){
                if(strs[i].charAt(0) == prefix.charAt(prefix.length() - 1)){
                    strs[i] = strs[i].substring(1);
                }
                else {
                    prefix.deleteCharAt(prefix.length() - 1);
                    break outer;
                }
            }
        }
        return prefix.toString();
    }

}
