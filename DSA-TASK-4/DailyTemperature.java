class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < temp.length; i++){
            while(!st.isEmpty() && temp[i] > temp[st.peek()]){
                int j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }

        return ans;
        
    }
}