public class haikuGen {
    public static void main(String[] args) {

        //make 3 sets of words to choose from
        String[] wordListOne = {"lehet jót rosszul", "ez az élet kék", "Belzebub vizel", "egy torony ledől",
                "a méhek kékek", "tücsök-akcentus", "kódjaim szarok", "nukleusz bolyong", "Jézus méreget",
                "papírsárkány ég","nem túl érdekes", "hallgat a bagoly", "őszbe fordulok"};

        String[] wordListTwo = {"kancsal gyilkos a hőség", "régi hangszer az ég", "Shrek elneveti magát",
                "jól vigyázz, genetikus!", "fegyvert fog-e a tigris?", "némán odaköp néha",
                "hol a Nutella, Vénusz?", "apu ökölbe szorul", "de végül nem lesz zsebpénz",
                "kívánod a véletlent?", "Pilátus moziba jár", "migrén egy nyári mezőn",
                "Githubon van szerintem", "kihűlt a Nap, ma nem süt", "Pilótakekszet ültet",
                "izgága egy vizigót", "gép jó haikut nem ír", "néhány faj ma kihalt, ó!",
                "te milyen progit tudol?", "ketrecét rázza a szél", "a szóvivő ma sót kér"};

        String[] wordListThree = {"csontkamra a tél", "de vajon miért?", "hegedű nyiszál",
                "tud erről Isten?", "eleven festmény", "Tibor madár lett", "Tibor ma más lett",
                "taps a sötétben", "kékül a templom", "te se panaszkodj", "késő délután",
                "szubrutin buddha", "Allah varjút küld"};

        //find out how many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate 3 random numbers6
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase1 = wordListOne[rand1];
        String phrase2 = wordListTwo[rand2];
        String phrase3 = wordListThree[rand3];

        //print out the haiku
        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase3);

    }
}