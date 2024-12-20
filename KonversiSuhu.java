import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius;
        double fahrenheit;

        System.out.print("> Masukkan Suhu dalam Celcius: ");
        celcius = input.nextDouble();
        fahrenheit = (celcius * 1.8) + 32;

        System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");
        input.close();
    }
}