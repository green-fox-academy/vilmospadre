public class Main {

    public static void main(String[] args) {

        Domino domino1 = new Domino(5, 2);
        Domino domino2 = new Domino(4, 6);

        System.out.println(domino1.compareTo(domino2));
        if (domino1.compareTo(domino2) > 0) {
            System.out.println("Domino1 is bigger than domino2.");
        } else if (domino1.compareTo(domino2) < 0) {
            System.out.println("Domino2 is bigger than domino1.");
        } else {
            System.out.println("Domino1 and domino2 are equal.");
        }

        Domino domino3 = new Domino(1, 5);
        Domino domino4 = new Domino(6, 7);

        System.out.println(domino3.compareTo(domino4));
        if (domino3.compareTo(domino4) > 0) {
            System.out.println("Domino3 is bigger than domino4.");
        } else if (domino3.compareTo(domino4) < 0) {
            System.out.println("Domino4 is bigger than domino3.");
        } else {
            System.out.println("Domino3 and domino4 are equal.");
        }

        Domino domino5 = new Domino(2, 4);
        Domino domino6 = new Domino(7, 1);

        System.out.println(domino5.compareTo(domino6));
        if (domino5.compareTo(domino6) > 0) {
            System.out.println("Domino5 is bigger than domino6.");
        } else if (domino5.compareTo(domino6) < 0) {
            System.out.println("Domino6 is bigger than domino5.");
        } else {
            System.out.println("Domino5 and domino6 are equal.");
        }
    }
}
