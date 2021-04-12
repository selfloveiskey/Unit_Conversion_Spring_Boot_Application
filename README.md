#Flexion Coding Challenge
***
######Project description
***
Our users are science teachers who are as comfortable using the command line as they are using a browser. In their “Unit Conversion” science unit, they want to assign students unit-conversion problems on paper worksheets. After students turn in their completed worksheets, the teachers want to be able to enter the questions and student responses into a computer to be graded. Students will convert:
* Temperatures: between Kelvin, Celsius, Fahrenheit, and Rankine
* Volumes: between liters, tablespoons, cubic-inches, cups, cubic-feet, and gallons 
***
######Requirements
***  
The requirements below are not intended to suggest a particular user interface, just what data the user must provide as input and what data the system must provide as output.
* The teacher must be able to provide an input numerical value, an input unit of measure, a target unit of measure, and a student’s numeric response.
 * The system indicates that the response is _correct_, _incorrect_, or _invalid_. To be considered _correct_, the student’s response must match an authoritative answer after both the student’s response and authoritative answer are rounded to the tenths place. 


## Installation
* Clone Github Repository
* Install an IDE. I used IntelliJ IDEA Ultimate
* The project uses Java 11
* Modules & Facets
    * Spring
    * Web

## Running Tests
Unit tests are located in _src/test/java_


## How can I improve this project?
* Find a library to use for unit conversions. Will make implementing additional options much easier.
* Improve the quality of the unit tests and line coverage.
* Enhance the UI layout, so pages scale better no matter the device size.
* Implement integration tests.
* Incorporate CI/CD pipeline using AWS