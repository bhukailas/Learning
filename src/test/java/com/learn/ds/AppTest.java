package com.learn.ds;

import java.util.PriorityQueue;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void proriyQ() {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.offer(11);
		pq.offer(22);
		pq.offer(33);
		pq.offer(44);

//		System.out.println("Max value : "+pq.poll());

		String s = "123";

		int num = Integer.parseInt(s);

//		System.out.println(num/100);
//		num = num % 100;
//		System.out.println(num/10);
//		num = num % 10;
//		System.out.println(num);

		int n = s.length();

		int divisor = 1;

		for (int i = 1; i < n; i++) {
			divisor = divisor * 10;
		}

		while (num > 0) {

			System.out.print(num / divisor + " ");
			num = num % divisor;
			divisor = divisor / 10;
		}
	}
}
