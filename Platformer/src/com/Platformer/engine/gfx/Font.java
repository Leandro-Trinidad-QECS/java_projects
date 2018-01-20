package com.Platformer.engine.gfx;

public class Font {
	
	private Image fontImage;
	private int[] offsets;
	private int[] widths;
	public Font(String path) {
		
		fontImage = new Image(path);
		offsets = new int[59];
		widths = new int[59];
		
		for(int i = 0; i < fontImage.getW(); i++) {
			if(fontImage.getP()[i] == 0xff0000ff) {
				offsets[unicode] = i;
			}
			
		}
		
	}
}
