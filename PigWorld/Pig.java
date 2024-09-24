// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * Sets up the movement for the pig using the W,A, S, D keys.
     */
    public void movement()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * Lets the pig be able to eat the burgers with a sound.
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World PigWorld = getWorld();
            PigWorld.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * Ends the game once there are no more burgers left. 
     */
    public boolean isGameWon()
    {
        World PigWorld = getWorld();
        if (PigWorld.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to the GameWonWorld once victory is achieved.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }
}
