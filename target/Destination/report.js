$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/Categories.feature");
formatter.feature({
  "name": "Categories",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should able to hover over main category and should able to click on sub-category successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "NopCommerce.MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hover over main category \"Computers\"",
  "keyword": "When "
});
formatter.match({
  "location": "NopCommerce.MyStepdefs.userHoverOverMainCategory(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sub-category \"Software\"",
  "keyword": "And "
});
formatter.match({
  "location": "NopCommerce.MyStepdefs.clickOnSubCategory(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should able to see sub-category \"Software\" products",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommerce.MyStepdefs.userShouldAbleToSeeSubCategoryProducts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});