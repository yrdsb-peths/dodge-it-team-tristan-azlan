import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Actor
{
    int livesNum = 3;
    
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetBomb();
        }
        
        if(livesNum == 0){
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBomb()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
