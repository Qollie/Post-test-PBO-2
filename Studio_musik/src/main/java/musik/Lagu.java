/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musik;

/**
 *
 * @author Cloudy
 */
public class Lagu {
    private String judul;
    private String artis;
    private String genre;
    private double durasi;

    public Lagu(String judul, String artis, String genre, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.genre = genre;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    @Override
    public String toString() {
        return "Lagu{" +
                "Judul='" + judul + '\'' +
                ", Artis='" + artis + '\'' +
                ", Genre='" + genre + '\'' +
                ", Durasi=" + durasi + " menit" +
                '}';
    }
}