/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musik;

/**
 *
 * @author Cloudy
 */
public interface CRUD {
    void tambahLagu(Lagu lagu);
    void hapusLagu(String judul);
    void editLagu(String judul, String judulBaru, String artisBaru, String genreBaru, double durasiBaru);
}
