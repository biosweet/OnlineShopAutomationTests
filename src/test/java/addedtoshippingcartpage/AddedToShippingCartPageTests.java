package addedtoshippingcartpage;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddedToShippingCartPageTests extends BaseTests {

    @Test
    public void checkModalTitle() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String title = addedToShippingCartPage.getModalTitle();
        System.out.println("The main heading of the modal says: " + title);
        Thread.sleep(1000);
        assertEquals(addedToShippingCartPage.getModalTitle(),
                "\uE876Product successfully added to your shopping cart",
                "Wrong title");
    }

    @Test
    public void checkModalCloseButton() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        addedToShippingCartPage.clickCloseButton();
    }

    @Test
    public void checkItemLinkText() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String linkText = addedToShippingCartPage.getItemLink();
        System.out.println(linkText);
    }

    @Test
    public void checkItemAltName() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String altText = addedToShippingCartPage.getImageAltName();
        System.out.println("Alt tag used for the image is: " + altText);
    }

    @Test
    public void checkItemHeading() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String imageHeading = addedToShippingCartPage.getImageAltName();
        System.out.println("The image heading is: " + imageHeading);
        assertEquals(imageHeading, "Hummingbird printed t-shirt", "Wrong heading");
    }

    @Test
    public void checkProductPrice() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String productPrice = addedToShippingCartPage.getProductPrice();
        System.out.println("The price is: " + productPrice);
    }

    @Test
    public void checkProductSize() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String size = addedToShippingCartPage.getSize();
        System.out.println("The size is: " + size);
    }

    @Test
    public void checkAllModalData() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        String modalTitle = addedToShippingCartPage.getModalTitle();
        System.out.println(modalTitle);
        String itemLink = addedToShippingCartPage.getItemLink();
        System.out.println(itemLink);
        String imageAlt = addedToShippingCartPage.getImageAltName();
        System.out.println(imageAlt);
        String imageHeading = addedToShippingCartPage.getImageHeading();
        System.out.println(imageHeading);
        String productPrice = addedToShippingCartPage.getProductPrice();
        System.out.println(productPrice);
        String size = addedToShippingCartPage.getSize();
        System.out.println(size);
        String color = addedToShippingCartPage.getColor();
        System.out.println(color);
        String quantity = addedToShippingCartPage.getQuantity();
        System.out.println(quantity);
        String subtotalHeading = addedToShippingCartPage.getSubtotalHeading();
        System.out.println(subtotalHeading);
        String subtotalPrice = addedToShippingCartPage.getSubtotalPrice();
        System.out.println(subtotalHeading + subtotalPrice);
        String shippingHeading = addedToShippingCartPage.getShippingHeading();
        System.out.println(shippingHeading);
        String shippingPrice = addedToShippingCartPage.getShippingPrice();
        System.out.println(shippingHeading + shippingPrice);
        String totalTaxExcl = addedToShippingCartPage.getTotalTaxExcl();
        System.out.println(totalTaxExcl);
        String totalTaxExclPrice = addedToShippingCartPage.getTotalTaxExclPrice();
        System.out.println(totalTaxExcl + totalTaxExclPrice);
        String totalTaxIncl = addedToShippingCartPage.getTotalTaxIncl();
        System.out.println(totalTaxIncl);
        String totalTaxInclPrice = addedToShippingCartPage.getTotalTaxInclPrice();
        System.out.println(totalTaxIncl + totalTaxInclPrice);
        String taxesHeading = addedToShippingCartPage.getTaxesHeading();
        System.out.println(taxesHeading);
        String taxesAllPrice = addedToShippingCartPage.getTaxesAllPrice();
        System.out.println(taxesHeading + taxesAllPrice);

    }
    @Test
    public void checkContinueToShoppingButton() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        addedToShippingCartPage.clickContinueShoppingButton();
    }
    @Test
    public void checkCloseButton() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        addedToShippingCartPage.clickCloseButton();
    }

    @Test
    public void checkContinueToCheckoutButton() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        addedToShippingCartPage.clickProceedToCheckoutButton();
    }

    @Test
    public void checkContinueToCheckoutButtonToNewPage() throws InterruptedException {
        var addedToShippingCartPage =
                homePage.clickOnHummingBirdTShirt().addedToShippingCart();
        Thread.sleep(2000);
        addedToShippingCartPage.clickProceedToCheckoutButton();
//        var checkoutPage =
//                homePage.clickOnHummingBirdTShirt().addedToShippingCart().clickProceedToCheckoutButton();

    }



}
