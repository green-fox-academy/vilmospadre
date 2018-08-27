public class Main {
        public static void main(String[] args) {
            //  Create a function that takes a string and a list of string as a parameter
            //  Returns the index of the string in the list where the first string is part of
            //  Only need to find the first occurence and return the index of that
            //  Returns `-1` if the string is not part any of the strings in the list

            //  Example
            String[] searchArr = new String[]{"Okay", "this", "task", "is", "hard", "to", "understand"};
            System.out.println(subStrList("hard", searchArr));
            //  should print: `4`
            System.out.println(subStrList("to", searchArr));
            //  should print: `-1`
            System.out.println(subStrList("understand", searchArr));
        }

        public static int subStrList(String searchFor, String[] searchArr) {

            int returnValue = 0;

            for (int i = 0; i < searchArr.length; i++) {
                if (searchArr[i].contains(searchFor)) {
                    returnValue = i;
                } else {
                    returnValue = -1;
                }
            }
            return returnValue;
        }
    }

