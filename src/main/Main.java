package main;

import pairs.Pairs;
import palindrome.Palindrome;
import sum.Sum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		p.find();
		Sum sum = new Sum();
		sum.SumFactorial(100);
		Pairs pair = new Pairs();
		pair.FindFirstUpSecondDown();
	}

}
