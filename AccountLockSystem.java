import java.util.Scanner;

public class AccountLockSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = "1234";
        int attempts = 0;

        while (attempts < 3) {

            System.out.print("輸入密碼: ");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("登入成功");
                return;
            } else {
                attempts++;
                System.out.println("密碼錯誤");
            }

        }

        System.out.println("帳號已鎖定");

    }
}