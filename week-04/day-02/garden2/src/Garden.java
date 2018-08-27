public class Garden {

    private String type;
    private String color;
    double waterAmount;
    double waterAbsorb;
    int currentWater;

    public Plant(String type, String color, double waterAmount, double waterAbsorb, int currentWater) {
        this.type = type;
        this.color = color;
        this.waterAmount = waterAmount;
        this.waterAbsorb = waterAbsorb;
        this.currentWater = currentWater;

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public double getWaterAbsorb() {
        return waterAbsorb;
    }

    public void setWaterAbsorb(double waterAbsorb) {
        this.waterAbsorb = waterAbsorb;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }
}
