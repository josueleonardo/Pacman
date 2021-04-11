import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FisftyPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FisftyPoints extends EstableObject
{
    public FisftyPoints(){
        setImage("images/50points.png");
        scoreGiven = 50;
    }
    
    /**
     * Act - do whatever the FisftyPoints wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleCollisions();
    }    
}
