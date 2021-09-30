package ru.mirea.task3.Human;

public class Human {
    private String name;
    private String hand;
    private String leg;
    private int head;

    public Human(String n, String h, int d, String l)
    {
        name = n;
        hand = h;
        head = d;
        leg= l;
    }
    public Human(String n, String h, String l) {
        name = n;
        hand = h;
        head = 0;
        leg = l;
    }

    public Human() {
        name = "Null";
        hand = "Null";
        head = 0;
        leg = "Null";
    }
    public String getName()
    {
        return name;
    }
    public String getHand()
    {
        return hand;
    }
    public int getHead()
    {
        return head;
    }
    public String getLeg()
    {
        return leg;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHand(String hand) {
        this.hand = hand;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }
    public String toString() {
        return this.name + " has " + this.hand + " hands, " + this.head + " head and " + this.leg + " legs ";
    }
    public void HumanHead() {
        System.out.println(name + " has " + this.hand + " hands, " + this.head + " head and " + this.leg + " legs ");
    }
}
