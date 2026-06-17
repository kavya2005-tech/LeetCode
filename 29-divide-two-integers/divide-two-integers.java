class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

    
        boolean negative = (dividend < 0) ^ (divisor < 0);
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        int quotient = 0;


       while (dividend <= divisor) {
            int tempDivisor = divisor;
            int multiple = 1;
         while (tempDivisor >= (Integer.MIN_VALUE >> 1) && dividend <= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
                dividend -= tempDivisor;
            quotient += multiple;
        }
        return negative ? -quotient : quotient;
    }
}
