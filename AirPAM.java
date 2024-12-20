import java.util.Scanner;

public class AirPAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int air, biaya;

        System.out.print("> Masukkan jumlah air (meter kubik): ");
        air = input.nextInt();
        
        if (air <= 50) {
            biaya = air * 1000;
        } else if (air <= 100) {
            biaya = (50 * 1000) + ((air - 50) * 1500);
        } else if (air <= 150) {
            biaya = (50 * 1000) + (50 * 1500) + ((air - 100) * 2000);
        } else {
            biaya = (50 * 1000) + (50 * 1500) + (50 * 2000) + ((air - 150) * 3000);
        }

        System.out.println("biaya air PAM yang harus dibayarkan Rp. " + biaya + ",-");
        input.close();
    }
}
