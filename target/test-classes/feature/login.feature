Feature: login to flipkart application and checkout laptop


Scenario: User able to reach buyout option using valid crendiatals

Given Open application using browser
When  User enter username as saipattabhi18@gmail.com and password as Sai@2255 into the fields
And  User clicks on the submitbutton
When User clickson the electronics option in the application
When User  clicks on the laptops icon
When User navigated to required position with products display
Then User should see buyout option

