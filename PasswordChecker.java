import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入密碼: ");
        String password = scanner.nextLine();

        if (password.length() >= 8) {
            System.out.println("密碼安全");
        } else {
            System.out.println("密碼太短");
        }

    }
}