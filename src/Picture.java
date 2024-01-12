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
    private Square lowerFloor5;
    private Square windowFrame1;
    private Square windowFrame2;
    private Square mainWindow1;
    private Square mainWindow2;
    private Square firstFloorUpWindow1;
    private Square firstFloorDownWindow1;
    private Square firstFloorUpWindow2;
    private Square firstFloorDownWindow2;
    private Square secondFloorsideWindow1;
    private Square secondFloorWindow1;
    private Square secondFloorsideWindow2;
    private Square secondFloorsideWindow3;
    private Square secondFloorWindow2;
    private Square brick1;
    private Square brick2;
    private Square brick3;
    private Square brick4;
    private Square brick5;
    private Square brick6;
    private Square door1;
    private Square door2;
    private Square door3;
    private Square baseShrubbery1;
    private Square baseShrubbery3;
    private Square baseShrubbery2;
    private Square babyBrick2;
    private Square babyBrick1;
    private Square babyBrick3;
    private Square babyBrick4;
    private Square babyBrick5;
    private Square babyBrick6;
    private Square pipe1;
    private Square pipe2;
    private Square pipe3;
    private Square pipe4;
    private Square pipe5;
    private Square pipe6;
    private Square pipe7;
    private Square pipe8;
    private Square pipe9;
    private Square pipe10;
    private Square pipe11;
    private Square pipe12;
    private Square pipe13;
    private Square thingOnRoof;
    private Square porchRight1;
    private Square porchRight2;
    private Square porchRight3;
    private Square porchRight4;
    private Square porchRight5;
    private Square porchRight6;
    private Square porchRight7;
    private Square porchRight8;
    private Square porchRight9;
    private Square porchRight10;
    private Square porchRight11;
    private Square porchRight12;
    private Square porchRight13;
    private Square porchRight14;
    private Square porchRight15;
    private Square porchRight16;
    private Square porchLeft1;
    private Square porchLeft2;
    private Square porchLeft3;
    private Square porchLeft4;
    private Square porchLeft5;
    private Square porchLeft6;
    private Square porchLeft7;
    private Square porchLeft8;
    private Square porchLeft9;
    private Square porchLeft10;
    private Square porchLeft11;
    private Square porchLeft12;
    private Square porchLeft13;
    private Square porchLeft14;
    private Square porchLeft15;
    private Square porchLeft16;
    private Triangle upperRoof;
    private Triangle lowerRoof1;
    private Triangle lowerRoof2;
    private Circle doorknob;
    private Circle shrubbery1;
    private Circle shrubbery2;
    private Circle shrubbery3;
    private Circle shrubbery4;
    private Circle shrubbery5;
    private Circle shrubbery6;
    private Circle shrubbery7;
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
        lowerFloor5 = new Square();

        windowFrame1 = new Square();
        windowFrame2 = new Square();

        mainWindow1 = new Square();
        mainWindow2 = new Square();

        firstFloorUpWindow1 = new Square();
        firstFloorDownWindow1 = new Square();

        firstFloorUpWindow2 = new Square();
        firstFloorDownWindow2 = new Square();

        secondFloorsideWindow1 = new Square();
        secondFloorWindow1 = new Square();

        secondFloorsideWindow2 = new Square();
        secondFloorsideWindow3 = new Square();
        secondFloorWindow2 = new Square();

        brick1 = new Square();
        brick2 = new Square();
        brick3 = new Square();
        brick4 = new Square();
        brick5 = new Square();
        brick6 = new Square();

        door1 = new Square();
        door2 = new Square();
        door3 = new Square();

        baseShrubbery2 = new Square();
        baseShrubbery3 = new Square();
        baseShrubbery1 = new Square();

        shrubbery1 = new Circle();
        shrubbery2 = new Circle();
        shrubbery3 = new Circle();
        shrubbery4 = new Circle();
        shrubbery5 = new Circle();
        shrubbery6 = new Circle();
        shrubbery7 = new Circle();

        babyBrick2 = new Square();
        babyBrick1 = new Square();
        babyBrick3 = new Square();
        babyBrick4 = new Square();
        babyBrick5 = new Square();
        babyBrick6 = new Square();

        upperRoof = new Triangle();
        lowerRoof1 = new Triangle();
        lowerRoof2 = new Triangle();

        doorknob = new Circle();

        pipe1 = new Square();
        pipe2 = new Square();
        pipe3 = new Square();
        pipe4 = new Square();
        pipe5 = new Square();
        pipe6 = new Square();
        pipe7 = new Square();
        pipe8 = new Square();
        pipe9 = new Square();
        pipe10 = new Square();
        pipe11 = new Square();
        pipe12 = new Square();
        pipe13 = new Square();

        thingOnRoof = new Square();

        porchRight1 = new Square();
        porchRight2 = new Square();
        porchRight3 = new Square();
        porchRight4 = new Square();
        porchRight5 = new Square();
        porchRight6 = new Square();
        porchRight7 = new Square();
        porchRight8 = new Square();
        porchRight9 = new Square();
        porchRight10 = new Square();
        porchRight11 = new Square();
        porchRight12 = new Square();
        porchRight13 = new Square();
        porchRight14 = new Square();
        porchRight15 = new Square();
        porchRight16 = new Square();

        porchLeft1 = new Square();
        porchLeft2 = new Square();
        porchLeft3 = new Square();
        porchLeft4 = new Square();
        porchLeft5 = new Square();
        porchLeft6 = new Square();
        porchLeft7 = new Square();
        porchLeft8 = new Square();
        porchLeft9 = new Square();
        porchLeft10 = new Square();
        porchLeft11 = new Square();
        porchLeft12 = new Square();
        porchLeft13 = new Square();
        porchLeft14 = new Square();
        porchLeft15 = new Square();
        porchLeft16 = new Square();

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
            wall1.changeColor("grey-blue");
            wall1.moveHorizontal(-120);
            wall1.moveVertical(-40);
            wall1.changeSize(200, 300);
            wall1.makeVisible();

            lowerFloor1.changeColor("grey-blue");
            lowerFloor1.moveHorizontal(-240);
            lowerFloor1.moveVertical(60);
            lowerFloor1.changeSize(100, 300);
            lowerFloor1.makeVisible();

            lowerFloor2.changeColor("grey-blue");
            lowerFloor2.moveHorizontal(0);
            lowerFloor2.moveVertical(60);
            lowerFloor2.changeSize(100, 300);
            lowerFloor2.makeVisible();

            lowerFloor3.changeColor("grey-blue");
            lowerFloor3.moveHorizontal(30);
            lowerFloor3.moveVertical(60);
            lowerFloor3.changeSize(100, 300);
            lowerFloor3.makeVisible();

            lowerFloor4.changeColor("white");
            lowerFloor4.moveHorizontal(-145);
            lowerFloor4.moveVertical(60);
            lowerFloor4.changeSize(100, 300);
            lowerFloor4.makeVisible();

            lowerFloor5.changeColor("white");
            lowerFloor5.moveHorizontal(-110);
            lowerFloor5.moveVertical(60);
            lowerFloor5.changeSize(100, 300);
            lowerFloor5.makeVisible();

            thingOnRoof.changeColor("black");
            thingOnRoof.moveHorizontal(40);
            thingOnRoof.moveVertical(-65);
            thingOnRoof.changeSize(20, 300);
            thingOnRoof.makeVisible();

            upperRoof.changeColor("brown-grey");
            upperRoof.changeSize(25, 300);
            upperRoof.moveHorizontal(65);
            upperRoof.moveVertical(-85);
            upperRoof.makeVisible();

            lowerRoof2.changeColor("brown-grey");
            lowerRoof2.changeSize(100, 410);
            lowerRoof2.moveHorizontal(43);
            lowerRoof2.moveVertical(-55);
            lowerRoof2.makeVisible();

            lowerRoof1.changeColor("light brown");
            lowerRoof1.changeSize(35, 150);
            lowerRoof1.moveHorizontal(25);
            lowerRoof1.moveVertical(10);
            lowerRoof1.makeVisible();

            /*
            lowerRoof2.changeColor("light brown");
            lowerRoof2.changeSize(40, 100);
            lowerRoof2.moveHorizontal(43);
            lowerRoof2.moveVertical(-55);
            lowerRoof2.makeVisible();
             */

            secondFloor1.changeColor("grey-blue");
            secondFloor1.moveHorizontal(-100);
            secondFloor1.moveVertical(-40);
            secondFloor1.changeSize(50, 50);
            secondFloor1.makeVisible();

            secondFloor2.changeColor("grey-blue");
            secondFloor2.moveHorizontal(-150);
            secondFloor2.moveVertical(-40);
            secondFloor2.changeSize(50, 50);
            secondFloor2.makeVisible();

            secondFloor3.changeColor("grey-blue");
            secondFloor3.moveHorizontal(-50);
            secondFloor3.moveVertical(-40);
            secondFloor3.changeSize(50, 50);
            secondFloor3.makeVisible();

            secondFloor4.changeColor("grey-blue");
            secondFloor4.moveHorizontal(-20);
            secondFloor4.moveVertical(-40);
            secondFloor4.changeSize(50, 50);
            secondFloor4.makeVisible();

            windowFrame1.changeColor("blue");
            windowFrame1.moveHorizontal(-125);
            windowFrame1.moveVertical(70);
            windowFrame1.changeSize(70, 180);
            windowFrame1.makeVisible();

            windowFrame2.changeColor("blue");
            windowFrame2.moveHorizontal(-100);
            windowFrame2.moveVertical(70);
            windowFrame2.changeSize(70, 180);
            windowFrame2.makeVisible();

            mainWindow1.changeColor("clear");
            mainWindow1.moveHorizontal(-108);
            mainWindow1.moveVertical(80);
            mainWindow1.changeSize(50, 180);
            mainWindow1.makeVisible();

            mainWindow2.changeColor("clear");
            mainWindow2.moveHorizontal(-93);
            mainWindow2.moveVertical(80);
            mainWindow2.changeSize(50, 180);
            mainWindow2.makeVisible();

            firstFloorDownWindow1.changeColor("grey");
            firstFloorDownWindow1.moveHorizontal(-210);
            firstFloorDownWindow1.moveVertical(103);
            firstFloorDownWindow1.changeSize(33, 180);
            firstFloorDownWindow1.makeVisible();

            firstFloorUpWindow1.changeColor("white");
            firstFloorUpWindow1.moveHorizontal(-210);
            firstFloorUpWindow1.moveVertical(80);
            firstFloorUpWindow1.changeSize(33, 180);
            firstFloorUpWindow1.makeVisible();

            firstFloorDownWindow2.changeColor("grey");
            firstFloorDownWindow2.moveHorizontal(70);
            firstFloorDownWindow2.moveVertical(103);
            firstFloorDownWindow2.changeSize(33, 180);
            firstFloorDownWindow2.makeVisible();

            firstFloorUpWindow2.changeColor("white");
            firstFloorUpWindow2.moveHorizontal(70);
            firstFloorUpWindow2.moveVertical(80);
            firstFloorUpWindow2.changeSize(33, 180);
            firstFloorUpWindow2.makeVisible();

            secondFloorsideWindow1.changeColor("grey");
            secondFloorsideWindow1.moveHorizontal(-9);
            secondFloorsideWindow1.moveVertical(-30);
            secondFloorsideWindow1.changeSize(28, 180);
            secondFloorsideWindow1.makeVisible();

            secondFloorWindow1.changeColor("white");
            secondFloorWindow1.moveHorizontal(20);
            secondFloorWindow1.moveVertical(-30);
            secondFloorWindow1.changeSize(28, 180);
            secondFloorWindow1.makeVisible();

            secondFloorsideWindow2.changeColor("grey");
            secondFloorsideWindow2.moveHorizontal(-120);
            secondFloorsideWindow2.moveVertical(-30);
            secondFloorsideWindow2.changeSize(28, 180);
            secondFloorsideWindow2.makeVisible();

            secondFloorsideWindow3.changeColor("grey");
            secondFloorsideWindow3.moveHorizontal(-90);
            secondFloorsideWindow3.moveVertical(-30);
            secondFloorsideWindow3.changeSize(28, 180);
            secondFloorsideWindow3.makeVisible();

            secondFloorWindow2.changeColor("white");
            secondFloorWindow2.moveHorizontal(-105);
            secondFloorWindow2.moveVertical(-30);
            secondFloorWindow2.changeSize(28, 180);
            secondFloorWindow2.makeVisible();

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

            brick6.changeColor("brick");
            brick6.moveHorizontal(-148);
            brick6.moveVertical(135);
            brick6.changeSize(25, 180);
            brick6.makeVisible();

            door1.changeColor("white");
            door1.moveHorizontal(5);
            door1.moveVertical(119);
            door1.changeSize(25, 180);
            door1.makeVisible();

            door2.changeColor("white");
            door2.moveHorizontal(5);
            door2.moveVertical(80);
            door2.changeSize(25, 180);
            door2.makeVisible();

            door3.changeColor("white");
            door3.moveHorizontal(5);
            door3.moveVertical(95);
            door3.changeSize(25, 180);
            door3.makeVisible();

            doorknob.changeColor("grey");
            doorknob.moveHorizontal(85);
            doorknob.moveVertical(135);
            doorknob.changeSize(7);
            doorknob.makeVisible();

            babyBrick2.changeColor("brick");
            babyBrick2.moveHorizontal(20);
            babyBrick2.moveVertical(140);
            babyBrick2.changeSize(20, 180);
            babyBrick2.makeVisible();

            babyBrick3.changeColor("brick");
            babyBrick3.moveHorizontal(0);
            babyBrick3.moveVertical(140);
            babyBrick3.changeSize(20, 180);
            babyBrick3.makeVisible();

            babyBrick1.changeColor("brick");
            babyBrick1.moveHorizontal(-20);
            babyBrick1.moveVertical(140);
            babyBrick1.changeSize(20, 180);
            babyBrick1.makeVisible();

            babyBrick4.changeColor("brick");
            babyBrick4.moveHorizontal(30);
            babyBrick4.moveVertical(140);
            babyBrick4.changeSize(20, 180);
            babyBrick4.makeVisible();

            babyBrick5.changeColor("brick");
            babyBrick5.moveHorizontal(100);
            babyBrick5.moveVertical(140);
            babyBrick5.changeSize(20, 180);
            babyBrick5.makeVisible();

            babyBrick6.changeColor("brick");
            babyBrick6.moveHorizontal(90);
            babyBrick6.moveVertical(140);
            babyBrick6.changeSize(20, 180);
            babyBrick6.makeVisible();

            baseShrubbery1.changeColor("green");
            baseShrubbery1.moveHorizontal(70);
            baseShrubbery1.moveVertical(137);
            baseShrubbery1.changeSize(25, 180);
            baseShrubbery1.makeVisible();

            baseShrubbery2.changeColor("green");
            baseShrubbery2.moveHorizontal(50);
            baseShrubbery2.moveVertical(137);
            baseShrubbery2.changeSize(25, 180);
            baseShrubbery2.makeVisible();

            baseShrubbery3.changeColor("green");
            baseShrubbery3.moveHorizontal(-170);
            baseShrubbery3.moveVertical(137);
            baseShrubbery3.changeSize(25, 180);
            baseShrubbery3.makeVisible();

            shrubbery1.changeColor("green");
            shrubbery1.moveHorizontal(125);
            shrubbery1.moveVertical(164);
            shrubbery1.changeSize(23);
            shrubbery1.makeVisible();

            shrubbery2.changeColor("green");
            shrubbery2.moveHorizontal(145);
            shrubbery2.moveVertical(160);
            shrubbery2.changeSize(20);
            shrubbery2.makeVisible();

            shrubbery3.changeColor("green");
            shrubbery3.moveHorizontal(158);
            shrubbery3.moveVertical(164);
            shrubbery3.changeSize(25);
            shrubbery3.makeVisible();

            shrubbery4.changeColor("green");
            shrubbery4.moveHorizontal(-90);
            shrubbery4.moveVertical(160);
            shrubbery4.changeSize(20);
            shrubbery4.makeVisible();

            shrubbery5.changeColor("green");
            shrubbery5.moveHorizontal(-100);
            shrubbery5.moveVertical(170);
            shrubbery5.changeSize(23);
            shrubbery5.makeVisible();

            shrubbery6.changeColor("green");
            shrubbery6.moveHorizontal(-80);
            shrubbery6.moveVertical(170);
            shrubbery6.changeSize(23);
            shrubbery6.makeVisible();

            pipe1.changeColor("brown");
            pipe1.moveHorizontal(-110);
            pipe1.moveVertical(-60);
            pipe1.changeSize(6, 180);
            pipe1.makeVisible();

            pipe2.changeColor("brown");
            pipe2.moveHorizontal(-110);
            pipe2.moveVertical(10);
            pipe2.changeSize(6, 180);
            pipe2.makeVisible();

            pipe3.changeColor("brown");
            pipe3.moveHorizontal(-110);
            pipe3.moveVertical(4);
            pipe3.changeSize(6, 180);
            pipe3.makeVisible();

            pipe4.changeColor("brown");
            pipe4.moveHorizontal(-110);
            pipe4.moveVertical(-2);
            pipe4.changeSize(6, 180);
            pipe4.makeVisible();

            pipe5.changeColor("brown");
            pipe5.moveHorizontal(-110);
            pipe5.moveVertical(-8);
            pipe5.changeSize(6, 180);
            pipe5.makeVisible();

            pipe6.changeColor("brown");
            pipe6.moveHorizontal(-110);
            pipe6.moveVertical(-14);
            pipe6.changeSize(6, 180);
            pipe6.makeVisible();

            pipe7.changeColor("brown");
            pipe7.moveHorizontal(-110);
            pipe7.moveVertical(-20);
            pipe7.changeSize(6, 180);
            pipe7.makeVisible();

            pipe8.changeColor("brown");
            pipe8.moveHorizontal(-110);
            pipe8.moveVertical(-26);
            pipe8.changeSize(6, 180);
            pipe8.makeVisible();

            pipe9.changeColor("brown");
            pipe9.moveHorizontal(-110);
            pipe9.moveVertical(-32);
            pipe9.changeSize(6, 180);
            pipe9.makeVisible();

            pipe10.changeColor("brown");
            pipe10.moveHorizontal(-110);
            pipe10.moveVertical(-38);
            pipe10.changeSize(6, 180);
            pipe10.makeVisible();

            pipe11.changeColor("brown");
            pipe11.moveHorizontal(-110);
            pipe11.moveVertical(-44);
            pipe11.changeSize(6, 180);
            pipe11.makeVisible();

            pipe12.changeColor("brown");
            pipe12.moveHorizontal(-110);
            pipe12.moveVertical(-50);
            pipe12.changeSize(6, 180);
            pipe12.makeVisible();

            pipe13.changeColor("brown");
            pipe13.moveHorizontal(-110);
            pipe13.moveVertical(-56);
            pipe13.changeSize(6, 180);
            pipe13.makeVisible();

            porchRight1.changeColor("white");
            porchRight1.moveHorizontal(115);
            porchRight1.moveVertical(65);
            porchRight1.changeSize(5, 180);
            porchRight1.makeVisible();

            porchRight2.changeColor("white");
            porchRight2.moveHorizontal(115);
            porchRight2.moveVertical(135);
            porchRight2.changeSize(5, 180);
            porchRight2.makeVisible();

            porchRight3.changeColor("white");
            porchRight3.moveHorizontal(115);
            porchRight3.moveVertical(130);
            porchRight3.changeSize(5, 180);
            porchRight3.makeVisible();

            porchRight4.changeColor("white");
            porchRight4.moveHorizontal(115);
            porchRight4.moveVertical(125);
            porchRight4.changeSize(5, 180);
            porchRight4.makeVisible();

            porchRight5.changeColor("white");
            porchRight5.moveHorizontal(115);
            porchRight5.moveVertical(120);
            porchRight5.changeSize(5, 180);
            porchRight5.makeVisible();

            porchRight6.changeColor("white");
            porchRight6.moveHorizontal(115);
            porchRight6.moveVertical(115);
            porchRight6.changeSize(5, 180);
            porchRight6.makeVisible();

            porchRight7.changeColor("white");
            porchRight7.moveHorizontal(115);
            porchRight7.moveVertical(110);
            porchRight7.changeSize(5, 180);
            porchRight7.makeVisible();

            porchRight8.changeColor("white");
            porchRight8.moveHorizontal(115);
            porchRight8.moveVertical(105);
            porchRight8.changeSize(5, 180);
            porchRight8.makeVisible();

            porchRight9.changeColor("white");
            porchRight9.moveHorizontal(115);
            porchRight9.moveVertical(100);
            porchRight9.changeSize(5, 180);
            porchRight9.makeVisible();

            porchRight10.changeColor("white");
            porchRight10.moveHorizontal(115);
            porchRight10.moveVertical(95);
            porchRight10.changeSize(5, 180);
            porchRight10.makeVisible();

            porchRight11.changeColor("white");
            porchRight11.moveHorizontal(115);
            porchRight11.moveVertical(90);
            porchRight11.changeSize(5, 180);
            porchRight11.makeVisible();

            porchRight12.changeColor("white");
            porchRight12.moveHorizontal(115);
            porchRight12.moveVertical(85);
            porchRight12.changeSize(5, 180);
            porchRight12.makeVisible();

            porchRight13.changeColor("white");
            porchRight13.moveHorizontal(115);
            porchRight13.moveVertical(80);
            porchRight13.changeSize(5, 180);
            porchRight13.makeVisible();

            porchRight14.changeColor("white");
            porchRight14.moveHorizontal(115);
            porchRight14.moveVertical(75);
            porchRight14.changeSize(5, 180);
            porchRight14.makeVisible();

            porchRight15.changeColor("white");
            porchRight15.moveHorizontal(115);
            porchRight15.moveVertical(70);
            porchRight15.changeSize(5, 180);
            porchRight15.makeVisible();

            porchRight16.changeColor("white");
            porchRight16.moveHorizontal(115);
            porchRight16.moveVertical(65);
            porchRight16.changeSize(5, 180);
            porchRight16.makeVisible();

            porchLeft1.changeColor("white");
            porchLeft1.moveHorizontal(35);
            porchLeft1.moveVertical(65);
            porchLeft1.changeSize(5, 180);
            porchLeft1.makeVisible();

            porchLeft2.changeColor("white");
            porchLeft2.moveHorizontal(35);
            porchLeft2.moveVertical(135);
            porchLeft2.changeSize(5, 180);
            porchLeft2.makeVisible();

            porchLeft3.changeColor("white");
            porchLeft3.moveHorizontal(35);
            porchLeft3.moveVertical(130);
            porchLeft3.changeSize(5, 180);
            porchLeft3.makeVisible();

            porchLeft4.changeColor("white");
            porchLeft4.moveHorizontal(35);
            porchLeft4.moveVertical(125);
            porchLeft4.changeSize(5, 180);
            porchLeft4.makeVisible();

            porchLeft5.changeColor("white");
            porchLeft5.moveHorizontal(35);
            porchLeft5.moveVertical(120);
            porchLeft5.changeSize(5, 180);
            porchLeft5.makeVisible();

            porchLeft6.changeColor("white");
            porchLeft6.moveHorizontal(35);
            porchLeft6.moveVertical(115);
            porchLeft6.changeSize(5, 180);
            porchLeft6.makeVisible();

            porchLeft7.changeColor("white");
            porchLeft7.moveHorizontal(35);
            porchLeft7.moveVertical(110);
            porchLeft7.changeSize(5, 180);
            porchLeft7.makeVisible();

            porchLeft8.changeColor("white");
            porchLeft8.moveHorizontal(35);
            porchLeft8.moveVertical(105);
            porchLeft8.changeSize(5, 180);
            porchLeft8.makeVisible();

            porchLeft9.changeColor("white");
            porchLeft9.moveHorizontal(35);
            porchLeft9.moveVertical(100);
            porchLeft9.changeSize(5, 180);
            porchLeft9.makeVisible();

            porchLeft10.changeColor("white");
            porchLeft10.moveHorizontal(35);
            porchLeft10.moveVertical(95);
            porchLeft10.changeSize(5, 180);
            porchLeft10.makeVisible();

            porchLeft11.changeColor("white");
            porchLeft11.moveHorizontal(35);
            porchLeft11.moveVertical(90);
            porchLeft11.changeSize(5, 180);
            porchLeft11.makeVisible();

            porchLeft12.changeColor("white");
            porchLeft12.moveHorizontal(35);
            porchLeft12.moveVertical(85);
            porchLeft12.changeSize(5, 180);
            porchLeft12.makeVisible();

            porchLeft13.changeColor("white");
            porchLeft13.moveHorizontal(35);
            porchLeft13.moveVertical(80);
            porchLeft13.changeSize(5, 180);
            porchLeft13.makeVisible();

            porchLeft14.changeColor("white");
            porchLeft14.moveHorizontal(35);
            porchLeft14.moveVertical(75);
            porchLeft14.changeSize(5, 180);
            porchLeft14.makeVisible();

            porchLeft15.changeColor("white");
            porchLeft15.moveHorizontal(35);
            porchLeft15.moveVertical(70);
            porchLeft15.changeSize(5, 180);
            porchLeft15.makeVisible();

            porchLeft16.changeColor("white");
            porchLeft16.moveHorizontal(35);
            porchLeft16.moveVertical(65);
            porchLeft16.changeSize(5, 180);
            porchLeft16.makeVisible();

            drawn = true;

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
        doorknob.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall1.changeColor("red");
        windowFrame1.changeColor("black");
        upperRoof.changeColor("green");
        doorknob.changeColor("yellow");
    }
}