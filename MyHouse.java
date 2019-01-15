/**
 * It draws a house on screen using individual shapes
 * 
 *
 * @author Dovmov
 * @version January, 11, 2019 
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    //ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;

    /**
     * The job of a constructor is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        
        drawHouse();
    }

    /**
     * Draw the house for us 
     */
    public void drawHouse()
    {
        //put the sun in position
        base.slowMoveVertical(100);
        base.changeSize(150);
        base.changeColor("black");
        base.makeVisible();
        
        roof.makeVisible();
        roof.changeSize(40, 180);
        roof.changeColor("green");
        roof.slowMoveVertical(100);
        roof.slowMoveHorizontal(80);
        
        sun.slowMoveVertical(-10);
        sun.slowMoveHorizontal(100);
    }
}
