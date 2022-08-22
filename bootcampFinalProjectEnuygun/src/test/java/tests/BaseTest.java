package tests;

import frameworksetup.ConfigReader;
import frameworksetup.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import pages.*;

// BaseTestimde classlarımı üretip Test koştuğum classta çağırabiliyorum , driverımı set ediyorum ve test sonrası driver kapatma işlemini tanımladım.
public class BaseTest {
    public static WebDriver driver;
    public static HomePage homePage;
    public static FlightResultsPage flightResultsPage;
    public static PayloadPage payPage;

    @BeforeClass
    void setup(){
        driver = DriverSetup.initialize_Driver(ConfigReader.initialize_Properties().get("browser").toString());
        homePage = new HomePage();
        flightResultsPage = new FlightResultsPage();
        payPage = new PayloadPage();
    }


    @AfterSuite
    void tearDown(){
        if (driver != null)
        {
            driver.quit();
        }
    }
}