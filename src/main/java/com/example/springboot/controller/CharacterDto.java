package com.example.springboot.controller;

public class CharacterDto {
	
	private char simpleChar;
	
	public CharacterDto(char simpleChar) {
		this.simpleChar = simpleChar;
	}

	public char getSimpleChar() {
		return simpleChar;
	}

	public void setSimpleChar(char simpleChar) {
		this.simpleChar = simpleChar;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.simpleChar);
	}
	
}
