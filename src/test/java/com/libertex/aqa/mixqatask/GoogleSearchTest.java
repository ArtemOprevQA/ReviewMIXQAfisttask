package com.libertex.aqa.mixqatask;

import org.testng.annotations.Test;

public class GoogleSearchTest extends GoogleSearchBaseTest {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Test(description = "Test of Google search page")
    public void testGoogleSearch() {
        googleSearchPage.search("libertex group");
        googleSearchPage.checkSearchResultsContain("libertex group");
    }
}

