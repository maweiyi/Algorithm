package me.maweiyi;

public class Main {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix[0].length; //列
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][n - 1]) {
                for (int k = 0; k < matrix[i].length; k++) {
                    if (matrix[i][k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(Main.searchMatrix(new int[][]{{1}}, 1));
    }
}
