# SEA Checkpoint 1

**Hints**

- Try to solve the problems from memorizing what you learned first.
- You can use resources and search engines of your choice.
- If you get stuck, skip to the next step!
- Regardless of whether you finish, remember to commit everything and push

## Downloading and initializing of the project

### Work on your own Fork

Fork this repo and clone your copy of the repo to your local machine. **You will work on your copy during the exercise and use the Github repo URL to submit your solutions.**

> Tip: commit and push your changes after each exercise, to avoid unpleasant surprises

#### Import into IntelliJ

* Use "File / New / Project from Version Control" and use your forked Repo URL
* The IDE should recognize the Maven project and after the automatic setup you should be able to start `main` methods and unit tests.

## Exercises

##  Java data structures

You will find an  `algos`  folder at the root of your local repository and you should write the following algorithms in the file  `Student.java`:

###  Major

The school organizes an end-of-year party and all adult students are invited. In order to avoid sending invitations to underage students, you must create a method that checks a student's age and returns whether or not they are of age.

Create a static method named  _isLegal_, which returns "true" if the age passed as an argument is greater than or equal to 18 and returns "false" if it is not.

### Grouping people

You have to divide the students in a class into two groups. Each student has a number and you want to use this data to assign them to either group A or B.

Create a static method called  _giveGroup_, which takes in a student's number. If this is even, return the character "A", otherwise return the character "B".

### Cleaning data

The school needs to count how many of its future students want to learn Java. To do this, a survey was sent out asking students which language they wanted to study. Students wrote "Java" with inconsistent lower and upper case letters, e. g. "JAVA" or "java", instead of "Java".

Create a static method called  _countStudents_, which receives an array containing the languages chosen by the candidates. Return the number of candidates who have chosen Java, regardless of how they wrote it (upper/lower case).


### BlackJack (Bonus)

Write a function that takes in parameter the hand of a player and the hand of the bank, then returns the winner of the game.

Rules : If the player or the bank has more than 21, he or it loses the game. The player wins if he has more than the bank and 21 or less. Same goes for the bank. In case of ex aeco, we will consider that the player wins. If the player has in hand an ace and a 10 points card (e.g. 1 + J or 1 + 10), he wins by BlackJack.

Values of the cards : The heads are worth 10 ("J", "Q", and "K") The numbers are worth what's indicated (a 4-card is worth 4 points) For simplicity purpose, the ace (1) is worth 1 point except for the Blackjack case where it's considered to be worth 11.

### Testing

Remember to test the methods you have developed.

## Quiz

You will find a  `Quiz.java`  file at the root of your local repository: compile and run it.

Answer the questions, and at the end it will generate a  `quiz.txt`  file.

You can then edit the file manually to correct your answers.

> Please answer honestly, without any help from the Internet!


## Finalization

Push the changes made to your local branch; and push everything to your forked Repo.

Now return to Odyssey and share the link to your Repo on GitHub.