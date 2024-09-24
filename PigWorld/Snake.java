// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Randomnizes the initial direction of the snake when you run the program. 
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(359));
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * Makes the snake move randomnly around the world.
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Makes the snake eat the pig when it intersects it. 
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World PigWorld = getWorld();
            PigWorld.removeObject(pig);
        }
    }

    /**
     * When snake eats the pig, game is lost
     */
    public boolean isGameOver()
    {
        World PigWorld = getWorld();
        if (PigWorld.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to the Game Over screen once defeat is achieved. 
     */
    public void transitionToGameOverWorld()
    {
        World GameOverWorld =  new GameOverWorld();
        Greenfoot.setWorld(GameOverWorld);
        Greenfoot.playSound("lose.wav");
    }
}
