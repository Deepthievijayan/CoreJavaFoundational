package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.exception.*;
import java.io.*;
import java.util.*;
public class Test
{
	public static void main(String args[]) throws MyException
	{
		try
		{
		System.out.println("\n\n\t\t\t 	WELCOME TO SURVIVEL GAME  \t\t\t");
		System.out.println("\n\n\n\n");
		
			
		Forest ft=new Forest(6,5,4,3);
		System.out.println("\t\t\t\tFinal Output");
		
		System.out.println("\n\n\n\n");
		ft.finalOutput();
		
		ft.finalOutput1();
		}
		catch(NullPointerException ne)
		{
			System.out.println("NullPointerException");
		}
		
		

		
	}
}