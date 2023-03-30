public class Rectangle implements FigureMethods{
    double length;
    double width;

    Rectangle(double l, double w){
        width = w;
        length = l;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public double area() {
        return width*length;
    }
}
