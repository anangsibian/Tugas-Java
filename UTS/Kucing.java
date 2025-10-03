package Manage;

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Putri");
    }
    public void bersuara() {
        System.out.println(getNama() + " mengeong: meong");
    }
}