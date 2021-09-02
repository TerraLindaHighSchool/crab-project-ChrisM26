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
        Worm worm = new Worm();
        addObject(worm,80,80);
        Worm worm2 = new Worm();
        addObject(worm2,419,89);
        Worm worm3 = new Worm();
        addObject(worm3,400,341);
        Worm worm4 = new Worm();
        addObject(worm4,110,274);
        Worm worm5 = new Worm();
        addObject(worm5,106,419);
        Worm worm6 = new Worm();
        addObject(worm6,412,520);
        Worm worm7 = new Worm();
        addObject(worm7,431,212);
        worm2.setLocation(338,103);
        worm7.setLocation(480,159);
        worm3.setLocation(322,322);
        worm6.setLocation(493,416);
        Worm worm8 = new Worm();
        addObject(worm8,284,520);
        lobster lobster = new lobster();
        addObject(lobster,468,34);
    }
}