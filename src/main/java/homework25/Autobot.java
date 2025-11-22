package main.java.homework25;

public class Autobot extends Transformer {
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