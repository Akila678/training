class Circle extends Test{
    double radius;

    public Circle(double r)
    {
        this.radius=r;
    }

    public double getPerimeter(){
        double per=2*Math.PI*radius;
        return per;
    }

    public double getArea(){
        double ar=Math.PI*radius*radius;
        return ar;
    }

    public String toString(){
        return "Circle Perimeter is "+getArea()+" and Area is "+getArea();
    }
}

