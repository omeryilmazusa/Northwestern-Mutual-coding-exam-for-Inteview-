package StepDefinitions.SauceDemo_stepDef;

import Pages.SauceDemo.*;
import Utilities.BrowserUtilities;
import Utilities.Configuration;
import Utilities.Driver;
import com.github.javafaker.Faker;
import com.sun.tools.jxc.ConfigReader;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SauceDemo_steps {

    WebDriver driver= Driver.getDriver();
    LoginPage loginPage=new LoginPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    CheckoutPage checkoutPage=new CheckoutPage();
    InventoryPage inventoryPage=new InventoryPage();
    OverviewPage overviewPage=new OverviewPage();
    FinishPage finishPage=new FinishPage();
    List<String> actualAddedProducts=new ArrayList<>();



    @Given("the user navigate to page url")
    public void the_user_navigate_to_page() throws InterruptedException {

        driver.get(Configuration.getProperty("urlSoucedemo"));
        loginPage.userName.sendKeys(Configuration.getProperty("userName"));
        loginPage.password.sendKeys(Configuration.getProperty("passWord"));
        loginPage.loginButton.click();
        Thread.sleep(500);

    }

    @When("the user validate title {string} and url {string}")
    public void the_user_validate_title_and_url(String expectedTitle, String expectedUrl) {
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
    }

    @When("the user sort items name A to Z {string}")
    public void the_user_sort_items_name_A_to_Z(String select) throws InterruptedException {
        BrowserUtilities.selectByVisibleText(inventoryPage.dropdown,select);
        List<String> expectedProducts=new ArrayList<>();
        List<String> actualProducts=new ArrayList<>();

        for (WebElement product:inventoryPage.products){
            expectedProducts.add(product.getText());
            actualProducts.add(product.getText());
        }
        Collections.sort(expectedProducts);
        Assert.assertEquals(expectedProducts,actualProducts);
        Thread.sleep(500);

    }

    @Then("the user add {int} items to the shopping cart")
    public void the_user_add_items_to_the_shopping_cart(Integer int1) throws InterruptedException {
        int length=int1;
        for(int i=0;i<length;i++){
            Thread.sleep(500);
            inventoryPage.addToCArtButtons.get(0).click();
            actualAddedProducts.add(inventoryPage.products.get(i).getText());
        }



    }
    @Then("the user click shopping cart")
    public void the_user_click_shopping_cart() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement( inventoryPage.shoppingCartButton).click().perform();
        Thread.sleep(500);
    }



    @Then("Validate the items that you added")
    public void validate_the_items_that_you_added() throws InterruptedException {

        List<String> expectedAddedProducts=new ArrayList<>();

        for (WebElement product:shoppingCartPage.addedProducts){
            expectedAddedProducts.add(product.getText());
        }
        Thread.sleep(500);
        Assert.assertEquals(expectedAddedProducts,actualAddedProducts);

    }

    @Then("the user remove one item and continue shopping")
    public void the_user_remove_one_item_and_continue_shopping() throws InterruptedException {
        shoppingCartPage.removeButtons.get(0).click();
        Thread.sleep(500);
        actualAddedProducts.remove(0);
        Thread.sleep(500);

        shoppingCartPage.continueShoppingButton.click();

    }

    @Then("add another item")
    public void add_another_item() throws InterruptedException {
        inventoryPage.addToCArtButtons.get(1).click();
        actualAddedProducts.add(inventoryPage.products.get(3).getText());
        Thread.sleep(500);
    }

    @Then("the user click checkout and continue with correct information")
    public void the_user_click_checkout_and_continue_with_correct_information() throws InterruptedException {
        Faker faker=new Faker();

        shoppingCartPage.checkoutButton.click();
        checkoutPage.firsName.sendKeys(faker.name().firstName());
        checkoutPage.lastName.sendKeys(faker.name().lastName());
        checkoutPage.zipCode.sendKeys(faker.address().zipCode());
        checkoutPage.continueButton.click();
        Thread.sleep(500);

    }

    @Then("the user Assert you are purchasing the correct items")
    public void the_user_Assert_you_are_purchasing_the_correct_items() {

        List<String> expectedAddedProducts=new ArrayList<>();

        for (WebElement product:overviewPage.addedProducts){
            expectedAddedProducts.add(product.getText());
        }
        Assert.assertEquals(expectedAddedProducts,actualAddedProducts);

    }

    @Then("the user Assert the total price")
    public void the_user_Assert_the_total_price() throws InterruptedException {
        List<Double> expectedAddedProductsPrices=new ArrayList<>();
        Double sumOfPrices=0.0;

        for(WebElement price:overviewPage.addedProductsPrices){
            Double temp=Double.parseDouble(price.getText().trim().substring(1));
            expectedAddedProductsPrices.add(temp);
            sumOfPrices+=temp;
        }

        String total=overviewPage.itemTotalLabel.getText();
        Double itemTotal=0.0;
        for(int i=0;i<total.length();i++){
            if(Character.isDigit(total.charAt(i))){
                itemTotal=Double.parseDouble(total.substring(i));
                break;
            }
        }
        Thread.sleep(500);
        Assert.assertEquals(sumOfPrices,itemTotal);
        overviewPage.finishButton.click();


    }

    @Then("the user validate final message {string}")
    public void the_user_validate_final_message(String expectedMessage) throws InterruptedException {
        String actualMessage=finishPage.validateMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        Thread.sleep(500);
    }


}
