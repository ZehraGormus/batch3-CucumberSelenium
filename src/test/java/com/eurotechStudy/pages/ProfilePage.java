package com.eurotechStudy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(name ="githubusername" )
    public WebElement githubusername;

    @FindBy(linkText = "Go Back")
    public WebElement goBackButton;

    @FindBy(tagName = "select")
    public WebElement status;

    @FindBy(name = "skills")
    public WebElement skills;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(),'Profile Created')]")
    public WebElement profileCreated;

    @FindBy (name = "githubusername")
    public WebElement githubUsername;

    @FindBy (name = "company")
    public WebElement company;

    @FindBy(name = "bio")
    public WebElement biyografi;

    @FindBy(xpath = "//div[contains(text(),'Profile Updated')]")
    public WebElement ProfileUpdate;

    @FindBy(name = "title")
    public WebElement userTitle;



    @FindBy(name = "from")
    public WebElement baslangicDate;

    @FindBy(xpath = "//input[@name='to']")
    public WebElement bitisDate;

    @FindBy(xpath = "//div[contains(text(),'Experience Added')]")
    public WebElement experience;




}
