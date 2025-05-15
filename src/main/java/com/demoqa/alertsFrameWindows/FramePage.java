package com.demoqa.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframe;

    public FramePage returnListOfFrames() {
        // by finding all the web elements using methods sise()
        System.out.println("The total number of iframes " + iframe.size());
        //return this;

        // by executing java script
        //js = (JavascriptExecutor) driver;
        Integer numberOfIframes = Integer.parseInt(js.executeScript
                ("return window.length").toString());
        System.out.println("The total number of iframes" + numberOfIframes);
        return this;
    }


    public FramePage switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public FramePage verifyIframeByText(String text) {
        Assert.assertTrue(shouldAHaveText(sampleHeading, text, 5));
        return this;
    }

   // @FindBy(id ="frame1Wrapper")
    //WebElement frame1;

    @FindBy(id = "frame1")
    WebElement frame1;
    public FramePage switchToIframeById() {
        driver.switchTo().frame(frame1);
        return this;
    }

    public FramePage switchToMainPage() {
        driver.switchTo().defaultContent();
        return this;
    }

    @FindBy(tagName = "h1")
    WebElement title;

    public FramePage verifyMainPageByTitle(String text) {
        Assert.assertTrue(title.getText().contains(text));
        return this;
    }
@FindBy(tagName = "body")
WebElement body;


       public FramePage handleNestedIframes() {
           // switch to parent frame
           driver.switchTo().frame(frame1);
           // get text from parent frame
           System.out.println("Iframe is " + body.getText());
           // number of iframes in parent iframe
           System.out.println("Number of iframes inside parent iframe is " + iframe.size());
           //switch to child frame
           driver.switchTo().frame(0);
           // get text from child iframe
           System.out.println("Iframe is " + body.getText());

           // switch to parent iframe
           driver.switchTo().parentFrame();
           // get text from parent frame
           System.out.println("Iframe is " + body.getText());


        return this;
    }


}
