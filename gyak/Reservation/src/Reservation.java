import java.util.Random;

public class Reservation implements Reservations {

    @Override
    public String getDowBooking() {
    String[] DOW = {"MON", "TUE", "WEN", "THUR", "FRI", "SAT", "SUN"};
    Random generator = new Random();
    int randomIndex = generator.nextInt(DOW.length);
    return DOW(randomIndex);
    }

    @Override
    public String getCodeBooking() {
    Random random = new Random();
    String elements = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String randomCode = "";
    for (int i= 0; i <8; i++) {
        randomCode += elements.charAt(random.nextInt(elements.length()));
    }
    return randomCode;
    }
    public String printReservation() {
        return "Booking " + getCodeBooking() + " for " + getDowBooking();
    }
}
