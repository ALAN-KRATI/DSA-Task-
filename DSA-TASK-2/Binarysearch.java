class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1, ans = -1;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                ans= mid;
                break;
            }

            if(target > nums[mid]){
                l = mid+1;
            }
            else r = mid-1;
        }
        return ans;
    }
}