public class Transpose {

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3},
            {4, 5},
            {6, 7}
        };
        int[][] transposeMatrix = new int[matrix[1].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Start matrix:");
        MatrixUtils.print2D(matrix);
        System.out.println("Transpose matrix:");
        MatrixUtils.print2D(transposeMatrix);
    }
}
class MatrixUtils {
    static void print2D(int mat[][]) {
            for (int i = 0; i < mat.length; i++) {
                if (i != 0) System.out.println(" ");
                for (int j = 0; j < mat[i].length; j++)
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
}
