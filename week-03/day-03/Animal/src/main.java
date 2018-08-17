public class main {
    public static void main(String[] args) {

        Animal polarBear = new Animal(50, 50, 50);
        Animal teddyBear = new Animal(50, 50, 50);

        for (int i = 0; i < 10; i++) {
            polarBear.eat();
        }

        for (int v = 0; v < 30; v++) {
            teddyBear.eat();
        }

        for (int i = 0; i < 20; i++) {
            polarBear.drink();
        }

        for (int v = 0; v < 40; v++) {
            teddyBear.drink();
        }

        for (int i = 0; i < 5; i++) {
            polarBear.play();
        }


        for (int v = 0; v < 5; v++) {
            teddyBear.play();
        }

        System.out.println("The polar bear's hunger is: " + Integer.toString(polarBear.hunger) + " " + "and her thirst is: " + Integer.toString(polarBear.thirst) + " and she plays: " + Integer.toString(polarBear.play));
        System.out.println("The teddy  bear's hunger is: " + Integer.toString(teddyBear.hunger) + " " + "and her thirst is: " + Integer.toString(teddyBear.thirst) + " and she palys: " + Integer.toString(teddyBear.play));

    }
}

