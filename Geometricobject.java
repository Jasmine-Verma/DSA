import java.util.Scanner;
interface Geometricobject
{
double getPerimeter();
double getArea();
}
interface Resizable
{
void resize(int percent);
}
class Circle implements GeometricObject
{
static double radius = 1.0;
Circle(double radius)
{
this.radius=radius;
}
public double getPerimeter()
{
double p;
p = 2*3.14*this.radius;
return p;
}
public double getArea()
{
double a;
a=3.14*this.radius*this.radius;
return a;
}
}
class ResizableCircle extends Circle implements Resizable
{
ResizableCircle(double radius)
{
super(radius);
}
public void resize(int percent)
{
double p,a;
this.radius = this.radius+(this.radius*percent/100);
p=6.28*this.radius;
a=3.14*this.radius*this.radius;
double b = 6.28*7;
System.out.println("The original perimeter of circle is: "+b);
System.out.println("The Perimeter after resizing the circle is : "+p);
double c = 49*3.14;
System.out.println();
System.out.println("The original area of the circle is: "+c);
System.out.println("The Area after resizing the circle is : "+a);
}
class DemoSize
{
public static void main(String[] args)
{
Circle c1 = new Circle(7.0);
ResizableCircle r1 = new ResizableCircle(7);

c1.getPerimeter();
c1.getArea();
Scanner obj = new Scanner(System.in);
System.out.println("Please enter the percentage of radius to be reduced or increased: ");
int i = obj.nextInt();
r1.resize(i);

}
}

