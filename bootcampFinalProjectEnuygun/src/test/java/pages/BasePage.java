package pages;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static frameworksetup.DriverSetup.driver;
@Data
public class BasePage {
    public static WebDriverWait wait;
    public static JavascriptExecutor jse;

    // Base Page sadece yapıcı döndürmek için kurulmuştur.
    public BasePage(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        jse = (JavascriptExecutor) driver;
    }

    protected ExpectedCondition<WebElement> waitForElement(WebElement element){
        return ExpectedConditions.visibilityOf(element);
    }
}