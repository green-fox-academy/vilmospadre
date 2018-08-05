public class haikuWorkingBakkerSikerult {
    public static void main(String[] args) {

        //make 3 sets of words to choose from
        String[] wordListOne = {"lehet jót rosszul", "ez az élet kék", "Belzebub vizel", "egy torony ledől",
                "a méhek kékek", "tücsök-akcentus", "kódjaim szarok", "nukleusz bolyong", "Jézus méreget",
                "papírsárkány ég", "nem túl érdekes", "hallgat a bagoly", "őszbe fordulok", "csontkamra a tél", "de vajon miért?", "hegedű nyiszál",
                "tud erről Isten?", "eleven festmény", "Tibor madár lett", "Tibor ma más lett",
                "taps a sötétben", "kékül a templom", "te se panaszkodj", "késő délután",
                "szubrutin buddha", "Allah varjút küld", "centis a méhszáj", "megözvegyültem?", "bandzsa-e Vishnu?",
                "ki kér kegyelmet?", "a remény ilyen", "semmi se történt", "szép nyáron a jég", "sántít a púpos","hű, de berúgtam", "nézz a szemembe",
                "pupilla tágul", "Lénám a tavasz", "ó, jó cimborám", "ki lesz itt lángész?", "tébolyult sonka", "megjavulok tán"};

        String[] wordListTwo = {"hálószobánk ez a rét", "Léna katicát röppent", "orkán suttog szelíden",
                "ó, Leo DiCaprio!", "vak ember kardja hasít", "meg sosem rémülünk mi", "szikrázik a hó, Cure szól",
                "utánam sír ez a sír", "létünk nem örök", "a kabóca felüvölt", "a rossz színész most fölsír",
                "jöjj, barátom, igyunk bort!", "kancsal gyilkos a hőség", "régi hangszer az ég",
                "Shrek elneveti magát", "jól vigyázz, genetikus!", "fegyvert fog-e a tigris?", "némán odaköp néha",
                "hol a Nutella, Vénusz?", "apu ökölbe szorul", "de végül nem lesz zsebpénz",
                "kívánod a véletlent?", "Pilátus moziba jár", "migrén egy nyári mezőn",
                "Githubon van szerintem", "kihűlt a Nap, ma nem süt", "Pilótakekszet ültet",
                "izgága egy vizigót", "gép jó haikut nem ír", "néhány faj ma kihalt, ó!",
                "te milyen progit tudol?", "ketrecét rázza a szél", "a szóvivő ma sót kér"};


        //find out how many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListOne.length;

        //generate 3 random numbers6
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase1 = wordListOne[rand1];
        String phrase2 = wordListTwo[rand2];
        String phrase3 = wordListOne[rand3];

        //print out the haiku
        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase3);

    }
}