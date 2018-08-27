public class NumberConverter {

    public String numberToWord(int number) {
        String words = "";

        String[] onesArray = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if ((number / 1000000) > 0) {
            words += numberToWord(number / 1000000) + " million ";
            number %= 1000000;
        }
        // check if number is divisible by 1 thousand
        if ((number / 1000) > 0) {
            words += numberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((number / 100) > 0) {
            words += numberToWord(number / 100) + " hundred ";
            number %= 100;
        }
        if (number > 0) {
            // check if number is within teens
            if (number < 20) {
                // fetch the appropriate value from unit array
                words += onesArray[number];
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + onesArray[number % 10];
                }
            }
        }
        return words;
    }
}