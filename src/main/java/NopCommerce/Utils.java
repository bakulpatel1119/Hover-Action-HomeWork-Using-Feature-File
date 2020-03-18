package NopCommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends Basepage {

    //------------------------------------------------------------------------------------------------------------------
    // METHOD 1 : WAIT UNTIL CLICKABLE
    public void waitUntilClickable(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD 2 : WAIT FOR ELEMENT VISIBLE
    public void waitForVisible(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD 3 : WAIT FOR ELEMENT IS PRESENCE
    public void waitforElementisPresent(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD 4 : GET TEXT FROM ELEMENT
    public static String getTextfromElement1(By by)
    {
        return driver.findElement(by).getText();
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD 5 : CLICK ON ELEMENT
    public void clickonElement(By by)
    {
        driver.findElement(by).click();
    }
    //------------------------------------------------------------------------------------------------------------------
    // METHOD 6 : ENTER TEXT (SEND KEY)
    public void enterText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD 7 : SELECT FROM DROP DOWN BY INDEX
    public void selectFromDropDownByIndex(By by, int index)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD 8 : SELECT FROM DROP DOWN BY VALUE
    public void selectFromDropDownByValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD  9 : SELECT FROM DROP DOWN BY VISIBLE
    public void selectFromDropDownByVisible(By by, String visText)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(visText);
    }
    //------------------------------------------------------------------------------------------------------------------
    //  METHOD  10 : CREATE TIME STAMP (EMAIL)
    public static String timeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
        Date date = new Date();
        return (dateFormat.format(date));
    }
    //-----------------------------------------------------------------------------------------------------------------

    // METHOD 11 : ASSERT TEXT
    public static void assertTextMessage(String message, String expected, By by)
    {
    String actual = getTextfromElement1(by);
    Assert.assertEquals(message, expected,actual);
    }

    //-----------------------------------------------------------------------------------------------------------------

    // METHOD 11 : ASSERT URL

    public static void  assertURL(String text)
    {
    Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }






}
