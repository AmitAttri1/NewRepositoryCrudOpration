package com.example.CoreJava.Test;

public class Node {
    private int data;
    private Node next;

    public Node( int data)
    {
this.data=data;
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);

        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
traverse(head);
    }
    public  static  void  traverse( Node head)
    {
        Node current=head;
        while(current !=null) {
            System.out.println(current.data);
            current=current.next;

    }
    }
}
