class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i : nums){
            if(i%2 != 0) st.push(i);
        }

        for(int i : nums){
            if(i%2 == 0) st.push(i);
        }

        int k = 0;
        while(!st.isEmpty()){
            ans[k] = st.pop();
            k++;
        }

        return ans;
    }
}