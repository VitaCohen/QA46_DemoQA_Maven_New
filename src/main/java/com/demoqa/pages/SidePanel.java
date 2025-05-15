package com.demoqa.pages;

import com.demoqa.alertsFrameWindows.AlertsPage;
import com.demoqa.alertsFrameWindows.BrowserWindows;
import com.demoqa.alertsFrameWindows.FramePage;
import com.demoqa.bookStore.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{


    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage selectlogin() {
        click(login);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJS(alerts,0, 300);
        return new AlertsPage(driver);
    }
@FindBy(xpath = "//span[.='Frames']")
WebElement frames;


    public SidePanel selectFrame(){
        clickWithJS(frames,0, 300);
        return new SidePanel(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public FramePage selectedNestedFrames() {
        clickWithJS(nestedFrames, 0, 300);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindows selectBrowserWindow() {
        clickWithJS(browserWindows, 0, 300);
        return new BrowserWindows(driver);
    }
}
