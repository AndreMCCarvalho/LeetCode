package one;

public class MajorityElement {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums){
        int maj = nums[0];
        int counter = 1;

        for(int i = 1; i < nums.length; i++){
            if (nums[i] == maj) {
                counter++;
            }
            else{
                counter--;
                if (counter < 0){
                    maj = nums[i];
                    counter++;
                }
            }
        }

        return maj;
    }

}
