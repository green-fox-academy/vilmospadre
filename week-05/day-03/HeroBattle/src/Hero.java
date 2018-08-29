public abstract class Hero extends BaseHero implements Punchable {

    private int motivation;

    public Hero(String name, int motivation) {
        super(name);
        this.motivation = motivation;
    }

    @Override
    public void punch(Punchable other) {
        double damage = getMotivation() / 1.5;
        if (getMotivationLevel() >= 1) {
            other.bePunched(damage);
        }
    }

    public int getMotivationLevel() {
        if (motivation < 25) {
            return 0;
        } else if (motivation >= 25 && motivation <= 40) {
            return 1;
        } else {
            return 2;
        }
    }

    private int getMotivation() {
        return this.motivation;
    }

    public void bePunched(double damage) {
        this.motivation -= damage / this.motivation;
    }

    @Override
    public String toString() {
        if (getMotivationLevel() == 0) {
            return getName() + " is not motivated anymore.";
        } else if (getMotivationLevel() == 1) {
            return getName() + " is motivated";
        } else {
            return getName() + " is well motivated";

        }
    }
}