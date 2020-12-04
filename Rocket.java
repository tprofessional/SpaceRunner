import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Rocket is a sprite controlled by the user. The user uses their cursor to control 
 * the movement of the rocket
 * 
 * @author Trisha Moorkoth
 * @version 1.0
 */
public class Rocket extends Actor
{
    static double SCALE = 0.1;
    
    /**
     * class constructor Rocket
    */
    public Rocket() {
        GreenfootImage image = getImage();
        double imgW = image.getWidth();
        double imgH = image.getHeight();
        image.scale((int)(imgW * SCALE), (int) (imgH * SCALE));
        setImage(image);
    }
    
    /**
     * Act - This method makes the rocket move according to arrow keys
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown())
    }
}
