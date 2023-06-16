// https://leetcode.com/problems/power-of-four/

public class Power4{

    public static boolean isPowerOfFour(int n) {

        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }

        if (!(n % 4 == 0)) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args)
     {
        int n=45;
        boolean z=isPowerOfFour(n);
        System.out.println("Answer is = "+z);

        
    }
}
