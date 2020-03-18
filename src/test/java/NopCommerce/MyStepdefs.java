package NopCommerce;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.experimental.categories.Categories;

public class MyStepdefs extends Utils {

    // objects created
    HomePage homePage = new HomePage();
    SubCategoryResultPage subCategoryResultPage = new SubCategoryResultPage();

    // Verify user is on homepage
    @Given("User is on homepage")
    public void userIsOnHomepage()
    { homePage.userISonHomePage(); }

    // Hover over main category
    @When("user hover over main category {string}")
    public void userHoverOverMainCategory(String main_Category)
    { try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        homePage.hoverMainCategory(main_Category); }

    // click on sub-category
    @And("click on sub-category {string}")
    public void clickOnSubCategory(String subCategory)
    { homePage.clickOnSubCategory(subCategory);}

    // Verify user is on sub-category page
    @Then("User should able to see sub-category {string} products")
    public void userShouldAbleToSeeSubCategoryProducts(String subCategory )
    { subCategoryResultPage.verifyUserIsOnSubCategoryPage(subCategory);
    }

}
