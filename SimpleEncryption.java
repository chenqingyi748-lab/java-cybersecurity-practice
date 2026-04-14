import java.util.Scanner;

public class SimpleEncryption {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入文字: ");
        String text = scanner.nextLine();

        String encrypted = "";

        int i = 0;

        while (i < text.length()) {

            char c = text.charAt(i);
            c = (char)(c + 1);

            encrypted = encrypted + c;

            i++;
        }

        System.out.println("加密結果: " + encrypted);

    }
}