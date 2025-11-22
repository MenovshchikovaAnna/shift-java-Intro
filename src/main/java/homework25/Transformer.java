package main.java.homework25;

public abstract class Transformer {
    protected String name;

    public Transformer(String name) {
        this.name = name;
    }

    public abstract void transform();

    public abstract void showInfo();

    public String getName() {
        return name;
    }
}
