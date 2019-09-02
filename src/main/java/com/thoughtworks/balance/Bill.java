package com.thoughtworks.balance;

import java.util.List;

 public class Bill
{
    public float amount;
    FriendsSampleList friendsSampleList =new FriendsSampleList();

    List<Friend> friendslist= friendsSampleList.getListOfFriends();

    public  List<Friend> calculatedExpenses()
    {
        return friendslist;
    }
}
