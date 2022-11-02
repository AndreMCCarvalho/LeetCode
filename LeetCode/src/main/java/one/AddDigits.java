package one;

public class AddDigits {

    public static void main(String[] args) {

    }

    public int addDigits(int num){
        if (num < 10) return num;

        while (num / 10 > 0)
        {
            int sum = 0;
            while(num > 0)
            {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;
    }

    public int addDigits2(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}
