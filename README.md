# Dokumentasi MinPro PBO Tema Studio Musik

**Nama**: Muhammad Pidha Iqbal Fadillah  
**NIM**: 2309116033  
**Program Studi**: Sistem Informasi A 2023

## Deskripsi Program
Program Studio Musik ini adalah sebuah program simulasi studio musik yang memungkinkan pengguna untuk melihat daftar lagu, menambahkan lagu baru, menghapus lagu yang ada, serta memperbarui informasi lagu seperti judul, artis, genre, dan durasi. Program ini ditulis dalam bahasa pemrograman Java dengan konsep CRUD (Create, Read, Update, Delete) yang diimplementasikan melalui dua kelas utama dan menggunakan struktur **ArrayList** untuk menyimpan data lagu.

## Fitur
- **Tampilkan Daftar Lagu (Read)**: Menampilkan semua lagu yang tersedia di studio beserta artis, genre, dan durasinya.
- **Tambah Lagu (Create)**: Menambahkan lagu baru ke dalam studio dengan memasukkan judul, artis, genre, dan durasi.
- **Hapus Lagu (Delete)**: Menghapus lagu dari daftar berdasarkan judul lagu yang dimasukkan oleh pengguna.
- **Update Lagu (Update)**: Memperbarui informasi lagu seperti judul, artis, genre, dan durasi berdasarkan judul lagu.

## Class
Program ini memiliki beberapa class yaitu:

### 1. Kelas: `Main`

Kelas utama yang berfungsi sebagai titik awal aplikasi. Menangani login pengguna, pemilihan studio, dan operasi manajemen lagu.

#### Properties
- **studio1**: Objek `StudioMusik` untuk studio pertama.
- **studio2**: Objek `StudioMusik` untuk studio kedua.
- **studioAktif**: Studio yang sedang aktif.
- **userAktif**: Pengguna yang sedang login.

#### Methods
- **main(String[] args)**: Metode utama yang menjalankan aplikasi.
- **login(Scanner scanner)**: Mengelola proses login pengguna.
- **pilihStudio(Scanner scanner)**: Memungkinkan pengguna memilih studio aktif.
- **tambahLagu(Scanner scanner)**: Menambah lagu ke studio aktif.
- **lihatDaftarLagu()**: Menampilkan daftar lagu di studio aktif.
- **editLagu(Scanner scanner)**: Mengedit informasi lagu.
- **hapusLagu(Scanner scanner)**: Menghapus lagu dari studio aktif.

### 2. Kelas: `Lagu`

Kelas yang merepresentasikan lagu dengan informasi seperti judul, artis, genre, dan durasi.

#### Properties
- **judul**: Judul lagu.
- **artis**: Nama artis.
- **genre**: Genre lagu.
- **durasi**: Durasi lagu dalam menit.

#### Constructor
- **Lagu(String judul, String artis, String genre, double durasi)**: Menginisialisasi objek lagu.

#### Methods
- **getJudul(), getArtis(), getGenre(), getDurasi()**: Getter untuk mendapatkan informasi lagu.
- **setJudul(), setArtis(), setGenre(), setDurasi()**: Setter untuk mengubah informasi lagu.
- **toString()**: Mengembalikan representasi string dari objek lagu.

### 3. Kelas: `StudioMusik`

Kelas yang merepresentasikan studio musik dan daftar lagu di dalamnya.

#### Properties
- **nama**: Nama studio.
- **lokasi**: Lokasi studio.
- **daftarLagu**: ArrayList yang menyimpan daftar lagu.

#### Constructor
- **StudioMusik(String nama, String lokasi)**: Menginisialisasi objek studio.

#### Methods
- **getNama()**: Mengembalikan nama studio.
- **tambahLagu(Lagu lagu)**: Menambah lagu ke daftar lagu.
- **hapusLagu(String judul)**: Menghapus lagu berdasarkan judul.
- **editLagu(String judul, String judulBaru, String artisBaru, String genreBaru, double durasiBaru)**: Mengedit lagu yang ada.
- **getDaftarLagu()**: Mengembalikan daftar lagu.
- **tambahDataDefault()**: Menambahkan data lagu default ke studio.

### 4. Interface: `CRUD`

Interface yang mendefinisikan operasi dasar untuk manajemen lagu.

