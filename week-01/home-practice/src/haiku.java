import java.util.Random;
public class haiku {
    public static void main(String[] args) {


        String[] listOne = {"lehet jót rosszul", "ez az élet kék", "Belzebub vizel", "egy torony ledől",
                "a méhek kékek", "tücsök-akcentus", "kódjaim szarok", "nukleusz bolyong", "Jézus méreget", "papírsárkány ég",
                "nem túl érdekes", "hallgat a bagoly", "őszbe fordulok"};

        String[] listTwo = {"kancsal gyilkos a hőség", "régi hangszer az ég", "Shrek elneveti magát",
                "jól vigyázz, genetikus!", "fegyvert fog-e a tigris?", "némán odaköp néha",
                "hol a Nutella, Vénusz?", "apu ökölbe szorul", "de végül nem lesz zsebpénz",
                "kívánod a véletlent?", "Pilátus moziba jár", "migrén egy nyári mezőn",
                "Gihubon van szerintem", "kihűlt a Nap, ma nem süt", "Pilótakekszet ültet",
                "izgága egy vizigót", "gép jó haikut nem ír", "néhány faj ma kihalt, ó!",
                "te milyen progit tudol?", "ketrecét rázza a szél", "a szóvivő ma sót kér"};

        String[] listThree = {"csontkamra a tél", "de vajon miért?", "hegedű nyiszál", "tud erről Isten?",
                "eleven festmény", "Tibor madár lett", "Tibor ma más lett", "taps a sötétben",
                "kékül a templom", "te se panaszkodj", "késő délután", "szubrutin buddha",
                "Allah varjút küld}"};
    }

    int oneLength = listOne;
    int twoLength = listTwo;
    int threeLength = listThree;

    Random rand = new Random();

    int rand1 = (int) (Math.random() * oneLength) / new;
    int rand2 = (int) (Math.random() * twoLength) / new;
    int rand3 = (int) (Math.random() * threeLength) / new;

    SThtring phrase = (listOne[rand1] + " " + listTwo[rand2] + " " + listree[rand3] + " ");


        System.out.println(phrase);

}

