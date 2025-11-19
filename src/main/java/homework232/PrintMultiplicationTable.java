package main.java.homework232;

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

            printTable(first, second, step);

            break;
        } while (true);
    }

    //Функция для вычисления ширины клетки таблицы
    public static int getCellWidth(int number) {
        String data = String.valueOf(number);

        return data.length();
    }

    //Определение длины массива
    public static int getArrayLength(int first, int second, int step) {

        int arrayLength = (second - first) / step + 1;
        int lastNumber = first + (arrayLength - 1) * step;

        if (lastNumber == second) {
            return arrayLength;
        } else {
            return arrayLength + 1;
        }
    }

    //Заполнение массива
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

    //Вывод шапки таблицы, запись чисел в массив
    public static void firstRowPrint(int cellLength, int[] array) {
        System.out.printf("%" + cellLength + "s", " ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%" + cellLength + "d", array[i]);
        }

        System.out.println();
    }

    //Вывод строк таблицы с помощью созданного массива чисел
    public static void otherRowPrint(int cellLength, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%" + cellLength + "d", array[i]);
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%" + cellLength + "d", array[i] * array[j]);
            }
            System.out.println();
        }
    }

    //Функция для печати таблицы
    public static void printTable(int first, int second, int step) {

        int numberMax = Math.max(Math.abs(first), Math.abs(second)); //поиск максимального числа по модулю
        int maxNumberSquare = -1 * numberMax * numberMax; //подсчет самого большого возможного результата умножения (с возможным минусом)
        int cellLength = getCellWidth(maxNumberSquare) + 2; //вычисленная ширина клетки + два пробела, чтоб столбики таблицы не сливались

        int arrayLength = getArrayLength(first, second, step); //Определение длины массива
        int[] array = getMultipliersArray(first, second, step, arrayLength); //Заполнение массива

        firstRowPrint(cellLength, array); //Вывод шапки таблицы, запись чисел в массив
        otherRowPrint(cellLength, array); //Вывод строк таблицы с помощью созданного массива чисел
    }
}