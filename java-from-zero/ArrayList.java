public class ArrayList {
    // Penyimpanan data
    String[] data = new String[100];

    // Menghitung data yang masuk
    int Jumlah_Data = 0;

    // ---- Method (Fitur - Fitur) ----

    // Fitur 1_Menambahkan data
    // Cara kerja: menyimpan data baru di data terakhir
    void tambah(String Data_Baru) {
        if (Jumlah_Data < 100) {
            data[Jumlah_Data] = Data_Baru;
            Jumlah_Data++;                 
            System.out.println("Data '" + Data_Baru + "' berhasil ditambahkan!");
        } else {
            System.out.println("Array penuh!");
        }
    }

    // Fitur 2_Menampilkan seluruh data
    // Cara kerja: Menampilkan semua data dari index 0 sampai terakhir
    void tampilkan_semua() {
        System.out.println("=== Isi List ===");

        // Mengecek list kosong atau tidak
        if (Jumlah_Data == 0) {
            System.out.println("(list masih kosong)");
            return;
        }

        // Kalau tidak kosong, tampilkan semua satu per satu
        for (int i = 0; i < Jumlah_Data; i++) {
            System.out.println("Index " + i + " : " + data[i]);
        }
    }

    // Fitur 3_Mengambil data berdasarkan index
    // Cara kerja: tinggal akses data[index] seperti array biasa
    String ambil(int index) {
        // Cek dulu apakah index yang diminta valid
        if (index < 0 || index >= Jumlah_Data) {
            System.out.println("Index " + index + " tidak ada!");
            return null; // kembalikan null kalau tidak valid
        }

        System.out.println("Data di index " + index + " adalah: " + data[index]);
        return data[index];
    }

    // Fitur 4_Mengubah data pada index tertentu
    // Cara kerja: Mengganti nilai lama di index dengan nilai baru
    void ubah(int index, String Data_Baru) {
        // Cek dulu apakah index yang diminta valid
        if (index < 0 || index >= Jumlah_Data) {
            System.out.println("Index " + index + " tidak ada!");
            return;
        }

        String dataLama = data[index];  // simpan dulu nilai lamanya
        data[index] = Data_Baru;         // ganti dengan nilai baru

        System.out.println("Index " + index + " berhasil diubah dari '" + dataLama + "' menjadi '" + Data_Baru + "'");
    }


    // Fitur 5_Menghapus data
    // Cara kerja: setelah data dihapus, semua data di belakangnya
    //             digeser ke kiri supaya tidak ada index yang kosong
    void hapus(int index) {
        // Cek dulu apakah index yang diminta valid
        if (index < 0 || index >= Jumlah_Data) {
            System.out.println("Index " + index + " tidak ada!");
            return;
        }

        String Hapus_Data = data[index];

        for (int i = index; i < Jumlah_Data - 1; i++) {
            data[i] = data[i + 1]; 
        }

        Jumlah_Data--;

        System.out.println("Data '" + Hapus_Data + "' di index " + index + " berhasil dihapus!");
    }

    // Fitur 6_Menampilkan ukuran list
    // Cara kerja: Menampilkan jumlah data yang saat ini tersimpan
    void tampilkan_ukuran() {
        System.out.println("Jumlah data saat ini: " + Jumlah_Data);
    }

    public static void main(String[] args) {

        // Membuat objek ArrayList
        ArrayList list = new ArrayList();


        // Tambah Data
        System.out.println("--- Tambah Data ---");
        list.tambah("Surakarta");
        list.tambah("Magelang");
        list.tambah("Bandung");
        list.tambah("Surabaya");
        list.tambah("Bekasi");
        list.tambah("Yogyakarta");
        list.tambah("Tangerang");
        list.tambah("Semarang");
        list.tambah("Jakarta");
        list.tambah("Palembang");
        System.out.println(); // print baris kosong


        // Tampilkan Semua Data
        System.out.println("--- Tampilkan Semua Data ---");
        list.tampilkan_semua();
        System.out.println();


        // Menambil Data berdasarkan index
        System.out.println("--- Ambil Data ---");
        list.ambil(0);   // harusnya: Surakarta
        list.ambil(3);   // harusnya: Surabaya
        list.ambil(7);   // harusnya: Semarang
        list.ambil(77);  // index tidak ada, error
        System.out.println();


        // Mengubah Data pada index 
        System.out.println("--- Ubah Data ---");
        list.ubah(2, "Malang"); // ganti Bandung dengan Malang
        list.ubah(6, "Sleman");  // ganti Tangerang dengan Sleman
        list.tampilkan_semua();
        System.out.println();


        // Menghapus Data
        System.out.println("--- Hapus Data ---");
        list.hapus(5);  // hapus Bekasi
        list.hapus(6);  // hapus Sleman
        list.tampilkan_semua();
        System.out.println();


        // Ukuran List
        System.out.println("--- Ukuran List ---");
        list.tampilkan_ukuran();

    }
}