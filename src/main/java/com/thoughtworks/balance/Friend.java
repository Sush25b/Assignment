package com.thoughtworks.balance;

public class Friend
{
    private String name;
    private float amountToGive;
    private float amountOwes;

    public Friend(String name, float amountToGive, float amountOwes)
    {
        this.name = name;
        this.amountToGive = amountToGive;
        this.amountOwes = amountOwes;
    }

    public Friend() {

    }
}
