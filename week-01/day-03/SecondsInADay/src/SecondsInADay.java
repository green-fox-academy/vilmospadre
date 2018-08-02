public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int remainingHours = 24 - currentHours;
        int remainingMinutes = 60 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;

        int allRemainingSeconds = remainingSeconds + (remainingMinutes*60) + (remainingHours*60*60);
        System.out.println("Remaining seconds: " + allRemainingSeconds);
    }
}