# 📐 Simulasi Pewarisan & Geometri (PBO Java)

Proyek Java sederhana berbasis **Pemrograman Berorientasi Objek (PBO / OOP)** untuk mendemonstrasikan konsep Pewarisan (*Inheritance*), penggunaan *keyword* `super`, dan *Method Overriding* melalui simulasi bentuk-bentuk geometri.

---

## 📂 Struktur Proyek

Proyek ini terdiri dari beberapa kelas yang saling terhubung dalam hierarki pewarisan:

1. **`Bentuk.java`** — *Superclass* dasar yang menyimpan atribut `warna` dan method `printInfo()`.
2. **`BujurSangkar.java`** — *Subclass* dari `Bentuk` untuk menghitung luas bujur sangkar.
3. **`Lingkaran.java`** — *Subclass* dari `Bentuk` untuk menghitung luas lingkaran menggunakan konstanta $\phi$.
4. **`Silinder.java`** — *Subclass* turunan bertingkat dari `Lingkaran` untuk menghitung volume silinder/tabung.
5. **`Main.java`** — Kelas pengeksekusi (`main method`) untuk menguji seluruh kelas geometri dan menampilkan hasilnya ke konsol.

---

## ⚙️ Fitur Utama

- **Pewarisan (*Inheritance*):** Membangun hierarki kelas dari `Bentuk` hingga turunannya (`Lingkaran` dan `Silinder`).
- **Keyword `super`:** Memanggil *constructor* dan mewarisi properti dari kelas induk.
- **Method Overriding:** Menyesuaikan implementasi method `printInfo()` di setiap kelas turunan.
- **Kalkulasi Geometri Otomatis:**
  - Luas Bujur Sangkar: $$L = s^2$$
  - Luas Lingkaran: $$L = \phi \times r^2$$
  - Volume Silinder: $$V = \text{Luas Alas} \times \text{tinggi}$$

---

## 🚀 Cara Menjalankan Program

Ikuti langkah-langkah berikut untuk menjalankan program melalui terminal atau *command prompt*:

1. **Pastikan Java Development Kit (JDK)** sudah terinstal di komputer Anda.
2. Simpan kelima file kode sumber (`Bentuk.java`, `BujurSangkar.java`, `Lingkaran.java`, `Silinder.java`, dan `Main.java`) ke dalam satu folder yang sama.
3. Buka terminal atau *command prompt*, lalu arahkan direktori ke folder tempat file disimpan.
4. Kompilasi file Java dengan perintah:
   ```bash
   javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java Main.java
   ```
5. Jalankan program dengan perintah:
   ```bash
   java Main
   ```

---

## 📊 Contoh Output Program

Saat program dijalankan, terminal akan menampilkan hasil berikut:

```text
==================================================
     PROGRAM DEMO PEWARISAN & GEOMETRI JAVA       
==================================================

--- [1] Uji Coba Kelas Bentuk ---
Bentuk berwarna Biru

--- [2] Uji Coba Kelas BujurSangkar ---
BujurSangkar berwarna Merah, luas = 25.0

--- [3] Uji Coba Kelas Lingkaran ---
Lingkaran Hijau, luas = 153.86

--- [4] Uji Coba Kelas Silinder ---
Silinder warna Kuning, volume = 1538.6

==================================================
```
