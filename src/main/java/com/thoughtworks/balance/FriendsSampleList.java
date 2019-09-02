package com.thoughtworks.balance;

import java.util.ArrayList;
import java.util.List;

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


}
