import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planet extends Actor
{
    public int xcor;
    public int ycor;
    public int rad;
    static double SCALE = 0.8;
    
    //creates planets at random positions at random sizes
    public Planet()
    {       
       //GreenfootImage image = new GreenfootImage(10, 10);
       GreenfootImage image = getImage();
       double imgW = image.getWidth();
       double imgH = image.getHeight();
       image.scale((int) (imgW * SCALE), (int) (imgH * SCALE));
       setImage(image);
    }
    
    /**
     * Act - do whatever the Planet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //while sprite moves xcor += how much the sprite moves;
    }
}
