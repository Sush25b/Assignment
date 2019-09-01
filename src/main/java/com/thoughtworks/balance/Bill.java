package com.thoughtworks.balance;

import java.util.List;

public class Bill
{
    public float amount;


    public static List<Friend> calculatedExpenses()
    {
        FriendsSampleList friendsSampleList =new FriendsSampleList();

        List<Friend> friendslist= friendsSampleList.getListOfFriends();

        return friendslist;
    }
}
