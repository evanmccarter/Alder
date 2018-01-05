package com.stillwell.alder.engine.core;

import java.awt.Color;

public class Entity
{

	private Coordinate coor;
	private Dimension dim;
	private Color color;

	public Entity()
	{

		coor = new Coordinate();
		dim = new Dimension();

		setX(0);
		setY(0);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
	}

	public int getX()
	{
		return coor.getX();
	}

	public void setX(int x)
	{
		coor.setX(x);
	}

	public int getY()
	{
		return coor.getY();
	}

	public void setY(int y)
	{
		coor.setY(y);
	}

	public int getWidth()
	{
		return dim.getWidth();
	}

	public void setWidth(int width)
	{
		dim.setWidth(width);
	}

	public int getHeight()
	{
		return dim.getHeight();
	}

	public void setHeight(int height)
	{
		dim.setHeight(height);
	}

	public Color getColor()
	{
		return color;
	}

	public void shiftX(int x)
	{
		coor.shiftX(x);
	}

	public void shiftY(int y)
	{
		coor.shiftY(y);
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public String toString()
	{
		return dim + " " + coor + " " + color;
	}

}
