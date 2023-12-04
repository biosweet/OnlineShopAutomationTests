package allproductspage;

import base.BaseTests;
import org.testng.annotations.Test;

public class AllProductsPageTests extends BaseTests {

    @Test
    public void checkAllProductsLink() throws InterruptedException {
        homePage.clickAllProductsPage();
        Thread.sleep(2000);
    }

}
