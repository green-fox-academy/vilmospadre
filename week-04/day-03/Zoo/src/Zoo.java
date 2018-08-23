import Animals.Bird;
import Animals.Mammal;
import Animals.Reptile;

public class Zoo {
    public static void main(String[] args) {

        Bird bird = new Bird("Parrot");
        Mammal mammal = new Mammal("Koala");
        Reptile reptile = new Reptile("Crocodile");

        System.out.println("How do you breed?");
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    }
}
