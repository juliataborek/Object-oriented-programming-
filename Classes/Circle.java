public class Circle {
    private int radius;

    Circle(int r){
        radius = r;
    }

    double circumference(){
        return Math.PI*2*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
