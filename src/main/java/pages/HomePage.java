package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By hummingBirdTShirt = By.xpath("//a[contains(@href,\"1-1-hummingbird-printed\") and @class=\"thumbnail product-thumbnail\"]");
    private By hummingBirdBox = By.xpath("//article[@class=\"product-miniature js-product-miniature\"]");
    private By boxCaption = By.className("thumbnail-container");
    private By allProductsLink = By.xpath("//a[contains(@href,\"/2-home\")]");


    public HummingBirdTShirtPage clickOnHummingBirdTShirt(){
        driver.findElement(hummingBirdTShirt).click();
        return new HummingBirdTShirtPage(driver);
    }

    public AllProductsPage clickAllProductsPage(){
        driver.findElement(allProductsLink).click();
        return new AllProductsPage(driver);
    }




    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverHummingBirdTShirt(int index){
        WebElement figure = driver.findElements(hummingBirdBox).get(index -1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        /* figure вече е елемент от дом, но неговия под елемент
        може да бъде намерен като figure.findElement(xpath) */

        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption {

        private WebElement caption;
        private By header = By.xpath("//a[@class=\"quick-view\"]");
        private By linkWhite = By.xpath("//div[@class=\"variant-links\"]//a[1]");
        private By linkBlack = By.xpath("//div[@class=\"variant-links\"]//a[2]");


        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLinkWhite(){
            return caption.findElement(linkWhite).getAttribute("href");
        }
        public String getLinkBlack(){
            return caption.findElement(linkBlack).getAttribute("href");
        }

        public String getLinkWhiteText(){
            return caption.findElement(linkWhite).getText();
        }
        public String getLinkBlackText(){
            return caption.findElement(linkBlack).getText();
        }
    }



}


