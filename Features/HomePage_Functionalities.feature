#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: OpenCart Homepage Functionality
  
  @successful_Homepage
  Scenario: successful_Homepage Functionality
	Given open the opencart application in chrome browser 
	When  User click on feature icon 
	And   Click on image logo 
	Then  The opencart Homepage is opened 
	
	@successful_Register_Functionality
  Scenario: successful_Register_Functionality
  Given   open the opencart application in chrome browser2 
  When   user fills all details then click button
  Then   Register is done successful
  
  @successful_MarketPlace_Functionality
  Scenario: successful_MarketPlace_Functionality
  Given   open the opencart application in chrome browser3 
  When   user click on MarkrtPlace button
  Then   successfully clicked on MarketPlace
  
  @successful_ViewDemo_Functionality
  Scenario: successful_ViewDemo_Functionality
  Given   open the opencart application in chrome browser4 
  When   user click on ViewDemo button
  Then   successfully clicked on ViewDemo
  
  @successful_Feature_Functionality
  Scenario: successful_Feature_Functionality
  Given   open the opencart application 
  When   user click on Feature button
  Then   successfully clicked on Feature
  
  @successful_Blog_Functionality
   Scenario: successful_Blog_Functionality
  Given   open the opencart application in chrome1
  When   user click on Blog button
  Then   successfully clicked on Blog
  
  @successful_Download_Functionality
   Scenario: Download Functionality
  Given   open the opencart application in chrome2
  When   user click on Download button
  Then   successfully clicked on Download
  


  