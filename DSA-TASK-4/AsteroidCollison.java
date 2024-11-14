class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] < 0){
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -1 * asteroids[i]){
                    st.pop();
                }

                if(!st.isEmpty() && st.peek() > -1 * asteroids[i]){
                    continue;
                }
                else if(!st.isEmpty() && st.peek() == -1 * asteroids[i]){
                    st.pop();
                }
                else{
                    st.push(asteroids[i]);
                }
            }
            else{
                st.push(asteroids[i]);
            }
        }
        
        int[] arr = new int[st.size()];

        for(int i = arr.length - 1 ; i >= 0; i--){
            arr[i] = st.pop();
        }

       return arr;
    }
}