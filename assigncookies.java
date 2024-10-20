class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0, gs = g.length - 1, ss = s.length  - 1;

        while(gs >= 0 && ss >= 0){
            if(g[gs] <= s[ss]){
                ans++;
                ss--;
            }
            gs--;
        }

        return ans;
    }
}