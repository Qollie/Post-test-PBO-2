/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musik;
import java.util.ArrayList;

/**
 *
 * @author Cloudy
 */
public class StudioMusik {
    private String nama;
    private String lokasi;
    private ArrayList<Lagu> daftarLagu;

    public StudioMusik(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.daftarLagu = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahLagu(Lagu lagu) {
        daftarLagu.add(lagu);
        System.out.println("Lagu berhasil ditambahkan: " + lagu.getJudul());
    }

    public void hapusLagu(String judul) {
        Lagu laguDihapus = null;
        for (Lagu lagu : daftarLagu) {
            if (lagu.getJudul().equalsIgnoreCase(judul)) {
                laguDihapus = lagu;
                break;
            }
        }
        if (laguDihapus != null) {
            daftarLagu.remove(laguDihapus);
            System.out.println("Lagu berhasil dihapus: " + judul);
        } else {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    public void editLagu(String judul, String judulBaru, String artisBaru, String genreBaru, double durasiBaru) {
        for (Lagu lagu : daftarLagu) {
            if (lagu.getJudul().equalsIgnoreCase(judul)) {
                lagu.setJudul(judulBaru);
                lagu.setArtis(artisBaru);
                lagu.setGenre(genreBaru);
                lagu.setDurasi(durasiBaru);
                System.out.println("Lagu berhasil diubah.");
                return;
            }
        }
        System.out.println("Lagu tidak ditemukan.");
    }

    public ArrayList<Lagu> getDaftarLagu() {
        return daftarLagu;
    }

    public void tambahDataDefault() {
        tambahLagu(new Lagu("Bohemian Rhapsody", "Queen", "Rock", 5.55));
        tambahLagu(new Lagu("Shape of You", "Ed Sheeran", "Pop", 3.54));
        tambahLagu(new Lagu("Someone Like You", "Adele", "Soul", 4.45));
        tambahLagu(new Lagu("Blinding Lights", "The Weeknd", "Pop", 3.20));
        tambahLagu(new Lagu("Stairway to Heaven", "Led Zeppelin", "Rock", 8.02));
        tambahLagu(new Lagu("Hotel California", "Eagles", "Rock", 6.30));
    }
}