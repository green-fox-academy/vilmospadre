public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.addFlora(new Flower("yellow", 9));
        garden.addFlora(new Flower("blue", 9));
        garden.addFlora(new Tree("purple", 0));
        garden.addFlora(new Tree("orange", 0));

        garden.printNeeds();
        garden.douseFlora(40);
        garden.printNeeds();
        garden.douseFlora(70);
        garden.printNeeds();
    }
}
