package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.forest.*;
import com.lxisoft.animalgame.type.*;
import com.lxisoft.animalgame.animal.*;
//import com.lxisoft.animalgame.hunter.*;
import java.io.*;
import java.util.*;
public class Test
{
public static void main(String args[])
{
{
	System.out.println("\n\t\t\t\t WELCOME \t\t\t\t\n");
	System.out.println("\n\t\t\t\tANIMAL GAME\t\t\t\n");
	Forest ft=new Forest(4,5,3,4,1);
	ft.grasseatState();
	ft.animalsleepState();
	ft.huntingState();
	ft.roamcheckState();
	ft.luckState();
	
	
}	
}
}