package main.java.homework231;

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringInput = (getStringWithoutDoubleSpaces(inputStringFromConsole(scanner))); //Ввод строки с консоли и ее нормализация

        char characterInput = inputCharacterFromConsole(scanner); //Ввод символа с консоли

        String stringOutput = getStringWithSpaceCharacterReplacement(stringInput, characterInput); //Замена символов пробелами
        stringOutput = getStringWithoutDoubleSpaces(stringOutput); //Замена двойных пробелов

        outputString(stringInput, stringOutput); //Вывод строки
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
    public static String getStringWithoutDoubleSpaces(String stringInput) {
        String stringReplacingSpaces = stringInput;

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
    public static void outputString(String stringInput, String stringOutput) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println();

        if (stringInput.equals(stringOutput)) {
            System.out.println("После преобразований строка не изменилась");
        } else {
            stringBuilder.append("Оригинальная строка: ").append(stringInput).append("; изменённая строка: ").append(stringOutput);
            System.out.println(stringBuilder);
        }
    }
}
