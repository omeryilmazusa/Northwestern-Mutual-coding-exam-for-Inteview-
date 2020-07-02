Feature: Testing TypicodeAPI.com
#  o	Workflow:
#  	Log into the site
#  	Sort the items
#  	Add two or more items to the shopping cart
#  	Visit the shopping cart
#  •	Assert that the items that you added are in the cart
#  	Remove an item and then continue shopping
#  	Add another item
#  	Checkout
#  •	Assert you are purchasing the correct items
#  •	Assert the total price
#  •	Finish checkout





  Background:
    Given I set Typicode REST API url

  Scenario: GET posts example
    Given I Set GET posts with  api endpoint "/posts"
    When I Set Responsebody to catch data
    And Validate response code 200 and postsSize is 99



  Scenario: UPDATE posts example
    Given I Set PUT posts api endpoint for "1"
    When I Set Update request Body
    And Send PUT HTTP request
    Then I receive valid HTTP response code 200 for "PUT."
    And Response BODY "PUT" is non-empty


  Scenario: DELETE And PUT posts example
    Given I Set DELETE posts api endpoint for "1"
    When I Send DELETE HTTP request
    Then I receive valid HTTP response code 200 for "DELETE."
    And I Set PUT posts api endpoint for "1"
    Then I Send PUT HTTP request
    Then I receive valid HTTP response code 200 for "PUT."
    Then Validate PUT and DELETE response same data
