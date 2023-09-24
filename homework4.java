import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
