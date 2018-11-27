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
public class Linkedlist {

    Node head;

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {

        public int data;
        public Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    int isEmpty() {
        if (head == null) {
            return 1;
        }
        return 0;
    }

    public void addAtbegin(int data) {
        Node nn = new Node(data);
        if (isEmpty() == 1) {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    public void addAtLast(int data) {
        Node nn = new Node(data);
        if (isEmpty() == 1) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }

    public void addAtPos(int data, int pos) {
        int count = 1;
        Node nn = new Node(data);
        if (isEmpty() == 1) {
            head = nn;
            return;
        }
        Node temp = head;
        while (count < pos && temp != null) {
            temp = temp.next;
            count++;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    public int removeFromBegin() {
        if (isEmpty() == 1) {
            return 0;
        }

        Node temp = head;
        head = head.next;
        return temp.data;
    }

    public void removeElement(int val) {
        if (isEmpty() == 1) {
            return;
        }
        Node temp = head;
        while (temp.next.data != val && temp.next != null) {
            temp = temp.next;
        }

        Node curr = temp.next;
        Node temp1 = temp.next.next;
        temp.next = temp1;
    }
}
