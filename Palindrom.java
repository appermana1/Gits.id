import java.util.Scanner;

/**
 *
 * @author appermana
 */
public class Palindrom {
    public static void main(String[] args) {
        String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan kata");
        String kata = scanner.nextLine();

        for (int i = kata.length() - 1; i >= 0; i--) {
            hasil = hasil + kata.charAt(i);
        }

        if (kata.toLowerCase().equals(hasil.toLowerCase())) {
            System.out.println("Palindrom True");
        } else {
            System.out.println("Palindrom False");
        }

        scanner.close();
    }
}
