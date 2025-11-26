package main.java.homework24;

import java.util.Scanner;

public class Transformers {
    public static void main(String[] args) {
        System.out.print("Enter transform form Autobot (vehicles): ");
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots", inputFormTransform());

        System.out.print("Enter transform form Decepticon (land and air transport, weapons, equipment): ");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons", inputFormTransform());
        System.out.println();

        summoningTransformer(bumblebee); //Выполнение действий для трансформера bumblebee
        summoningTransformer(megatron); //Выполнение действий для трансформера megatron
    }

    public static String inputFormTransform() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void summoningTransformer(Transformer transformer) {
        System.out.println("\n== Summoning the " + transformer.name + " ==\n");
        actionsPerformedByTransformer(transformer);
        System.out.println();
    }

    public static void actionsPerformedByTransformer(Transformer transformer) {
        transformer.run();
        transformer.fire();
        transformer.charge();
        transformer.transform(); //В домашнем задании не указано, что в сценарии нужно вызвать метод transform(), но это и не запрещено
        transformer.showInfo();
    }
}