package components.impl;

import components.WebComponent;
import entities.SearchResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultItemComponent extends WebComponent {

    private static final By TITLE_SELECTOR = By.cssSelector(".a-link-normal.s-line-clamp-2");

    public SearchResultItemComponent(WebElement rootElement) {
        super(rootElement);
    }

    public SearchResultItem convertToSearchResultItem() {
        return new SearchResultItem(
                retrieveTitleText(),
                retrieveTitleHref()
        );
    }

    private String retrieveTitleHref() {
        return findElement(TITLE_SELECTOR).getAttribute("href");
    }

    private String retrieveTitleText() {
        return findElement(TITLE_SELECTOR).getText();
    }
}