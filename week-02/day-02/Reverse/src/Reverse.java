public class Reverse {
    public static void main(String... args) {

        String ize = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        String reverse = "";


        System.out.println(reverse(ize));


    }

    public static String reverse(String ize) {
        StringBuilder vik = new StringBuilder();
        for (int i = ize.length() - 1; i >= 0; i--) {
            vik.append(ize.charAt(i));
        }
        return vik.toString();

    }
}
// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.