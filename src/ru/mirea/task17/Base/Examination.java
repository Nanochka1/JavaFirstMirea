package ru.mirea.task17.Base;

enum Examination {

    GeneralBloodTest(300), GeneralUrineAnalysis(250), BiochemistryExpanded(1600),
    CoagulogramScreening(950), CReactiveProtein(350), TSH(400), T3(450), T4(450),
    Fluorography(1000), ECG(1000), UltrasoundOfThePelvicOrgans(1900),
    UltrasoundOfTheBristleGland(2500), UltrasoundOfBloodVessels(2000),
    UltrasoundOfTheAbdominalCavity(1800), UltrasoundDuringPregnancy(1900),
    UltrasoundOfTheUrinarySystem(2200), CTOfTheHead(4200),
    CTWithContrast(3900), CTOfTheSpine(9800), CTOfJointsAndBones(3700), CTOfInternalOrgans(4200),
    CTOfSoftTissues(3200), MRIOfTheHead(5000), MRIOfInternalOrgans(8000), MRIOfSoftTissues(5000),
    MRIOfThePeripheralNervousSystem(5000), MRIDuringPregnancy(14000), MRIOfTheSpine(14000),
    MRIIOfJoints(6000), MRIWithContrast(5000);

    private int price;

    Examination(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo4 {
    public static void main(String[] args) {
        Examination ex;
        //цена на конкретное обследование
        System.out.println("Цена на процедуру: " );
        System.out.println("\nУЗИ внутренних органов стоит " +Examination.UltrasoundOfTheAbdominalCavity.getPrice()+ " рублей");


        // вывод цен всех обследований
        System.out.println("\nЦeны на обследования:\n");
        for (ru.mirea.task17.Base.Examination examination : ru.mirea.task17.Base.Examination.values()) {
            System.out.println(examination + " стоит " + examination.getPrice() + " рублей");
        }
    }
}