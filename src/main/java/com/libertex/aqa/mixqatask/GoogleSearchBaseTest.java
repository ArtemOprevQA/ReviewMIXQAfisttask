package com.libertex.aqa.mixqatask;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class GoogleSearchBaseTest {

    @BeforeMethod
    public void openGoogle() {
        Selenide.open(System.getProperty("BASE_URL"));
    }
}
