package com.demoqa.tests;

import com.demoqa.bookStore.LoginPage;
import com.demoqa.bookStore.ProfilePage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
        new SidePanel(driver).selectlogin();
    }

    @Test
    public void LoginPositiveTest(){
        new LoginPage(driver).enterUserData("Viky", "123456Aa!").clickOnLoginButton();
        new ProfilePage(driver).verifyUserName("Viky");
    }

}
