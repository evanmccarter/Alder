package com.stillwell.alder.engine.core;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite extends Entity
{

	private BufferedImage[] frames;
	private static int currentFrame;

	public Sprite(String fileName, int numRows, int numCols)
	{
		init(fileName, numRows, numCols);
	}

	private void init(String fileName, int numRows, int numCols)
	{
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(new File("res/" + fileName));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		final int totalW = image.getWidth();
		final int totalH = image.getHeight();

		int width = totalW / numCols;
		int height = totalH / numRows;
		frames = new BufferedImage[numRows * numCols];

		for (int i = 0; i < numRows; i++)
		{
			for (int j = 0; j < numCols; j++)
			{
				frames[(i * numCols) + j] = image.getSubimage(
						j * width,
						i * height,
						width,
						height
						);
			}
		}	
	}
	
	public BufferedImage[] getFrames()
	{
		return frames;
	}
	
	public BufferedImage getCurrentFrame()
	{
		return frames[currentFrame];
	}

	public void flipFrame()
	{
		currentFrame++;
		if(currentFrame >= frames.length)
			currentFrame = 0;
	}

	public void paint(Graphics gc)
	{
		gc.drawImage(frames[currentFrame], getX(), getY(), getWidth(), getHeight(), null);
	}

}
