public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = 3.14; // Konstanta kelas

    // Constructor Lingkaran
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double r) {
        this.radius = r;
    }

    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return PHI * radius * radius;
    }

    // Method printInfo sesuai instruksi latihan
    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + warna + ", luas = " + hitungLuas());
    }
}