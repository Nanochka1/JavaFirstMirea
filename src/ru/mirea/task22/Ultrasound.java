package ru.mirea.task22;

public class Ultrasound extends AbstractClinic implements Test {

    public Ultrasound() {
        super(3, 7000);
    }

    @Override
    public String manufacturerName() {
        return "Ultrasound";
    }
}