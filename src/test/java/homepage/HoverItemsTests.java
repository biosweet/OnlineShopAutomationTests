package homepage;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverItemsTests extends BaseTests {


    @Test
    public void testHover() throws InterruptedException {
        var caption = homePage.hoverOverHummingBirdTShirt(1);
        Thread.sleep(3000);
        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"\uE8B6 Quick view","Wrong caption");
        assertEquals(caption.getLinkWhiteText(),"White","Wrong link text");
        assertEquals(caption.getLinkBlackText(),"Black","Wrong link text");
        assertTrue(caption.getLinkWhite().endsWith("8-color-white"), "Wrong link");
        assertTrue(caption.getLinkBlack().endsWith("11-color-black"), "Wrong link");
    }


}
