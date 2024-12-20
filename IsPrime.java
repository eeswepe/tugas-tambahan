import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        boolean isPrime = true;

        System.out.print("> Masukkan bilangan: ");
        bilangan = input.nextInt();

        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(bilangan + " merupakan bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }

        input.close();

    }
}
