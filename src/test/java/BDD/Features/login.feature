@feature=login
Feature: Login

  @mobile
  Scenario: User should be able to login
    Given User navigate to the application
    When User enters the creds
    Then User should see the dashboard

  @web
  Scenario: User should see
    Given user navigating
    When user clicks the button


