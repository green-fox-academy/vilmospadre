public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.addPlants(new Flower("yellow", 4));
        garden.addPlants(new Flower("blue", 4));
        garden.addPlants(new Tree("purple", 7));
        garden.addPlants(new Tree("orange", 7));

        garden.printNeeds();
        garden.dousePlants(40);
        garden.printNeeds();
        garden.dousePlants(70);
        garden.printNeeds();
    }
}
