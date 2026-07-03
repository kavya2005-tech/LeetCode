class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int maxFreq = 0;
            char maxChar = 0;
            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char)i;
                }
            }
            if (maxFreq == 0) {
                break;
            }
            for (int j = 0; j < maxFreq; j++) {
                sb.append(maxChar);
            }
            
            freq[maxChar] = 0;
        }
        return sb.toString();
    }
}
