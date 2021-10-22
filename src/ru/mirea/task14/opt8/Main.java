package ru.mirea.task14.opt8;

public class Main {
    public static void main(String[] args) {
        StackCore DrunkGame = new StackCore();

        DrunkGame.setDecks();
        DrunkGame.getDecks();
        DrunkGame.setStacks();

        DrunkGame.CompareStacks();
    }
}