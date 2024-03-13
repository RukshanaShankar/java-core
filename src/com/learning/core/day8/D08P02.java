package com.learning.core.day8;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    private Node front;
    private Node rear;

    public Linkedlist() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedItem = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        return removedItem;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class D08P02 {
	public static void main(String[] args)
	{ Linkedlist queue = new Linkedlist();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		queue.enqueue(sc.nextInt());
	}
	queue.display();
	System.out.println("After removing 2 elements: ");
	queue.dequeue();
	queue.dequeue();
	for(int i=0;i<3;i++)
	{
		System.out.print(queue.dequeue()+" ");
	}
	

    }

}
