class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generate(list, 0, 0, "", n);
        return list;
    }

    void generate(List<String> list, int start, int end, String s, int n){
        if(s.length() == 2 * n){
            list.add(s);
            return;
        }

        if(start < n) generate(list, start+1, end, s + '(', n);
        if(end < start) generate(list, start, end + 1, s + ')', n);
    }

    

    
}