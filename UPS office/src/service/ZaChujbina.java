package service;

public class ZaChujbina extends Employee {

	public void ZaChujBina(String message) {
		
		this.level = Employee.ZACHUJBINA;
	
	}

	@Override
	protected void writeMessage(String message) {
		
		System.out.println("Paketa e za Chujbina " + message);
		

	}

}
