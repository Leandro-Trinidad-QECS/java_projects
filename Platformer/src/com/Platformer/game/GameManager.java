package com.Platformer.game;

import com.Platformer.engine.AbstractGame;
import com.Platformer.engine.GameContainer;
import com.Platformer.engine.Renderer;
import com.sun.glass.events.KeyEvent;

public class GameManager extends AbstractGame{

	public GameManager() {
		
	}
	@Override
	public void update(GameContainer gc, float dt) {
		// TODO Auto-generated method stub
		if(gc.getInput().isKeyDown(KeyEvent.VK_A)) {
			System.out.println("HELLO");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}
}
