package com.acordier.patterns;

public class Triangle extends Shape {

	
	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.printf("%s - Color: %s\n", this.getClass().getName(), color.getClass().getSimpleName());
		color.applyColor();
	}

}
