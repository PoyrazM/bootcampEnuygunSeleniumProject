package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static frameworksetup.DriverSetup.driver;

/*
FlightResultsPage için kullanacağım elementleri ve metotları burada tutuyorum
Getterları kullanarak assert işlemi de yapabiliyorum ayrıca
 */
@Data
public class FlightResultsPage extends BasePage{


    @FindBy(css = "[class='summary-transit']")
    private WebElement transitFlightsForTransferInfo;

    @FindBy(css = "[class='summary-transit direct']")
    private WebElement transitFlightsForDirectInfo;

    @FindBy(css = "[class='moreActionButton']")
    private List<WebElement> moreActionsButton;

    @FindBy(css = "[class='action-select-btn active btn btn-outline-success btn-sm']")
    private WebElement flightSelectButton;

    public void clickToMoreActionsButton(){
        this.moreActionsButton.get(0).click();
    }

    public void selectWithOriginProvider(String provider , int index){
      driver.findElements(By.cssSelector("[class='roundTrip departure'] [data-booking-provider='"+provider+"']")).get(index).click();
    }

    public void selectWithDestinationProvider(String provider , int index){
        driver.findElements(By.cssSelector("[class='roundTrip return active'] [data-booking-provider='"+provider+"']")).get(index).click();
    }

    public void clickToActiveSelectButton(){
        this.flightSelectButton.click();
    }
}
