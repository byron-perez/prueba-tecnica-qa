package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    @Step("Navegar a la pagina principal.")
    public void toTheDuckDuckGoSearchPage() {
        openUrl("https://duckduckgo.com/");
    }
}
