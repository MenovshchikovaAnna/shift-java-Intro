package main.java.homework25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransformersAbstract {
    public static void main(String[] args) {
        System.out.print("Enter transform form Autobot (vehicles): ");
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots", inputFormTransform());

        System.out.print("Enter transform form Decepticon (land and air transport, weapons, equipment): ");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons", inputFormTransform());

        summoningTransformer(bumblebee); //Выполнение действий для трансформера bumblebee
        summoningTransformer(megatron); //Выполнение действий для трансформера megatron

        List<Transformer> transformers = new ArrayList<>();
        addTransformerInList(transformers, bumblebee); //Добавление Bumblebee в список
        addTransformerInList(transformers, megatron); //Добавление Megatron в список

        printTransformerList(transformers); //Печать списка трансформеров
    }

    public static String inputFormTransform() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //Вызов действий для трансформеров
    public static void summoningTransformer(Transformer transformer) {
        System.out.println("\n== Summoning the " + transformer.getName() + " ==\n");
        actionsPerformedByTransformer(transformer);
        System.out.println();
    }

    //Выполнение действий для трансформеров
    public static void actionsPerformedByTransformer(Transformer transformer) {
        transformer.run(transformer.getName());
        transformer.fire();
        transformer.charge();
        transformer.transform();
        transformer.showInfo();
    }

    //Создание списка трансформеров
    public static void addTransformerInList(List<Transformer> transformers, Transformer transformer) {
        transformers.add(transformer);
    }

    //Печать списка трансформеров
    public static void printTransformerList(List<Transformer> transformers) {
        System.out.println("\n== List of Transformers ==");
        for (Transformer transformer : transformers) {
            System.out.println("- " + transformer.getName());
        }
    }
}