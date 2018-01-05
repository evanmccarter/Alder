package com.stillwell.alder.engine.listeners;
import java.awt.event.KeyEvent;
import com.stillwell.alder.engine.core.Direction;
import com.stillwell.alder.entities.Player;
import com.stillwell.alder.entities.ShadowBall;
import com.stillwell.alder.menu.Panel;
import com.stillwell.olympus.hermes.keys.Keys;


public class GameKeys extends Keys
{

	Panel panel;
	Player player;

	public GameKeys(Panel pan)
	{
		super();
		panel = pan;
		player = panel.getPlayer();
	}

	public void keyPressed(KeyEvent e)
	{

		super.keyPressed(e);

		if(upPressed() && downPressed())
		{
			player.setDirection(Direction.VERTICAL_DEAD_LOCK);
		}
		else if(leftPressed() && rightPressed())
		{
			player.setDirection(Direction.HORIZONTAL_DEAD_LOCK);
		}
		else if(upPressed() && rightPressed())
		{
			player.setDirection(Direction.NORTH_EAST);
		}
		else if(upPressed() && leftPressed())
		{
			player.setDirection(Direction.NORTH_WEST);
		}
		else if(downPressed() && rightPressed())
		{
			player.setDirection(Direction.SOUTH_EAST);
		}
		else if(downPressed() && leftPressed())
		{
			player.setDirection(Direction.SOUTH_WEST);
		}
		else if(upPressed())
			player.setDirection(Direction.NORTH);
		else if(rightPressed())
			player.setDirection(Direction.EAST);
		else if(downPressed())
			player.setDirection(Direction.SOUTH);
		else if(leftPressed())
			player.setDirection(Direction.WEST);


		if(upPressed())
			player.setJumping(true);
		if(downPressed())
			player.setDucking(true);
		if(leftPressed())
			player.setMovingLeft(true);
		if(rightPressed())
			player.setMovingRight(true);

		if(pressed("SPACE"))
			ShadowBall.visible = true;

		if(pressed("ESC"))
			System.exit(0);

		//				panel.repaint();

	}

	public void keyReleased(KeyEvent e)
	{
		super.keyReleased(e);

		if(player.getDirection().facingNorth() && upReleased())
			player.setDirection(Direction.NO_DIRECTION);
		if(player.getDirection().facingEast() && rightReleased())
			player.setDirection(Direction.NO_DIRECTION);
		if(player.getDirection().facingSouth() && downReleased())
			player.setDirection(Direction.NO_DIRECTION);
		if(player.getDirection().facingWest() && leftReleased())
			player.setDirection(Direction.NO_DIRECTION);


		if(player.getDirection().facingNorthEast() && upReleased())
			player.setDirection(Direction.EAST);
		if(player.getDirection().facingNorthEast() && rightReleased())
			player.setDirection(Direction.NORTH);

		if(player.getDirection().facingSouthEast() && downReleased())
			player.setDirection(Direction.EAST);
		if(player.getDirection().facingSouthEast() && rightReleased())
			player.setDirection(Direction.SOUTH);

		if(player.getDirection().facingSouthWest() && downReleased())
			player.setDirection(Direction.WEST);
		if(player.getDirection().facingSouthWest() && leftReleased())
			player.setDirection(Direction.SOUTH);

		if(player.getDirection().facingNorthWest() && upReleased())
			player.setDirection(Direction.WEST);
		if(player.getDirection().facingNorthWest() && leftReleased())
			player.setDirection(Direction.NORTH);


		if(player.getDirection().facingHorizontalDeadlock() && leftReleased())
			player.setDirection(Direction.EAST);
		if(player.getDirection().facingHorizontalDeadlock() && rightReleased())
			player.setDirection(Direction.WEST);
		if(player.getDirection().facingVerticalDeadlock() && upReleased())
			player.setDirection(Direction.SOUTH);
		if(player.getDirection().facingVerticalDeadlock() && downReleased())
			player.setDirection(Direction.NORTH);

		if(upReleased())
			player.setJumping(false);
		if(downReleased())
			player.setDucking(false);
		if(leftReleased())
			player.setMovingLeft(false);
		if(rightReleased())
			player.setMovingRight(false);

	}

	public void keyTyped(KeyEvent e){}

	public boolean upPressed()
	{
		return pressed("w") || pressed("W");
	}

	public boolean downPressed()
	{
		return pressed("s") || pressed("S");
	}

	public boolean leftPressed()
	{
		return pressed("a") || pressed("A");
	}

	public boolean rightPressed()
	{
		return pressed("d") || pressed("D");
	}

	public boolean upReleased()
	{
		return unpressed("w") || unpressed("W");
	}

	public boolean downReleased()
	{
		return unpressed("s") || unpressed("S");
	}

	public boolean leftReleased()
	{
		return unpressed("a") || unpressed("A");
	}

	public boolean rightReleased()
	{
		return unpressed("d") || unpressed("D");
	}

}
