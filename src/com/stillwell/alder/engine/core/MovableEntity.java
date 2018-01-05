package com.stillwell.alder.engine.core;

import java.awt.Color;
import com.stillwell.alder.engine.GameData;

public class MovableEntity extends Entity
{

	private Direction direction;

	public MovableEntity()
	{

		direction = new Direction();

		setX(0);
		setY(0);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
		setDirection(Direction.NO_DIRECTION);
	}

	public Direction getDirection()
	{
		return direction;
	}

	public void setDirection(int dir)
	{
		direction.setValue(dir);
	}

	public void moveUp()
	{
		shiftY(-GameData.MOVE_AMOUNT);
	}

	public void moveDown()
	{
		shiftY(GameData.MOVE_AMOUNT);
	}

	public void moveLeft()
	{
		shiftX(-GameData.MOVE_AMOUNT);
	}

	public void moveRight()
	{
		shiftX(GameData.MOVE_AMOUNT);
	}

	public void move()
	{

		switch(getDirection().getValue())
		{
		case 1:
			moveUp();
			break;
		case 2:
			moveUp();
			moveRight();
			break;
		case 3:
			moveRight();
			break;
		case 4:
			moveDown();
			moveRight();
			break;
		case 5:
			moveDown();
			break;
		case 6:
			moveDown();
			moveLeft();
			break;
		case 7:
			moveLeft();
			break;
		case 8:
			moveUp();
			moveLeft();
			break;
		default:
			//nothing
			break;
		}

	}

}
