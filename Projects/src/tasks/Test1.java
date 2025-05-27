
/*
 WAP java program finding a number of frequency.
 Example- String s="hello world"
 h-count=1
 e-count=1
 l-count=3
 o-count=2
 w-count=1
 r-count=1
 d-count=1 
 */

package tasks;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String words=sc.nextLine();
		char[] ch=words.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c1=0,c2=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j])
					c1++;
			}
			for(int l=i;l>=0;l--) {
				if(ch[l]==ch[i])
					c2++;
			}
			if(c2==1) {
				System.out.println(ch[i]+ " count ="+c1);
			}
		}
		
	}

}
