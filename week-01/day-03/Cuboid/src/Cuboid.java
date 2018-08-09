public class Cuboid {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        double surface = 2 * (a * b + a * c + b * c);
        double volume = a * b * c;

        System.out.println("Surface area= " + surface);
        System.out.println("Volume: " + volume);
    }
}
