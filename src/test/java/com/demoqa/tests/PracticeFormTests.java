package com.demoqa.tests;

import com.demoqa.forms.PracticeFormPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm()
                .hideFooter();
    }

    @Test
    public void createStudentAccount(){
        new PracticeFormPage(driver)
                .enterPersonalData("Bob",
                "Be","bob@mail.com", "1234567890")
                .selectGender("Male")
               .enterDate("18.06.1999")
               .addSubjects(new String[]{"Math", "Chemistry"})
               .selectHobbye(new String[]{"Sports", "Reading"})
//                .uploadFile("C://Tools//2.jpg")
//                .inputState("NCR")
//                .inputCity("Delhi")
//                .submit()
//                .verifySuccessRegistration("")
        ;

    }


//@Test(dataProviderClass = DataProvider.class,dataProvider = "addNewStudentFormWithCsv")
//    public void studentAccount(String name, String lastName,
//                               String email, String phone){
//    new PracticeFormTests(driver)
//            .enterPersonalData(name, lastName, email, phone)
//            .selectGender("Male")
//            .enterData("18 aug 1989")
//            .assSubject(new String[]{"Math", "Chemestry"})
//            .selectHobby(new String[]{"Sport", "Reading"})
//            .aploadFile("")
//            .inputState("NCR")
//            .input("Delphi")
//            .submit()
//            .verifySuccessRegistration("Thanks for submitting the form");

//}
}
