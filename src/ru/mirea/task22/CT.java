package ru.mirea.task22;

public class CT extends AbstractClinic implements Test {

    public CT() {
        super(1, 4200);
    }

    @Override
    public String manufacturerName() {
        return "CT";
    }
}