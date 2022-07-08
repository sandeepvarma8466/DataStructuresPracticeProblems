package com.blz.stack;

import com.blz.datastrucures.INode;
import com.blz.datastrucures.MyLinkedList;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList<>();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printMyStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }
}
