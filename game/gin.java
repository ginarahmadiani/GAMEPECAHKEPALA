<<<<<<< HEAD:game/gin.java
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gin extends Actor
{
    /**
     * Act - do whatever the gin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        setLocation(getX(),getY()-1);
        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }    
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gin extends Actor
{
    /**
     * Act - do whatever the gin wants to do. This method is called whenever
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

>>>>>>> cdd7f77ffc6a7c76f7259e1454d2f6489292bf52:GAMEPECAHKEPALA/game/gin.java
