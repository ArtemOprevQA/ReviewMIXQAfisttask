import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchPage {
    private SelenideElement searchInput = $(byName("q"));
    private SelenideElement searchResults = $("#rso");

    public void openGoogle() {
        open("https://www.google.com");
    }

    public void enterSearchQuery(String query) {
        searchInput.setValue(query);
    }

    public void submitSearch() {
        searchInput.pressEnter();
    }

    public void checkSearchResultsContain(String query) {
        searchResults.shouldHave(Condition.text(query));
    }
}
