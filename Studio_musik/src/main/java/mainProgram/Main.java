/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainProgram;

import musik.StudioMusik;
import musik.Lagu;
import musik.User;
import musik.Admin;
import musik.Member;

import java.util.Scanner;

/**
 *
 * @author Cloudy
 */ 
public class Main {
    private static StudioMusik studio1;
    private static StudioMusik studio2;
    private static StudioMusik studioAktif;
    private static User userAktif;

    public static void main(String[] args) {
        studio1 = new StudioMusik("Studio Musik Bintang", "Bandung");
        studio1.tambahDataDefault();
        studio2 = new StudioMusik("Studio Musik Galaxy", "Jakarta");
        studio2.tambahDataDefault();

        Scanner scanner = new Scanner(System.in);
        login(scanner);  // Pindahkan login ke sini

        // Panggil metode untuk memilih studio sebelum melakukan operasi lain
        pilihStudio(scanner);

        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Studio Musik ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Daftar Lagu");
            System.out.println("3. Edit Lagu");
            System.out.println("4. Hapus Lagu");
            System.out.println("5. Ganti Studio");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                tambahLagu(scanner);
            } else if (pilihan == 2) {
                lihatDaftarLagu(); // Pastikan studioAktif telah diinisialisasi
            } else if (pilihan == 3) {
                editLagu(scanner);
            } else if (pilihan == 4) {
                hapusLagu(scanner);
            } else if (pilihan == 5) {
                pilihStudio(scanner);
            } else if (pilihan == 6) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }

        } while (pilihan != 6);
        scanner.close();
    }

    private static void login(Scanner scanner) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Simulasi login
        if (username.equals("admin") && password.equals("admin123")) {
            userAktif = new Admin(username, password);
        } else if (username.equals("member") && password.equals("member123")) {
            userAktif = new Member(username, password);
        } else {
            System.out.println("Username atau password salah!");
            System.exit(0); // Keluar jika login gagal
        }

        userAktif.showRole(); // Tampilkan peran pengguna yang berhasil login
    }

    private static void pilihStudio(Scanner scanner) {
        System.out.println("\n=== Pilih Studio ===");
        System.out.println("1. " + studio1.getNama());
        System.out.println("2. " + studio2.getNama());
        System.out.print("Pilih studio: ");
        int pilihanStudio = scanner.nextInt();
        scanner.nextLine();

        if (pilihanStudio == 1) {
            studioAktif = studio1;
        } else if (pilihanStudio == 2) {
            studioAktif = studio2;
        } else {
            System.out.println("Pilihan tidak valid, default ke Studio 1.");
            studioAktif = studio1;
        }

        System.out.println("Studio yang aktif sekarang: " + studioAktif.getNama());
    }

    private static void tambahLagu(Scanner scanner) {
        System.out.print("Masukkan judul lagu: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan nama artis: ");
        String artis = scanner.nextLine();
        System.out.print("Masukkan genre lagu: ");
        String genre = scanner.nextLine();
        System.out.print("Masukkan durasi lagu (dalam menit): ");
        double durasi = scanner.nextDouble();
        scanner.nextLine();
        
        Lagu lagu = new Lagu(judul, artis, genre, durasi);
        studioAktif.tambahLagu(lagu);
    }

    private static void lihatDaftarLagu() {
        if (studioAktif == null) {
            System.out.println("Anda belum memilih studio.");
            return;
        }

        System.out.println("\n=== Daftar Lagu di Studio: " + studioAktif.getNama() + " ===");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-30s %-20s %-15s %-10s%n", "Judul", "Artis", "Genre", "Durasi");
        System.out.println("-------------------------------------------------");

        for (Lagu lagu : studioAktif.getDaftarLagu()) {
            System.out.printf("%-30s %-20s %-15s %-10.2f menit%n", 
                              lagu.getJudul(), 
                              lagu.getArtis(), 
                              lagu.getGenre(), 
                              lagu.getDurasi());
        }
        System.out.println("-------------------------------------------------");
    }

    private static void editLagu(Scanner scanner) {
        System.out.print("Masukkan judul lagu yang ingin diedit: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan judul baru: ");
        String judulBaru = scanner.nextLine();
        System.out.print("Masukkan artis baru: ");
        String artisBaru = scanner.nextLine();
        System.out.print("Masukkan genre baru: ");
        String genreBaru = scanner.nextLine();
        System.out.print("Masukkan durasi baru (dalam menit): ");
        double durasiBaru = scanner.nextDouble();
        scanner.nextLine();
        
        studioAktif.editLagu(judul, judulBaru, artisBaru, genreBaru, durasiBaru);
    }

    private static void hapusLagu(Scanner scanner) {
        System.out.print("Masukkan judul lagu yang ingin dihapus: ");
        String judul = scanner.nextLine();
        studioAktif.hapusLagu(judul);
    }
}