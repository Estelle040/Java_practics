public class Matrix <T extends Number>{
    private int rows;
    private int cols;
    private T[][] matrix;

    public Matrix(int rows, int cols, T[][] matrix) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }

    public void trans() {
        T[][] ans = (T[][]) new Number[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        int temp = rows;
        rows = cols;
        cols = temp;
        matrix = ans;
    }

    public void show() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
