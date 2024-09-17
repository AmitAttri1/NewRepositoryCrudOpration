package com.example.CoreJava.Test;

public class Node2 {

    private  int data;
    private Node2 next;


        public Node2(int data)
        {
            this.data=data;

        }

    public static void main(String[] args) {
        Node2 nod1=new Node2(10);
        Node2 nod2=new Node2(20);
        Node2 nod3=new Node2(30);
        Node2 nod4=new Node2(40);

        Node2 head=nod1;
        head.next=nod2;
        nod2.next=nod3;
        nod3.next=nod4;
        nod4.next=null;

traversData(head);

    }
    public static void traversData(Node2 head)
    {
       Node2 current= head;
       while (current !=null)
       {
           System.out.println(current.data);
           current=current.next;
       }
    }
}
