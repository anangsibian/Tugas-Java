package Matematika;

class Matematika {
    int pertambahan(int a, int b) {
        return a + b;
    }
    int pengurangan(int a, int b) {
        return a - b;
    }
    int perkalian(int a, int b) {
        return a * b;
    }
    int pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return a / b;
    }
}