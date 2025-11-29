package main.java.homework25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransformersAbstract {
    public static void main(String[] args) {

        Autobot bumblebee = new Autobot("Bumblebee", "Autobots", inputFormTransform("Autobot"));
        Decepticon megatron = new Decepticon("Megatron", "Decepticons", inputFormTransform("Decepticon"));

        summoningTransformer(bumblebee); //Выполнение действий для трансформера bumblebee
        summoningTransformer(megatron); //Выполнение действий для трансформера megatron

        List<Transformer> transformers = new ArrayList<>();
        transformers.add(bumblebee); //Добавление Bumblebee в список
        transformers.add(megatron); //Добавление Megatron в список

        printTransformerList(transformers); //Печать списка трансформеров
    }

    public static String inputFormTransform(String transformerType) {
        Scanner scanner = new Scanner(System.in);

        if (transformerType.equals("Autobot")){
            System.out.print("\nEnter transform form Autobot (vehicles): ");
            return scanner.nextLine();
        }
        else if (transformerType.equals("Decepticon")){
            System.out.print("\nEnter transform form Decepticon (land and air transport, weapons, equipment): ");
            return scanner.nextLine();
        }
        else {
            System.out.print("Unknown transformer type: " + transformerType);
            System.out.println();
            return "- Unknown transformer form -";
        }
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

    //Печать списка трансформеров
    public static void printTransformerList(List<Transformer> transformers) {
        System.out.println("\n== List of Transformers ==");
        for (Transformer transformer : transformers) {
            System.out.println("- " + transformer.getName());
        }
    }
}