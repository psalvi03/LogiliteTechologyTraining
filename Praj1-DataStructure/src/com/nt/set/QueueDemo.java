package com.nt.set;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.add("prahlad");
		q.add("deepak");
		q.add("singer");
		System.out.println(q);
		System.out.println(q.remove());
		q.add("prahlad");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
