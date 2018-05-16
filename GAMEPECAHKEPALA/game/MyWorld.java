import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int jeda=100;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        prepare();
    }
   
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        keluar keluar = new keluar();
        addObject(keluar,582,20);
        keluar.setLocation(575,17);
        mulai mulai = new mulai();
        addObject(mulai,512,345);
    }
     public void act(){
        if(jeda==0){
            addObject(new bom(),615,563);
            jeda=200;
        }
        else{
            jeda--;
        }
        
        if(jeda==0){
            addObject(new gin(), getWidth()/2,getHeight()/1);
            jeda=300;
        }
        else{
            jeda--;
        }
        
        if(jeda==0){
            addObject(new gin(), getWidth()/9,getHeight()/1);
            jeda=200;
        }
        else{
            jeda--;
        }
        
        if(jeda==0){
            addObject(new bom(), getWidth()/3,getHeight()/1);
            jeda=200;
        }
        else{
            jeda--;
        }
        
         if(jeda==0){
            addObject(new gin(),556,587);
            jeda=200;
        }
        else{
            jeda--;
        }
    }
}
