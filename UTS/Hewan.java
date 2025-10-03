package Manage;

abstract class Hewan implements Aktivitas {
    private String nama;
    private String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    public String getNama() {
        return nama;
    }
    public String getJenis() {
        return jenis;
    }

    public abstract void bersuara();
    public void makan() {
        System.out.println(nama + " sedang makan");
    }
    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }
    public void minum() {
        System.out.println(nama + " sedang minum");
    }
}