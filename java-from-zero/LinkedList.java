public class LinkedList {
    // Node adalah "gerbong" yang menyimpan data dan pointer ke gerbong selanjutnya
    class Node {
        String data;    // Isi datanya
        Node next;      // Pointer ke gerbong selanjutnya

    // Constructor untuk membuat gerbong baru
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Penanda gerbong paling pertama (head)
    Node head = null;

    // ---- Method (Fitur - ) ----

    // Fitur 1_Menambahkan data di akhir
    void tambah_akhir(String data_baru) {
        Node nodeBaru = new Node(data_baru);

        if (head == null) {
            head = nodeBaru; // Kalau masih kosong, dia jadi yang pertama
        } else {
            Node bantu = head;
            // Jalan sampai ketemu gerbong paling ujung
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu.next = nodeBaru; // Sambungkan di paling ujung
        }
        System.out.println("Node '" + data_baru + "' ditambahkan di akhir.");
    }

    // Fitur 2_Menambahkan data di awal
    void tambah_awal(String data_baru) {
        Node nodeBaru = new Node(data_baru);
        nodeBaru.next = head; // Node baru memegang head yang lama
        head = nodeBaru;      // Head sekarang pindah ke node baru
        System.out.println("Node '" + data_baru + "' ditambahkan di awal.");
    }

    // Fitur 3_Menampilkan isi LinkedList
    void tampilkan_semua() {
        System.out.println("--- Isi Linked List ---");
        if (head == null) {
            System.out.println("(list masih kosong)");
            return;
        }

        Node bantu = head;
        while (bantu != null) {
            System.out.print("[" + bantu.data + "] -> ");
            bantu = bantu.next;
        }
        System.out.println("null\n");
    }

    // Fitur 4_Mencari data
    void cari_data(String yang_dicari) {
        Node bantu = head;
        int posisi = 0;
        boolean ketemu = false;

        while (bantu != null) {
            if (bantu.data.equalsIgnoreCase(yang_dicari)) { // equalsIgnoreCase = untuk membandingkan string tanpa case-sensitive
                System.out.println("Data '" + yang_dicari + "' ditemukan di posisi ke-" + posisi);
                ketemu = true;
                break;
            }
            bantu = bantu.next;
            posisi++;
        }

        if (!ketemu) {
            System.out.println("Data '" + yang_dicari + "' tidak ditemukan.");
        }
    }

    // Fitur 5_Menghapus node berdasarkan isi datanya
    void hapus_node(String data_hapus) {
        if (head == null) return;

        // Jika yang dihapus adalah gerbong pertama (head)
        if (head.data.equalsIgnoreCase(data_hapus)) {
            head = head.next;
            System.out.println("Node '" + data_hapus + "' berhasil dihapus.");
            return;
        }

        Node bantu = head;
        // Cari gerbong sebelum gerbong yang mau dihapus
        while (bantu.next != null && !bantu.next.data.equalsIgnoreCase(data_hapus)) {
            bantu = bantu.next;
        }

        // Jika ketemu
        if (bantu.next != null) {
            bantu.next = bantu.next.next; // "Lompati" gerbong yang dihapus
            System.out.println("Node '" + data_hapus + "' berhasil dihapus.");
        } else {
            System.out.println("Node '" + data_hapus + "' tidak ditemukan, gagal hapus.");
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Menambahkan beberapa data ke LinkedList
        System.out.println("--- Tambah Node ---");
        list.tambah_akhir("APT");
        list.tambah_akhir("Die With A Smile");
        list.tambah_awal("Luther"); 
        list.tambah_awal("Ordinary"); 
        list.tambah_awal("Not Like Us"); 
        list.tambah_akhir("Birds of a Feather"); 
        list.tambah_awal("Daisies"); 
        list.tambah_awal("Golden"); 
        list.tambah_akhir("DtMF"); 
        list.tambah_awal("The Fate of Ophelia"); 

        list.tampilkan_semua();

        // Mencari data
        System.out.println("--- Cari Data ---");
        list.cari_data("Birds of a Feather");
        list.cari_data("Golden");
        System.out.println();

        // Menghapus node berdasarkan isi datanya
        System.out.println("--- Hapus Node ---");
        list.hapus_node("Ordinary");
        
        // Meliaht isi Queue setelah hapus node
        list.tampilkan_semua();
    }
}