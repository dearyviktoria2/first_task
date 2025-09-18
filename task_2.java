import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример вызова функции с тестовыми данными
        List<String> input = List.of("a", "1", "b", "2", "c", "3");
        separateLettersAndDigits(input);
    }

    public static void separateLettersAndDigits(List<String> inputList) {
        // Создаем два списка для букв и цифр
        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();

        // Проходим по всем элементам входного списка
        for (String s : inputList) {
            // Извлекаем первый символ строки (т.к. строка состоит из 1 символа)
            char c = s.charAt(0);

            if (Character.isLetter(c)) {
                letters.add(s); // Добавляем в список букв
            } else if (Character.isDigit(c)) {
                digits.add(s); // Добавляем в список цифр
            }
        }

        // Выводим результаты на экран
        System.out.println("Буквы: " + letters);
        System.out.println("Цифры: " + digits);
    }
}