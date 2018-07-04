package leetcode;

import java.util.Scanner;

public class BuddyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(buddystrings(s1,s2));
	}
	public static boolean buddystrings(String s1,String s2) {
		if(s1.length()<=1||s2.length()<=1||s1.length()!=s2.length()) {
			return false;
		}
		boolean ans=false;
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s2.charAt(i)){
				continue;
			}
			else{
				count=count+1;
			}
		}if(count==0) {
			for(int j=0;j<s1.length()-1;j++){
				if(s1.charAt(j)==s1.charAt(j+1)){
					ans= true;    
				}
			}
		}if(count==2) {
			char ch1=' ';
			char ch2=' ';
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)){
					ch1=s1.charAt(i);
					ch2=s2.charAt(i);
					for(int j=i+1;j<s1.length();j++) {
						if(ch1==s2.charAt(j)&&ch2==s1.charAt(j)) {
							ans=true;
						}

					}
					break;
				}
			}
		}
		return ans;
	}

}
