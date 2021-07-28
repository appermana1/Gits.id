import java.util.Scanner;

/**
 *
 * @author appermana
 */
public class InputBilangan {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan angka");
        int angka = scanner.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Hello World");
        } else if (angka % 3 == 0) {
            System.out.println("Hello");
        } else if (angka % 5 == 0) {
            System.out.println("World");
        } else {
            System.out.println("Angka tidak habis dibagi 3 maupun 5");
        }

        scanner.close();
    }

}