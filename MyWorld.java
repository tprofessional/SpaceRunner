import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @authors Trisha Moorkoth, Julia Zhao, Erika Tran
 * @version 1.1
 */
public class MyWorld extends World
{
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
}
