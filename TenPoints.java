import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TenPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenPoints extends EstableObject
{
    public TenPoints(){
        setImage("images/10points.png");
        scoreGiven = 10;
    }
    
    /**
     * Act - do whatever the TenPoints wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleCollisions();
    }    
}
