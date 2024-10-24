class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s1 = s + s;
        String ss = s1.substring(1, s1.length()-1);
        return ss.contains(s);
    }
}