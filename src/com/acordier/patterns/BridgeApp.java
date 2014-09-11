package com.acordier.patterns;

public class BridgeApp {

	public static void main(String[]args){
		Shape square = new Square(new BlueColor());
		square.applyColor();
	}
}
