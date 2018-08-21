import java.util.ArrayList;
import java.util.List;

class Garden {

    List<Flora> garden;

    Garden() {
        garden = new ArrayList<>();
    }

    void addFlora(Flora flora) {
        this.garden.add(flora);
    }

    void printNeeds() {
        for (Flora flora : garden) {
            if (flora.waterAmount < flora.maxWater) {
                System.out.println("The " + flora.color + " " + flora.type + " needs water.");
            } else {
                System.out.println("The " + flora.color + " " + flora.type + " is fine.");
            }
        }
        System.out.println();
    }

    void douseFlora(int amount) {
        System.out.println("Douse with " + amount);
        int floraInNeed = 0;
        for (Flora flora : this.garden) {
            if (flora.waterAmount < flora.maxWater) {
                floraInNeed++;
            }
        }
        amount = floraInNeed;
        for (Flora flora : this.garden) {
            if (flora.waterAmount < flora.maxWater) {
                flora.water(amount);
            }
        }
    }
}