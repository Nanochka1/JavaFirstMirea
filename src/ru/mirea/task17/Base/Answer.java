package ru.mirea.task17.Base;

import java.util.Random;


enum Answer {
    AGE, PROCEDURE, DOCTOR, PRICE, LOCATION
}

class Question {
    Random rand = new Random();
    Answer ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Answer.DOCTOR;
        else if (prob < 30)
            return Answer.AGE;
        else if (prob < 60)
            return Answer.PROCEDURE;
        else if (prob < 75)
            return Answer.PRICE;
        else if (prob < 98)
            return Answer.LOCATION;
        return null;
    }
}

class Ask {
    static void answer(Answer result) {
        switch (result) {
            case AGE:
                System.out.println("Возраст");
                break;
            case PROCEDURE:
                System.out.println("Процедура");
                break;
            case DOCTOR:
                System.out.println("Врач");
                break;
            case PRICE:
                System.out.println("Цена");
                break;
            case LOCATION:
                System.out.println("Место");
                break;

        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        for (int i = 0; i < 5; i++) {
            answer(q.ask());
        }
    }
}
