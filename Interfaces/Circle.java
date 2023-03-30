public class Circle implements  FigureMethods{
    public double radius;
    Circle(double r){
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
