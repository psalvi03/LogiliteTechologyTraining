package com.nt.StackQueue;

public class Queue {
 
     int size;
    int queueArr[];
    int front;
    int rear;
 
    public Queue(int sizeOfQueue) {
        this.size = sizeOfQueue;
        front = -1;
        rear = -1;
        queueArr = new int[this.size];
    }
 
   
    public void insert(int data) {
        if (isFull()) 
        {
            System.out.println("Queue is full!");
        }
        else if(front==-1 && rear==-1){
           front++;
           rear++;
           queueArr[rear]=data;
           System.out.println(data+" inserted into Queue");
        }
        else {
        	rear++;
        	queueArr[rear]=data;
        	 System.out.println(data+" inserted into Queue");
        }
       
    }
 
    public void delete() {
         int val;
    	if (isEmpty()) {
            System.out.println("Queue is empty!");
        } 
        else if(front==rear) {
        	val=queueArr[front];
        	front=-1;
        	rear=-1;
        	System.out.println(val+" is delete from Queue");
        }
        else {
          val=queueArr[front];
        	front++;
        	System.out.println(val+" is delete from Queue");
        }
    }
 
    public void display() {
    	if(isEmpty()) {
    		System.out.println("Queue is empty!!!");
    	}
    	else {
    		for(int i=front;i<=rear;i++) {
    			System.out.print(queueArr[i]+" ");
    		}
    	}
    }
    
    
    public boolean isFull() {
        if (rear == size-1) {
            return true;
        }
        return false;
    }
 
    public boolean isEmpty() {
 
        if (front== -1 && rear==-1) {
            return true;
        }
        return false;
    }
 
    public static void main(String a[]) {
 
        Queue q = new Queue(5);
        q.insert(5);
        q.insert(6);
        // q.delete();
        q.insert(7);
        q.insert(8);
        
        q.insert(9);
        q.insert(10);
        q.insert(11);
        q.display();
    }
  }
