package ru.mirea.task21.Core;

import ru.mirea.task21.Objects.Checkup;
import ru.mirea.task21.Objects.CustomObject;
import ru.mirea.task21.Objects.Doctor;
import ru.mirea.task21.Objects.ObjectHolder;

import java.util.Collections;

public final class ObjectFactory
{
    private ObjectFactory() {}

    public static ObjectHolder createObject(String type)
    {
        switch (type)
        {
            case "doctor":
                return createDoctor();
            case "checkup":
                return createCheckup();
            default:
                return null;
        }
    }

    private static ObjectHolder<Doctor> createDoctor()
    {
        ObjectHolder<Doctor> doctorHolder = new ObjectHolder<>();
        doctorHolder.setObject(new Doctor());
        doctorHolder.setCustomObjects(Collections.singletonList(new CustomObject()));
        return doctorHolder;
    }

    private static ObjectHolder<Checkup> createCheckup()
    {
        ObjectHolder<Checkup> checkupHolder = new ObjectHolder<>();
        checkupHolder.setObject(new Checkup());
        checkupHolder.setCustomObjects(Collections.singletonList(new CustomObject()));
        return checkupHolder;
    }
}