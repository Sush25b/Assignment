package com.thoughtworks.balance;

import java.util.List;
import java.util.Map;

public class Bill implements Charges
{
    public int optionNumber;
    FriendsSampleList friendsSampleList =new FriendsSampleList();

    public Bill()
    {
    }

    public Bill(int optionNumber)
    {
        this.optionNumber = optionNumber;
    }

    @Override
    public  List<Friend> calculateExpenses()
    {
        if(optionNumber==1)
        {
            return  friendsSampleList.getListOfFriends();
        }
        if(optionNumber==2)
        {
            return  friendsSampleList.getSecondListOfFriends();
        }
        if(optionNumber==3)
        {
            return  friendsSampleList.getThirdListOfFriends();
        }
        if(optionNumber==4)
        {
            return  friendsSampleList.getFourthListOfFriends();
        }
        if(optionNumber==5){

        }
        return null;
    }


    public Map<ExpensesType, Map<Friend, List<Friend>>> calculatedExpenses() {
        return friendsSampleList.getListOfBills();
    }
}
