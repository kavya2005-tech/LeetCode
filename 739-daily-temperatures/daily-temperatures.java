class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int hottest = 0; // Tracks the highest temperature seen from the right
        
        // Traverse backwards from the second to last element
        for (int i = n - 1; i >= 0; i--) {
            int currentTemp = temperatures[i];
            
            // If the current day is hotter or equal to the hottest upcoming day,
            // there is no warmer future day.
            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue; // result[i] remains 0
            }
            
            // Hop through computed jumps instead of checking every single index
            int days = 1;
            while (temperatures[i + days] <= currentTemp) {
                days += result[i + days]; // Leverage previously calculated gaps
            }
            result[i] = days;
        }
        
        return result;
    }
}
