package com.selenidetest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

import org.junit.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

public class GoogleTest {

	@Test
	public void userCanTestKeywordWithGoogle() {

		// 1. Open
		open("http://google.com");

		// 2. Type a word
		$(By.name("q")).setValue("Selenide").pressEnter();

		// 3. Assure 10 results
		$$("#ires li.g").shouldHave(size(10));
		System.out.println($("#ires li.g"));
		$("#ires li.g").shouldHave(Condition.text("selenide: concise UI tests in Java"));
	}

	@Test
	public void userCanLoginByUsername() {
	  open("/login");
	  $(By.name("user.name")).setValue("johny");
	  $("#submit").click();
	  $(".loading_progress").should(disappear); // Waits until element disappears
	  $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
	}

}
