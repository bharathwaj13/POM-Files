Feature: Create a Lead


Scenario Outline: Create Lead(positive scenario)
Given Open the browser
And maximize the browser
And Set Timeouts
And enter the URL as http://leaftaps.com/opentaps/
And enter the username as DemoCSR
And enter the password as crmsfa
And click Login
And Verify Login is successful
And click CRMSFA
And click Leads Tab
And click createLead link
And enter companyname as <companyName>
And enter firstname as <firstName>
And enter lastname as <lastName>
When click Submit button
Then Lead creation successful

Examples:
|companyName|firstName|lastName|
|HCL|Bharath|A|
|TCS|Viswa|S|
