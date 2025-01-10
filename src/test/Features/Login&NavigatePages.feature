Feature: User Login
  As a registered user,
  I want to log in and navigate through my account pages
  So that I can manage my account and use its features


  Scenario Outline: Login to the site and Navigate through pages

    Given the browser is open

    And I navigate to the Magento page
    And clicks Sign In label
    And user is on Sign In page
    When I enter valid credential of "<Email>" and "<Password>"
    And I click the Sign In button
    And I navigate to Home Page
    Then I should see the Home Page header


    And I click the above arrow icon
    When click My Account button there
    And I navigate to My Account page
    Then I should see the My Account header

    And I click My Orders button
    When I navigate to the My Orders page
    Then I should see the My Orders header

    And I click My Downloadable Products button
    When I navigate to the My Downloadable Products page
    Then I should see the My Downloadable Products header

    And I click My Wish List button
    When I navigate to the My Wish List page
    Then I should see the My Wish List header

    And I click Address Book button
    When I navigate to the Address Book page
    Then I should see the Add New Address header

    And I click Account Information button
    When I navigate to the Account Information page
    Then I should see the Edit Account Information header

    And I click Stored Payment Methods button
    When I navigate to the Stored Payment Methods page
    Then I should see the Stored Payment Methods header

    And I click My Product Reviews button
    When I navigate to the My Product Reviews page
    Then I should see the My Product Reviews header

    And I click the arrow icon again
    When I click the Sign Out button
    Then I should be redirected to the Magento homepage
    And I should see the message You are signed out

    Examples:
      | Email              | Password   |
      | Test123s@gmail.com | Test@12345 |