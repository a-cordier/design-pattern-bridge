package com.acordier.patterns;

public class RedColor implements Color {

	private String colorName;
	
	public RedColor(){
		this.colorName = "red";
	}
	@Override
	public void applyColor() {
		System.out.printf("%s - apply color: %s\n", this.getClass().getName(), colorName);
	}

}
