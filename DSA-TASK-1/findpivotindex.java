class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length, ans = -1;
        int prefix = 0, postfix = 0;
        int[] pre = new int[n];
        
        for(int i = 0; i < n; i++){
            pre[i] = prefix;
            prefix += nums[i];
        }

        for(int i = n-1; i >= 0; i--){
            if(pre[i] == postfix) ans = i;
            postfix += nums[i];
        }

        return ans;
    }
}