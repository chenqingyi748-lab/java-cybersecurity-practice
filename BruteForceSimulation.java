public class BruteForceSimulation {

    public static void main(String[] args) {

        String password = "123";

        int guess = 0;

        while (guess <= 999) {

            String attempt = String.valueOf(guess);

            if (attempt.equals(password)) {
                System.out.println("找到密碼: " + attempt);
                break;
            }

            guess++;
        }

    }
}