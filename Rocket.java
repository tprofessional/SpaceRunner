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
        //set image of rocket
        GreenfootImage image = getImage();
        double imgW = image.getWidth();
        double imgH = image.getHeight();
        image.scale((int)(imgW * SCALE), (int) (imgH * SCALE));
        setImage(image);
        //set heading to 0 degrees
        setRotation(0);
    }
    
    /**
     * Act - This method makes the rocket move according to arrow keys
     */
    public void act() 
    {
        // a key rotates rocket left
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        // d key rotates rocket right
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
        // w key moves rocket  forward
        if (Greenfoot.isKeyDown("w")) {
            move(3);
        }
    }
}
