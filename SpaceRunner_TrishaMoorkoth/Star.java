import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    public String starImage; //png of yellow star
    static double SCALE = 0.2;
    
    // Star constructor
    public Star() {
        starImage= "star.png";
        setImage(starImage);
        GreenfootImage image = getImage();
        double imgW = image.getWidth();
        double imgH = image.getHeight();
        image.scale((int) (imgW * SCALE), (int) (imgH * SCALE));
        setImage(image);
    }
    
    // If user clicks on the star, printFact method will run
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            printFact();
        }
    }
  
    // Will generate a random fact to display to user
    public void printFact()
    { 
        int number = Greenfoot.getRandomNumber(9); // Get random number 0-8, representing all 9 facts
        if(number == 0) {
            System.out.println("The universe is 13.8 billion years old!");
        }
        else if(number == 1) {
            System.out.println("The sun is 10,000 degrees Fahrenheit!");
        }
        else if(number == 2) {
            System.out.println("The Earth is 92 million miles from the sun!");
        }
        else if(number == 3) {
            System.out.println("Carl Sagan laid the foundation for planetary science and exobiology disciplines!");
        }
        else if(number == 4) {
            System.out.println("The body with a greater mass has a greater gravitational pull between two celestial bodies at an equal distance between each!");
        }
        else if(number == 5) {
            System.out.println("Jupiter has the most moons!");
        }
        else if(number == 6) {
            System.out.println("A storm at the Great Red Spot on Jupiter lasts has been lasting 360 years!");
        }
        else if(number == 7) {
            System.out.println("Brown dwarfs are considered stars!");
        }
        else if(number == 8) {
            System.out.println("There are 3 stars in Alpha Centauri!");
        }
    }    
}
