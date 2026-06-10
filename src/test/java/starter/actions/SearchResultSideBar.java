package starter.actions;

import net.serenitybdd.core.pages.PageComponent;

import java.time.Duration;

public class SearchResultSideBar extends PageComponent {
    public String heading() {
        return $("[data-testid='about'] h2")
                .withTimeoutOf(Duration.ofSeconds(5))
                .waitUntilVisible()
                .getText();
    }
}
