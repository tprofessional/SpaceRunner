import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Planets contain questions that you can answer to get points.
 * 
 * @author Erika Tran, Kellie Tai, Julia Zhao, Trisha Moorkoth
 * @version 1.2
 */
public class Planet extends Actor
{
    static double SCALE = 1;
    
    public Planet()
    {       
       //set image of Planet objects
       GreenfootImage image = getImage();
       double imgW = image.getWidth();
       double imgH = image.getHeight();
       image.scale((int) (imgW * SCALE), (int) (imgH * SCALE));
       setImage(image);
    }
    
    /**
     * correct - prints out 'correct' message
     */
    public void correct() {
      System.out.println("You are correct!");
  }
  /**
   * Act - if planet is touching a rocket, askQuestion() method is called
   */
  public void act()
    {
        if(isTouching(Rocket.class)) {
          askQuestion();
        }
    }
  /**
   * askQuestion - details assignments of random numbers 0-8 to questions
   */
  public void askQuestion() { 
        //assign random number to question
        int number = Greenfoot.getRandomNumber(9);
    
        if(number == 0) {
            //question console appears
            String q = Greenfoot.ask("How old is the universe? \n a. 15.7 billion years \n b. 38.2 million years \n c. 13.8 billion years \n d. 57.4 billion years");
            //check for correct answer, "c"
            if (q.contains("c")) {
            //if answer submitted is correct, print correct message from correct() method
            correct();
            }
            else {
                //if incorrect we give them another try
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. 15.7 billion years \n b. 38.2 million years \n c. 13.8 billion years \n d. 57.4 billion years");
                if (w.contains("c")) {
                    correct();
                }
            }
        }
        //else ifs check all possible random numbers in range 0 - 8
        else if(number == 1) {
            String q = Greenfoot.ask("How hot is the sun? \n a. 4,000 degrees Fahrenheit \n b. 8,000 degrees Fahrenheit \n c. 10,000 degrees Fahrenheit \n d. 13,000 degrees Fahrenheit");
            if (q.contains("c")) {
                correct();
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. 4,000 degrees Fahrenheit \n b. 8,000 degrees Fahrenheit \n c. 10,000 degrees Fahrenheit \n d. 13,000 degrees Fahrenheit");
                if (w.contains("c")) {
                    correct();
                }
            }
        }
        else if(number == 2) {
            String q = Greenfoot.ask("How far is Earth from the sun? \n a. 49 million miles \n b. 92 million miles \n c. 127 million miles \n d. 183 million miles");
            if (q.contains("b")) {
                System.out.println("You are correct!");
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. 49 million miles \n b. 92 million miles \n c. 127 million miles \n d. 183 million miles");
                if (w.contains("b")) {
                    correct();
                }
            }
        }
        else if (number == 3) {
            String q = Greenfoot.ask("Who laid the foundation for planetary science and exobiology disciplines? \n a. Albert Einstein \n b. Carl Sagan \n c. George Gamow \n d. Margaret Burbidge");
            if (q.contains("b")) {
                correct();
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. Albert Einstein \n b. Carl Sagan \n c. George Gamow \n d. Margaret Burbidge");
                if (w.contains("b")) {
                    correct();
                }
            }
        }
        else if(number == 4) {
            String q = Greenfoot.ask("If you are equidistant from two celestial bodies, which has the greater gravitational pull assuming there is nothing else nearby? \n a. The body with a greater mass \n b. The body with a greater volume \n c. Neither \n d. The body with a greater angular velocity");
            if (q.contains("a")) {
                correct(); //add variable
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. The body with a greater mass \n b. The body with a greater volume \n c. Neither \n d. The body with a greater angular velocity");
                if (w.contains("a")) {
                    correct();
                }
            }
        }
        else if (number == 5) {
            String q = Greenfoot.ask("Which planet has the most moons? \n a. Jupiter \n b. Saturn \n c. Mars \n d. Neptune");
            if (q.contains("a")) {
                correct(); //add variable
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. Jupiter \n b. Saturn \n c. Mars \n d. Neptune");
                if (w.contains("a")) {
                    correct();
                }
            }
        }
        else if(number == 6) {
            String q = Greenfoot.ask("How long has the storm on Jupiter (Great Red Spot) been going on? \n a. 150 years \n b. 78 years \n c. 10 years \n d. 360 years");
            if (q.contains("d")) {
                correct(); //add variable
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. 150 years \n b. 78 years \n c. 10 years \n d. 360 years");
                if (w.contains("d")) {
                    correct();
                }
            }
        }
        else if(number == 7) {
            String q = Greenfoot.ask("Brown dwarfs are considered as a... \n a. Star \n b. Planet \n c. Meteor \n d. None of the above");
            if (q.contains("a")) {
              correct();
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. Star \n b. Planet \n c. Meteor \n d. None of the above");
                if (w.contains("a")) {
                    correct();
                }
            }
        }
        else if(number == 8) {
            String q = Greenfoot.ask("How many star(s) are there in Alpha Centauri? \n a. 1 \n b. 2 \n c. 3 \n d. 4");
            if (q.contains("c")) {
              correct(); //add variable
            }
            else {
                String w = Greenfoot.ask("Sorry, you are incorrect. Please try again. \n a. 1 \n b. 2 \n c. 3 \n d. 4");
                if (w.contains("c")) {
                    correct();
                }
            }
        }
    }
}
