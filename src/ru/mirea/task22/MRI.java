package ru.mirea.task22;

public class MRI extends AbstractClinic implements Test {

    public MRI() {
        super(2, 20000);
    }

    @Override
    public String manufacturerName() {
        return "MRI";
    }
}