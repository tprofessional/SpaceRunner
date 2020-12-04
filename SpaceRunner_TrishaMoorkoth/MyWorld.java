import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Trisha 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int plntXCor = Greenfoot.getRandomNumber(600);
    int plntYCor = Greenfoot.getRandomNumber(400);
    int starXCor = Greenfoot.getRandomNumber(600);
    int starYCor = Greenfoot.getRandomNumber(400);

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        for (int i = 0; i<10; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Planet(), x, y);
        }
        for (int i = 0; i<10; i++) {
            int a = Greenfoot.getRandomNumber(getWidth());
            int b = Greenfoot.getRandomNumber(getHeight());
            addObject(new Star(), a, b);
        }
        //populate();
    }
    
    public void populate() {
       //add
    }
}
