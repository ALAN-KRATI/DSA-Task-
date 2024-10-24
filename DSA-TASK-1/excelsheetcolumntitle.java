class Solution {
    public String convertToTitle(int column) {
        StringBuilder ans = new StringBuilder();

        while(column > 0){
            column--;
            int r = column%26;
            char curr = (char)(r + 'A');
            ans.append(curr);
            column /= 26;
        }

        return ans.reverse().toString();
    }
}