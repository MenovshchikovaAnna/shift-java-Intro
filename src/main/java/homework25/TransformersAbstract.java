package main.java.homework25;

public class TransformersAbstract {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        summoningTransformer(bumblebee); //Выполнение действий для трансформера bumblebee
        summoningTransformer(megatron); //Выполнение действий для трансформера megatron
    }

    //Вызов действий для трансформеров
    public static void summoningTransformer(Transformer transformer) {
        System.out.println("\n== Summoning the " + transformer.name + " ==\n");
        actionsPerformedByTransformer(transformer);
        System.out.println();
    }

    //Выполнение действий для трансформеров
    public static void actionsPerformedByTransformer(Transformer transformer) {
        transformer.run();
        transformer.fire();
        transformer.charge();
        transformer.transform(); //В домашнем задании не указано, что в сценарии нужно вызвать метод transform(), но это и не запрещено
        transformer.showInfo();
    }
}