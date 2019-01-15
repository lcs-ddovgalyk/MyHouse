/**
 * Creates an instance of a Tree.
 *
 * @author D. Dovgalyk
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    private Triangle leafes;
    private Triangle leafestop;
    private Triangle leafesmiddle;
    private Square base;
    
    public Tree(int x, int y)
    {
        // initialise instance variables
        leafes = new Triangle();
        leafestop = new Triangle();
        leafesmiddle = new Triangle();
        base = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        base.makeVisible();
        base.changeColor("brown");
        base.moveHorizontal(100);
        base.moveVertical(100);
        
        leafes.makeVisible();
        leafes.changeSize(45, 60);
        leafes.moveHorizontal(124);
        leafes.moveVertical(100);
        
        leafesmiddle.makeVisible();
        leafesmiddle.changeSize(40,55);
        leafesmiddle.moveHorizontal(124);
        leafesmiddle.moveVertical(85);
        
        leafestop.makeVisible();
        leafestop.changeSize(35,50);
        leafestop.moveHorizontal(124);
        leafestop.moveVertical(70);
        
        
        
        
        
        
      
        // translate the tree to the specified location
        
        
    }
    
}