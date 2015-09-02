public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        int end2=length-1;
        int result=0;
        int num=0;
        for(int i=end2;i>=0;i--){if(string[i]==' ') {num++;}}
        //the size for the new string
        int end1=end2+num*2;
        for(int i=end2;i>=0;i--){
            if(string[i]==' '){
                string[end1]='0';end1--;
                string[end1]='2';end1--;
                string[end1]='%';end1--;
            }
            else{
                string[end1]=string[i];end1--;
            }
        }
        return end2+num*2+1;
    }
}
