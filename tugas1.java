import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       
         System.out.print("MASUKAN JUMLAH NILAI YANG INGIN DIINPUT= ");
         int jumlah_nilai= input.nextInt();
        int[] NILAI=new int[jumlah_nilai];
        int key=0;
        int hasil_cari=0;
        int NILAI_TERTINGGI=0;
        int NILAI_TERENDAH =100;
        int rata2=0;
        int banyak_nilai= 0;
        int total= 0;

        for(int x=0 ; x<jumlah_nilai ; x++){
            System.out.print("MASUKAN NILAI MAHASISWA KE- "+(x+1)+"= ");
            NILAI[x]=input.nextInt();
            if(NILAI[x]>NILAI_TERTINGGI){
                NILAI_TERTINGGI=NILAI[x];
            }
            if(NILAI[x]<NILAI_TERENDAH){
                NILAI_TERENDAH=NILAI[x];
               
            }
            System.out.println("nilai teretinggi adalah= "+ NILAI_TERTINGGI);
            System.out.println("nilai terendah adalah= "+ NILAI_TERENDAH);
            total+=NILAI[x];
            banyak_nilai++;



        }
        rata2= total/banyak_nilai;
        System.out.println("rata rata nilai mahasiswa adalah "+rata2);

        System.out.println("APAKAH ANDA INGIN MENCARI NILAI MAHASISWA?");
        String cari_nilai= input.next();
         if(cari_nilai.equalsIgnoreCase("ya")){
            System.out.println("MASUKAN NILAI YANG INGIN DICARI");
             int cari=input.nextInt();
  
         for(int i=0 ; i<=NILAI.length;i++){
            key=cari;
            if(key==NILAI[i]){
            hasil_cari=i;
            break;
            }else{System.out.println("NILAI YANG ANDA CARI TIDAK DITEMUKAN");}}
    System.out.println();
    System.out.println("nilai "+key+" ketemu di index ke-"+(hasil_cari+1));
    System.out.println();

     for(int z=0; z<NILAI.length; z++){System.out.println("NILAI MAHASISWa KE - "+(z+1)+" adalah = "+NILAI[z]);}

      System.out.println("RATA RATA NILAI MAHASISWA ADALAH= "+rata2);
      System.out.println("NILAI TERTINGGI ADALAH= "+NILAI_TERTINGGI);
      System.out.println("NILAI TERENDAH ADALAH= "+NILAI_TERENDAH);
        }else{
            for(int k=0; k<NILAI.length;k++){
                System.out.println("NILAI MAHASISWa KE - "+(k+1)+" adalah = "+NILAI[k]);
            }
            System.out.println("RATA RATA NILAI MAHASISWA ADALAH= "+rata2);
            System.out.println("NILAI TERTINGGI ADALAH= "+NILAI_TERTINGGI);
            System.out.println("NILAI TERENDAH ADALAH= "+NILAI_TERENDAH);
        }
       
    }
}


