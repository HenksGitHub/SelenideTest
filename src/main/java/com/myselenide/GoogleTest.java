package com.myselenide;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class GoogleTest {

	@Test
	public void search_selenide_in_google() {
		open("http://google.com");
		$(By.name("q")).val("selenide").pressEnter();
		$$("#ires li.g").shouldHave(size(10));
		$("#ires").find(By.linkText("selenide.org")).shouldBe(visible);
	}

	@Test
	public void another_search_selenide_in_google() {
		GooglePage page = open("http://google.com", GooglePage.class);
		page.searchFor("selenide");
		assertEquals(1, 1);
	}
}
