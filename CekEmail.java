import java.util.Scanner;

/**
 *
 * @author appermana
 */
public class CekEmail {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan email");
        String email = scanner.nextLine();

        String emailPattern = "[a-zA-Z0-9._-]{1,20}+@[a-z]+\\.+[id]+";
        String emailPattern2 = "[a-zA-Z0-9._-]{1,20}+@[a-z]+\\.+[co]+\\.+[id]+";

        if (email.matches(emailPattern)) {
            System.out.println("true");
        } else if (email.matches(emailPattern2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
