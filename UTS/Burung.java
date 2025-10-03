package Manage;

class Burung extends Hewan {
    public Burung(String nama) {
        super(nama, "Joni");
    }
    public void bersuara() {
        System.out.println(getNama() + " berkicau: cit cit cuit");
    }
}