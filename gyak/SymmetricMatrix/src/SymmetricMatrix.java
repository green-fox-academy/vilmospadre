import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

    public static void main(String[] args) {
        // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
        // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
        // or false if it is not
        //
        // example for symmetric matrix:
        // 1 0 1
        // 0 2 2
        // 1 2 5
        //
        // example for not symmetric matrix
        // 7 7 7
        // 6 5 7
        // 1 2 1

        ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

        symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
        symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
        symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

        System.out.println(isSymmteric(symmetricMatrix));

    }

    private static boolean isSymmteric(ArrayList<ArrayList<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) != matrix.get(j).get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}


