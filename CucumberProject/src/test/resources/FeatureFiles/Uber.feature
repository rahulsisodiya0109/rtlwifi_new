Feature: Uber Booking Feature
Scenario: Booking Cab
Given user wants to select car type "sedan" from app
When user selects the car "sedan" and pick up point "banglore" and drop location "Pune"
Then driver starts journey
And driver ends the journey
Then user pays 100 USD