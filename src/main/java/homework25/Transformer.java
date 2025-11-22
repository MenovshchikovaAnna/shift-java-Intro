package main.java.homework25;

public abstract class Transformer {
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
