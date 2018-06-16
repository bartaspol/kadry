package zaliczenie.main.zadanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Bartosz Piatek on 16/06/2018
 */
public class Kadry {
    private Pracownik[] pracownicy;
    private int zatrudnienie;

    public Kadry() {
        this.pracownicy = new Pracownik[100];
        this.zatrudnienie = 0;
    }

    public void dodajPracownika(Pracownik pracownik){
        if(zatrudnienie >= 100) {
            System.out.println("Nie mozna dodac wiecej pracownikow");
        } else {
            pracownicy[zatrudnienie] = pracownik;
            zatrudnienie++;
            System.out.println("Pracownik dodany poprawnie.");
        }
    }

    public double sredniZarobek(){
        double sum = 0;
        for(int i = 0; i < zatrudnienie;i++) {
            sum += this.pracownicy[i].getPlaca();
        }

        double result = sum / this.zatrudnienie;

        return result;
    }

    public double sredniZarobekDzial(int dzial){
        double sum = 0;
        int counter = 0;
        for(int i = 0; i < zatrudnienie;i++) {
            if(this.pracownicy[i].getDzial() == dzial) {
                sum += this.pracownicy[i].getPlaca();
                counter++;
            }
        }
        double result = sum / counter;

        return result;
    }

    public void pisz(){
        for(int i = 0; i < zatrudnienie; i++) {
            System.out.println(this.pracownicy[i].getImie() + "\t\t" +
                    this.pracownicy[i].getNazwisko() + "\t\t" +
                    this.pracownicy[i].getPlec() + "\t\t" +
                    this.pracownicy[i].getPlaca());
        }
        System.out.println("\nLiczba pracownikow:" + this.zatrudnienie);
        System.out.println("Sredni zarobek w firmie to: " + sredniZarobek());
        System.out.println("Sredni zarobek w firmie w dziale 3: " + sredniZarobekDzial(3));
        System.out.println("Sredni zarobek w firmie w dziale 4: " + sredniZarobekDzial(4));
    }

    public void czytajZPliku(){
        try (Scanner scanner = new Scanner(new File("/Users/bartoszpiatek/Library/Mobile Documents/com~apple~CloudDocs/PROGRAMOWANIE/programowanie_obiektowe/src/pracownicy.txt"))) {
            scanner.useDelimiter(" |\n");
            while(scanner.hasNext()) {
                String imie = scanner.next();
                String nazwisko = scanner.next();
                String placa = scanner.next();
                String plec = scanner.next();
                String dzial = scanner.next();

                double Rplaca = Double.parseDouble(placa);
                char Rplec = plec.charAt(0);
                int Rdzial = Integer.parseInt(dzial);

//                System.out.println(imie + " " + nazwisko + " " + placa + " " + plec + " " + dzial);
                Pracownik pracownik = new Pracownik(imie, nazwisko, Rplaca, Rplec, Rdzial);
                dodajPracownika(pracownik);
//                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

