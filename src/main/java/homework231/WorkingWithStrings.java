package main.java.homework231;

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringInputOriginal = inputStringFromConsole(scanner); //Ввод строки с консоли
        String stringOriginalNormalized = getStringWithoutDoubleSpaces(stringInputOriginal); //Замена двойных пробелов

        char characterInput = inputCharacterFromConsole(scanner); //Ввод символа с консоли

        String stringAfterChanged = getStringWithSpaceCharacterReplacement(stringOriginalNormalized, characterInput); //Замена символов пробелами
        String stringFinal = getStringWithoutDoubleSpaces(stringAfterChanged); //Замена двойных пробелов

        outputString(stringOriginalNormalized, stringFinal); //Вывод строки
    }

    //Ввод строки с консоли
    public static String inputStringFromConsole(Scanner scanner) {
        String stringInput;
        do {
            System.out.print("Введите строку: ");
            stringInput = scanner.nextLine();

            //Проверка корректности введенных с клавиатуры данных
            if (stringInput.length() <= 1) {
                System.out.println("Ошибка корректности данных: Строка слишком короткая\n");
                continue;
            }
            break;
        } while (true);

        return stringInput;
    }

    //Замена двойных пробелов
    public static String getStringWithoutDoubleSpaces(String stringInputOriginal) {
        String stringReplacingSpaces = stringInputOriginal;

        while (stringReplacingSpaces.contains("  ")) {
            stringReplacingSpaces = stringReplacingSpaces.replace("  ", " ");
        }

        return stringReplacingSpaces;
    }

    //Ввод символа с консоли
    public static char inputCharacterFromConsole(Scanner scanner) {
        char characterInput;

        do {
            System.out.print("Введите символ, который хотите заменить на пробелы: ");
            characterInput = scanner.nextLine().charAt(0);

            //Проверка корректности введенных с клавиатуры данных
            if (characterInput == ' ') {
                System.out.println("Ошибка корректности данных: пробел нельзя использовать для поиска\n\n");
                continue;
            }
            break;
        } while (true);

        return characterInput;
    }

    //Замена символов пробелами
    public static String getStringWithSpaceCharacterReplacement(String stringInput, char characterInput) {
        return stringInput.replace(characterInput, ' ');
    }

    //Вывод строки
    public static void outputString(String stringOriginalNormalized, String stringFinal) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println();

        if (stringOriginalNormalized.equals(stringFinal)) {
            System.out.println("После преобразований строка не изменилась");
        } else {
            stringBuilder.append("Оригинальная строка: ").append(stringOriginalNormalized).append("; изменённая строка: ").append(stringFinal);
            System.out.println(stringBuilder);
        }
    }
}
