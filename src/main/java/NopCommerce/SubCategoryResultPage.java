package NopCommerce;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SubCategoryResultPage extends Utils {

    public void verifyUserIsOnSubCategoryPage(String subCategory)
    {
    String actual = getTextfromElement1(By.className("page-title"));
    String expected = subCategory;
    // Verify we are on subCategory page
    Assert.assertEquals("You are not on Main Page",expected,actual);
    }
}