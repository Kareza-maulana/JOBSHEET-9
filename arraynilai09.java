import java.util.Scanner;


public class arraynilai09 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] nilai_akhir = new int[10];

        
        for(int i=0; i<10; i++){
            System.out.print("masukan nilai akhir ke "+i+": ");
            nilai_akhir[i]= input.nextInt();
    }for(int i=0; i<10; i++){
        if(nilai_akhir[i]>70){
        System.out.println("mahasiswa ke "+i+"lulus");
    }else{System.out.println("mahasiswa ke "+i+"= tidak lulus");}}
}
}
