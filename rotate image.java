public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @return: Void
     */
    public void rotate(int[][] matrix) {
        // write your code here
        if (matrix.length == 0 || matrix[0].length == 0) return;
        int len = matrix.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][len - 1 - i];
                matrix[len - 1 - j][len - 1 - i] = temp;
            }
        }
            for (int m = 0; m< len/2; m++){
                for (int n = 0;n < len; n++){
                    int temp = matrix[m][n];
                    matrix[m][n] = matrix[len - m - 1][n];
                    matrix[len - m - 1][n] = temp;
                   // swap(matrix[i][j],matrix[len - i - 1][j]);
                }
            }
                    return;
        }
    }
    
    Solution 2 :
    public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @return: Void
     */
    public void rotate(int[][] matrix) {
        // write your code here
        if(matrix == null || matrix.length == 0) {return;}
        int len = matrix[0].length;
        int layer = len/2;
        for(int i = 0; i < layer; i++){
            int first = i;
            int last = len - 1 - i;
            for(int j = first; j < last; j++){ // 循环次数取决于first和last
                int offset = j - first;
                int top = matrix[first][j];
                matrix[first][j] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
        }
    }
