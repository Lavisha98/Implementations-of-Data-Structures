/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

/**
 *
 * @author DELL-PC
 */
public class Queue {

    private int rear, capacity;
    private Linkedlist ll;

    public Queue() {
        rear = -1;
        capacity = 10;
        ll = new Linkedlist();
    }

    public int isFull() {
        if (rear == capacity - 1) {
            return 1;
        }
        return 0;
    }

    public int isEmpty() {
        if (rear == -1) {
            return 1;
        }
        return 0;
    }

    public void push(int data) {
        if (isFull() == 1) {
            return;
        }
        ll.addAtLast(data);
        rear++;
    }

    public int pop() {
        if (isEmpty() == 1) {
            return 0;
        }
        return ll.removeFromBegin();
    }

    public int peek() {
        if (isEmpty() == 1) {
            return 0;
        }
        return ll.head.data;
    }
}
