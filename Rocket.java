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
    //instantiate rocket
    Rocket userRocket = new Rocket();
    
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
    /**
     * This method makes the rocket align it's heading with the mouse and move 
     * as the mouse directs it
     */
    public void followMouse() {
        //creates an instance of the MouseInfo class
        //this will help track the location of the mouse
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        //gets x position of mouse
        int mouseX = mouse.getX();
        //gets y position of mouse
        int mouseY = mouse.getY();
        
        userRocket.turnTowards(mouseX, mouseY);
    }
}
