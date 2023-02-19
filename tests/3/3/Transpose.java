public class Transpose {

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3},
            {4, 5},
            {6, 7}
        };
        int [][] transposeMatrix = MatrixUtils.copy(matrix);

        System.out.println("Start matrix");
        System.out.println("------");
        MatrixUtils.print2D(matrix);

        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j < n; j++) {
        //         int temp = a[i][j];
        //         a[i][j] = a[j][i];
        //         a[j][i] = temp;
        //     }
        // }
        //
        // System.out.println();
        // System.out.println("Новая матрица");
        // System.out.println("------");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.printf("%3d", a[i][j]);
        //     }
        //     System.out.println();
        // }

    }
}
class MatrixUtils {
    public static int[][] copy(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++)
            transposeMatrix[i] = matrix[i].clone();

        return transposeMatrix;
    }
    static void print2D(int mat[][]) {
            for (int i = 0; i < mat.length; i++) {
                if (i != 0) System.out.println(" ");
                for (int j = 0; j < mat[i].length; j++)
                    System.out.print(mat[i][j] + " ");
            }
        }
}
