package com.gamedesign.game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import com.gamedesign.game.gfx.SpriteSheet;

public class Game extends Canvas implements Runnable{

	/**
	 * 
	 */
	
	//variables
	private static final long serialVersionUID = 1L; //given by eclipse
	
	//the size of the window and scale
	public static final int WIDTH = 160;
	public static int HEIGHT = WIDTH / 12 * 9;
	public static final int SCALE = 3;
	
	
	//the name of the window
	public static final String NAME = "GAME";
	
	
	
	//creates a new JFrame used to make the game window
	private JFrame frame;
	
	//more variables
	public boolean running = false;
	public int tickCount = 0;
	
	
	private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
	
	private SpriteSheet spriteSheet = new SpriteSheet("/sprite_sheet.png");
	
	
	
	
	
	public Game() {
		
		//creates the frame
		//sets the size
		setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		
		//creates jframe
		frame = new JFrame(NAME);
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	//starts the proram
	private synchronized void start() {
		running = true;
		new Thread(this).start();
		
	}
	
	//stops the program
	private synchronized void stop() {
		running = false;
		
	}
	
	
	//runs the programs
	public void run() {
		
		//makes the fps max 60
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D/60D;
		
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = true;
			while(delta >= 1) {
				ticks ++;
				tick();
				delta -= 1;
				shouldRender = true;
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(shouldRender) {
				frames ++;
				render();
			}
			

			
			if (System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
				System.out.println(frames + " " + ticks);
				frames = 0;
				ticks = 0;
			}
			
			
		}
	}
	
	//tick counter
	public void tick() {
		tickCount++;
		
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = i + tickCount;
		}
	}
	
	//renders the graphics
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.drawImage(image, 0, 0, getWidth(),getHeight(),null);
		
		g.dispose();
		bs.show();
	}
	
	// when the project is opened starts the game
	public static void main(String[] args) {
		new Game().start();
	}
	
}
