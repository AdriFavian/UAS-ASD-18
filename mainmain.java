import java.util.Scanner;
public class mainmain {
    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan Transaksi berdasar nama Pemilik"); 
        System.out.println("5. Keluar");
        System.out.print("Pilih(1-5): ");
    } 

    
    public static void main(String[] args)  {
        Queue queue = new Queue(); 
        
        queue.enqueue("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        queue.enqueue("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        queue.enqueue("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        queue.enqueue("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        Scanner sc1 = new Scanner(System.in);
        int pilih;

        do {
            menu();
            pilih = sc1.nextShort();
            switch (pilih) {
                case 1:
                    queue.print();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("cek masukkan menu anda!");
                    break;
            }
        } while (pilih <= 5 && pilih > 0);
        sc1.close();
    }
}
