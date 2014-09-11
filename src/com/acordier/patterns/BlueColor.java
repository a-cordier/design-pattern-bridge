package com.acordier.patterns;

public class BlueColor implements Color {

	private String colorName;
	
	public BlueColor() {
		this.colorName = "blue";
	}
	
	@Override
	public void applyColor() {
		System.out.printf("%s - apply color: %s\n", this.getClass().getName(), colorName);
	}
}
