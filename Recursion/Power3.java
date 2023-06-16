// https://leetcode.com/problems/power-of-three/description/

public class Power3 {

    public static boolean isPowerOfFour(int n) {

        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }

        if (!(n % 3 == 0)) {
            return false;
        }

        return isPowerOfFour(n / 3);
    }


    // Using Iteration:

    // public boolean isPowerOfThree(int n) {

    // while (true) {

    // if (n < 1) {
    // return false;
    // } else if (n == 1) {
    // return true;
    // }

    // if (n % 3 == 0) {
    // n = n / 3;
    // } else {
    // return false;
    // }

    // }

    // }


public static void main(String[] args)
     {
        int n=45;
        boolean z=isPowerOfFour(n);
        System.out.println("Answer is = "+z);

        
    }
}