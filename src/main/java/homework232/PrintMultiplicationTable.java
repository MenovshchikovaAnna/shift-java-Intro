package main.java.homework232;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            //Ввод с консоли диапазона значений и шага
            System.out.print("Введите первое число: ");
            int first = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int second = scanner.nextInt();
            System.out.print("Введите шаг: ");
            int step = scanner.nextInt();

            //Проверка корректности введенных с клавиатуры данных
            if (first > second) {
                System.out.print("\nОшибка корректности данных: первое число не должно быть больше второго\n\n");
                continue;
            }
            if (step <= 0) {
                System.out.print("\nОшибка корректности данных: шаг должен быть положительным\n\n");
                continue;
            }
            System.out.println();

            tableRecordToFile(first, second, step); //Функция для записи таблицы в файл

            break;
        } while (true);
    }

    //Функция для вычисления ширины клетки таблицы
    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }

    //Определение длины массива множителей
    public static int getArrayMultipliersLength(int first, int second, int step) {
        int arrayLength = (second - first) / step + 1;
        int lastNumber = first + (arrayLength - 1) * step;

        if (lastNumber == second) {
            return arrayLength;
        } else {
            return arrayLength + 1;
        }
    }

    //Заполнение массива множителей
    public static int[] getMultipliersArray(int first, int second, int step, int arrayLength) {
        int[] array = new int[arrayLength];

        for (int i = first, j = 0; i <= second; i = i + step, j++) {
            array[j] = i;
        }
        if (array[arrayLength - 1] != second) {
            array[arrayLength - 1] = second;
        }
        return array;
    }

    //Запись шапки таблицы в файл
    public static void firstRowRecordToFile(int cellLength, int[] array, PrintWriter printWriter) {
        printWriter.printf("%" + cellLength + "s", " ");

        for (int i = 0; i < array.length; i++) {
            printWriter.printf("%" + cellLength + "d", array[i]);
        }
        printWriter.printf("\n");
    }

    //Запись строк таблицы в файл
    public static void otherRowRecordToFile(int cellLength, int[] array, PrintWriter printWriter) {
        for (int i = 0; i < array.length; i++) {
            printWriter.printf("%" + cellLength + "d", array[i]);
            for (int j = 0; j < array.length; j++) {
                printWriter.printf("%" + cellLength + "d", array[i] * array[j]);
            }
            printWriter.printf("\n");
        }
    }

    //Функция для записи таблицы в файл
    public static void tableRecordToFile(int first, int second, int step) {
        try {
            PrintWriter printWriter = new PrintWriter("MultiplicationTable.txt");

            int numberMax = Math.max(Math.abs(first), Math.abs(second)); //поиск максимального числа по модулю
            int maxNumberSquare = -1 * numberMax * numberMax; //подсчет самого большого возможного результата умножения (с возможным минусом)
            int cellLength = getCellWidth(maxNumberSquare) + 2; //вычисленная ширина клетки + два пробела, чтоб столбики таблицы не сливались

            int arrayMultipliersLength = getArrayMultipliersLength(first, second, step); //Определение длины массива множителей
            int[] arrayMultipliers = getMultipliersArray(first, second, step, arrayMultipliersLength); //Заполнение массива множителей

            firstRowRecordToFile(cellLength, arrayMultipliers, printWriter); //Запись шапки таблицы в файл
            otherRowRecordToFile(cellLength, arrayMultipliers, printWriter); //Запись строк таблицы в файл

            printWriter.close();
            System.out.println("Таблица умножения успешно записана в файл MultiplicationTable.txt");
        } catch (IOException messageErrorCreateFile) {
            System.out.print("\nОшибка при записи в файл: " + messageErrorCreateFile.getMessage() + "\n\n");
        }
    }
}