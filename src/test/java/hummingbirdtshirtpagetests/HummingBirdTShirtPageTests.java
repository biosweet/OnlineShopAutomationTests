package hummingbirdtshirtpagetests;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class HummingBirdTShirtPageTests extends BaseTests {

    @Test
    public void dropdownSelectOption() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.selectDropdownOption("M");
        Thread.sleep(1500);
    }

    @Test
    public void dropdownSelectionListOfOptions() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        List<String> numberOptions = hummingBirdTShirtPage.getOptionsList();
        Thread.sleep(1500);
        System.out.println("The possible options are " + numberOptions);
    }

    @Test
    public void dropdownSelectionCount(){
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.getOptionsCount();
    }

    @Test
    public void checkItemHeading(){
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        String heading = hummingBirdTShirtPage.getHeading();
        System.out.println("=======");
        System.out.println("Item heading is " + heading);
        assertEquals(heading, "HUMMINGBIRD PRINTED T-SHIRT","Text is different");
    }

    @Test
    public void checkRegularPrice(){
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        String regularPrice = hummingBirdTShirtPage.getRegularPrice();
        System.out.println("=======");
        System.out.println("Regular Price is " + regularPrice);
        assertEquals(regularPrice,"$23.90","Wrong regular price");
    }

    @Test
    public void checkCurrentPrice(){
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        String currentPrice = hummingBirdTShirtPage.getCurrentPrice();
        System.out.println("=======");
        System.out.println("Current Price is " + currentPrice);
        assertEquals(currentPrice,"$19.12","Wrong current price");
    }

    @Test
    public void checkDiscountedPercentage(){
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        String discountPercentage = hummingBirdTShirtPage.getDiscountPercentage();
        System.out.println("=======");
        System.out.println("Current Discount percentage is " + discountPercentage);
        assertEquals(discountPercentage,"SAVE 20%","Wrong discount");
    }

    @Test
    public void checkProductDescription(){
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        String productDescription = hummingBirdTShirtPage.getProductDescription();
        System.out.println("=======");
        System.out.println("Description product is: " + productDescription);
        assertEquals(productDescription,"Regular fit, round neckline, short sleeves. " +
                "Made of extra long staple pima cotton.","Wrong description");
    }

    @Test
    public void checkProductQuantityUp() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.getQuantityUp();
        Thread.sleep(1500);
    }

    @Test
    public void checkProductQuantityDown() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.getQuantityDown();
        Thread.sleep(1500);
    }

    @Test
    public void checkSetQuantityWanted() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.setQuantity("5");
        Thread.sleep(1500);
    }

    @Test
    public void checkSetQuantityWantedLoop() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.getQuantityClear();
        Thread.sleep(3000);
        hummingBirdTShirtPage.getQuantityUpMore();
        Thread.sleep(3000);
    }

    @Test
    public void checkSocialMediaLinks()  {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        List <String> socialMedia = hummingBirdTShirtPage.getSocialSharingOptions();
        System.out.println("List of links is: " + socialMedia);
        System.out.println("Number of links are : " + socialMedia.size());
    }

    @Test
    public void checkReassuranceBlockList()  {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        List <String> reassuranceBlock = hummingBirdTShirtPage.getReassuranceBlock();
        System.out.println("List is: " + reassuranceBlock);
        System.out.println("Number of options are : " + reassuranceBlock.size());
    }

    @Test
    public void checkAddToCartButton() throws InterruptedException {
        var hummingBirdTShirtPage = homePage.clickOnHummingBirdTShirt();
        hummingBirdTShirtPage.addedToShippingCart();
        Thread.sleep(3000);
    }

    @Test

    public void testBetweenPages() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);

    }








}
