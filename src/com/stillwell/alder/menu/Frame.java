package com.stillwell.alder.menu;
import javax.swing.JFrame;
import javax.swing.Timer;

import com.stillwell.alder.engine.GameData;
import com.stillwell.alder.engine.listeners.GameKeys;

public class Frame extends JFrame
{

	private static final long serialVersionUID = 1L;

	public Timer clock;
	public Panel panel;
	public GameKeys keys;

	public Frame()
	{
		panel = new Panel();
		clock = new Timer(GameData.DELAY, panel);
		keys = new GameKeys(panel);

		clock.start();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(GameData.WIDTH, GameData.HEIGHT);
		getContentPane().add(panel);
		addKeyListener(keys);

		//		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//		setUndecorated(true);

		setVisible(true);
	}	

	public static void main(String[] args)
	{
		new Frame();
	}
}
