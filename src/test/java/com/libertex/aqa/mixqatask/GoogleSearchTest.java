package com.libertex.aqa.mixqatask;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest extends GoogleSearchBaseTest {
    private GoogleSearchPage googleSearchPage;

    @BeforeClass
    public void setUp() {
        googleSearchPage = new GoogleSearchPage();
    }

    @Test
    @Description("Test of google search page")
    @Step("Perform a search on opened page and verify that search result contains 'libertex group'")
    public void testGoogleSearch() {
        googleSearchPage.search("libertex group");
        googleSearchPage.checkSearchResultsContain("libertex group");
    }
}

