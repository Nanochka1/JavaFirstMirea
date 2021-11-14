package ru.mirea.task22;

public class Client {

    public static void main(String[] args) {
        Test clinic = ClinicFactory.manufacture(Test.CT);
        System.out.println("Детали по обследованию: КТ");
        System.out.println(clinic);

        clinic = ClinicFactory.manufacture(Test.Ultrasound);
        System.out.println("Детали по обследованию: УЗИ");
        System.out.println(clinic);

        clinic = ClinicFactory.manufacture(Test.MRI);
        System.out.println("Детали по обследованию: МРТ");
        System.out.println(clinic);
    }
}