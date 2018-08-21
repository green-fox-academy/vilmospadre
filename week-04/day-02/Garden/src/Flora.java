public class Flora {

    String color;
    double waterAmount;
    double waterAbsorb;
    int maxWater;
    String type;

    void water(int amount) {
        this.waterAmount += waterAbsorb * amount;
    }
}