package main.java.homework25;

public class TransformersAbstract {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");
        System.out.println("\n== Summoning the Autobot Bumblebee ==\n");
        actionsPerformedByTransformer(bumblebee); //Выполнение действий автоботом Bumblebee
        System.out.println();
        System.out.println("\n== Summoning the Decepticon Megatron ==\n");
        actionsPerformedByTransformer(megatron); //Выполнение действий десептиконом Megatron
    }

    public static void actionsPerformedByTransformer(Transformer transformer) {
        transformer.run();
        transformer.fire();
        transformer.charge();
        transformer.transform(); //В домашнем задании не указано, что в сценарии нужно вызвать метод transform(), но это и не запрещено
        transformer.showInfo();
    }
}