package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

// HomePage elementleri ve metotları burada tutulmuştur.
@Data
public class HomePage extends BasePage{

    @FindBy(css = "[for='OriginInput']")
    private WebElement originInputTitle;

    @FindBy(id = "OriginInput")
    private WebElement originInputField;

    @FindBy(css = "[for='DestinationInput']")
    private WebElement destinationInPutTitle;

    @FindBy(id = "DestinationInput")
    private WebElement destinationInputField;

    @FindBy(css = "[class='suggestion_item']")
    private List<WebElement> firstPickForInputFields;

    @FindBy(css = "for=['DepartureDate']")
    private WebElement departureCalendarTitle;

    @FindBy(id = "DepartureDate")
    private WebElement departureDateField;

    @FindBy(id = "ReturnDate")
    private WebElement returnDateField;

    @FindBy(css = "[aria-disabled='false'] [class='CalendarDay__content']")
    private List<WebElement> calendarAvailableFields;

    @FindBy(css = "[aria-label='Move forward to switch to the next month.']")
    private WebElement calendarForwardButton;

    @FindBy(id = "transitFilter")
    private WebElement transitFilterCheckBox;

    @FindBy(css = "[for='transitFilter']")
    private WebElement transitFilterText;

    @FindBy(css = "[data-testid='formSubmitButton']")
    private WebElement submitButton;


    public void sendKeysToOriginInputField(String origin){
         this.originInputField.sendKeys(origin);
    }

    public void clickToFirstOriginData(){
        this.firstPickForInputFields.get(0).click();
    }

    public void sendKeysToDestinationInputField(String destination){
        this.destinationInputField.sendKeys(destination);
    }

    public void clickToFirstDestinationData(){
        this.firstPickForInputFields.get(0).click();
    }

    public void clickToDepartureDayCalendarField(){
        this.departureDateField.click();
    }

    public void clickForTheDaysAddedToToday(int departureDays){
        this.calendarAvailableFields.get(0+departureDays).click();
    }

    public void clickToReturnDayCalendarField(){
        this.returnDateField.click();
    }

    public void clickForTheDaysAddedToReturnDay(int destinationDays){
        this.calendarAvailableFields.get(0+destinationDays).click();
    }

    public boolean clickTransitFilterCheckBox(boolean isDirect){
        if (isDirect){
            this.transitFilterCheckBox.click();
        }
        return isDirect;
    }

    public void clickToSubmitButton(){
        this.submitButton.click();
    }
}
