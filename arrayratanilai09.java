import java.util.Scanner;

public class arrayratanilai09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] nilaimhsw= new int[10];
        double total=0, total_lulus=0,total_tidaklulus=0;
        double rata2,mahasiswa_tidaklulus=0,mahasiswa_lulus=0, rata_rata_lulus,rata_rata_tidaklulus;
        String status;

    for(int i=0; i<nilaimhsw.length;i++){
        System.out.print("masukan nilai mahasiswa ke- "+(i+1)+":");
        nilaimhsw[i]=input.nextInt();
        total+=nilaimhsw[i];
        if (nilaimhsw[i]>70) {
            status = "LULUS!";
            mahasiswa_lulus += nilaimhsw[i];
            System.out.println("status mahasiswa : "+status);
            total_lulus++;
            
        } else {
            status= "TIDAK LULUS!";
            mahasiswa_tidaklulus+= nilaimhsw[i];
            System.out.println("status mahasiswa :"+status);
            total_tidaklulus++;
        }
    }
    rata2=total/nilaimhsw.length;
    rata_rata_lulus= mahasiswa_lulus/total_lulus;
    rata_rata_tidaklulus= mahasiswa_tidaklulus/total_tidaklulus;

    System.out.println("rata-rata nilai mahasiswa = "+rata2);
    System.out.println("rata-rata nilai mahasiswa lulus = "+rata_rata_lulus);
    System.out.println("rata-rata nilai mahasiswa tidak lulus = "+rata_rata_tidaklulus);

  
    }
}
