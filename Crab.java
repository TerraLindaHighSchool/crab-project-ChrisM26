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
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    
    // Turn the crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
        
    // Check for key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2, getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2, getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+2);
        }
    }    
    
    
    
    // Check for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("soundeating.mp3");
            
            // Winning the game
            if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("FanFare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(lobster.class))
        {
            Greenfoot.playSound("deathsound.mp3");
            Greenfoot.stop();
        }
    }
}
