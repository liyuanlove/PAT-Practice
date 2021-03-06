﻿import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		String answer = "";
		
		for(int i = 0; i < num; i++) {
			answer = judge(in.nextLine());
			System.out.println(answer);
		}
	}
	
	public static String judge(String str) {
		
		String result = "NO";
		
		if(str.contains("PA") && str.contains("AT")) {
			if(str.startsWith("P") && str.endsWith("T")) {
				result = "YES";
				for(int i = 1; i < str.length() - 1; i++) {
					if(str.charAt(i) != 'A') {
						result = "NO";
					}
				}
			}
			else if(str.startsWith("A") && str.endsWith("A")) {
				String[] strs1 = str.split("P");
				if(strs1.length == 2) {
					String[] strs2 = strs1[1].split("T");
					if(strs2.length == 2) {
						if(strs1[0].length() * strs2[0].length() 
								== strs2[1].length()) {
							result = "YES";
						}
					}
				}
			}
		}
		return result;
	}
}

/*
 * 更简短的做法
 * import java.util.Scanner;  

public class Test{  
	public static void main(String[] args){  
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0 ;i<n ;i++){
			String s = sc.nextLine();
			String news = s;
			if(news.contains("P")&&news.contains("A")&&news.contains("T")){
				news = news.replace("A", "");
				news = news.replace("P", "");
				news = news.replace("T", "");
				news = news.replace("\\s+", "");
				if(news.isEmpty()){
					int p = s.indexOf("P");
					int t   = s.indexOf("T");
					int len = s.length();
					int b = t-p-1;
					int c = len -t -1;
					if(p*b==c){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}
	}
}
 */