public class PrintApp {
    public static void main(String[] args) throws Exception {
        //Alustetaan muuttujat
        String tekija = "Wilma"; //Asetan oman nimeni tähän
        int luku1 = 6; // Aseta arvo
        int luku2 = 18;
        int tulo;
        int erotus;
        int summa;
        double jako;

        // Tulostetaan konsoliin
        System.out.println("Hei olen tulostinohjelma.");
        System.out.print("Ohjelman tekija: ");
        System.out.println(tekija);

        //System.out.println(luku1); Kommentoitu pois
        
        //Tulostetaan konsoliin:"Luku1-muuttujan arvo on 6"
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        //Tulosta konsoliin vielä:"Luku2-muuttujan arvo on 18"
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        //Kerro luku1 ja luku2 ja sijoita tulos tulo-muuttujaan.
        tulo = luku1 * luku2;
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        // Lasketaan ja tulostetaan erotus
        erotus = luku1 - luku2;
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        // Lasketaan ja tulostetaan summa
        summa = luku1 + luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + summa);

        //Lasketaan ja tulostetaan jako
        jako = (double) luku1/luku2;
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
    }
}
