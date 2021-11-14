package ru.mirea.task22;

public final class ClinicFactory {

    private ClinicFactory() {
    }

    public static Test manufacture(String type) {
        switch (type) {
            case Test.CT:
                return new CT();
            case Test.Ultrasound:
                return new Ultrasound();
            case Test.MRI:
                return new MRI();

            default:
                throw new IllegalArgumentException(type + " еще не сделано!");
        }
    }
}
