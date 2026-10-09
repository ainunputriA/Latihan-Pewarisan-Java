public class Silinder extends Lingkaran {
    private double tinggi;

    // Constructor Silinder
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna); // Memanggil constructor Lingkaran
        this.tinggi = tinggi;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Setter untuk tinggi
    public void setTinggi(double t) {
        this.tinggi = t;
    }

    // Method untuk menghitung volume silinder (Luas Alas * Tinggi)
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    // Method printInfo sesuai instruksi latihan
    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + warna + ", volume = " + hitungVolume());
    }
}