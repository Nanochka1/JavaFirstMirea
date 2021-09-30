package ru.mirea.task5.Furniture;

public class Furnituretest {
    public static void main(String[] args)
    {
        FurnitureShop fur1 = new FurnitureShop("Furniture", "Divanchick", "Moscow");
        System.out.println(fur1);
        Chair ch1 = new Chair("Gaming chair",  "Leather");
        System.out.println(ch1);
        Sofa sf1 = new Sofa("Corner sofa",  "Fabric");
        System.out.println(sf1);
        Table tab2 = new Table("Kitchen table", "Wooden");
        System.out.println(tab2);
    }
}
