package ru.mirea.task26;

interface TypesOfCT
{
    public void CT();
}

class CTHead implements TypesOfCT
{
    public void CT()
    {
        System.out.println("CT of Head");
    }
}
class CTSpine implements TypesOfCT
{
    public void CT()
    {
        System.out.println("CT of Spine");
    }
}
class CTBones implements TypesOfCT
{
    public void CT()
    {
        System.out.println("CT of Bones");
    }
}


interface TypesOfMRI
{
    public void MRI();
}
class MRIHead implements TypesOfMRI
{
    public void MRI()
    {
        System.out.println("MRI of Head");
    }
}
class MRISpine implements TypesOfMRI
{
    public void MRI()
    {
        System.out.println("MRI of Spine");
    }
}


abstract class Patient
{
    TypesOfCT typesOfCT;
    TypesOfMRI typesOfMRI;

    public Patient(TypesOfCT typesOfCT,
                   TypesOfMRI typesOfMRI)
    {
        this.typesOfMRI = typesOfMRI;
        this.typesOfCT = typesOfCT;
    }
    public void diagnostics()
    {
        System.out.println("Прохождение диагностики");
    }
    public void CT()
    {
        typesOfCT.CT();
    }
    public void MRI()
    {

        typesOfMRI.MRI();
    }
    public void setTypesOfCT(TypesOfCT typesOfCT)
    {
        this.typesOfCT = typesOfCT;
    }
    public void setTypesOfMRI(TypesOfMRI typesOfMRI)
    {
        this.typesOfMRI = typesOfMRI;
    }
    public abstract void display();
}

class Person01 extends Patient
{
    public Person01(TypesOfCT typesOfCT,
                    TypesOfMRI typesOfMRI)
    {
        super(typesOfCT,typesOfMRI);
    }
    public void display()
    {
        System.out.println("Person01");
    }
}
class Person02 extends Patient
{
    public Person02(TypesOfCT typesOfCT,
                    TypesOfMRI typesOfMRI)
    {
        super(typesOfCT,typesOfMRI);
    }
    public void display()
    {
        System.out.println("Person02");
    }
}


public class Strategy {

    public static void main(String[] args) {
        TypesOfMRI MRIHead = new MRIHead();
        TypesOfMRI MRISpine = new MRISpine();
        TypesOfCT CTHead = new CTHead();
        TypesOfCT CTSpine = new CTSpine ();

        Patient Person02 = new Person02(CTHead,MRIHead);
        Person02.display();

        Person02.diagnostics();
        Person02.CT();
        Person02.MRI();

        Person02.setTypesOfMRI(MRIHead);
        Person02.setTypesOfCT(CTSpine );
        Person02.MRI();
        Person02.CT();
    }

}
/*
Выходные данные

Person01
Прохождение диагностики
CT of Head
MRI of Head
MRI of Head
CT of Spine

Person02
Прохождение диагностики
CT of Head
MRI of Head
MRI of Head
CT of Spine
 */