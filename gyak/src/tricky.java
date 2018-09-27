public class tricky {

    public float avrg() {
        int[] numbers = {1, 2, 3};
        float avrg = 0;
        float even = 0;
        float odd = 0;
        boolean smallestOdd = true;
        //  TrickyAverageTest avrgForTest = new TrickyAverageTest();
        for (int i = 0; i < 3; i++) {
            System.out.println("a tomb elemei : " + numbers[i]);

            if (numbers[i] % 2 == 0) {
                even = numbers[i];
                System.out.println("paros szam : " + even);
            } else if (smallestOdd) {
                odd = numbers[i];
                System.out.println("paratlans szam : " + odd);
                smallestOdd = false;
            }

        }

        avrg = (odd + even) / 2;
        //   avrgForTest.getTrickyAvg(avrg);
        System.out.println("atlag:  " + avrg);

        return avrg;
    }

    }



