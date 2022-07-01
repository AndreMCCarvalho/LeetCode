package one;

import java.util.Map;

public class RomanToInteger
{

    public static void main(String[] args)
    {
        new RomanToInteger().romanToInt("LVIII");
    }

    public int romanToInt(String s) {
        Map<Character, Integer> mapping = Map.of(
                                        'M', 1000,
                                        'D', 500,
                                        'C', 100,
                                        'L', 50,
                                        'X', 10,
                                        'V', 5,
                                        'I', 1
                                    );

        int num = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(mapping.get(s.charAt(i))<mapping.get(s.charAt(i+1))){
                num -= mapping.get(s.charAt(i));
            }
            else{
                num += mapping.get(s.charAt(i));
            }
        }

        return num + mapping.get(s.charAt(s.length() - 1));
    }

}
