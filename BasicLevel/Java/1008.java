﻿import java.util.Scanner;

public class Main {
	private static Scanner in; 
	private int[] arr;
	private int cnt;
	private int moveStep;
	private int temp;
	private String outputArr = "";
	
	public Main(int cnt, int moveStep) {
		this.cnt  = cnt;
		this.moveStep = moveStep;
		arr = new int[this.cnt];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
	}
	
	public void move() {
		for(int i = 0; i < moveStep; i++) {
			temp = arr[arr.length - 1];
			for(int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
	}
	
	public void output() {
		for(int i =0; i < arr.length; i++) {
			outputArr += arr[i]+" ";
		}
		System.out.println(outputArr.trim());
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		Main rightShiftOfArray = new Main(in.nextInt(), in.nextInt());
		rightShiftOfArray.move();
		rightShiftOfArray.output();
	}
}