public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double squareHeight = heightInM * heightInM;

        System.out.println(massInKg / squareHeight);
    }
}