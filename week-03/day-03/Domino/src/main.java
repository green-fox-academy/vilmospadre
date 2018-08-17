import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        System.out.println(dominoes);
        snakeOfDominoes(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static void snakeOfDominoes(List<Domino> dominoes) {
        for (int i = 0; i < dominoes.size(); i++) {
            for (int v = i + 1; v < dominoes.size(); v++) {

                if (dominoes.get(i).getValues()[1] == dominoes.get(v).getValues()[0]) {
                    Collections.swap(dominoes,i + 1, v);

                    System.out.println(dominoes);
                }
            }
        }
    }
}