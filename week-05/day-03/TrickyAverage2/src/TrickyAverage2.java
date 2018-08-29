public class TrickyAverage2 {

    public float avrg() {

        int[] numbers = {1, 2, 3};
        float avrg = 0;
        float even = 0;
        float odd = 0;
        boolean smallestOdd = true;

        for (int i = 0; i < 3; i++) {
            System.out.println("Numbers: " + numbers[i]);

            if (numbers[i] % 2 == 0) {
                even = numbers[i];
                System.out.println("even: " + even);
            } else if (smallestOdd) {
                odd = numbers[i];
                System.out.println("odd: " + odd);
                smallestOdd = false;
            }

        }

        avrg = (odd + even) / 2;

        System.out.println("average:  " + avrg);

        return avrg;
    }

}

