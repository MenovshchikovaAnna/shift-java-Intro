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

abstract class Transformer {
    protected String name;

    public void run() {
        System.out.println("-> " + name + " is running");
    }

    public void fire() {
        System.out.println("-> " + name + " is firing");
    }

    public void charge() {
        System.out.println("-> " + name + " is charging");
    }

    public Transformer(String name) {
        this.name = name;
    }

    public abstract void transform();

    public abstract void showInfo();
}

class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor = "blue";
    private boolean kindness = true;

    public void transform() {
        System.out.println("-> " + name + " transforms into vehicles");
    }

    @Override
    public void showInfo() {
        System.out.println("--> Autobot Properties <--");
        System.out.println(" Name: " + name);
        System.out.println(" Team name: " + teamName);
        System.out.println(" Eye color: " + eyeColor);
        System.out.println(" Kindness: " + kindness);
    }

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    //В данном случае, геттеры и сеттеры нигде не задействованы, но добавлены для ООП
    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean getKindness() {
        return kindness;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }
}

class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor = "red";
    private boolean kindness = false;

    public void transform() {
        System.out.println("-> " + name + " transforms into land and air transport, weapons, equipment");
    }

    @Override
    public void showInfo() {
        System.out.println("--> Decepticon Properties <--");
        System.out.println(" Name: " + name);
        System.out.println(" Team name: " + teamName);
        System.out.println(" Eye color: " + eyeColor);
        System.out.println(" Kindness: " + kindness);
    }

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    //В данном случае, геттеры и сеттеры нигде не задействованы, но добавлены для ООП
    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean getKindness() {
        return kindness;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }
}
