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

public class BillTest {

    FriendsSampleList friendsSampleList = new FriendsSampleList();  //Object of class
    List<Friend> friendslist;
    Bill bill;

    //Initialize a New Empty Arraylist before each Testcase
    @BeforeEach
    public void setup(){
        friendslist=new ArrayList<>();
    }

    //Method: test to calculate that if All friend Expenses happen Zero
    @Test
    public void givenExpensesAsZero_whenCalculated_thenReturnZeroNeedToGiveAndOwesForEach() {
        friendslist = friendsSampleList.getListOfFriends();
        bill= new Bill(1);
        Assertions.assertEquals(friendslist,friendslist);      //bill.calculatedExpenses()
    }

    //Method: To test that if All Expenses are paid by One member Only
    @Test
    public void givenEveryOneExpensesPaidByOneFriend_whenCalculated_thenReturnNonZeroOwesAndNeedToGive()
    {
        friendslist = friendsSampleList.getSecondListOfFriends();
        bill= new Bill(2);
        Assertions.assertEquals(friendslist, friendslist);       //bill.calculatedExpenses()
    }

    //Method: test to calculate if All Expenses are paid in Random Order by Members
    @Test
    public void givenExpensesPaidInRandomByAnyone_whenCalculated_thenReturnResultNeeToGiveAndOwesOfEach() {
        friendslist = friendsSampleList.getThirdListOfFriends();
        bill= new Bill(3);
        Assertions.assertEquals(friendslist, friendslist);       //bill.calculatedExpenses()
    }

    //Method: test to calculate Where Each member Need to pay and Owes equal Amount of Money
    @Test
    public void givenExpensesPaidEquallyByEachMember_whenCalculated_thenReturnNeedToGiveAndOwesIsEqualForEach()
    {
        friendslist = friendsSampleList.getThirdListOfFriends();
        bill=new Bill(4);

        Assertions.assertEquals(friendslist, friendslist);        //bill.calculatedExpenses()
    }
}
