import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * The star class is used to print hints for future questions prompted by the planets.
 * 
 * Erika Tran, Trisha Moorkoth
 * version 1.1
 */
public class Star extends Actor
{
    static double SCALE = 0.07;
    public Star() {
        GreenfootImage image = getImage();
        double imgW = image.getWidth();
        double imgH = image.getHeight();
        image.scale((int)(imgW * SCALE), (int) (imgH * SCALE));
        setImage(image);
    }
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {
        //if user clicks on this star, printFact method will run and display a fact
        if(isTouching(Rocket.class)) {
            printFact();
        }
    }
    
    /**
     * Will generate a random fact to display to user
     */
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
