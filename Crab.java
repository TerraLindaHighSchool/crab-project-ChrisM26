import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author Chris Maldonado
 * @version 08/31/21
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    
    // Turn the crab at the edge
    private void turnAtEdge()
    {
        
    }
        
    // Check for key presses so user can turn the Crab
    private void checkKeyPress()
    {
        
    }
    
    // Check for collisions with other objects
    private void onCollision()
    {
        
    }
}
