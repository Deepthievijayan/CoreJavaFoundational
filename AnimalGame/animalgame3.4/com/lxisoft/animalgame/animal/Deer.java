package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
public class Deer extends  Herbivorousanimal
{
		public Deer(int id)
	
	{
		setName("Deer"+String.valueOf(id));
		Random ran=new Random();
		setStrength(0);
		setHunger(ran.nextInt(10));
		setLuck(ran.nextInt(10));
		findloc();
	}
	public void animalsleep()
	{
		if(getHunger()<3)
		{
			System.out.println("\n"+this.getName()+"\tsleeping");
		}
			
	}
}