public class Queue {
    Kendaraan front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        Kendaraan newKendaraan = new Kendaraan(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
        if (isEmpty()) {
            front = rear = newKendaraan;
        } else {
            rear.next = newKendaraan;
            rear = newKendaraan;
        }
    }

    Kendaraan dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
            return null;
        }
        Kendaraan temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            Kendaraan tmp = front;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan");
            System.out.println("+++++++++++++++++++++++");
            System.out.printf("%-20s %-18 %-10s %-18s %-10s %-18s \n",
            "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
            while (tmp != null) {
            System.out.printf("%-20s %-18 %-10s %-18s %-10s %-18s \n",
                    tmp.noTNKB, tmp.nama, tmp.jenis, tmp.cc, tmp.tahun, tmp.bulanHarusBayar);
            tmp = tmp.next;
            }
        }
    }
}
