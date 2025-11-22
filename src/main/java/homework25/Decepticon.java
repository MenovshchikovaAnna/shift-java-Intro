package main.java.homework25;

public class Decepticon extends Transformer {
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