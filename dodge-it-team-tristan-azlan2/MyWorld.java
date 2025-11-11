import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {    
        Bomb bomb = new Bomb ();
        addObject(bomb, 600, 100);
    }
}
