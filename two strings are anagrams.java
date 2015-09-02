Solution 1 :
public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s.length() != t.length()) return false;
        int [] time = new int[126];
        for (int i = 0; i < s.length();i++){
            time[(int) s.charAt(i)]++;
        }
        for (int j = 0;j < t.length();j++){
            time[(int)t.charAt(j)]--;
            if (time[(int) t.charAt(j)] < 0) return false;
        }
        return true;
    }
};
Solution 2 : 

