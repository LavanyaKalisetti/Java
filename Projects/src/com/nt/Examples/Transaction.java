/*
   A bank ATM logs the last 10 transactions a user has performed.
   You need to analyze the transactions to find the sum of transactions
   made on odd-numbered days and even-numbered days, assuming transactions
   are stored in order of days from day 1 to day 10.
 */
package com.nt.Examples;

public class Transaction {
	public static void main(String[] args) {
		int arr[]= {100, 200, -50, 300, -20, 400, 0, 150, -100, 250};
		int OddDays=0;
		int EvenDays=0;
		
		for(int i=0;i<arr.length;i++){
			int day=i+1;
			if(day%2==0)
				EvenDays+=arr[i];
		    else 
			    OddDays+=arr[i];
		}
		System.out.println("The Transactions in Odd-Numbered of days:"+OddDays);
		System.out.println("The Transactions in Even-Numbered of days:"+EvenDays);
	}

}
