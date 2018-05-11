import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An abstract balloon class that displays a floating balloon. When hit by an arrow
 * it disappears and adds values to the players arrows and score.
 * 
 * @author Michael Bellingo
 * @version plah
 */
public abstract class kepa extends Actor
{
    /**
     * If the balloon is hit, disappear and add values to the player's score and arrows.
     * If the balloon is out of the world, disappear.
     * @param score the number to add to the score on a hit.
     * @param arrows the number of arrows to add on a hit.
     */
    public void act(int score, int arrows) 
    {
        TargetWorld world = (TargetWorld)getWorld();
        
        if(getOneIntersectingObject(FireArrow.class) != null) {
            world.addScore(score);
            world.addArrows(arrows);
            world.removeObject(this);
            return;
        }
        
        setLocation(getX(), getY()-1);
        if(getY()<10) world.removeObject(this);
    }    
}
