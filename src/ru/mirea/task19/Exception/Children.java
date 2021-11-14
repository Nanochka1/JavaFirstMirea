package ru.mirea.task19.Exception;

class Child extends Parent {
    @Override
    public void add() throws Exception{
        try {

        }catch(RuntimeException e) {
            throw new Exception(e);
        }
    }
}