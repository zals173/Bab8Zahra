package bab.pkg8;

import javax.swing.JOptionPane;

public class Bab8 {

    public static void main(String[] args) {

        // For Loop Sederhana
        for (int a = 0; a < 10; a++) {
            System.out.println("Halo Dunia");
        }

        System.out.println();

        // For Loop Bilangan Genap
        for (int a = 2; a < 12; a += 2) {
            System.out.println("Bilangan Genap : " + a);
        }

        System.out.println();

        // Segitiga Bintang
        int baris = 5;
        for (int i = 0; i <= baris; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Input Jumlah Kelas dengan Validasi agar tidak 0/kosong
        int jumlahKelas = 0;
        while (jumlahKelas <= 0) {
            String input = JOptionPane.showInputDialog(null, "Masukkan jumlah kelas (minimal 1):", "Input", JOptionPane.INFORMATION_MESSAGE);
            if (input != null && !input.isEmpty()) {
                try {
                    jumlahKelas = Integer.parseInt(input);
                    if (jumlahKelas <= 0) {
                        JOptionPane.showMessageDialog(null, "Jumlah kelas harus lebih dari 0.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid.");
                }
            }
        }

        String isiKelas[][] = new String[jumlahKelas][];
        for (int kelas = 0; kelas < jumlahKelas; kelas++) {
            String namaKelas = JOptionPane.showInputDialog(null, "Nama Kelas:", "Masukan Nama Kelas", JOptionPane.INFORMATION_MESSAGE);
            int jumlahKursi = 0;
            while (jumlahKursi <= 0) {
                String inputKursi = JOptionPane.showInputDialog(null, "Jumlah murid masing - masing kelas :", "Input", JOptionPane.INFORMATION_MESSAGE);
                if (inputKursi != null && !inputKursi.isEmpty()) {
                    try {
                        jumlahKursi = Integer.parseInt(inputKursi);
                        if (jumlahKursi <= 0) {
                            JOptionPane.showMessageDialog(null, "Jumlah murid harus lebih dari 0.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Masukkan angka yang valid.");
                    }
                }
            }

            isiKelas[kelas] = new String[jumlahKursi];
            System.out.println("Kelas " + namaKelas + " : ");
            for (int kursi = 0; kursi < jumlahKursi; kursi++) {
                String namaSiswa = JOptionPane.showInputDialog(null, "Nama Siswa", "Kelas " + namaKelas, JOptionPane.INFORMATION_MESSAGE);
                isiKelas[kelas][kursi] = namaSiswa;
                System.out.println("Nama Siswa " + isiKelas[kelas][kursi]);
            }
            System.out.println("----------------------------------------");
        }

        // While Loop Pencarian Angka dalam Array
        int arr[] = {2, 5, 7, 1};
        boolean hasil = true;
        while (hasil) {
            String input = JOptionPane.showInputDialog(null, "Masukkan bilangan bulat :");
            if (input == null || input.isEmpty()) {
                continue;
            }
            int cekInputan;
            try {
                cekInputan = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan angka yang valid.");
                continue;
            }

            hasil = true;
            for (int a = 0; a < arr.length; a++) {
                if (cekInputan == arr[a]) {
                    hasil = false;
                    break;
                }
            }
            if (hasil) {
                JOptionPane.showMessageDialog(null, "Angka " + cekInputan + " tidak ada di dalam array.");
            } else {
                JOptionPane.showMessageDialog(null, "Angka " + cekInputan + " ada di dalam array.");
            }
        }

        // Do While Loop Perkalian Sederhana
        String input;
        int cekbil = 0;
        do {
            input = JOptionPane.showInputDialog(null, "4 x 3 = ?");
            if (input != null && !input.isEmpty()) {
                try {
                    cekbil = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid.");
                }
            }
        } while (cekbil != 12);

        JOptionPane.showMessageDialog(null, "Jawaban Benar!");
    }
}