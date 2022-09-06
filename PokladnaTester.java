package uloha4_pokladna;

import java.util.Locale;
import java.util.Scanner;

public class PokladnaTester {
    public static void main(String[] args) {
        Pokladna pokladna = new Pokladna();
        Scanner vstup = new Scanner(System.in);
        vstup.useLocale(Locale.ENGLISH);

        double cenaTovaru = 0;

        do
        {
            System.out.print("Zadaj cenu tovaru: ");
            cenaTovaru = vstup.nextDouble();
            pokladna.naskenujTovar(cenaTovaru);
        }
        while (cenaTovaru != -1);


        pokladna.prijmy1Eurovky(15);
        pokladna.prijmy50Centovky(5);
        pokladna.prijmy20Centovky(8);
        pokladna.prijmy10Centovky(4);
        pokladna.prijmy5Centovky(7);
        pokladna.prijmy2Centovky(2);
        pokladna.prijmy1Centovky(1);

        double vydavok = pokladna.vratVydavok();
        System.out.printf("Vydavok je: %.2f EUR ", vydavok);
        System.out.println("\nPocet tovarov: " + pokladna.getPocetTovarov());


    }
}

