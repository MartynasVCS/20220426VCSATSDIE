package tests.seleniumEasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestsSelenium {

    @Test
    public void testInputFieldDemoQA() {

        String expectedFullName = "Martynas";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement inputFullName = driver.findElement(By.xpath("//*[@id='userName']"));
        inputFullName.sendKeys(expectedFullName);

        driver.quit();
    }

    @Test
    public void testInputFieldSeleniumEasy() {

        String expectedFullName = "Martynas";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));

        WebElement buttonCloseAdd = driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
        buttonCloseAdd.click();

        WebElement singleInputField = driver.findElement(By.xpath("//*[@id='user-message']"));
        singleInputField.sendKeys(expectedFullName);

        WebElement buttonShowMessage = driver.findElement(By.xpath("//*[@id='get-input']//button"));
        buttonShowMessage.click();

        WebElement elementMessage = driver.findElement(By.xpath("//*[@id='display']"));
        String textMessage = elementMessage.getText();

        Assert.assertEquals(textMessage, expectedFullName);
        driver.quit();
    }

    @Test
    public void testTwoInputFieldsSeleniumEasy() {
        int input1 = 5;
        int input2 = 7;
        int inputSum = 12;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));

        WebElement buttonCloseAdd = driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
        buttonCloseAdd.click();

        WebElement inputField1 = driver.findElement(By.xpath("//*[@id='sum1']"));
        inputField1.sendKeys(Integer.toString(input1));

        WebElement inputField2 = driver.findElement(By.xpath("//*[@id='sum2']"));
        inputField2.sendKeys(Integer.toString(input2));

        WebElement buttonGetTotal = driver.findElement(By.xpath("//*[@id='gettotal']//button"));
        buttonGetTotal.click();

        WebElement elementTotal = driver.findElement(By.xpath("//*[@id='displayvalue']"));
        String textTotal = elementTotal.getText();

        Assert.assertEquals(textTotal, Integer.toString(inputSum));

        driver.quit();
    }
}















