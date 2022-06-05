Feature: Testing the current weather API for WeatherBit website
  We would be testing the search for Current weather using Post code and using combination of latitude and longitude.

  Scenario Outline: Testing current weather Data for multiple places in the world based on Latitude and Longitude
    When I use the weatherbit app to get the current weather using the Latitude as "<Latitude>" and Longitude as "<Longitude>"
    Then I expect the city name to be "<City>"
    And Response code should be "200"

    Examples:
      | Latitude | Longitude | City              |
      | 90       | -90       | Gjoa Haven        |
      | -90      | 90        | Port-aux-Français |
      | 0        | 36.2      | Nyahururu         |

  Scenario Outline: Testing invalid current weather Data for multiple places in the world based on Latitude and Longitude
    When I use the weatherbit app to get the current weather using the Latitude as "<Latitude>" and Longitude as "<Longitude>"
    Then I expect the error to be "<Error>"
    And Response code should be "400"

    Examples:
      | Latitude | Longitude | Error                                             |
      | 91       | -90.1     | Invalid lat supplied. Must be between -90 and +90 |
      #|    -90      |     911     |  Out of Range    |Bug-> the value provided is out of range but we still get details of a place.
      | #%       | &=        | Invalid lat/lon supplied.                         |

  Scenario Outline: Testing current weather Data for multiple places in the world based on Postcodes
    When I use the weatherbit app to get the current weather using the Postcode as "<Postcode>"
    Then I expect the city name to be "<City>"
    And Response code should be "200"

    Examples:
      | Postcode | City       |
      | 2155     | Rouse Hill |
      | 403602   | Madgaon    |

  #Scenario Outline: Testing invalid current weather Data for multiple places in the world based on Postcodes
   #When I use the weatherbit app to get the current weather using Postcode as <Postcode>
   # Then I expect the error to be <"Error">
   # And Response code should be "400"

    #Examples:
     # | Postcode | Error |
      #| @#$%^     | Bug-> It would be good to have response body with a graceful error message presented to the end user |
      # Bug-> Long/ lengthy (wrong) post codes like 2155H555555555 return weather of a random cities like Paimio(21520)