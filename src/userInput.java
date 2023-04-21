import java.util.Scanner;

public class userInput {
    public static int userInputValidation () {
        System.out.println("введите число от 10 до 99 включительно");
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = false;
        int intValue = 0;

        while (validNumber == false) {
            String userInput = scanner.nextLine();
            try {
                intValue = Integer.parseInt(userInput);
                if (intValue > 9 & intValue < 100) {
                    System.out.println("валидное число");
                    validNumber = true;
                } else {
                    System.out.println("введите число в правильном диапазоне от 10 до 99 включительно");
                }
            } catch (NumberFormatException e) {
                System.out.println("введите ЧИСЛО");
            }
        }
        return intValue;
    }
}
