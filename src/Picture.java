public class Picture
{
    private Square wall1;
    private Square secondFloor1;
    private Square secondFloor2;
    private Square secondFloor3;
    private Square secondFloor4;
    private Square lowerFloor1;
    private Square lowerFloor2;
    private Square lowerFloor3;
    private Square lowerFloor4;
    private Square windowFrame1;
    private Square windowFrame2;
    private Square window1;
    private Square window2;
    private Square brick1;
    private Square brick2;
    private Square brick3;
    private Square brick4;
    private Square brick5;
    private Triangle upperRoof;
    private Triangle lowerRoof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall1 = new Square();
        secondFloor1 = new Square();
        secondFloor2 = new Square();
        secondFloor3 = new Square();
        secondFloor4 = new Square();

        lowerFloor1 = new Square();
        lowerFloor2 = new Square();
        lowerFloor3 = new Square();
        lowerFloor4 = new Square();

        windowFrame1 = new Square();
        windowFrame2 = new Square();

        window1 = new Square();
        window2 = new Square();

        brick1 = new Square();
        brick2 = new Square();
        brick3 = new Square();
        brick4 = new Square();
        brick5 = new Square();

        upperRoof = new Triangle();
        lowerRoof = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall1.changeColor("blue-grey");
            wall1.moveHorizontal(-140);
            wall1.moveVertical(-40);
            wall1.changeSize(200, 300);
            wall1.makeVisible();

            lowerFloor1.changeColor("blue-grey");
            lowerFloor1.moveHorizontal(-240);
            lowerFloor1.moveVertical(60);
            lowerFloor1.changeSize(100, 300);
            lowerFloor1.makeVisible();

            lowerFloor2.changeColor("blue-grey");
            lowerFloor2.moveHorizontal(0);
            lowerFloor2.moveVertical(60);
            lowerFloor2.changeSize(100, 300);
            lowerFloor2.makeVisible();

            lowerFloor3.changeColor("white");
            lowerFloor3.moveHorizontal(-135);
            lowerFloor3.moveVertical(60);
            lowerFloor3.changeSize(100, 300);
            lowerFloor3.makeVisible();

            lowerFloor4.changeColor("white");
            lowerFloor4.moveHorizontal(-110);
            lowerFloor4.moveVertical(60);
            lowerFloor4.changeSize(100, 300);
            lowerFloor4.makeVisible();

            upperRoof.changeColor("brown-grey");
            upperRoof.changeSize(25, 260);
            upperRoof.moveHorizontal(55);
            upperRoof.moveVertical(-85);
            upperRoof.makeVisible();

            lowerRoof.changeColor("brown-grey");
            lowerRoof.changeSize(100, 390);
            lowerRoof.moveHorizontal(30);
            lowerRoof.moveVertical(-55);
            lowerRoof.makeVisible();

            secondFloor1.changeColor("blue-grey");
            secondFloor1.moveHorizontal(-100);
            secondFloor1.moveVertical(-40);
            secondFloor1.changeSize(50, 50);
            secondFloor1.makeVisible();

            secondFloor2.changeColor("blue-grey");
            secondFloor2.moveHorizontal(-150);
            secondFloor2.moveVertical(-40);
            secondFloor2.changeSize(50, 50);
            secondFloor2.makeVisible();

            secondFloor3.changeColor("blue-grey");
            secondFloor3.moveHorizontal(-50);
            secondFloor3.moveVertical(-40);
            secondFloor3.changeSize(50, 50);
            secondFloor3.makeVisible();

            secondFloor4.changeColor("blue-grey");
            secondFloor4.moveHorizontal(-30);
            secondFloor4.moveVertical(-40);
            secondFloor4.changeSize(50, 50);
            secondFloor4.makeVisible();

            windowFrame1.changeColor("blue");
            windowFrame1.moveHorizontal(-115);
            windowFrame1.moveVertical(70);
            windowFrame1.changeSize(70, 180);
            windowFrame1.makeVisible();

            windowFrame2.changeColor("blue");
            windowFrame2.moveHorizontal(-100);
            windowFrame2.moveVertical(70);
            windowFrame2.changeSize(70, 180);
            windowFrame2.makeVisible();

            window1.changeColor("clear");
            window1.moveHorizontal(-98);
            window1.moveVertical(80);
            window1.changeSize(50, 180);
            window1.makeVisible();

            window2.changeColor("clear");
            window2.moveHorizontal(-93);
            window2.moveVertical(80);
            window2.changeSize(50, 180);
            window2.makeVisible();

            brick1.changeColor("brick");
            brick1.moveHorizontal(-110);
            brick1.moveVertical(135);
            brick1.changeSize(25, 180);
            brick1.makeVisible();

            brick2.changeColor("brick");
            brick2.moveHorizontal(-35);
            brick2.moveVertical(135);
            brick2.changeSize(25, 180);
            brick2.makeVisible();

            brick3.changeColor("brick");
            brick3.moveHorizontal(-135);
            brick3.moveVertical(135);
            brick3.changeSize(25, 180);
            brick3.makeVisible();

            brick4.changeColor("brick");
            brick4.moveHorizontal(-85);
            brick4.moveVertical(135);
            brick4.changeSize(25, 180);
            brick4.makeVisible();

            brick5.changeColor("brick");
            brick5.moveHorizontal(-60);
            brick5.moveVertical(135);
            brick5.changeSize(25, 180);
            brick5.makeVisible();
/*
            sun.changeColor("brown");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
             */
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall1.changeColor("black");
        windowFrame1.changeColor("white");
        upperRoof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall1.changeColor("red");
        windowFrame1.changeColor("black");
        upperRoof.changeColor("green");
        sun.changeColor("yellow");
    }
}