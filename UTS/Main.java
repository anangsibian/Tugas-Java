package Manage;

public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing("Putri");
        Hewan h2 = new Anjing("Rian");
        Hewan h3 = new Burung("Joni");

        h1.makan();
        h1.bersuara();
        h1.tidur();

        System.out.println();

        h2.makan();
        h2.bersuara();
        h2.tidur();

        System.out.println();

        h3.minum();
        h3.bersuara();
        h3.tidur();
    }
}