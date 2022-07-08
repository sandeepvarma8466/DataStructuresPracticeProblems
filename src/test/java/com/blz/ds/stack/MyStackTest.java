package com.blz.ds.stack;

import com.blz.datastrucures.INode;
import com.blz.datastrucures.MyNode;
import com.blz.stack.MyStack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStackTest {
    //UC1 Ability To create Stack Of 56->30->70
    @Test
    public void given3NumbersWhenAddedToStackShoudhaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printMyStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode,peak);

    }
}
