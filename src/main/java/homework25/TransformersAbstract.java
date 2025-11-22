package main.java.homework25;

import java.util.ArrayList;
import java.util.List;

public class TransformersAbstract {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        summoningTransformer(bumblebee); //Выполнение действий для трансформера bumblebee
        summoningTransformer(megatron); //Выполнение действий для трансформера megatron

        List<Transformer> transformers = ListTransformerCreate(bumblebee, megatron); //Создание списка трансформеров

        ListTransformerPrint(transformers); //Печать списка трансформеров
    }

    //Вызов действий для трансформеров
    public static void summoningTransformer(Transformer transformer) {
        System.out.println("\n== Summoning the " + transformer.getName() + " ==\n");
        actionsPerformedByTransformer((Action) transformer, transformer);
        System.out.println();
    }

    //Выполнение действий для трансформеров
    public static void actionsPerformedByTransformer(Action action, Transformer transformer) {
        action.run(transformer.getName());
        action.fire();
        action.charge();
        transformer.transform();
        transformer.showInfo();
    }

    //Создание списка трансформеров
    public static List<Transformer> ListTransformerCreate(Autobot bumblebee, Decepticon megatron) {
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(bumblebee);
        transformers.add(megatron);
        return transformers;
    }

    //Печать списка трансформеров
    public static void ListTransformerPrint(List<Transformer> transformers) {
        System.out.println("\n== List of Transformers ==");
        for (int i = 0; i < transformers.size(); i++) {
            Transformer transformer = transformers.get(i);
            System.out.println("- " + transformer.getName());
        }
    }
}