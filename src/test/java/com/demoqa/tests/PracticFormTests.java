package com.demoqa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticFormTests extends TestBase{

@Test(dataProviderClass = DataProvider.class,dataProvider = "addNewStudentFormWithCsv")
    public void studentAccount(String name, String lastName,
                               String email, String phone){
    new PracticFormTests(driver)
            .enterPersonalData(name, lastName, email, phone)
            .selectGender("Male")
            .enterData("18 aug 1989")
            .assSubject(new String[]{"Math", "Chemestry"})
            .selectHobby(new String[]{"Sport", "Reading"})
            .aploadFile("")
            .inputState("NCR")
            .input("Delphi")
            .submit()
            .verifySuccessRegistration("Thanks for submitting the form");


    }
}
