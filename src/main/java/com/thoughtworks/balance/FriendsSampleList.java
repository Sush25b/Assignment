package com.thoughtworks.balance;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


//These class contains methods which passes Sample List of FriendsList
public class FriendsSampleList
{
    //Method: to get Sample List of friends for testing
    public List<Friend> getListOfFriends()
    {
        List<Friend> friendslist = new ArrayList<Friend>();

        friendslist.add(new Friend("A", 0.0f, 0.0f));
        friendslist.add(new Friend("B", 0.0f, 0.0f));
        friendslist.add(new Friend("C", 0.0f, 0.0f));
        friendslist.add(new Friend("D", 0.0f, 0.0f));
        return friendslist;
    }

    //Method: to get Sample List of friends for testing
    public List<Friend> getSecondListOfFriends()
    {
        List<Friend> friendslist = new ArrayList<Friend>();

        friendslist.add(new Friend("A", 0.0f, 300.0f));
        friendslist.add(new Friend("B", 100.0f, 0.0f));
        friendslist.add(new Friend("C", 100.0f, 0.0f));
        friendslist.add(new Friend("D", 100.0f, 0.0f));
        return friendslist;
    }

    //Method: to get Sample List of friends for testing
    public List<Friend> getThirdListOfFriends()
    {
        List<Friend> friendslist = new ArrayList<Friend>();

        friendslist.add(new Friend("A", 100.0f, 75.0f));
        friendslist.add(new Friend("B", 500.0f, 325.0f));
        friendslist.add(new Friend("C", 100.0f, 275.0f));
        friendslist.add(new Friend("D", 300.0f, 25.0f));
        return friendslist;
    }

    //Method: to get Sample List of friends for testing
    public List<Friend> getFourthListOfFriends()
    {
        List<Friend> friendslist = new ArrayList<Friend>();

        friendslist.add(new Friend("A", 400.0f, 300.0f));
        friendslist.add(new Friend("B", 400.0f, 300.0f));
        friendslist.add(new Friend("C", 400.0f, 300.0f));
        friendslist.add(new Friend("D", 400.0f, 300.0f));
        return friendslist;
    }

    //Method: to get Sample List of Bills
    public Map<ExpensesType, Map<Friend,List<Friend>>> getListOfBills()
    {
        Friend friendWhoGiven=new Friend("A",0.0f,300.0f);

        List<Friend> friendsNeedToPay = new ArrayList<Friend>();
        friendsNeedToPay.add(new Friend("B", 400.0f, 300.0f));
        friendsNeedToPay.add(new Friend("C", 400.0f, 300.0f));
        friendsNeedToPay.add(new Friend("D", 400.0f, 300.0f));

        Map<Friend,List<Friend>> ListWhoPaidForWhom = new LinkedHashMap<>();
        ListWhoPaidForWhom.put(friendWhoGiven,friendsNeedToPay);

        Map<ExpensesType, Map<Friend,List<Friend>>>  listOfExpenses= new LinkedHashMap<>();
        listOfExpenses.put(ExpensesType.BUSTICKET,ListWhoPaidForWhom);

        return listOfExpenses;
    }


}
