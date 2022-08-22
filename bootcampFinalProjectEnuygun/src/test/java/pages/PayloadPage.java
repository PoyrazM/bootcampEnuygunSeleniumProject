package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// PayloadPage Elementi burada tutulmuştur.
@Data
public class PayloadPage extends BasePage{

    @FindBy(css = "[class='active  middle-step tr'] [class='step-texts']")
    private WebElement payText;
}
