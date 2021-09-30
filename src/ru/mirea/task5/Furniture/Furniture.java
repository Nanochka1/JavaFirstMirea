package ru.mirea.task5.Furniture;

public abstract class Furniture {
    private String type;
    private String material;


    public String getType() { return type; }
    public String getMaterial() { return material; }


    public Furniture(String type, String material){
        this.type=type;
        this.material=material;

    }

    public abstract void displayInfo();
}
class FurnitureShop extends Furniture{
    private String shop;
    private String title;
    private String location;

    public FurnitureShop( String shop, String title, String location) {

        super(title, location);
        this.shop = shop;
        this.title = title;
        this.location = location;
    }
    public String toString() // вывод информации
    {
        return ("\nМагазин: " + shop + " \nНазвание: "
                + title + " \nЛокация: " + location) ;
    }

    public void displayInfo() {

        System.out.println("\nМагазин: " + shop + " \nНазвание: "
                + title + " \nЛокация: " + location);
    }
}

class Chair extends Furniture {
    private String type;
    private String material;

    public Chair(String type, String material) {

        super(type,material);
        this.material = material;
    }

    public String toString() // вывод информации
    {
        return ("\nВид: " + super.getType() + " \nМатериал: "
                + super.getMaterial()) ;
    }

    public void displayInfo() {

        System.out.println("\nВид: " + super.getType() + " \nМатериал: "
                + super.getMaterial());
    }
}
class Sofa extends Furniture {
    private String type;
    private String material;

    public Sofa(String type,  String material) {

        super(type,material);
        this.material = material;
    }

    public String toString() // вывод информации
    {
        return ("\nВид: " + super.getType() + " \nМатериал: "
                + super.getMaterial());
    }

    public void displayInfo() {

        System.out.println("\nВид: " + super.getType() + " \nМатериал: "
                + super.getMaterial());
    }
}
class Table extends Furniture {
    private String type;
    private String material;

    public Table(String type,  String material) {
        super(type, material);
        this.material = material;
    }
    public String toString() // вывод информации
    {
        return ("\nВид: " + super.getType() + " \nМатериал: "
                + super.getMaterial());
    }

    public void displayInfo() {

        System.out.println("\nВид: " + super.getType() + " \nМатериал: "
                + super.getMaterial());
    }
}

