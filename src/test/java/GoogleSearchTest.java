import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    private GoogleSearchPage googleSearchPage;
    private String chromeDriverPath;

    @BeforeClass
    @Parameters("webdriver.chrome.driver")
    public void setUp(@Optional String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
        googleSearchPage = new GoogleSearchPage();
        googleSearchPage.openGoogle();

    }
        @Test
        public void testGoogleSearch () {

            googleSearchPage.enterSearchQuery("libertex group");
            googleSearchPage.submitSearch();
            googleSearchPage.checkSearchResultsContain("libertex group");
        }
    }

