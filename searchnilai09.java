import java.util.Scanner;

public class searchnilai09 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       
         System.out.print("MASUKAN JUMLAH NILAI YANG INGIN DIINPUT= ");
         int jumlah_nilai= input.nextInt();
        int[] NILAI=new int[jumlah_nilai];
        int hasil_cari=-1;
        for(int x=0 ; x<jumlah_nilai ; x++){
            System.out.print("MASUKAN NILAI MAHASISWA KE- "+(x+1)+"= ");
            NILAI[x]=input.nextInt();
        }
         System.out.println("MASUKAN NILAI YANG INGIN DICARI");
         int cari=input.nextInt();
        for(int i=0 ; i<=NILAI.length;i++){
            if(cari==NILAI[i]){
            hasil_cari=i;
            break;
            }
        }
        System.out.println();
    if (hasil_cari==-1)System.out.println("nilai "+cari+" ketemu di index ke-"+(hasil_cari+1));
    else System.out.println("tidak kontol");
    System.out.println();
    }
}
