package com.petshoptest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Test;
import org.openqa.selenium.By;

public class PetShopTests {

	@Test
	public void petShopTest() {
		open("localhost:8080");
		$(By.name("search.nameOrDesc")).val("kk").pressEnter();
		
//		System.out.println("Tests");

	}
}
