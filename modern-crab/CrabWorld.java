import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
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
        Worm worm = new Worm();
        addObject(worm,112,147);
        Worm worm2 = new Worm();
        addObject(worm2,225,446);
        Worm worm3 = new Worm();
        addObject(worm3,439,149);
        Worm worm4 = new Worm();
        addObject(worm4,455,435);
        Worm worm5 = new Worm();
        addObject(worm5,162,311);
        Worm worm6 = new Worm();
        addObject(worm6,478,234);
        Worm worm7 = new Worm();
        addObject(worm7,263,129);
        Crab crab = new Crab();
        addObject(crab,315,298);
        Worm worm8 = new Worm();
        addObject(worm8,108,407);
        Worm worm9 = new Worm();
        addObject(worm9,449,337);
    }
}
