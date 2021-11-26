//package pl.imiajd.giecko;
import java.awt.*;

public class betterRectangle extends Rectangle {
    public betterRectangle(int width,int height,int x,int y){
        super(x, y, width, height);
        this.setSize(width,height);//ustawia to samo 2 razy
        this.setLocation(x,y);
    }
    public double getPerimeter(){
        return 2*this.getHeight()+2*this.getWidth();
    }
    public double getArea(){
        return this.getHeight()*this.getWidth();
    }
}
