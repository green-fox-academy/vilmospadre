public class Flower extends Flora {

    Flower(String color, double waterAmount) {
        this.type = "flower";
        this.color = color;
        this.waterAmount = waterAmount;
        this.maxWater = 10;
        this.waterAbsorb = 0.4;

    }
}
