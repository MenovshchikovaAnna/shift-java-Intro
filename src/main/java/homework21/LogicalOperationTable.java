package main.java.homework21;

public class LogicalOperationTable {
    public static void main(String[] args) {
        System.out.println("Задача №1\n");
        TruthTable();
        System.out.println("\nЗадача №2\n");
        ThirtyEightParrots();
    }

    public static void TruthTable(){
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
    }

    public static void ThirtyEightParrots(){
        int lengthBoaCm = 380; //Длина удава (в см)
        float lengthBoaM = lengthBoaCm/100F; //Перевод длины удава в м

        float lengthParrotM = lengthBoaM/38; //Длина попугая (в м)
        float lengthMonkeyM = lengthBoaM/5; //Длина мартышки (в м)
        float lengthElephantM = lengthBoaM/2; //Длина слонёнка (в м)
        float sumLengthAnimalsM = lengthBoaM + lengthParrotM + lengthMonkeyM + lengthElephantM; //суммарный рост всех указанных персонажей (в м)

        System.out.println("Рост удава: " + lengthBoaM + " м");
        System.out.println("Рост попугая: " + lengthParrotM + " м");
        System.out.println("Рост мартышки: " + lengthMonkeyM + " м");
        System.out.println("Рост слонёнка: " + lengthElephantM + " м");
        System.out.println("Суммарный рост всех персонажей: " + sumLengthAnimalsM + " м");
    }
}
