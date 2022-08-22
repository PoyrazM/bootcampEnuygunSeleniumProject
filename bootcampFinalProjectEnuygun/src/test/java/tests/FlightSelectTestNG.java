package tests;

import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import parameters.IParameters;

@Slf4j
public class FlightSelectTestNG extends BaseTest{

    @Test(priority = 1)
    @Description("User checks to Origin Input Title , ie Nereden")
    void validateToOriginFieldTitle(){
        log.info("Checking : Origin Input File");
        try {
            Assert.assertEquals(homePage.getOriginInputTitle().getText() , "Nereden");
        }catch (NoSuchElementException exception){
            System.out.println("Origin Input Title element was not found , please check HomePage for this element"
                    +exception.getMessage());
        }

    }

    @Test(priority = 2)
    @Description("User writes Origin Key in the Origin Input Field")
    void validateSendKeysToOriginField(){
        log.info("Writing : Origin Parameter");
        try{
            Assert.assertTrue(homePage.getOriginInputField().getText().isEmpty());
            Assert.assertTrue(homePage.getOriginInputField().isDisplayed());
            homePage.sendKeysToOriginInputField(IParameters.ORIGIN);
        }catch (NoSuchElementException exception){
            System.out.println("Origin Input element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 3)
    @Description("User clicks first origin element")
    void validateClickToFirstPickForOriginField(){
        log.info("Clicking : First Origin Data");
        try{
            Assert.assertTrue(homePage.getFirstPickForInputFields().get(0).isDisplayed());
            homePage.clickToFirstOriginData();
        }catch (NoSuchElementException exception){
            System.out.println("First element was not found for Origin Input Field , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 4)
    @Description("User checks to Destination Input Title , ie Nereye")
    void validateToDestinationFieldTitle(){
        log.info("Checking : Destination Input Title");
        try{
            Assert.assertEquals(homePage.getDestinationInPutTitle().getText() , "Nereye");
        }catch (NoSuchElementException exception){
            System.out.println("Destination Input Title element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 5)
    @Description("User writes Destination Key in the Destination Input Field")
    void validateSendKeysToDestinationField(){
        log.info("Writing : Destination Parameter");
        try{
            Assert.assertTrue(homePage.getDestinationInputField().getText().isEmpty());
            Assert.assertTrue(homePage.getDestinationInputField().isDisplayed());
            homePage.sendKeysToDestinationInputField(IParameters.DESTINATION);
        }catch (NoSuchElementException exception){
            System.out.println("Destination Input element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 6)
    @Description("User clicks first destination element")
    public void validateClickToFirstPickForDestinationField(){
        log.info("Clicking : First Destination Data");
        try {
            Assert.assertTrue(homePage.getFirstPickForInputFields().get(0).isEnabled());
            homePage.clickToFirstDestinationData();
        }catch (NoSuchElementException exception){
            System.out.println("First element was not found for Destination Input Field , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 7)
    @Description("User checks to Departure calendar title")
    void validateDepartureCalendarTitle(){
        log.info("Checking : Departure Calendar Title , ie Gidiş Tarihi");
        try{
            Assert.assertEquals(homePage.getDepartureCalendarTitle().getText() , "Gidiş Tarihi");
        }catch (NoSuchElementException exception){

        }
    }

    @Test(priority = 8)
    @Description("User clicks Departure Date Field")
    void validateClickToDepartureCalendarField(){
        log.info("Clicking : Departure Date Picker");
        try{
            Assert.assertTrue(homePage.getDepartureDateField().isDisplayed());
            homePage.clickToDepartureDayCalendarField();
        }catch (NoSuchElementException exception){
            System.out.println("Departure Date element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 9)
    @Description("User clicks to Today + Added day")
    void validateClickForTheDaysAddedToToday(){
        log.info("Clicking : Today + Added Day Parameter");
        try{
            homePage.clickForTheDaysAddedToToday(IParameters.DEPARTURE_DAY);
        }catch (NoSuchElementException exception){
            System.out.println("Today is not selected because element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 10)
    @Description("User checks Departure Calender Title , ie Dönüş Tarihi")
    void validateReturnCalendarTitle(){
        log.info("Checking : Departure Calendar Title");
        try{
            Assert.assertEquals(homePage.getDepartureCalendarTitle().getText() , "Dönüş Tarihi");
        }catch (NoSuchElementException exception){
            System.out.println("Departure calendar title element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 11)
    @Description("User clicks to Departure Calendar Field")
    void validateClickToReturnDayCalendarField(){
        log.info("Clicking : Departure Calendar Field");
        try{
            Assert.assertTrue(homePage.getReturnDateField().isDisplayed());
            homePage.clickToReturnDayCalendarField();
        }catch (NoSuchElementException exception){
            System.out.println("Return Date element was not found , please check HomePage for this element"
                    +exception.getMessage());
        }
    }

    @Test(priority = 12)
    @Description("User clicks to Departure Day + Added days parameter")
    public void validateClickForTheDaysAddedToReturnDay(){
        log.info("Clicking : Departure Day + Added days");
        try{
            homePage.clickForTheDaysAddedToReturnDay(IParameters.RETURN_DAY);
        }catch (NoSuchElementException exception){
            System.out.println("Return Date is not selected because element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 13)
    @Description("If user wants to filter flights for transit , clicks to Aktarmasız checkbox")
    public void validateIsDirectCheckBoxClick(){
        log.info("Clicking : Is Direct is equal to true , clicking Transit Filter checkbox");
        try{
            Assert.assertTrue(homePage.getTransitFilterCheckBox().isDisplayed());
            Assert.assertEquals(homePage.getTransitFilterText().getText() , "Aktarmasız");
            homePage.clickTransitFilterCheckBox(IParameters.IS_DIRECT);
        }catch (NoSuchElementException exception){
            System.out.println("Transit Filter Checkbox element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 14)
    @Description("User clicks to Submit Button , ie Ucuz bilet bul button")
    public void validateClickToSubmitButton(){
        log.info("Clicking : Submit Button");
        try{
            Assert.assertTrue(homePage.getSubmitButton().isDisplayed());
            Assert.assertEquals(homePage.getSubmitButton().getText() , "Ucuz bilet bul");
            homePage.clickToSubmitButton();
        }catch (NoSuchElementException exception){
            System.out.println("Submit Button element was not found , please check HomePage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 15)
    @Description("User selects Origin Provider flight for the booking step")
    void validateToSelectWithOriginProvider(){
        log.info("Selecting : Flight for Provider parameter --> Origin");
        try {
            try {
                flightResultsPage.selectWithOriginProvider(IParameters.ORIGIN_PROVIDER, IParameters.INDEX_ORIGIN);
            } catch (NoSuchElementException exception) {
                System.out.println("Origin Provider element was not found , please check FlightResultPage for this element"
                +exception.getMessage());
            }
        }catch (IndexOutOfBoundsException exception){
                System.out.println("Sometimes provider can changing , so firstly check provider website for to the desired provider flights"
                +exception.getMessage());
        }
    }

    @Test(priority = 16)
    @Description("User selects Destination Provider flight for the booking second step")
    void validateToSelectWithDestinationProvider() {
        log.info("Selecting : Flight for Provider parameter --> Destination");
        try{
            try{
                flightResultsPage.selectWithDestinationProvider(IParameters.DESTINATION_PROVIDER , IParameters.INDEX_DESTINATION);
            }catch (NoSuchElementException exception){
                System.out.println("Destination Provider element was not found , please check FlightResultPage for this element");
            }
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Sometimes provider can changing , so firstly check provider website for to the desired provider flights"
            +exception.getMessage());
        }
    }

    @Test(priority = 17)
    @Description("User clicks to Select button after selected flights")
    void validateClickToActiveSelectButton() {
        log.info("Clicking : Select Button");
        try{
            Assert.assertEquals(flightResultsPage.getFlightSelectButton().getText(),"Seç");
            flightResultsPage.clickToActiveSelectButton();
        }catch (NoSuchElementException exception){
            System.out.println("Select Button element was not found , please check FlightResultPage for this element"
            +exception.getMessage());
        }
    }

    @Test(priority = 18)
    @Description("User checks Payload Text after flights booking")
    void validateToInsidePayPage(){
        log.info("Checking : Payload Text");
        try{
            Assert.assertEquals(payPage.getPayText().getText() , "Bilgilerini Gir");
        }catch (NoSuchElementException exception){
            System.out.println("Payload text element was not found , please PayloadPage for this element"
            +exception.getMessage());
        }
    }
}
