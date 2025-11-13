
import java.util.Scanner;

public class TUGAS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"Nasi Goreng","Mie Goreng","Ayam Bakar","Sate Ayam",
                        "Gado-Gado","Bakso","Soto Ayam","Rendang","Nasi Uduk","Pecel Lele"};
        System.out.print("MASUKAN NAMA MENU YANG INGIN ANDA PESAN : ");
        String pesanan = scanner.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (pesanan.equalsIgnoreCase(menu[i])) {
                System.out.println("ANDA MEMESAN " + menu[i]);

                 System.out.println("TERIMA KASIH TELAH MEMESAN DI TEMPAT KAMI");
            break;
           
            }            if (i == menu.length - 1) {
                System.out.println("MAAF MENU YANG ANDA PESAN TIDAK TERSEDIA");
            }
        }

    }
    
}
