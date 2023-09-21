package com.libertex.aqa.mixqatask;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;

public class GoogleSearchBaseTest {

    @BeforeClass
    public void openGoogle() {
        Selenide.open(System.getProperty("BASE_URL"));
    }
}
