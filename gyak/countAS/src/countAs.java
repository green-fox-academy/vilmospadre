public class countAs {
    public static void main(String[] args) {
        // Create a function that takes a string parameter,
        // counts the occurrences of the letter "a", and returns it as a number.

        System.out.println(countAs("Apple"));
        System.out.println(countAs("Avocado"));
        System.out.println(countAs("Blueberry"));
        // example: on the input "Apple" the function should return 1 - print this result
        // example: on the input "Avocado" the function should return 2 - print this result
        // example: on the input "Blueberry" the function should return 0 - print this result
    }

    private static int countAs(String text) {
        int count = 0;
        for (char character : text.toLowerCase().toCharArray()) {
            if (character == 'a') ;
            count++;
        }
        return count;
    }
}