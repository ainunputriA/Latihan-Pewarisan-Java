public class BujurSangkar extends Bentuk {
    private double sisi;

    // Constructor Bujur Sangkar
    public BujurSangkar(double sisi, String warna) {
        super(warna); // Memanggil constructor induk (Bentuk)
        this.sisi = sisi;
    }

    // Getter untuk sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas bujur sangkar
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Method printInfo sesuai instruksi latihan
    @Override
    public void printInfo() {
        System.out.println("BujurSangkar berwarna " + warna + ", luas = " + hitungLuas());
    }
}