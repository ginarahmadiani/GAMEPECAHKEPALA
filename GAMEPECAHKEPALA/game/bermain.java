import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bermain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bermain extends World
{
private int skorbuaya;
    /**
     * Constructor for objects of class bermain.
     * 
     */
    public bermain()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gin gin = new gin();
        addObject(gin,753,362);
        mang mang = new mang();
        addObject(mang,776,380);
        gin gin2 = new gin();
        addObject(gin2,363,390);
        mang mang2 = new mang();
        addObject(mang2,423,398);
        gin gin3 = new gin();
        addObject(gin3,20,389);
        mang mang3 = new mang();
        addObject(mang3,50,388);
        bom bom = new bom();
        addObject(bom,715,381);
        bom bom2 = new bom();
        addObject(bom2,397,386);
        bom bom3 = new bom();
        addObject(bom3,2,376);
        bom bom4 = new bom();
        addObject(bom4,335,383);
        bom4.setLocation(334,362);
        buaya buaya = new buaya();
        addObject(buaya,179,328);
    }
    
    public int getSkorbuaya(){
        return skorbuaya;          
    }
    
    public void updSkor(int x){
        skorbuaya+=x;
    }
}
