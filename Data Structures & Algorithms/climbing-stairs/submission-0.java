class Solution {
    public int climbStairs(int n) {
        int first =1;
        int second =1;
        if(n==1 || n==0) return 1; 
        int total =0;
        for(int i=2;i<=n;i++){
            total = first+second;
            first=second;
            second=total;
        }
        return total;
    }
}
