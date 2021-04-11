import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{

    public static int score;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public void act(){
        showText("Score: " + score,550,30);
    }
    
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        int score= 0;
        
        for(int x = 30; x < 600; x+=60){
            this.addObject(new Wall(), x, 30);
            this.addObject(new Wall(), x, 570);
        }
        for(int x = 150; x < 480; x+=60){
            this.addObject(new Wall(), x, 390);
        }
        for(int x = 210; x < 420; x+=60){
            this.addObject(new Wall(), x, 270);
        }
        for(int y = 90; y < 240; y+=60){
            this.addObject(new Wall(), 30, y);
            this.addObject(new Wall(), 570, y);
        }
        for(int y = 210; y < 270; y+=60){
            this.addObject(new Wall(), 210, y);
            this.addObject(new Wall(), 390, y);
        }
        for(int y = 330; y < 570; y+=60){
            this.addObject(new Wall(), 30, y);
            this.addObject(new Wall(), 570, y);
        }
                
        for(int x = 90; x < 570; x+=60){
            this.addObject(new TenPoints(), x, 90);
            this.addObject(new TenPoints(), x, 510);
        }
        for(int y = 150; y < 510; y+=60){
            this.addObject(new TenPoints(), 90, y);
            this.addObject(new TenPoints(), 510, y);
        }
        
        addObject(new FisftyPoints(), 210, 150);
        addObject(new FisftyPoints(), 390, 150);
        
        addObject(new Item1(), 300, 210);
        addObject(new Item2(), 300, 330);
        
        addObject(new Pacman(), 300, 450);
        addObject(new Teleport1(), 600,270);
        addObject(new Teleport(), 0,270);
        
        this.addObject(new HUD(),510,30);
        
        //addObject(new Phantom(), 250, 40);
    }
}