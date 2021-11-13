package ru.mirea.task17.Base;


class EnumDemo2 {
    public static void main(String[] args) {
        Basa bas;
        System.out.println("Константы перечислимого типа Basa:");


        Basa allbasa[] = Basa.values();
        for (Basa b : allbasa) {
            System.out.println(b);
        }

        System.out.println("\nКонстанты перечислимого типа Basa:");


        for (Basa b : Basa.values()) {
            System.out.print(b + " ");
        }

        System.out.println("\n");


        bas = Basa.valueOf("Examination");
        System.out.println("Пepeмeннaя bas содержит " + bas);
    }
}

