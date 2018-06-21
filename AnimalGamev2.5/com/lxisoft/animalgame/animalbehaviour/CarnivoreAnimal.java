package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.*;
import com.lxisoft.animalgame.animalbehaviour.Carnivore;
import java.util.Random;

public class CarnivoreAnimal extends Animal implements Carnivore
	{
		 private int roam;
		 private Random r=new Random();
	
		 public void setRoam(int roam)
			{
				 this.roam=roam;
			}
	
		 public int getRoam()
			{
				 return roam;
			}
	
		 public void checkNearby()
			{
				 if(this instanceof Carnivore)
					{
						 for(int i=6;i>=0;i--)
							{
								for(int j=6;j>=0;j--)
									{
										 if(isAlive() && getGridMember(i,j)!=null && getGridMember(i,j)!=this && getGridMember(i,j).isAlive())
											{
												 if((Math.abs(i-getXLoc()))<=getRoam() && (Math.abs(j-getYLoc()))<=getRoam())
													{
														 if(canRoam())
															 combat(getGridMember(i,j));
													}
											}
									}
							}
					}
			}
		 public void combat(Animal a)
			{
				 System.out.println("\n"+getID()+"\t vs   "+a.getID());
				 if(getStrength()>a.getStrength())
					{
						 int luckFact=r.nextInt(10);
						 if(luckFact==5)
							{
								 System.out.print("\tLuckily");
								 a.iWon(this);
							}
						 else
							iWon(a);
					}
				 else if(getStrength()==a.getStrength())
					{
						 if(a.getHunger()>getHunger())
							{
								 a.iWon(this);
								 try
									{
										 a.setGrid(getGrid());
										 ((CarnivoreAnimal)a).checkNearby();
										 setGrid(a.getGrid());
									}
								 catch(Exception e)
									{ 
									}
							}
						 else
							{
								 iWon(a);
							}
					}
				 else
					{
						 a.iWon(this);
						 try
							{	 
								 a.setGrid(getGrid());
								 ((CarnivoreAnimal)a).checkNearby();
								 setGrid(a.getGrid());
							}
						 catch(Exception e)
							{
							}
					}				 
			}
	
		 public void eatMeat(Animal a)
			{
				 System.out.println("\t"+getID()+"\tEating\t"+a.getID());
				 if(a instanceof Elephant)
					 this.setHunger(2);
				 else
					 this.setHunger(this.getHunger()+1);
				 this.setStrength(this.getStrength()+a.getStrength());
			}
	
		 public boolean canRoam()
			{
				 boolean retVal=false;
				 if(getHunger()<2 && getStrength()>5)
					{
						 retVal =true;
					} 
				 return retVal;            
			}
	}