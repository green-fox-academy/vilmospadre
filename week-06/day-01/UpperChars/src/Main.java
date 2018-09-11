public class Main {
    public static void main(String[] args) {
        String word = "I wouLD LikE to FInD eVeryTHinG With STreAM eXpressIONs";

        word.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isUpperCase)
                .forEach(System.out::print)
        ;
    }
}
