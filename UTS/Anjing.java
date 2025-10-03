package Manage;

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Rian");
    }
    public void bersuara() {
        System.out.println(getNama() + " menggonggong: guk guk");
    }
}