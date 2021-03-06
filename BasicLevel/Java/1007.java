﻿import java.util.Scanner;

public class Main {
	private static Scanner in;
	private int num;
	private boolean[] isPrime;
	private int cntOfPrimePair;
	private int frontPrime;
	private int backPrime;
	
	public Main(int num) {
		this.num = num;
		isPrime = new boolean[this.num+1];
		for(int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < isPrime.length; i++) {
			if(isPrime[i]) {
				for(int j = 2; i*j < isPrime.length; j++) {
					isPrime[i*j] = false;
				}
			}
		}
	}
	
	public int gotCntOfPrimePair() {
		frontPrime =2;
		for(int i =3; i < isPrime.length; i++) {
			if(isPrime[i]) {
				backPrime = i;
				if(backPrime - frontPrime == 2) {
					cntOfPrimePair++;
				}
				frontPrime = backPrime;
			}
		}
		return cntOfPrimePair;
	}
	
	public void outPut() {
		System.out.println(cntOfPrimePair);
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		Main primePairGuess = new Main(in.nextInt());
		primePairGuess.gotCntOfPrimePair();
		primePairGuess.outPut();
	}
}