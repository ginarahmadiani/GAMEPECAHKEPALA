import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mang extends Actor
{
    int a=1;
    int v=2;
    /**
     * Act - do whatever the mang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()-1);
    }    
}