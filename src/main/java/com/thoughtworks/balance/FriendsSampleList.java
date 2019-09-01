package com.thoughtworks.balance;

import java.util.ArrayList;
import java.util.List;

public class FriendsSampleList
{
    //Method: to get Sample List of friends
    public List<Friend> getListOfFriends()
    {
        Friend firstFriend = new Friend("A", 0.0f, 0.0f);
        Friend SecondFriend = new Friend("B", 0.0f, 0.0f);
        Friend ThirdFriend = new Friend("C", 0.0f, 0.0f);
        Friend FourthFriend = new Friend("D", 0.0f, 0.0f);

        //creating Sample data List of Friends for testing
        List<Friend> friendslist = new ArrayList<Friend>();

        friendslist.add(firstFriend);
        friendslist.add(SecondFriend);
        friendslist.add(ThirdFriend);
        friendslist.add(FourthFriend);

        return friendslist;
    }

}
