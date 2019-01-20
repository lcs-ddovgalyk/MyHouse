
/**
 * Write a description of class Cloud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cloud
{
    // instance variables - replace the example below with your own
    private Circle cloud;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Circle cloud4;
    
    private Square cloud5;
    private Square cloud6;
    
    public Cloud(int x, int y)
    {
        cloud = new Circle();
        cloud1 = new Circle();
        cloud2 = new Circle();
        cloud3 = new Circle();
        cloud4 = new Circle();
        cloud5 = new Square();
        cloud6 = new Square();
        drawCloud(x, y);
    }

    
    public void drawCloud(int x, int y)
    {
        int z = 40;
        
        cloud.makeVisible();
        cloud.changeColor("blue");
        cloud.changeSize(z);
        cloud.moveVertical(y);
        cloud.moveHorizontal(x);
        
        cloud1.makeVisible();
        cloud1.changeColor("blue");
        cloud1.changeSize(z);
        cloud1.moveVertical(y+20);
        cloud1.moveHorizontal(x+13);
        
       
        
        cloud2.makeVisible();
        cloud2.changeColor("blue");
        cloud2.changeSize(z);
        cloud2.moveVertical(y);
        cloud2.moveHorizontal(x+26);
        
        cloud3.makeVisible();
        cloud3.changeColor("blue");
        cloud3.changeSize(z);
        cloud3.moveVertical(y+20);
        cloud3.moveHorizontal(x-17);
        
        cloud4.makeVisible();
        cloud4.changeColor("blue");
        cloud4.changeSize(z);
        cloud4.moveVertical(y+20);
        cloud4.moveHorizontal(x+40);
        
        cloud5.makeVisible();
        cloud5.changeColor("blue");
        cloud5.moveVertical(y+40);
        cloud5.moveHorizontal(x-10);
        
        cloud6.makeVisible();
        cloud6.changeColor("blue");
        cloud6.moveVertical(y+40);
        cloud6.moveHorizontal(x-33);
        
    }
}
