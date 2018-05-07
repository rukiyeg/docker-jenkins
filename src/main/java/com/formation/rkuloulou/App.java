package com.formation.rkuloulou;

public class App {

	private final String message = "Hello c'est Rku et Loulou les BG de mtrg";

	public App() {
	}

	public static void main(String[] args) {
		System.out.println(new App().getMessage());
	}

	private final String getMessage() {
		return message;
	}
}
