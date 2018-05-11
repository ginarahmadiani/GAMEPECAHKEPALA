import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrows extends Actor
{
    
 private int arrows;
    /** The maximum number of arrows the player can hold. */
    public final int MAX = 10000000;

    /**
     * Sets up the player with 50 arrows initially.
     */
    public void addedToWorld(World world)
    {
        arrows = 50;
        add(0);
    }
    
    /**
     * Add arrows. If the number of arrows exceeds the maximum allowed, don't add any more.
     */
    public void add(int num)
    {
        arrows += num;
        if(arrows>MAX) arrows = MAX;
        GreenfootImage image = new GreenfootImage(480, 25);
        image.drawString("'Gators Left: " + arrows, 20, 20);
        setImage(image);
    }
    
    /**
     * Return the number of arrows.
     */
    public int getNum()
    {
        return arrows;
    }
}
