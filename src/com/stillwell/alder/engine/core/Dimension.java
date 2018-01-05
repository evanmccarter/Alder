package com.stillwell.alder.engine.core;

public class Dimension
{

	private int width;
	private int height;

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public boolean equals(Dimension d)
	{
		return d.width == width && d.height == height;
	}

	public String toString()
	{
		return width + "x" + height;
	}

}
