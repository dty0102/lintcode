public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @return: Void
     */
    private int[][] result = null;
    public void setZeroes(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        Queue<Integer> index = new LinkedList<Integer>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 0) {index.offer(i);index.offer(j);}
            }
        }
        while(!index.isEmpty()){
            int i = index.poll();
            int j = index.poll();
            for (int n = 0; n < matrix[i].length; n++){
                matrix[i][n] = 0;
            }
            for (int m = 0; m < matrix.length; m++){
                matrix[m][j] = 0;
            }
        }
        return;
    }
