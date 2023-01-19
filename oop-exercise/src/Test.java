import java.util.Scanner;

public abstract class Test{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("choose the shape");
        System.out.println("press 1 for Square");
        System.out.println("press 2 for Rectangle");
        System.out.println("press 3 for Circle");

        int b = sc.nextInt();

        double h,w,r;


        if (b == 1) {

            System.out.println("Square:Enter the height");
            h = sc.nextDouble();

            Square p=new Square(h);
            System.out.println(p);


        }

        else if (b == 2) {

            System.out.println("Rectangle:Enter the height");
            h = sc.nextDouble();

            System.out.println("Rectangle:Enter the width");
            w = sc.nextDouble();

            Rectangle q=new Rectangle(h,w);
            System.out.println(q.getPerimeter());
            System.out.println(q);

        }

        else {

            System.out.println("Circle:Enter the radius");
            r = sc.nextDouble();

            Circle s=new Circle(r);
            System.out.println(s);

        }



    }
}