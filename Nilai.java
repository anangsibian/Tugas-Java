package DemoNilai;

public class Nilai {
	String nim;
    String nama;
    double absen;
    double tugas;
    double uts;
    double uas;
    double nilaiakhir;

    void Nilai(String nim, String nama, double absen, double tugas, double uts, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.nilaiakhir = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);
    }
    void CetakNilai() {
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Absen [10%] : " + absen);
        System.out.println("Nilai Tugas [20%] : " + tugas);
        System.out.println("Nilai UTS   [30%] : " + uts);
        System.out.println("Nilai UAS   [40%] : " + uas);
        System.out.println("Nilai Akhir       : " + nilaiakhir);
    }
}
