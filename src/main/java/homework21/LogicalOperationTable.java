package main.java.homework21;

public class LogicalOperationTable {
    public static void main(String[] args) {

        System.out.println("Задача №1\n");

        boolean p, q;

        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\t\t P XOR Q\tNOT P"); //изменено количество \t чтобы выровнять таблицу

        p = false; q = false;
        System.out.println(p + "\t" + q + "\t" +  (p&&q) + "\t\t" + (p||q) + "\t\t" + (p^q) + "\t\t" + (!p));

        p = true; q = false;
        System.out.println(p + "\t" + q + "\t" +  (p&&q) + "\t\t" + (p||q) + "\t\t" + (p^q) + "\t\t" + (!p));

        p = false; q = true;
        System.out.println(p + "\t" + q + "\t" +  (p&&q) + "\t\t" + (p||q) + "\t\t" + (p^q) + "\t\t" + (!p));

        p = true; q = true;
        System.out.println(p + "\t" + q + "\t" +  (p&&q) + "\t\t" + (p||q) + "\t\t" + (p^q) + "\t\t" + (!p));

        System.out.println("\nЗадача №2\n");

        int lenghtBoaSm = 380; //Длина удава (в см)
        float lenghtBoaM = lenghtBoaSm/100.0F; //Перевод длины удава в м

        float lenghtParrotM = lenghtBoaM/38.0F; //Длина попугая (в м)
        float lenghtMonkeyM = lenghtBoaM/5.0F; //Длина мартышки (в м)
        float lenghtElephant = lenghtBoaM/2.0F; //Длина слонёнка (в м)

        float sumLenghtAnimalsM = lenghtBoaM + lenghtParrotM + lenghtMonkeyM + lenghtElephant; //суммарный рост всех указанных персонажей (в м)

        System.out.println("Рост удава: " + lenghtBoaM + " м");
        System.out.println("Рост попугая: " + lenghtParrotM + " м");
        System.out.println("Рост мартышки: " + lenghtMonkeyM + " м");
        System.out.println("Рост слонёнка: " + lenghtElephant + " м");
        System.out.println("Суммарный рост всех персонажей: " + sumLenghtAnimalsM + " м");
    }
}
