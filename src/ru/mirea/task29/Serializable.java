package ru.mirea.task29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {

    public static void main(String[] args) {
        Patient[] patients = new Patient[2]; // Массив пациентов

        Patient Denise = new Patient("Denise Temiroff", 50000, 2002, 10, 1);

        Doctor Alexandr = new Doctor("Alexandr Volokhov", 80000, 1987, 12, 15);
        Alexandr.setSick(Denise);

        patients[0] = Alexandr;
        patients[1] = Denise;

        try {
            // Сброс данных объекта patient в файл (сериализация данных)
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patient.dat"));
            out.writeObject(patients);
            out.close();

            // Чтение сериализованных данных из файла в объект (десериализация данных)
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("patient.dat"));
            Patient[] newPatient = (Patient []) in.readObject(); // Новый список
            in.close();

            newPatient[1].raisePrice(10); // Увеличим стоимость операции на 10 %

            // Вывод на экран массива объектов newPatient
            for (Patient e : newPatient) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}