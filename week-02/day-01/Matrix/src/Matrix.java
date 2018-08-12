public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int sor = 0; sor < matrix.length; sor++) {
            for (int osz = 0; osz < matrix[sor].length; osz++) {
                matrix[sor][osz] = sor * osz;
                if (sor == osz) ;
                {
                    matrix[sor][osz] = 1;
                    System.out.println(matrix[sor][osz]);
                }
            }
        }
    }
}
