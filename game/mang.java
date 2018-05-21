<<<<<<< HEAD:game/mang.java
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mang extends Actor
{
    /**
     * Act - do whatever the mang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        setLocation(getX(),getY()-1);
        if(isAtEdge())
        {
            //w.removeObject(this);
            setLocation(590,getX());
            
        }
    }    
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mang extends Actor
{
    /**
     * Act - do whatever the mang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        setLocation(getX(),getY()-1);
        if(isAtEdge())
        {
            //w.removeObject(this);
            setLocation(590,getX());
            
        }
    }    
}
>>>>>>> cdd7f77ffc6a7c76f7259e1454d2f6489292bf52:GAMEPECAHKEPALA/game/mang.java
