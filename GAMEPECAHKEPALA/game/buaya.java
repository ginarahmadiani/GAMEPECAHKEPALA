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
    int skor = 0;
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
    
    skor();
        {
        
    }
}
    public void skor()
    {
        if (isTouching(gin.class)){
            skor++;
            getWorld().showText("skor="+skor,100,35);
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
        gameover gameover = new gameover();
        getWorld().addObject(gameover, getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
        }
    }

}


    
