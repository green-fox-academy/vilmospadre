//package battle;
public class DCHero extends Hero {

    DCHero(String name, int motivation) {
        super(name, motivation);
    }

    DCHero(String name) {
        super(name, 45);
    }

    @Override
    public void punch(Punchable other) {
        if (other instanceof MarvelHero) {
            super.punch(other);
        }
    }
}
