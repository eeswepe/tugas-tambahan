import java.util.Scanner;

public class RataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int data[][] = new int[5][3];
        double rata[] = new double[3];

        for(int i=0;i<data[0].length;i++){
            for(int j=0;j<data.length;j++){
                System.out.print("> Nilai mata kuliah ke " + (j+1) + " mahasiswa ke-" + (i+1) + " adalah ");
                data[j][i] = input.nextInt();
            }
        }

        for(int i=0;i<data[i].length;i++){
            for(int j=0;j<data.length;j++){
                rata[i] += data[j][i];
            }
            rata[i] /= data.length;
        }

        for(int i=0;i<rata.length;i++){
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i+1) + " adalah " + rata[i]);
        }
        input.close();
    }
}
