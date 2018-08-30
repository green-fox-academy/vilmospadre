import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StSc {
    public static void main(String... args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies

        String names = "";
        for (Map<String, Object> entry : map) {
            if ((int) entry.get("candies") > 4) {
                names += entry.get("name");
                names += " ";
            }
        }
        System.out.println("Kids whos got more than four candies are: " + names);

        Integer sumOfAge = 0;
        Double sumOfAgeDouble = 0.0;
        Double finalAge = 0.0;
        for (Map<String, Object> entry : map) {
            if ((int) entry.get("candies") < 5) {
                if (entry.get("age") instanceof Double) {
                    sumOfAgeDouble += (Double) entry.get("age");

                }

                if (entry.get("age") instanceof Integer) {
                    sumOfAge += (Integer) entry.get("age");

                }
            }
        }
        finalAge = sumOfAgeDouble + sumOfAge;
        System.out.println(finalAge);

    }
}
            



            
