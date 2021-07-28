public class KonversiWaktu {

    public static void main(String[] args) {

        String waktu = "07:17:00 AM";

        int h1 = (int) waktu.charAt(1) - '0';
        int h2 = (int) waktu.charAt(0) - '0';
        int jam = (h2 * 10 + h1 % 10);

        if (waktu.charAt(9) == 'A') {
            if (jam == 12) {
                System.out.print("00");
                for (int i = 2; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            } else {
                for (int i = 0; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            }
        } else {
            if (jam == 12) {
                System.out.print("12");
                for (int i = 2; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            } else {
                jam = jam + 12;
                System.out.print(jam);
                for (int i = 2; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            }
        }
    }

}