import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EstableObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstableObject extends Actor
{
    protected int scoreGiven;
    
    public void act(){}

    void handleCollisions(){
        if(isTouching(Pacman.class)){
            PacmanLevel1.score += scoreGiven;
            getWorld().removeObject(this);
        }
    }   
}
