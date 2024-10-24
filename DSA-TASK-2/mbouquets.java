class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
    
        int left = 1, right = 1000000000, ans = -1;

        while( left <= right){
            int mid = (right + left)/2;

            if(canMake(bloomDay, m, k, mid)){
                right = mid - 1;
                ans = mid;
            }

            else left = mid + 1;
        }

        return ans;
    }

    public boolean canMake(int[] bloomDay, int m, int k, int x){
        int total = 0, count = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= x) count++;
            else count = 0;

            if(count == k){
                total++;
                count = 0;
            }
        }

        return total >= m;
    }
}