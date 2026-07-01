class Solution {
    public String removeStars(String s) {
        Stack<Character> str = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(!str.isEmpty()){
                    str.pop();
                }
            }
                else{
                    str.push(ch);
                }
        }
            StringBuilder s1 = new StringBuilder();
            for(char c : str){
                s1.append(c);
            }
        return s1.toString();
    }
}