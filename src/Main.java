import com.sun.tools.attach.AgentInitializationException;

import javax.imageio.ImageTranscoder;
import java.awt.*;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    // 1. Функция для нахождения максимума
    public static int MaxNumber(int a, int b)  {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны. ");
        }
        return Math.max(a, b);
    }
    // 2. Калькулятор деления 12. Проверка делимости
    public static double DivisionNumbers(double numerator, double denominator) {
        if (denominator == 0) throw new ArithmeticException("Делитель не может быть равным нулю.");
        return numerator/denominator;
    }
    // 3. Конвертер строк в числа
    public static int StringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Невозможно конвертировать строку в целое число.");
        }
    }
    // 4. Проверка возраста
    public static int AgeVerification(int age) {
        if (age > 150 || age < 0 ) throw new IllegalArgumentException("Не существующий возраст.");
        return age;
    }
    // 5. Нахождение корня 18. Квадратный корень
    public static double Sqrt(int number) {
        if (number < 0) throw new IllegalArgumentException("Число отрицательное.");
        return Math.sqrt(number);
    }
    // 6. Факториал
    public static int Factorial(int number) {
        if (number < 0) throw new IllegalArgumentException("Число отрицательное.");
        int sum = 1;
        for (int i = 1; i <= number; i++)
        {
            sum *= i;
        }
        return sum;
    }
    // 7. Проверка массива на нули
    public static boolean CheckArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

                throw new IllegalArgumentException("В массиве имеется 0.");
            }
        }
        return true;
    }
    // 8. Калькулятор возведения в степень
    public static double Exponentiation(double number, double exponent) {
        if (exponent < 0) throw new IllegalArgumentException("Степень не может быть отрицательной.");
        return Math.pow(number, exponent);
    }
    // 9. Обрезка строки
    public static String CutString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки.");
        }
        return str.substring(0, length);
    }
    // 10. Поиск элемента в массиве
    public static int SearchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new NoSuchElementException("Число не найдено в массиве.");
    }
    // 11. Конвертация в двоичную систему
    public static String convertToBinary(int number) {
        if (number < 0) throw new IllegalArgumentException("Отрицательные числа не могут быть конвертированы в двоичную строку.");
        return Integer.toBinaryString(number);
    }
    // 13. Чтение элемента списка
    public static <T> T getElementByIndex(List<T> list, int index) {
        if (index < 0 || index >+ list.size()) throw new IndexOutOfBoundsException("Индекс выходит за границы массива.");
        return list.get(index);
    }
    // 14. Парольная проверка
    public static void checkPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль должен содержать не менее 8 символов.");
        }
        System.out.println("Пароль достаточно сильный.");
    }
    // 15. Проверка даты
    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException ex) {
            throw ex;
        }
    }
    // 16. Конкатенация строк
    public static String concatenationVerification(String str1, String str2) {
        if (str1 == null || str2 == null) throw new NullPointerException("Конкатенация строк невозможна");
        return str1 + str2;
    }
    // 17. Остаток от деления
    public static double RemainedDivision( double numerator,double denominator) {
        if (denominator == 0) throw new ArithmeticException("Делитель не может быть равным нулю.");
        return numerator%denominator;
    }
    // 19. Конвертер температуры
    public static double temperatureСonverter(double Temperature) {
        if (Temperature < -273.15) throw new IllegalArgumentException("Температура меньше абсолютного нуля");
        return Temperature * 9/5 + 32;
    }
    // 20. Проверка строки на пустоту
    public static String stringVerification(String str1, String str2) {
        if (str1 == null || str2 == null || str1 == "" || str2 == "") throw new NullPointerException("Конкатенация строк невозможна");
        return str1 + str2;
    }

    public static void main(String[] args) {
        // 1. Функция для нахождения максимума
//         System.out.println(MaxNumber(1, 1));
        // 2. Калькулятор деления
//        System.out.println(DivisionNumbers(1.0, 0));
        // 3. Конвертер строк в числа
//        System.out.println(StringToInt("a"));
        // 4. Проверка возраста
//        System.out.println(AgeVerification(999));
        // 5. Нахождение корня 18. Квадратный корень
//        System.out.println(Sqrt(-1));
        // 6. Факториал
//        System.out.println(Factorial(-1));
        // 7. Проверка массива на нули
//        int[] numbers = {1, 2, 3, 4, 0};
//        System.out.println(CheckArray(numbers));
        // 8. Калькулятор возведения в степень
//        System.out.println(Exponentiation(2, 3));
        // 9. Обрезка строки
//        System.out.println(CutString("123456", 5));
        // 10. Поиск элемента в массиве
//        int[] numbers = {1, 2, 3, 4, 0};
//        System.out.println(SearchElement(numbers, 6));
        // 11. Конвертация в двоичную систему
//        System.out.println(convertToBinary(-1));
        // 13. Чтение элемента списка
//        List<Integer> Numbers = List.of(1, 2, 3);
//        System.out.println(getElementByIndex(Numbers, 4));
        // 14. Парольная проверка
//        try {
//            checkPassword("1234567"); // Исключение
//        } catch (WeakPasswordException e) {
//            System.out.println(e.getMessage());
//        }
        // 15. Проверка даты
//        System.out.println(isValidDate("01.01.2000"));
        // 16. Конкатенация строк
//        System.out.println(concatenationVerification(null, "asd"));
        // 17. Остаток от деления
//        System.out.println(RemainedDivision(1, 0));
        // 19. Конвертер температуры
//        System.out.println(temperatureСonverter(0));
        // 20. Проверка строки на пустоту
//        System.out.println(stringVerification("", "2"));

    }
}