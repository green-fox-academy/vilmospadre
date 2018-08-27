public class Anagram {

    public boolean anagram(String string1, String string2) {
        char[] characters = string1.toCharArray();
        char[] characters2 = string2.toCharArray();
        int j = characters2.length - 1;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == characters2[j]) {
                j--;
            } else return false;
        }
        return true;
    }
}
