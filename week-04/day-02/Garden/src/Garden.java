import java.util.ArrayList;
import java.util.List;

class Garden {

    List<Plants> garden;

    Garden() {
        garden = new ArrayList<>();
    }

    void addPlants(Plants plants) {
        this.garden.add(plants);
    }

    void printNeeds() {
        for (Plants plants : garden) {
            if (plants instanceof Flower && plants.getWaterAmount() < 5) {
                System.out.println("The " + plants.getColor() + " " + plants.getType() + " needs water.");

            } else if (plants instanceof Tree && plants.getWaterAmount() < 10) {
                System.out.println("The " + plants.getColor() + " " + plants.getType() + " needs water.");

            } else {
                System.out.println("The " + plants.getColor() + " " + plants.getType() + " is fine.");
            }
        }
        System.out.println();
    }

    void dousePlants(int amount) {
        System.out.println("Douse with " + amount);
        int plantInNeed = 0;
        for (Plants plants : this.garden) {
            if (plants.getWaterAmount() < plants.getMaxWater()) {
                plantInNeed++;
            }
        }

        amount = plantInNeed;
        for (Plants plants : this.garden) {
            if (plants.getWaterAmount() < plants.getMaxWater()) {
                plants.water(amount);
            }
        }
    }
}