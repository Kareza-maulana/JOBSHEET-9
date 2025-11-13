import java.util.Scanner;

public class TUGAS2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("MASUKAN JUMLAH PESANAN= ");
        int jumlah_pesanan = input.nextInt();
        input.nextLine(); // Consume newline left-over
        String[] menu = new String[jumlah_pesanan];
        int[] harga = new int[jumlah_pesanan];
        int total_harga=0;
        for(int i=0; i<jumlah_pesanan; i++){
           System.out.println("--- PESANAN KE-"+(i+1)+" ---");
            menu[i] = input.nextLine();
          
            System.out.print("MASUKAN HARGA SATUAN= ");
            int harga_satuan = input.nextInt();
            input.nextLine(); // Consume newline left-over
           
            harga[i] = harga_satuan;
            total_harga += harga_satuan;

        }
        System.out.println("=== STRUK PESANAN ANDA ===");
        for(int i=0; i<jumlah_pesanan; i++){
            System.out.println("pesanan ke-"+(i+1)+": "+menu[i]);
            System.out.println("  harga: "+harga[i]);
           
        }
         System.out.println("total keseluruhan: "+total_harga);
    }
    
}
