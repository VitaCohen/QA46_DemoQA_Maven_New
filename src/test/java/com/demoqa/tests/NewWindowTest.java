package com.demoqa.tests;

import com.demoqa.alertsFrameWindows.BrowserWindows;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindow().hideFooter();
    }

    @Test
    public void newTabTest(){
        new BrowserWindows(driver).switchToNewTab(1)
                .verifyNewTabTitle("This is a sample page");
    }

}
