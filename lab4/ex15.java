package AJD.lab4;

import java.util.Arrays;
import java.util.Comparator;

class Pracownik {
    private String nazwisko;
    private double wynagrodzenie;

    public Pracownik(String nazwisko, double wynagrodzenie) {
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "nazwisko='" + nazwisko + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                '}';
    }
}

public class ex15 {
    public static void main(String[] args) {
        Pracownik[] pracownicy = {
                new Pracownik("Kowalski", 3000),
                new Pracownik("Nowak", 4000),
                new Pracownik("Kowalski", 4000),
                new Pracownik("Wiśniewski", 3000)
        };

        // Sortowanie według wynagrodzenia, a następnie według nazwiska
        Arrays.sort(pracownicy, Comparator.comparingDouble(Pracownik::getWynagrodzenie)
                .thenComparing(Pracownik::getNazwisko));

        System.out.println("Sortowanie rosnące:");
        for (Pracownik p : pracownicy) {
            System.out.println(p);
        }

        // Sortowanie w odwrotnej kolejności
        Arrays.sort(pracownicy, Comparator.comparingDouble(Pracownik::getWynagrodzenie).reversed()
                .thenComparing(Comparator.comparing(Pracownik::getNazwisko).reversed()));

        System.out.println("\nSortowanie malejące:");
        for (Pracownik p : pracownicy) {
            System.out.println(p);
        }
    }
}
