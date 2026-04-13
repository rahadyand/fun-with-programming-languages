public class Stack {
    // Penyimpanan data
    String[] data = new String[100];

    // Menghitung data yang masuk
    int Jumlah_Data = 0;

    // ---- Method (Fitur - Fitur) ----

    // Fitur 1_Menambahkan data (Push)
    // Cara kerja: menyimpan data baru di data paling atas
    void push(String Data_Baru) {
        if (Jumlah_Data < 100) {
            data[Jumlah_Data] = Data_Baru;
            Jumlah_Data++;
            System.out.println("Data '" + Data_Baru + "' berhasil masuk ke stack!");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    // Fitur 2_Mengambil data (Pop)
    // Cara kerja: Mengurangi Jumlah_Data sehingga data terakhir terhapus
    String pop() {
        if (isEmpty()) {
            System.out.println("Gagal Pop: Stack masih kosong!");
            return null;
        }

        // Data yang diambil adalah data pada index terakhir (Jumlah_Data - 1)
        String dataDiambil = data[Jumlah_Data - 1];
        Jumlah_Data--; // Kurangi jumlah data
        
        System.out.println("Data '" + dataDiambil + "' berhasil dikeluarkan (Pop)!");
        return dataDiambil;
    }

    // Fitur 3_Melihat top (Peek)
    // Cara kerja: Menampilkan data pada index terakhir
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada data di atas.");
        } else {
            System.out.println("Data teratas saat ini adalah: " + data[Jumlah_Data - 1]);
        }
    }

    // Fitur 4_Cek apakah stack kosong (isEmpty)
    // Cara kerja: true jika Jumlah_Data == 0, false jika ada data
    boolean isEmpty() {
        return (Jumlah_Data == 0);
    }

    // Fitur 5_Menampilkan isi stack
    // Cara kerja: Menampilkan dari data yang terakhir masuk (paling atas) ke bawah
    void tampilkan_isi_stack() {
        System.out.println("--- Isi Stack ---");

        if (isEmpty()) {
            System.out.println("stack masih kosong");
            return;
        }

        // Looping mundur karena ini adalah stack (LIFO)
        for (int i = Jumlah_Data - 1; i >= 0; i--) {
            System.out.println("Posisi " + i + " : " + data[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Tambah Data (Push)
        System.out.println("--- Push ---");
        stack.push("Kaos");
        stack.push("Kemeja");
        stack.push("Jaket");
        stack.push("Hoodie");
        stack.push("Sweater");
        stack.push("Celana pendek");
        stack.push("Rok");
        stack.push("Dress");
        stack.push("Jas");
        System.out.println();


        // Tampilkan Isi
        stack.tampilkan_isi_stack();
        System.out.println();


        // Melihat top (Peek)
        System.out.println("--- Peek ---");
        stack.peek(); 
        System.out.println();


        // Menghapus top (Pop)
        System.out.println("--- Pop ---");
        stack.pop();
        System.out.println();


        // Tampilkan isi lagi setelah Pop
        stack.tampilkan_isi_stack();
        

        // Cek apakah kosong (isEmpty)
        System.out.println("\nApakah stack kosong? " + stack.isEmpty());
    }
}