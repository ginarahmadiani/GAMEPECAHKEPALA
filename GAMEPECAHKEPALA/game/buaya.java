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
        private boolean oldTouchingbom = false;
        private static boolean dead;
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
        }
    }
    boolean touchingbom = false;{
        for(Bom bom : getWorld().getObjects(bom.class));
            if(Math.abs(bom.getX() - getX()) < 40){
                if(Math.abs(bom.getY() + 30 - getY()) > 37){
                    dead = true;
                }
                touchingbom = true;
            }
        }
        if(!oldTouchingbom && touchingPipe && !dead){
            Score.add(1);
        }
        oldTouchingbom = touchingbom;{
        if(dead){
            FlappyWorld myWorld = (FlappyWorld) getWorld();
            myWorld.gameover();
            getWorld().removeObject(this);
        }
    } 
}


    
