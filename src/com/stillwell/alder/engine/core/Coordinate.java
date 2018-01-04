package com.stillwell.alder.engine.core;

public class Coordinate
{

	private int x;
	private int y;
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void shiftX(int amount)
	{
		x += amount;
	}
	
	public void shiftY(int amount)
	{
		y += amount;
	}
	
	public boolean equals(Coordinate c)
	{
		return c.x == x && c.y == y;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
}
