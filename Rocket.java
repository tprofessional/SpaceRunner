import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
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
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
