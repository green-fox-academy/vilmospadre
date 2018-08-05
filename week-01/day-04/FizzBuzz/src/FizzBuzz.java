public class FizzBuzz {
        public static void main(String[] args) {
            for (int v = 1; v <= 100; v++) {
                boolean fizzOrBuzz = false;
                if (v % 3 == 0) {
                    System.out.print("Fizz");
                    fizzOrBuzz = true;
                }
                if (v % 5 == 0) {
                    System.out.print("Buzz");
                    fizzOrBuzz = true;
                }

                if (fizzOrBuzz) {
                    System.out.println();
                } else {
                    System.out.println(String.valueOf(v));
                }
            }
        }
    }
