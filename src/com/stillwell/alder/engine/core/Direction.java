package com.stillwell.alder.engine.core;

public class Direction
{

	public static final int HORIZONTAL_DEAD_LOCK = -2;
	public static final int VERTICAL_DEAD_LOCK = -1;
	public static final int NO_DIRECTION = 0;
	public static final int NORTH = 1;
	public static final int NORTH_EAST = 2;
	public static final int EAST = 3;
	public static final int SOUTH_EAST = 4;
	public static final int SOUTH = 5;
	public static final int SOUTH_WEST = 6;
	public static final int WEST = 7;
	public static final int NORTH_WEST = 8;
	
	private int direction;

	public int getValue()
	{
		return direction;
	}

	public void setValue(int direction)
	{
		this.direction = direction;
	}
	
	public boolean facingHorizontalDeadlock()
	{
		return getValue() == HORIZONTAL_DEAD_LOCK;
	}
	
	public boolean facingVerticalDeadlock()
	{
		return getValue() == VERTICAL_DEAD_LOCK;
	}
	
	public boolean facingNothing()
	{
		return getValue() == NO_DIRECTION;
	}
	
	public boolean facingNorth()
	{
		return getValue() == NORTH;
	}
	
	public boolean facingNorthEast()
	{
		return getValue() == NORTH_EAST;
	}
	
	public boolean facingEast()
	{
		return getValue() == EAST;
	}
	
	public boolean facingSouthEast()
	{
		return getValue() == SOUTH_EAST;
	}
	
	public boolean facingSouth()
	{
		return getValue() == SOUTH;
	}
	
	public boolean facingSouthWest()
	{
		return getValue() == SOUTH_WEST;
	}
	
	public boolean facingWest()
	{
		return getValue() == WEST;
	}
	
	public boolean facingNorthWest()
	{
		return getValue() == NORTH_WEST;
	}
	
	public String toString()
	{
		return "Direction: " + direction;
	}
	
}
