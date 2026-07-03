import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        
        for (String word : queries) {
            int pIndex = 0; 
            boolean isMatch = true;    
            for (char c : word.toCharArray()) {
                if (pIndex < pattern.length() && c == pattern.charAt(pIndex)) {
                    pIndex++;
                } 
                else if (Character.isUpperCase(c)) {
                    isMatch = false;
                    break;
                }
            }
      
            ans.add(isMatch && pIndex == pattern.length());
        }
        
        return ans;
    }
}
