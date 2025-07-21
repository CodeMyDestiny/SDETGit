Feature: This is background demo 
Background:
  Given the user is on the Saucedemo login page
  And the user enters valid credentials
  And clicks on the login button


Scenario: Test menu items
And clicks on the menu (breadcrumb) button
Then the user should be navigated to the side menu with items

Scenario: Verify add to cart functionality
And clicks on the Add to cart button
Then the selected item should be added to the cart
