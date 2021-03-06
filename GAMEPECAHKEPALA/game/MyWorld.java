import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GreenfootSound music = new GreenfootSound("title theme.mp3");
    public void started()
    {
        music.setVolume(100);
        music.play();
    }
    
    public void stopped()
    {
        music.stop();
        music.play();
    }
    
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
    
}
