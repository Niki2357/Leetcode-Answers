class Solution {

    // bit operation version
    public static double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1/x;
        }

        double pow = 1;
        while (n != 0) {
            int lastDigit = 1 & n;
            if (lastDigit != 0) {
                pow = pow * x;
            }
            x = x*x;
            n = n >>> 1;                     
        }
        return pow;
    }

    // very basic version that exceeds time limit
    // public static double myPow(double x, int n) {
    //     double output = 1.0;
    //     if (n == 0) {
    //         return 1.0;
    //     } else if (n > 0) {
    //         for (int i = 1; i <= n; i++) {
    //             output *= x;
    //         }
    //         return output; 
    //     } else {
    //         n = -n;
    //         System.out.println(n);
    //         for (int i = 1; i <= n; i++) {
    //             output = output/x;
    //             // System.out.println(output);
    //         }
    //         return output; 
    //     }
        
        
    // }
    public static void main(String[] args) {
        double x = 2.000;
        int n = -2;
        System.out.println(myPow(x,n));
    }
}