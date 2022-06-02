package com.eurotechStudy.pages;


import com.eurotechStudy.utilities.BrowserUtils;
import com.eurotechStudy.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(css = ".btn.btn-primary")
    public WebElement loginBtnLoginPage;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotBtnLoginPage;
    @FindBy(xpath = "//*[text()='Invalid Credentials!']")
    public WebElement invalidText;


    @FindBy(xpath = "//div[text()='Please include a valid email!']")
    public WebElement invalidUsername;

    public void loginTeacher(){
        String email= ConfigurationReader.get("usernameTeacher");
        String password = ConfigurationReader.get("passwordTeacher");
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginBtnLoginPage.click();
    }

    public void login(String username,String password){
        understandBtn.click();
        loginBtnBasePage.click();
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtnLoginPage.click();
        BrowserUtils.waitFor(2);
    }

   /* bu onceki @FindBy(id="user-name")
    public WebElement usernameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(css=".submit-button.btn_action")
    public WebElement loginButton;*/



    /*@FindAll({//selniumdan geliyor  burada 'or' yani iki elementten birini getiriyor
            @FindBy(id="login-button"),
            @FindBy(name="login-button")
    })
    public WebElement loginButton;
    */




   /* @FindBys({// ikisini de bul diyoruz
            @FindBy(id="login-button"),
            @FindBy(name="login-button")
    })
    public WebElement loginButton;*/
}
