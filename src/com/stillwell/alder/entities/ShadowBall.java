package com.stillwell.alder.entities;

import java.awt.Graphics;
import com.stillwell.alder.engine.core.Sprite;

public class ShadowBall extends Sprite
{

	Player p;
	public static boolean see;
	
	public ShadowBall(Player p)
	{
		super("shadowball2.png", 1, 1);
		this.p = p;
		setX(p.getX());
		setY(p.getY());
		setWidth(30);
		setHeight(30);
	}
	
	@Override
	public void paint(Graphics gc)
	{
		setX(p.getX() + 20);
		setY(p.getY() + 35);

		if(see)
		gc.drawImage(getCurrentFrame(), getX(), getY(), getWidth(), getHeight(), null);
	}
	
}
