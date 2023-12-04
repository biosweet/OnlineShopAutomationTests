package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class HummingBirdTShirtPage {

    private WebDriver driver;

    public HummingBirdTShirtPage(WebDriver driver) {
        this.driver = driver;
    }

    private By dropdown = By.id("group_1");
    private By itemHeading = By.xpath("//h1[@itemprop=\"name\"]");
    private By regularPrice = By.xpath("//span[@class=\"regular-price\"]");
    private By currentPrice = By.xpath("//span[@itemprop=\"price\"]");
    private By discountPercentage = By.xpath("//span[@class=\"discount discount-percentage\"]");
    private By productDescription = By.xpath("//div[@id=\"product-description-short-1\"]//span");
    private By productQuantityUp = By.xpath("//button[contains(@class,\"touchspin-up\")]");
    private By productQuantityDown = By.xpath("//button[contains(@class,\"touchspin-down\")]");
    private By quantityWanted = By.id("quantity_wanted");
    private By socialSharingUl = By.xpath("//div[@class=\"social-sharing\"] //ul");
    private By reassuranceBlock = By.xpath("//div[@id=\"block-reassurance\"] //ul");
    private By submitButton = By.xpath("//button[contains(@class,\"add-to-cart\")]");


    // internal method for selection the dropdown
    private Select selectDropdown() {
        return new Select(driver.findElement(dropdown));
    }

    // selects an option
    public void selectDropdownOption(String option) {
        selectDropdown().selectByVisibleText(option);
    }

    // lists the options
    public List<String> getOptionsList() {
        List<WebElement> listOfElements = selectDropdown().getOptions();
        return listOfElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    // counts the options
    public void getOptionsCount() {
        List<WebElement> listOfElements = selectDropdown().getOptions();
        System.out.println(listOfElements.size());
    }

    public String getHeading() {
        return driver.findElement(itemHeading).getText();
    }

    public String getRegularPrice() {
        return driver.findElement(regularPrice).getText();
    }

    public String getCurrentPrice() {
        return driver.findElement(currentPrice).getText();
    }

    public String getDiscountPercentage() {
        return driver.findElement(discountPercentage).getText();
    }

    public String getProductDescription() {
        return driver.findElement(productDescription).getText();
    }

    public void getQuantityUp() {
        driver.findElement(productQuantityUp).click();
    }

    public void getQuantityDown() {
        driver.findElement(productQuantityDown).click();
    }

    public void setQuantity(String number) {
        getQuantityClear();
        driver.findElement(quantityWanted).sendKeys(number);
    }

    public void getQuantityClear() {
        driver.findElement(quantityWanted).clear();
    }

    public void getQuantityUpMore() {
        for (int i = 0; i < 5; i++) {
            driver.findElement(productQuantityUp).click();
        }
    }

    public List <String> getSocialSharingOptions() {
        List<WebElement> socialMediaList = driver.findElement(socialSharingUl).findElements(By.tagName("li"));
        socialMediaList.size();
        return socialMediaList.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    public List <String> getReassuranceBlock(){
        List <WebElement> reassuranceList = driver.findElement(reassuranceBlock).findElements(By.tagName("li"));
        return reassuranceList.stream().map(e-> e.getText()).collect(Collectors.toList());
    }

    public AddedToShippingCartPage addedToShippingCart(){
        driver.findElement(submitButton).click();
        return new AddedToShippingCartPage(driver);
    }

}
