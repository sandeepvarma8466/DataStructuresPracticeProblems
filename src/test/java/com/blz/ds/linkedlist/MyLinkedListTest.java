package com.blz.ds.linkedlist;

import com.blz.datastrucures.MyLinkedList;
import com.blz.datastrucures.MyNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenaddedToLinkedListShoudbeaddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);

        Assert.assertTrue(result);
    }
}
