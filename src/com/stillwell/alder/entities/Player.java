package com.stillwell.alder.entities;

import com.stillwell.alder.engine.core.MovableSprite;

public class Player extends MovableSprite
{

	private int duckFrameStart = 0, duckFrameEnd = 3;
	private int jumpFrameStart = 4, jumpFrameEnd = 7;
	private int leftFrameStart = 8, leftFrameEnd = 11;
	private int rightFrameStart = 12, rightFrameEnd = 15;

	private boolean movingRight, movingLeft, jumping, ducking;
	
	public Player()
	{
		super("player2.png", 4, 4);
		setX(20);
		setY(10);
		setWidth(60);
		setHeight(80);
	}
	
	public boolean isMoving()
	{
		return isMovingRight() || isMovingLeft() || isJumping() || isDucking();
	}
	
	public boolean isMovingRight()
	{
		return movingRight;
	}
	
	public boolean isMovingLeft()
	{
		return movingLeft;
	}
	
	public boolean isJumping()
	{
		return jumping;
	}
	
	public boolean isDucking()
	{
		return ducking;
	}
	
	public boolean isRightFrame()
	{
		return ((currentFrame >= rightFrameStart) &&
				(currentFrame <= rightFrameEnd));
	}
	
	public boolean isLeftFrame()
	{
		return ((currentFrame >= leftFrameStart) &&
				(currentFrame <= leftFrameEnd));
	}
	
	public boolean isJumpingFrame()
	{
		return ((currentFrame >= jumpFrameStart) &&
				(currentFrame <= jumpFrameEnd));
	}
	
	public boolean isDuckingFrame()
	{
		return ((currentFrame >= duckFrameStart) &&
				(currentFrame <= duckFrameEnd));
	}
	
	public void setMovingLeft(boolean b)
	{
		movingLeft = b;
	}
	
	public boolean getMovingLeft()
	{
		return movingLeft;
	}
	
	public void setMovingRight(boolean b)
	{
		movingRight = b;
	}
	
	public boolean getMovingRight()
	{
		return movingRight;
	}
	
	public void setJumping(boolean b)
	{
		jumping = b;
	}
	
	public boolean getJumping()
	{
		return jumping;
	}
	
	public void setDucking(boolean b)
	{
		ducking = b;
	}
	
	public boolean getDucking()
	{
		return ducking;
	}
	
	@Override
	public void flipFrame()
	{
		System.out.println(currentFrame);
		
//		System.out.println(currentFrame);
//		System.out.println(ducking + "   " + movingLeft + "   " + movingRight + "   " + jumping);
		
		if(ducking && isDuckingFrame())
		{
			currentFrame++;
			if(currentFrame > duckFrameEnd)
				currentFrame = duckFrameStart;
		}
		else if(ducking && !isDuckingFrame())
			currentFrame = duckFrameStart;
		
		
		if(jumping && isJumpingFrame())
		{
			currentFrame++;
			if(currentFrame > jumpFrameEnd)
				currentFrame = jumpFrameStart;
		}
		else if(jumping && !isJumpingFrame())
			currentFrame = jumpFrameStart;
		
		
		if(movingLeft && isLeftFrame())
		{
			currentFrame++;
			if(currentFrame > leftFrameEnd)
				currentFrame = leftFrameStart;
		}
		else if(movingLeft && !isLeftFrame())
			currentFrame = leftFrameStart;
		
		
		if(movingRight && isRightFrame())
		{
			currentFrame++;
			if(currentFrame > rightFrameEnd)
				currentFrame = rightFrameStart;
		}
		else if(movingRight && !isRightFrame())
			currentFrame = rightFrameStart;
		
		
	}

}
