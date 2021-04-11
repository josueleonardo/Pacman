import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item2 extends EstableObject
{
    public Item2(){
        setImage("images/Item2.png");
        scoreGiven = 30;
    }
    
    /**
     * Act - do whatever the Item2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleCollisions();
    }    
}
