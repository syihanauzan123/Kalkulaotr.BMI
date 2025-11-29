#  🧮Program Kalkulator BMI dengan JOptionPane

## 👤 Identitas
- **Nama:** Muhammad Syihan Auzan
- **Mata Kuliah:** Algoritma dan Pemrograman

---
## 💫 Pseudocode Program Kalkulator BMI 
## judul:
algoritma kalkulator bmi
## deklarasi
**var** bb ,tb ,konversi ,bmi = double
**var** inputBB, inputTB, kategori, hasil = string
## algoritma:
BEGIN

    Mulai
1. Mulai program

2. Tampilkan input dialog untuk meminta berat badan (kg)
    → simpan ke variabel bb
    → ubah bb menjadi angka dan simpan ke berat

3. Tampilkan input dialog untuk meminta tinggi badan (cm)
    → simpan ke variabel tb
    → ubah tb menjadi angka dan simpan ke tinggi

4. Ubah tinggi dari cm ke meter
    → tMeter = tinggi / 100

5. Hitung nilai BMI
    → bmi = berat / (tMeter * tMeter)

6. Pembulatan BMI menjadi 2 angka di belakang koma
    → bmi = (int)(bmi * 100) / 100.0

7. Tentukan kategori BMI

jika BMI < 18.5 → "Kurus"

jika BMI < 25 → "Normal"

jika BMI < 30 → "Gemuk"

selain itu → "Obesitas"

8. Tampilkan hasil perhitungan BMI menggunakan JOptionPane
    → berat badan
    → tinggi badan
    → nilai BMI
    → kategori BMI

9. Selesai

END

---

## 🧠 Deskripsi
Program ini menghitung **Indeks Massa Tubuh (BMI)** berdasarkan **berat badan (kg)** dan **tinggi badan (cm)** menggunakan **JOptionPane** untuk input dan output.  
Langkah program:
1. Pengguna memasukan berat badan dan tinggi badan
2. Program akan mengkonversi terlebih dahulu tinggi badan dari cm ke m
3. program menghitung hasil bmi 
4. Hasil ditampilkan dalam kotak dialog  

---

## 💻 Cuplikan Kode
```java
import javax.swing.JOptionPane;

public class KalkulatorBMI {
    public static void main(String[] args) {

        // input berat badan
        String bb = JOptionPane.showInputDialog("Masukkan berat badan (kg)");
        double berat = Double.parseDouble(bb);

        // input tinggi badna
        String tb = JOptionPane.showInputDialog("Masukkan tinggi badan (cm)");
        double tinggi = Double.parseDouble(tb);

        // uah cm ke meter
        double tMeter = tinggi / 100;

        // perhitungan
        double bmi = berat / (tMeter * tMeter);

        // ..
        bmi = (int)(bmi * 100) / 100.0;

        // kategoru
        String ket = "";
        if (bmi < 18.5) {
            ket = "Kurus";
        } else if (bmi < 25) {
            ket = "Normal";
        } else if (bmi < 30) {
            ket = "Gemuk";
        } else {
            ket = "Obesitas";
        }

        // hasil ny :3
        JOptionPane.showMessageDialog(null,
            "Hasil Perhitungan BMI Anda:\n\n" +
            "Berat Badan : " + berat + " kg\n" +
            "Tinggi Badan: " + tinggi + " cm\n" +
            "Nilai BMI : " + bmi + "\n" +
            "Kategori : " + ket
        );
    }
}



```

---

## 🔍 Hasil Uji Coba

###  🔢 input

![Hasil Program BMI](https://github.com/syihanauzan123/Kalkulaotr.BMI/blob/main/Screenshot%202025-11-29%20223656.png?raw=true)

### 📊 Output

![Screenshot Program](https://github.com/syihanauzan123/Kalkulaotr.BMI/blob/main/Screenshot%202025-11-29%20215813.png?raw=true)

---

## ✅ Kesimpulan
Program berhasil dijalankan dan menampilkan hasil bmi dengan benar.  

---
