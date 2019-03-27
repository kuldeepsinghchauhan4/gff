#Author: ksinghchauhan4@gmail.com
Feature: Registration form
#for Registration 
Background: User registration will be completed  after entering all the valid data. 

Scenario: check the title
Given User is on registration page.
Then check the title of the page

Scenario: User is on registration page and enter invalid data.
Given User is on registration page.
Then enter invalid credential.
When Navigate to registration page again.



Scenario: Failure in registration on leaving the userid empty 
Given User is on registration page.
When user leaves userid blank
And clicks the button 
Then display the alert msg

Scenario: Failure in registration on leaving the password empty 
Given User is on registration page.
When user leaves password blank
And clicks the button 
Then display the alert msg


Scenario: Failure in registration on leaving the name empty 
Given User is on registration page.
When user leaves name blank
And clicks the button 
Then display the alert msg
 
Scenario: Failure in registration on leaving the  address empty 
Given User is on registration page.
When user leaves address blank
And clicks the button 
Then display the alert msg

Scenario: Failure in registration on leaving the  country empty 
Given User is on registration page.
When user leaves country blank
And clicks the button 
Then display the alert msg

Scenario: Failure in registration on leaving the zipcode empty 
Given User is on registration page.
When user leaves zipcode blank
And clicks the button 
Then display the alert msg

Scenario: Failure in registration on leaving the  emailid empty 
Given User is on registration page.
When user leaves emailid blank
And clicks the button 
Then display the alert msg

Scenario: Failure in registration on leaving the  sex empty 
Given User is on registration page.
When user leaves sex blank
And clicks the button 
Then display the alert msg

Scenario: Failure in registration on leaving the  language empty 
Given User is on registration page.
When user leaves language blank
And clicks the button 
Then display the alert msg

Scenario: Successful  registration with all valid data
Given  User is on registration page.
When user enters all valid data 
Then naviagate to success page 