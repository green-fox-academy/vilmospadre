import java.util.ArrayList;
import java.util.Arrays;

public class TodoPrint {
        public static void main(String... args) {
            String toDo = "My todo:\n";

            toDo += "\t - Buy milk \n" +
                    "\t - Download \n" +
                    "\t\t - Diablo \n";

            System.out.println(toDo);
        }
}


// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

