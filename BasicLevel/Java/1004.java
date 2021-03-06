﻿import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		InfoOfGrades info = new InfoOfGrades(num, 3);
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < 3; j++) {
				info.addInfo(i, j, in.next());
			}
		}	
		info.rankGrades();
		info.outPut(num);
	}
}

class InfoOfGrades{
	private String[][] rank;
	
	public InfoOfGrades(int row,int column) {
		rank = new String[row][column];
	}
	
	public void addInfo(int row, int column, String info) {
		rank[row][column] = info;		
	}
	
	public void rankGrades() {
		for(int x = 0; x < rank.length; x++) {
			for(int y = 0; y < rank.length-1-x; y++) {
				if(Integer.parseInt(rank[y][2]) < Integer.parseInt(rank[y+1][2])) {
					for(int z = 0; z < 3; z++) {
        				String temp = rank[y][z];
        				rank[y][z] = rank[y+1][z];
        				rank[y+1][z] = temp;
        			}
				}
			}
		}
	}
	
	public void outPut(int num) {
		System.out.println(rank[0][0]+" "+rank[0][1]);
		System.out.println(rank[num-1][0]+" "+rank[num-1][1]);
	}
}