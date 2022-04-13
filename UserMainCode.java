package aprilthirteen;

import java.util.Scanner;

public class UserMainCode {
	public static int addPalindromes(int a,int b)
	{
		int temp=0,sum=0,r,sum1=0;
		for(int i=a;i<=b;i++)
		{
			temp=i;
			sum=0;
			while(temp>0)
			{
				r=temp%10;
				sum=sum*10+r;
				temp=temp/10;
				}
			if(i==sum)
				sum1=sum1+i;
			}
		return sum1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range:");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("sum of palindrome within "+a+"and"+b+"is:" + addPalindromes(a, b));
	}

}
