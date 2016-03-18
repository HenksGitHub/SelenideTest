package com.myselenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Test;
import org.openqa.selenium.By;

public class SogetiTest {

	@Test
	public void testSogetiArchief_angular() {
		open("https://www.sogeti.nl/events/archief");
		$(By.id("edit-search-api-views-fulltext")).val("angular").pressEnter();
		$("#content").exists();
//		$(By.xpath("//div[class()='content-entry']")).exists();
	}
/*
	@Test
	public void testSogetiArchief_java() {
		open("https://www.sogeti.nl/events/archief");
		$(By.id("edit-search-api-views-fulltext")).val("java").pressEnter();
		$("#content").exists();
	}

	@Test
	public void testSogetiArchief_sjlhfdslkhs() {
		open("https://www.sogeti.nl/events/archief");
		$(By.id("edit-search-api-views-fulltext")).val("sjlhfdslkhs").pressEnter();
		$("#content").exists();
	}
*/
}
