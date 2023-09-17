/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class shows an ocean and a lighthouse on a island. 
 * 
 * @author  kevin vojtek 
 * @version 2016.02.29
 */
public class Picture
{
    private Circle sun;
    private Person watcher; 
    private Triangle roof; 
    private Square window1; 
    private Square window2;
    private Square base1;   
    private Square base2;
    private boolean drawn;
    private Square ocean;
    private Square ground1;
    private Square ground2;
    private Square ground3; 
    private Square ground4;
    private Square ground5;
    private Triangle tiltedFloor1; 
    private Triangle tiltedFloor2;
    private Triangle tiltedFloor3;
    private Triangle tiltedFloor4; 

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    { 
        sun = new Circle();
        ocean = new Square();
        window1 = new Square();
        window2 = new Square();
        roof = new Triangle();
        base1 = new Square();
        base2 = new Square();
        ground1 = new Square();
        ground2 = new Square();
        ground3 = new Square();
        ground4 = new Square();
        ground5 = new Square();
        tiltedFloor1 = new Triangle();
        tiltedFloor2 = new Triangle();
        tiltedFloor3 = new Triangle();
        tiltedFloor4 = new Triangle();
        watcher = new Person();
        
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            //ocean
            
            ocean.changeColor("blue");
            ocean.moveHorizontal(0);
            ocean.moveVertical(180);
            ocean.changeSize(500);
            ocean.makeVisible();
            
            //ocean floor
            
            ground1.changeColor("green");
            ground1.moveHorizontal(170);
            ground1.moveVertical(165);
            ground1.changeSize(210);
            ground1.makeVisible();
            
            ground2.changeColor("green");
            ground2.moveHorizontal(135);
            ground2.moveVertical(220);
            ground2.changeSize(50);
            ground2.makeVisible();
            
            ground3.changeColor("green");
            ground3.moveHorizontal(120);
            ground3.moveVertical(220);
            ground3.changeSize(40);
            ground3.makeVisible();
            
            ground4.changeColor("green");
            ground4.moveHorizontal(80);
            ground4.moveVertical(270);
            ground4.changeSize(90);
            ground4.makeVisible();
            
            ground5.changeColor("green");
            ground5.moveHorizontal(360);
            ground5.moveVertical(240);
            ground5.changeSize(60);
            ground5.makeVisible();
            
            tiltedFloor1.changeColor("green");
            tiltedFloor1.moveHorizontal(170);
            tiltedFloor1.moveVertical(165);
            tiltedFloor1.makeVisible();
            
            
            tiltedFloor2.changeColor("green");
            tiltedFloor2.moveHorizontal(120);
            tiltedFloor2.moveVertical(220);
            tiltedFloor2.changeSize(60,70);
            tiltedFloor2.makeVisible();
            
            tiltedFloor3.changeColor("green");
            tiltedFloor3.moveHorizontal(380);
            tiltedFloor3.moveVertical(180);
            tiltedFloor3.changeSize(60,70);
            tiltedFloor3.makeVisible();
            
            tiltedFloor4.changeColor("green");
            tiltedFloor4.moveHorizontal(420);
            tiltedFloor4.moveVertical(240);
            tiltedFloor4.changeSize(60,70);
            tiltedFloor4.makeVisible();
            
            //Lighthouse
            
            base1.changeColor("black");
            base1.moveHorizontal(200);
            base1.moveVertical(120);
            base1.changeSize(50);
            base1.makeVisible();
            
            base2.changeColor("black");
            base2.moveHorizontal(200);
            base2.moveVertical(80);
            base2.changeSize(50);
            base2.makeVisible();
            
            roof.changeColor("red");
            roof.moveHorizontal(223);
            roof.moveVertical(20);
            roof.changeSize(60,70);
            roof.makeVisible();
            
            window1.changeColor("magenta");
            window1.moveHorizontal(220);
            window1.moveVertical(100);
            window1.changeSize(15);
            window1.makeVisible();
            
            window2.changeColor("magenta");
            window2.moveHorizontal(220);
            window2.moveVertical(140);
            window2.changeSize(15);
            window2.makeVisible();
            
            //person
            
            watcher.changeColor("black");
            watcher.moveHorizontal(300);
            watcher.moveVertical(150);
            watcher.changeSize(30,15);
            watcher.makeVisible();
            
            //sun
            
            sun.changeColor("yellow");
            sun.moveHorizontal(420);
            sun.moveVertical(0);
            sun.changeSize(68);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        //ocean
        
        ocean.changeColor("black");
        //lighthouse
        
        ground1.changeColor("black");
        ground2.changeColor("black");
        ground3.changeColor("black");
        ground4.changeColor("black");
        ground5.changeColor("black");
        
        tiltedFloor1.changeColor("black");
        tiltedFloor2.changeColor("black");
        tiltedFloor3.changeColor("black");
        tiltedFloor4.changeColor("black");
        
        window1.changeColor("white");
        window2.changeColor("white");
        
        roof.changeColor("black");
        
        //person
        
        
        
        //sun
        
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
        //ocean
        
        ocean.changeColor("blue");
        
        ground1.changeColor("green");
        ground2.changeColor("green");
        ground3.changeColor("green");
        ground4.changeColor("green");
        ground5.changeColor("green");
        
        tiltedFloor1.changeColor("green");
        tiltedFloor2.changeColor("green");
        tiltedFloor3.changeColor("green");
        tiltedFloor4.changeColor("green");
        
        
        //lighthouse
        
        window1.changeColor("magenta");
        window2.changeColor("magenta");
        
        //sun
        
        sun.changeColor("yellow");
    }
}
