public class Queue {
    // Penyimpanan data
    String[] data = new String[100];

    // Menghitung jumlah data yang ada di dalam Queue
    int Jumlah_Data = 0;

    // ---- Method (Fitur - Fitur) ----

    // Fitur 1_Menambah Queue di paling belakang (Enqueue)
    // Cara kerja: menyimpan data baru di data terakhir
    void enqueue(String Data_Baru) {
        if (Jumlah_Data < 100) {
            data[Jumlah_Data] = Data_Baru;
            Jumlah_Data++;
            System.out.println("Enqueue: '" + Data_Baru + "' masuk ke Queue.");
        } else {
            System.out.println("Queue penuh!");
        }
    }

    // Fitur 2_Menghapus data paling depan (Dequeue)
    // Cara kerja: Ambil data index 0, lalu geser semua data sisanya ke kiri
    String dequeue() {
        if (isEmpty()) {
            System.out.println("Gagal Dequeue: Queue kosong!");
            return null;
        }

        // Simpan data paling depan (index 0)
        String dataKeluar = data[0];

        // Geser semua data ke depan (kiri) untuk mengisi kekosongan index 0
        for (int i = 0; i < Jumlah_Data - 1; i++) {
            data[i] = data[i + 1];
        }

        Jumlah_Data--; // Kurangi jumlah total data
        System.out.println("Dequeue: '" + dataKeluar + "' telah dilayani & keluar Queue.");
        return dataKeluar;
    }

    // Fitur 3_Melihat data yang paling depan saja (Peek / Front)
    // Cara kerja: Menampilkan data pada index 0
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            System.out.println("Data paling depan (Front): " + data[0]);
        }
    }

    // Fitur 4_Cek apakah Queue kosong (isEmpty)
    // Cara kerja: true jika Jumlah_Data == 0, false jika ada data
    boolean isEmpty() {
        return (Jumlah_Data == 0);
    }

    // Fitur 5_Menampilkan isi queue
    // Cara kerja: Menampilkan dari data yang paling depan (index 0) ke belakang
    void tampilkan_isi_queue() {
        System.out.println("--- Isi Queue ---");
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }

        for (int i = 0; i < Jumlah_Data; i++) {
            System.out.print("" + data[i] + "");
            if (i < Jumlah_Data - 1) System.out.print(" <--- ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Queue Queue = new Queue();


        // Mengisi Queue
        System.out.println("--- Enqueue ---");
        Queue.enqueue("Alvaro");
        Queue.enqueue("Keanu");
        Queue.enqueue("Zayn");
        Queue.enqueue("Rafathar");
        Queue.enqueue("Athar");
        Queue.enqueue("Alesha");
        Queue.enqueue("Kayla");
        Queue.enqueue("Nayla");
        Queue.enqueue("Zara");
        Queue.enqueue("Naura");
        Queue.tampilkan_isi_queue();


        // Melihat siapa yang didepan (peek)
        System.out.println("--- Peek ---");
        Queue.peek();
        System.out.println();


        // Melayani Queue (Dequeue)
        System.out.println("--- Dequeue ---");
        Queue.dequeue();
        Queue.tampilkan_isi_queue();


        // Meliaht isi Queue setelah Dequeue
        Queue.tampilkan_isi_queue();
            

        // Cek status
        System.out.println("Apakah Queue kosong? " + Queue.isEmpty());
    }
}