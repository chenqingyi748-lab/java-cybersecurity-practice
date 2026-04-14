import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctPassword = "1234";

        System.out.print("請輸入密碼: ");
        String input = scanner.nextLine();

        if (input.equals(correctPassword)) {
            System.out.println("登入成功");
        } else {
            System.out.println("密碼錯誤");
        }

    }
}