package uloha4_pokladna;

/**
 * trieda Pokladna obsahuje ceny nacitanych tovarov a prijatu hotovost
 */
public class Pokladna {

    private double cenaVsetkychNacitanychTovarov;
    private double celkovaPrijataHotovost;
    private int pocetTovarov;

    /**
     * vytvara novu pokladnu
     */
    public Pokladna() {
        vynuluj();
    }

    /**
     * vynuluje nacitane tovary a prijatu hotovost
     */
    private void vynuluj() {
        cenaVsetkychNacitanychTovarov = 0;
        celkovaPrijataHotovost = 0;

    }

    /**
     * nacita cenu tovaru a navysi pocet tovarov o jeden
     *
     * @param cenaTovaru
     */
    public void naskenujTovar(double cenaTovaru) {
        pocetTovarov++;
        cenaVsetkychNacitanychTovarov += cenaTovaru;

    }

    /**
     * vrati pocet tovarov
     *
     * @return pocet tovarov
     */
    public int getPocetTovarov() {
        return pocetTovarov - 1;
    }

    /**
     * nacita pocet 1Eur
     *
     * @param pocet1Eur pocet 1Eur minci, ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy1Eurovky(int pocet1Eur) {
        final double hodnota1EurMince = 1.0;
        celkovaPrijataHotovost += (pocet1Eur * hodnota1EurMince);
    }

    /**
     * nacita po 50cent minci
     *
     * @param pocet50Centoviek pocet 50cent minci, ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy50Centovky(int pocet50Centoviek) {
        final double hodnota50CentMince = 0.50;
        celkovaPrijataHotovost += (pocet50Centoviek * hodnota50CentMince);
    }

    /**
     * nacita pocet 20cent minci
     *
     * @param pocet20Centoviek pocet 20cent minci, ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy20Centovky(int pocet20Centoviek) {
        final double hodnota20CentMince = 0.2;
        celkovaPrijataHotovost += (pocet20Centoviek * hodnota20CentMince);
    }

    /**
     * nacita pocet 10cent minci
     *
     * @param pocet10Centoviek pocet 10cent minci, ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy10Centovky(int pocet10Centoviek) {
        final double hodnota10Centovky = 0.1;
        celkovaPrijataHotovost += (pocet10Centoviek * hodnota10Centovky);
    }

    /**
     * nacita pocet 5cent minci
     *
     * @param pocet5Centoviek pocet 5cent minci,ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy5Centovky(int pocet5Centoviek) {
        final double hodnota5Centovky = 0.05;
        celkovaPrijataHotovost += (pocet5Centoviek * hodnota5Centovky);
    }

    /**
     * nacita pocet 2cent minci
     *
     * @param pocet2Centoviek pocet 2cen minci, ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy2Centovky(int pocet2Centoviek) {
        final double hodnota2Centovky = 0.02;
        celkovaPrijataHotovost += (pocet2Centoviek * hodnota2Centovky);
    }

    /**
     * nacita pocet 1cent minci
     *
     * @param pocet1Centoviek pocet 1cent minci, ktorych hodnota sa pripocita k prijatej hotovosti
     */
    public void prijmy1Centovky(int pocet1Centoviek) {
        final double hodnota1Centovky = 0.01;
        celkovaPrijataHotovost += (pocet1Centoviek * hodnota1Centovky);
    }

    /**
     * vracia vydavok z pokladne
     *
     * @return vydavok
     */
    public double vratVydavok() {
        double vydavok = celkovaPrijataHotovost - cenaVsetkychNacitanychTovarov;
        vynuluj();
        return vydavok;
    }
}

