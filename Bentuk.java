public class Bentuk {
    protected String warna;

    // Constructor untuk menginisialisasi warna
    public Bentuk(String warna) {
        this.warna = warna;
    }

    // Getter untuk mengambil nilai warna
    public String getWarna() {
        return warna;
    }

    // Setter untuk mengubah nilai warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method untuk mencetak informasi bentuk
    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}