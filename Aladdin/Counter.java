import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
        public static int gameOver_counter = 0;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score : "+score +"      Grabber:"+gameOver_counter, 22, Color.WHITE, Color.BLACK));
        //setImage(new GreenfootImage("Grabber : "+gameOver_counter , 20, Color.WHITE, Color.BLACK));
    }    
    
    public static void addScore()
    {
        score += 11;
    }
    
    public static void bonusPoints()
    {
        score = score + 300;
        gameOver_counter+=1;
     //   Counter.act();
    }
    
    public static void setStartScore()
    {
        score = 0;
        gameOver_counter=0;
    }
    
}
