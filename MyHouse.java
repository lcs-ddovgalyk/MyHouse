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
    private Tree tree1;
    private Square door;
    private Square door1;
    private Square window;
    private Circle ground;
    private Cloud cloud1;
    /**
     * The job of a constructor is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        tree1 = new Tree(200,235);
        door = new Square();
        door1 = new Square();
        window = new Square();
        ground = new Circle();
        cloud1 = new Cloud(100,0);
        cloud1 = new Cloud(170,70);
        cloud1 = new Cloud(330,40);
        drawHouse();
    }

    /**
     * Draw the house for us 
     */
    public void drawHouse()
    {
        //ground has to be frist so all other objects are above it
        //creates ground
        //makes the ground visible
        ground.makeVisible();
        //changes the grounds color
        ground.changeColor("magenta");
        //changes the grounds size
        ground.changeSize(900);
        //changes the grounds coordinats
        ground.moveHorizontal(-170);
        ground.moveVertical(250);
        
        //creates the base of the house
        base.slowMoveVertical(200);
        base.changeSize(150);
        base.changeColor("black");
        base.makeVisible();
        //creates the roof of the house
        roof.makeVisible();
        roof.changeSize(40, 180);
        roof.changeColor("red");
        roof.moveVertical(200);
        roof.moveHorizontal(80);
        //creates sun
        sun.moveVertical(-10);
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.changeSize(100);
        sun.moveHorizontal(400);
        //creates the door
        door.makeVisible();
        door.moveHorizontal(100);
        door.moveVertical(300);
        door.changeColor("red");
        //since this is a drawing just with basic shapes there is no rectangle
        //so we use 2 squares in order to create a door
        door1.makeVisible();
        door1.moveHorizontal(100);
        door1.moveVertical(320);
        door1.changeColor("red");
        //creates the window
        window.makeVisible();
        window.moveHorizontal(40);
        window.moveVertical(220);
        window.changeColor("red");
        
        
        
        
    }
}
