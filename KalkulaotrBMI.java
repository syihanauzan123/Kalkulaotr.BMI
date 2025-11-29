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
