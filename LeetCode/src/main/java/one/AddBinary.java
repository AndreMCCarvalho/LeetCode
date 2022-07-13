package one;

public class AddBinary
{

    public static void main(String[] args)
    {
        new AddBinary().addBinary("11", "1");
    }

    public String addBinary(String a, String b) {
        if(a==null || a.length() == 0) return b;
        if(b==null || b.length() == 0) return a;

        StringBuilder sum = new StringBuilder();

        int plusOne = 0;
        StringBuilder aBuilder = new StringBuilder(a);
        while(aBuilder.length() < b.length()){
            aBuilder.insert(0, "0");
        }
        a = aBuilder.toString();
        StringBuilder bBuilder = new StringBuilder(b);
        while(bBuilder.length() < a.length()){
            bBuilder.insert(0, "0");
        }
        b = bBuilder.toString();

        for(int i = a.length() - 1; i >= 0; i--){
            int valueAtA = Character.getNumericValue(a.charAt(i));
            int valueAtB = Character.getNumericValue(b.charAt(i));

            if(valueAtA + valueAtB + plusOne > 1){
                sum.insert(0, valueAtA + valueAtB + plusOne == 2 ? 0 : 1);
                plusOne = 1;
            }
            else{
                sum.insert(0, valueAtB + valueAtA + plusOne);
                plusOne = 0;
            }
        }
        return plusOne == 1 ? sum.insert(0, 1).toString() : sum.toString();
    }

}
