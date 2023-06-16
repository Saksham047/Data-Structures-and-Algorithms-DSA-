public class SuperPow {
    public int superpow(int a, int[] b) {
        if(b==null || b.length==0) return 0;
        
        int len = b.length;

        int[] remainders = new int[len];
        int first = a % 1337;
        for(int i=len-1; i>=0; i--) {
            int[] nums = new int[11];
            nums[0] = 1;
            for(int j=1; j<11; j++) {
                nums[j] = (nums[j-1]*first) % 1337;
            }
            
            remainders[i] = nums[b[i]];
            first = nums[10];
        }
        int remainder = 1;
        for(int i=0; i<len; i++) {
            remainder = (remainder*remainders[i]) % 1337;
        }
        
        return remainder;
    }
}