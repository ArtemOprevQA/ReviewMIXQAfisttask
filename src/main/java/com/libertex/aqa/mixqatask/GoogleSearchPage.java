package com.libertex.aqa.mixqatask;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {
    private SelenideElement searchInput = $(By.id("APjFqb"));
    private SelenideElement searchButton = $(By.name("btnK"));
    private SelenideElement searchResults = $("#rso");


    public void search(String query) {
        searchInput.setValue(query);
        searchButton.click();
    }

    public void checkSearchResultsContain(String query) {
        searchResults.shouldHave(Condition.text(query));
    }
}
