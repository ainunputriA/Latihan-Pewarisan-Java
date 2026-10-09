public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PROGRAM DEMO PEWARISAN & GEOMETRI JAVA       ");
        System.out.println("==================================================\n");

        // 1. Pengujian Objek Bentuk (Latihan 1)
        System.out.println("--- [1] Uji Coba Kelas Bentuk ---");
        Bentuk bentukUmum = new Bentuk("Biru");
        bentukUmum.printInfo();
        System.out.println();

        // 2. Pengujian Objek Bujur Sangkar (Latihan 1)
        System.out.println("--- [2] Uji Coba Kelas BujurSangkar ---");
        BujurSangkar kotak = new BujurSangkar(5.0, "Merah");
        kotak.printInfo();
        System.out.println();

        // 3. Pengujian Objek Lingkaran (Latihan 2)
        System.out.println("--- [3] Uji Coba Kelas Lingkaran ---");
        Lingkaran bulat = new Lingkaran(7.0, "Hijau");
        bulat.printInfo();
        System.out.println();

        // 4. Pengujian Objek Silinder (Latihan 3)
        System.out.println("--- [4] Uji Coba Kelas Silinder ---");
        Silinder pipa = new Silinder(10.0, 7.0, "Kuning");
        pipa.printInfo();

        System.out.println("\n==================================================");
    }
}