#Author: madhuravi.kaja@gmail.com
@Chrome
Feature: To validate whether New user is able to Buy a Single course from COL eCommerce Website

  Scenario Outline: New user successfully bought a Single course from COL eCommerce Website
  
    Given User Launch Chrome browser
     When User Opens "<URL>"
      And User clicks on Accept and Continue button on the pop up
      #And User clicks on Courses button
      And User clicks on View Single Courses button
      #And User clicks on Add to cart button
      #And User clicks on Continue to Checkout button
      #And User clicks on Create Account button
      #And User enters "<First Name>"
      #And User enters "<Last Name>"
      #And User enters "<Email>"
      #And User clicks on Personal email address radio button
      #And User enters "<Phone Number>"
      #And User enters "<Address line1>"
      #And User enters "<City>"
      #And User selects "<Country>" from drop down
      #And User selects "<State>" from drop down
      #And User enters "<Postcode>"
      #And User clicks on Continue button
      #And User enters "<Card Number>"
      #And User enters "<Expiration date>"
      #And User enters "<CVC Number>"
      #And User selects "<Payment Country>" from drop down
      #And User selects Terms and Conditions radio button
      #And User clicks on Pay now
     #Then User navigated Order confirmation Page
      #And Store Payment ID
      #And Store Reference ID
      #And Store Course ID
      #And Store Course Name
      #And Store Total amount
      #And Store GST amount
  
   Examples: 
     | URL                               | First Name | Last Name | Email                            | Phone Number | Address line1  | City     | Country   | State | Postcode | Card Number      | Expiration date | CVC Number | Payment Country | 
     | https://colau-prep.collaw.edu.au/ | Matthew1   | Wade1     | matthew1wade1coltest@yopmail.com | 0401212121   | 181 Bay Street | Brighton | Australia | VIC   | 3186     | 4242424242424242 | 21/25           | 456        | Australia       | 
