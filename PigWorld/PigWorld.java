// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 520, 72);
        Burger burger2 =  new Burger();
        addObject(burger2, 487, 167);
        Burger burger3 =  new Burger();
        addObject(burger3, 413, 55);
        Snake snake =  new Snake();
        addObject(snake, 538, 354);
        Pig pig =  new Pig();
        addObject(pig, 268, 211);
        Burger burger4 =  new Burger();
        addObject(burger4, 41, 43);
        Burger burger5 =  new Burger();
        addObject(burger5, 131, 63);
        Burger burger6 =  new Burger();
        addObject(burger6, 57, 113);
        Burger burger7 =  new Burger();
        addObject(burger7, 42, 317);
        Burger burger8 =  new Burger();
        addObject(burger8, 440, 326);
        Burger burger9 =  new Burger();
        addObject(burger9, 121, 362);
        burger2.setLocation(455, 211);
        burger6.setLocation(68, 178);
        burger2.setLocation(556, 140);
        burger3.setLocation(313, 44);
        burger.setLocation(459, 104);
        burger2.setLocation(544, 27);
        burger6.setLocation(586, 264);
        burger7.setLocation(51, 197);
        burger9.setLocation(82, 336);
        Burger burger10 =  new Burger();
        addObject(burger10, 225, 374);
    }
}
