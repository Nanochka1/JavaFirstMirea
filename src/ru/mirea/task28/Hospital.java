package ru.mirea.task28;

//вложенные классы
public class Hospital {
    private int id;

    //вложенный нестатический класс
    private class Checkup{
        public void startCheckup(){
            System.out.println("Checkup " + id + " is starting...");
        }
    }
    //статический вложенный класс
    public static class Medicaltest{
        public void ECG(){
            System.out.println("ECG shows...");
        }
    }

    public Hospital(int id){
        this.id = id;
    }
    public void start(){
        Checkup checkup = new Checkup();
        checkup.startCheckup();

        final int x = 1;

        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Patient "+ id +" is starting...");
    }
    private void test(Object object){

    }
}

/*
1) Вложенный нестатический класс
 Объект Hospital сложен из других объектов, поэтому,если бы в нем целиком была бы прописана вся логика,
 он бы оказался слишком сложным, по этой причине, внутри этого класса мы создаем множество вложенных
 нестатических классов, каждый из классов, это какой-нибудь объект,например, Checkup.
 В каждом таком классе мы прописываем логику конкретного подобъекта, используем private, так как обычно,
 мы не получаем к ним доступ извне.

 -Нестатические вложенные классы нужны тогда, когда объект сложен, или комплексный, тогда его можно разделить
  на несколько подобъектов.

 2) Статический вложенный класс
 Этот класс имеет намного меньше отношения к классу Hospital, он не имеет доступа к полям объекта.
 Логика в том, что мы хотим как-то сгруппировать два класса. Класс Medicaltest и Hospital практически ничем
 не связаны. Единственное, что их связывает то, что внутри класса Medicaltest мы можем получать доступ к
 статическим полям Hospital.

 -Статические вложенные классы нужны для использования извне. Поэтому они используются вместе с public.

 3) Третий тип - это вложенный класс в методе
 Он имеет доступ и к полям(нестатическим), и к переменным метода(const).

 */