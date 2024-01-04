package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class Cartpage {

	private By email = By.id("Index.id");
	
	public void addCart() {
		System.out.println("My Id is:" + email);
	}
}
