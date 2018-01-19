package com.Platformer.game;

import com.Platformer.engine.AbstractGame;
import com.Platformer.engine.GameContainer;
import com.Platformer.engine.Renderer;
import com.Platformer.engine.gfx.Image;
import com.sun.glass.events.KeyEvent;

public class GameManager extends AbstractGame{

	private Image image;
	public GameManager() {
		image = new Image("/test.png");
	}
	@Override
	public void update(GameContainer gc, float dt) {
		// TODO Auto-generated method stub
		
		if(gc.getInput().isKeyDown(KeyEvent.VK_W)) {
			System.out.println("HELLO");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		r.clear();
		// TODO Auto-generated method stub
		r.drawImage(image, gc.getInput().getMouseX()-32, gc.getInput().getMouseY()-32);
	}
	public static void main(String args[]) {
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}
}
