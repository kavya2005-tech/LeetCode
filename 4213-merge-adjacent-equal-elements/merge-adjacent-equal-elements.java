class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> s = new Stack<>();
        for(int num:nums){
            long current = num;
            while(!s.isEmpty() &&  s.peek() == current){
                current += s.pop();
            }
            s.push(current);
        } 
        return new ArrayList<>(s);
    }
}