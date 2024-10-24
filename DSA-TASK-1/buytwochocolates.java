class Solution {
    public int buyChoco(int[] pri, int mon) {
        Arrays.sort(pri);
        int p1 = pri[0], p2 = pri[1];

        if(p1 + p2 <= mon){
            int ans = mon - p1 - p2;
            return ans;
        }

        return mon;
    }
}