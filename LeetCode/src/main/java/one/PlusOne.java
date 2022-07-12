class Solution {

    public static void main(String[] args) {
        System.out.println("Here");
    }

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return digits;

        boolean increment = true;
        int endPointer = digits.length - 1;

        while(increment){
            if(digits[endPointer] == 9){
                digits[endPointer] = 0;
                int firstDigit = digits[0];
                endPointer--;
                if(endPointer == -1){
                    int[] temp = new int[digits.length + 1];
                    temp[0] = firstDigit + 1;
                    for(int i = 0; i < digits.length; i++){
                        temp[i + 1] = digits[i];
                        return temp;
                    }
                }
            }else{
                digits[endPointer] = digits[endPointer] + 1;
                increment = false;
            }
        }
        return digits;
    }
}