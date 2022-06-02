package com.eurotechStudy.pages;


import com.eurotechStudy.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {//test base ile basepage in farki ui ile alakali locatorlar var ve init metodla her seyi tanitiyoruz ama
    // test base de ise kod tekrarini azaltiyor ve setup gibi

    public BasePage() { //bütün testlerin ortaklarini buraya koyuyoruz

        PageFactory.initElements(Driver.get(), this); //sayfamda olan tüm metodlari initilaze etmemi sagladigi icin
        //PageFactory yi kullaniyoruz.

    }

    @FindBy(linkText = "Developers")
    public WebElement developers;

    @FindBy(linkText = "Login")
    public WebElement loginBtnBasePage;

    @FindBy(xpath = "//span[contains(text(),'Google')]")
    public WebElement signWithGoogle;

    @FindBy(xpath = "//span[contains(text(),'Github')]")
    public WebElement signWithGithub;

    @FindBy(linkText = "Sign Up")
    public WebElement signUp;

    @FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;



    public void navigateToMenu(String menuName) {

        WebElement menu =   Driver.get().findElement(By.xpath("//a[text()='" + menuName + "']"));

        menu.click();
    }

}