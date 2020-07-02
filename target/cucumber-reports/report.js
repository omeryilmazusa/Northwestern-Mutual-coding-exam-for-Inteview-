$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SauceDemo/SauceDemo.feature");
formatter.feature({
  "name": "Testing SauceDemo.com",
  "description": "  o\tWorkflow:\n  \tLog into the site\n  \tSort the items\n  \tAdd two or more items to the shopping cart\n  \tVisit the shopping cart\n  •\tAssert that the items that you added are in the cart\n  \tRemove an item and then continue shopping\n  \tAdd another item\n  \tCheckout\n  •\tAssert you are purchasing the correct items\n  •\tAssert the total price\n  •\tFinish checkout",
  "keyword": "Feature"
});
formatter.background({
  "name": "the user goes to page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user navigate to page url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_navigate_to_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user validate title \"Swag Labs\" and url \"https://www.saucedemo.com/inventory.html\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_validate_title_and_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Sorting and shopping cart validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "name": "the user sort items name A to Z \"Name (A to Z)\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_sort_items_name_A_to_Z(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user add 3 items to the shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_add_items_to_the_shopping_cart(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_click_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the items that you added",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.validate_the_items_that_you_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "the user goes to page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user navigate to page url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_navigate_to_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user validate title \"Swag Labs\" and url \"https://www.saucedemo.com/inventory.html\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_validate_title_and_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Removing and Re add items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "name": "the user add 3 items to the shopping cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_add_items_to_the_shopping_cart(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_click_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user remove one item and continue shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_remove_one_item_and_continue_shopping()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "add another item",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.add_another_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_click_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click checkout and continue with correct information",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_click_checkout_and_continue_with_correct_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user Assert you are purchasing the correct items",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_Assert_you_are_purchasing_the_correct_items()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user Assert the total price",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_Assert_the_total_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user validate final message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SauceDemo_stepDef.SauceDemo_steps.the_user_validate_final_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});