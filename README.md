# Java_Tasks
# city_lab1&3&4 file 
# Lab_1
Develop and application that reads two files for cities and countries and store each in a List.
• Each city entry contains code, name, continent, Surface Area,population
• Create a map that uses the country code as keys and a list of cities as the value for each country.
• For a given country code sort the cities according to the population
-----------
# Lab_3
•Using the classes created in exercise 1 provide classes or methods to get the following:
•Highest population city of each country
•Highest population city by continent
•Highest population capital
----------
# Lab_4
For the given data set used in JUPAI3 compute the median, average, quartile of the dataset based on one of the available characteristics
----------
# betterString file
# Lab_2
Your goal is to make a method called betterString that takes two Strings and a lambda that says whether the first of the two is “better”.
• The method should return that better String; i.e., if the function given by the lambda returns true, the betterString method should return the first String, otherwise betterString should return the second String.
• String string1 = ...;
• String string2 = ...;
• String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
• String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
Given a String, the task is to check whether a string containsonly alphabets or not.
• use isLetter() method of Character class.
-----------------------------------------------------------------------------------------
# Titanic_DataFram:
load the Titanic data set provided as a csv file
•Using joinery and Tablesaw perform some data exploration activities such as getting information about the data (min, max, standard deviation, etc.)
•Create 2 DataFrame Objects and try to join, merge, add columns of specific datatypes to both DataFrames (perform these activities using both libraries)
-----------------------------------------------------------------------------------------
# Titanic_Xchart/Titanic_Xchart file
1.Install maven and update the path environment variable
2.Create a project from the command prompt using mvnarchetype:generate
3.use the archetype org.apache.maven.archetypes:maven-archetype-quickstart
4.Add the Xchart dependency and build an application to load the Titanic data set and extract the data to be displayed on charts as described in the previous slides
-----------------------------------------------------------------------------------------
# pyramids_task
Deal with Egyptian Pyramids CSV dataset.
https://www.kaggle.com/lsind18/egyptianpyramids
Prepare it and print the basic data about each pyramid
1-Build a Pyramid class to define a prototype for all information you will extract from CSV for each pyramid
2-Build a PyramidCSVDAO class to:
Read pyramids.csv file.
Create List of Pyramids objects for each pyramid in the csv file
Do not forget to validate the values you make all needed conversion.
3-Build a PyramidCSVDAO class
4-Build a Main class to use PyramidCSVDAO class and print the basic data about each pyramid
