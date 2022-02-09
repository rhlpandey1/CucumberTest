Feature: Test Launch Google


  @SmokeTest
  Scenario Outline: open google url

    Given Launch google "<URL>"
    When Search the text
    |text|Facebook|
    And Enter username and password for Facebook
    |username|password|
    |abc     |abc@123 |

    Examples:
    |URL                   |
    |https://www.google.com|

  @RegressionTest @Second
  Scenario Outline: open Yahoo url

    Given Launch google "<URL>"
    When Search the text
      |text|Gmail|
    And Enter username and password for Gmail
      |username|password|
      |abc     |abc@123 |

    Examples:
      |URL                   |
      |https://www.google.com|