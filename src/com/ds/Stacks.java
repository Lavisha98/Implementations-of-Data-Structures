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
public class Stacks {

    private char[] arr;
    private int capacity;
    private int top;

    public Stacks() {
        capacity = 10;
        top = -1;
        arr = new char[capacity];
    }

    private char[] resize(char[] arr) {
        if (top >= capacity / 2) {
            char[] temp = new char[capacity / 2];
            System.arraycopy(arr, 0, temp, 0, top);
            capacity = capacity / 2;
            return temp;
        }
        char[] temp = new char[2 * capacity];
        System.arraycopy(arr, 0, temp, 0, capacity - 1);
        capacity = 2 * capacity;
        return temp;
    }

    public int isFull() {
        if (top == capacity - 1) {
            return 1;
        }
        return 0;
    }

    public int isEmpty() {
        if (top == -1) 
            return 1;        
        return 0;
    }

    public void push(char data) {
        if (isFull() == 1) 
            this.arr = resize(this.arr);     
        this.arr[++this.top] = data;
    }

    public char pop() {
        if (isEmpty() == 1) 
            System.out.println("The Stack is EMPTY");        
        char x = arr[top];
        top--;
        return x;
    }

    public char peek() {
        if (isEmpty() == 1) {
            System.out.println("The Stack is EMPTY");
            return '$';
        }
        return arr[top];
    }

    public void printinfo() {
        System.out.println("Top = " + top);
        System.out.println("Capacity = " + capacity);
    }
}
