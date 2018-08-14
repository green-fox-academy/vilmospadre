import java.util.ArrayList;
import java.util.List;

public class seconds {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 5; ++i) {
            li.add(i);
        }
        System.out.println(li);                     // [1, 2, 3, 4, 5, 6, 7, 8]

        List<Integer> paros = new ArrayList<>();    // ebbe gyűjtsük ki li-ből a páros számokat
        for (int e : li) {
            if (e % 2 == 0) {
                paros.add(e);
            }
        }
        System.out.println(paros);

    }
}


//  if (e % 2 == 0) {
//    everySeconds.add(e);
//}
// System.out.println(everySeconds);
//       List<Integer> result



