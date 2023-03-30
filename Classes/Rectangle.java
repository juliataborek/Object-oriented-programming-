public class Rectangle {
    public double lenght;
    public double width;

    Rectangle(double l, double w){
        width = w;
        lenght = l;
    }

    public double perimeter(){
        return 2*(width+lenght);
    }

    public double area(){
        return width*lenght;
    }
}
