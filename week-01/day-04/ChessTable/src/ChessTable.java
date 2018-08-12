public class ChessTable {
    public static void main(String[] args) {


        String firstLine = "% % % % ";
        String secondLine = " % % % %";
        for (int a = 1; a <= 8; a += 2) {
            System.out.println(firstLine);
            int c = 0;
            c += 2;

            for (int b = 2; b <= c; b += 2) {
                System.out.println(secondLine);


            }
        }

    }
}