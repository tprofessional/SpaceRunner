import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Initializes the stars, planets, and the rocket.
 * 
 * @authors Trisha Moorkoth, Julia Zhao, Erika Tran
 * @version 1.1
 */
public class MyWorld extends World
{
    final int X_MID = getWidth()/2;
    final int Y_MID = getHeight()/2;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        //Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        //create planets
        planets();
        //create stars
        stars();
        //initialize rocket
        //rocket();
    }
    
    public void planets() {
       for (int i = 0; i<10; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Planet(), x, y);
        }
    }
    
    public void stars() {
        for (int i = 0; i<10; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Star(), x, y);
        }
    }
    
    public void rocket() {
        //replace new Rocket() with instantiated rocket
        addObject(userRocket, X_MID, Y_MID); 
    }
}
