package com.Platformer.engine;

import java.awt.event.MouseEvent;

//creates a game a=engine for further use
public class GameContainer implements Runnable{
	
	private Thread thread;
	private Window window;
	private Renderer renderer;
	private Input input;
	
	private boolean running = false;
	private final double UPDATE_CAP = 1.0/60.0;
	private int width = 320, height = 240;
	private float scale = 3f;
	private String title = "Platform";
	
	public GameContainer() {
		
	}
	public void start() {
		window = new Window(this);
		renderer = new Renderer(this);
		input = new Input(this);
		
		thread = new Thread(this);
		thread.run();
	}
	public void stop() {
		
	}
	public void run() {
		running = true;
		
		boolean render = false;
		double firstTime = 0;
		double lastTime = System.nanoTime() / 1000000000.0;
		double passedTime = 0;
		double unprocessedTime = 0;
		
		
		double frameTime = 0;
		int frames = 0;
		int fps = 0;
		
		
		while(running) {
			render = false;
			firstTime = System.nanoTime() / 1000000000.0;
			passedTime = firstTime - lastTime;
			lastTime = firstTime;
			
			unprocessedTime += passedTime;
			frameTime += passedTime;
			
			while(unprocessedTime >= UPDATE_CAP) {
				unprocessedTime -= UPDATE_CAP;
				render = true;
				
				//TODO: update the game
				if(input.isButton(MouseEvent.BUTTON1)) {
					System.out.println("A");
				}
				input.update();
				
				
				if(frameTime >= 1.0) {
					frameTime = 0;
					fps = frames;
					frames = 0;
					System.out.println("FPS " + fps);
					
				}
			}
			
			if(render) {
				renderer.clear();
				//render the game
				window.update();
				frames++;
			}
			else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		dispose();
		
	}
	private void dispose() {
		
	}
	
	public static void main(String args[]) {
		GameContainer gc = new GameContainer();
		gc.start();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public float getScale() {
		return scale;
	}
	public void setScale(float scale) {
		this.scale = scale;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Window getWindow() {
		return window;
	}
}


