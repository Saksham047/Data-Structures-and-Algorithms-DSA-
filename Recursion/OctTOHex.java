import java.util.*;

public class OctalToHexadecimal {

    static String convert(String octal, int index) {
        if (index == octal.length()) {
            return "";
        }
        int digit = Integer.parseInt(octal.substring(index, index + 1), 8);
        if (digit < 10) {
            return digit + convert(octal, index + 1);
        } else {
            return Character.toString((char) (digit + 55)) + convert(octal, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        System.out.println("The hexadecimal number for " + octal + " is " + convert(octal, 0));
    }
}