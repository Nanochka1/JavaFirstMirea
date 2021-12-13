package ru.mirea.task30.patientintake;

public enum Doctor {
    avery("Jim Avery"),
    johnson("Elisabeth Johnson"),
    murphy("Nick Murphy");

    private String name;

    Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
