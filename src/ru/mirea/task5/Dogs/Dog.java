package ru.mirea.task5.Dogs;

 public abstract class Dog {

    private String name;
    private String breed;


     public String getName() { return name; }
     public String getBreed() { return breed; }



    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;

    }

    public abstract void displayInfo();
}
class Bobtail extends Dog {
    private String breed;

    public Bobtail(String name, String breed) { //breed-порода

        super(name,breed);
        this.breed = breed;
    }

    public String toString() // вывод информации
    {
        return ("\nИмя: " + super.getName() + " \nПорода: "
                + super.getBreed()) ;
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Порода: "
                + super.getBreed());
    }
}
class Bulldog extends Dog {
    private String breed;

    public Bulldog(String name,  String breed) {

        super(name,breed);
        this.breed = breed;
    }

    public String toString() // вывод информации
    {
        return ("\nИмя: " + super.getName() + " \nПорода: "
                + super.getBreed());
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Порода: "
                + super.getBreed() + " Хозяин берет собаку с родословной: " + breed);
    }
}
class Pug extends Dog {
    private String breed;

    public Pug(String name,  String breed) {
        super(name, breed);
        this.breed = breed;
    }
    public String toString() // вывод информации
    {
        return ("\nИмя: " + super.getName() + " \nПорода: "
                + super.getBreed());
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Порода: "
                + super.getBreed() + " Хозяин берет собаку с родословной: " + breed);
    }
}








