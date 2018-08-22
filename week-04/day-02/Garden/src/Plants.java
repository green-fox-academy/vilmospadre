public class Plants {

    private String color;
    private double waterAmount;
    private double waterAbsorb;
    private int maxWater;
    private String type;

    public Plants(String color, double waterAmount, double waterAbsorb, int maxWater, String type) {
        this.color = color;
        this.waterAmount = waterAmount;
        this.waterAbsorb = waterAbsorb;
        this.maxWater = maxWater;
        this.type = type;
    }

    public int getMaxWater() {
        return maxWater;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getWaterAmount() {
        return waterAmount;

    }

    void water(int amount) {
        this.waterAmount += this.waterAbsorb * amount;
    }

}
