package ru.mirea.task25;

abstract class MedicalExamination{
    abstract public String toString();
    abstract int price();

}

class CT extends MedicalExamination{

    @Override
    public String toString() {
        return "CT of the spine ";
    }

    @Override
    int price() {
        return 9800;
    }

}

class MRI extends MedicalExamination{

    @Override
    public String toString() {
        return "MRI of the head ";
    }

    @Override
    int price() {
        return 9500;
    }

}
abstract class Additionally extends MedicalExamination{
    MedicalExamination medicalExamination;
}
class Contrast extends Additionally{

    Contrast(MedicalExamination medicalExamination){
        this.medicalExamination = medicalExamination;
    }
    @Override
    public String toString() {
        return medicalExamination + " + with contrast + ";
    }
    int price(){
        return medicalExamination.price() + 3900;
    }

}

class Duplicate extends Additionally{

    Duplicate(MedicalExamination medicalExamination){
        this.medicalExamination = medicalExamination;
    }
    @Override
    public String toString() {
        return medicalExamination + " duplicate snapshot ";
    }
    int price(){
        return medicalExamination.price() + 550;
    }

}
public class Decorator {

    public static void main(String[] args) {
        MedicalExamination medicalExamination = new CT();
        System.out.printf("%s <> %d\n",medicalExamination,medicalExamination.price());

        medicalExamination = new Contrast(medicalExamination);
        System.out.printf("%s <> %d\n",medicalExamination,medicalExamination.price());

        medicalExamination = new Duplicate(medicalExamination);
        System.out.printf("%s <> %d\n",medicalExamination,medicalExamination.price());

    }
}

/*
Выходные данные
КТ
CT of the spine  <> 9800
CT of the spine  + with contrast +  <> 13700
CT of the spine  + with contrast +  duplicate snapshot  <> 14250

МРТ
MRI of the head  <> 9500
MRI of the head  + with contrast +  <> 13400
MRI of the head  + with contrast +  duplicate snapshot  <> 13950
 */