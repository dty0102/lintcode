From cc150
Solution 1: Time O(n2) Space O(1)
public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        if(str==null||str.length()<=1) return true;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) return false;
            }
        }
        return true;
    }
}

Solution2: Time O(nlogn)
public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for(int i = 0; i < chars.length - 1; i++){
            if(chars[i] == chars[i + 1]) {return false;}
        }
        return true;
    }
}

Solution 3 :
public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        boolean[] chars = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if (chars[val]) {return false;}
            else chars[val] = true;
        }
        return true;
    }
}

Solution 4 : only works for the situation that all characters are lower case
public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if ((checker & (1<<val ))> 0) {return false;}
            checker |= (1 << val);
        }
        return true;
    }
}
