package main.java.homework24;

public class Autobot extends Transformer {
    private String teamName;
    private static final String eyeColor = "blue";
    private boolean kindness = true;
    private String formTransform;

    public void transform() {
        System.out.println("-> " + name + " transforms into " + formTransform);
    }

    @Override
    public void showInfo() {
        System.out.println("--> Autobot Properties <--");
        System.out.println(" Name: " + name);
        System.out.println(" Team name: " + teamName);
        System.out.println(" Eye color: " + eyeColor);
        System.out.println(" Kindness: " + kindness);
        System.out.println(" Transform form: " + formTransform);
    }

    public Autobot(String name, String teamName, String formTransform) {
        super(name);
        this.teamName = teamName;
        this.formTransform = formTransform;
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

    public String getFormTransform() {
        return formTransform;
    }

    public void formTransform() {
        this.formTransform = formTransform;
    }
}