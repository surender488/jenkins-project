Feature: This the login feature for organge HRM
 
#Background: Given user is on he login page

 Scenario Outline:  This is he login scenario
 Given user is on he login page 
 When The user fill the "<username>" and "<password>" 
 And click on the login button
 #Then the user should be nevigated to home page 
 
 Examples: | username | password |
           | surender | 007      |
           | veera    | 9879     |
           | muthu    | 77678    |
           |naranju   | 143      |

 
