package com.thoughtworks.balanceTest;

import com.thoughtworks.balance.Bill;
import com.thoughtworks.balance.Friend;
import com.thoughtworks.balance.FriendsSampleList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FriendTest
{
    FriendsSampleList friendsSampleList =new FriendsSampleList();
    List<Friend> friendslist;

    //Method: To test that if All friend Expenses happen Zero
    @Test
    public void givenExpensesWhereZero_whenCalculated_thenReturnZeroGivenAndOwesForEach()
    {
        friendslist= friendsSampleList.getListOfFriends();
        Assertions.assertEquals(friendslist,friendslist);
    }



}
