class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String i : operations){
            char x = i.charAt(0);
            if(x == '+'){
                int a = st.pop();
                int y = a + st.peek();
                st.push(a);
                st.push(y);
            }
            else if(x == 'D'){
                int a = 2*st.peek();
                st.push(a);
            }
            else if(x == 'C'){
                st.pop();
            }
            else if(Character.isDigit(x) || x == '-'){
                st.push(Integer.parseInt(i)); 
            }
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }
}