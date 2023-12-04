package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedToShippingCartPage {

    private WebDriver driver;

    public AddedToShippingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By modalTitle = By.id("myModalLabel");
    private By closeButton = By.xpath("//button[@aria-label=\"Close\"]");
    private By productImage = By.xpath("//img[@class=\"product-image\"]");
    private By productHeading = By.xpath("//h6[@class=\"h6 product-name\"]");
    private By productPrice = By.xpath("//p[@class=\"product-price\"]");
    private By size = By.xpath("//p[@class=\"product-price\"]//following::span[1]");
    private By color = By.xpath("//p[@class=\"product-price\"]//following::span[2]");
    private By quantity = By.xpath("//p[@class=\"product-price\"]//following::span[3]");
    private By subtotalHeading = By.xpath("//p[@class=\"product-price\"]//following::span[4]");
    private By subtotalPrice = By.xpath("//p[@class=\"product-price\"]//following::span[5]");
    private By shippingHeading = By.xpath("//p[@class=\"product-price\"]//following::span[6]");
    private By shippingPrice = By.xpath("//p[@class=\"product-price\"]//following::span[7]");
    private By totalTaxExcl = By.xpath("//p[@class=\"product-price\"]//following::span[8]");
    private By totalTaxExclPrice = By.xpath("//p[@class=\"product-price\"]//following::span[9]");
    private By totalTaxIncl = By.xpath("//p[@class=\"product-price\"]//following::span[10]");
    private By totalTaxInclPrice = By.xpath("//p[@class=\"product-price\"]//following::span[11]");
    private By taxesHeading = By.xpath("//p[@class=\"product-tax\"]");
    private By taxesAllprice = By.xpath("//p[@class=\"product-price\"]//following::span[12]");
    private By continueShoppingButton = By.xpath("//button[text()=\"Continue shopping\"]");
    private By proceedToCheckoutButton = By.xpath("//a[text()=\"Proceed to checkout\"]");


    public String getModalTitle() {
        return driver.findElement(modalTitle).getText();
    }

    public void clickCloseButton() {
        driver.findElement(closeButton).click();
    }

    public String getItemLink() {
        return driver.findElement(productImage).getAttribute("src");
    }

    public String getImageAltName() {
        return driver.findElement(productImage).getAttribute("alt");
    }

    public String getImageHeading() {
        return driver.findElement(productHeading).getText();
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    public String getSize() {
        return driver.findElement(size).getText();
    }

    public String getColor() {
        return driver.findElement(color).getText();
    }

    public String getQuantity() {
        return driver.findElement(quantity).getText();
    }

    public String getSubtotalHeading() {
        return driver.findElement(subtotalHeading).getText();
    }

    public String getSubtotalPrice() {
        return driver.findElement(subtotalPrice).getText();
    }

    public String getShippingHeading() {
        return driver.findElement(shippingHeading).getText();
    }

    public String getShippingPrice() {
        return driver.findElement(shippingPrice).getText();
    }

    public String getTotalTaxExcl() {
        return driver.findElement(totalTaxExcl).getText();
    }

    public String getTotalTaxExclPrice() {
        return driver.findElement(totalTaxExclPrice).getText();
    }

    public String getTotalTaxIncl() {
        return driver.findElement(totalTaxIncl).getText();
    }

    public String getTotalTaxInclPrice() {
        return driver.findElement(totalTaxInclPrice).getText();
    }

    public String getTaxesHeading() {
        return driver.findElement(taxesHeading).getText();
    }

    public String getTaxesAllPrice() {
        return driver.findElement(taxesAllprice).getText();
    }

    public void clickContinueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
    }

    public void clickProceedToCheckoutButton() {
        driver.findElement(proceedToCheckoutButton).click();
    }


}
