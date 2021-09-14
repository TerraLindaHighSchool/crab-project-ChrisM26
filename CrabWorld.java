import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,202,192);
        for(int i = 0; i < 9; i++) {
            Worm worm = new Worm();
            addObject(worm,
                Greenfoot.getRandomNumber(getWidth() - 2 * worm.getImage().getWidth()) + worm.getImage().getWidth(),
                Greenfoot.getRandomNumber(getHeight() - 2 * worm.getImage().getHeight()) + worm.getImage().getHeight());
        }
        lobster lobster = new lobster();
        addObject(lobster,468,34);
        lobster lobster2 = new lobster();
        addObject(lobster2,453,279);
    }
}