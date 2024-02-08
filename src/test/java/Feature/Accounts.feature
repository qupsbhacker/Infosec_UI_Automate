Feature: Verify that Accounts Module Work properly

  Background: login to web
    Given Enter a registered number
    And Click on continue button
    And Enter pin number
    And Click on Go to dashboard
#TC_1
  @Release
  Scenario: Verify that account details page loads perfectly when there is no transaction
    Given Click on the Accounts sidebar
    Then Verify the visibility of the Accounts option on the top-left corner
    And Check that the balance should be Zero
    When Click on the Cash in button
    Then Check that Cash In is visible on the sidebar modal
    When Click on the Cash Out button
    Then Check that Cash Out is visible on the sidebar modal
#TC_2
  @Release
  Scenario: Verify that user can not Cash In with null value
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter Note
    And Click on Add button
    Then Check that Amount field required message should appear

#TC_3
  @Release
  Scenario: Verify that user can cash in Positive Value
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter Positive amount 10
    And Enter Note
    And Click on Add button
    Then Verify the total Balance is 10

#TC_4
  @Release
  Scenario: Verify that user can cash in decimal amount
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter decimal amount 10.5
    And Enter Note
    And Click on Add button
    Then Verify the total Balance is 20.5

#TC_5
  @Release
  Scenario:  Verify that user can cash in multiple times
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter Positive amount 10
    And Enter Note
    And Click on Add button
    When Click on the Cash in button
    And Enter Positive amount 20
    And Enter Note
    And Click on Add button
    When Click on the Cash in button
    And Enter Positive amount 30
    And Enter Note
    And Click on Add button
    When Click on the Cash in button
    And Enter Positive amount 50
    And Enter Note
    And Click on Add button
    Then Verify the total Balance is 130.5

#TC_6
  @Release
  Scenario: Verify that user can cancel cash In
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter Positive amount 10
    And Enter Note
    And Click on Cancel button

#TC_7
  @Release
  Scenario: Verify that  cross button is working well
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter Positive amount 10
    And Enter Note
    And Click on Cross button on the upper corner

#TC_8
  @Release
  Scenario: Verify that user can not Cash out with null value
    Given Click on the Accounts sidebar
    When Click on the Cash Out button
    And Enter Note
    And Click on Add button
    Then Check that Amount field required message should appear
#TC_9
  @Release
  Scenario: Verify that user can cash out Positive Value
    Given Click on the Accounts sidebar
    When Click on the Cash Out button
    And Enter Positive amount 10
    And Enter Note
    And Click on Add button

#TC_10
  @Release
  Scenario: Verify that user can cash out decimal amount
    Given Click on the Accounts sidebar
    When Click on the Cash in button
    And Enter decimal amount 10.5
    And Enter Note
    And Click on Add button

