import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_detik;
        int jam, menit, detik;

        System.out.print("> Masukkan Waktu dalam Detik: ");
        input_detik = input.nextInt();
        jam = input_detik / 3600;    
        menit = (input_detik % 3600) / 60;
        detik = (input_detik % 3600) % 60;

        System.out.println(input_detik + " Detik <==> " + jam + " Jam: " + menit + " Menit: " + detik + " Detik");
        input.close();
        
    }   
}
