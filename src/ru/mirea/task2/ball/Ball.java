package ru.mirea.task2.ball;
import java.lang.*;

public class Ball {
    private int size;
    private String colour;
    public Ball( int s,String c)
    {
        size = s;
        colour = c;
    }
    public Ball()
    {
        size = 0;
        colour = "Null";
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public void setColour(String Colour)
    {
        this.colour = colour;
    }
    public int getSize()
    {
        return size;
    }
    @Override
    public String toString()
    {
        return this.size + " this is the size of the ball" ;
    }
    public void BallSize()
    {
        System.out.println(" the colour and size of the ball is "+ colour + " and " + size);
    }
}
