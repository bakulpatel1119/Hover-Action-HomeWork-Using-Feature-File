package NopCommerce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils {
        // To verify user is already on homepage
        public void userISonHomePage() { assertURL("https://demo.nopcommerce.com/"); }

        //To hover over main Category
        public void hoverMainCategory(String main_Category)
    {
        //locator for main category
        WebElement mainCategoryLink = driver.findElement(By.linkText(main_Category));

        //creating an object of Action class
        Actions actions = new Actions(driver);

        // Perform mouse hover on Main Category
        Action mouseHover = actions.moveToElement(mainCategoryLink).build();
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        mouseHover.perform();
    }
        // Click on Sub-category
    public void clickOnSubCategory(String subCategory)
    {
        clickonElement(By.linkText(subCategory));
    }
  }