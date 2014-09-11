package com.acordier.patterns;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.printf("%s - Color: %s\n", this.getClass().getName(), color.getClass().getSimpleName());	
		color.applyColor();
	}

}