#### Methods
- **tambahLagu(Lagu lagu)**: Menambah lagu.
- **hapusLagu(String judul)**: Menghapus lagu.
- **editLagu(String judul, String judulBaru, String artisBaru, String genreBaru, double durasiBaru)**: Mengedit lagu.

### 5. Kelas: `User`

Kelas abstrak yang merepresentasikan pengguna dalam sistem.

#### Properties
- **username**: Nama pengguna.
- **password**: Kata sandi pengguna.

#### Constructor
- **User(String username, String password)**: Menginisialisasi objek pengguna.

#### Methods
- **getUsername(), getPassword()**: Getter untuk mendapatkan informasi pengguna.
- **showRole()**: Metode abstrak untuk menampilkan peran pengguna.

### 6. Kelas: `Admin`

Kelas final yang merepresentasikan pengguna dengan peran admin.

#### Constructor
- **Admin(String username, String password)**: Menginisialisasi objek admin.

#### Methods
- **showRole()**: Menampilkan peran sebagai admin.

### 7. Kelas: `Member`

Kelas final yang merepresentasikan pengguna dengan peran anggota.

#### Constructor
- **Member(String username, String password)**: Menginisialisasi objek member.

#### Methods
- **showRole()**: Menampilkan peran sebagai member.


## Package
Program ini menggunakan minimal dua package:
1. **musik**: Berisi class yang merepresentasikan entitas lagu dalam program.
2. **mainProgram**: Berisi class yang mengelola logika CRUD untuk studio musik.

## Alur Program  
![image](https://github.com/user-attachments/assets/c5fd454d-d814-4ce1-9ef9-3c1aed6bacbd)  
Pertama tama user akan disuruh login terlebih dahulu dan akan di liatkan role pada akun tersebut

![image](https://github.com/user-attachments/assets/077f1745-2d01-4434-8982-46c41e0ae9c8)  
Setelah login dengan akun yang sesuai user bisa memilih studio musik mana yang mau dilihat atau diakses, semisalkan user
salah memilih studio user bisa mengganti nya dengan opsi "ganti studio"


**Create**

![image](https://github.com/user-attachments/assets/e17cd7b7-40a2-474a-8515-0d75d4254b46)  
Setelah memilih studio, user dapat memilih beberapa opsi dari menu yang telah ditampilkan.
Jika user memilih untuk menambah lagu maka akan diminta inputan untuk judul, nama artis, genre, dan durasi


**Read**

![image](https://github.com/user-attachments/assets/b54427fe-3699-49c4-bcd3-f9ca70668b62)  
Setelah menambahkan lagu, user juga dapat memilih untuk melihat daftar lagu yang sudah ada di studio musik yang sedang diakses. Pada pilihan Lihat Daftar Lagu, sistem akan menampilkan daftar lagu beserta detail seperti judul, artis, genre, dan durasi.


**Update**

![image](https://github.com/user-attachments/assets/55dad8ee-996d-4efd-ab8d-cef92ed9fd8f)  
Fitur berikutnya adalah Edit Lagu, di mana user dapat mengubah informasi dari sebuah lagu yang sudah ada. User akan memilih lagu berdasarkan nomor urut dari daftar lagu yang ditampilkan, dan dapat mengganti judul, artis, genre, dan durasi lagu tersebut.


**Delete**

![image](https://github.com/user-attachments/assets/b0fd5fb0-dad3-43a8-a395-317ac9668e87)  
Fitur Hapus Lagu memungkinkan user untuk menghapus lagu dari daftar. Sama seperti fitur Edit Lagu, user akan memilih nomor lagu yang ingin dihapus dari daftar. Setelah konfirmasi, lagu tersebut akan dihapus dari daftar studio musik.


**Ganti Studio**

![image](https://github.com/user-attachments/assets/16c63f32-1e66-47cb-b2ef-a1914dfc3d26)  
Jika user ingin berpindah ke studio musik lain, mereka dapat menggunakan opsi Ganti Studio. Opsi ini akan membawa user kembali ke menu pemilihan studio, dan user dapat memilih studio lain untuk dikelola tanpa keluar dari aplikasi.


**Exit**

![image](https://github.com/user-attachments/assets/db56cf33-699f-46fb-9ab3-a10fc2f7c347)

Setelah selesai menggunakan sistem, user dapat memilih opsi Keluar untuk mengakhiri program. Program akan ditutup dan semua perubahan akan tersimpan.
