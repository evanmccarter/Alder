package com.stillwell.alder.menu;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import com.stillwell.alder.entities.Background;
import com.stillwell.alder.entities.Player;
import com.stillwell.alder.entities.ShadowBall;

public class Panel extends JPanel implements ActionListener
{

	private static final long serialVersionUID = 1L;

	Background back;
	Player player;
	ShadowBall ball;

	public Panel()
	{
		back = new Background();
		player = new Player();
		ball = new ShadowBall(player);
	}

	public Player getPlayer()
	{
		return player;
	}

	public void paint(Graphics gc)
	{
		back.paint(gc);
		ball.paint(gc);
		player.paint(gc);
	}

	int count = 0;
	public void actionPerformed(ActionEvent e)
	{
		count++;
		player.move();

		if(count % 20 == 0)
		{
			back.flipFrame();
			ball.flipFrame();
			player.flipFrame();
		}

		repaint();
	}	
}
