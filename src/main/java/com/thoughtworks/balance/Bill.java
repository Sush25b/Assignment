package com.thoughtworks.balance;

import java.util.List;

 public class Bill implements Charges
{
    public int optionNumber;
    FriendsSampleList friendsSampleList =new FriendsSampleList();

    public Bill(int optionNumber) {
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
        return null;
    }
}
