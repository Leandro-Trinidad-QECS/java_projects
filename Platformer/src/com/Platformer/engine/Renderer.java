package com.Platformer.engine;

import java.awt.image.DataBufferInt;

public class Renderer {
	
	//pixel with and height
	private int pW, pH;
	private int[] p;
	public Renderer(GameContainer gc) {
		pW = gc.getWidth();
		pH = gc.getHeight();
		p = ((DataBufferInt)gc.getWindow().getImage().getRaster().getDataBuffer()).getData();
		
	}
	
	public void clear() {
		for(int i = 0; i < p.length; i ++) {
			p[i] += 0;
		}
	}

}
