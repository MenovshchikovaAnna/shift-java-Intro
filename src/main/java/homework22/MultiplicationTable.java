package main.java.homework22;
import java.util.Scanner;


public class MultiplicationTable {
    //Функция для вычисления ширины клетки таблицы
    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }

    //Функция для печати таблицы
    public static void printTable(int FirstNimber, int SecondNumber, int StepNumber) {

        int MaxNumber = Math.max(Math.abs(FirstNimber), Math.abs(SecondNumber)); //поиск максимального числа по модулю
        int MaxNumberSquare = -1 * MaxNumber * MaxNumber; //подсчет самого большого возможного результата умножения (с возможным минусом)
        int lengthCell = getCellWidth(MaxNumberSquare) + 2; //вычисленная ширина клетки + два пробела, чтоб столбики таблицы не сливались

        int LengthMass = 0;

        //Подсчет длины массива р
        for (int i = FirstNimber; i <= SecondNumber; i = i + StepNumber) {
            LengthMass++;
            if ((i+StepNumber > SecondNumber) && (i != SecondNumber)) { //SecondNumber всегда должно присутствовать в таблице
                LengthMass++;
            }
        }
        int MassNumbers[] = new int[LengthMass];

        //Вывод шапки таблицы, запись чисел в массив
        System.out.printf("%" + lengthCell + "s", " "); //Пропуск ячейки в начале таблицы
        for (int i = FirstNimber, j = 0; i <= SecondNumber; i = i + StepNumber, j++) {
            System.out.printf("%" + lengthCell + "d", i); //вывод ряда чисел от FirstNimber до SecondNumber с шагом StepNumber
            MassNumbers[j] = i;
            if ((i+StepNumber > SecondNumber) && (i != SecondNumber)) { //Чтоб SecondNumber присутствовало в таблице
                System.out.printf("%" + lengthCell + "d", SecondNumber);
                MassNumbers[j+1] = SecondNumber;
            }
        }
        System.out.println("");

        //Вывод строк таблицы с помощью созданного массива чисел
        for (int i = 0; i < LengthMass; i++) {
            System.out.printf("%" + lengthCell + "d", MassNumbers[i]);
            for (int j = 0; j < LengthMass; j++){
                System.out.printf("%" + lengthCell + "d", MassNumbers[i]*MassNumbers[j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Error;

        do {
            Error = 0; //Помогает поймать ошибку: если ошибка есть, Error = 1 => повторный ввод чисел; если нет => ввод один раз

            //Ввод с консоли диапазона значений и шага
            System.out.print("Введите первое число: ");
            int FirstNimber = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int SecondNumber = scanner.nextInt();
            System.out.print("Введите шаг: ");
            int StepNumber = scanner.nextInt();

            //Проверка корректности введенных с клавиатуры данных
            if (FirstNimber > SecondNumber) {
                System.out.print("\nОшибка корректности данных: первое число не должно быть больше второго");
                Error = 1;
            }
            if (StepNumber <= 0) {
                System.out.print("\nОшибка корректности данных: шаг должен быть положительным");
                Error = 1;
            }
            System.out.println("");

            //Вызов функции печати таблицы, если нет ошибок
            if (Error == 0) {
                printTable(FirstNimber, SecondNumber, StepNumber);
            }
        } while (Error == 1);
    }
}
