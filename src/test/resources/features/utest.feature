#Autor: Daniel Andres Cerquera Lasso
@stories
Feature: Utest Register
  As a user, automation of user registration will be generated
  @scenario1
  Scenario: registration automation
    Given The user Daniel will register his data in the registration form
    | strFristName    | strLastName   | strEmail                      | strIdiom    | strBrand    | strModel      | strOsVersion   | strPassword    |
    | Daniel Lasso    | Cerquera      | cerqueraJeduca@jeduca.com     | spanish     | Apple       | iPhone 8 Plus | iOS 14.5.1     | /Break/2021**2021   |
    When Once registered you will enter the login to enter the system
    Then Will enter the previously registered user data