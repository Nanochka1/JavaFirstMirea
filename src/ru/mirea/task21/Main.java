package ru.mirea.task21;

import ru.mirea.task21.Objects.Checkup;
import ru.mirea.task21.Objects.Doctor;
import ru.mirea.task21.Objects.ObjectHolder;

import java.util.Objects;

import static ru.mirea.task21.Core.ObjectFactory.createObject;

public class Main
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ObjectHolder<Doctor> doctorObjectHolder = createObject("doctor");
        if(Objects.nonNull(doctorObjectHolder))
        {
            System.out.println(doctorObjectHolder.getClass());
            System.out.println(doctorObjectHolder.getObject());
            System.out.println(doctorObjectHolder.getCustomObjects());
            doctorObjectHolder.getObject().print();
        }
        System.out.println("\n=========================================\n");
        ObjectHolder<Checkup> checkupObjectHolder = createObject("checkup");
        if(Objects.nonNull(checkupObjectHolder))
        {
            System.out.println(checkupObjectHolder.getClass());
            System.out.println(checkupObjectHolder.getObject());
            System.out.println(checkupObjectHolder.getCustomObjects());
            checkupObjectHolder.getObject().print();
        }
    }

}