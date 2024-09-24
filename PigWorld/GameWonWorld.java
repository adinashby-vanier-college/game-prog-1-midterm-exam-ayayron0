// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        showTextWithBigGreenFont("You Win!", 180, 200);
    }

    /**
     * Changes the font to be more visually appealing and understandable.
     */
    public void showTextWithBigGreenFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }
}
