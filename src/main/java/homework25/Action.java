package main.java.homework25;

public interface Action {
    default void run(String name) {
        System.out.println("-> " + name + " is running");
    }

    void fire();

    void charge();
}