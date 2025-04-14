package test_27_03_25;

import java.util.Scanner;

public class Char_Is_SpecialSymbolOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Special Character");
		char ch = s.next().charAt(0);
		if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z') || ch>='0' && ch<='9')
		{	
			System.out.print(ch);
			System.out.println(" Ascii is -->" + (int)ch);
		}
		else
			System.out.println("Not a Special Character");
	}
}
