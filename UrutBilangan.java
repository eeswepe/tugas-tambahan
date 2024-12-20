import java.util.Scanner;
public class UrutBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("> Masukkan bilangan pertama: ");
        a = input.nextInt();
        System.out.print("> Masukkan bilangan kedua: ");
        b = input.nextInt();
        System.out.print("> Masukkan bilangan ketiga: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("-> Urutan bilangan: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("-> Urutan bilangan: " + a + ", " + c + ", " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("-> Urutan bilangan: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("-> Urutan bilangan: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a > b) {
                System.out.println("-> Urutan bilangan: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("-> Urutan bilangan: " + c + ", " + b + ", " + a);
            }
        }
        input.close();
    }   
}
