import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bermain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bermain extends World
{
    int jeda=100;
    

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
        kembali kembali = new kembali();
        addObject(kembali,-15,-19);
        kembali.setLocation(406,102);
        removeObject(kembali);
        kembali kembali2 = new kembali();
        addObject(kembali2,33,31);
        kembali2.setLocation(28,26);
    }
    
    public int getSkorbuaya(){
        return skorbuaya;          
    }
    
    public void updSkor(int x){
        skorbuaya+=x;
    }
     public void act(){
        if(jeda==0){
            addObject(new bom(),556,587);
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
            addObject(new bom(), getWidth()/9,getHeight()/1);
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
      
        
        if(jeda==0){
            addObject(new mang(), getWidth()/2,getHeight()/1);
            jeda=300;
        }
        else{
            jeda--;
        }
        
        if(jeda==0){
            addObject(new mang(), getWidth()/9,getHeight()/1);
            jeda=200;
        }
        else{
            jeda--;
        }
        if(jeda==0){
            addObject(new mang(),615,563);
            jeda=200;
        }
        else{
            jeda--;
        }
    }
    public void gameover(){
        addObject(new gameover(), 300, 200);
    }
}