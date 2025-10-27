class Solution {
    public int numberOfBeams(String[] bank) {
        int pre = 0;
        int total = 0;
        for(String row:bank){
            int count = 0;
            for(char c : row.toCharArray() ){
                if( c == '1'){
                    count++;
                }
            }
            if(count>0){
                total += pre * count;
                pre = count;
            }
        }
        return total;
    }
}