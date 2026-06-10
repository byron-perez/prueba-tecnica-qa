package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {
    @Step("Buscar '{0}'")
    public void byKeyword(String keyword) {
        $("#searchbox_homepage input[type='text']").sendKeys(keyword, Keys.ENTER);
    }
}
