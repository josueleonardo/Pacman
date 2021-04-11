import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item1 extends EstableObject
{
    public Item1(){
        this.setImage("images/Item1.png");
        scoreGiven = 40;
    }
    
    /**
     * Act - do whatever the Item1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleCollisions();
    }    
}
