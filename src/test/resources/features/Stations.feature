Feature: Open Weather API feature

  Background: I set global specification
    When I set base URI
    And I set header
      | Accept       | */*              |
      | Content-Type | application/json |
    And I set query param
      | appid | apiKey |

  Scenario: Verify Open Weather Station

    Given I set query param
      | appid |  |
    When I call stations with "POST"
    Then I verify status code 401
