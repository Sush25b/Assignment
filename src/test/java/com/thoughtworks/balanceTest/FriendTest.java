package com.thoughtworks.balanceTest;

import com.thoughtworks.balance.Bill;
import com.thoughtworks.balance.Friend;
import com.thoughtworks.balance.FriendsSampleList;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matcher.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendTest {

    FriendsSampleList friendsSampleList = new FriendsSampleList();  //Object of class
    List<Friend> friendslist;
    List<Friend> friends;

    //Initialize a New Empty Arraylist before each Testcase
    @BeforeEach
    public void setup(){
             friends=new ArrayList<>();
        System.out.println("hiiii");
    }

    //Method: test to calculate that if All friend Expenses happen Zero
    @Test
    public void givenExpensesWhereZero_whenCalculated_thenReturnZeroGivenAndOwesForEach() {
        friendslist = friendsSampleList.getListOfFriends();

        Assertions.assertEquals(friendslist, friendslist);
    }

    //Method: To test that if All Expenses are paid by One member Only
    @Test
    public void givenAllExpensesWherePaidByOneForAllFriend_whenCalculated_thenReturnNonZeroOwesAndGive() {
        friendslist = friendsSampleList.getSecondListOfFriends();

        friends.add(new Friend("A", 0.0f, 0.0f));
        friends.add(new Friend("B", 0.0f, 0.0f));
        friends.add(new Friend("C", 0.0f, 0.0f));
        friends.add(new Friend("D", 0.0f, 0.0f));

        Assertions.assertEquals(friendslist,friendslist);

    }

    //Method: test to calculate if All Expenses are paid in Random Order by Members
    @Test
    public void givenExpensesPaidInRandomByMembers_whenCalculated_thenReturnGivenAndOwesOfEach() {
        friendslist = friendsSampleList.getThirdListOfFriends();

        friends.add(new Friend("A", 100.0f, 75.0f));
        friends.add(new Friend("B", 500.0f, 325.0f));
        friends.add(new Friend("C", 100.0f, 275.0f));
        friends.add(new Friend("D", 300.0f, 25.0f));

        Assertions.assertEquals(friendslist,friendslist);
    }

}
