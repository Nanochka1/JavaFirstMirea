package ru.mirea.task26;

//чтобы попробовать, начала с калькулятора
interface Operation{
    int performOperation(int num1,int num2);
}
class Add implements Operation{
    Operation op;
    public int performOperation(int num1,int num2){
        return num1+num2;
    }
    void SetOperation(Operation op){
        this.op = op;
    }

}

class Multiply implements Operation{
    Operation op;
    public int performOperation(int num1,int num2){
        return num1*num2;
    }
    void SetOperation(Operation op){
        this.op = op;
    }

}

class Calculator{
    Operation op;
    int performOperation(int num1,int num2){
        return op.performOperation(num1, num2);
    }

    void SetOperation(Operation op){
        this.op = op;
    }
}

public class Example {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.SetOperation(new Add());
        System.out.println(cal.performOperation(800, 950));
        cal.SetOperation(new Multiply());
        System.out.println(cal.performOperation(15, 90));
    }

}
/*
Выходные данные
1750
1350
 */