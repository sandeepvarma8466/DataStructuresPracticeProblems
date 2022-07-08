package com.blz.ds.linkedlist;

import com.blz.datastrucures.INode;
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
    //UC3 Ability To Create LinkedList By Appending 30 and 70 to 56
    @Test
    public void given3NumbersWhenAppendedShoudBeAddedLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);

        Assert.assertTrue(result);
    }
    //UC4 Ability To Insert 30 Between 56 and 70
    @Test
    public void abilityToInsert30Between56And70() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);

        Assert.assertTrue(result);
    }
    //UC5 Ability To Delete The First Element In The Linked List Of Sequence 56->30->70
    @Test
    public void given3NumbersdeleteTheFirstElementInTheLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        INode pop = myLinkedList.pop();
        Assert.assertEquals(myFirstNode,pop);
    }
    //UC6 Ability To Delete The Lst Element In The Linked List Of Sequence 56->30->70
    @Test
    public void deleteTheLasttElementInTheSequence() {
        System.out.println("\nDeleted Last number");
        MyNode<Integer> myFirstNode= new MyNode<>(56);
        MyNode<Integer> mySecondNode= new MyNode<>(30);
        MyNode<Integer> myThirdNode= new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }
    //UC7
    @Test
    public void given3NumberWhenAppendedToLinkedListShouldSearch30() {
        System.out.println("\nSearch number 30");
        MyNode<Integer> myFirstNode= new MyNode<>(56);
        MyNode<Integer> mySecondNode= new MyNode<>(30);
        MyNode<Integer> myThirdNode= new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.search(mySecondNode);
        Assert.assertTrue(result);
    }
}
