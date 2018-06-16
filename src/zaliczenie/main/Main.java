package zaliczenie.main;

import zaliczenie.main.zadanie.Kadry;
import zaliczenie.main.zadanie.Pracownik;

/**
 * Created by Bartosz Piatek on 16/06/2018
 */
public class Main {
    public static void main(String[] args) {
        Kadry kadry = new Kadry();
        kadry.czytajZPliku();

        System.out.println();
        System.out.println();
        kadry.pisz();

    }
}
