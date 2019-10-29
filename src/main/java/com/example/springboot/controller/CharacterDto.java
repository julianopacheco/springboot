package com.example.springboot.controller;

public class CharacterDto {
	
	private String simpleChar;
	private String stringValue;
	private Integer intValue;
	
	public CharacterDto(String simpleChar) {
		this.simpleChar = simpleChar;
	}

	public String getSimpleChar() {
		return simpleChar;
	}

	public void setSimpleChar(String simpleChar) {
		this.simpleChar = simpleChar;
	}
	
	public String getStringValue() {
		return stringValue;
	}
	
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %d", this.simpleChar, this.stringValue, this.intValue);
	}
	
}
