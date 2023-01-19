
class Rectangle extends Test{
    double height;
    double width;

    public Rectangle(double h,double w){
        this.height=h;
        this.width=w;
    }

    public double getPerimeter(){
        double per=2*(height+width);
        return per;
    }
    public double getArea(){
        double ar=height*width;
        return ar;
    }

    public String toString(){
        return "Rectangle Perimeter is "+getPerimeter()+" and Area is "+getArea();
    }
}
