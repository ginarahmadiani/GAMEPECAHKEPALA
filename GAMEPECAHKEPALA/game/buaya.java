 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buaya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buaya extends Actor
{
    /**
     * Act - do whatever the buaya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int currentRotation = 0;
    public void act() 
    {
        KeyboardControls();
        eatgin();
        eatmang();
        eatbom();
        
    }
    public void KeyboardControls(){
    if(Greenfoot.isKeyDown("up")){
    move(5);
    }
    if(Greenfoot.isKeyDown("down")){
    move(-5);
    }
    if(Greenfoot.isKeyDown("right")){
    currentRotation+=2;
    setRotation(currentRotation);
    }
    if(Greenfoot.isKeyDown("left")){
    currentRotation-=2;
    setRotation(currentRotation);
    }
    }
    
    public void eatgin(){
        if(isTouching(gin.class)){
        removeTouching(gin.class);
        MyWorld myw1  = (MyWorld) getWorld();
        myw1.updSkor(10);
        }
    }
    public void eatmang(){
        if(isTouching(mang.class)){
        removeTouching(mang.class);   
        }
    }
    public void eatbom(){
        if(isTouching(bom.class)){
        removeTouching(bom.class);
        Greenfoot.stop();
        Greenfoot.setWorld(new gameover)();
    }
  }
}


    
