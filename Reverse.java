import java.util.Scanner;

/**
 *
 * @author appermana
 */
public class Reverse {

    public static void main(String[] args) {
        String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan kata");
        String kata = scanner.nextLine();

        for (int i = kata.length() - 1; i >= 0; i--) {
            hasil = hasil + kata.charAt(i);
        }
        System.out.println("Reversed string: \n" + hasil);

        scanner.close();
    }
}
