package zaliczenie.main.zadanie;

/**
 * Created by Bartosz Piatek on 16/06/2018
 */
public class Pracownik {
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getDzial() {
        return dzial;
    }

    public void setDzial(int dzial) {
        this.dzial = dzial;
    }

    public boolean czyPracujeWDziale(Pracownik pracownik, int dzial){
        if(pracownik.getDzial() == dzial){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                ", plec=" + plec +
                ", dzial=" + dzial +
                '}';
    }
}
