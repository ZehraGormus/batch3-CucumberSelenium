package com.eurotechStudy.step_definitions;

import com.eurotechStudy.pages.DashboardPage;
import com.eurotechStudy.pages.LoginPage;
import com.eurotechStudy.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardPageMenusStepDefs {
    @Then("the user should be able to see following menus")
    public void the_user_should_be_able_to_see_following_menus(List<String>  menuOptions) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        System.out.println("menuOptions.size()= "+menuOptions.size());
        System.out.println("menuOptions= "+menuOptions);
        Assert.assertEquals(menuOptions,BrowserUtils.getElementsText(new DashboardPage().dashboardMenus));

    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userCredential) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("userCredential = " + userCredential);

        new LoginPage().login(userCredential.get("username"),userCredential.get("password"));
    }
}
