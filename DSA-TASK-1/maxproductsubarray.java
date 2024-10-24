class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length, pre = 0, suff = 0, ans = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++){
            if(pre == 0) pre = nums[i];
            else pre *= nums[i];
            if(suff == 0) suff = nums[len-i-1];
            else suff *= nums[len-i-1];

            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans;
        
    }
}