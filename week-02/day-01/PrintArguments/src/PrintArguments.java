public class PrintArguments {
    public static void main(String[] args) {

        String[] cucc = {"pam", "pampam", "pampamparam", "parapampam"};
        printParams("pam");
        printParams("pam", "pampam");
        printParams("pam", "pampam", "pampamparam", "parapampam");
    }

    public static void printParams(String... cucc) {

        for (String arg : cucc) {
            System.out.print(arg);
            System.out.println();
        }
    }
}