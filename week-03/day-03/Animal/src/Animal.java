public class Animal {

    int hunger;
    int thirst;
    int play;

    Animal(int hunger, int thirst, int play) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.play = play;
    }
    public void drink() {
        this.thirst--;

    }

    public void eat() {
        this.hunger--;

    }

    public void play() {
        this.hunger++;
        this.thirst++;

    }

}
