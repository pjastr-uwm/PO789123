package pl.prostokat;

import java.awt.Rectangle;

class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height)
    {
        super(x,y,width,height);
    }

    public int getPerimeter()
    {
        return 2*this.width +2*this.height;
    }

    public int getArea()
    {
        return this.width*this.height;
    }
}
