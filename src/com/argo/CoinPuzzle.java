package com.argo;

public class CoinPuzzle {

	public static void main(String[] args) {
		char[] coins = new char[1100];
		int count = 0;
		for (int i = 1; i <= coins.length; i++) {//men
			for (int j = i; j <= coins.length; j++) {//coins
				//System.out.println("Inside copins loop");
				if(j%i ==0 && i==1) {
					coins[j-1] = 'H';
					//System.out.println("Inside first if");
				}
				if(j%i == 0 && i>1) {
					if(coins[j-1] == 'H') {
						coins[j-1] = 'T';
					}
					else {
						coins[j-1] = 'H';
					}
				}
			}
			//System.out.println(coins);
			
			if(coins[i-1] == 'H') {
				count=count+1;
			}
		}
		System.out.println("Count of Heads after flips from all 1100 men are : "+count);
		/*
		 * int count1 = 0; System.out.println(coins); for(char c : coins) { if(c=='H')
		 * count1 = count1 +1; } System.out.println(count1);
		 */
	}
}
