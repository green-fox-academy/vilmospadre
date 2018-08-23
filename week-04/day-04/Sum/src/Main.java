import java.util.ArrayList;

public class Main {

   protected ArrayList<Integer> listOfNum;

    public int sumOfElmnts(ArrayList<Integer> listOfNum) {
        int sum = 0;
        for (int i = 0; i < listOfNum.size(); i++) {
            sum += listOfNum.get(i);
        }
        return sum;
    }
}

