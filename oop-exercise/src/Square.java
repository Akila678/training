class Square extends Test{

    double height;

    public Square(double h){

        this.height=h;
    }

    double getPerimeter(){
        double per=4*height;
        return per;
    }
    double getArea(){
        double ar=height*height;
        return ar;
    }

    public String toString(){
        return "Square perimeter is "+getPerimeter()+" Area is "+getArea();
    }
}


