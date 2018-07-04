package leetcode;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println(checkPalindrome(x));
//System.out.println("hello");
//int i =Integer.MAX_VALUE;
//System.out.println(i+"hello");

}
	public static int doReverse(int x) {
		int ans=0;
		while(x!=0) {
			int temp=x%10;
			ans=ans*10+temp;
			x=x/10;
		}
		return ans;
	}
	public static boolean checkPalindrome(int x) {
		boolean ans=false;
		if(x<0) {
			return false;
		}
		if(doReverse(x)==x) {
			ans=true;
		}
		
		
		return ans;
		
		
	}

}
