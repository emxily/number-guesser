# number-guesser
A simple Java game where the user takes turn guessing a random number against a CPU. 

<br />

# Project Overview

The game starts by generating a random number 1 - 100 to be guessed by both the user and CPU. The user will get 1 guess per round, and the CPU will receive a predetermined number of guesses based off the difficulty the user selects. The first player to guess the number correctly wins!

## Original Assignment Requirements
* User is able to select and play different game modes from menu 
* Random number is generated for each new game 
* Each User guess receive feedback including too high/low
* CPU guesses predetermined number of times based on selected game mode 
* User/CPU guess in a pattern (10pts)
    * User guess 1 time
    * CPU guesses predetermined number of times
    * User guesses 1 time
    * CPU guesses predetermined number of times
* User/CPU are able to guess until the random number is guessed correctly 
* Scoreboard is displayed with User/CPU points rewarded after the game ends
* User may play guessing game until choosing to quit 

<br />

# Getting Started
## Prerequisites

Before you begin, ensure you have met the following requirements:
* Java 8+

## Installing

* To install this program, clone or download this repository:

        git clone number-guesser.git

* Then, navigate into the project directory:

        cd number-guesser


## Executing program
* To run the program from the terminal:
        java .\number_guesser.java

### Example Output
```java .\number_guesser.java```
```
**************DIFFICULTY*************
Noob (5 guesses)..............press 1
Well-Seasoned (10 guesses)....press 2
Psychic (20 guesses)..........press 3

Select CPU Difficulty: 1
*************************************
Please pick a number between 1-100: 22
Too Low
CPU Guess: 87.....Incorrect
CPU Guess: 78.....Incorrect
CPU Guess: 74.....Incorrect
CPU Guess: 65.....Incorrect
CPU Guess: 87.....Incorrect
Please pick a number between 1-100: 1
Too Low
...
```

<br />

# Future Updates

* Update planned at a later time

# Version History
*0.1
    *Initial Release

<br />

# Authors

**Author:** Emily Nowak

*Based on **Program 1** by **Professor Stephen Harris** for CSC222: Object-Oriented Programming with Java at Tidewater Community College

<br />
