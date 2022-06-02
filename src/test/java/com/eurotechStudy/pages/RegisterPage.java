package com.eurotechStudy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(css = "input[placeholder='Email Address")
    public WebElement email;

    @FindBy(name = "password2")
    public WebElement passwordConfirm;

    @FindBy(css = ".btn.btn-primary")
    public WebElement registerButton;





}
