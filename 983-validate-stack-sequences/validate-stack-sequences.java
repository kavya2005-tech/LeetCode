class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int m = popped.length;
        Stack<Integer> s = new Stack<>();
        int i = 0;
        for(int x:pushed){
            s.push(x);
             while (!s.isEmpty() && s.peek() == popped[i]) {
                s.pop();
                i++;
             }
        }
        return i == popped.length;
    }
}