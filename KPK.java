import java.util.Scanner;

public class KPK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b, hasil;

        System.out.print("> Masukkan bilangan pertama: ");
        a = input.nextInt();
        System.out.print("> Masukkan bilangan kedua: ");
        b = input.nextInt();

        hasil = a;
        for (int i = a; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                hasil = i;
                break;
            }
        }
        
        System.out.println("KPK dari " + a + " dan " + b + " adalah " + hasil);
        input.close();
        return;
    }
}
